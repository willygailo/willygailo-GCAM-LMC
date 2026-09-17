package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nun {
    public static final nun a = new nun();

    private nun() {
    }

    public static final double a(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d > 0.99d) {
            return 0.99d;
        }
        return d;
    }

    public static final double b(long j) {
        double d = j;
        if (d < 0.1d) {
            return 0.1d;
        }
        return d;
    }

    public static final double c(nqh nqhVar, npe npeVar, long j) {
        return e(nqhVar, j, new nul(npeVar));
    }

    public static final double d(nqh nqhVar, List list, long j) {
        return e(nqhVar, j, new num(list));
    }

    private static final double e(nqh nqhVar, long j, qmu qmuVar) {
        double dB = b(nqhVar.f);
        double d = nqhVar.r.f * dB;
        double dDoubleValue = d - ((Number) qmuVar.a(Double.valueOf(d))).doubleValue();
        double d2 = j;
        Double.isNaN(d2);
        return a((dDoubleValue + d2) / dB);
    }
}
