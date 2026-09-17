package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class qqy extends qqx {
    private final Executor b;

    public qqy(Executor executor) {
        this.b = executor;
        quv.a(executor);
    }

    @Override // defpackage.qqx
    public final Executor c() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    @Override // defpackage.qqf
    public final void d(qln qlnVar, Runnable runnable) {
        qlnVar.getClass();
        try {
            this.b.execute(runnable);
        } catch (RejectedExecutionException e) {
            qnt.m(qlnVar, qno.D("The task was rejected", e));
            qqq.b.d(qlnVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qqy) && ((qqy) obj).b == this.b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // defpackage.qqf
    public final String toString() {
        return this.b.toString();
    }
}
