package defpackage;

import android.graphics.PointF;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class chv implements chx {
    public final bod a;
    public final ojc b;
    public final fjs c;
    public final gfy d;
    public final cju e;
    public final lnc f;
    public final jth g;
    public final ddf h;
    public pih i;
    public pih j;
    public boolean k;
    public final nle n;
    public final nvb o;
    private final ojc q;
    private final iua r;
    private final bny s;
    private boolean u;
    private final ggo v;
    private volatile boolean t = false;
    public final Runnable l = new cht(this, 0);
    public final Runnable m = new cht(this, 2);
    private final ScheduledExecutorService p = mip.bQ("cdr_trk_ttf_ex");

    public chv(cju cjuVar, nvb nvbVar, ggo ggoVar, bod bodVar, ojc ojcVar, ojc ojcVar2, fjs fjsVar, gfy gfyVar, lnc lncVar, bny bnyVar, iua iuaVar, nle nleVar, jth jthVar, ddf ddfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = cjuVar;
        this.v = ggoVar;
        this.a = bodVar;
        this.b = ojcVar;
        this.n = nleVar;
        this.q = ojcVar2;
        this.r = iuaVar;
        this.c = fjsVar;
        this.f = lncVar;
        this.d = gfyVar;
        this.o = nvbVar;
        this.s = bnyVar;
        this.g = jthVar;
        this.h = ddfVar;
    }

    public static final PointF i(itz itzVar) {
        return new PointF(itzVar.b.centerX(), itzVar.b.centerY());
    }

    private final synchronized void j() {
        if (this.t) {
            return;
        }
        this.t = true;
        this.o.k(cms.MODULE).c(((itw) this.b.c()).d(oih.a, ojc.i(fuu.a())));
    }

    @Override // defpackage.bmq
    public final synchronized bpt a(final bnh bnhVar) {
        if (!this.u && this.b.g() && this.q.g()) {
            this.o.l(cms.FOCUS_SESSION);
            pih pihVar = this.j;
            if (pihVar != null) {
                pihVar.cancel(false);
            }
            pih pihVar2 = this.i;
            if (pihVar2 != null) {
                pihVar2.cancel(false);
            }
            this.j = pih.f();
            this.i = pih.f();
            this.k = false;
            j();
            this.o.k(cms.FOCUS_SESSION).c(new lie() { // from class: chk
                @Override // defpackage.lie, java.lang.AutoCloseable
                public final void close() {
                    this.a.c();
                }
            });
            boolean z = (this.h.k(ddl.br) && ((Boolean) ((lce) this.d.a).d).booleanValue()) ? false : true;
            f(false, true, z);
            this.r.a();
            final PointF pointFJ = this.n.j(bnhVar.a);
            this.c.d(false, pointFJ);
            ((Executor) this.q.c()).execute(new Runnable() { // from class: cho
                @Override // java.lang.Runnable
                public final void run() {
                    chv chvVar = this.a;
                    bnh bnhVar2 = bnhVar;
                    chvVar.g(bnhVar2.a, false);
                    chvVar.g(bnhVar2.a, true);
                }
            });
            final pih pihVarF = pih.f();
            ((Executor) this.q.c()).execute(new Runnable() { // from class: chn
                @Override // java.lang.Runnable
                public final void run() {
                    final chv chvVar = this.a;
                    PointF pointF = pointFJ;
                    pih pihVar3 = pihVarF;
                    chvVar.d(2000L, false);
                    lco lcoVarB = ((itw) chvVar.b.c()).b(pointF);
                    lco lcoVarJ = lcv.j(lcoVarB, new oiu() { // from class: chm
                        @Override // defpackage.oiu
                        public final Object a(Object obj) {
                            chv chvVar2 = chvVar;
                            itz itzVar = (itz) obj;
                            PointF pointFI = chv.i(itzVar);
                            return !itzVar.c() ? pointFI : chvVar2.n.k(pointFI);
                        }
                    });
                    pihVar3.o(lcoVarJ);
                    chvVar.o.k(cms.FOCUS_SESSION).c(lcoVarJ.a(new chq(chvVar), pgr.INSTANCE));
                    chvVar.o.k(cms.FOCUS_SESSION).c(lcoVarB.a(new chr(chvVar), pgr.INSTANCE));
                }
            });
            return new chs(this, pihVarF);
        }
        return new bnu();
    }

    public final void b() {
        ((Executor) this.q.c()).execute(new cht(this, 1, null));
    }

    public final void c() {
        this.a.c(this.m);
        this.a.c(this.l);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.u = true;
        this.o.l(cms.FOCUS_SESSION);
    }

    public final synchronized void d(long j, final boolean z) {
        try {
            this.o.k(cms.FOCUS_SESSION).c(new chl(this.p.schedule(new Runnable() { // from class: chp
                @Override // java.lang.Runnable
                public final void run() {
                    chv chvVar = this.a;
                    if (z) {
                        chvVar.a.a(chvVar.l);
                    } else {
                        chvVar.a.a(chvVar.m);
                    }
                }
            }, j, TimeUnit.MILLISECONDS), 1));
        } catch (RejectedExecutionException e) {
        }
    }

    public final synchronized void e() {
        try {
            this.o.k(cms.FOCUS_SESSION).c(new chl(this.p.schedule(this.l, 4L, TimeUnit.SECONDS), 0));
        } catch (RejectedExecutionException e) {
        }
    }

    public final void f(boolean z, boolean z2, boolean z3) {
        if (z3) {
            this.e.d.fB(false);
        }
        ggn ggnVar = ((ggp) this.v.a.d).b;
        this.f.l((ggnVar.b == hkd.FOCUSED_LOCKED || ggnVar.b == hkd.NOT_FOCUSED_LOCKED) && z2, z3, false);
        if (z) {
            lmp lmpVarA = this.f.a();
            if (z2) {
                ((lok) lmpVarA).h = this.s.a();
            }
            if (z3) {
                ((lok) lmpVarA).i = this.s.a();
            }
            ((lok) lmpVarA).j = this.s.a();
            this.f.m(lmpVarA.a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0013 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #4 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x0035, B:23:0x005c, B:25:0x0069, B:32:0x0074, B:41:0x0083, B:34:0x0076, B:38:0x007d, B:18:0x0045, B:20:0x0049, B:21:0x0055, B:13:0x001a), top: B:50:0x0003, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x001a A[Catch: all -> 0x000e, TryCatch #4 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x0035, B:23:0x005c, B:25:0x0069, B:32:0x0074, B:41:0x0083, B:34:0x0076, B:38:0x007d, B:18:0x0045, B:20:0x0049, B:21:0x0055, B:13:0x001a), top: B:50:0x0003, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[Catch: all -> 0x000e, TryCatch #4 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x0035, B:23:0x005c, B:25:0x0069, B:32:0x0074, B:41:0x0083, B:34:0x0076, B:38:0x007d, B:18:0x0045, B:20:0x0049, B:21:0x0055, B:13:0x001a), top: B:50:0x0003, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049 A[Catch: all -> 0x000e, TryCatch #4 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x0035, B:23:0x005c, B:25:0x0069, B:32:0x0074, B:41:0x0083, B:34:0x0076, B:38:0x007d, B:18:0x0045, B:20:0x0049, B:21:0x0055, B:13:0x001a), top: B:50:0x0003, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x0035, B:23:0x005c, B:25:0x0069, B:32:0x0074, B:41:0x0083, B:34:0x0076, B:38:0x007d, B:18:0x0045, B:20:0x0049, B:21:0x0055, B:13:0x001a), top: B:50:0x0003, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0083 A[Catch: all -> 0x000e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x0035, B:23:0x005c, B:25:0x0069, B:32:0x0074, B:41:0x0083, B:34:0x0076, B:38:0x007d, B:18:0x0045, B:20:0x0049, B:21:0x0055, B:13:0x001a), top: B:50:0x0003, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void g(PointF pointF, boolean z) {
        MeteringRectangle[] meteringRectangleArrC;
        lmp lmpVarA;
        lng lngVarC;
        if (z) {
            if (z) {
                meteringRectangleArrC = this.s.d(pointF);
            } else {
                meteringRectangleArrC = this.s.c(pointF);
            }
            lmpVarA = this.f.a();
            ((lok) lmpVarA).h = meteringRectangleArrC;
            if (this.h.k(ddl.br)) {
                if (this.k) {
                    ((lok) lmpVarA).i = this.s.a();
                } else {
                    ((lok) lmpVarA).i = meteringRectangleArrC;
                }
            } else if (this.k) {
                ((lok) lmpVarA).i = this.s.a();
            } else {
                ((lok) lmpVarA).i = meteringRectangleArrC;
            }
            if (z) {
                this.f.m(lmpVarA.a());
                return;
            }
            lngVarC = this.f.c();
            lngVarC.g(lmpVarA.a());
            lngVarC.close();
            return;
        }
        if (!this.r.b(pointF)) {
            return;
        }
        if (z) {
            meteringRectangleArrC = this.s.d(pointF);
        } else {
            meteringRectangleArrC = this.s.c(pointF);
        }
        lmpVarA = this.f.a();
        ((lok) lmpVarA).h = meteringRectangleArrC;
        if (this.h.k(ddl.br) || !((Boolean) ((lce) this.d.a).d).booleanValue()) {
            if (this.k) {
                ((lok) lmpVarA).i = this.s.a();
            } else {
                ((lok) lmpVarA).i = meteringRectangleArrC;
            }
        }
        if (z) {
            this.f.m(lmpVarA.a());
            return;
        }
        try {
            lngVarC = this.f.c();
            try {
                lngVarC.g(lmpVarA.a());
                lngVarC.close();
                return;
            } catch (Throwable th) {
                try {
                    lngVarC.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (InterruptedException e) {
            float f = pointF.x;
            float f2 = pointF.y;
            return;
        } catch (llv e2) {
            float f3 = pointF.x;
            float f4 = pointF.y;
            return;
        }
        throw th;
    }
}
