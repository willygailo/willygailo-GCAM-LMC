package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class qlb implements Iterator, j$.util.Iterator {
    public boolean a;
    private final int b;
    private int c;
    private final int d;

    public qlb() {
    }

    public qlb(int i, int i2, int i3) {
        this.d = 1;
        this.b = i2;
        boolean z = i <= i2;
        this.a = z;
        this.c = true != z ? i2 : i;
    }

    public final int a() {
        int i = this.c;
        if (i != this.b) {
            this.c = this.d + i;
        } else {
            if (!this.a) {
                throw new NoSuchElementException();
            }
            this.a = false;
        }
        return i;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
