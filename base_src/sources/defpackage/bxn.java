package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bxn implements ScheduledExecutorService {
    public static final /* synthetic */ int a = 0;
    private static final ouj b = ouj.h("com/google/android/apps/camera/async/readiness/GatedScheduledExecutorService");
    private final Executor c;
    private final ScheduledExecutorService d;

    public bxn(Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.c = executor;
        this.d = scheduledExecutorService;
    }

    private static void a(String str) {
        ((oug) ((oug) ((oug) b.c()).h(new UnsupportedOperationException(str))).G((char) 147)).r("%s is not gated and it doesn't guarantee the execution order", str);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.d.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        a("invokeAll(1)");
        return this.d.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        a("invokeAll(2)");
        return this.d.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        a("invokeAny(1)");
        return this.d.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        a("invokeAny(2)");
        return this.d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.d.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.d.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.d.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.d.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.d.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.d.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.d.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return submit(runnable, "");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(final Runnable runnable, final Object obj) {
        return plk.Z(new Callable() { // from class: bxm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Runnable runnable2 = runnable;
                Object obj2 = obj;
                int i = bxn.a;
                runnable2.run();
                return obj2;
            }
        }, this.c);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return plk.Z(callable, this.c);
    }
}
