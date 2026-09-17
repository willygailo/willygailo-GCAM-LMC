package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class qar implements qaq {
    public static final ngi a;
    public static final ngi b;
    public static final ngi c;

    static {
        ngn ngnVarE = new ngn("com.google.android.libraries.performance.primes").d().e();
        ngnVarE.b("45350020", false);
        ngnVarE.b("2", true);
        a = ngnVarE.b("3", false);
        b = ngnVarE.a("45357887", 1L);
        try {
            c = ngnVarE.c("19", (qyj) ppd.p(qyj.d, new byte[]{16, 0, 24, 2}), ngj.n);
        } catch (ppp e) {
            throw new AssertionError("Could not parse proto flag \"19\"");
        }
    }

    @Override // defpackage.qaq
    public final long a(Context context) {
        return ((Long) b.b(context)).longValue();
    }

    @Override // defpackage.qaq
    public final qyj b(Context context) {
        return (qyj) c.b(context);
    }

    @Override // defpackage.qaq
    public final boolean c(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }
}
