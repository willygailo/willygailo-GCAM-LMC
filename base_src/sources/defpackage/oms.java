package defpackage;

import java.util.NavigableSet;

/* JADX INFO: loaded from: classes2.dex */
final class oms extends opm {
    private final opm a;

    public oms(opm opmVar) {
        super(orh.b(opmVar.b).a());
        this.a = opmVar;
    }

    @Override // defpackage.opm, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.a.floor(obj);
    }

    @Override // defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.opm, java.util.NavigableSet
    public final /* synthetic */ NavigableSet descendingSet() {
        return this.a;
    }

    @Override // defpackage.opm, java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.a.ceiling(obj);
    }

    @Override // defpackage.opm
    /* JADX INFO: renamed from: gF */
    public final opm descendingSet() {
        return this.a;
    }

    @Override // defpackage.opm, java.util.NavigableSet
    /* JADX INFO: renamed from: gG */
    public final oti descendingIterator() {
        return this.a.listIterator();
    }

    @Override // defpackage.opm, defpackage.ope, defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: gH */
    public final oti listIterator() {
        return this.a.descendingIterator();
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return this.a.gI();
    }

    @Override // defpackage.opm, java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.a.lower(obj);
    }

    @Override // defpackage.opm
    public final opm k() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.opm, java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.a.higher(obj);
    }

    @Override // defpackage.opm
    public final opm n(Object obj, boolean z) {
        return this.a.tailSet(obj, z).descendingSet();
    }

    @Override // defpackage.opm
    public final opm q(Object obj, boolean z, Object obj2, boolean z2) {
        return this.a.subSet(obj2, z2, obj, z).descendingSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.opm
    public final opm t(Object obj, boolean z) {
        return this.a.m(obj, z).descendingSet();
    }
}
