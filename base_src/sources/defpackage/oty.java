package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oty extends otn {
    private static final int[] c = new int[0];
    private int[] d;
    private int[] e;
    private int[] f;
    private int[] g;
    private int[] h;
    private int[] i;

    public oty(pfc pfcVar) {
        super(pfcVar);
        int[] iArr = c;
        this.d = iArr;
        this.e = iArr;
        this.f = iArr;
        this.g = iArr;
        this.h = iArr;
        this.i = iArr;
    }

    private final void c(int i, boolean z) {
        if (this.d.length <= i) {
            int i2 = i + 1;
            this.f = f(this.f, i2, z);
            this.e = f(this.e, i2, z);
            this.d = f(this.d, i2, false);
        }
    }

    private final void d(int i, boolean z) {
        if (this.g.length <= i) {
            int i2 = i + 1;
            this.i = f(this.i, i2, z);
            this.h = f(this.h, i2, z);
            this.g = f(this.g, i2, false);
        }
    }

    private static final int e(int i, int i2, pfc pfcVar, pfc pfcVar2, int i3, int i4, int i5) {
        int i6 = pfcVar.c;
        int i7 = pfcVar2.c;
        int iMax = i2 == 0 ? 0 : Math.max(Math.max(i4, i5) + 1, i3);
        int iMin = Math.min(i7, i6 - i);
        while (iMax < iMin && pfcVar.a(iMax + i) == pfcVar2.a(iMax)) {
            iMax++;
        }
        return iMax;
    }

    private static final int[] f(int[] iArr, int i, boolean z) {
        int[] iArr2 = new int[i];
        if (z) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        }
        return iArr2;
    }

    @Override // defpackage.otn
    public final int a(pfc pfcVar, int i) {
        boolean z;
        int iE;
        boolean z2;
        pfc pfcVar2 = this.b;
        int i2 = pfcVar2.c;
        int i3 = pfcVar.c;
        int i4 = i2 - i3;
        int iAbs = Math.abs(i4);
        if (i4 <= 0) {
            d(iAbs, false);
            for (int i5 = 0; i5 <= iAbs; i5++) {
                this.h[i5] = (iAbs - i5) - 1;
                this.i[i5] = -1;
            }
            z = true;
        } else {
            c(iAbs, false);
            for (int i6 = 0; i6 <= iAbs; i6++) {
                this.e[i6] = -1;
                this.f[i6] = -1;
            }
            z = true;
        }
        while (true) {
            int i7 = (iAbs - i4) / 2;
            d(i7, true);
            if (z) {
                this.h[i7] = -1;
                iE = -1;
            } else {
                iE = -1;
            }
            while (i7 > 0) {
                int[] iArr = this.g;
                int i8 = i7 - 1;
                iE = e(i4 + i7, iAbs - i7, pfcVar2, pfcVar, this.i[i8], this.h[i7], iE);
                iArr[i7] = iE;
                i7 = i8;
                i7 = i7;
            }
            int i9 = i7;
            int i10 = (iAbs + i4) / 2;
            c(i10, true);
            if (z) {
                this.e[i10] = i9 - 1;
                z2 = true;
            } else {
                z2 = false;
            }
            int i11 = i10;
            int iE2 = z2 ? -1 : i9;
            while (i11 > 0) {
                int[] iArr2 = this.d;
                int i12 = i11 - 1;
                iE2 = e(i4 - i11, iAbs - i11, pfcVar2, pfcVar, iE2, this.e[i11], this.f[i12]);
                iArr2[i11] = iE2;
                i11 = i12;
            }
            int iE3 = e(i4, iAbs, pfcVar2, pfcVar, iE2, this.e[0], iE);
            if (iE3 == i3 || (iAbs = iAbs + 1) < 0) {
                break;
            }
            int[] iArr3 = this.d;
            int[] iArr4 = this.g;
            iArr4[0] = iE3;
            iArr3[0] = iE3;
            int[] iArr5 = this.e;
            this.f = iArr5;
            this.e = iArr3;
            this.d = iArr5;
            int[] iArr6 = this.i;
            this.i = this.h;
            this.h = iArr4;
            this.g = iArr6;
            z = !z2;
        }
        return iAbs;
    }
}
