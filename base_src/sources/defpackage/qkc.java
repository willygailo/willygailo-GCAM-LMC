package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qkc extends qkf {
    static final qkb[] a = new qkb[0];
    static final qkb[] b = new qkb[0];
    final AtomicReference c = new AtomicReference(b);
    Throwable d;

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        qmd.W(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj == obj2) {
            qmd.R(th);
            return;
        }
        this.d = th;
        for (qkb qkbVar : (qkb[]) this.c.getAndSet(obj2)) {
            if (qkbVar.get()) {
                qmd.R(th);
            } else {
                qkbVar.a.b(th);
            }
        }
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        qmd.W(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (qkb qkbVar : (qkb[]) this.c.get()) {
            if (!qkbVar.get()) {
                qkbVar.a.e(obj);
            }
        }
    }

    @Override // defpackage.qbm
    protected final void g(qbq qbqVar) {
        qkb[] qkbVarArr;
        qkb[] qkbVarArr2;
        qkb qkbVar = new qkb(qbqVar, this);
        qbqVar.gR(qkbVar);
        do {
            qkbVarArr = (qkb[]) this.c.get();
            if (qkbVarArr == a) {
                Throwable th = this.d;
                if (th != null) {
                    qbqVar.b(th);
                    return;
                } else {
                    qbqVar.gQ();
                    return;
                }
            }
            int length = qkbVarArr.length;
            qkbVarArr2 = new qkb[length + 1];
            System.arraycopy(qkbVarArr, 0, qkbVarArr2, 0, length);
            qkbVarArr2[length] = qkbVar;
        } while (!this.c.compareAndSet(qkbVarArr, qkbVarArr2));
        if (qkbVar.get()) {
            k(qkbVar);
        }
    }

    @Override // defpackage.qbq
    public final void gQ() {
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj == obj2) {
            return;
        }
        for (qkb qkbVar : (qkb[]) this.c.getAndSet(obj2)) {
            if (!qkbVar.get()) {
                qkbVar.a.gQ();
            }
        }
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        if (this.c.get() == a) {
            qbzVar.gT();
        }
    }

    final void k(qkb qkbVar) {
        qkb[] qkbVarArr;
        qkb[] qkbVarArr2;
        do {
            qkbVarArr = (qkb[]) this.c.get();
            if (qkbVarArr == a || qkbVarArr == b) {
                return;
            }
            int length = qkbVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (qkbVarArr[i] == qkbVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                qkbVarArr2 = b;
            } else {
                qkb[] qkbVarArr3 = new qkb[length - 1];
                System.arraycopy(qkbVarArr, 0, qkbVarArr3, 0, i);
                System.arraycopy(qkbVarArr, i + 1, qkbVarArr3, i, (length - i) - 1);
                qkbVarArr2 = qkbVarArr3;
            }
        } while (!this.c.compareAndSet(qkbVarArr, qkbVarArr2));
    }
}
