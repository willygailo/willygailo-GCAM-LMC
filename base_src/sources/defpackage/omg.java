package defpackage;

import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class omg implements Iterator, j$.util.Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ omh d;

    public omg(omh omhVar) {
        this.d = omhVar;
        this.a = omhVar.b;
        this.b = omhVar.a();
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        Object objC = this.d.c(i);
        this.b = this.d.b(this.b);
        return objC;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        a();
        ohh.T(this.c >= 0);
        this.a += 32;
        omh omhVar = this.d;
        omhVar.remove(omhVar.c(this.c));
        this.b--;
        this.c = -1;
    }
}
