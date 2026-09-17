package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qvx implements qbe {
    final /* synthetic */ qpn a;

    public qvx(qpn qpnVar) {
        this.a = qpnVar;
    }

    @Override // defpackage.qbe
    public final void b(Throwable th) {
        th.getClass();
        this.a.resumeWith(qmd.L(th));
    }

    @Override // defpackage.qbe
    public final void e() {
        this.a.resumeWith(qks.a);
    }

    @Override // defpackage.qbe
    public final void gR(qbz qbzVar) {
        qbzVar.getClass();
        qno.I(this.a, qbzVar);
    }
}
