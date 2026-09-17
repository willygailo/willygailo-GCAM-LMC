package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class egx implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ AtomicBoolean b;

    public egx(Runnable runnable, AtomicBoolean atomicBoolean) {
        this.a = runnable;
        this.b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        synchronized (this.b) {
            this.b.set(true);
            this.b.notify();
        }
    }
}
