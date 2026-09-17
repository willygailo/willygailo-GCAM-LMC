package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class qwe extends qqx implements Executor, qwh {
    private final qwd b;
    private final int d;
    private final String e;
    private final ConcurrentLinkedQueue f;
    private final qpc g;

    public qwe(qwd qwdVar, int i) {
        qwdVar.getClass();
        this.b = qwdVar;
        this.d = i;
        this.e = "Dispatchers.IO";
        this.f = new ConcurrentLinkedQueue();
        this.g = qnt.g(0);
    }

    private final void h(Runnable runnable, boolean z) {
        while (this.g.c() > this.d) {
            this.f.add(runnable);
            if (this.g.a() >= this.d || (runnable = (Runnable) this.f.poll()) == null) {
                return;
            }
        }
        this.b.f(runnable, this, z);
    }

    @Override // defpackage.qqx
    public final Executor c() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // defpackage.qqf
    public final void d(qln qlnVar, Runnable runnable) {
        qlnVar.getClass();
        h(runnable, false);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        h(runnable, false);
    }

    @Override // defpackage.qwh
    public final int f() {
        return 1;
    }

    @Override // defpackage.qwh
    public final void g() {
        Runnable runnable = (Runnable) this.f.poll();
        if (runnable != null) {
            this.b.f(runnable, this, true);
            return;
        }
        this.g.a();
        Runnable runnable2 = (Runnable) this.f.poll();
        if (runnable2 == null) {
            return;
        }
        h(runnable2, true);
    }

    @Override // defpackage.qqf
    public final String toString() {
        return this.e;
    }
}
