package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qhf implements qbv {
    final qbv a;
    final /* synthetic */ qhg b;

    public qhf(qhg qhgVar, qbv qbvVar) {
        this.b = qhgVar;
        this.a = qbvVar;
    }

    @Override // defpackage.qbv
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.qbv
    public final void d(Object obj) {
        try {
            this.b.b.a(obj);
            this.a.d(obj);
        } catch (Throwable th) {
            qmd.Y(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.qbv
    public final void gR(qbz qbzVar) {
        this.a.gR(qbzVar);
    }
}
