package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qfr extends qbm {
    final qbo a;

    public qfr(qbo qboVar) {
        this.a = qboVar;
    }

    @Override // defpackage.qbm
    protected final void g(qbq qbqVar) {
        qfp qfpVar = new qfp(qbqVar);
        qbqVar.gR(qfpVar);
        try {
            this.a.a(qfpVar);
        } catch (Throwable th) {
            qmd.Y(th);
            qfpVar.b(th);
        }
    }
}
