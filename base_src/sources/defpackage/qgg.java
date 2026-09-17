package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qgg extends qfo {
    final qbt b;
    final int c;

    public qgg(qbp qbpVar, qbt qbtVar, int i) {
        super(qbpVar);
        this.b = qbtVar;
        this.c = i;
    }

    @Override // defpackage.qbm
    protected final void g(qbq qbqVar) {
        this.a.f(new qgf(qbqVar, this.b.a(), this.c));
    }
}
