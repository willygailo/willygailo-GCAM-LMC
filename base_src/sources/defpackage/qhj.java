package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qhj extends AtomicReference implements qbv, qbz {
    private static final long serialVersionUID = 3258103020495908596L;
    final qbv a;
    final qco b;

    public qhj(qbv qbvVar, qco qcoVar) {
        this.a = qbvVar;
        this.b = qcoVar;
    }

    @Override // defpackage.qbv
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.qbv
    public final void d(Object obj) {
        try {
            qbw qbwVar = (qbw) this.b.a(obj);
            qmd.W(qbwVar, "The single returned by the mapper is null");
            if (qcr.c((qbz) get())) {
                return;
            }
            qbwVar.n(new qhi(this, this.a, 0));
        } catch (Throwable th) {
            qmd.Y(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.qbv
    public final void gR(qbz qbzVar) {
        if (qcr.e(this, qbzVar)) {
            this.a.gR(this);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        qcr.g(this);
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
