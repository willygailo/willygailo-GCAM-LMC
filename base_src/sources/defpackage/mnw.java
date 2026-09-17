package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mnw {
    public mnw a;
    public final Executor b;
    public final Runnable c;
    public final moa d;

    public mnw(Executor executor, Runnable runnable) {
        this.b = executor;
        this.c = runnable;
        this.d = null;
    }

    public mnw(Executor executor, Runnable runnable, moa moaVar) {
        this.b = executor;
        this.c = runnable;
        this.d = moaVar;
    }
}
