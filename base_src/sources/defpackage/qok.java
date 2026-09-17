package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class qok extends qol implements Iterator, j$.util.Iterator, qlh {
    public qlh a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        switch (this.b) {
            case 4:
                return new NoSuchElementException();
            case 5:
                return new IllegalStateException("Iterator has failed.");
            default:
                return new IllegalStateException("Unexpected state of the iterator: " + this.b);
        }
    }

    @Override // defpackage.qol
    public final Object a(Object obj, qlh qlhVar) {
        this.c = obj;
        this.b = 3;
        this.a = qlhVar;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        return qlpVar == qlp.COROUTINE_SUSPENDED ? qlpVar : qks.a;
    }

    @Override // defpackage.qol
    public final Object b(Iterator it, qlh qlhVar) {
        if (!it.hasNext()) {
            return qks.a;
        }
        this.d = it;
        this.b = 2;
        this.a = qlhVar;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        return qlpVar == qlp.COROUTINE_SUSPENDED ? qlpVar : qks.a;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // defpackage.qlh
    public final qln getContext() {
        return qlo.a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() throws Throwable {
        while (true) {
            switch (this.b) {
                case 0:
                    break;
                case 1:
                    Iterator it = this.d;
                    it.getClass();
                    if (it.hasNext()) {
                        this.b = 2;
                        return true;
                    }
                    this.d = null;
                    break;
                case 2:
                case 3:
                    return true;
                case 4:
                    return false;
                default:
                    throw c();
            }
            this.b = 5;
            qlh qlhVar = this.a;
            qlhVar.getClass();
            this.a = null;
            qlhVar.resumeWith(qks.a);
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() throws Throwable {
        switch (this.b) {
            case 0:
            case 1:
                if (hasNext()) {
                    return next();
                }
                throw new NoSuchElementException();
            case 2:
                this.b = 1;
                Iterator it = this.d;
                it.getClass();
                return it.next();
            case 3:
                this.b = 0;
                Object obj = this.c;
                this.c = null;
                return obj;
            default:
                throw c();
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.qlh
    public final void resumeWith(Object obj) {
        qmd.M(obj);
        this.b = 4;
    }
}
