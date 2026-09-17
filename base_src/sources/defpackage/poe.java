package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class poe extends poh {
    private final Iterable e;
    private final Iterator f;
    private ByteBuffer g;
    private int h;
    private int i;
    private int k;
    private long m;
    private long n;
    private long o;
    private int j = Integer.MAX_VALUE;
    private int l = 0;

    public poe(Iterable iterable, int i) {
        this.h = i;
        this.e = iterable;
        this.f = iterable.iterator();
        if (i != 0) {
            O();
            return;
        }
        this.g = ppn.c;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
    }

    private final int K() {
        return (int) ((((long) (this.h - this.l)) - this.m) + this.n);
    }

    private final long L() {
        return this.o - this.m;
    }

    private final void M() throws ppp {
        if (!this.f.hasNext()) {
            throw ppp.i();
        }
        O();
    }

    private final void N() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = this.j;
        if (i <= i2) {
            this.i = 0;
            return;
        }
        int i3 = i - i2;
        this.i = i3;
        this.h = i - i3;
    }

    private final void O() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f.next();
        this.g = byteBuffer;
        this.l += (int) (this.m - this.n);
        long jPosition = byteBuffer.position();
        this.m = jPosition;
        this.n = jPosition;
        this.o = this.g.limit();
        long jE = prv.e(this.g);
        this.m += jE;
        this.n += jE;
        this.o += jE;
    }

    private final void P(byte[] bArr, int i) throws ppp {
        if (i > K()) {
            if (i > 0) {
                throw ppp.i();
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (L() == 0) {
                M();
            }
            int iMin = Math.min(i2, (int) L());
            long j = iMin;
            prv.k(this.m, bArr, i - i2, j);
            i2 -= iMin;
            this.m += j;
        }
    }

    @Override // defpackage.poh
    public final void A(int i) {
        this.j = i;
        N();
    }

    public final void B(int i) throws ppp {
        if (i < 0 || i > (((long) (this.h - this.l)) - this.m) + this.n) {
            if (i >= 0) {
                throw ppp.i();
            }
            throw ppp.f();
        }
        while (i > 0) {
            if (L() == 0) {
                M();
            }
            int iMin = Math.min(i, (int) L());
            i -= iMin;
            this.m += (long) iMin;
        }
    }

    @Override // defpackage.poh
    public final boolean C() {
        return (((long) this.l) + this.m) - this.n == ((long) this.h);
    }

    @Override // defpackage.poh
    public final boolean D() {
        return r() != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.poh
    public final boolean E(int i) throws ppp {
        int iM;
        switch (psa.b(i)) {
            case 0:
                for (int i2 = 0; i2 < 10; i2++) {
                    if (a() >= 0) {
                        return true;
                    }
                }
                throw ppp.e();
            case 1:
                B(8);
                return true;
            case 2:
                B(j());
                return true;
            case 3:
                do {
                    iM = m();
                    if (iM != 0) {
                    }
                    z(psa.c(psa.a(i), 4));
                    return true;
                } while (E(iM));
                z(psa.c(psa.a(i), 4));
                return true;
            case 4:
                return false;
            case 5:
                B(4);
                return true;
            default:
                throw ppp.a();
        }
    }

    public final byte a() throws ppp {
        if (L() == 0) {
            M();
        }
        long j = this.m;
        this.m = 1 + j;
        return prv.a(j);
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
        return (int) ((((long) this.l) + this.m) - this.n);
    }

    @Override // defpackage.poh
    public final int e(int i) throws ppp {
        if (i < 0) {
            throw ppp.f();
        }
        int iD = i + d();
        int i2 = this.j;
        if (iD > i2) {
            throw ppp.i();
        }
        this.j = iD;
        N();
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

    public final int i() {
        if (L() < 4) {
            return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
        }
        long j = this.m;
        this.m = 4 + j;
        return ((prv.a(j + 3) & 255) << 24) | (prv.a(j) & 255) | ((prv.a(1 + j) & 255) << 8) | ((prv.a(2 + j) & 255) << 16);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008a A[PHI: r4
      0x008a: PHI (r4v4 long) = (r4v3 long), (r4v5 long), (r4v6 long) binds: [B:21:0x005f, B:25:0x006f, B:29:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (defpackage.prv.a(r4) >= 0) goto L34;
     */
    @Override // defpackage.poh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r10 = this;
            long r0 = r10.m
            long r2 = r10.o
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L8e
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = defpackage.prv.a(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.m
            long r4 = r4 + r2
            r10.m = r4
            return r0
        L1a:
            long r6 = r10.o
            long r8 = r10.m
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8e
            long r6 = r4 + r2
            byte r1 = defpackage.prv.a(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8b
        L33:
            long r4 = r6 + r2
            byte r1 = defpackage.prv.a(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            r6 = r4
            goto L8b
        L42:
            long r6 = r4 + r2
            byte r1 = defpackage.prv.a(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L8b
        L52:
            long r4 = r6 + r2
            byte r1 = defpackage.prv.a(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L8a
            long r6 = r4 + r2
            byte r1 = defpackage.prv.a(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = defpackage.prv.a(r6)
            if (r1 >= 0) goto L8a
            long r6 = r4 + r2
            byte r1 = defpackage.prv.a(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = defpackage.prv.a(r6)
            if (r1 >= 0) goto L8a
            long r6 = r4 + r2
            byte r1 = defpackage.prv.a(r4)
            if (r1 < 0) goto L8e
        L89:
            goto L8b
        L8a:
            r6 = r4
        L8b:
            r10.m = r6
            return r0
        L8e:
            long r0 = r10.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.poe.j():int");
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
            this.k = 0;
            return 0;
        }
        int iJ = j();
        this.k = iJ;
        if (psa.a(iJ) != 0) {
            return this.k;
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

    public final long q() {
        if (L() < 8) {
            return (((long) a()) & 255) | ((((long) a()) & 255) << 8) | ((((long) a()) & 255) << 16) | ((((long) a()) & 255) << 24) | ((((long) a()) & 255) << 32) | ((((long) a()) & 255) << 40) | ((((long) a()) & 255) << 48) | ((((long) a()) & 255) << 56);
        }
        long j = this.m;
        this.m = 8 + j;
        return ((((long) prv.a(j + 7)) & 255) << 56) | ((((long) prv.a(6 + j)) & 255) << 48) | ((((long) prv.a(4 + j)) & 255) << 32) | ((((long) prv.a(2 + j)) & 255) << 16) | (((long) prv.a(j)) & 255) | ((((long) prv.a(1 + j)) & 255) << 8) | ((((long) prv.a(3 + j)) & 255) << 24) | ((((long) prv.a(5 + j)) & 255) << 40);
    }

    public final long r() {
        long jA;
        long j = this.m;
        if (this.o != j) {
            long j2 = j + 1;
            byte bA = prv.a(j);
            if (bA >= 0) {
                this.m++;
                return bA;
            }
            if (this.o - this.m >= 10) {
                long j3 = j2 + 1;
                int iA = bA ^ (prv.a(j2) << 7);
                if (iA < 0) {
                    jA = iA ^ (-128);
                } else {
                    long j4 = j3 + 1;
                    int iA2 = iA ^ (prv.a(j3) << 14);
                    if (iA2 >= 0) {
                        jA = iA2 ^ 16256;
                        j3 = j4;
                    } else {
                        j3 = j4 + 1;
                        int iA3 = iA2 ^ (prv.a(j4) << 21);
                        if (iA3 < 0) {
                            jA = iA3 ^ (-2080896);
                        } else {
                            long j5 = j3 + 1;
                            long jA2 = ((long) iA3) ^ (((long) prv.a(j3)) << 28);
                            if (jA2 >= 0) {
                                jA = jA2 ^ 266354560;
                                j3 = j5;
                            } else {
                                long j6 = j5 + 1;
                                long jA3 = jA2 ^ (((long) prv.a(j5)) << 35);
                                if (jA3 < 0) {
                                    jA = jA3 ^ (-34093383808L);
                                    j3 = j6;
                                } else {
                                    long j7 = j6 + 1;
                                    long jA4 = jA3 ^ (((long) prv.a(j6)) << 42);
                                    if (jA4 >= 0) {
                                        jA = jA4 ^ 4363953127296L;
                                        j3 = j7;
                                    } else {
                                        long j8 = j7 + 1;
                                        long jA5 = jA4 ^ (((long) prv.a(j7)) << 49);
                                        if (jA5 < 0) {
                                            jA = jA5 ^ (-558586000294016L);
                                            j3 = j8;
                                        } else {
                                            long j9 = j8 + 1;
                                            jA = (jA5 ^ (((long) prv.a(j8)) << 56)) ^ 71499008037633920L;
                                            if (jA < 0) {
                                                long j10 = 1 + j9;
                                                if (prv.a(j9) >= 0) {
                                                    j3 = j10;
                                                }
                                            } else {
                                                j3 = j9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.m = j3;
                return jA;
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
            long j = iJ;
            long j2 = this.o;
            long j3 = this.m;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iJ];
                prv.k(j3, bArr, 0L, j);
                this.m += j;
                return poc.x(bArr);
            }
        }
        if (iJ > 0 && iJ <= K()) {
            byte[] bArr2 = new byte[iJ];
            P(bArr2, iJ);
            return poc.x(bArr2);
        }
        if (iJ == 0) {
            return poc.b;
        }
        if (iJ < 0) {
            throw ppp.f();
        }
        throw ppp.i();
    }

    @Override // defpackage.poh
    public final String x() throws ppp {
        int iJ = j();
        if (iJ > 0) {
            long j = iJ;
            long j2 = this.o;
            long j3 = this.m;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iJ];
                prv.k(j3, bArr, 0L, j);
                String str = new String(bArr, ppn.a);
                this.m += j;
                return str;
            }
        }
        if (iJ > 0 && iJ <= K()) {
            byte[] bArr2 = new byte[iJ];
            P(bArr2, iJ);
            return new String(bArr2, ppn.a);
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
            long j = iJ;
            long j2 = this.o;
            long j3 = this.m;
            if (j <= j2 - j3) {
                String strF = prx.f(this.g, (int) (j3 - this.n), iJ);
                this.m += j;
                return strF;
            }
        }
        if (iJ >= 0 && iJ <= K()) {
            byte[] bArr = new byte[iJ];
            P(bArr, iJ);
            return prx.g(bArr, 0, iJ);
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
        if (this.k != i) {
            throw ppp.b();
        }
    }
}
