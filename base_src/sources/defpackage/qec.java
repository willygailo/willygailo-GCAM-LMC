package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class qec extends AtomicInteger implements qbe {
    private static final long serialVersionUID = -8360547806504310570L;
    final qbe a;
    final AtomicBoolean b;
    final qby c;

    public qec(qbe qbeVar, AtomicBoolean atomicBoolean, qby qbyVar) {
        this.a = qbeVar;
        this.b = atomicBoolean;
        this.c = qbyVar;
        lazySet(3);
    }

    @Override // defpackage.qbe
    public final void b(Throwable th) {
        this.c.gT();
        if (this.b.compareAndSet(false, true)) {
            this.a.b(th);
        } else {
            qmd.R(th);
        }
    }

    @Override // defpackage.qbe
    public final void e() {
        if (decrementAndGet() == 0 && this.b.compareAndSet(false, true)) {
            this.a.e();
        }
    }

    @Override // defpackage.qbe
    public final void gR(qbz qbzVar) {
        this.c.b(qbzVar);
    }
}
