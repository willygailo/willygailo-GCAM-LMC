package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class laf implements Runnable {
    private final Runnable a;
    private final Executor b;

    public laf(Runnable runnable, Executor executor) {
        this.b = executor;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.execute(this.a);
    }
}
