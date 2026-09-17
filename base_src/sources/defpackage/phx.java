package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class phx implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ pfx b;

    public phx(Executor executor, pfx pfxVar) {
        this.a = executor;
        this.b = pfxVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.a(e);
        }
    }
}
