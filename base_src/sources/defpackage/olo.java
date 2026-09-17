package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class olo extends oti {
    private Object a;

    protected olo(Object obj) {
        this.a = obj;
    }

    protected abstract Object a(Object obj);

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        Object obj = this.a;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.a = a(obj);
        return obj;
    }
}
