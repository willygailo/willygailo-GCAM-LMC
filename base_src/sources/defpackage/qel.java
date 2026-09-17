package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qel extends qjm implements qbi {
    private static final long serialVersionUID = 897683679971470653L;
    final qem a;
    long b;

    public qel(qem qemVar) {
        this.a = qemVar;
    }

    @Override // defpackage.qbi, defpackage.qym
    public final void a(qyn qynVar) {
        h(qynVar);
    }

    @Override // defpackage.qym
    public final void e(Object obj) {
        this.b++;
        this.a.i(obj);
    }

    @Override // defpackage.qym
    public final void gO() {
        long j = this.b;
        if (j != 0) {
            this.b = 0L;
            f(j);
        }
        this.a.c();
    }

    @Override // defpackage.qym
    public final void j(Throwable th) {
        long j = this.b;
        if (j != 0) {
            this.b = 0L;
            f(j);
        }
        this.a.h(th);
    }
}
