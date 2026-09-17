package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class qao implements qan {
    public static final ngi a;

    static {
        try {
            a = new ngn("com.google.android.libraries.performance.primes").d().e().c("12", (qyj) ppd.p(qyj.d, new byte[]{16, 0, 24, 2}), ngj.m);
        } catch (ppp e) {
            throw new AssertionError("Could not parse proto flag \"12\"");
        }
    }

    @Override // defpackage.qan
    public final qyj a(Context context) {
        return (qyj) a.b(context);
    }
}
