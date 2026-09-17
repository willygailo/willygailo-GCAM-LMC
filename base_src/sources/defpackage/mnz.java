package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class mnz implements pht {
    private final moa a;

    public mnz(moa moaVar) {
        this.a = moaVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // defpackage.pht
    public final void d(Runnable runnable, Executor executor) {
        if (this.a.f()) {
            executor.execute(runnable);
            return;
        }
        synchronized (this.a) {
            if (this.a.f()) {
                executor.execute(runnable);
            } else {
                this.a.m(executor, runnable);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        try {
            return this.a.e();
        } catch (mnc e) {
            throw new ExecutionException(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        synchronized (this.a) {
            if (!isDone()) {
                timeUnit.timedWait(this.a, j);
                if (!isDone()) {
                    throw new TimeoutException();
                }
            }
            obj = this.a.a;
            if (obj == null) {
                throw new ExecutionException(this.a.b);
            }
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.f();
    }
}
