package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qfk implements qbk, qbz {
    final qbv a;
    final Object b;
    qbz c;

    public qfk(qbv qbvVar, Object obj) {
        this.a = qbvVar;
        this.b = obj;
    }

    @Override // defpackage.qbk
    public final void a() {
        this.c = qcr.DISPOSED;
        this.a.d(this.b);
    }

    @Override // defpackage.qbk
    public final void b(Throwable th) {
        this.c = qcr.DISPOSED;
        this.a.b(th);
    }

    @Override // defpackage.qbk
    public final void c(qbz qbzVar) {
        if (qcr.f(this.c, qbzVar)) {
            this.c = qbzVar;
            this.a.gR(this);
        }
    }

    @Override // defpackage.qbk
    public final void d(Object obj) {
        this.c = qcr.DISPOSED;
        this.a.d(obj);
    }

    @Override // defpackage.qbz
    public final void gT() {
        this.c.gT();
        this.c = qcr.DISPOSED;
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
