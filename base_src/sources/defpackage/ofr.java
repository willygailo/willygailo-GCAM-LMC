package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class ofr implements Runnable {
    public pgj a;
    public Executor b;

    public ofr(pgj pgjVar, Executor executor) {
        pgjVar.getClass();
        this.a = pgjVar;
        executor.getClass();
        this.b = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = null;
        this.b = null;
    }
}
