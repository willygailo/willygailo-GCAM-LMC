package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qer implements qbq, qyn {
    final qym a;
    qbz b;

    public qer(qym qymVar) {
        this.a = qymVar;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        this.a.j(th);
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.qyn
    public final void g() {
        this.b.gT();
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
    }

    @Override // defpackage.qbq
    public final void gQ() {
        this.a.gO();
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        this.b = qbzVar;
        this.a.a(this);
    }
}
