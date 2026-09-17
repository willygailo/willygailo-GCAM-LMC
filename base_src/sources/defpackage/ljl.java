package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ljl implements Executor {
    private final Executor a;
    private final ljf b;
    private final String c;

    public ljl(Executor executor, ljf ljfVar, String str) {
        this.a = executor;
        this.b = ljfVar;
        this.c = str;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(this.b.c(this.c, runnable));
    }
}
