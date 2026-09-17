package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class phm {
    private final boolean a;
    private final oom b;

    public phm(boolean z, oom oomVar) {
        this.a = z;
        this.b = oomVar;
    }

    public final pht a(Callable callable, Executor executor) {
        return new pgq(this.b, this.a, executor, callable);
    }

    public final pht b(pgj pgjVar, Executor executor) {
        return new pgq(this.b, this.a, executor, pgjVar);
    }

    public final void c(Runnable runnable, Executor executor) {
        a(new phl(runnable), executor);
    }
}
