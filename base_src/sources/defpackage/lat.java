package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class lat extends pfy {
    private final Executor a;
    private final Object b = new Object();
    private int c = 0;
    private boolean d = false;

    public lat(Executor executor) {
        this.a = executor;
    }

    private final void d() {
        synchronized (this.b) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.b.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        synchronized (this.b) {
            while (true) {
                if (this.d && this.c == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.b, nanos);
                nanos -= System.nanoTime() - jNanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.b) {
            if (this.d) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.c++;
        }
        try {
            this.a.execute(runnable);
        } finally {
            d();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.b) {
            z = this.d;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.d && this.c == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.b) {
            this.d = true;
            if (this.c == 0) {
                this.b.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
