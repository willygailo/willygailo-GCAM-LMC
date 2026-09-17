package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pq {
    protected final qc a;
    public int b = Integer.MIN_VALUE;
    final Rect c = new Rect();

    public pq(qc qcVar) {
        this.a = qcVar;
    }

    public static pq p(qc qcVar) {
        return new po(qcVar);
    }

    public static pq q(qc qcVar, int i) {
        switch (i) {
            case 0:
                return p(qcVar);
            default:
                return r(qcVar);
        }
    }

    public static pq r(qc qcVar) {
        return new pp(qcVar);
    }

    public abstract int a(View view);

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(View view);

    public abstract int m(View view);

    public abstract void n(int i);

    public final int o() {
        if (this.b == Integer.MIN_VALUE) {
            return 0;
        }
        return k() - this.b;
    }
}
