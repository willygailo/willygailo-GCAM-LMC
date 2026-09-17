package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class xl {
    static final xl a = new xl(null, null);
    final Runnable b;
    final Executor c;
    xl next;

    public xl(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
