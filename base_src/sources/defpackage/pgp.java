package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
abstract class pgp extends phs {
    private final Executor a;
    final /* synthetic */ pgq b;

    public pgp(pgq pgqVar, Executor executor) {
        this.b = pgqVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.phs
    public final void d(Throwable th) {
        this.b.c = null;
        if (th instanceof ExecutionException) {
            this.b.a(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.b.cancel(false);
        } else {
            this.b.a(th);
        }
    }

    @Override // defpackage.phs
    public final void e(Object obj) {
        this.b.c = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.a(e);
        }
    }

    @Override // defpackage.phs
    public final boolean g() {
        return this.b.isDone();
    }
}
