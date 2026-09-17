package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class qpb {

    @Deprecated
    private static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(qpb.class, "b");
    private volatile int b;

    public qpb(boolean z) {
        this.b = z ? 1 : 0;
    }

    public final boolean a() {
        return this.b != 0;
    }

    public final boolean b() {
        int i = qpf.a;
        return a.compareAndSet(this, 0, 1);
    }

    public final void c() {
        int i = qpf.a;
        this.b = 1;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
