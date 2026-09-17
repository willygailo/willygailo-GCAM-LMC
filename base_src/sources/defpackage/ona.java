package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class ona extends onk implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;
    private final Queue b;

    private ona(int i) {
        obr.aI(i >= 0, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    public static ona c(int i) {
        return new ona(i);
    }

    @Override // defpackage.one, defpackage.onj
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.b;
    }

    @Override // defpackage.one, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.a == 0) {
            return true;
        }
        if (size() == this.a) {
            this.b.remove();
        }
        this.b.add(obj);
        return true;
    }

    @Override // defpackage.one, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.a) {
            return ohh.p(this, collection.iterator());
        }
        clear();
        int i = size - this.a;
        collection.getClass();
        obr.aG(i >= 0, "number to skip cannot be negative");
        return ohh.p(this, new opt(collection, i).iterator());
    }

    @Override // defpackage.onk, defpackage.one
    protected final /* synthetic */ Collection b() {
        return this.b;
    }

    @Override // defpackage.onk
    protected final Queue d() {
        return this.b;
    }

    @Override // defpackage.onk, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
