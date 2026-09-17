package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oub extends otz {
    final int e;

    /* JADX WARN: Illegal instructions before constructor call */
    public oub(pfc pfcVar, int i) {
        int[] iArr = new int[i];
        int i2 = pfcVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            int iA = pfcVar.a(i3);
            iArr[iA] = (1 << i3) | iArr[iA];
        }
        super(pfcVar, iArr);
        this.e = 1 << (this.c - 1);
    }

    @Override // defpackage.otn
    public final int a(pfc pfcVar, int i) {
        int i2 = pfcVar.c;
        int i3 = this.c;
        int i4 = (i2 + Integer.MAX_VALUE) - i3;
        int i5 = i4 >= 0 ? i4 : Integer.MAX_VALUE;
        int i6 = 0;
        int i7 = -1;
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = ((int[]) this.d)[pfcVar.a(i8)] | i6;
            int i10 = i9 | (((i9 & i7) + i7) ^ i7);
            int i11 = i6 | ((i10 | i7) ^ (-1));
            int i12 = i7 & i10;
            int i13 = this.e;
            if ((i12 & i13) == 0) {
                if ((i13 & i11) == 0) {
                    i5--;
                    if (i5 < 0) {
                        break;
                    }
                } else {
                    i3++;
                    i5 -= 2;
                    if (i5 < 0) {
                        break;
                    }
                }
            } else {
                i3--;
            }
            int i14 = (i11 + i11) | 1;
            i7 = (i12 + i12) | ((i10 | i14) ^ (-1));
            i6 = i14 & i10;
        }
        return i3;
    }
}
