package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qeu implements qbi, qbz {
    final qbv a;
    final Object b;
    qyn c;
    Object d;

    public qeu(qbv qbvVar, Object obj) {
        this.a = qbvVar;
        this.b = obj;
    }

    @Override // defpackage.qbi, defpackage.qym
    public final void a(qyn qynVar) {
        if (qjn.e(this.c, qynVar)) {
            this.c = qynVar;
            this.a.gR(this);
            qynVar.gP(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.qym
    public final void e(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.qym
    public final void gO() {
        this.c = qjn.CANCELLED;
        Object obj = this.d;
        if (obj != null) {
            this.d = null;
            this.a.d(obj);
        } else {
            this.a.d(this.b);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        this.c.g();
        this.c = qjn.CANCELLED;
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    @Override // defpackage.qym
    public final void j(Throwable th) {
        this.c = qjn.CANCELLED;
        this.d = null;
        this.a.b(th);
    }
}
