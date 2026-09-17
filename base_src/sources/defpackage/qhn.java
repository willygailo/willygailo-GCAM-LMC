package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class qhn extends qbu {
    final Callable a;

    public qhn(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.qbu
    protected final void o(qbv qbvVar) {
        qbz qbzVarZ = qmd.Z();
        qbvVar.gR(qbzVarZ);
        if (qbzVarZ.gV()) {
            return;
        }
        try {
            Object objCall = this.a.call();
            qmd.W(objCall, "The callable returned a null value");
            if (qbzVarZ.gV()) {
                return;
            }
            qbvVar.d(objCall);
        } catch (Throwable th) {
            qmd.Y(th);
            if (qbzVarZ.gV()) {
                qmd.R(th);
            } else {
                qbvVar.b(th);
            }
        }
    }
}
