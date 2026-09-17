package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class owj implements Iterator, j$.util.Iterator {
    final /* synthetic */ owk a;
    private final ovd b;
    private int c;
    private int d;

    public owj(owk owkVar, ovd ovdVar, int i) {
        this.a = owkVar;
        this.b = ovdVar;
        int i2 = i & 31;
        this.c = i2;
        this.d = i >>> (i2 + 5);
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        Object objD = this.b.d(this.a.e(this.c));
        int i = this.d;
        if (i != 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
            this.d >>>= iNumberOfTrailingZeros;
            this.c += iNumberOfTrailingZeros;
        } else {
            this.c = -1;
        }
        return objD;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
