package defpackage;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pom extends pnv {
    private static final Logger a = Logger.getLogger(pom.class.getName());
    public static final boolean e = prv.b;
    pon f;

    public static int G(byte[] bArr) {
        return R(bArr.length);
    }

    public static int H(int i, poc pocVar) {
        return ab(i) + I(pocVar);
    }

    public static int I(poc pocVar) {
        return R(pocVar.d());
    }

    public static int J(int i, int i2) {
        return ab(i) + N(i2);
    }

    @Deprecated
    static int K(int i, pqm pqmVar, prb prbVar) {
        int iAb = ab(i);
        int i2 = iAb + iAb;
        pnm pnmVar = (pnm) pqmVar;
        int iC = pnmVar.c();
        if (iC == -1) {
            iC = prbVar.a(pnmVar);
            pnmVar.e(iC);
        }
        return i2 + iC;
    }

    @Deprecated
    public static int L(pqm pqmVar) {
        return pqmVar.k();
    }

    public static int M(int i, int i2) {
        return ab(i) + N(i2);
    }

    public static int N(int i) {
        if (i >= 0) {
            return ad(i);
        }
        return 10;
    }

    public static int O(int i, long j) {
        return ab(i) + af(j);
    }

    public static int P(int i, ppv ppvVar) {
        return ab(i) + Q(ppvVar);
    }

    public static int Q(ppv ppvVar) {
        int iK;
        if (ppvVar.b != null) {
            iK = ppvVar.b.d();
        } else {
            iK = ppvVar.a != null ? ppvVar.a.k() : 0;
        }
        return R(iK);
    }

    public static int R(int i) {
        return ad(i) + i;
    }

    public static int S(pqm pqmVar) {
        return R(pqmVar.k());
    }

    static int T(pqm pqmVar, prb prbVar) {
        pnm pnmVar = (pnm) pqmVar;
        int iC = pnmVar.c();
        if (iC == -1) {
            iC = prbVar.a(pnmVar);
            pnmVar.e(iC);
        }
        return R(iC);
    }

    public static int U(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int V(int i, int i2) {
        return ab(i) + W(i2);
    }

    public static int W(int i) {
        return ad(ag(i));
    }

    public static int X(int i, long j) {
        return ab(i) + Y(j);
    }

    public static int Y(long j) {
        return af(ah(j));
    }

    public static int Z(int i, String str) {
        return ab(i) + aa(str);
    }

    public static int aA(int i) {
        return ab(i) + 4;
    }

    public static int aB(int i) {
        return ab(i) + 8;
    }

    public static int aa(String str) {
        int length;
        try {
            length = prx.b(str);
        } catch (prw e2) {
            length = str.getBytes(ppn.a).length;
        }
        return R(length);
    }

    public static int ab(int i) {
        return ad(psa.c(i, 0));
    }

    public static int ac(int i, int i2) {
        return ab(i) + ad(i2);
    }

    public static int ad(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int ae(int i, long j) {
        return ab(i) + af(j);
    }

    public static int af(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int ag(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long ah(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static pom ai(byte[] bArr) {
        return new pok(bArr, bArr.length);
    }

    public static pom aj(OutputStream outputStream, int i) {
        return new poj(outputStream, i);
    }

    public static int av(int i) {
        return ab(i) + 1;
    }

    public static int aw(int i) {
        return ab(i) + 8;
    }

    public static int ax(int i) {
        return ab(i) + 4;
    }

    public static int ay(int i) {
        return ab(i) + 8;
    }

    public static int az(int i) {
        return ab(i) + 4;
    }

    public abstract void A(int i, int i2);

    public abstract void B(int i, int i2);

    public abstract void C(int i);

    public abstract void D(int i, long j);

    public abstract void E(long j);

    public abstract void F(byte[] bArr, int i);

    @Override // defpackage.pnv
    public abstract void a(byte[] bArr, int i, int i2);

    public final void ak() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void al(String str, prw prwVar) throws pol {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) prwVar);
        byte[] bytes = str.getBytes(ppn.a);
        try {
            int length = bytes.length;
            C(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new pol(e2);
        } catch (pol e3) {
            throw e3;
        }
    }

    public final void am(int i, double d) {
        q(i, Double.doubleToRawLongBits(d));
    }

    public final void an(double d) {
        r(Double.doubleToRawLongBits(d));
    }

    public final void ao(int i, float f) {
        o(i, Float.floatToRawIntBits(f));
    }

    public final void ap(float f) {
        p(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void aq(pqm pqmVar) {
        pqmVar.fD(this);
    }

    public final void ar(int i, int i2) {
        B(i, ag(i2));
    }

    public final void as(int i) {
        C(ag(i));
    }

    public final void at(int i, long j) {
        D(i, ah(j));
    }

    public final void au(long j) {
        E(ah(j));
    }

    public abstract int b();

    public abstract void i();

    public abstract void j(byte b);

    public abstract void l(int i, boolean z);

    public abstract void m(int i, poc pocVar);

    public abstract void n(poc pocVar);

    public abstract void o(int i, int i2);

    public abstract void p(int i);

    public abstract void q(int i, long j);

    public abstract void r(long j);

    public abstract void s(int i, int i2);

    public abstract void t(int i);

    public abstract void u(int i, pqm pqmVar, prb prbVar);

    public abstract void v(pqm pqmVar);

    public abstract void w(int i, pqm pqmVar);

    public abstract void x(int i, poc pocVar);

    public abstract void y(int i, String str);

    public abstract void z(String str);
}
