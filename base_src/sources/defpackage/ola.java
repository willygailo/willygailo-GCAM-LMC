package defpackage;

import j$.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
final class ola extends oky implements ListIterator, Iterator {
    final /* synthetic */ olb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ola(olb olbVar) {
        super(olbVar);
        this.d = olbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ola(olb olbVar, int i) {
        super(olbVar, olbVar.d().listIterator(i));
        this.d = olbVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.d.isEmpty();
        b().add(obj);
        olb olbVar = this.d;
        olbVar.f.b++;
        if (zIsEmpty) {
            olbVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }
}
