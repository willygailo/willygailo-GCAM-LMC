package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class pzw implements pzv {
    public static final ngi a;

    static {
        try {
            a = new ngn("com.google.android.libraries.performance.primes").d().e().c("16", (qyj) ppd.p(qyj.d, new byte[]{16, 0, 24, 2}), ngj.f);
        } catch (ppp e) {
            throw new AssertionError("Could not parse proto flag \"16\"");
        }
    }

    @Override // defpackage.pzv
    public final qyj a(Context context) {
        return (qyj) a.b(context);
    }
}
