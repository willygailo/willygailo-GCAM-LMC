package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class qft extends qfo {
    final Callable b;

    public qft(qbp qbpVar, Callable callable) {
        super(qbpVar);
        this.b = callable;
    }

    @Override // defpackage.qbm
    protected final void g(qbq qbqVar) {
        try {
            this.a.f(new qfs(qbqVar, ((qcz) this.b).call()));
        } catch (Throwable th) {
            qmd.Y(th);
            qcs.g(th, qbqVar);
        }
    }
}
