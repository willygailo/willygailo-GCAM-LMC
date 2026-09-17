package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class muc implements Iterable {
    public final int[] a;

    private muc(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            this.a = new int[0];
            return;
        }
        Arrays.sort(iArr);
        int i = iArr[0] + 1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i3 += i == i4 ? 0 : 1;
            i2++;
            i = i4;
        }
        int[] iArr2 = new int[i3];
        this.a = iArr2;
        int i5 = iArr[0] + 1;
        int i6 = 0;
        for (int i7 : iArr) {
            if (i5 != i7) {
                iArr2[i6] = i7;
                i6++;
                i5 = i7;
            }
        }
    }

    public static muc a(int... iArr) {
        return new muc(Arrays.copyOf(iArr, iArr.length));
    }

    public final boolean b() {
        return Arrays.binarySearch(this.a, 32856) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof muc) {
            return Arrays.equals(this.a, ((muc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new mub(this);
    }

    public final String toString() {
        int length = this.a.length;
        StringBuilder sb = new StringBuilder(19);
        sb.append("IntSet[");
        sb.append(length);
        sb.append("]");
        return sb.toString();
    }
}
