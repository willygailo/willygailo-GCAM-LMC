package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qgn extends qjs {
    final qbp a;
    final AtomicReference b = new AtomicReference();

    public qgn(qbp qbpVar) {
        this.a = qbpVar;
    }

    public final void b(qbz qbzVar) {
        this.b.compareAndSet((qgm) qbzVar, null);
    }

    @Override // defpackage.qbm
    protected final void g(qbq qbqVar) {
        qgm qgmVar;
        qgl[] qglVarArr;
        qgl[] qglVarArr2;
        do {
            qgmVar = (qgm) this.b.get();
            if (qgmVar != null) {
                break;
            } else {
                qgmVar = new qgm(this.b);
            }
        } while (!this.b.compareAndSet(null, qgmVar));
        qgl qglVar = new qgl(qbqVar, qgmVar);
        qbqVar.gR(qglVar);
        do {
            qglVarArr = (qgl[]) qgmVar.get();
            if (qglVarArr == qgm.b) {
                Throwable th = qgmVar.f;
                if (th != null) {
                    qbqVar.b(th);
                    return;
                } else {
                    qbqVar.gQ();
                    return;
                }
            }
            int length = qglVarArr.length;
            qglVarArr2 = new qgl[length + 1];
            System.arraycopy(qglVarArr, 0, qglVarArr2, 0, length);
            qglVarArr2[length] = qglVar;
        } while (!qgmVar.compareAndSet(qglVarArr, qglVarArr2));
        if (qglVar.get() == null) {
            qgmVar.f(qglVar);
        }
    }
}
