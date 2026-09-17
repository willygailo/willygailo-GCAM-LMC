package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class xa implements Collection, Set {
    private static Object[] c;
    private static int d;
    private static Object[] e;
    private static int f;
    private static final Object g = new Object();
    private static final Object h = new Object();
    private int[] i = xb.a;
    Object[] a = xb.b;
    int b = 0;

    private final int d(int i) {
        try {
            return xb.a(this.i, this.b, i);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    private final int e(Object obj, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int iD = d(i);
        if (iD < 0 || obj.equals(this.a[iD])) {
            return iD;
        }
        int i3 = iD + 1;
        while (i3 < i2 && this.i[i3] == i) {
            if (obj.equals(this.a[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iD - 1; i4 >= 0 && this.i[i4] == i; i4--) {
            if (obj.equals(this.a[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    private final int f() {
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        int iD = d(0);
        if (iD < 0 || this.a[iD] == null) {
            return iD;
        }
        int i2 = iD + 1;
        while (i2 < i && this.i[i2] == 0) {
            if (this.a[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iD - 1; i3 >= 0 && this.i[i3] == 0; i3--) {
            if (this.a[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    private final void g(int i) {
        if (i == 8) {
            synchronized (h) {
                Object[] objArr = e;
                if (objArr != null) {
                    try {
                        this.a = objArr;
                        e = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.i = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f--;
                            return;
                        }
                    } catch (ClassCastException e2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    e = null;
                    f = 0;
                }
            }
        } else if (i == 4) {
            synchronized (g) {
                Object[] objArr2 = c;
                if (objArr2 != null) {
                    try {
                        this.a = objArr2;
                        c = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.i = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            d--;
                            return;
                        }
                    } catch (ClassCastException e3) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    c = null;
                    d = 0;
                }
                i = 4;
            }
        }
        this.i = new int[i];
        this.a = new Object[i];
    }

    private static void h(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (h) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
            return;
        }
        if (length == 4) {
            synchronized (g) {
                if (d < 10) {
                    objArr[0] = c;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    c = objArr;
                    d++;
                }
            }
        }
    }

    public final int a(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iE;
        int i2 = this.b;
        if (obj == null) {
            iE = f();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iE = e(obj, iHashCode);
        }
        if (iE >= 0) {
            return false;
        }
        int i3 = iE ^ (-1);
        int[] iArr = this.i;
        int length = iArr.length;
        if (i2 >= length) {
            int i4 = 4;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.a;
            g(i4);
            if (i2 != this.b) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.i;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, length);
                System.arraycopy(objArr, 0, this.a, 0, objArr.length);
            }
            h(iArr, objArr, i2);
        }
        if (i3 < i2) {
            int[] iArr3 = this.i;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.a;
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.b;
        if (i2 == i7) {
            int[] iArr4 = this.i;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.a[i3] = obj;
                this.b = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = this.b + collection.size();
        int i = this.b;
        int[] iArr = this.i;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.a;
            g(size);
            int i2 = this.b;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.i, 0, i2);
                System.arraycopy(objArr, 0, this.a, 0, this.b);
            }
            h(iArr, objArr, this.b);
        }
        if (this.b != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i) {
        return this.a[i];
    }

    public final void c(int i) {
        int i2 = this.b;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.i;
        int length = iArr.length;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                int i5 = i3 - i;
                System.arraycopy(iArr, i4, iArr, i, i5);
                Object[] objArr2 = this.a;
                System.arraycopy(objArr2, i4, objArr2, i, i5);
            }
            this.a[i3] = null;
        } else {
            g(i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                System.arraycopy(iArr, 0, this.i, 0, i);
                System.arraycopy(objArr, 0, this.a, 0, i);
            }
            if (i < i3) {
                int i6 = i + 1;
                int i7 = i3 - i;
                System.arraycopy(iArr, i6, this.i, i, i7);
                System.arraycopy(objArr, i6, this.a, i, i7);
            }
        }
        if (i2 != this.b) {
            throw new ConcurrentModificationException();
        }
        this.b = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.b;
        if (i != 0) {
            int[] iArr = this.i;
            Object[] objArr = this.a;
            this.i = xb.a;
            this.a = xb.b;
            this.b = 0;
            h(iArr, objArr, i);
        }
        if (this.b != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.b == set.size()) {
                for (int i = 0; i < this.b; i++) {
                    try {
                        if (!set.contains(b(i))) {
                            return false;
                        }
                    } catch (ClassCastException e2) {
                        return false;
                    } catch (NullPointerException e3) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.i;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new wz(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        c(iA);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.b - 1; i >= 0; i--) {
            if (!collection.contains(this.a[i])) {
                c(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.a, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.b) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.b);
        }
        System.arraycopy(this.a, 0, objArr, 0, this.b);
        int length = objArr.length;
        int i = this.b;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b * 14);
        sb.append('{');
        for (int i = 0; i < this.b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objB = b(i);
            if (objB != this) {
                sb.append(objB);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
