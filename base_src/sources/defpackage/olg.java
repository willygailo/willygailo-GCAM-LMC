package defpackage;

import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class olg implements Iterator, j$.util.Iterator {
    int b;
    int c = -1;
    int d;
    final /* synthetic */ olh e;

    public olg(olh olhVar) {
        this.e = olhVar;
        this.b = olhVar.a.a();
        this.d = olhVar.a.d;
    }

    private final void b() {
        if (this.e.a.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        b();
        return this.b >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.e.a.d(i);
        return objA;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        b();
        ohh.T(this.c != -1);
        olh olhVar = this.e;
        olhVar.b -= (long) olhVar.a.g(this.c);
        this.b--;
        this.c = -1;
        this.d = this.e.a.d;
    }
}
