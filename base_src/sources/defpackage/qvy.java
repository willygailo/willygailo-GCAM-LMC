package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qvy implements qbv {
    final /* synthetic */ qpn a;

    public qvy(qpn qpnVar) {
        this.a = qpnVar;
    }

    @Override // defpackage.qbv
    public final void b(Throwable th) {
        th.getClass();
        this.a.resumeWith(qmd.L(th));
    }

    @Override // defpackage.qbv
    public final void d(Object obj) {
        this.a.resumeWith(obj);
    }

    @Override // defpackage.qbv
    public final void gR(qbz qbzVar) {
        qbzVar.getClass();
        qno.I(this.a, qbzVar);
    }
}
