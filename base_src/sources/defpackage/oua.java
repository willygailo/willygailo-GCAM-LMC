package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class oua extends otz {
    private final int e;
    private final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    public oua(pfc pfcVar, int i) {
        int[][] iArr = new int[i][];
        int i2 = pfcVar.c;
        int i3 = (i2 + 30) / 31;
        int[] iArr2 = new int[i3];
        Arrays.fill(iArr, iArr2);
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int iA = pfcVar.a(i6);
            int[] iArr3 = iArr[iA];
            if (iArr3 == iArr2) {
                iArr3 = new int[i3];
                iArr[iA] = iArr3;
            }
            iArr3[i4] = iArr3[i4] | (1 << i5);
            i5++;
            if (i5 == 31) {
                i4++;
                i5 = 0;
            }
        }
        super(pfcVar, iArr);
        int i7 = this.c;
        this.f = (i7 + 30) / 31;
        this.e = 1 << ((i7 - 1) % 31);
    }

    @Override // defpackage.otn
    public final int a(pfc pfcVar, int i) {
        int[] iArr = new int[this.f];
        Arrays.fill(iArr, Integer.MAX_VALUE);
        int[] iArr2 = new int[this.f];
        int i2 = this.c;
        int i3 = pfcVar.c;
        int i4 = (i3 + Integer.MAX_VALUE) - i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        loop0: for (int i5 = 0; i5 < i3; i5++) {
            int[] iArr3 = ((int[][]) this.d)[pfcVar.a(i5)];
            int i6 = 1;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = this.f;
                if (i7 < i10) {
                    int i11 = iArr2[i7];
                    int i12 = iArr3[i7] | i11;
                    int i13 = iArr[i7];
                    i8 = (i13 & i12) + i13 + (i8 >>> 31);
                    int i14 = ((i8 & Integer.MAX_VALUE) ^ i13) | i12;
                    int i15 = i11 | ((i14 | i13) ^ (-1));
                    int i16 = i14 & i13;
                    if (i7 == i10 - 1) {
                        int i17 = this.e;
                        if ((i16 & i17) == 0) {
                            if ((i15 & i17) == 0) {
                                i4--;
                                if (i4 < 0) {
                                    break loop0;
                                }
                            } else {
                                i2++;
                                i4 -= 2;
                                if (i4 < 0) {
                                    break loop0;
                                }
                            }
                        } else {
                            i2--;
                        }
                    }
                    int i18 = (i15 + i15) | i6;
                    int i19 = (i16 + i16) | i9;
                    iArr[i7] = (i19 | ((i14 | i18) ^ (-1))) & Integer.MAX_VALUE;
                    iArr2[i7] = i14 & i18 & Integer.MAX_VALUE;
                    i7++;
                    i6 = i18 >>> 31;
                    i9 = i19 >>> 31;
                }
            }
        }
        return i2;
    }
}
