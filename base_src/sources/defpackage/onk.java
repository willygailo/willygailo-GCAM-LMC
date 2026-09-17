package defpackage;

import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onk extends one implements Queue {
    protected onk() {
    }

    @Override // defpackage.one
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract Queue d();

    @Override // java.util.Queue
    public final Object element() {
        return d().element();
    }

    public boolean offer(Object obj) {
        return d().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return d().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return d().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return d().remove();
    }
}
