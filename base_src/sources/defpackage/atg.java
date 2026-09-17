package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class atg implements Iterator, java.util.Iterator {
    public final atu a;
    public String b = null;
    private java.util.Iterator c;

    public atg(ati atiVar) {
        this.c = null;
        atu atuVar = new atu();
        this.a = atuVar;
        atl atlVar = atiVar.a;
        if (atuVar.h(256)) {
            this.c = new atf(this, atlVar);
        } else {
            this.c = new ate(this, atlVar, null, 1);
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // j$.util.Iterator
    public final Object next() {
        return this.c.next();
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }
}
