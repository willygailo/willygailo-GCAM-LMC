package defpackage;

import android.graphics.PointF;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ite implements itw {
    public final Executor a;
    public final ljf b;
    public final itw d;
    public volatile boolean c = false;
    public volatile ojc e = oih.a;
    private final AtomicInteger f = new AtomicInteger(0);
    private volatile long g = -1;

    public ite(itp itpVar, ojc ojcVar, ljf ljfVar) {
        this.b = ljfVar;
        obr.aF(ojcVar.g());
        this.d = itpVar;
        this.a = (Executor) ojcVar.c();
    }

    private final void j(final mad madVar) {
        int iIncrementAndGet;
        if (madVar.d() - this.g < 18000000) {
            madVar.close();
            return;
        }
        if (!this.c) {
            this.c = true;
            synchronized (this) {
                this.f.set(0);
                this.g = madVar.d();
            }
            this.a.execute(new Runnable() { // from class: itd
                @Override // java.lang.Runnable
                public final void run() {
                    ite iteVar = this.a;
                    mad madVar2 = madVar;
                    iteVar.d.f(madVar2);
                    madVar2.close();
                    iteVar.c = false;
                }
            });
            return;
        }
        madVar.close();
        synchronized (this) {
            iIncrementAndGet = this.f.incrementAndGet();
        }
        if (iIncrementAndGet > 7) {
            this.a.execute(new Runnable() { // from class: itc
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h();
                }
            });
        }
    }

    @Override // defpackage.maf
    public final void a() {
        synchronized (this) {
            if (this.e.g()) {
                mad madVarD = ((fpo) this.e.c()).d();
                if (madVarD != null) {
                    j(madVarD);
                }
            }
        }
    }

    @Override // defpackage.itw
    public final lco b(PointF pointF) {
        synchronized (this) {
            this.f.set(0);
            this.g = -1L;
        }
        return this.d.b(pointF);
    }

    @Override // defpackage.imr
    public final void c(ims imsVar) {
        this.d.c(imsVar);
    }

    @Override // defpackage.itw
    public final lie d(final ojc ojcVar, ojc ojcVar2) {
        synchronized (this) {
            this.e = ojcVar;
        }
        final lie lieVarD = this.d.d(ojcVar, ojcVar2);
        return new lie() { // from class: itb
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                ite iteVar = this.a;
                ojc ojcVar3 = ojcVar;
                lie lieVar = lieVarD;
                synchronized (iteVar) {
                    if (iteVar.e.g() && ojcVar3.g() && iteVar.e.c() == ojcVar3.c()) {
                        iteVar.e = oih.a;
                    }
                }
                iteVar.a.execute(iteVar.b.c("detachResources.close", new gng(lieVar, 2)));
            }
        };
    }

    @Override // defpackage.itw
    public final void e(itv itvVar) {
        this.d.e(itvVar);
    }

    @Override // defpackage.itw
    public final void f(mad madVar) {
        j(madVar);
    }

    @Override // defpackage.itw
    public final void g(itv itvVar) {
        this.d.g(itvVar);
    }

    @Override // defpackage.itw
    public final void h() {
        this.d.h();
    }

    @Override // defpackage.itw
    public final boolean i() {
        return this.d.i();
    }
}
