package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class clx implements clg {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/frameserver/CamcorderFrameServerImpl");
    public static final bxp b = new bxg();
    private box A;
    private final cgy B;
    private final cox C;
    private lqd E;
    private lqd F;
    private final jry G;
    private final nvb H;
    public final ojc d;
    public final cif e;
    public final int f;
    public ckd g;
    public lnx h;
    public lnx i;
    public lnx j;
    public final cxz k;
    public final lqv l;
    private final cha m;
    private final qkg n;
    private final cuz o;
    private final boolean p;
    private final cmf q;
    private lnc r;
    private lnx s;
    private jnj t;
    private Surface u;
    private lie v;
    private lmv w;
    private lmv x;
    private cjk y;
    private dkg z;
    public final Object c = new Object();
    private boolean D = false;

    public clx(lqv lqvVar, cha chaVar, qkg qkgVar, cuz cuzVar, ojc ojcVar, cif cifVar, cmf cmfVar, nvb nvbVar, ddf ddfVar, cxz cxzVar, cgy cgyVar, cox coxVar, jry jryVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.l = lqvVar;
        this.m = chaVar;
        this.n = qkgVar;
        this.o = cuzVar;
        this.d = ojcVar;
        this.e = cifVar;
        this.q = cmfVar;
        this.H = nvbVar;
        this.f = ((Integer) ddfVar.a(ddl.c).c()).intValue() + ((Integer) ddfVar.a(ddl.d).c()).intValue();
        this.p = ddfVar.j(ddl.ag);
        this.k = cxzVar;
        this.B = cgyVar;
        this.C = coxVar;
        this.G = jryVar;
    }

    private final boolean g(ckd ckdVar) {
        return this.o.a(ckdVar) || ckdVar.D || ckdVar.C;
    }

    @Override // defpackage.clg
    public final bpt a(bnh bnhVar) {
        return this.m.a(bnhVar);
    }

    @Override // defpackage.clg
    public final pht b(lic licVar) {
        lnc lncVar;
        synchronized (this.c) {
            if (this.j != null && (lncVar = this.r) != null && this.F != null) {
                lncVar.h(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(licVar.e));
                pih pihVarF = pih.f();
                lnc lncVar2 = this.r;
                lncVar2.getClass();
                lqd lqdVar = this.F;
                lqdVar.getClass();
                lmr lmrVarQ = lncVar2.q(lqdVar);
                lmrVarQ.j(new clw(this, pihVarF, lmrVarQ));
                return pihVarF;
            }
            return plk.U(new IllegalStateException("Snapshot not available"));
        }
    }

    @Override // defpackage.clg
    public final pht c() {
        pih pihVarF;
        synchronized (this.c) {
            lnx lnxVar = this.h;
            lnxVar.getClass();
            lnx lnxVar2 = this.i;
            lnxVar2.getClass();
            ckd ckdVar = this.g;
            ckdVar.getClass();
            lnc lncVar = this.r;
            lncVar.getClass();
            synchronized (this.c) {
                cjk cjkVar = this.y;
                cjkVar.getClass();
                this.H.k(cms.CAPTURE_SESSION).c(cjkVar.g(new clv(this)));
                lap lapVarK = this.H.k(cms.CAPTURE_SESSION);
                box boxVar = this.A;
                boxVar.getClass();
                lapVarK.c(cjkVar.g(boxVar));
            }
            jnj jnjVar = this.t;
            jnjVar.getClass();
            ojc ojcVar = this.G.a;
            lnxVar.d(jnjVar.a);
            final int i = 1;
            lmv lmvVarR = lncVar.r(lncVar.s(lnxVar), 1);
            this.w = lmvVarR;
            pihVarF = pih.f();
            final int i2 = 0;
            lmvVarR.k(new clt(this, new AtomicInteger(0), pihVarF, lmvVarR));
            this.H.k(cms.CAPTURE_SESSION).c(this.z.c(new clu(this, pihVarF)));
            this.E = lncVar.u(lnxVar2, ope.H(mip.be(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, ckdVar.o)));
            Surface surface = this.u;
            if (surface != null) {
                lnxVar2.d(surface);
            }
            lnx lnxVar3 = this.j;
            if (lnxVar3 != null) {
                this.F = lncVar.s(lnxVar3);
            }
            if (g(ckdVar)) {
                final lnx lnxVar4 = this.s;
                lnxVar4.getClass();
                this.x = lncVar.r(lncVar.s(lnxVar4), 2);
                if (this.o.a(ckdVar)) {
                    lmv lmvVar = this.x;
                    lmvVar.getClass();
                    lmvVar.k(new lmu(this) { // from class: clr
                        public final /* synthetic */ clx a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.lmu
                        public final void a(lrr lrrVar) {
                            switch (i) {
                                case 0:
                                    final clx clxVar = this.a;
                                    final lnx lnxVar5 = lnxVar4;
                                    final int i3 = 0;
                                    mip.bj(lrrVar, new lnn() { // from class: cls
                                        @Override // defpackage.lnn
                                        public final void a(lmr lmrVar) {
                                            switch (i3) {
                                                case 0:
                                                    clx clxVar2 = clxVar;
                                                    lnx lnxVar6 = lnxVar5;
                                                    synchronized (clxVar2.c) {
                                                        mad madVarD = lmrVar.d(lnxVar6);
                                                        if (madVarD != null) {
                                                            cif cifVar = clxVar2.e;
                                                            lmrVar.c();
                                                            cifVar.i(madVarD);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    clx clxVar3 = clxVar;
                                                    lnx lnxVar7 = lnxVar5;
                                                    synchronized (clxVar3.c) {
                                                        mad madVarD2 = lmrVar.d(lnxVar7);
                                                        if (madVarD2 != null) {
                                                            ((itw) clxVar3.d.c()).f(madVarD2);
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
                                    final clx clxVar2 = this.a;
                                    final lnx lnxVar6 = lnxVar4;
                                    final int i4 = 1;
                                    mip.bj(lrrVar, new lnn() { // from class: cls
                                        @Override // defpackage.lnn
                                        public final void a(lmr lmrVar) {
                                            switch (i4) {
                                                case 0:
                                                    clx clxVar3 = clxVar2;
                                                    lnx lnxVar7 = lnxVar6;
                                                    synchronized (clxVar3.c) {
                                                        mad madVarD = lmrVar.d(lnxVar7);
                                                        if (madVarD != null) {
                                                            cif cifVar = clxVar3.e;
                                                            lmrVar.c();
                                                            cifVar.i(madVarD);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    clx clxVar4 = clxVar2;
                                                    lnx lnxVar8 = lnxVar6;
                                                    synchronized (clxVar4.c) {
                                                        mad madVarD2 = lmrVar.d(lnxVar8);
                                                        if (madVarD2 != null) {
                                                            ((itw) clxVar4.d.c()).f(madVarD2);
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
                    lmvVar2.k(new lmu(this) { // from class: clr
                        public final /* synthetic */ clx a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.lmu
                        public final void a(lrr lrrVar) {
                            switch (i2) {
                                case 0:
                                    final clx clxVar = this.a;
                                    final lnx lnxVar5 = lnxVar4;
                                    final int i3 = 0;
                                    mip.bj(lrrVar, new lnn() { // from class: cls
                                        @Override // defpackage.lnn
                                        public final void a(lmr lmrVar) {
                                            switch (i3) {
                                                case 0:
                                                    clx clxVar3 = clxVar;
                                                    lnx lnxVar7 = lnxVar5;
                                                    synchronized (clxVar3.c) {
                                                        mad madVarD = lmrVar.d(lnxVar7);
                                                        if (madVarD != null) {
                                                            cif cifVar = clxVar3.e;
                                                            lmrVar.c();
                                                            cifVar.i(madVarD);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    clx clxVar4 = clxVar;
                                                    lnx lnxVar8 = lnxVar5;
                                                    synchronized (clxVar4.c) {
                                                        mad madVarD2 = lmrVar.d(lnxVar8);
                                                        if (madVarD2 != null) {
                                                            ((itw) clxVar4.d.c()).f(madVarD2);
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
                                    final clx clxVar2 = this.a;
                                    final lnx lnxVar6 = lnxVar4;
                                    final int i4 = 1;
                                    mip.bj(lrrVar, new lnn() { // from class: cls
                                        @Override // defpackage.lnn
                                        public final void a(lmr lmrVar) {
                                            switch (i4) {
                                                case 0:
                                                    clx clxVar3 = clxVar2;
                                                    lnx lnxVar7 = lnxVar6;
                                                    synchronized (clxVar3.c) {
                                                        mad madVarD = lmrVar.d(lnxVar7);
                                                        if (madVarD != null) {
                                                            cif cifVar = clxVar3.e;
                                                            lmrVar.c();
                                                            cifVar.i(madVarD);
                                                        }
                                                        lmrVar.close();
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    clx clxVar4 = clxVar2;
                                                    lnx lnxVar8 = lnxVar6;
                                                    synchronized (clxVar4.c) {
                                                        mad madVarD2 = lmrVar.d(lnxVar8);
                                                        if (madVarD2 != null) {
                                                            ((itw) clxVar4.d.c()).f(madVarD2);
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
            this.D = false;
        }
        return pihVarF;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            lnc lncVar = this.r;
            if (lncVar != null) {
                lncVar.close();
                this.r = null;
            }
            lie lieVar = this.v;
            if (lieVar != null) {
                lieVar.close();
                this.v = null;
            }
            lmv lmvVar = this.w;
            if (lmvVar != null) {
                lmvVar.close();
                this.w = null;
            }
            lmv lmvVar2 = this.x;
            if (lmvVar2 != null) {
                lmvVar2.close();
                this.x = null;
            }
            ojc ojcVar = this.G.a;
            this.E = null;
            this.F = null;
            this.D = true;
        }
    }

    @Override // defpackage.clg
    public final void d(ckd ckdVar, jnj jnjVar, Surface surface) {
        lnz lnzVarA;
        synchronized (this.c) {
            this.g = ckdVar;
            cjk cjkVar = ((cjl) this.n).get();
            cjkVar.f(ckdVar);
            this.y = cjkVar;
            this.z = csm.e();
            cgy cgyVar = this.B;
            fjs fjsVar = cgyVar.a;
            cgyVar.c.p();
            this.A = new box(fjsVar, false, ckdVar.c.b, cgyVar.b, ckdVar.a, cgyVar.c.a());
            synchronized (this.c) {
                this.t = jnjVar;
            }
            synchronized (this.c) {
                this.u = surface;
            }
            synchronized (this.c) {
                ckd ckdVar2 = this.g;
                ckdVar2.getClass();
                cjk cjkVar2 = this.y;
                cjkVar2.getClass();
                lvs lvsVar = ckdVar2.a;
                lvs lvsVar2 = ckdVar2.b;
                ojc ojcVar = this.G.a;
                lny lnyVarA = lnz.a();
                lnyVarA.h(loa.SURFACE_VIEW);
                lnyVarA.b(lvsVar2);
                lnyVarA.g(ckdVar2.g);
                lnyVarA.d(true);
                lnz lnzVarA2 = lnyVarA.a();
                lny lnyVarA2 = lnz.a();
                lnyVarA2.h(loa.SURFACE_DEFERRED);
                lnyVarA2.b(lvsVar2);
                lnyVarA2.g(ckdVar2.e.c());
                lnyVarA2.f(34);
                lnyVarA2.d(true);
                lnz lnzVarA3 = lnyVarA2.a();
                gvm gvmVar = new gvm();
                gvmVar.n(cjkVar2);
                lne lneVarA = lnf.a();
                lneVarA.g(ckdVar2.d.g() ? lnp.NORMAL : lnp.HIGH_SPEED);
                lneVarA.j(new lnt(3, oom.m(mip.be(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, ckdVar2.n))));
                lneVarA.i(new lnt(3, oom.m(mip.be(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, ckdVar2.n))));
                lneVarA.a = new lnt(4, oom.m(mip.be(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, ckdVar2.o)));
                lneVarA.f(lvsVar);
                lneVarA.d(lnzVarA3);
                lneVarA.d(lnzVarA2);
                lneVarA.c(this.q.a(ckdVar2));
                lneVarA.k(gvmVar);
                lneVarA.e(this.z);
                lnz lnzVarA4 = null;
                if (ckdVar2.f.g()) {
                    lny lnyVarA3 = lnz.a();
                    lnyVarA3.b(lvsVar2);
                    lnyVarA3.g((lig) ckdVar2.f.c());
                    lnyVarA3.f(256);
                    lnyVarA3.c(3);
                    lnyVarA3.h(loa.IMAGE_READER);
                    lnyVarA3.d(true);
                    lnzVarA = lnyVarA3.a();
                    lneVarA.d(lnzVarA);
                } else {
                    lnzVarA = null;
                }
                if (g(ckdVar2)) {
                    lny lnyVarA4 = lnz.a();
                    lnyVarA4.h(loa.IMAGE_READER);
                    lnyVarA4.b(lvsVar2);
                    lnyVarA4.g(adf.c(ckdVar2.e, ckdVar2.c.b.x(35)));
                    lnyVarA4.f(35);
                    lnyVarA4.d(true);
                    lnyVarA4.c(5);
                    lnzVarA4 = lnyVarA4.a();
                    lneVarA.d(lnzVarA4);
                }
                opc opcVarD = ope.D();
                if (this.p) {
                    opcVarD.d(lns.ALWAYS_ALLOW_FLASH_MODE_TORCH);
                }
                lneVarA.h(opcVarD.f());
                lnc lncVarA = this.l.a(lneVarA.a());
                this.r = lncVarA;
                this.q.b(lncVarA, ckdVar2);
                this.h = lncVarA.b().a(lnzVarA2);
                this.i = lncVarA.b().a(lnzVarA3);
                if (lnzVarA != null) {
                    this.j = lncVarA.b().a(lnzVarA);
                }
                if (lnzVarA4 != null) {
                    this.s = lncVarA.b().a(lnzVarA4);
                }
                this.m.b(lncVarA, ckdVar2);
                if (ckdVar2.C && lnzVarA4 != null) {
                    this.C.a(new com(lncVarA, lnzVarA4, ckdVar2, gvmVar)).a().a();
                }
            }
        }
    }

    @Override // defpackage.clg
    public final void e(List list) {
        synchronized (this.c) {
            if (this.D) {
                ((oug) ((oug) a.c()).G(495)).o("Already closed.");
                return;
            }
            cjk cjkVar = this.y;
            cjkVar.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.H.k(cms.RECORDING_SESSION).c(cjkVar.g((mip) it.next()));
            }
            lnc lncVar = this.r;
            lncVar.getClass();
            lqd lqdVar = this.E;
            lqdVar.getClass();
            if (this.v == null) {
                this.v = lncVar.p(lqdVar);
                box boxVar = this.A;
                boxVar.getClass();
                boxVar.a(5);
            } else {
                ((oug) ((oug) a.c()).G(494)).o("Recording stream already attached.");
            }
        }
    }

    @Override // defpackage.clg
    public final void f() {
        synchronized (this.c) {
            if (this.D) {
                ((oug) ((oug) a.c()).G(498)).o("Already closed.");
                return;
            }
            lie lieVar = this.v;
            if (lieVar != null) {
                lieVar.close();
                this.v = null;
                box boxVar = this.A;
                boxVar.getClass();
                boxVar.a(6);
            } else {
                ((oug) ((oug) a.c()).G(496)).o("Recording stream not attached.");
            }
        }
    }
}
