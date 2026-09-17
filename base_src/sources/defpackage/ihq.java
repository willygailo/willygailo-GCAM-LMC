package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ihq implements iho {
    private final Runnable a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public ihq(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.a.run();
    }
}
