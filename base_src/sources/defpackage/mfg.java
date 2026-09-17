package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
final class mfg {
    private final Deque a = new ArrayDeque();
    private double b;
    private double c;
    private double d;
    private double e;
    private mff f;
    private mff g;

    final synchronized void a(double d) {
        mff mffVar = this.f;
        if (mffVar != null && d > this.d) {
            mffVar.a(d);
        }
        Double d2 = (Double) this.a.peekLast();
        if (d2 != null) {
            double dAbs = Math.abs(d - d2.doubleValue()) / d2.doubleValue();
            mff mffVar2 = this.g;
            if (mffVar2 != null && dAbs > this.e) {
                mffVar2.a(dAbs);
            }
        }
        if (this.a.size() > 120) {
            double dDoubleValue = ((Double) this.a.remove()).doubleValue();
            this.b -= dDoubleValue;
            this.c -= dDoubleValue * dDoubleValue;
        }
        this.b += d;
        this.c += d * d;
        this.a.add(Double.valueOf(d));
    }

    final synchronized void b(double d, mff mffVar) {
        this.d = d;
        this.f = mffVar;
    }

    final synchronized void c(mff mffVar) {
        this.e = 0.25d;
        this.g = mffVar;
    }
}
