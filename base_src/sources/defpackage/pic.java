package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class pic extends phz implements phw {
    final ScheduledExecutorService a;

    public pic(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final pia schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        pip pipVarH = pip.h(runnable, null);
        return new pia(pipVarH, this.a.schedule(pipVarH, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final pia schedule(Callable callable, long j, TimeUnit timeUnit) {
        pip pipVarG = pip.g(callable);
        return new pia(pipVarG, this.a.schedule(pipVarG, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final pia scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        pib pibVar = new pib(runnable);
        return new pia(pibVar, this.a.scheduleAtFixedRate(pibVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final pia scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        pib pibVar = new pib(runnable);
        return new pia(pibVar, this.a.scheduleWithFixedDelay(pibVar, j, j2, timeUnit));
    }
}
