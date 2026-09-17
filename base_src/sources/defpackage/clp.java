package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class clp implements clg {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/frameserver/CamcorderFrameServerImageReaderImpl");
    public static final bxp b = new bxg();
    private lqd B;
    private lqd C;
    private final nvb D;
    public final ojc d;
    public final cif e;
    public final int f;
    public final cxz g;
    public final ckq h;
    public ckd i;
    public lnx j;
    public lnx k;
    public lnx l;
    public final lqv m;
    private final cha n;
    private final qkg o;
    private final cuz p;
    private final cox q;
    private final cmf r;
    private lnc s;
    private lnx t;
    private Surface u;
    private lmv v;
    private lmv w;
    private lmv x;
    private cjk y;
    private dkg z;
    public final Object c = new Object();
    private boolean A = false;

    public clp(lqv lqvVar, cha chaVar, qkg qkgVar, cuz cuzVar, ojc ojcVar, cif cifVar, cmf cmfVar, nvb nvbVar, ddf ddfVar, cxz cxzVar, ckq ckqVar, cox coxVar, byte[] bArr, byte[] bArr2) {
        this.m = lqvVar;
        this.n = chaVar;
        this.o = qkgVar;
        this.p = cuzVar;
        this.d = ojcVar;
        this.e = cifVar;
        this.r = cmfVar;
        this.D = nvbVar;
        this.f = ((Integer) ddfVar.a(ddl.c).c()).intValue() + ((Integer) ddfVar.a(ddl.d).c()).intValue();
        this.g = cxzVar;
        this.h = ckqVar;
        this.q = coxVar;
    }

    private final boolean g(ckd ckdVar) {
        return this.p.a(ckdVar) || ckdVar.D;
    }

    @Override // defpackage.clg
    public final bpt a(bnh bnhVar) {
        return this.n.a(bnhVar);
    }

    @Override // defpackage.clg
    public final pht b(lic licVar) {
        lnc lncVar;
        synchronized (this.c) {
            if (this.l != null && (lncVar = this.s) != null && this.C != null) {
                lncVar.h(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(licVar.e));
                pih pihVarF = pih.f();
                lnc lncVar2 = this.s;
                lncVar2.getClass();
                lqd lqdVar = this.C;
                lqdVar.getClass();
                lmr lmrVarQ = lncVar2.q(lqdVar);
                lmrVarQ.j(new clo(this, pihVarF, lmrVarQ));
                return pihVarF;
            }
            return plk.U(new IllegalStateException("Snapshot not available"));
        }
    }

    @Override // defpackage.clg
    public final pht c() {
        pih pihVarF;
        synchronized (this.c) {
            lnx lnxVar = this.j;
            lnxVar.getClass();
            lnx lnxVar2 = this.k;
            lnxVar2.getClass();
            ckd ckdVar = this.i;
            ckdVar.getClass();
            lnc lncVar = this.s;
            lncVar.getClass();
            synchronized (this.c) {
                cjk cjkVar = this.y;
                cjkVar.getClass();
                this.D.k(cms.CAPTURE_SESSION).c(cjkVar.g(new cln(this)));
            }
            Surface surface = this.u;
            if (surface != null) {
                lnxVar.d(surface);
            }
            final int i = 0;
            lmv lmvVarR = lncVar.r(lncVar.s(lnxVar), 0);
            this.w = lmvVarR;
            pihVarF = pih.f();
            lmvVarR.k(new cll(this, new AtomicInteger(0), pihVarF, lmvVarR));
            this.D.k(cms.CAPTURE_SESSION).c(this.z.c(new clm(this, pihVarF)));
            this.B = lncVar.s(lnxVar2);
            lnx lnxVar3 = this.l;
            if (lnxVar3 != null) {
                this.C = lncVar.s(lnxVar3);
            }
            if (g(ckdVar)) {
                final lnx lnxVar4 = this.t;
                lnxVar4.getClass();
                this.x = lncVar.r(lncVar.s(lnxVar4), 2);
                if (this.p.a(ckdVar)) {
                    lmv lmvVar = this.x;
                    lmvVar.getClass();
                    final int i2 = 1;
                    lmvVar.k(new lmu(this) { // from class: cli
                        public final /* synthetic */ clp a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.lmu
                        public final void a(lrr lrrVar) {
                            switch (i2) {
                                case 0:
                                    final clp clpVar = this.a;
                                    final lnx lnxVar5 = lnxVar4;
                                    final int i3 = 0;
                                    mip.bj(lrrVar, new lnn() { // from class: clk
                                        @Override // defpackage.lnn
                                        public final void a(lmr lmrVar) {
                                            switch (i3) {
                                                case 0:
                                                    clp clpVar2 = clpVar;
                                                    lnx lnxVar6 = lnxVar5;
                                                    synchronized (clpVar2.c) {
                                                        mad madVarD = lmrVar.d(lnxVar6);
                                                        if (madVarD != null) {
                                                            cif cifVar = clpVar2.e;
                                                            lmrVar.c();
                                                            cifVar.i(madVarD);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    clp clpVar3 = clpVar;
                                                    lnx lnxVar7 = lnxVar5;
                                                    synchronized (clpVar3.c) {
                                                        mad madVarD2 = lmrVar.d(lnxVar7);
                                                        if (madVarD2 != null) {
                                                            ((itw) clpVar3.d.c()).f(madVarD2);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final clp clpVar2 = this.a;
                                    final lnx lnxVar6 = lnxVar4;
                                    final int i4 = 1;
                                    mip.bj(lrrVar, new lnn() { // from class: clk
                                        @Override // defpackage.lnn
                                        public final void a(lmr lmrVar) {
                                            switch (i4) {
                                                case 0:
                                                    clp clpVar3 = clpVar2;
                                                    lnx lnxVar7 = lnxVar6;
                                                    synchronized (clpVar3.c) {
                                                        mad madVarD = lmrVar.d(lnxVar7);
                                                        if (madVarD != null) {
                                                            cif cifVar = clpVar3.e;
                                                            lmrVar.c();
                                                            cifVar.i(madVarD);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    clp clpVar4 = clpVar2;
                                                    lnx lnxVar8 = lnxVar6;
                                                    synchronized (clpVar4.c) {
                                                        mad madVarD2 = lmrVar.d(lnxVar8);
                                                        if (madVarD2 != null) {
                                                            ((itw) clpVar4.d.c()).f(madVarD2);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    });
                }
                if (ckdVar.D && this.e.h(ckdVar)) {
                    lmv lmvVar2 = this.x;
                    lmvVar2.getClass();
                    lmvVar2.k(new lmu(this) { // from class: cli
                        public final /* synthetic */ clp a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.lmu
                        public final void a(lrr lrrVar) {
                            switch (i) {
                                case 0:
                                    final clp clpVar = this.a;
                                    final lnx lnxVar5 = lnxVar4;
                                    final int i3 = 0;
                                    mip.bj(lrrVar, new lnn() { // from class: clk
                                        @Override // defpackage.lnn
                                        public final void a(lmr lmrVar) {
                                            switch (i3) {
                                                case 0:
                                                    clp clpVar3 = clpVar;
                                                    lnx lnxVar7 = lnxVar5;
                                                    synchronized (clpVar3.c) {
                                                        mad madVarD = lmrVar.d(lnxVar7);
                                                        if (madVarD != null) {
                                                            cif cifVar = clpVar3.e;
                                                            lmrVar.c();
                                                            cifVar.i(madVarD);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    clp clpVar4 = clpVar;
                                                    lnx lnxVar8 = lnxVar5;
                                                    synchronized (clpVar4.c) {
                                                        mad madVarD2 = lmrVar.d(lnxVar8);
                                                        if (madVarD2 != null) {
                                                            ((itw) clpVar4.d.c()).f(madVarD2);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final clp clpVar2 = this.a;
                                    final lnx lnxVar6 = lnxVar4;
                                    final int i4 = 1;
                                    mip.bj(lrrVar, new lnn() { // from class: clk
                                        @Override // defpackage.lnn
                                        public final void a(lmr lmrVar) {
                                            switch (i4) {
                                                case 0:
                                                    clp clpVar3 = clpVar2;
                                                    lnx lnxVar7 = lnxVar6;
                                                    synchronized (clpVar3.c) {
                                                        mad madVarD = lmrVar.d(lnxVar7);
                                                        if (madVarD != null) {
                                                            cif cifVar = clpVar3.e;
                                                            lmrVar.c();
                                                            cifVar.i(madVarD);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    clp clpVar4 = clpVar2;
                                                    lnx lnxVar8 = lnxVar6;
                                                    synchronized (clpVar4.c) {
                                                        mad madVarD2 = lmrVar.d(lnxVar8);
                                                        if (madVarD2 != null) {
                                                            ((itw) clpVar4.d.c()).f(madVarD2);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    });
                }
            }
            this.A = false;
        }
        return pihVarF;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            lnc lncVar = this.s;
            if (lncVar != null) {
                lncVar.close();
                this.s = null;
            }
            lmv lmvVar = this.v;
            if (lmvVar != null) {
                lmvVar.close();
                this.v = null;
            }
            lmv lmvVar2 = this.w;
            if (lmvVar2 != null) {
                lmvVar2.close();
                this.w = null;
            }
            lmv lmvVar3 = this.x;
            if (lmvVar3 != null) {
                lmvVar3.close();
                this.x = null;
            }
            this.B = null;
            this.C = null;
            lvj lvjVar = this.h.c;
            if (lvjVar != null) {
                lvjVar.close();
            }
            this.A = true;
        }
    }

    @Override // defpackage.clg
    public final void d(ckd ckdVar, jnj jnjVar, Surface surface) {
        lnz lnzVarA;
        synchronized (this.c) {
            this.i = ckdVar;
            cjk cjkVar = ((cjl) this.o).get();
            cjkVar.f(ckdVar);
            this.y = cjkVar;
            this.z = csm.e();
            Surface surface2 = jnjVar.a;
            synchronized (this.c) {
                this.u = surface2;
                lnx lnxVar = this.j;
                if (lnxVar != null) {
                    lnxVar.d(surface2);
                }
            }
            synchronized (this.c) {
                ckq ckqVar = this.h;
                ckqVar.c = mip.aU(surface, 30);
                ckqVar.d.a = oom.j(ckqVar.b);
                ckqVar.d.b = new ckp(ckqVar);
            }
            synchronized (this.c) {
                ckd ckdVar2 = this.i;
                ckdVar2.getClass();
                cjk cjkVar2 = this.y;
                cjkVar2.getClass();
                lvs lvsVar = ckdVar2.a;
                lnz lnzVarBa = mip.ba(lvsVar, ckdVar2.g);
                lny lnyVarA = lnz.a();
                lnyVarA.b(lvsVar);
                lnyVarA.g(ckdVar2.e.c());
                lnyVarA.f(34);
                lnyVarA.d(true);
                lnyVarA.c(30);
                lnyVarA.h(loa.IMAGE_READER);
                lnyVarA.i(65536L);
                lnz lnzVarA2 = lnyVarA.a();
                gvm gvmVar = new gvm();
                gvmVar.n(cjkVar2);
                lne lneVarA = lnf.a();
                lneVarA.g(ckdVar2.d.g() ? lnp.NORMAL : lnp.HIGH_SPEED);
                lneVarA.j(new lnt(3, oom.m(mip.be(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, ckdVar2.n))));
                lneVarA.i(new lnt(3, oom.m(mip.be(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, ckdVar2.n))));
                lneVarA.a = new lnt(4, oom.m(mip.be(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, ckdVar2.o)));
                lneVarA.f(lvsVar);
                lneVarA.d(lnzVarA2);
                lneVarA.d(lnzVarBa);
                lneVarA.c(this.r.a(ckdVar2));
                lneVarA.k(gvmVar);
                lneVarA.e(this.z);
                lnz lnzVarA3 = null;
                if (ckdVar2.f.g()) {
                    lny lnyVarA2 = lnz.a();
                    lnyVarA2.g((lig) ckdVar2.f.c());
                    lnyVarA2.f(256);
                    lnyVarA2.c(3);
                    lnyVarA2.h(loa.IMAGE_READER);
                    lnyVarA2.d(true);
                    lnzVarA = lnyVarA2.a();
                    lneVarA.d(lnzVarA);
                } else {
                    lnzVarA = null;
                }
                if (g(ckdVar2)) {
                    lny lnyVarA3 = lnz.a();
                    lnyVarA3.h(loa.IMAGE_READER);
                    lnyVarA3.b(lvsVar);
                    lnyVarA3.g(adf.c(ckdVar2.e, ckdVar2.c.b.x(35)));
                    lnyVarA3.f(35);
                    lnyVarA3.d(true);
                    lnyVarA3.c(5);
                    lnzVarA3 = lnyVarA3.a();
                    lneVarA.d(lnzVarA3);
                }
                lnc lncVarA = this.m.a(lneVarA.a());
                this.s = lncVarA;
                this.r.b(lncVarA, ckdVar2);
                this.j = lncVarA.b().a(lnzVarBa);
                this.k = lncVarA.b().a(lnzVarA2);
                if (lnzVarA != null) {
                    this.l = lncVarA.b().a(lnzVarA);
                }
                if (lnzVarA3 != null) {
                    this.t = lncVarA.b().a(lnzVarA3);
                }
                this.n.b(lncVarA, ckdVar2);
                if (ckdVar2.C && lnzVarA3 != null) {
                    this.q.a(new com(lncVarA, lnzVarA3, ckdVar2, gvmVar)).a().a();
                }
            }
        }
    }

    @Override // defpackage.clg
    public final void e(List list) {
        synchronized (this.c) {
            if (this.A) {
                ((oug) ((oug) a.c()).G(478)).o("Already closed.");
                return;
            }
            cjk cjkVar = this.y;
            cjkVar.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.D.k(cms.RECORDING_SESSION).c(cjkVar.g((mip) it.next()));
            }
            lnc lncVar = this.s;
            lncVar.getClass();
            lqd lqdVar = this.B;
            lqdVar.getClass();
            if (this.v == null) {
                lmv lmvVarR = lncVar.r(lqdVar, 30);
                this.v = lmvVarR;
                lmvVarR.k(new lmu() { // from class: clh
                    @Override // defpackage.lmu
                    public final void a(lrr lrrVar) {
                        final clp clpVar = this.a;
                        mip.bj(lrrVar, new lnn() { // from class: clj
                            @Override // defpackage.lnn
                            public final void a(lmr lmrVar) {
                                clp clpVar2 = clpVar;
                                synchronized (clpVar2.c) {
                                    ckq ckqVar = clpVar2.h;
                                    lnx lnxVar = clpVar2.k;
                                    lnxVar.getClass();
                                    jwe jweVar = ckqVar.d;
                                    ckp ckpVar = jweVar.b;
                                    if (ckpVar != null) {
                                        oom oomVar = jweVar.a;
                                        if (!oomVar.isEmpty()) {
                                            int size = oomVar.size();
                                            for (int i = 0; i < size; i++) {
                                                ((jws) oomVar.get(i)).d(lmrVar, lnxVar, lmrVar);
                                            }
                                        }
                                        try {
                                            mad madVarD = lmrVar.d(lnxVar);
                                            if (madVarD != null) {
                                                lzv lzvVarC = lmrVar.c();
                                                lzvVarC.getClass();
                                                Long l = (Long) lzvVarC.d(CaptureResult.SENSOR_TIMESTAMP);
                                                l.getClass();
                                                long jLongValue = l.longValue();
                                                try {
                                                    lvj lvjVar = ckpVar.a.c;
                                                    lvjVar.getClass();
                                                    lvjVar.a(madVarD, jLongValue);
                                                } catch (llv e) {
                                                    ((oug) ((oug) ((oug) ckq.a.b()).h(e)).G(457)).o("Error writing video frame.");
                                                }
                                            }
                                            lmrVar.close();
                                        } catch (Throwable th) {
                                            lmrVar.close();
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    }
                });
            } else {
                ((oug) ((oug) a.c()).G(477)).o("Recording stream already attached.");
            }
        }
    }

    @Override // defpackage.clg
    public final void f() {
        synchronized (this.c) {
            if (this.A) {
                ((oug) ((oug) a.c()).G(481)).o("Already closed.");
                return;
            }
            lmv lmvVar = this.v;
            if (lmvVar != null) {
                lmvVar.close();
                this.v = null;
            } else {
                ((oug) ((oug) a.c()).G(479)).o("Recording stream not attached.");
            }
        }
    }
}
