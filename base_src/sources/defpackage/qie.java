package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
class qie extends AtomicReference implements qbz {
    protected static final FutureTask a = new FutureTask(qdd.b, null);
    protected static final FutureTask b = new FutureTask(qdd.b, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable c;
    protected Thread d;

    public qie(Runnable runnable) {
        this.c = runnable;
    }

    public final void b(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == a) {
                return;
            }
            if (future2 == b) {
                future.cancel(this.d != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // defpackage.qbz
    public final void gT() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == a || future == (futureTask = b) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.d != Thread.currentThread());
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
