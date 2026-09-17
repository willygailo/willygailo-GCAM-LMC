package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class qba implements qaz {
    public static final ngi a;

    static {
        try {
            a = new ngn("com.google.android.libraries.performance.primes").d().e().c("10", (qyj) ppd.p(qyj.d, new byte[]{16, -24, 7, 24, 4}), ngj.q);
        } catch (ppp e) {
            throw new AssertionError("Could not parse proto flag \"10\"");
        }
    }

    @Override // defpackage.qaz
    public final qyj a(Context context) {
        return (qyj) a.b(context);
    }
}
