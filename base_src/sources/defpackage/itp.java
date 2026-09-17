package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class itp implements itw {
    private static final ouj b = ouj.h("com/google/android/apps/camera/tracking/TrackingControllerImpl");
    private final imr c;
    private int h;
    private volatile PointF j;
    private final Executor m;
    private final Executor n;
    private final ljf o;
    private volatile boolean d = false;
    private volatile boolean e = false;
    private volatile boolean f = false;
    private boolean g = false;
    private volatile ojc k = oih.a;
    private final AtomicInteger l = new AtomicInteger(0);
    public final List a = new ArrayList();
    private lce i = new lce(itz.b());

    public itp(imt imtVar, Executor executor, ims imsVar, Executor executor2, Executor executor3, ljf ljfVar) {
        final int i = 0;
        this.h = 2;
        imv imvVarA = imw.a();
        imvVarA.c(executor);
        imvVarA.a = "FocusTracking";
        final int i2 = 1;
        imvVarA.d(new Runnable(this) { // from class: itm
            public final /* synthetic */ itp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.a.k(false);
                        break;
                    default:
                        this.a.k(true);
                        break;
                }
            }
        });
        imvVarA.e(new Runnable(this) { // from class: itm
            public final /* synthetic */ itp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.a.k(false);
                        break;
                    default:
                        this.a.k(true);
                        break;
                }
            }
        });
        imvVarA.f(imsVar);
        this.c = imvVarA.a();
        this.m = executor2;
        this.n = executor3;
        this.o = ljfVar;
        this.h = 2;
        imtVar.d(this);
    }

    @Override // defpackage.maf
    public final void a() {
    }

    @Override // defpackage.itw
    public final lco b(PointF pointF) {
        this.o.e("startTracking");
        synchronized (this) {
            lce lceVar = new lce(itz.b());
            this.i = lceVar;
            if (this.k.g() && !this.d) {
                this.e = true;
                this.f = true;
                this.j = pointF;
                this.l.set(0);
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((itv) it.next()).r();
                }
                ity ityVarA = itz.a();
                ityVarA.a = 2;
                ityVarA.f(itr.UNKNOWN);
                ityVarA.d(new RectF(pointF.x, pointF.y, pointF.x, pointF.y));
                ityVarA.b(1.0f);
                ityVarA.e(0L);
                lceVar.fB(ityVarA.a());
                this.o.f();
                return lci.c(lceVar);
            }
            this.k.g();
            return lceVar;
        }
    }

    @Override // defpackage.imr
    public final void c(ims imsVar) {
        this.c.c(imsVar);
    }

    @Override // defpackage.itw
    public final synchronized lie d(ojc ojcVar, final ojc ojcVar2) {
        h();
        this.k = ojcVar2;
        this.g = false;
        return new lie() { // from class: itl
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                this.a.j(ojcVar2);
            }
        };
    }

    @Override // defpackage.itw
    public final void e(itv itvVar) {
        this.a.add(itvVar);
    }

    @Override // defpackage.itw
    public final void f(mad madVar) {
        final itz itzVarD;
        final lce lceVar;
        synchronized (this) {
            int i = this.h;
            this.h = i - 1;
            if (i > 0) {
                return;
            }
            if (this.k.g()) {
                if (!this.g) {
                    ((itq) this.k.c()).a();
                    this.g = true;
                }
                if (this.f) {
                    if (this.e) {
                        this.e = false;
                        itzVarD = ((itq) this.k.c()).c(madVar, this.j);
                    } else {
                        itzVarD = ((itq) this.k.c()).d(madVar);
                    }
                    if (this.d) {
                        ((oug) ((oug) b.c()).G((char) 3159)).o("tracking is disabled due the thermal issue");
                    } else {
                        if (itzVarD.c < 0.6f) {
                            this.l.incrementAndGet();
                        } else {
                            this.l.set(0);
                        }
                        if (this.l.get() <= 10) {
                            synchronized (this) {
                                lceVar = this.i;
                            }
                            this.m.execute(new Runnable() { // from class: itn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    itp itpVar = this.a;
                                    lce lceVar2 = lceVar;
                                    itz itzVar = itzVarD;
                                    lceVar2.fB(itzVar);
                                    Iterator it = itpVar.a.iterator();
                                    while (it.hasNext()) {
                                        ((itv) it.next()).t(itzVar.b);
                                    }
                                }
                            });
                            return;
                        }
                    }
                    h();
                }
            }
        }
    }

    @Override // defpackage.itw
    public final void g(itv itvVar) {
        this.a.remove(itvVar);
    }

    @Override // defpackage.itw
    public final void h() {
        this.o.e("stopTracking");
        synchronized (this) {
            if (this.k.g() && this.f) {
                lce lceVar = this.i;
                this.f = false;
                this.e = false;
                ((itq) this.k.c()).b();
                itz itzVar = (itz) lceVar.d;
                ity ityVarA = itz.a();
                ityVarA.d(itzVar.b);
                ityVarA.e(itzVar.e);
                ityVarA.c(itzVar.d);
                ityVarA.f(itzVar.a);
                lceVar.fB(ityVarA.a());
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((itv) it.next()).s();
                }
                this.o.f();
                return;
            }
            this.o.f();
        }
    }

    @Override // defpackage.itw
    public final boolean i() {
        return this.k.g();
    }

    public final synchronized void j(ojc ojcVar) {
        h();
        ojc ojcVar2 = this.k;
        if (ojcVar2.g() && ojcVar.g() && ojcVar2.c() == ojcVar.c()) {
            this.k = oih.a;
            Executor executor = this.n;
            final itq itqVar = (itq) ojcVar2.c();
            executor.execute(new Runnable() { // from class: ito
                @Override // java.lang.Runnable
                public final void run() {
                    itqVar.close();
                }
            });
        }
    }

    public final void k(boolean z) {
        this.d = z;
        if (z) {
            h();
        }
    }
}
