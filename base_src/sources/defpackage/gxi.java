package defpackage;

import android.graphics.PointF;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gxi implements bmq, lie {
    public final ojc a;
    public final lnc c;
    public final gfy d;
    public final ojc e;
    public final fjs f;
    public final bod g;
    public final bnn h;
    public pih i;
    public final bny l;
    public final hbq m;
    public final ddf n;
    public final bmv o;
    private final gws q;
    private final ScheduledExecutorService r;
    private volatile ScheduledFuture s;
    private final lda u;
    private final ggo w;
    private final nle x;
    private final Object t = new Object();
    public lie j = null;
    public lie k = null;
    private boolean v = false;
    public final Runnable p = new gxc(this, 3, null);
    public final iua b = new iua();

    public gxi(ghx ghxVar, ojc ojcVar, gws gwsVar, gfy gfyVar, ScheduledExecutorService scheduledExecutorService, bod bodVar, lnc lncVar, lda ldaVar, lda ldaVar2, ggo ggoVar, ojc ojcVar2, fjs fjsVar, qkg qkgVar, bny bnyVar, hbq hbqVar, ddf ddfVar, bmv bmvVar) {
        this.h = (bnn) qkgVar.get();
        this.a = ojcVar;
        this.x = new nle(ghxVar.f());
        this.q = gwsVar;
        this.c = lncVar;
        this.d = gfyVar;
        this.e = ojcVar2;
        this.r = scheduledExecutorService;
        this.g = bodVar;
        this.u = ghxVar.k() == lwd.FRONT ? ldaVar2 : ldaVar;
        this.w = ggoVar;
        this.f = fjsVar;
        this.l = bnyVar;
        this.m = hbqVar;
        this.n = ddfVar;
        this.o = bmvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(final boolean z, final boolean z2, final boolean z3) {
        if (z3) {
            this.d.a.fB(false);
        }
        ggn ggnVar = ((ggp) this.w.a.d).b;
        final boolean z4 = (ggnVar.b == hkd.FOCUSED_LOCKED || ggnVar.b == hkd.NOT_FOCUSED_LOCKED) && z2;
        ((Executor) this.e.c()).execute(new Runnable() { // from class: gxf
            @Override // java.lang.Runnable
            public final void run() {
                gxi gxiVar = this.a;
                boolean z5 = z4;
                boolean z6 = z3;
                boolean z7 = z;
                boolean z8 = z2;
                gxiVar.c.l(z5, z6, false);
                if (z7) {
                    lmp lmpVarA = gxiVar.c.a();
                    if (z8) {
                        ((lok) lmpVarA).h = gxiVar.l.a();
                    }
                    if (z6) {
                        ((lok) lmpVarA).i = gxiVar.l.a();
                    }
                    ((lok) lmpVarA).j = gxiVar.l.a();
                    gxiVar.c.m(lmpVarA.a());
                }
            }
        });
    }

    @Override // defpackage.bmq
    public final synchronized bpt a(bnh bnhVar) {
        if (!this.v && this.a.g() && this.e.g()) {
            if (!this.n.k(ddl.br) || !((Boolean) ((lce) this.d.a).d).booleanValue()) {
                this.m.h();
            }
            if (!((itw) this.a.c()).i()) {
                return this.q.a(bnhVar);
            }
            final PointF pointFJ = this.x.j(bnhVar.a);
            this.f.d(true, pointFJ);
            if (f(bnhVar.a)) {
                return new bnu();
            }
            lie lieVar = this.j;
            if (lieVar != null) {
                lieVar.close();
            }
            lie lieVar2 = this.k;
            if (lieVar2 != null) {
                lieVar2.close();
            }
            synchronized (this.t) {
                if (this.s != null) {
                    this.s.cancel(false);
                }
            }
            c();
            pih pihVarF = pih.f();
            this.i = pihVarF;
            if (((Integer) this.u.fA()).intValue() == hte.ON_LOCKED.f) {
                this.u.fB(Integer.valueOf(hte.ON.f));
            }
            boolean z = (this.n.k(ddl.br) && ((Boolean) ((lce) this.d.a).d).booleanValue()) ? false : true;
            h(false, true, z);
            this.b.a();
            final pih pihVarF2 = pih.f();
            e(bnhVar.a, z, true, false);
            e(bnhVar.a, z, true, true);
            final pih pihVarF3 = pih.f();
            ((Executor) this.e.c()).execute(new Runnable() { // from class: gxd
                @Override // java.lang.Runnable
                public final void run() {
                    final gxi gxiVar = this.a;
                    PointF pointF = pointFJ;
                    pih pihVar = pihVarF3;
                    final pih pihVar2 = pihVarF2;
                    ((itw) gxiVar.a.c()).h();
                    lco lcoVarB = ((itw) gxiVar.a.c()).b(pointF);
                    pihVar.o(lcv.j(lcoVarB, new oiu() { // from class: gxb
                        @Override // defpackage.oiu
                        public final Object a(Object obj) {
                            return gxiVar.b((itz) obj);
                        }
                    }));
                    gxiVar.j = lcoVarB.a(new lij() { // from class: gwz
                        @Override // defpackage.lij
                        public final void fB(Object obj) {
                            gxi gxiVar2 = gxiVar;
                            itz itzVar = (itz) obj;
                            if (!itzVar.c() || itzVar.a == itr.UNKNOWN) {
                                return;
                            }
                            boolean z2 = true;
                            if (itzVar.f == 1) {
                                return;
                            }
                            boolean z3 = itzVar.a != itr.GYRO;
                            PointF pointFB = gxiVar2.b(itzVar);
                            if (gxiVar2.n.k(ddl.br) && ((Boolean) ((lce) gxiVar2.d.a).d).booleanValue()) {
                                z2 = false;
                            }
                            gxiVar2.e(pointFB, z2, z3, false);
                        }
                    }, pgr.INSTANCE);
                    gxiVar.k = lcoVarB.a(new lij() { // from class: gxa
                        @Override // defpackage.lij
                        public final void fB(Object obj) {
                            gxi gxiVar2 = gxiVar;
                            pih pihVar3 = pihVar2;
                            itz itzVar = (itz) obj;
                            if (itzVar.f == 1) {
                                gxiVar2.f.e(true, new PointF(itzVar.b.centerX(), itzVar.b.centerY()), itzVar.e, itzVar.d, itzVar.a.ordinal());
                                pihVar3.o(aao.f());
                                if (itzVar.f != 1) {
                                    return;
                                }
                                if (itzVar.e < 5000 || gxiVar2.o.a()) {
                                    gxiVar2.d(Math.max(0L, 5000 - itzVar.e));
                                } else {
                                    ((Executor) gxiVar2.e.c()).execute(gxiVar2.p);
                                }
                            }
                        }
                    }, (Executor) gxiVar.e.c());
                }
            });
            return new gxh(this, pihVarF2, pihVarF, pihVarF3);
        }
        return new bnu();
    }

    public final PointF b(itz itzVar) {
        PointF pointF = new PointF(itzVar.b.centerX(), itzVar.b.centerY());
        return !itzVar.c() ? pointF : this.x.k(pointF);
    }

    public final void c() {
        this.g.c(this.p);
        this.h.c(this.p);
        this.h.e();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        this.v = true;
        synchronized (this.t) {
            if (this.s != null) {
                this.s.cancel(false);
            }
        }
        c();
        lie lieVar = this.j;
        if (lieVar != null) {
            lieVar.close();
        }
        lie lieVar2 = this.k;
        if (lieVar2 != null) {
            lieVar2.close();
        }
    }

    public final void d(long j) {
        try {
            synchronized (this.t) {
                this.s = this.r.schedule(new gxc(this, 2), j, TimeUnit.MILLISECONDS);
            }
        } catch (RejectedExecutionException e) {
        }
    }

    public final void e(final PointF pointF, final boolean z, final boolean z2, final boolean z3) {
        ((Executor) this.e.c()).execute(new Runnable() { // from class: gxe
            @Override // java.lang.Runnable
            public final void run() {
                gxi gxiVar = this.a;
                PointF pointF2 = pointF;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                if (!z4) {
                    if (!z5) {
                        return;
                    } else {
                        z5 = true;
                    }
                }
                if ((z6 || gxiVar.b.b(pointF2)) && !gxiVar.f(pointF2)) {
                    MeteringRectangle[] meteringRectangleArrD = z6 ? gxiVar.l.d(pointF2) : gxiVar.l.c(pointF2);
                    lmp lmpVarA = gxiVar.c.a();
                    if (z5) {
                        ((lok) lmpVarA).h = meteringRectangleArrD;
                    }
                    if (z4) {
                        ((lok) lmpVarA).i = meteringRectangleArrD;
                    }
                    if (!z6) {
                        gxiVar.c.m(lmpVarA.a());
                        return;
                    }
                    try {
                        lng lngVarC = gxiVar.c.c();
                        try {
                            lngVarC.g(lmpVarA.a());
                            lngVarC.close();
                        } catch (Throwable th) {
                            try {
                                lngVarC.close();
                            } catch (Throwable th2) {
                            }
                            throw th;
                        }
                    } catch (InterruptedException e) {
                        float f = pointF2.x;
                        float f2 = pointF2.y;
                        Thread.currentThread().interrupt();
                    } catch (llv e2) {
                        float f3 = pointF2.x;
                        float f4 = pointF2.y;
                    }
                }
            }
        });
    }

    public final boolean f(PointF pointF) {
        return this.x.j(pointF).y > ((Float) this.n.g(dde.b).c()).floatValue();
    }
}
