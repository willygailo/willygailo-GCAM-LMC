package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qgo extends AtomicReference implements Runnable, qcn {
    private static final long serialVersionUID = -4552101107598366241L;
    final qgq a;
    qbz b;
    long c;
    boolean d;
    boolean e;

    public qgo(qgq qgqVar) {
        this.a = qgqVar;
    }

    @Override // defpackage.qcn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        qbz qbzVar = (qbz) obj;
        qcr.h(this, qbzVar);
        synchronized (this.a) {
            if (this.e) {
                ((qgn) this.a.a).b(qbzVar);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this);
    }
}
