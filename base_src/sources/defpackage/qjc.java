package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qjc extends qbt {
    static final qiw a;
    static final ScheduledExecutorService b;
    final AtomicReference c;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        b = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        a = new qiw("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public qjc() {
        qiw qiwVar = a;
        AtomicReference atomicReference = new AtomicReference();
        this.c = atomicReference;
        atomicReference.lazySet(qja.a(qiwVar));
    }

    @Override // defpackage.qbt
    public final qbs a() {
        return new qjb((ScheduledExecutorService) this.c.get());
    }

    @Override // defpackage.qbt
    public final qbz c(Runnable runnable, long j, TimeUnit timeUnit) {
        qmd.S(runnable);
        qix qixVar = new qix(runnable);
        try {
            qixVar.b(j <= 0 ? ((ScheduledExecutorService) this.c.get()).submit(qixVar) : ((ScheduledExecutorService) this.c.get()).schedule(qixVar, j, timeUnit));
            return qixVar;
        } catch (RejectedExecutionException e) {
            qmd.R(e);
            return qcs.INSTANCE;
        }
    }
}
