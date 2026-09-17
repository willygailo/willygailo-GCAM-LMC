package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class aiz implements qlk {
    public static final qli c = new qli();
    public final qlj a;
    public final AtomicInteger b;
    private final qrg d;

    public aiz(qrg qrgVar, qlj qljVar) {
        qrgVar.getClass();
        qljVar.getClass();
        this.d = qrgVar;
        this.a = qljVar;
        this.b = new AtomicInteger(0);
    }

    public final void a() {
        int iDecrementAndGet = this.b.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
        if (iDecrementAndGet == 0) {
            this.d.q(null);
        }
    }

    @Override // defpackage.qln
    public final Object fold(Object obj, qmy qmyVar) {
        return qmd.d(this, obj, qmyVar);
    }

    @Override // defpackage.qlk, defpackage.qln
    public final qlk get(qll qllVar) {
        return qmd.e(this, qllVar);
    }

    @Override // defpackage.qlk
    public final qll getKey() {
        return c;
    }

    @Override // defpackage.qln
    public final qln minusKey(qll qllVar) {
        return qmd.f(this, qllVar);
    }

    @Override // defpackage.qln
    public final qln plus(qln qlnVar) {
        return qmd.g(this, qlnVar);
    }
}
