package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class pvl implements pvn {
    public String a;
    public pvn b;
    public int c;
    public plk d;
    private String e;
    private String f;
    private pvf g;
    private final pvd h;
    private double i;
    private long j;
    private final Random k;
    private int l;
    private int m;

    public pvl(String str, String str2, pvf pvfVar, pvd pvdVar, boolean z) {
        if (z) {
            this.a = str;
        } else {
            this.e = str;
            this.f = str2;
            this.g = pvfVar == null ? new pvf() : pvfVar;
        }
        this.h = pvdVar;
        this.i = 0.0d;
        this.j = 1L;
        this.k = new Random();
        this.c = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final pvg f(pvf pvfVar, String str, pvd pvdVar) throws pvp {
        phu phuVarA;
        h();
        pvf pvfVar2 = new pvf();
        pvfVar2.e("X-Goog-Upload-Protocol", "resumable");
        pvfVar2.e("X-Goog-Upload-Command", str);
        for (String str2 : pvfVar.c()) {
            Iterator it = pvfVar.b(str2).iterator();
            while (it.hasNext()) {
                pvfVar2.e(str2, (String) it.next());
            }
        }
        pvn pvnVarAn = plk.an(str.equals("start") ? this.e : this.a, str.contains("start") ? this.f : "PUT", pvfVar2, pvdVar);
        if (this.d != null && !str.equals("start")) {
            synchronized (this) {
                pvnVarAn.g(new pvk(this, this.d, null, null), this.l, this.m);
            }
        }
        synchronized (this) {
            this.b = pvnVarAn;
            final pvi pviVar = (pvi) pvnVarAn;
            phuVarA = phu.a(new Callable() { // from class: pvh
                /* JADX WARN: Code duplicated, block: B:81:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    pvg pvgVarB;
                    pvi pviVar2 = pviVar;
                    try {
                        synchronized (pviVar2) {
                        }
                        pviVar2.d();
                        try {
                            OutputStream outputStream = pviVar2.a.getOutputStream();
                            pviVar2.a.connect();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int i = 0;
                            while (pviVar2.f()) {
                                pviVar2.d();
                                int i2 = 0;
                                while (i2 < 65536 && pviVar2.f()) {
                                    try {
                                        int iA = pviVar2.b.a(pviVar2.c, i2, 65536 - i2);
                                        pviVar2.d += (long) iA;
                                        i2 += iA;
                                        try {
                                            outputStream.write(pviVar2.c, i2 - iA, iA);
                                        } catch (IOException e) {
                                            pvgVarB = pviVar2.b();
                                            synchronized (pviVar2) {
                                                return new pvq(pvgVarB);
                                            }
                                        }
                                    } catch (IOException e2) {
                                        throw new pvp(pvo.REQUEST_BODY_READ_ERROR, e2);
                                    }
                                }
                                i += i2;
                                if (i >= pviVar2.e) {
                                    boolean z = true;
                                    if (pviVar2.f > 0) {
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        if (jCurrentTimeMillis2 - jCurrentTimeMillis >= pviVar2.f) {
                                            jCurrentTimeMillis = jCurrentTimeMillis2;
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        synchronized (pviVar2) {
                                            plk plkVar = pviVar2.h;
                                            if (plkVar != null) {
                                                ((pvk) plkVar).b.b(((pvk) plkVar).a);
                                            }
                                        }
                                        i = 0;
                                    }
                                }
                            }
                            pvgVarB = pviVar2.b();
                        } catch (FileNotFoundException e3) {
                            throw new pvp(pvo.BAD_URL, e3);
                        } catch (IOException e4) {
                            try {
                                pvgVarB = pviVar2.b();
                            } catch (pvp e5) {
                                throw new pvp(pvo.CONNECTION_ERROR, e4);
                            }
                        }
                        synchronized (pviVar2) {
                        }
                        return new pvq(pvgVarB);
                    } catch (pvp e6) {
                        synchronized (pviVar2) {
                            return new pvq(e6);
                        }
                    }
                }
            });
            pij pijVar = new pij();
            pijVar.c("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(pij.b(pijVar));
            executorServiceNewSingleThreadExecutor.execute(phuVarA);
            executorServiceNewSingleThreadExecutor.shutdown();
        }
        try {
            pvq pvqVar = (pvq) phuVarA.get();
            pvp pvpVar = pvqVar.a;
            if (pvpVar == null) {
                return pvqVar.b;
            }
            if (pvpVar.a != pvo.CANCELED) {
                throw pvqVar.a;
            }
            h();
            throw new pvp(pvo.CONNECTION_ERROR, "");
        } catch (InterruptedException | ExecutionException e) {
            String strValueOf = String.valueOf(e.getMessage());
            throw new RuntimeException(strValueOf.length() != 0 ? "Unexpected error occurred: ".concat(strValueOf) : new String("Unexpected error occurred: "));
        }
    }

    private final synchronized void h() {
        int i;
        while (true) {
            i = this.c;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        }
        if (i == 3) {
            throw new pvp(pvo.CANCELED, "");
        }
        obr.ap(i == 1);
    }

    private final void i(pvp pvpVar) throws pvp {
        if (this.i >= 60.0d) {
            throw pvpVar;
        }
        double dNextDouble = this.k.nextDouble();
        try {
            double d = this.i;
            long j = this.j;
            double d2 = j;
            Double.isNaN(d2);
            this.i = d + (d2 * dNextDouble);
            double d3 = j * 1000;
            Double.isNaN(d3);
            Thread.sleep((long) (d3 * dNextDouble));
        } catch (InterruptedException e) {
        }
        long j2 = this.j;
        this.j = j2 + j2;
    }

    private final void j() {
        if (this.h.c() > this.h.b()) {
            this.h.e();
            k();
        }
    }

    private final void k() {
        this.j = 1L;
        this.i = 0.0d;
    }

    private final boolean l() throws pvp {
        try {
            return this.h.g();
        } catch (IOException e) {
            throw new pvp(pvo.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    private static final boolean m(pvg pvgVar) {
        return pvgVar.a / 100 == 4;
    }

    private static final boolean n(pvg pvgVar) {
        String strA;
        pvf pvfVar = pvgVar.b;
        return (pvfVar == null || (strA = pvfVar.a("X-Goog-Upload-Status")) == null || !ohh.b("final", strA)) ? false : true;
    }

    private static final boolean o(pvg pvgVar) {
        String strA;
        pvf pvfVar = pvgVar.b;
        return pvfVar != null && (strA = pvfVar.a("X-Goog-Upload-Status")) != null && ohh.b("active", strA) && pvgVar.a == 200;
    }

    @Override // defpackage.pvn
    public final long a() {
        return this.h.c();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[LOOP:1: B:5:0x0006->B:26:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:109:? BREAK  A[LOOP:1: B:5:0x0006->B:26:0x005c]] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x008e -> B:98:0x0091). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final defpackage.pvg b(boolean r8) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvl.b(boolean):pvg");
    }

    @Override // defpackage.pvn
    public final String c() {
        return this.a;
    }

    public final pvg d() throws pvp {
        qbn qbnVar;
        synchronized (this) {
        }
        k();
        while (true) {
            try {
                qks qksVar = null;
                pvg pvgVarF = f(this.g, "start", new pvm(oje.c(null)));
                if (n(pvgVarF)) {
                    return pvgVarF;
                }
                if (o(pvgVarF)) {
                    pvf pvfVar = pvgVarF.b;
                    String strA = pvfVar.a("X-Goog-Upload-URL");
                    try {
                        new URL(strA);
                        this.a = strA;
                        synchronized (this) {
                            plk plkVar = this.d;
                            if (plkVar != null) {
                                String str = this.a;
                                if (str != null) {
                                    if (true == qno.j(str)) {
                                        str = null;
                                    }
                                    if (str != null && (qbnVar = ((nuc) plkVar).b) != null) {
                                        qbnVar.c(new nup(str));
                                        qksVar = qks.a;
                                    }
                                }
                                if (qksVar == null) {
                                    ((nuc) plkVar).a(this, new pvp(pvo.BAD_URL, "Upload transfer handle blank"));
                                }
                            }
                        }
                        String strA2 = pvfVar.a("X-Goog-Upload-Chunk-Granularity");
                        if (strA2 != null) {
                            try {
                                Integer.parseInt(strA2);
                            } catch (NumberFormatException e) {
                                throw new pvp(pvo.SERVER_ERROR, "Server returned an invalid chunk granularity.", e);
                            }
                        }
                        return b(false);
                    } catch (MalformedURLException e2) {
                        throw new pvp(pvo.SERVER_ERROR, "Server returned an invalid upload url.", e2);
                    }
                }
                if (m(pvgVarF)) {
                    return pvgVarF;
                }
                i(new pvp(pvo.SERVER_ERROR, pvgVarF.a()));
            } catch (pvp e3) {
                if (!e3.a()) {
                    throw e3;
                }
                i(e3);
            }
        }
    }

    @Override // defpackage.pvn
    public final synchronized void e() {
        this.d = null;
    }

    @Override // defpackage.pvn
    public final synchronized void g(plk plkVar, int i, int i2) {
        obr.aG(true, "Progress threshold (bytes) must be greater than 0");
        obr.aG(true, "Progress threshold (millis) must be greater or equal to 0");
        this.d = plkVar;
        this.l = 4194304;
        this.m = 250;
    }
}
