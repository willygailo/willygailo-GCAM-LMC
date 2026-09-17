package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class nkg implements nkr {
    public final String a;
    public final pht b;
    public final Executor c;
    public final nio d;
    public final njo e;
    private final ogb h;
    private final nkx j;
    public final Object f = new Object();
    private final pha i = pha.a();
    public pht g = null;

    public nkg(String str, pht phtVar, nkx nkxVar, Executor executor, nio nioVar, njo njoVar, ogb ogbVar) {
        this.a = str;
        this.b = plk.W(phtVar);
        this.j = nkxVar;
        this.c = plk.M(executor);
        this.d = nioVar;
        this.e = njoVar;
        this.h = ogbVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:12:0x0015, B:13:0x0017, B:15:0x001b, B:16:0x0033, B:17:0x0035), top: B:22:0x0003, inners: #1 }] */
    public final pht a() {
        pht phtVar;
        synchronized (this.f) {
            pht phtVar2 = this.g;
            if (phtVar2 == null || !phtVar2.isDone()) {
                if (this.g == null) {
                    this.g = plk.W(this.i.b(ogl.a(new njz(this, 0)), this.c));
                }
                phtVar = this.g;
            } else {
                try {
                    plk.ad(this.g);
                } catch (ExecutionException e) {
                    this.g = null;
                }
                if (this.g == null) {
                    this.g = plk.W(this.i.b(ogl.a(new njz(this, 0)), this.c));
                }
                phtVar = this.g;
            }
            throw th;
        }
        return phtVar;
    }

    public final Object b(Uri uri) throws IOException {
        try {
            try {
                ogb ogbVar = this.h;
                String strValueOf = String.valueOf(this.a);
                ogf ogfVarB = ogbVar.b(strValueOf.length() != 0 ? "Read ".concat(strValueOf) : new String("Read "));
                try {
                    InputStream inputStream = (InputStream) this.d.b(uri, new njg());
                    try {
                        nkx nkxVar = this.j;
                        Object objA = nkxVar.a.C().a(inputStream, nkxVar.b);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        ogfVarB.close();
                        return objA;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        ogfVarB.close();
                    } catch (Throwable th4) {
                    }
                    throw th3;
                }
            } catch (FileNotFoundException e) {
                if (this.d.d(uri)) {
                    throw e;
                }
                return this.j.a;
            }
        } catch (IOException e2) {
            throw mzi.j(this.d, uri, e2);
        }
    }

    public final void c(Uri uri, Object obj) throws IOException {
        Uri uriI = mzi.i(uri, ".tmp");
        try {
            ogb ogbVar = this.h;
            String strValueOf = String.valueOf(this.a);
            ogf ogfVarB = ogbVar.b(strValueOf.length() != 0 ? "Write ".concat(strValueOf) : new String("Write "));
            try {
                niu niuVar = new niu();
                try {
                    nio nioVar = this.d;
                    njh njhVar = new njh();
                    njhVar.a = new niu[]{niuVar};
                    OutputStream outputStream = (OutputStream) nioVar.b(uriI, njhVar);
                    try {
                        ((pqm) obj).f(outputStream);
                        if (niuVar.b == null) {
                            throw new niz("Cannot sync underlying stream");
                        }
                        niuVar.a.flush();
                        niuVar.b.a.getFD().sync();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        ogfVarB.close();
                        this.d.c(uriI, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw mzi.j(this.d, uri, e);
                }
            } catch (Throwable th3) {
                try {
                    ogfVarB.close();
                } catch (Throwable th4) {
                }
                throw th3;
            }
        } catch (IOException e2) {
            if (this.d.d(uriI)) {
                try {
                    nim nimVarA = this.d.a(uriI);
                    nimVarA.a.k(nimVarA.d);
                } catch (IOException e3) {
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.nkr
    public final pht d(final pgk pgkVar, final Executor executor) {
        final pht phtVarA = a();
        return this.i.b(ogl.a(new pgj() { // from class: nka
            @Override // defpackage.pgj
            public final pht a() {
                final nkg nkgVar = this.a;
                pht phtVar = phtVarA;
                pgk pgkVar2 = pgkVar;
                Executor executor2 = executor;
                final pht phtVarI = pgb.i(phtVar, new nkb(nkgVar, 1), pgr.INSTANCE);
                final pht phtVarI2 = pgb.i(phtVarI, pgkVar2, executor2);
                return pgb.i(phtVarI2, ogl.b(new pgk() { // from class: nkd
                    @Override // defpackage.pgk
                    public final pht a(Object obj) {
                        final nkg nkgVar2 = nkgVar;
                        pht phtVar2 = phtVarI;
                        final pht phtVar3 = phtVarI2;
                        if (plk.ad(phtVar2).equals(plk.ad(phtVar3))) {
                            return phq.a;
                        }
                        pht phtVarI3 = pgb.i(phtVar3, ogl.b(new pgk() { // from class: nkc
                            @Override // defpackage.pgk
                            public final pht a(Object obj2) throws IOException {
                                nkg nkgVar3 = nkgVar2;
                                pht phtVar4 = phtVar3;
                                nkgVar3.c((Uri) plk.ad(nkgVar3.b), obj2);
                                synchronized (nkgVar3.f) {
                                    nkgVar3.g = phtVar4;
                                }
                                return phq.a;
                            }
                        }), nkgVar2.c);
                        synchronized (nkgVar2.f) {
                        }
                        return phtVarI3;
                    }
                }), pgr.INSTANCE);
            }
        }), pgr.INSTANCE);
    }
}
