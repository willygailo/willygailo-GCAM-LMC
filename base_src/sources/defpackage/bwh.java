package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class bwh implements Executor, lie {
    public final Executor a;
    private final int b;
    private final ScheduledExecutorService c;

    public bwh(String str, int i) {
        lar larVar = new lar();
        this.b = i;
        this.c = mip.bQ(str);
        this.a = larVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.c.shutdown();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.c.schedule(new bwg(this, runnable), this.b, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
        }
    }
}
