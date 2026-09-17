package defpackage;

import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class oks implements Iterator, j$.util.Iterator {
    final Iterator a;
    Collection b;
    final /* synthetic */ okt c;

    public oks(okt oktVar) {
        this.c = oktVar;
        this.a = oktVar.a.entrySet().iterator();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        okt oktVar = this.c;
        Object key = entry.getKey();
        return obr.ae(key, oktVar.b.c(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        obr.aR(this.b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        this.c.b.b -= this.b.size();
        this.b.clear();
        this.b = null;
    }
}
