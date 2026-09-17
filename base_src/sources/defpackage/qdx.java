package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class qdx extends qbd {
    final Callable a;

    public qdx(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.qbd
    protected final void f(qbe qbeVar) {
        try {
            qbf qbfVar = (qbf) this.a.call();
            qmd.W(qbfVar, "The completableSupplier returned a null CompletableSource");
            qbfVar.e(qbeVar);
        } catch (Throwable th) {
            qmd.Y(th);
            qcs.f(th, qbeVar);
        }
    }
}
