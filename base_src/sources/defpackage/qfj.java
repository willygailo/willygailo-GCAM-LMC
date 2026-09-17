package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qfj implements qbk, qbz {
    final qbk a;
    final qco b;
    qbz c;

    public qfj(qbk qbkVar, qco qcoVar) {
        this.a = qbkVar;
        this.b = qcoVar;
    }

    @Override // defpackage.qbk
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.qbk
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.qbk
    public final void c(qbz qbzVar) {
        if (qcr.f(this.c, qbzVar)) {
            this.c = qbzVar;
            this.a.c(this);
        }
    }

    @Override // defpackage.qbk
    public final void d(Object obj) {
        try {
            this.a.d(this.b.a(obj));
        } catch (Throwable th) {
            qmd.Y(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        qbz qbzVar = this.c;
        this.c = qcr.DISPOSED;
        qbzVar.gT();
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
