package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class qpc {

    @Deprecated
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(qpc.class, "b");
    public volatile int b;

    public qpc(int i) {
        this.b = i;
    }

    public final int a() {
        int i = qpf.a;
        return a.decrementAndGet(this);
    }

    public final int b() {
        int i = qpf.a;
        return a.getAndDecrement(this);
    }

    public final int c() {
        int i = qpf.a;
        return a.incrementAndGet(this);
    }

    public final boolean d(int i, int i2) {
        int i3 = qpf.a;
        return a.compareAndSet(this, i, i2);
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
