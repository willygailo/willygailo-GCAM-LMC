package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class qaf implements qae {
    public static final ngi a;
    public static final ngi b;
    public static final ngi c;
    public static final ngi d;

    static {
        ngn ngnVarE = new ngn("com.google.android.libraries.performance.primes").d().e();
        a = ngnVarE.b("25", false);
        ngnVarE.b("34", false);
        ngnVarE.a("45351156", 10L);
        try {
            b = ngnVarE.c("40", (mzk) ppd.p(mzk.d, new byte[]{10, 45, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 112, 114, 105, 109, 101, 115, 45, 106, 97, 110, 107, 45, 37, 80, 65, 67, 75, 65, 71, 69, 95, 78, 65, 77, 69, 37, 18, 35, 8, 2, 18, 31, 74, 60, 37, 69, 86, 69, 78, 84, 95, 78, 65, 77, 69, 37, 62, 35, 109, 105, 115, 115, 101, 100, 65, 112, 112, 70, 114, 97, 109, 101, 115, 18, 31, 8, 3, 18, 27, 74, 60, 37, 69, 86, 69, 78, 84, 95, 78, 65, 77, 69, 37, 62, 35, 116, 111, 116, 97, 108, 70, 114, 97, 109, 101, 115, 18, 38, 8, 5, 18, 34, 74, 60, 37, 69, 86, 69, 78, 84, 95, 78, 65, 77, 69, 37, 62, 35, 109, 97, 120, 70, 114, 97, 109, 101, 84, 105, 109, 101, 77, 105, 108, 108, 105, 115}), ngj.j);
            try {
                c = ngnVarE.c("13", (qyj) ppd.p(qyj.d, new byte[]{16, 0, 24, 2}), ngj.k);
                ngnVarE.f("39", "com.google.android.primes-jank-%PACKAGE_NAME%");
                d = ngnVarE.b("45351799", false);
            } catch (ppp e) {
                throw new AssertionError("Could not parse proto flag \"13\"");
            }
        } catch (ppp e2) {
            throw new AssertionError("Could not parse proto flag \"40\"");
        }
    }

    @Override // defpackage.qae
    public final mzk a(Context context) {
        return (mzk) b.b(context);
    }

    @Override // defpackage.qae
    public final qyj b(Context context) {
        return (qyj) c.b(context);
    }

    @Override // defpackage.qae
    public final boolean c(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }

    @Override // defpackage.qae
    public final boolean d(Context context) {
        return ((Boolean) d.b(context)).booleanValue();
    }
}
