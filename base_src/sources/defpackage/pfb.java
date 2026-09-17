package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class pfb {
    private int[] a;
    private int b = 0;

    public pfb(int i) {
        this.a = new int[i];
    }

    public final pfc a() {
        int i = this.b;
        return i == 0 ? pfc.a : new pfc(this.a, i);
    }

    public final void b(int i) {
        int i2 = this.b + 1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(iArr, i3);
        }
        int[] iArr2 = this.a;
        int i4 = this.b;
        iArr2[i4] = i;
        this.b = i4 + 1;
    }
}
