package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class hwy extends maa {
    private final Runnable a;
    private final AtomicBoolean b;

    public hwy(mad madVar, Runnable runnable) {
        super(madVar);
        this.b = new AtomicBoolean(false);
        this.a = runnable;
    }

    @Override // defpackage.maa, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.b.compareAndSet(false, true)) {
            super.close();
            this.a.run();
        }
    }
}
