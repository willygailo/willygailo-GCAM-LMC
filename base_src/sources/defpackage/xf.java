package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class xf {
    static Object[] d;
    static int e;
    static Object[] f;
    static int g;
    public int[] h;
    public Object[] i;
    public int j;

    public xf() {
        this.h = xb.a;
        this.i = xb.b;
        this.j = 0;
    }

    public xf(int i) {
        if (i == 0) {
            this.h = xb.a;
            this.i = xb.b;
        } else {
            l(i);
        }
        this.j = 0;
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return xb.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l(int i) {
        if (i == 8) {
            synchronized (xf.class) {
                Object[] objArr = f;
                if (objArr != null) {
                    this.i = objArr;
                    f = (Object[]) objArr[0];
                    this.h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (xf.class) {
                Object[] objArr2 = d;
                if (objArr2 != null) {
                    this.i = objArr2;
                    d = (Object[]) objArr2[0];
                    this.h = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    e--;
                    return;
                }
                i = 4;
            }
        }
        this.h = new int[i];
        this.i = new Object[i + i];
    }

    private static void m(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (xf.class) {
                if (g < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    for (int i2 = (i + i) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f = objArr;
                    g++;
                }
            }
            return;
        }
        if (length == 4) {
            synchronized (xf.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i3 = (i + i) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        }
    }

    final int b(Object obj, int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return -1;
        }
        int iA = a(this.h, i2, i);
        if (iA < 0 || obj.equals(this.i[iA + iA])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.h[i3] == i) {
            if (obj.equals(this.i[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.h[i4] == i; i4--) {
            if (obj.equals(this.i[i4 + i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj, obj.hashCode());
    }

    public void clear() {
        int i = this.j;
        if (i > 0) {
            int[] iArr = this.h;
            Object[] objArr = this.i;
            this.h = xb.a;
            this.i = xb.b;
            this.j = 0;
            m(iArr, objArr, i);
        }
        if (this.j > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return e(obj) >= 0;
    }

    final int d() {
        int i = this.j;
        if (i == 0) {
            return -1;
        }
        int iA = a(this.h, i, 0);
        if (iA < 0 || this.i[iA + iA] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.h[i2] == 0) {
            if (this.i[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.h[i3] == 0; i3--) {
            if (this.i[i3 + i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    final int e(Object obj) {
        int i = this.j;
        int i2 = i + i;
        Object[] objArr = this.i;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof xf) {
                xf xfVar = (xf) obj;
                if (this.j != xfVar.j) {
                    return false;
                }
                for (int i = 0; i < this.j; i++) {
                    Object objF = f(i);
                    Object objI = i(i);
                    Object obj2 = xfVar.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !xfVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.j != map.size()) {
                    return false;
                }
                for (int i2 = 0; i2 < this.j; i2++) {
                    Object objF2 = f(i2);
                    Object objI2 = i(i2);
                    Object obj3 = map.get(objF2);
                    if (objI2 == null) {
                        if (obj3 != null || !map.containsKey(objF2)) {
                            return false;
                        }
                    } else if (!objI2.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (ClassCastException e2) {
        } catch (NullPointerException e3) {
        }
    }

    public final Object f(int i) {
        return this.i[i + i];
    }

    public Object g(int i) {
        Object[] objArr = this.i;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.j;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.h;
            int length = iArr.length;
            if (length <= 8 || i3 >= length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    int i6 = i4 - i;
                    System.arraycopy(iArr, i5, iArr, i, i6);
                    Object[] objArr2 = this.i;
                    System.arraycopy(objArr2, i5 + i5, objArr2, i2, i6 + i6);
                }
                Object[] objArr3 = this.i;
                int i7 = i4 + i4;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                l(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.j) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.h, 0, i);
                    System.arraycopy(objArr, 0, this.i, 0, i2);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 - i;
                    System.arraycopy(iArr, i8, this.h, i, i9);
                    System.arraycopy(objArr, i8 + i8, this.i, i2, i9 + i9);
                }
            }
            if (i3 != this.j) {
                throw new ConcurrentModificationException();
            }
            this.j = i4;
        }
        return obj;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.i[iC + iC + 1] : obj2;
    }

    public Object h(int i, Object obj) {
        int i2 = i + i + 1;
        Object[] objArr = this.i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public int hashCode() {
        int[] iArr = this.h;
        Object[] objArr = this.i;
        int i = this.j;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        return this.i[i + i + 1];
    }

    public final boolean isEmpty() {
        return this.j <= 0;
    }

    public final void j(int i) {
        int i2 = this.j;
        int[] iArr = this.h;
        if (iArr.length < i) {
            Object[] objArr = this.i;
            l(i);
            if (this.j > 0) {
                System.arraycopy(iArr, 0, this.h, 0, i2);
                System.arraycopy(objArr, 0, this.i, 0, i2 + i2);
            }
            m(iArr, objArr, i2);
        }
        if (this.j != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void k(xf xfVar) {
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int iB;
        int i2 = this.j;
        if (obj == null) {
            iB = d();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iB = b(obj, iHashCode);
        }
        if (iB >= 0) {
            int i3 = iB + iB + 1;
            Object[] objArr = this.i;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = iB ^ (-1);
        int[] iArr = this.h;
        int length = iArr.length;
        if (i2 >= length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.i;
            l(i5);
            if (i2 != this.j) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.h;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, length);
                System.arraycopy(objArr2, 0, this.i, 0, objArr2.length);
            }
            m(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.h;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.i;
            int i7 = this.j - i4;
            System.arraycopy(objArr3, i4 + i4, objArr3, i6 + i6, i7 + i7);
        }
        int i8 = this.j;
        if (i2 == i8) {
            int[] iArr4 = this.h;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.i;
                int i9 = i4 + i4;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.j = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0) {
            return false;
        }
        Object objI = i(iC);
        if (obj2 != objI && (obj2 == null || !obj2.equals(objI))) {
            return false;
        }
        g(iC);
        return true;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return h(iC, obj2);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0) {
            return false;
        }
        Object objI = i(iC);
        if (objI != obj2 && (obj2 == null || !obj2.equals(objI))) {
            return false;
        }
        h(iC, obj3);
        return true;
    }

    public final int size() {
        return this.j;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.j * 28);
        sb.append('{');
        for (int i = 0; i < this.j; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objF = f(i);
            if (objF != this) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i);
            if (objI != this) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
