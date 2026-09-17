package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class okg implements Iterator, j$.util.Iterator {
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ okm c;

    public okg(okm okmVar, Iterator it) {
        this.c = okmVar;
        this.b = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.a = (Map.Entry) this.b.next();
        return new okh(this.c, this.a);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        Map.Entry entry = this.a;
        if (entry == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Object value = entry.getValue();
        this.b.remove();
        this.c.h(value);
        this.a = null;
    }
}
