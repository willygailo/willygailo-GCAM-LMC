package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pok extends pom {
    private final byte[] a;
    private final int b;
    private int c;

    public pok(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.a = bArr;
        this.c = 0;
        this.b = i;
    }

    @Override // defpackage.pom
    public final void A(int i, int i2) throws pol {
        C(psa.c(i, i2));
    }

    @Override // defpackage.pom
    public final void B(int i, int i2) throws pol {
        A(i, 0);
        C(i2);
    }

    @Override // defpackage.pom
    public final void C(int i) throws pol {
        boolean z = pom.e;
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new pol(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
            }
        }
        byte[] bArr2 = this.a;
        int i3 = this.c;
        this.c = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // defpackage.pom
    public final void D(int i, long j) throws pol {
        A(i, 0);
        E(j);
    }

    @Override // defpackage.pom
    public final void E(long j) throws pol {
        if (pom.e && b() >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.a;
                int i = this.c;
                this.c = i + 1;
                prv.n(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            prv.n(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.a;
                int i3 = this.c;
                this.c = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new pol(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
            }
        }
        byte[] bArr4 = this.a;
        int i4 = this.c;
        this.c = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    @Override // defpackage.pom
    public final void F(byte[] bArr, int i) throws pol {
        C(i);
        c(bArr, 0, i);
    }

    @Override // defpackage.pom, defpackage.pnv
    public final void a(byte[] bArr, int i, int i2) throws pol {
        c(bArr, i, i2);
    }

    @Override // defpackage.pom
    public final int b() {
        return this.b - this.c;
    }

    public final void c(byte[] bArr, int i, int i2) throws pol {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new pol(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), Integer.valueOf(i2)), e);
        }
    }

    @Override // defpackage.pom
    public final void i() {
    }

    @Override // defpackage.pom
    public final void j(byte b) throws pol {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            this.c = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new pol(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.pom
    public final void l(int i, boolean z) throws pol {
        A(i, 0);
        j(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.pom
    public final void m(int i, poc pocVar) throws pol {
        A(i, 2);
        n(pocVar);
    }

    @Override // defpackage.pom
    public final void n(poc pocVar) throws pol {
        C(pocVar.d());
        pocVar.o(this);
    }

    @Override // defpackage.pom
    public final void o(int i, int i2) throws pol {
        A(i, 5);
        p(i2);
    }

    @Override // defpackage.pom
    public final void p(int i) throws pol {
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new pol(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.pom
    public final void q(int i, long j) throws pol {
        A(i, 1);
        r(j);
    }

    @Override // defpackage.pom
    public final void r(long j) throws pol {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            int i2 = i + 1;
            this.c = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.c = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.c = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.c = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e) {
            throw new pol(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.pom
    public final void s(int i, int i2) throws pol {
        A(i, 0);
        t(i2);
    }

    @Override // defpackage.pom
    public final void t(int i) throws pol {
        if (i >= 0) {
            C(i);
        } else {
            E(i);
        }
    }

    @Override // defpackage.pom
    public final void u(int i, pqm pqmVar, prb prbVar) throws pol {
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
    public final void v(pqm pqmVar) throws pol {
        C(pqmVar.k());
        pqmVar.fD(this);
    }

    @Override // defpackage.pom
    public final void w(int i, pqm pqmVar) throws pol {
        A(1, 3);
        B(2, i);
        A(3, 2);
        v(pqmVar);
        A(1, 4);
    }

    @Override // defpackage.pom
    public final void x(int i, poc pocVar) throws pol {
        A(1, 3);
        B(2, i);
        m(3, pocVar);
        A(1, 4);
    }

    @Override // defpackage.pom
    public final void y(int i, String str) throws pol {
        A(i, 2);
        z(str);
    }

    @Override // defpackage.pom
    public final void z(String str) throws pol {
        int i = this.c;
        try {
            int iAd = ad(str.length() * 3);
            int iAd2 = ad(str.length());
            if (iAd2 != iAd) {
                C(prx.b(str));
                this.c = prx.a(str, this.a, this.c, b());
                return;
            }
            int i2 = i + iAd2;
            this.c = i2;
            int iA = prx.a(str, this.a, i2, b());
            this.c = i;
            C((iA - i) - iAd2);
            this.c = iA;
        } catch (IndexOutOfBoundsException e) {
            throw new pol(e);
        } catch (prw e2) {
            this.c = i;
            al(str, e2);
        }
    }
}
