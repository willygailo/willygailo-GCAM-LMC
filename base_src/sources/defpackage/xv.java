package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class xv implements pht {
    final WeakReference a;
    public final xq b = new xu(this);

    public xv(xr xrVar) {
        this.a = new WeakReference(xrVar);
    }

    public final void a(Throwable th) {
        xq xqVar = this.b;
        if (xq.b.d(xqVar, null, new xk(th))) {
            xq.e(xqVar);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        xr xrVar = (xr) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || xrVar == null) {
            return zCancel;
        }
        xrVar.a = null;
        xrVar.b = null;
        xrVar.c.f(null);
        return true;
    }

    @Override // defpackage.pht
    public final void d(Runnable runnable, Executor executor) {
        this.b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }
}
