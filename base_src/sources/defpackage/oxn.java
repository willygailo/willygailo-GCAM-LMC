package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class oxn extends AbstractMap {
    public static final Comparator a = new mvm(4);
    public final Object[] b;
    public final int[] c;
    public final Set d = new oxm(this, -1);
    private Integer e = null;
    private String f = null;

    public oxn(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            String str = ((oxk) it.next()).a;
            throw null;
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        int[] iArr = new int[1];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            String str2 = ((oxk) it2.next()).a;
            throw null;
        }
        iArr[0] = 0;
        this.b = e(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
        this.c = iArr;
    }

    public oxn(oxn oxnVar, oxn oxnVar2) {
        int i;
        int i2;
        Object objC;
        Object[] objArr;
        int size = oxnVar.size() + oxnVar2.size();
        int iB = oxnVar.b() + oxnVar2.b();
        Object[] objArr2 = new Object[iB];
        int i3 = size + 1;
        int[] iArr = new int[i3];
        int i4 = 0;
        iArr[0] = size;
        int i5 = size;
        Map.Entry entryC = oxnVar.c(0);
        Map.Entry entryC2 = oxnVar2.c(0);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (entryC == null && entryC2 == null) {
                break;
            }
            int iCompareTo = entryC == null ? 1 : entryC2 == null ? -1 : 0;
            if (iCompareTo == 0 && (iCompareTo = ((String) entryC.getKey()).compareTo((String) entryC2.getKey())) == 0) {
                objArr2[i6] = d((String) entryC.getKey(), i6);
                int i9 = i6 + 1;
                oxm oxmVar = (oxm) entryC.getValue();
                oxm oxmVar2 = (oxm) entryC2.getValue();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i10 >= oxmVar.size() && i11 >= oxmVar2.size()) {
                        break;
                    }
                    int iCompare = i10 == oxmVar.size() ? 1 : i11 == oxmVar2.size() ? -1 : 0;
                    iCompare = iCompare == 0 ? oxp.a.compare(oxmVar.c(i10), oxmVar2.c(i11)) : iCompare;
                    if (iCompare < 0) {
                        i2 = i10 + 1;
                        objC = oxmVar.c(i10);
                    } else {
                        int i12 = i11 + 1;
                        Object objC2 = oxmVar2.c(i11);
                        i2 = iCompare == 0 ? i10 + 1 : i10;
                        i11 = i12;
                        objC = objC2;
                    }
                    objArr2[i5] = objC;
                    i10 = i2;
                    i5++;
                    i4 = 0;
                }
                iArr[i9] = i5;
                int i13 = i7 + 1;
                entryC = oxnVar.c(i13);
                int i14 = i8 + 1;
                entryC2 = oxnVar2.c(i14);
                i7 = i13;
                i8 = i14;
                i6 = i9;
            } else {
                if (iCompareTo < 0) {
                    i = i6 + 1;
                    int iA = a(entryC, i6, i5, objArr2, iArr);
                    int i15 = i7 + 1;
                    entryC = oxnVar.c(i15);
                    i5 = iA;
                    i7 = i15;
                } else {
                    i = i6 + 1;
                    int iA2 = a(entryC2, i6, i5, objArr2, iArr);
                    int i16 = i8 + 1;
                    entryC2 = oxnVar2.c(i16);
                    i5 = iA2;
                    i8 = i16;
                }
                i6 = i;
                i4 = 0;
            }
        }
        int i17 = iArr[i4];
        int i18 = i17 - i6;
        if (i18 != 0) {
            for (int i19 = 0; i19 <= i6; i19++) {
                iArr[i19] = iArr[i19] - i18;
            }
            int i20 = iArr[i6];
            int i21 = i20 - i6;
            if (e(iB, i20)) {
                objArr = new Object[i20];
                System.arraycopy(objArr2, i4, objArr, i4, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i17, objArr, i6, i21);
            objArr2 = objArr;
        }
        this.b = objArr2;
        int i22 = iArr[i4] + 1;
        this.c = e(i3, i22) ? Arrays.copyOf(iArr, i22) : iArr;
    }

    private final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        oxm oxmVar = (oxm) entry.getValue();
        int iA = oxmVar.a() - oxmVar.b();
        System.arraycopy(oxmVar.b.b, oxmVar.b(), objArr, i2, iA);
        objArr[i] = d((String) entry.getKey(), i);
        int i3 = i2 + iA;
        iArr[i + 1] = i3;
        return i3;
    }

    private final int b() {
        return this.c[size()];
    }

    private final Map.Entry c(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    private final Map.Entry d(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new oxm(this, i));
    }

    private static boolean e(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.e == null) {
            this.e = Integer.valueOf(super.hashCode());
        }
        return this.e.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f == null) {
            this.f = super.toString();
        }
        return this.f;
    }
}
