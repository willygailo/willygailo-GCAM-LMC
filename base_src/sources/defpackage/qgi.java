package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qgi implements qbq, qbz {
    static final qgh[] a = new qgh[0];
    static final qgh[] b = new qgh[0];
    final AtomicReference c;
    final AtomicReference e = new AtomicReference();
    final AtomicReference d = new AtomicReference(a);

    public qgi(AtomicReference atomicReference) {
        this.c = atomicReference;
        new AtomicBoolean();
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        this.c.compareAndSet(this, null);
        qgh[] qghVarArr = (qgh[]) this.d.getAndSet(b);
        if (qghVarArr.length == 0) {
            qmd.R(th);
            return;
        }
        for (qgh qghVar : qghVarArr) {
            qghVar.a.b(th);
        }
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        for (qgh qghVar : (qgh[]) this.d.get()) {
            qghVar.a.e(obj);
        }
    }

    final void f(qgh qghVar) {
        qgh[] qghVarArr;
        qgh[] qghVarArr2;
        do {
            qghVarArr = (qgh[]) this.d.get();
            int length = qghVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (qghVarArr[i].equals(qghVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                qghVarArr2 = a;
            } else {
                qgh[] qghVarArr3 = new qgh[length - 1];
                System.arraycopy(qghVarArr, 0, qghVarArr3, 0, i);
                System.arraycopy(qghVarArr, i + 1, qghVarArr3, i, (length - i) - 1);
                qghVarArr2 = qghVarArr3;
            }
        } while (!this.d.compareAndSet(qghVarArr, qghVarArr2));
    }

    @Override // defpackage.qbq
    public final void gQ() {
        this.c.compareAndSet(this, null);
        for (qgh qghVar : (qgh[]) this.d.getAndSet(b)) {
            qghVar.a.gQ();
        }
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        qcr.e(this.e, qbzVar);
    }

    @Override // defpackage.qbz
    public final void gT() {
        AtomicReference atomicReference = this.d;
        qgh[] qghVarArr = b;
        if (((qgh[]) atomicReference.getAndSet(qghVarArr)) != qghVarArr) {
            this.c.compareAndSet(this, null);
            qcr.g(this.e);
        }
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
