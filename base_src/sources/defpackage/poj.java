package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class poj extends pom {
    final byte[] a;
    final int b;
    int c;
    int d;
    private final OutputStream g;

    public poj(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.a = bArr;
        this.b = bArr.length;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.g = outputStream;
    }

    private final void aC() throws IOException {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    private final void aD(int i) throws IOException {
        if (this.b - this.c < i) {
            aC();
        }
    }

    @Override // defpackage.pom
    public final void A(int i, int i2) throws IOException {
        C(psa.c(i, i2));
    }

    @Override // defpackage.pom
    public final void B(int i, int i2) throws IOException {
        aD(20);
        f(i, 0);
        g(i2);
    }

    @Override // defpackage.pom
    public final void C(int i) throws IOException {
        aD(5);
        g(i);
    }

    @Override // defpackage.pom
    public final void D(int i, long j) throws IOException {
        aD(20);
        f(i, 0);
        h(j);
    }

    @Override // defpackage.pom
    public final void E(long j) throws IOException {
        aD(10);
        h(j);
    }

    @Override // defpackage.pom
    public final void F(byte[] bArr, int i) throws IOException {
        C(i);
        k(bArr, 0, i);
    }

    @Override // defpackage.pom, defpackage.pnv
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        k(bArr, i, i2);
    }

    @Override // defpackage.pom
    public final int b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void c(byte b) {
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b;
        this.d++;
    }

    final void d(int i) {
        byte[] bArr = this.a;
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.c = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.c = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.c = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.d += 4;
    }

    final void e(long j) {
        byte[] bArr = this.a;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        this.c = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        this.c = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        this.c = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        this.c = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.c = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.c = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.c = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.d += 8;
    }

    final void f(int i, int i2) {
        g(psa.c(i, i2));
    }

    final void g(int i) {
        if (!pom.e) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                this.d++;
                i >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            bArr2[i3] = (byte) i;
            this.d++;
            return;
        }
        long j = this.c;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.a;
            int i4 = this.c;
            this.c = i4 + 1;
            prv.n(bArr3, i4, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i5 = this.c;
        this.c = i5 + 1;
        prv.n(bArr4, i5, (byte) i);
        this.d += (int) (((long) this.c) - j);
    }

    final void h(long j) {
        if (!pom.e) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.a;
                int i = this.c;
                this.c = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                this.d++;
                j >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            bArr2[i2] = (byte) j;
            this.d++;
            return;
        }
        long j2 = this.c;
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            prv.n(bArr3, i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i4 = this.c;
        this.c = i4 + 1;
        prv.n(bArr4, i4, (byte) j);
        this.d += (int) (((long) this.c) - j2);
    }

    @Override // defpackage.pom
    public final void i() throws IOException {
        if (this.c > 0) {
            aC();
        }
    }

    @Override // defpackage.pom
    public final void j(byte b) throws IOException {
        if (this.c == this.b) {
            aC();
        }
        c(b);
    }

    public final void k(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, this.a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.b;
        this.d += i5;
        aC();
        if (i7 <= this.b) {
            System.arraycopy(bArr, i6, this.a, 0, i7);
            this.c = i7;
        } else {
            this.g.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    @Override // defpackage.pom
    public final void l(int i, boolean z) throws IOException {
        aD(11);
        f(i, 0);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.pom
    public final void m(int i, poc pocVar) throws IOException {
        A(i, 2);
        n(pocVar);
    }

    @Override // defpackage.pom
    public final void n(poc pocVar) throws IOException {
        C(pocVar.d());
        pocVar.o(this);
    }

    @Override // defpackage.pom
    public final void o(int i, int i2) throws IOException {
        aD(14);
        f(i, 5);
        d(i2);
    }

    @Override // defpackage.pom
    public final void p(int i) throws IOException {
        aD(4);
        d(i);
    }

    @Override // defpackage.pom
    public final void q(int i, long j) throws IOException {
        aD(18);
        f(i, 1);
        e(j);
    }

    @Override // defpackage.pom
    public final void r(long j) throws IOException {
        aD(8);
        e(j);
    }

    @Override // defpackage.pom
    public final void s(int i, int i2) throws IOException {
        aD(20);
        f(i, 0);
        if (i2 >= 0) {
            g(i2);
        } else {
            h(i2);
        }
    }

    @Override // defpackage.pom
    public final void t(int i) throws IOException {
        if (i >= 0) {
            C(i);
        } else {
            E(i);
        }
    }

    @Override // defpackage.pom
    public final void u(int i, pqm pqmVar, prb prbVar) throws IOException {
        A(i, 2);
        pnm pnmVar = (pnm) pqmVar;
        int iC = pnmVar.c();
        if (iC == -1) {
            iC = prbVar.a(pnmVar);
            pnmVar.e(iC);
        }
        C(iC);
        prbVar.l(pqmVar, this.f);
    }

    @Override // defpackage.pom
    public final void v(pqm pqmVar) throws IOException {
        C(pqmVar.k());
        pqmVar.fD(this);
    }

    @Override // defpackage.pom
    public final void w(int i, pqm pqmVar) throws IOException {
        A(1, 3);
        B(2, i);
        A(3, 2);
        v(pqmVar);
        A(1, 4);
    }

    @Override // defpackage.pom
    public final void x(int i, poc pocVar) throws IOException {
        A(1, 3);
        B(2, i);
        m(3, pocVar);
        A(1, 4);
    }

    @Override // defpackage.pom
    public final void y(int i, String str) throws IOException {
        A(i, 2);
        z(str);
    }

    @Override // defpackage.pom
    public final void z(String str) throws IOException {
        int iB;
        try {
            int length = str.length() * 3;
            int iAd = ad(length);
            int i = iAd + length;
            int i2 = this.b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iA = prx.a(str, bArr, 0, length);
                C(iA);
                k(bArr, 0, iA);
                return;
            }
            if (i > i2 - this.c) {
                aC();
            }
            int iAd2 = ad(str.length());
            int i3 = this.c;
            try {
                if (iAd2 == iAd) {
                    int i4 = i3 + iAd2;
                    this.c = i4;
                    int iA2 = prx.a(str, this.a, i4, this.b - i4);
                    this.c = i3;
                    iB = (iA2 - i3) - iAd2;
                    g(iB);
                    this.c = iA2;
                } else {
                    iB = prx.b(str);
                    g(iB);
                    this.c = prx.a(str, this.a, this.c, iB);
                }
                this.d += iB;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new pol(e);
            } catch (prw e2) {
                this.d -= this.c - i3;
                this.c = i3;
                throw e2;
            }
        } catch (prw e3) {
            al(str, e3);
        }
    }
}
