package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class qed extends qbd {
    final qbf[] a;

    public qed(qbf[] qbfVarArr) {
        this.a = qbfVarArr;
    }

    @Override // defpackage.qbd
    public final void f(qbe qbeVar) {
        qby qbyVar = new qby();
        qec qecVar = new qec(qbeVar, new AtomicBoolean(), qbyVar);
        qbeVar.gR(qbyVar);
        qbf[] qbfVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            qbf qbfVar = qbfVarArr[i];
            if (qbyVar.b) {
                return;
            }
            if (qbfVar == null) {
                qbyVar.gT();
                qecVar.b(new NullPointerException("A completable source is null"));
                return;
            }
            qbfVar.e(qecVar);
        }
        qecVar.e();
    }
}
