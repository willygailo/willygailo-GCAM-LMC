package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class oxl implements Iterator, j$.util.Iterator {
    final /* synthetic */ oxm a;
    private int b = 0;

    public oxl(oxm oxmVar) {
        this.a = oxmVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i >= this.a.size()) {
            throw new NoSuchElementException();
        }
        oxm oxmVar = this.a;
        Object obj = oxmVar.b.b[oxmVar.b() + i];
        this.b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
