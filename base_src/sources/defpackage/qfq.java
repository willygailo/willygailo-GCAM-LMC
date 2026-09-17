package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qfq extends AtomicInteger implements qbn {
    private static final long serialVersionUID = 4883307006032401862L;
    public final qbn a;
    final qjo b = new qjo();
    final qid c = new qid(16);
    volatile boolean d;

    public qfq(qbn qbnVar) {
        this.a = qbnVar;
    }

    @Override // defpackage.qbg
    public final void a() {
        if (this.a.gV() || this.d) {
            return;
        }
        this.d = true;
        if (getAndIncrement() == 0) {
            e();
        }
    }

    @Override // defpackage.qbg
    public final void b(Throwable th) {
        throw null;
    }

    @Override // defpackage.qbg
    public final void c(Object obj) {
        if (this.a.gV() || this.d) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            this.a.c(obj);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            qid qidVar = this.c;
            synchronized (qidVar) {
                qidVar.gU(obj);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void e() {
        qbn qbnVar = this.a;
        qid qidVar = this.c;
        qjo qjoVar = this.b;
        int iAddAndGet = 1;
        while (!qbnVar.gV()) {
            if (qjoVar.get() != null) {
                qidVar.c();
                qbnVar.b(qjq.b(qjoVar));
                return;
            }
            boolean z = this.d;
            Object objGS = qidVar.gS();
            if (z) {
                if (objGS == null) {
                    if (((qfp) qbnVar).gV()) {
                        return;
                    }
                    try {
                        ((qfp) qbnVar).a.gQ();
                        return;
                    } finally {
                        qcr.g((AtomicReference) qbnVar);
                    }
                }
            } else if (objGS == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            qbnVar.c(objGS);
        }
        qidVar.c();
    }

    @Override // defpackage.qbn, defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.a.toString();
    }
}
