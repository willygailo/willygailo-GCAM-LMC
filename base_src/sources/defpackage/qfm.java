package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qfm extends AtomicReference implements qbq, qbv, qbz {
    private static final long serialVersionUID = -8948264376121066672L;
    final qbq a;
    final qco b;

    public qfm(qbq qbqVar, qco qcoVar) {
        this.a = qbqVar;
        this.b = qcoVar;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.qbv
    public final void d(Object obj) {
        try {
            qbp qbpVar = (qbp) this.b.a(obj);
            qmd.W(qbpVar, "The mapper returned a null Publisher");
            qbpVar.f(this);
        } catch (Throwable th) {
            qmd.Y(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.qbq
    public final void gQ() {
        this.a.gQ();
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        qcr.h(this, qbzVar);
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
