package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class qpe {

    @Deprecated
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(qpe.class, Object.class, "a");
    public volatile Object a;

    public qpe(Object obj) {
        this.a = obj;
    }

    public final Object a(Object obj) {
        int i = qpf.a;
        return b.getAndSet(this, obj);
    }

    public final void b(Object obj) {
        int i = qpf.a;
        b.lazySet(this, obj);
    }

    public final boolean c(Object obj, Object obj2) {
        int i = qpf.a;
        return b.compareAndSet(this, obj, obj2);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
