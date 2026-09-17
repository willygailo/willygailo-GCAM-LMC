package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ope extends ood implements Set {
    private transient oom a;

    static int B(int i) {
        double d;
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            obr.aG(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
            d = iHighestOneBit;
            Double.isNaN(d);
        } while (d * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static opc D() {
        return new opc();
    }

    public static ope E(int i, Object... objArr) {
        switch (i) {
            case 0:
                return orx.a;
            case 1:
                Object obj = objArr[0];
                obj.getClass();
                return H(obj);
            default:
                int iB = B(i);
                Object[] objArr2 = new Object[iB];
                int i2 = iB - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj2 = objArr[i5];
                    obr.P(obj2, i5);
                    int iHashCode = obj2.hashCode();
                    int iC = ohh.C(iHashCode);
                    while (true) {
                        int i6 = iC & i2;
                        Object obj3 = objArr2[i6];
                        if (obj3 == null) {
                            objArr[i4] = obj2;
                            objArr2[i6] = obj2;
                            i3 += iHashCode;
                            i4++;
                        }
                        if (obj3.equals(obj2)) {
                        }
                        iC++;
                        break;
                        break;
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj4 = objArr[0];
                    obj4.getClass();
                    return new ose(obj4);
                }
                if (B(i4) < iB / 2) {
                    return E(i4, objArr);
                }
                return new orx(N(i4, objArr.length) ? Arrays.copyOf(objArr, i4) : objArr, i3, objArr2, i2, i4);
        }
    }

    public static ope F(Collection collection) {
        if ((collection instanceof ope) && !(collection instanceof SortedSet)) {
            ope opeVar = (ope) collection;
            if (!opeVar.gI()) {
                return opeVar;
            }
        }
        Object[] array = collection.toArray();
        return E(array.length, array);
    }

    public static ope G(Object[] objArr) {
        int length = objArr.length;
        switch (length) {
            case 0:
                return orx.a;
            case 1:
                return H(objArr[0]);
            default:
                return E(length, (Object[]) objArr.clone());
        }
    }

    public static ope H(Object obj) {
        return new ose(obj);
    }

    public static ope I(Object obj, Object obj2) {
        return E(2, obj, obj2);
    }

    public static ope J(Object obj, Object obj2, Object obj3) {
        return E(3, obj, obj2, obj3);
    }

    public static ope K(Object obj, Object obj2, Object obj3, Object obj4) {
        return E(4, obj, obj2, obj3, obj4);
    }

    public static ope L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return E(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static ope M(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        obr.aG(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return E(i, objArr2);
    }

    public static boolean N(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public oom C() {
        return oom.g(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ope) && w() && ((ope) obj).w() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException e) {
            } catch (NullPointerException e2) {
            }
        }
        return false;
    }

    @Override // defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: gH, reason: merged with bridge method [inline-methods] */
    public abstract oti listIterator();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return obr.A(this);
    }

    @Override // defpackage.ood
    public oom v() {
        oom oomVar = this.a;
        if (oomVar != null) {
            return oomVar;
        }
        oom oomVarC = C();
        this.a = oomVarC;
        return oomVarC;
    }

    public boolean w() {
        return false;
    }

    @Override // defpackage.ood
    Object writeReplace() {
        return new opd(toArray());
    }
}
