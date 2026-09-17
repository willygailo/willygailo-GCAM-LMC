package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qht extends AtomicReference implements Runnable, qbz {
    private static final long serialVersionUID = 8465401857522493082L;
    final qbv a;

    public qht(qbv qbvVar) {
        this.a = qbvVar;
    }

    @Override // defpackage.qbz
    public final void gT() {
        qcr.g(this);
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(0L);
    }
}
