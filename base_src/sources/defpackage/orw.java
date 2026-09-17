package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class orw extends oor {
    public static final oor a = new orw(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] b;
    public final transient int c;
    private final transient Object d;

    private orw(Object obj, Object[] objArr, int i) {
        this.d = obj;
        this.b = objArr;
        this.c = i;
    }

    static orw a(int i, Object[] objArr) {
        if (i == 0) {
            return (orw) a;
        }
        if (i != 1) {
            obr.aY(i, objArr.length >> 1);
            return new orw(f(objArr, i, ope.B(i), 0), objArr, i);
        }
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        ohh.S(obj, obj2);
        return new orw(null, objArr, 1);
    }

    static Object f(Object[] objArr, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i == 1) {
            Object obj = objArr[i3];
            obj.getClass();
            Object obj2 = objArr[i3 ^ 1];
            obj2.getClass();
            ohh.S(obj, obj2);
            return null;
        }
        int i7 = i2 - 1;
        int i8 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            while (i8 < i) {
                int i9 = i8 + i8 + i3;
                Object obj3 = objArr[i9];
                obj3.getClass();
                Object obj4 = objArr[i9 ^ 1];
                obj4.getClass();
                ohh.S(obj3, obj4);
                int iC = ohh.C(obj3.hashCode());
                while (true) {
                    i6 = iC & i7;
                    int i10 = bArr[i6] & 255;
                    if (i10 == 255) {
                        break;
                    }
                    if (obj3.equals(objArr[i10])) {
                        throw h(obj3, obj4, objArr, i10);
                    }
                    iC = i6 + 1;
                }
                bArr[i6] = (byte) i9;
                i8++;
            }
            return bArr;
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            while (i8 < i) {
                int i11 = i8 + i8 + i3;
                Object obj5 = objArr[i11];
                obj5.getClass();
                Object obj6 = objArr[i11 ^ 1];
                obj6.getClass();
                ohh.S(obj5, obj6);
                int iC2 = ohh.C(obj5.hashCode());
                while (true) {
                    i5 = iC2 & i7;
                    char c = (char) sArr[i5];
                    if (c == 65535) {
                        break;
                    }
                    if (obj5.equals(objArr[c])) {
                        throw h(obj5, obj6, objArr, c);
                    }
                    iC2 = i5 + 1;
                }
                sArr[i5] = (short) i11;
                i8++;
            }
            return sArr;
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        while (i8 < i) {
            int i12 = i8 + i8 + i3;
            Object obj7 = objArr[i12];
            obj7.getClass();
            Object obj8 = objArr[i12 ^ 1];
            obj8.getClass();
            ohh.S(obj7, obj8);
            int iC3 = ohh.C(obj7.hashCode());
            while (true) {
                i4 = iC3 & i7;
                int i13 = iArr[i4];
                if (i13 == -1) {
                    break;
                }
                if (obj7.equals(objArr[i13])) {
                    throw h(obj7, obj8, objArr, i13);
                }
                iC3 = i4 + 1;
            }
            iArr[i4] = i12;
            i8++;
        }
        return iArr;
    }

    static Object g(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iC = ohh.C(obj2.hashCode());
            while (true) {
                int i3 = iC & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iC = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iC2 = ohh.C(obj2.hashCode());
            while (true) {
                int i5 = iC2 & length2;
                char c = (char) sArr[i5];
                if (c == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[c])) {
                    return objArr[c ^ 1];
                }
                iC2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iC3 = ohh.C(obj2.hashCode());
            while (true) {
                int i6 = iC3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                iC3 = i6 + 1;
            }
        }
    }

    private static IllegalArgumentException h(Object obj, Object obj2, Object[] objArr, int i) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[i]);
        String strValueOf4 = String.valueOf(objArr[i ^ 1]);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.oor
    public final ope gJ() {
        return new ort(this, this.b, 0, this.c);
    }

    @Override // defpackage.oor
    public final ope gK() {
        return new oru(this, new orv(this.b, 0, this.c));
    }

    @Override // defpackage.oor
    public final boolean gM() {
        return false;
    }

    @Override // defpackage.oor, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object objG = g(this.d, this.b, this.c, 0, obj);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    @Override // defpackage.oor
    public final ood i() {
        return new orv(this.b, 1, this.c);
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.c;
    }
}
