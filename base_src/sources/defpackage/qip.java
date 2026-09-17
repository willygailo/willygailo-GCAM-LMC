package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class qip implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue b;
    final qby c;
    public final ThreadFactory d;
    private final ScheduledExecutorService e;
    private final Future f;

    public qip(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new qby();
        this.d = threadFactory;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = null;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, qis.b);
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledFutureScheduleWithFixedDelay = null;
        }
        this.e = scheduledExecutorServiceNewScheduledThreadPool;
        this.f = scheduledFutureScheduleWithFixedDelay;
    }

    final void a() {
        this.c.gT();
        Future future = this.f;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (qir qirVar : this.b) {
            if (qirVar.a > jNanoTime) {
                return;
            }
            if (this.b.remove(qirVar)) {
                this.c.e(qirVar);
            }
        }
    }
}
