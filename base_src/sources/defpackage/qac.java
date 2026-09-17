package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class qac implements qab {
    public static final ngi a;

    static {
        ngn ngnVarE = new ngn("com.google.android.libraries.performance.primes").d().e();
        try {
            ngnVarE.c("14", (qyj) ppd.p(qyj.d, new byte[]{16, 0, 24, 2}), ngj.i);
            a = ngnVarE.b("45350519", false);
            ngnVarE.b("37", true);
            ngnVarE.b("33", false);
        } catch (ppp e) {
            throw new AssertionError("Could not parse proto flag \"14\"");
        }
    }

    @Override // defpackage.qab
    public final boolean a(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }
}
