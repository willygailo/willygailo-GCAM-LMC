package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class qoe implements Iterator, j$.util.Iterator {
    final /* synthetic */ qot a;
    private final Iterator b;
    private int c = -1;
    private Object d;

    public qoe(qot qotVar, byte[] bArr) {
        this.a = qotVar;
        this.b = qotVar.a.a();
    }

    private final void a() {
        while (this.b.hasNext()) {
            Object next = this.b.next();
            if (((Boolean) this.a.b.a(next)).booleanValue()) {
                this.d = next;
                this.c = 1;
                return;
            }
        }
        this.c = 0;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.c == -1) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (this.c == -1) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.d;
        this.d = null;
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
