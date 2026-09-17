package defpackage;

import j$.util.function.Consumer;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class qkt implements Iterator, j$.util.Iterator {
    public Object a;
    public int b = 2;
    private final ArrayDeque c;

    public qkt() {
    }

    public qkt(qmi qmiVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        if (qmiVar.a.isDirectory()) {
            arrayDeque.push(b(qmiVar.a));
        } else if (qmiVar.a.isFile()) {
            arrayDeque.push(new qmg(qmiVar.a));
        } else {
            a();
        }
    }

    private static final qmf b(File file) {
        return new qmf(file);
    }

    protected final void a() {
        this.b = 3;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        if (i == 4) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i2 = i - 1;
        File file = null;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return true;
            case 1:
            default:
                this.b = 4;
                while (true) {
                    qmh qmhVar = (qmh) this.c.peek();
                    if (qmhVar != null) {
                        File fileA = qmhVar.a();
                        if (fileA == null) {
                            this.c.pop();
                        } else if (qno.c(fileA, qmhVar.a) || !fileA.isDirectory() || this.c.size() >= Integer.MAX_VALUE) {
                            file = fileA;
                        } else {
                            this.c.push(b(fileA));
                        }
                    }
                }
                if (file != null) {
                    this.a = file;
                    this.b = 1;
                } else {
                    a();
                }
                return this.b == 1;
            case 2:
                return false;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 2;
        return this.a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
