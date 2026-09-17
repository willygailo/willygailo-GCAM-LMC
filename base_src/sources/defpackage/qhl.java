package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qhl extends AtomicReference implements qbv, qbe, qbz {
    private static final long serialVersionUID = -2177128922851101253L;
    final qbe a;
    final qco b;

    public qhl(qbe qbeVar, qco qcoVar) {
        this.a = qbeVar;
        this.b = qcoVar;
    }

    @Override // defpackage.qbv
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.qbv
    public final void d(Object obj) {
        try {
            qbf qbfVar = (qbf) this.b.a(obj);
            qmd.W(qbfVar, "The mapper returned a null CompletableSource");
            if (qcr.c((qbz) get())) {
                return;
            }
            qbfVar.e(this);
        } catch (Throwable th) {
            qmd.Y(th);
            b(th);
        }
    }

    @Override // defpackage.qbe
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.qbv
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
