package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class qhc extends qbu {
    final Callable a;

    public qhc(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.qbu
    protected final void o(qbv qbvVar) {
        try {
            qbw qbwVar = (qbw) this.a.call();
            qmd.W(qbwVar, "The singleSupplier returned a null SingleSource");
            qbwVar.n(qbvVar);
        } catch (Throwable th) {
            qmd.Y(th);
            qcs.h(th, qbvVar);
        }
    }
}
