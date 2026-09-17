package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class onn implements Serializable {
    public final Comparator a;
    public final boolean b;
    public final Object c;
    public final boolean d;
    public final Object e;
    public final int f;
    public final int g;

    public onn(Comparator comparator, boolean z, Object obj, int i, boolean z2, Object obj2, int i2) {
        comparator.getClass();
        this.a = comparator;
        this.b = z;
        this.d = z2;
        this.c = obj;
        this.f = i;
        this.e = obj2;
        this.g = i2;
        if (z) {
            comparator.compare(obj, obj);
        }
        if (z2) {
            comparator.compare(obj2, obj2);
        }
        if (z && z2) {
            int iCompare = comparator.compare(obj, obj2);
            obr.aN(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (iCompare == 0) {
                obr.aF((i != 1) | (i2 != 1));
            }
        }
    }

    static onn a(Comparator comparator) {
        return new onn(comparator, false, null, 1, false, null, 1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    final onn b(onn onnVar) {
        int iCompare;
        boolean z;
        boolean z2;
        Object obj;
        int i;
        int iCompare2;
        boolean z3;
        Object obj2;
        Object obj3;
        int i2;
        int i3;
        obr.aF(this.a.equals(onnVar.a));
        boolean z4 = this.b;
        Object obj4 = this.c;
        int i4 = this.f;
        if (z4) {
            if (onnVar.b && ((iCompare = this.a.compare(obj4, onnVar.c)) < 0 || (iCompare == 0 && onnVar.f == 1))) {
                obj4 = onnVar.c;
                i4 = onnVar.f;
                z = z4;
            }
            z2 = this.d;
            obj = this.e;
            i = this.g;
            if (!z2) {
                if (!onnVar.d && ((iCompare2 = this.a.compare(obj, onnVar.e)) > 0 || (iCompare2 == 0 && onnVar.g == 1))) {
                    Object obj5 = onnVar.e;
                    i = onnVar.g;
                    z3 = z2;
                    obj2 = obj5;
                }
                if (z || !z3) {
                    obj3 = obj4;
                    i2 = i4;
                    i3 = i;
                } else {
                    int iCompare3 = this.a.compare(obj4, obj2);
                    if (iCompare3 > 0) {
                        obj3 = obj2;
                        i2 = 1;
                    } else if (iCompare3 != 0 || i4 != 1) {
                        obj3 = obj4;
                        i2 = i4;
                        i3 = i;
                    } else if (i == 1) {
                        obj3 = obj2;
                        i2 = 1;
                        i3 = 2;
                    } else {
                        obj3 = obj4;
                        i2 = i4;
                    }
                    i3 = 2;
                }
                return new onn(this.a, z, obj3, i2, z3, obj2, i3);
            }
            z2 = onnVar.d;
            obj = onnVar.e;
            i = onnVar.g;
            z3 = z2;
            obj2 = obj;
            if (z) {
                obj3 = obj4;
                i2 = i4;
                i3 = i;
            } else {
                obj3 = obj4;
                i2 = i4;
                i3 = i;
            }
            return new onn(this.a, z, obj3, i2, z3, obj2, i3);
        }
        z4 = onnVar.b;
        obj4 = onnVar.c;
        i4 = onnVar.f;
        z = z4;
        z2 = this.d;
        obj = this.e;
        i = this.g;
        if (!z2) {
            if (!onnVar.d) {
            }
            if (z) {
                obj3 = obj4;
                i2 = i4;
                i3 = i;
            } else {
                obj3 = obj4;
                i2 = i4;
                i3 = i;
            }
            return new onn(this.a, z, obj3, i2, z3, obj2, i3);
        }
        z2 = onnVar.d;
        obj = onnVar.e;
        i = onnVar.g;
        z3 = z2;
        obj2 = obj;
        if (z) {
            obj3 = obj4;
            i2 = i4;
            i3 = i;
        } else {
            obj3 = obj4;
            i2 = i4;
            i3 = i;
        }
        return new onn(this.a, z, obj3, i2, z3, obj2, i3);
    }

    final boolean c(Object obj) {
        return (e(obj) || d(obj)) ? false : true;
    }

    final boolean d(Object obj) {
        if (!this.d) {
            return false;
        }
        int iCompare = this.a.compare(obj, this.e);
        return ((iCompare == 0) & (this.g == 1)) | (iCompare > 0);
    }

    final boolean e(Object obj) {
        if (!this.b) {
            return false;
        }
        int iCompare = this.a.compare(obj, this.c);
        return ((iCompare == 0) & (this.f == 1)) | (iCompare < 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof onn) {
            onn onnVar = (onn) obj;
            if (this.a.equals(onnVar.a) && this.b == onnVar.b && this.d == onnVar.d && this.f == onnVar.f && this.g == onnVar.g && obr.bc(this.c, onnVar.c) && obr.bc(this.e, onnVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, Integer.valueOf(this.f), this.e, Integer.valueOf(this.g)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        char c = this.f == 2 ? '[' : '(';
        String strValueOf2 = String.valueOf(this.b ? this.c : "-∞");
        String strValueOf3 = String.valueOf(this.d ? this.e : "∞");
        char c2 = this.g == 2 ? ']' : ')';
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 4 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append(strValueOf);
        sb.append(":");
        sb.append(c);
        sb.append(strValueOf2);
        sb.append(',');
        sb.append(strValueOf3);
        sb.append(c2);
        return sb.toString();
    }
}
