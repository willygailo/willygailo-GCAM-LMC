package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qhd extends AtomicReference implements qbe, qbz {
    private static final long serialVersionUID = -8565274649390031272L;
    final qbv a;
    final qbw b;

    public qhd(qbv qbvVar, qbw qbwVar) {
        this.a = qbvVar;
        this.b = qbwVar;
    }

    @Override // defpackage.qbe
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.qbe
    public final void e() {
        this.b.n(new qhi(this, this.a, 1));
    }

    @Override // defpackage.qbe
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
