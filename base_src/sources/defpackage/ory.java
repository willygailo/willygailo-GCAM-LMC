package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class ory extends opm {
    static final ory a = new ory(oom.l(), ore.a);
    final transient oom d;

    public ory(oom oomVar, Comparator comparator) {
        super(comparator);
        this.d = oomVar;
    }

    @Override // defpackage.ood
    public final Object[] A() {
        return this.d.A();
    }

    @Override // defpackage.opm, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iF = f(obj, true);
        if (iF == size()) {
            return null;
        }
        return this.d.get(iF);
    }

    @Override // defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.b) >= 0) {
                    return true;
                }
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof oqw) {
            collection = ((oqw) collection).j();
        }
        if (!obr.z(this.b, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        oti otiVarListIterator = listIterator();
        Iterator it = collection.iterator();
        if (!otiVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = otiVarListIterator.next();
        while (true) {
            try {
                int iO = O(next2, next);
                if (iO < 0) {
                    if (!otiVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = otiVarListIterator.next();
                } else {
                    if (iO != 0) {
                        return false;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                }
            } catch (ClassCastException | NullPointerException e) {
                return false;
            }
        }
    }

    final int e(Object obj, boolean z) {
        oom oomVar = this.d;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(oomVar, obj, this.b);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return iBinarySearch ^ (-1);
    }

    @Override // defpackage.ope, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!obr.z(this.b, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            oti otiVarListIterator = listIterator();
            while (otiVarListIterator.hasNext()) {
                Object next = otiVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || O(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException e) {
            return false;
        } catch (NoSuchElementException e2) {
            return false;
        }
    }

    final int f(Object obj, boolean z) {
        oom oomVar = this.d;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(oomVar, obj, this.b);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return iBinarySearch ^ (-1);
    }

    @Override // defpackage.opm, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.opm, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iE = e(obj, true) - 1;
        if (iE == -1) {
            return null;
        }
        return this.d.get(iE);
    }

    final ory g(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        return i < i2 ? new ory(this.d.subList(i, i2), this.b) : Q(this.b);
    }

    @Override // defpackage.opm, java.util.NavigableSet
    /* JADX INFO: renamed from: gG */
    public final oti descendingIterator() {
        return this.d.a().iterator();
    }

    @Override // defpackage.opm, defpackage.ope, defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: gH */
    public final oti listIterator() {
        return this.d.iterator();
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return this.d.gI();
    }

    @Override // defpackage.opm, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iF = f(obj, false);
        if (iF == size()) {
            return null;
        }
        return this.d.get(iF);
    }

    @Override // defpackage.opm
    public final opm k() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.b);
        return isEmpty() ? Q(comparatorReverseOrder) : new ory(this.d.a(), comparatorReverseOrder);
    }

    @Override // defpackage.opm, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.opm, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iE = e(obj, false) - 1;
        if (iE == -1) {
            return null;
        }
        return this.d.get(iE);
    }

    @Override // defpackage.opm
    public final opm n(Object obj, boolean z) {
        return g(0, e(obj, z));
    }

    @Override // defpackage.opm
    public final opm q(Object obj, boolean z, Object obj2, boolean z2) {
        return t(obj, z).n(obj2, z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.opm
    public final opm t(Object obj, boolean z) {
        return g(f(obj, z), size());
    }

    @Override // defpackage.ope, defpackage.ood
    public final oom v() {
        return this.d;
    }

    @Override // defpackage.ood
    public final int x(Object[] objArr, int i) {
        return this.d.x(objArr, i);
    }

    @Override // defpackage.ood
    public final int y() {
        return this.d.y();
    }

    @Override // defpackage.ood
    public final int z() {
        return this.d.z();
    }
}
