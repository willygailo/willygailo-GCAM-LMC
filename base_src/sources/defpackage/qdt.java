package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qdt extends AtomicReference implements qbe, qbz {
    private static final long serialVersionUID = -4101678820158072998L;
    final qbe a;
    final qbf b;

    public qdt(qbe qbeVar, qbf qbfVar) {
        this.a = qbeVar;
        this.b = qbfVar;
    }

    @Override // defpackage.qbe
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.qbe
    public final void e() {
        this.b.e(new qds(this, this.a));
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
