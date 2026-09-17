package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qke extends qbu implements qbv {
    static final qkd[] a = new qkd[0];
    static final qkd[] b = new qkd[0];
    Object e;
    Throwable f;
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicReference c = new AtomicReference(a);

    @Override // defpackage.qbv
    public final void b(Throwable th) {
        qmd.W(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.d.compareAndSet(false, true)) {
            qmd.R(th);
            return;
        }
        this.f = th;
        for (qkd qkdVar : (qkd[]) this.c.getAndSet(b)) {
            qkdVar.a.b(th);
        }
    }

    @Override // defpackage.qbv
    public final void d(Object obj) {
        qmd.W(obj, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.e = obj;
            for (qkd qkdVar : (qkd[]) this.c.getAndSet(b)) {
                qkdVar.a.d(obj);
            }
        }
    }

    @Override // defpackage.qbv
    public final void gR(qbz qbzVar) {
        if (this.c.get() == b) {
            qbzVar.gT();
        }
    }

    @Override // defpackage.qbu
    protected final void o(qbv qbvVar) {
        qkd[] qkdVarArr;
        qkd[] qkdVarArr2;
        qkd qkdVar = new qkd(qbvVar, this);
        qbvVar.gR(qkdVar);
        do {
            qkdVarArr = (qkd[]) this.c.get();
            if (qkdVarArr == b) {
                Throwable th = this.f;
                if (th != null) {
                    qbvVar.b(th);
                    return;
                } else {
                    qbvVar.d(this.e);
                    return;
                }
            }
            int length = qkdVarArr.length;
            qkdVarArr2 = new qkd[length + 1];
            System.arraycopy(qkdVarArr, 0, qkdVarArr2, 0, length);
            qkdVarArr2[length] = qkdVar;
        } while (!this.c.compareAndSet(qkdVarArr, qkdVarArr2));
        if (qkdVar.get() == null) {
            p(qkdVar);
        }
    }

    final void p(qkd qkdVar) {
        qkd[] qkdVarArr;
        qkd[] qkdVarArr2;
        do {
            qkdVarArr = (qkd[]) this.c.get();
            int length = qkdVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (qkdVarArr[i] == qkdVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                qkdVarArr2 = a;
            } else {
                qkd[] qkdVarArr3 = new qkd[length - 1];
                System.arraycopy(qkdVarArr, 0, qkdVarArr3, 0, i);
                System.arraycopy(qkdVarArr, i + 1, qkdVarArr3, i, (length - i) - 1);
                qkdVarArr2 = qkdVarArr3;
            }
        } while (!this.c.compareAndSet(qkdVarArr, qkdVarArr2));
    }
}
