package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
final class orp extends omm {
    private static final long serialVersionUID = 0;
    private final orj d;

    public orp(orj orjVar, omw omwVar) {
        super(omwVar);
        this.d = orjVar;
    }

    public static boolean T(Comparable comparable, Comparable comparable2) {
        return comparable2 != null && orj.b(comparable, comparable2) == 0;
    }

    private final omm U(orj orjVar) {
        return this.d.o(orjVar) ? omm.a(this.d.i(orjVar), this.a) : new omy(this.a);
    }

    @Override // defpackage.ope
    public final oom C() {
        boolean z = this.a.b;
        return new ony(this);
    }

    @Override // defpackage.opm, java.util.SortedSet
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Comparable first() {
        Comparable comparableD = this.d.b.d(this.a);
        comparableD.getClass();
        return comparableD;
    }

    @Override // defpackage.opm, java.util.SortedSet
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final Comparable last() {
        Comparable comparableC = this.d.c.c(this.a);
        comparableC.getClass();
        return comparableC;
    }

    @Override // defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.d.a((Comparable) obj);
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return ohh.Q(this, collection);
    }

    @Override // defpackage.omm, defpackage.opm
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final omm n(Comparable comparable, boolean z) {
        return U(orj.s(comparable, ohh.V(z)));
    }

    @Override // defpackage.ope, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof orp) {
            orp orpVar = (orp) obj;
            if (this.a.equals(orpVar.a)) {
                return first().equals(orpVar.first()) && last().equals(orpVar.last());
            }
        }
        return super.equals(obj);
    }

    @Override // defpackage.omm, defpackage.opm
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final omm q(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        return (comparable.compareTo(comparable2) != 0 || z || z2) ? U(orj.r(comparable, ohh.V(z), comparable2, ohh.V(z2))) : new omy(this.a);
    }

    @Override // defpackage.opm, java.util.NavigableSet
    /* JADX INFO: renamed from: gG */
    public final oti descendingIterator() {
        return new orn(this, last());
    }

    @Override // defpackage.opm, defpackage.ope, defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: gH */
    public final oti listIterator() {
        return new orm(this, first());
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return false;
    }

    @Override // defpackage.ope, java.util.Collection, java.util.Set
    public final int hashCode() {
        return obr.A(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.omm, defpackage.opm
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final omm t(Comparable comparable, boolean z) {
        return U(orj.q(comparable, ohh.V(z)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        long jA = this.a.a(first(), last());
        if (jA >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jA) + 1;
    }

    @Override // defpackage.omm
    public final orj u() {
        return orj.h(this.d.b.h(this.a), this.d.c.i(this.a));
    }

    @Override // defpackage.opm, defpackage.ope, defpackage.ood
    Object writeReplace() {
        return new oro(this.d, this.a);
    }
}
