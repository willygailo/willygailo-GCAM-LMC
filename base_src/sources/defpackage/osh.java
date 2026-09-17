package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
class osh extends oqz implements SortedSet {
    public final osg a;

    public osh(osg osgVar) {
        this.a = osgVar;
    }

    @Override // defpackage.oqz
    public final /* synthetic */ oqw a() {
        return this.a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.a.comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return oxh.q(this.a.g());
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return this.a.gE(obj, 1).j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return obr.U(this.a.k().iterator());
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return oxh.q(this.a.l());
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return this.a.r(obj, 2, obj2, 1).j();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return this.a.s(obj, 2).j();
    }
}
