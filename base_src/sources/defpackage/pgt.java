package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class pgt {
    final Runnable a;
    final Executor b;
    pgt c;

    public pgt(Runnable runnable, Executor executor, pgt pgtVar) {
        this.a = runnable;
        this.b = executor;
        this.c = pgtVar;
    }
}
