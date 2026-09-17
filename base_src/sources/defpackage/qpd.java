package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class qpd {

    @Deprecated
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(qpd.class, "b");
    public volatile long b;

    public qpd(long j) {
        this.b = j;
    }

    public final long a(long j) {
        int i = qpf.a;
        return a.addAndGet(this, j);
    }

    public final long b() {
        int i = qpf.a;
        return a.getAndIncrement(this);
    }

    public final boolean c(long j, long j2) {
        int i = qpf.a;
        return a.compareAndSet(this, j, j2);
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
