package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lax implements Executor {
    static final lar a = new lar(lar.a);
    public final lar b = a;
    private final Executor c;

    public lax(Executor executor) {
        this.c = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.execute(new law(this, runnable));
    }
}
