package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class jbe {
    public Runnable b;
    public Runnable c;
    private final ScheduledExecutorService d;
    public final Object a = new Object();
    private volatile ScheduledFuture e = null;

    public jbe(ScheduledExecutorService scheduledExecutorService) {
        this.d = scheduledExecutorService;
    }

    public final void a() {
        Runnable runnable;
        Runnable runnable2;
        ScheduledFuture scheduledFuture;
        synchronized (this.a) {
            runnable = this.b;
            runnable2 = this.c;
            scheduledFuture = this.e;
        }
        if (runnable == null || runnable2 == null) {
            return;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        runnable.run();
        this.e = this.d.schedule(runnable2, 1500L, TimeUnit.MILLISECONDS);
    }
}
