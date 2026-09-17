package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class qof implements Iterator, j$.util.Iterator {
    final /* synthetic */ qog a;
    private final Iterator b;
    private Iterator c;

    public qof(qog qogVar) {
        this.a = qogVar;
        this.b = qogVar.a.a();
    }

    private final boolean a() {
        Iterator it = this.c;
        if (it != null && !it.hasNext()) {
            this.c = null;
        }
        while (this.c == null) {
            if (!this.b.hasNext()) {
                return false;
            }
            Object next = this.b.next();
            qog qogVar = this.a;
            Iterator it2 = (Iterator) qogVar.c.a(qogVar.b.a(next));
            if (it2.hasNext()) {
                this.c = it2;
                break;
            }
        }
        return true;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return a();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.c;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
