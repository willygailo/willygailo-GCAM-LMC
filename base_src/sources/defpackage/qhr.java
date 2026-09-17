package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qhr implements qbv {
    final /* synthetic */ qhs a;
    private final qbv b;

    public qhr(qhs qhsVar, qbv qbvVar) {
        this.a = qhsVar;
        this.b = qbvVar;
    }

    @Override // defpackage.qbv
    public final void b(Throwable th) {
        try {
            this.b.d(this.a.b.a(th));
        } catch (Throwable th2) {
            qmd.Y(th2);
            this.b.b(new qcg(th, th2));
        }
    }

    @Override // defpackage.qbv
    public final void d(Object obj) {
        this.b.d(obj);
    }

    @Override // defpackage.qbv
    public final void gR(qbz qbzVar) {
        this.b.gR(qbzVar);
    }
}
