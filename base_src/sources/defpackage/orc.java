package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class orc implements Iterator, j$.util.Iterator {
    private final oqw a;
    private final Iterator b;
    private oqv c;
    private int d;
    private int e;
    private boolean f;

    public orc(oqw oqwVar, Iterator it) {
        this.a = oqwVar;
        this.b = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.d > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int iA = this.d;
        if (iA == 0) {
            oqv oqvVar = (oqv) this.b.next();
            this.c = oqvVar;
            iA = oqvVar.a();
            this.e = iA;
        }
        this.d = iA - 1;
        this.f = true;
        oqv oqvVar2 = this.c;
        oqvVar2.getClass();
        return oqvVar2.b();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        ohh.T(this.f);
        if (this.e == 1) {
            this.b.remove();
        } else {
            oqw oqwVar = this.a;
            oqv oqvVar = this.c;
            oqvVar.getClass();
            oqwVar.remove(oqvVar.b());
        }
        this.e--;
        this.f = false;
    }
}
