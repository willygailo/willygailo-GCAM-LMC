package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qrj extends qro implements qrg {
    private final boolean a;

    public qrj() {
        C(null);
        qps qpsVarA = A();
        qpt qptVar = qpsVarA instanceof qpt ? (qpt) qpsVarA : null;
        boolean z = false;
        if (qptVar != null) {
            qro qroVarF = qptVar.f();
            while (!qroVarF.gX()) {
                qps qpsVarA2 = qroVarF.A();
                qpt qptVar2 = qpsVarA2 instanceof qpt ? (qpt) qpsVarA2 : null;
                if (qptVar2 != null) {
                    qroVarF = qptVar2.f();
                }
            }
            z = true;
        }
        this.a = z;
    }

    @Override // defpackage.qro
    public final boolean gX() {
        return this.a;
    }

    @Override // defpackage.qro
    public final boolean gY() {
        return true;
    }
}
