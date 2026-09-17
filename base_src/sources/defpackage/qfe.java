package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class qfe extends qei {
    final qcm c;
    final Callable d;

    public qfe(qbh qbhVar, Callable callable, qcm qcmVar) {
        super(qbhVar);
        this.c = qcmVar;
        this.d = callable;
    }

    @Override // defpackage.qbh
    protected final void h(qym qymVar) {
        try {
            this.b.f(new qfd(qymVar, this.c, ((qdb) this.d).a, qbh.a));
        } catch (Throwable th) {
            qmd.Y(th);
            qjk.d(th, qymVar);
        }
    }
}
