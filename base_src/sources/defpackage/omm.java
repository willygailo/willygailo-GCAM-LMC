package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class omm extends opm {
    final omw a;

    public omm(omw omwVar) {
        super(ore.a);
        this.a = omwVar;
    }

    public static omm a(orj orjVar, omw omwVar) {
        orjVar.getClass();
        omwVar.getClass();
        try {
            orj orjVarI = !orjVar.m() ? orjVar.i(orj.d(omwVar.c())) : orjVar;
            if (!orjVar.n()) {
                orjVarI = orjVarI.i(orj.e(omwVar.b()));
            }
            if (!orjVarI.p()) {
                Comparable comparableD = orjVar.b.d(omwVar);
                comparableD.getClass();
                Comparable comparableC = orjVar.c.c(omwVar);
                comparableC.getClass();
                if (orj.b(comparableD, comparableC) <= 0) {
                    return new orp(orjVarI, omwVar);
                }
            }
            return new omy(omwVar);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.opm
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final omm l(Comparable comparable) {
        comparable.getClass();
        return n(comparable, false);
    }

    @Override // defpackage.opm
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final omm m(Comparable comparable, boolean z) {
        comparable.getClass();
        return n(comparable, z);
    }

    /* JADX INFO: renamed from: d */
    public abstract omm n(Comparable comparable, boolean z);

    @Override // defpackage.opm, java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final omm subSet(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        obr.aF(this.b.compare(comparable, comparable2) <= 0);
        return q(comparable, true, comparable2, false);
    }

    @Override // defpackage.opm, java.util.NavigableSet
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final omm subSet(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        comparable.getClass();
        comparable2.getClass();
        obr.aF(this.b.compare(comparable, comparable2) <= 0);
        return q(comparable, z, comparable2, z2);
    }

    /* JADX INFO: renamed from: g */
    public abstract omm q(Comparable comparable, boolean z, Comparable comparable2, boolean z2);

    @Override // defpackage.opm, java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final omm tailSet(Comparable comparable) {
        comparable.getClass();
        return t(comparable, true);
    }

    @Override // defpackage.opm, java.util.NavigableSet
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final omm tailSet(Comparable comparable, boolean z) {
        comparable.getClass();
        return t(comparable, z);
    }

    /* JADX INFO: renamed from: j */
    public abstract omm t(Comparable comparable, boolean z);

    @Override // defpackage.opm
    public opm k() {
        return new oms(this);
    }

    @Override // defpackage.opm
    public /* bridge */ /* synthetic */ opm n(Object obj, boolean z) {
        throw null;
    }

    @Override // defpackage.opm
    public /* bridge */ /* synthetic */ opm q(Object obj, boolean z, Object obj2, boolean z2) {
        throw null;
    }

    @Override // defpackage.opm
    public /* bridge */ /* synthetic */ opm t(Object obj, boolean z) {
        throw null;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return u().toString();
    }

    public abstract orj u();
}
