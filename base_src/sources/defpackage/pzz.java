package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class pzz implements pzy {
    public static final ngi a;

    static {
        ngn ngnVarE = new ngn("com.google.android.libraries.performance.primes").d().e();
        try {
            a = ngnVarE.c("15", (qyj) ppd.p(qyj.d, new byte[]{16, 0, 24, 2}), ngj.h);
            try {
                ngnVarE.c("45357002", (myc) ppd.p(myc.a, new byte[]{8, 0, 18, 0, 24, 0, 32, 0, 40, 0, 48, 0, 56, 0, 64, 0}), ngj.g);
                try {
                    ngnVarE.c("45355611", (myc) ppd.p(myc.a, new byte[]{8, 0, 18, 0, 24, 0, 32, 0, 40, 0, 48, 0, 56, 0, 64, 0}), ngj.g);
                } catch (ppp e) {
                    throw new AssertionError("Could not parse proto flag \"45355611\"");
                }
            } catch (ppp e2) {
                throw new AssertionError("Could not parse proto flag \"45357002\"");
            }
        } catch (ppp e3) {
            throw new AssertionError("Could not parse proto flag \"15\"");
        }
    }

    @Override // defpackage.pzy
    public final qyj a(Context context) {
        return (qyj) a.b(context);
    }
}
