package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class pfo {
    static final pfo a = new pfo();
    final Runnable b;
    final Executor c;
    pfo next;

    public pfo() {
        this.b = null;
        this.c = null;
    }

    public pfo(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
