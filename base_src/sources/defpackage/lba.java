package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class lba implements ScheduledExecutorService {
    public final lar a = lax.a;
    private final phw b;

    public lba(ScheduledExecutorService scheduledExecutorService) {
        this.b = plk.L(scheduledExecutorService);
    }

    private final void a(pht phtVar) {
        phtVar.d(new lay(this, phtVar), pgr.INSTANCE);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(this.b.submit(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        pia piaVarSchedule = this.b.schedule(runnable, j, timeUnit);
        a(piaVarSchedule);
        return piaVarSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        pia piaVarSchedule = this.b.schedule(callable, j, timeUnit);
        a(piaVarSchedule);
        return piaVarSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        pia piaVarScheduleAtFixedRate = this.b.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        a(piaVarScheduleAtFixedRate);
        return piaVarScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        pia piaVarScheduleWithFixedDelay = this.b.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        a(piaVarScheduleWithFixedDelay);
        return piaVarScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        pht phtVarA = this.b.submit(runnable);
        a(phtVarA);
        return phtVarA;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        pht phtVarC = this.b.submit(runnable, obj);
        a(phtVarC);
        return phtVarC;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        pht phtVarB = this.b.submit(callable);
        a(phtVarB);
        return phtVarB;
    }
}
