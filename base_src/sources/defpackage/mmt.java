package defpackage;

import android.util.Log;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class mmt extends AbstractExecutorService implements mmc {
    private final Thread b;
    private final mmv d;
    private final AtomicBoolean c = new AtomicBoolean(false);
    public final moa a = moa.i();

    private mmt(String str, mmv mmvVar) {
        this.d = mmvVar;
        this.b = new Thread(new mms(this, mmvVar), str);
    }

    public static mmt b(String str, mmv mmvVar) {
        return new mmt(str, mmvVar);
    }

    public final void a() {
        this.b.start();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        try {
            this.b.join(TimeUnit.MILLISECONDS.convert(j, timeUnit));
            return isTerminated();
        } catch (InterruptedException e) {
            Log.w("EventLoopThread", "Interrupted while waiting for thread to stop.");
            return false;
        }
    }

    @Override // defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.h(mmg.a);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.c.get();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return !this.b.isAlive();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.c.set(true);
        this.d.a();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        this.c.set(true);
        mmv mmvVar = this.d;
        mmvVar.a.clear();
        mmvVar.a();
        return (List) mip.ac(this.a);
    }

    public final String toString() {
        String name = this.b.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 17);
        sb.append("EventLoopThread[");
        sb.append(name);
        sb.append("]");
        return sb.toString();
    }
}
