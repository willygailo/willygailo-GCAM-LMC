package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class pob extends poa {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public pob(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.a = bArr;
    }

    @Override // defpackage.poc
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.poc
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.poc
    public int d() {
        return this.a.length;
    }

    @Override // defpackage.poc
    protected void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.poc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof poc) || d() != ((poc) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof pob)) {
            return obj.equals(this);
        }
        pob pobVar = (pob) obj;
        int i = this.c;
        int i2 = pobVar.c;
        if (i == 0 || i2 == 0 || i == i2) {
            return g(pobVar, 0, d());
        }
        return false;
    }

    @Override // defpackage.poa
    public final boolean g(poc pocVar, int i, int i2) {
        if (i2 > pocVar.d()) {
            int iD = d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(iD);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > pocVar.d()) {
            int iD2 = pocVar.d();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(iD2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(pocVar instanceof pob)) {
            return pocVar.k(i, i3).equals(k(0, i2));
        }
        pob pobVar = (pob) pocVar;
        byte[] bArr = this.a;
        byte[] bArr2 = pobVar.a;
        int iC = c() + i2;
        int iC2 = c();
        int iC3 = pobVar.c() + i;
        while (iC2 < iC) {
            if (bArr[iC2] != bArr2[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    @Override // defpackage.poc
    protected final int i(int i, int i2, int i3) {
        return ppn.d(i, this.a, c() + i2, i3);
    }

    @Override // defpackage.poc
    protected final int j(int i, int i2, int i3) {
        int iC = c() + i2;
        byte[] bArr = this.a;
        plk plkVar = prx.a;
        return plk.at(i, bArr, iC, i3 + iC);
    }

    @Override // defpackage.poc
    public final poc k(int i, int i2) {
        int iQ = q(i, i2, d());
        return iQ == 0 ? poc.b : new pny(this.a, c() + i, iQ);
    }

    @Override // defpackage.poc
    public final poh l() {
        return poh.J(this.a, c(), d());
    }

    @Override // defpackage.poc
    protected final String m(Charset charset) {
        return new String(this.a, c(), d(), charset);
    }

    @Override // defpackage.poc
    public final ByteBuffer n() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // defpackage.poc
    public final void o(pnv pnvVar) {
        pnvVar.a(this.a, c(), d());
    }

    @Override // defpackage.poc
    public final boolean p() {
        int iC = c();
        return prx.h(this.a, iC, d() + iC);
    }
}
