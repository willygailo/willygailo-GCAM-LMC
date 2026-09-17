package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class prq extends AbstractList implements RandomAccess, ppx {
    public final ppx a;

    public prq(ppx ppxVar) {
        this.a = ppxVar;
    }

    @Override // defpackage.ppx
    public final ppx d() {
        return this;
    }

    @Override // defpackage.ppx
    public final Object f(int i) {
        return this.a.f(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((ppw) this.a).get(i);
    }

    @Override // defpackage.ppx
    public final List h() {
        return this.a.h();
    }

    @Override // defpackage.ppx
    public final void i(poc pocVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new prp(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new pro(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
