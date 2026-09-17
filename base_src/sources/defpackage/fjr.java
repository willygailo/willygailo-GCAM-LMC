package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fjr {
    public static final long a = TimeUnit.SECONDS.toNanos(10);
    public final lis b;
    public final fjs c;
    public final ScheduledExecutorService d;

    public fjr(fjs fjsVar, lir lirVar, ScheduledExecutorService scheduledExecutorService) {
        this.c = fjsVar;
        this.b = lirVar.a("ProcessingEvent");
        this.d = scheduledExecutorService;
    }
}
