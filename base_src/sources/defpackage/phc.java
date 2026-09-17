package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class phc extends pho {
    private final pht a;

    public phc(pht phtVar) {
        phtVar.getClass();
        this.a = phtVar;
    }

    @Override // defpackage.pfx, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.pfx, defpackage.pht
    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    @Override // defpackage.pfx, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.pfx, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    @Override // defpackage.pfx, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.pfx, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.pfx
    public final String toString() {
        return this.a.toString();
    }
}
