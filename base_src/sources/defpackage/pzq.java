package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class pzq implements pzp {
    public static final ngi a;
    public static final ngi b;
    public static final ngi c;

    static {
        ngn ngnVarE = new ngn("com.google.android.libraries.performance.primes").d().e();
        ngnVarE.f("24", "/primes/analytics");
        try {
            a = ngnVarE.c("45352879", (pyy) ppd.p(pyy.d, new byte[]{8, 0, 18, 62, 112, 114, 105, 109, 101, 115, 47, 102, 101, 100, 101, 114, 97, 116, 101, 100, 95, 113, 117, 101, 114, 121, 47, 37, 80, 65, 67, 75, 65, 71, 69, 95, 78, 65, 77, 69, 37, 47, 100, 105, 114, 101, 99, 116, 111, 114, 121, 95, 112, 97, 116, 104, 115, 47, 116, 101, 97, 109, 102, 111, 111, 100, 26, 33, 47, 112, 114, 105, 109, 101, 115, 47, 97, 110, 97, 108, 121, 116, 105, 99, 115, 95, 100, 105, 114, 101, 99, 116, 111, 114, 121, 95, 112, 97, 116, 104, 115}), ngj.d);
            try {
                b = ngnVarE.c("45352881", (pyy) ppd.p(pyy.d, new byte[]{8, 0, 18, 65, 112, 114, 105, 109, 101, 115, 47, 102, 101, 100, 101, 114, 97, 116, 101, 100, 95, 113, 117, 101, 114, 121, 47, 37, 80, 65, 67, 75, 65, 71, 69, 95, 78, 65, 77, 69, 37, 47, 101, 120, 99, 101, 112, 116, 105, 111, 110, 95, 109, 101, 115, 115, 97, 103, 101, 115, 47, 116, 101, 97, 109, 102, 111, 111, 100, 26, 36, 47, 112, 114, 105, 109, 101, 115, 47, 97, 110, 97, 108, 121, 116, 105, 99, 115, 95, 101, 120, 99, 101, 112, 116, 105, 111, 110, 95, 109, 101, 115, 115, 97, 103, 101, 115}), ngj.d);
                ngnVarE.f("30", "/primes/analytics_exception_message");
                ngnVarE.a("27", 346117902L);
                ngnVarE.f("32", "/primes/analytics_network");
                try {
                    c = ngnVarE.c("45352880", (pyy) ppd.p(pyy.d, new byte[]{8, 0, 18, 56, 112, 114, 105, 109, 101, 115, 47, 102, 101, 100, 101, 114, 97, 116, 101, 100, 95, 113, 117, 101, 114, 121, 47, 37, 80, 65, 67, 75, 65, 71, 69, 95, 78, 65, 77, 69, 37, 47, 114, 112, 99, 95, 112, 97, 116, 104, 115, 47, 116, 101, 97, 109, 102, 111, 111, 100, 26, 27, 47, 112, 114, 105, 109, 101, 115, 47, 97, 110, 97, 108, 121, 116, 105, 99, 115, 95, 114, 112, 99, 95, 112, 97, 116, 104, 115}), ngj.d);
                    ngnVarE.f("26", "primes/federated_query/teamfood");
                    ngnVarE.f("22", "allowlist_session");
                    ngnVarE.b("23", false);
                    ngnVarE.b("29", false);
                    ngnVarE.b("31", false);
                } catch (ppp e) {
                    throw new AssertionError("Could not parse proto flag \"45352880\"");
                }
            } catch (ppp e2) {
                throw new AssertionError("Could not parse proto flag \"45352881\"");
            }
        } catch (ppp e3) {
            throw new AssertionError("Could not parse proto flag \"45352879\"");
        }
    }

    @Override // defpackage.pzp
    public final pyy a(Context context) {
        return (pyy) a.b(context);
    }

    @Override // defpackage.pzp
    public final pyy b(Context context) {
        return (pyy) b.b(context);
    }

    @Override // defpackage.pzp
    public final pyy c(Context context) {
        return (pyy) c.b(context);
    }
}
