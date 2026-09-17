package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qee implements qbe, qbz {
    final qbe a;
    qbz b;
    final /* synthetic */ qef c;

    public qee(qef qefVar, qbe qbeVar) {
        this.c = qefVar;
        this.a = qbeVar;
    }

    @Override // defpackage.qbe
    public final void b(Throwable th) {
        if (this.b == qcr.DISPOSED) {
            qmd.R(th);
            return;
        }
        try {
            this.c.b.a(th);
        } catch (Throwable th2) {
            qmd.Y(th2);
            th = new qcg(th, th2);
        }
        this.a.b(th);
    }

    @Override // defpackage.qbe
    public final void e() {
        if (this.b == qcr.DISPOSED) {
            return;
        }
        try {
            this.c.c.a();
            this.a.e();
        } catch (Throwable th) {
            qmd.Y(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.qbe
    public final void gR(qbz qbzVar) {
        if (qcr.f(this.b, qbzVar)) {
            this.b = qbzVar;
            this.a.gR(this);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        this.b.gT();
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
