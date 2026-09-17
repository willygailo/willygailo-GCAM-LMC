package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class pof extends poh {
    private final InputStream e;
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    public pof(InputStream inputStream) {
        ppn.i(inputStream, "input");
        this.e = inputStream;
        this.f = new byte[4096];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    private static int K(InputStream inputStream, byte[] bArr, int i, int i2) throws ppp {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (ppp e) {
            e.j();
            throw e;
        }
    }

    private final List L(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.e.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw ppp.i();
                }
                this.k += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void M() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = this.k + i;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    private final void N(int i) throws ppp {
        if (O(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.k) - this.i) {
            throw ppp.i();
        }
        throw ppp.h();
    }

    private final boolean O(int i) throws ppp {
        int i2 = this.i;
        int i3 = this.g;
        if (i2 + i <= i3) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i4 = this.k;
        if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.l) {
            return false;
        }
        if (i2 > 0) {
            if (i3 > i2) {
                byte[] bArr = this.f;
                System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
            }
            i4 = this.k + i2;
            this.k = i4;
            i3 = this.g - i2;
            this.g = i3;
            this.i = 0;
        }
        int iK = K(this.e, this.f, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
        if (iK == 0 || iK < -1 || iK > 4096) {
            String strValueOf = String.valueOf(this.e.getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 91);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(iK);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        }
        if (iK <= 0) {
            return false;
        }
        this.g += iK;
        M();
        if (this.g >= i) {
            return true;
        }
        return O(i);
    }

    private final byte[] P(int i) throws ppp {
        if (i == 0) {
            return ppn.b;
        }
        if (i < 0) {
            throw ppp.f();
        }
        int i2 = this.k;
        int i3 = this.i;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw ppp.h();
        }
        int i5 = this.l;
        if (i4 > i5) {
            B((i5 - i2) - i3);
            throw ppp.i();
        }
        int i6 = this.g - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.e.available()) {
                    return null;
                }
            } catch (ppp e) {
                e.j();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, this.i, bArr, 0, i6);
        this.k += this.g;
        this.i = 0;
        this.g = 0;
        while (i6 < i) {
            int iK = K(this.e, bArr, i6, i - i6);
            if (iK == -1) {
                throw ppp.i();
            }
            this.k += iK;
            i6 += iK;
        }
        return bArr;
    }

    private final byte[] Q(int i) throws IOException {
        byte[] bArrP = P(i);
        if (bArrP != null) {
            return bArrP;
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i3 - i2;
        this.k += i3;
        this.i = 0;
        this.g = 0;
        List<byte[]> listL = L(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, i2, bArr, 0, i4);
        for (byte[] bArr2 : listL) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // defpackage.poh
    public final void A(int i) {
        this.l = i;
        M();
    }

    public final void B(int i) throws ppp {
        int i2 = this.g;
        int i3 = this.i;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.i = i3 + i;
            return;
        }
        if (i < 0) {
            throw ppp.f();
        }
        int i5 = this.k;
        int i6 = i5 + i3;
        int i7 = this.l;
        if (i6 + i > i7) {
            B((i7 - i5) - i3);
            throw ppp.i();
        }
        this.k = i6;
        this.g = 0;
        this.i = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.e.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(this.e.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 92);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (ppp e) {
                    e.j();
                    throw e;
                }
            } catch (Throwable th) {
                this.k += i4;
                M();
                throw th;
            }
        }
        this.k += i4;
        M();
        if (i4 >= i) {
            return;
        }
        int i8 = this.g;
        int i9 = i8 - this.i;
        this.i = i8;
        N(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.g;
            if (i10 <= i11) {
                this.i = i10;
                return;
            } else {
                i9 += i11;
                this.i = i11;
                N(1);
            }
        }
    }

    @Override // defpackage.poh
    public final boolean C() {
        return this.i == this.g && !O(1);
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
                if (this.g - this.i < 10) {
                    while (i2 < 10) {
                        if (a() < 0) {
                            i2++;
                        }
                    }
                    throw ppp.e();
                }
                while (i2 < 10) {
                    byte[] bArr = this.f;
                    int i3 = this.i;
                    this.i = i3 + 1;
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
        if (this.i == this.g) {
            N(1);
        }
        byte[] bArr = this.f;
        int i = this.i;
        this.i = i + 1;
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
        return this.k + this.i;
    }

    @Override // defpackage.poh
    public final int e(int i) throws ppp {
        if (i < 0) {
            throw ppp.f();
        }
        int i2 = i + this.k + this.i;
        int i3 = this.l;
        if (i2 > i3) {
            throw ppp.i();
        }
        this.l = i2;
        M();
        return i3;
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
        int i = this.i;
        if (this.g - i < 4) {
            N(4);
            i = this.i;
        }
        byte[] bArr = this.f;
        this.i = i + 4;
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
            int r0 = r5.i
            int r1 = r5.g
            if (r1 != r0) goto L8
            goto L6f
        L8:
            byte[] r2 = r5.f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r5.i = r3
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
            r5.i = r1
            return r0
        L6f:
            long r0 = r5.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pof.j():int");
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
        int i = this.i;
        if (this.g - i < 8) {
            N(8);
            i = this.i;
        }
        byte[] bArr = this.f;
        this.i = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final long r() {
        long j;
        int i = this.i;
        int i2 = this.g;
        if (i2 != i) {
            byte[] bArr = this.f;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.i = i3;
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
                this.i = i4;
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
    public final poc w() throws IOException {
        int iJ = j();
        int i = this.g;
        int i2 = this.i;
        if (iJ <= i - i2 && iJ > 0) {
            poc pocVarU = poc.u(this.f, i2, iJ);
            this.i += iJ;
            return pocVarU;
        }
        if (iJ == 0) {
            return poc.b;
        }
        byte[] bArrP = P(iJ);
        if (bArrP != null) {
            return poc.t(bArrP);
        }
        int i3 = this.i;
        int i4 = this.g;
        int i5 = i4 - i3;
        this.k += i4;
        this.i = 0;
        this.g = 0;
        List<byte[]> listL = L(iJ - i5);
        byte[] bArr = new byte[iJ];
        System.arraycopy(this.f, i3, bArr, 0, i5);
        for (byte[] bArr2 : listL) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return poc.x(bArr);
    }

    @Override // defpackage.poh
    public final String x() throws ppp {
        int iJ = j();
        if (iJ > 0) {
            int i = this.g;
            int i2 = this.i;
            if (iJ <= i - i2) {
                String str = new String(this.f, i2, iJ, ppn.a);
                this.i += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ > this.g) {
            return new String(Q(iJ), ppn.a);
        }
        N(iJ);
        String str2 = new String(this.f, this.i, iJ, ppn.a);
        this.i += iJ;
        return str2;
    }

    @Override // defpackage.poh
    public final String y() throws IOException {
        byte[] bArrQ;
        int iJ = j();
        int i = this.i;
        int i2 = this.g;
        if (iJ <= i2 - i && iJ > 0) {
            bArrQ = this.f;
            this.i = i + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ <= i2) {
                N(iJ);
                bArrQ = this.f;
                this.i = iJ;
                i = 0;
            } else {
                bArrQ = Q(iJ);
                i = 0;
            }
        }
        return prx.g(bArrQ, i, iJ);
    }

    @Override // defpackage.poh
    public final void z(int i) throws ppp {
        if (this.j != i) {
            throw ppp.b();
        }
    }
}
