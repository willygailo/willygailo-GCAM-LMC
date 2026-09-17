package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class qfi extends qbj implements Callable {
    final Callable a;

    public qfi(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.qbj
    protected final void b(qbk qbkVar) {
        qbz qbzVarZ = qmd.Z();
        qbkVar.c(qbzVarZ);
        if (qbzVarZ.gV()) {
            return;
        }
        try {
            List listCall = ((nqa) this.a).call();
            if (qbzVarZ.gV()) {
                return;
            }
            qbkVar.d(listCall);
        } catch (Throwable th) {
            qmd.Y(th);
            if (qbzVarZ.gV()) {
                qmd.R(th);
            } else {
                qbkVar.b(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return ((nqa) this.a).call();
    }
}
