package defpackage;

import j$.util.function.Consumer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class pqz implements Iterator, j$.util.Iterator {
    private final ArrayDeque a;
    private poa b;

    public pqz(poc pocVar) {
        if (!(pocVar instanceof pra)) {
            this.a = null;
            this.b = (poa) pocVar;
            return;
        }
        pra praVar = (pra) pocVar;
        ArrayDeque arrayDeque = new ArrayDeque(praVar.g);
        this.a = arrayDeque;
        arrayDeque.push(praVar);
        this.b = b(praVar.e);
    }

    private final poa b(poc pocVar) {
        while (pocVar instanceof pra) {
            pra praVar = (pra) pocVar;
            this.a.push(praVar);
            int[] iArr = pra.a;
            pocVar = praVar.e;
        }
        return (poa) pocVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final poa next() {
        poa poaVarB;
        poa poaVar = this.b;
        if (poaVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            poaVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            pra praVar = (pra) this.a.pop();
            int[] iArr = pra.a;
            poaVarB = b(praVar.f);
        } while (poaVarB.d() == 0);
        this.b = poaVarB;
        return poaVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
