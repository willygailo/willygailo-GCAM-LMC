package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qhy extends AtomicReference implements qbv {
    private static final long serialVersionUID = 3323743579927613702L;
    final qhx a;
    final int b;

    public qhy(qhx qhxVar, int i) {
        this.a = qhxVar;
        this.b = i;
    }

    @Override // defpackage.qbv
    public final void b(Throwable th) {
        this.a.b(th, this.b);
    }

    @Override // defpackage.qbv
    public final void d(Object obj) {
        qhx qhxVar = this.a;
        qhxVar.d[this.b] = obj;
        if (qhxVar.decrementAndGet() == 0) {
            try {
                Object objA = qhxVar.b.a(qhxVar.d);
                qmd.W(objA, "The zipper returned a null value");
                qhxVar.a.d(objA);
            } catch (Throwable th) {
                qmd.Y(th);
                qhxVar.a.b(th);
            }
        }
    }

    @Override // defpackage.qbv
    public final void gR(qbz qbzVar) {
        qcr.e(this, qbzVar);
    }
}
