package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qgm extends AtomicReference implements qbq, qbz {
    static final qgl[] a = new qgl[0];
    static final qgl[] b = new qgl[0];
    private static final long serialVersionUID = -3251430252873581268L;
    final AtomicReference d;
    Throwable f;
    final AtomicBoolean c = new AtomicBoolean();
    final AtomicReference e = new AtomicReference();

    public qgm(AtomicReference atomicReference) {
        this.d = atomicReference;
        lazySet(a);
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        this.f = th;
        this.e.lazySet(qcr.DISPOSED);
        for (qgl qglVar : (qgl[]) getAndSet(b)) {
            qglVar.a.b(th);
        }
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        for (qgl qglVar : (qgl[]) get()) {
            qglVar.a.e(obj);
        }
    }

    public final void f(qgl qglVar) {
        qgl[] qglVarArr;
        qgl[] qglVarArr2;
        do {
            qglVarArr = (qgl[]) get();
            int length = qglVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (qglVarArr[i] == qglVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            qglVarArr2 = a;
            if (length != 1) {
                qglVarArr2 = new qgl[length - 1];
                System.arraycopy(qglVarArr, 0, qglVarArr2, 0, i);
                System.arraycopy(qglVarArr, i + 1, qglVarArr2, i, (length - i) - 1);
            }
        } while (!compareAndSet(qglVarArr, qglVarArr2));
    }

    @Override // defpackage.qbq
    public final void gQ() {
        this.e.lazySet(qcr.DISPOSED);
        for (qgl qglVar : (qgl[]) getAndSet(b)) {
            qglVar.a.gQ();
        }
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        qcr.e(this.e, qbzVar);
    }

    @Override // defpackage.qbz
    public final void gT() {
        getAndSet(b);
        this.d.compareAndSet(this, null);
        qcr.g(this.e);
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
