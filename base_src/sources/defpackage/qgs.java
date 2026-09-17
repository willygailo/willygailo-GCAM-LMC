package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qgs implements qbq, qbz {
    final qbq a;
    long b = 1;
    qbz c;

    public qgs(qbq qbqVar) {
        this.a = qbqVar;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
        } else {
            this.a.e(obj);
        }
    }

    @Override // defpackage.qbq
    public final void gQ() {
        this.a.gQ();
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        if (qcr.f(this.c, qbzVar)) {
            this.c = qbzVar;
            this.a.gR(this);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        this.c.gT();
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
