package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iam implements ias {
    private ScheduledFuture a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private iax c;
    private int d;
    private int e;
    private int f;
    private int g;
    private iay h;
    protected final ScheduledExecutorService i;

    public iam(ScheduledExecutorService scheduledExecutorService) {
        this.i = scheduledExecutorService;
    }

    @Override // defpackage.iat
    public final void a() {
        ScheduledFuture scheduledFuture = this.a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // defpackage.iat
    public final void b(iay iayVar) {
        this.h = iayVar;
        ial ialVarD = d();
        iax iaxVarA = ialVarD.c;
        final Runnable runnable = iaxVarA.h;
        if (runnable != null) {
            iaw iawVarB = iaxVarA.b();
            iawVarB.g = new Runnable() { // from class: iaj
                @Override // java.lang.Runnable
                public final void run() {
                    iam iamVar = this.a;
                    Runnable runnable2 = runnable;
                    iamVar.g();
                    runnable2.run();
                }
            };
            iaxVarA = iawVarB.a();
        }
        this.c = iaxVarA;
        this.d = ialVarD.a;
        this.f = ialVarD.b;
    }

    @Override // defpackage.ias
    public void c(lvp lvpVar) {
        g();
        this.g = 0;
    }

    protected abstract ial d();

    protected abstract boolean e(lzv lzvVar);

    protected boolean f(lzv lzvVar) {
        return false;
    }

    public final void g() {
        iay iayVar;
        if (!this.b.compareAndSet(true, false) || (iayVar = this.h) == null) {
            return;
        }
        iayVar.a();
    }

    @Override // defpackage.ias
    public final void i(lzv lzvVar) {
        int iMin;
        iay iayVar;
        iay iayVar2;
        int i = this.e + 1;
        this.e = i;
        if (i < this.d) {
            return;
        }
        this.e = 0;
        if (f(lzvVar)) {
            this.e = this.d;
            return;
        }
        if (e(lzvVar)) {
            iMin = Math.min(this.g + 1, this.f);
            this.g = iMin;
        } else {
            this.g = 0;
            iMin = 0;
        }
        if (iMin == this.f) {
            if (!this.b.compareAndSet(false, true) || (iayVar2 = this.h) == null) {
                return;
            }
            iayVar2.b(this.c);
            return;
        }
        if (!this.b.compareAndSet(true, false) || (iayVar = this.h) == null) {
            return;
        }
        long j = this.c.a;
        if (j == 0) {
            this.a = this.i.schedule(new fkf(iayVar, 3), 1000L, TimeUnit.MILLISECONDS);
        } else if (j > 0) {
            this.a = this.i.schedule(new fkf(iayVar, 3), this.c.a, TimeUnit.MILLISECONDS);
        } else {
            iayVar.a();
        }
    }

    @Override // defpackage.iat
    public void u() {
        this.b.set(false);
    }

    @Override // defpackage.iat
    public void v() {
    }
}
