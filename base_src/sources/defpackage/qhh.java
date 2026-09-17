package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class qhh extends qbu {
    final Callable a;

    public qhh(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.qbu
    protected final void o(qbv qbvVar) {
        try {
            th = (Throwable) ((qdb) this.a).a;
        } catch (Throwable th) {
            th = th;
            qmd.Y(th);
        }
        qcs.h(th, qbvVar);
    }
}
