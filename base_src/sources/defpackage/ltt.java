package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import com.mf.manualfocus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ltt implements ltd {
    public final ljf a;
    public final lis b;
    public final lrx c;
    public final lte d;
    public boolean f;
    private final ltv g;
    private final Handler h;
    private lzq l;
    private long i = 0;
    private long j = 0;
    public final Map e = new HashMap();
    private Set k = new HashSet();

    public ltt(lte lteVar, ltv ltvVar, Handler handler, ljf ljfVar, lis lisVar, lrx lrxVar) {
        this.d = lteVar;
        this.g = ltvVar;
        this.h = handler;
        this.a = ljfVar;
        this.c = lrxVar;
        this.b = lisVar.a("SimpleReqProcessor");
    }

    public static Long b(lzq lzqVar) {
        Object objB = lzqVar.b();
        objB.getClass();
        return (Long) objB;
    }

    private final synchronized int i(List list, lts ltsVar, boolean z) {
        int iE;
        this.c.b(list.size(), false);
        this.a.e("captureSession#captureBurst");
        try {
            try {
                iE = this.d.e(list, ltsVar, this.h, z);
                this.a.f();
                if (iE < 0) {
                    m(list, ltsVar);
                }
            } catch (Throwable th) {
                this.a.f();
                m(list, ltsVar);
                throw th;
            }
        } catch (CameraAccessException | lzm e) {
            lis lisVar = this.b;
            String strValueOf = String.valueOf(list);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
            sb.append("Failed to submit repeating ");
            sb.append(strValueOf);
            lisVar.e(sb.toString(), e);
            throw new llv(e);
        }
        return iE;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009a A[Catch: all -> 0x00ca, TryCatch #7 {all -> 0x00ca, blocks: (B:5:0x0004, B:17:0x0046, B:19:0x004d, B:39:0x0093, B:41:0x009a, B:42:0x00c9, B:6:0x0011), top: B:48:0x0002 }] */
    private final synchronized int j(lzq lzqVar, lts ltsVar, boolean z, boolean z2) {
        int iF;
        try {
            if (z) {
                this.c.b(1, true);
                this.a.e("captureSession#setRepeatingRequest");
            } else {
                this.c.b(1, false);
                this.a.e("captureSession#capture");
            }
            iF = -1;
            try {
                iF = z ? this.d.f(lzqVar, ltsVar, this.h, z2) : this.d.d(lzqVar, ltsVar, this.h, z2);
                try {
                    synchronized (this) {
                        if (z) {
                            this.e.remove(this.l);
                            this.l = lzqVar;
                            this.e.put(lzqVar, ltsVar);
                        } else {
                            this.e.put(lzqVar, ltsVar);
                        }
                        throw th;
                    }
                    return iF;
                } catch (CameraAccessException e) {
                    e = e;
                    try {
                        throw new llv(e);
                    } catch (Throwable th) {
                        th = th;
                        this.a.f();
                        if (iF < 0) {
                            lis lisVar = this.b;
                            String strValueOf = String.valueOf(lzqVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 52);
                            sb.append("Capture failed: ");
                            sb.append(strValueOf);
                            sb.append(" with invalid sequenceId ");
                            sb.append(iF);
                            lisVar.h(sb.toString());
                            g(lzqVar, ltsVar);
                        }
                        throw th;
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new llv(e);
                } catch (Throwable th2) {
                    th = th2;
                    this.a.f();
                    if (iF < 0) {
                        lis lisVar2 = this.b;
                        String strValueOf2 = String.valueOf(lzqVar);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 52);
                        sb2.append("Capture failed: ");
                        sb2.append(strValueOf2);
                        sb2.append(" with invalid sequenceId ");
                        sb2.append(iF);
                        lisVar2.h(sb2.toString());
                        g(lzqVar, ltsVar);
                    }
                    throw th;
                }
            } catch (CameraAccessException e3) {
                e = e3;
            } catch (IllegalArgumentException e4) {
                e = e4;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        this.a.f();
        if (iF < 0) {
            lis lisVar3 = this.b;
            String strValueOf3 = String.valueOf(lzqVar);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 52);
            sb3.append("Capture failed: ");
            sb3.append(strValueOf3);
            sb3.append(" with invalid sequenceId ");
            sb3.append(iF);
            lisVar3.h(sb3.toString());
            g(lzqVar, ltsVar);
        }
        return iF;
    }

    private final lzq k(final ltm ltmVar, oph ophVar, Map map, boolean z) throws llv {
        HashMap map2 = new HashMap();
        for (lnx lnxVar : ltmVar.c) {
            if (!map2.containsKey(lnxVar)) {
                Surface surfaceG = ((lui) lnxVar).g();
                boolean zF = this.g.f(surfaceG);
                if (surfaceG != null && surfaceG.isValid() && zF) {
                    map2.put(lnxVar, surfaceG);
                } else if (surfaceG == null || !surfaceG.isValid() || zF) {
                    lis lisVar = this.b;
                    String strValueOf = String.valueOf(lnxVar);
                    String strValueOf2 = String.valueOf(ltmVar);
                    String strValueOf3 = String.valueOf(surfaceG);
                    int length = String.valueOf(strValueOf).length();
                    StringBuilder sb = new StringBuilder(length + 68 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
                    sb.append("Failed to add ");
                    sb.append(strValueOf);
                    sb.append(" to CaptureRequest for ");
                    sb.append(strValueOf2);
                    sb.append(". The surface (");
                    sb.append(strValueOf3);
                    sb.append(") was not valid.");
                    lisVar.h(sb.toString());
                } else {
                    lis lisVar2 = this.b;
                    String strValueOf4 = String.valueOf(lnxVar);
                    String strValueOf5 = String.valueOf(ltmVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf4).length() + 73 + String.valueOf(strValueOf5).length());
                    sb2.append("Failed to add ");
                    sb2.append(strValueOf4);
                    sb2.append(" to CaptureRequest for ");
                    sb2.append(strValueOf5);
                    sb2.append(".  The surface is not yet available.");
                    lisVar2.h(sb2.toString());
                }
            }
        }
        if (map2.isEmpty()) {
            lis lisVar3 = this.b;
            String strValueOf6 = String.valueOf(ltmVar);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf6).length() + 78);
            sb3.append("Failed to submit a CaptureRequest for ");
            sb3.append(strValueOf6);
            sb3.append(": There were no surfaces on the request.");
            lisVar3.h(sb3.toString());
            mip.aX(ltmVar, this.h);
            return null;
        }
        try {
            luz luzVarC = this.d.c(ltmVar);
            Long l = l();
            luzVarC.a.setTag(l);
            for (Map.Entry entry : map2.entrySet()) {
                luzVarC.a.addTarget((Surface) entry.getValue());
                map.put((Surface) entry.getValue(), (lnx) entry.getKey());
            }
            for (lnq lnqVar : ltmVar.b) {
                luzVarC.b(lnqVar.a, lnqVar.b);
                if (manualfocus.getFocusMode().intValue() >= 1) {
                    luzVarC.b(CaptureRequest.CONTROL_AF_MODE, 0);
                    luzVarC.b(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    luzVarC.b(CaptureRequest.LENS_FOCUS_DISTANCE, manualfocus.getFocusDistance());
                }
            }
            mip mipVarB = lnb.b(ltmVar.d);
            if (!z) {
                mipVarB = new lnw(mipVarB, null, null, null);
            }
            ophVar.e(l, mipVarB);
            final long jLongValue = l.longValue();
            final Set setKeySet = map2.keySet();
            this.h.post(new Runnable() { // from class: lto
                @Override // java.lang.Runnable
                public final void run() {
                    ltm ltmVar2 = ltmVar;
                    long j = jLongValue;
                    Set set = setKeySet;
                    Iterator it = ltmVar2.d.iterator();
                    while (it.hasNext()) {
                        ((mip) it.next()).l(j, set);
                    }
                }
            });
            return luzVarC.a();
        } catch (llv e) {
            lis lisVar4 = this.b;
            String strValueOf7 = String.valueOf(ltmVar);
            int i = ltmVar.a;
            StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf7).length() + 53);
            sb4.append("Failed to create a CaptureRequest using ");
            sb4.append(strValueOf7);
            sb4.append("(");
            sb4.append(i);
            sb4.append(")");
            lisVar4.d(sb4.toString());
            throw e;
        }
    }

    private final synchronized Long l() {
        long j;
        j = this.j;
        this.j = 1 + j;
        return Long.valueOf(j);
    }

    private final void m(final List list, final lts ltsVar) {
        lis lisVar = this.b;
        String strValueOf = String.valueOf(list);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
        sb.append("Burst Capture failed: ");
        sb.append(strValueOf);
        lisVar.h(sb.toString());
        this.h.post(new Runnable() { // from class: ltr
            @Override // java.lang.Runnable
            public final void run() {
                List list2 = list;
                lts ltsVar2 = ltsVar;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ltsVar2.b((lzq) it.next(), null);
                }
            }
        });
    }

    private static final boolean n(ltm ltmVar) {
        return ltmVar.a == 3;
    }

    private static final boolean o(ltm ltmVar, lts ltsVar) {
        return ltsVar.b.size() > 1 && n(ltmVar);
    }

    public final synchronized long a() {
        long j;
        j = this.i;
        this.i = 1 + j;
        return j;
    }

    @Override // defpackage.ltd
    public final void c(ltm ltmVar) {
        this.a.e("SimpleRequestProcessor#setRepeating");
        this.c.b(1, true);
        try {
            try {
                oph ophVarA = opj.a();
                ArrayMap arrayMap = new ArrayMap();
                lzq lzqVarK = k(ltmVar, ophVarA, arrayMap, true);
                if (lzqVarK != null) {
                    synchronized (this) {
                        if (!this.k.equals(ltmVar.c)) {
                            lis lisVar = this.b;
                            String strValueOf = String.valueOf(ltmVar);
                            String strValueOf2 = String.valueOf(ltmVar.c);
                            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23 + String.valueOf(strValueOf2).length());
                            sb.append("Submit repeating ");
                            sb.append(strValueOf);
                            sb.append(" with ");
                            sb.append(strValueOf2);
                            lisVar.f(sb.toString());
                            this.k = ope.F(ltmVar.c);
                        }
                    }
                    final lts ltsVar = new lts(this, ophVarA.c(), arrayMap);
                    final int iJ = j(lzqVarK, ltsVar, true, o(ltmVar, ltsVar));
                    this.h.post(new Runnable() { // from class: ltp
                        @Override // java.lang.Runnable
                        public final void run() {
                            ltsVar.a(iJ);
                        }
                    });
                }
                this.a.f();
            } catch (Exception e) {
                throw new llv(e);
            }
        } catch (Throwable th) {
            this.a.f();
            throw th;
        }
    }

    @Override // defpackage.ltd
    public final void d() throws llv {
        try {
            this.d.b();
        } catch (CameraAccessException e) {
            throw new llv(e);
        }
    }

    @Override // defpackage.ltd
    public final void e(ltm ltmVar) {
        this.a.e("SimpleRequestProcessor#submit");
        try {
            try {
                oph ophVarA = opj.a();
                ArrayMap arrayMap = new ArrayMap();
                lzq lzqVarK = k(ltmVar, ophVarA, arrayMap, false);
                if (lzqVarK != null) {
                    lis lisVar = this.b;
                    String strValueOf = String.valueOf(ltmVar);
                    String strValueOf2 = String.valueOf(ltmVar.c);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13 + String.valueOf(strValueOf2).length());
                    sb.append("Submit ");
                    sb.append(strValueOf);
                    sb.append(" with ");
                    sb.append(strValueOf2);
                    lisVar.f(sb.toString());
                    lts ltsVar = new lts(this, ophVarA.c(), arrayMap);
                    j(lzqVarK, ltsVar, false, o(ltmVar, ltsVar));
                }
                this.a.f();
            } catch (Exception e) {
                lis lisVar2 = this.b;
                String strValueOf3 = String.valueOf(ltmVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf3).length() + 17);
                sb2.append("Failed to submit ");
                sb2.append(strValueOf3);
                lisVar2.e(sb2.toString(), e);
                throw e;
            }
        } catch (Throwable th) {
            this.a.f();
            throw th;
        }
    }

    @Override // defpackage.ltd
    public final void f(List list) {
        boolean z;
        this.a.e("SimpleRequestProcessor#submit-burst");
        try {
            try {
                oph ophVarA = opj.a();
                ArrayMap arrayMap = new ArrayMap();
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    lzq lzqVarK = k((ltm) it.next(), ophVarA, arrayMap, false);
                    if (lzqVarK != null) {
                        arrayList.add(lzqVarK);
                    }
                }
                if (arrayList.size() > 0) {
                    lis lisVar = this.b;
                    String strValueOf = String.valueOf(list);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
                    sb.append("Submit burst of ");
                    sb.append(strValueOf);
                    lisVar.f(sb.toString());
                    lts ltsVar = new lts(this, ophVarA.c(), arrayMap);
                    if (ltsVar.b.size() > 1) {
                        for (int i = 0; i < list.size(); i++) {
                            if (n((ltm) list.get(i))) {
                                z = true;
                                break;
                            }
                        }
                    }
                    ltsVar.a(i(arrayList, ltsVar, z));
                    synchronized (this) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            this.e.put((lzq) it2.next(), ltsVar);
                        }
                    }
                }
                this.a.f();
            } catch (Exception e) {
                lis lisVar2 = this.b;
                String strValueOf2 = String.valueOf(list);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 23);
                sb2.append("Failed to submit burst ");
                sb2.append(strValueOf2);
                lisVar2.e(sb2.toString(), e);
                throw e;
            }
        } catch (Throwable th) {
            this.a.f();
            throw th;
        }
    }

    public final void g(final lzq lzqVar, final lts ltsVar) {
        this.h.post(new Runnable() { // from class: ltq
            @Override // java.lang.Runnable
            public final void run() {
                ltsVar.b(lzqVar, null);
            }
        });
    }

    public final void h(long j) {
        synchronized (this) {
            for (lzq lzqVar : this.e.keySet()) {
                if (b(lzqVar).longValue() == j) {
                    this.e.remove(lzqVar);
                    lis lisVar = this.b;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("removeInflightRequest ");
                    sb.append(j);
                    lisVar.b(sb.toString());
                    break;
                }
            }
        }
    }
}
