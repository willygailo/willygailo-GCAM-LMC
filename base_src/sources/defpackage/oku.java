package defpackage;

import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
abstract class oku implements Iterator, j$.util.Iterator {
    final Iterator a;
    Object b = null;
    Collection c = null;
    Iterator d = oqa.INSTANCE;
    final /* synthetic */ old e;

    public oku(old oldVar) {
        this.e = oldVar;
        this.a = oldVar.a.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.d.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        return a(this.b, this.d.next());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.d.remove();
        Collection collection = this.c;
        collection.getClass();
        if (collection.isEmpty()) {
            this.a.remove();
        }
        this.e.b--;
    }
}
