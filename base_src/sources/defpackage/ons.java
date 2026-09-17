package defpackage;

import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class ons implements Iterator, j$.util.Iterator {
    final /* synthetic */ ont a;
    private int b;
    private int c;
    private int d;
    private int e;

    public ons(ont ontVar) {
        this.a = ontVar;
        onu onuVar = ontVar.b;
        this.b = onuVar.e;
        this.c = -1;
        this.d = onuVar.d;
        this.e = onuVar.c;
    }

    private final void a() {
        if (this.a.b.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = this.a.a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.a.b.f[i];
        this.e--;
        return objA;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        a();
        ohh.T(this.c != -1);
        onu onuVar = this.a.b;
        int i = this.c;
        onuVar.h(i, ohh.D(onuVar.a[i]));
        int i2 = this.b;
        onu onuVar2 = this.a.b;
        if (i2 == onuVar2.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = onuVar2.d;
    }
}
