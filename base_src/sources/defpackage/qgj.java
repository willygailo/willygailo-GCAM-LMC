package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qgj implements qbp {
    private final AtomicReference a;

    public qgj(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.qbp
    public final void f(qbq qbqVar) {
        qgi qgiVar;
        qgh qghVar = new qgh(qbqVar);
        qbqVar.gR(qghVar);
        loop0: while (true) {
            qgiVar = (qgi) this.a.get();
            if (qgiVar == null || qgiVar.d.get() == qgi.b) {
                qgi qgiVar2 = new qgi(this.a);
                if (this.a.compareAndSet(qgiVar, qgiVar2)) {
                    qgiVar = qgiVar2;
                } else {
                    continue;
                }
            }
            while (true) {
                qgh[] qghVarArr = (qgh[]) qgiVar.d.get();
                if (qghVarArr == qgi.b) {
                    break;
                }
                int length = qghVarArr.length;
                qgh[] qghVarArr2 = new qgh[length + 1];
                System.arraycopy(qghVarArr, 0, qghVarArr2, 0, length);
                qghVarArr2[length] = qghVar;
                if (qgiVar.d.compareAndSet(qghVarArr, qghVarArr2)) {
                    break loop0;
                }
            }
        }
        if (qghVar.compareAndSet(null, qgiVar)) {
            return;
        }
        qgiVar.f(qghVar);
    }
}
