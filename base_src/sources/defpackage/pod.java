package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class pod extends poh {
    private final byte[] e;
    private int f;
    private int g;
    private int h;
    private final int i;
    private int j;
    private int k = Integer.MAX_VALUE;

    public pod(byte[] bArr, int i, int i2) {
        this.e = bArr;
        this.f = i2 + i;
        this.h = i;
        this.i = i;
    }

    private final void K() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = i - this.i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    @Override // defpackage.poh
    public final void A(int i) {
        this.k = i;
        K();
    }

    public final void B(int i) throws ppp {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw ppp.i();
        }
        throw ppp.f();
    }

    @Override // defpackage.poh
    public final boolean C() {
        return this.h == this.f;
    }

    @Override // defpackage.poh
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.poh
    public final boolean E(int i) throws ppp {
        int iM;
        int i2 = 0;
        switch (psa.b(i)) {
            case 0:
                if (this.f - this.h < 10) {
                    while (i2 < 10) {
                        if (a() < 0) {
                            i2++;
                        }
                    }
                    throw ppp.e();
                }
                while (i2 < 10) {
                    byte[] bArr = this.e;
                    int i3 = this.h;
                    this.h = i3 + 1;
                    if (bArr[i3] < 0) {
                        i2++;
                    }
                }
                throw ppp.e();
                return true;
            case 1:
                B(8);
                return true;
            case 2:
                B(j());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                B(4);
                return true;
            default:
                throw ppp.a();
        }
        do {
            iM = m();
            if (iM != 0) {
            }
            z(psa.c(psa.a(i), 4));
            return true;
        } while (E(iM));
        z(psa.c(psa.a(i), 4));
        return true;
    }

    public final byte a() throws ppp {
        int i = this.h;
        if (i == this.f) {
            throw ppp.i();
        }
        byte[] bArr = this.e;
        this.h = i + 1;
        return bArr[i];
    }

    @Override // defpackage.poh
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.poh
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.poh
    public final int d() {
        return this.h - this.i;
    }

    @Override // defpackage.poh
    public final int e(int i) throws ppp {
        if (i < 0) {
            throw ppp.f();
        }
        int iD = i + d();
        if (iD < 0) {
            throw ppp.g();
        }
        int i2 = this.k;
        if (iD > i2) {
            throw ppp.i();
        }
        this.k = iD;
        K();
        return i2;
    }

    @Override // defpackage.poh
    public final int f() {
        return j();
    }

    @Override // defpackage.poh
    public final int g() {
        return i();
    }

    @Override // defpackage.poh
    public final int h() {
        return j();
    }

    public final int i() throws ppp {
        int i = this.h;
        if (this.f - i < 4) {
            throw ppp.i();
        }
        byte[] bArr = this.e;
        this.h = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006b A[PHI: r3
      0x006b: PHI (r3v7 int) = (r3v6 int), (r3v9 int), (r3v11 int) binds: [B:21:0x004a, B:25:0x0056, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r2[r3] >= 0) goto L34;
     */
    @Override // defpackage.poh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r5 = this;
            int r0 = r5.h
            int r1 = r5.f
            if (r1 != r0) goto L8
            goto L6f
        L8:
            byte[] r2 = r5.e
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r5.h = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6f
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L24
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6c
        L24:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L31
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            r1 = r3
            goto L6c
        L31:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6c
        L3f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6c
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6c
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L6b
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6f
            goto L6c
        L6b:
            r1 = r3
        L6c:
            r5.h = r1
            return r0
        L6f:
            long r0 = r5.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pod.j():int");
    }

    @Override // defpackage.poh
    public final int k() {
        return i();
    }

    @Override // defpackage.poh
    public final int l() {
        return F(j());
    }

    @Override // defpackage.poh
    public final int m() throws ppp {
        if (C()) {
            this.j = 0;
            return 0;
        }
        int iJ = j();
        this.j = iJ;
        if (psa.a(iJ) != 0) {
            return this.j;
        }
        throw ppp.c();
    }

    @Override // defpackage.poh
    public final int n() {
        return j();
    }

    @Override // defpackage.poh
    public final long o() {
        return q();
    }

    @Override // defpackage.poh
    public final long p() {
        return r();
    }

    public final long q() throws ppp {
        int i = this.h;
        if (this.f - i < 8) {
            throw ppp.i();
        }
        byte[] bArr = this.e;
        this.h = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final long r() {
        long j;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            byte[] bArr = this.e;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                int i5 = b ^ (bArr[i3] << 7);
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i4 + 1;
                    int i7 = i5 ^ (bArr[i4] << 14);
                    if (i7 >= 0) {
                        i4 = i6;
                        j = i7 ^ 16256;
                    } else {
                        i4 = i6 + 1;
                        int i8 = i7 ^ (bArr[i6] << 21);
                        if (i8 < 0) {
                            j = i8 ^ (-2080896);
                        } else {
                            int i9 = i4 + 1;
                            long j2 = (((long) bArr[i4]) << 28) ^ ((long) i8);
                            if (j2 >= 0) {
                                i4 = i9;
                                j = j2 ^ 266354560;
                            } else {
                                int i10 = i9 + 1;
                                long j3 = j2 ^ (((long) bArr[i9]) << 35);
                                if (j3 < 0) {
                                    j = (-34093383808L) ^ j3;
                                    i4 = i10;
                                } else {
                                    int i11 = i10 + 1;
                                    long j4 = j3 ^ (((long) bArr[i10]) << 42);
                                    if (j4 >= 0) {
                                        i4 = i11;
                                        j = j4 ^ 4363953127296L;
                                    } else {
                                        int i12 = i11 + 1;
                                        long j5 = j4 ^ (((long) bArr[i11]) << 49);
                                        if (j5 < 0) {
                                            j = (-558586000294016L) ^ j5;
                                            i4 = i12;
                                        } else {
                                            int i13 = i12 + 1;
                                            long j6 = (j5 ^ (((long) bArr[i12]) << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                int i14 = i13 + 1;
                                                if (bArr[i13] >= 0) {
                                                    j = j6;
                                                    i4 = i14;
                                                }
                                            } else {
                                                i4 = i13;
                                                j = j6;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.h = i4;
                return j;
            }
        }
        return s();
    }

    final long s() throws ppp {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bA = a();
            j |= ((long) (bA & 127)) << i;
            if ((bA & 128) == 0) {
                return j;
            }
        }
        throw ppp.e();
    }

    @Override // defpackage.poh
    public final long t() {
        return q();
    }

    @Override // defpackage.poh
    public final long u() {
        return G(r());
    }

    @Override // defpackage.poh
    public final long v() {
        return r();
    }

    @Override // defpackage.poh
    public final poc w() throws ppp {
        int iJ = j();
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iJ <= i - i2) {
                poc pocVarU = poc.u(this.e, i2, iJ);
                this.h += iJ;
                return pocVarU;
            }
        }
        if (iJ == 0) {
            return poc.b;
        }
        if (iJ > 0) {
            int i3 = this.f;
            int i4 = this.h;
            if (iJ <= i3 - i4) {
                int i5 = iJ + i4;
                this.h = i5;
                return poc.x(Arrays.copyOfRange(this.e, i4, i5));
            }
        }
        if (iJ <= 0) {
            throw ppp.f();
        }
        throw ppp.i();
    }

    @Override // defpackage.poh
    public final String x() throws ppp {
        int iJ = j();
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iJ <= i - i2) {
                String str = new String(this.e, i2, iJ, ppn.a);
                this.h += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw ppp.f();
        }
        throw ppp.i();
    }

    @Override // defpackage.poh
    public final String y() throws ppp {
        int iJ = j();
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iJ <= i - i2) {
                String strG = prx.g(this.e, i2, iJ);
                this.h += iJ;
                return strG;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw ppp.f();
        }
        throw ppp.i();
    }

    @Override // defpackage.poh
    public final void z(int i) throws ppp {
        if (this.j != i) {
            throw ppp.b();
        }
    }
}
