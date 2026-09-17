package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class qhu extends qbu {
    final TimeUnit a;
    final qbt b;

    public qhu(TimeUnit timeUnit, qbt qbtVar) {
        this.a = timeUnit;
        this.b = qbtVar;
    }

    @Override // defpackage.qbu
    protected final void o(qbv qbvVar) {
        qht qhtVar = new qht(qbvVar);
        qbvVar.gR(qhtVar);
        qcr.h(qhtVar, this.b.c(qhtVar, 10L, this.a));
    }
}
