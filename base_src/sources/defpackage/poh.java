package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class poh {
    public static final /* synthetic */ int d = 0;
    private static volatile int e = 100;
    int a;
    final int b = e;
    poi c;

    public static int F(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long G(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static poh H(InputStream inputStream) {
        return inputStream == null ? I(ppn.b) : new pof(inputStream);
    }

    public static poh I(byte[] bArr) {
        return J(bArr, 0, bArr.length);
    }

    static poh J(byte[] bArr, int i, int i2) {
        pod podVar = new pod(bArr, i, i2);
        try {
            podVar.e(i2);
            return podVar;
        } catch (ppp e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract void A(int i);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int i);

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract poc w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
