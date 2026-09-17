package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qdp extends AtomicReference implements qbe, qbz, qcn {
    private static final long serialVersionUID = -4361286194466301354L;
    final qcn a;
    final qcl b;

    public qdp(qcl qclVar) {
        this.a = this;
        this.b = qclVar;
    }

    public qdp(qcn qcnVar, qcl qclVar) {
        this.a = qcnVar;
        this.b = qclVar;
    }

    @Override // defpackage.qcn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        qmd.R(new qci((Throwable) obj));
    }

    @Override // defpackage.qbe
    public final void b(Throwable th) {
        try {
            this.a.a(th);
        } catch (Throwable th2) {
            qmd.Y(th2);
            qmd.R(th2);
        }
        lazySet(qcr.DISPOSED);
    }

    @Override // defpackage.qbe
    public final void e() {
        try {
            this.b.a();
        } catch (Throwable th) {
            qmd.Y(th);
            qmd.R(th);
        }
        lazySet(qcr.DISPOSED);
    }

    @Override // defpackage.qbe
    public final void gR(qbz qbzVar) {
        qcr.e(this, qbzVar);
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
