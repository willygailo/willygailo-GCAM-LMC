package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oom extends ood implements List, RandomAccess {
    private static final otj a = new ooi(orr.a, 0);

    public static ooh e() {
        return new ooh();
    }

    public static ooh f(int i) {
        ohh.U(i, "expectedSize");
        return new ooh(i);
    }

    static oom g(Object[] objArr) {
        return h(objArr, objArr.length);
    }

    static oom h(Object[] objArr, int i) {
        return i == 0 ? orr.a : new orr(objArr, i);
    }

    public static oom i(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return j((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return orr.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m(next);
        }
        ooh oohVar = new ooh();
        oohVar.g(next);
        oohVar.i(it);
        return oohVar.f();
    }

    public static oom j(Collection collection) {
        if (!(collection instanceof ood)) {
            return w(collection.toArray());
        }
        oom oomVarV = ((ood) collection).v();
        return oomVarV.gI() ? g(oomVarV.toArray()) : oomVarV;
    }

    public static oom k(Object[] objArr) {
        return objArr.length == 0 ? orr.a : w((Object[]) objArr.clone());
    }

    public static oom l() {
        return orr.a;
    }

    public static oom m(Object obj) {
        return w(obj);
    }

    public static oom n(Object obj, Object obj2) {
        return w(obj, obj2);
    }

    public static oom o(Object obj, Object obj2, Object obj3) {
        return w(obj, obj2, obj3);
    }

    public static oom p(Object obj, Object obj2, Object obj3, Object obj4) {
        return w(obj, obj2, obj3, obj4);
    }

    public static oom q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return w(obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static oom r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        obr.aG(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return w(objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static oom s(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] objArrX = ohh.x(iterable);
        obr.Q(objArrX);
        Arrays.sort(objArrX, comparator);
        return g(objArrX);
    }

    private static oom w(Object... objArr) {
        obr.Q(objArr);
        return g(objArr);
    }

    public oom a() {
        return size() <= 1 ? this : new ooj(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public oom subList(int i, int i2) {
        obr.aP(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? orr.a : new ool(this, i, i3);
    }

    @Override // defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obr.an(this, obj);
    }

    @Override // defpackage.ood
    /* JADX INFO: renamed from: gH */
    public final oti listIterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final otj listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final otj listIterator(int i) {
        obr.aY(i, size());
        return isEmpty() ? a : new ooi(this, i);
    }

    @Override // defpackage.ood
    @Deprecated
    public final oom v() {
        return this;
    }

    @Override // defpackage.ood
    Object writeReplace() {
        return new ook(toArray());
    }

    @Override // defpackage.ood
    public int x(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }
}
