package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ouc extends otz {
    final long e;

    /* JADX WARN: Illegal instructions before constructor call */
    public ouc(pfc pfcVar, int i) {
        long[] jArr = new long[i];
        int i2 = pfcVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            int iA = pfcVar.a(i3);
            jArr[iA] = (1 << i3) | jArr[iA];
        }
        super(pfcVar, jArr);
        this.e = 1 << (this.c - 1);
    }

    @Override // defpackage.otn
    public final int a(pfc pfcVar, int i) {
        int i2 = pfcVar.c;
        int i3 = this.c;
        int i4 = (i2 + Integer.MAX_VALUE) - i3;
        int i5 = i4 >= 0 ? i4 : Integer.MAX_VALUE;
        int i6 = 0;
        long j = -1;
        long j2 = 0;
        long j3 = -1;
        while (i6 < i2) {
            long j4 = ((long[]) this.d)[pfcVar.a(i6)] | j2;
            long j5 = j4 | (((j4 & j3) + j3) ^ j3);
            long j6 = j2 | ((j5 | j3) ^ j);
            long j7 = j3 & j5;
            long j8 = this.e;
            if ((j7 & j8) != 0) {
                i3--;
            } else if ((j8 & j6) != 0) {
                i3++;
                i5 -= 2;
                if (i5 < 0) {
                    break;
                }
            } else {
                i5--;
                if (i5 < 0) {
                    break;
                }
            }
            long j9 = 1 | (j6 + j6);
            j3 = (j7 + j7) | ((j5 | j9) ^ (-1));
            j2 = j5 & j9;
            i6++;
            j = -1;
        }
        return i3;
    }
}
