package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qrl extends qrk {
    private final qro a;
    private final qrm e;
    private final qpt f;
    private final Object g;

    public qrl(qro qroVar, qrm qrmVar, qpt qptVar, Object obj) {
        qrmVar.getClass();
        qptVar.getClass();
        this.a = qroVar;
        this.e = qrmVar;
        this.f = qptVar;
        this.g = obj;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return qks.a;
    }

    @Override // defpackage.qqa
    public final void b(Throwable th) {
        qro qroVar = this.a;
        qrm qrmVar = this.e;
        qpt qptVar = this.f;
        Object obj = this.g;
        boolean z = qql.a;
        qpt qptVarJ = qro.J(qptVar);
        if (qptVarJ == null || !qroVar.I(qrmVar, qptVarJ, obj)) {
            qroVar.j(qroVar.u(qrmVar, obj));
        }
    }
}
