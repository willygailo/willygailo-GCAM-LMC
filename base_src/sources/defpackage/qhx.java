package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class qhx extends AtomicInteger implements qbz {
    private static final long serialVersionUID = -5556924161382950569L;
    final qbv a;
    final qco b;
    final qhy[] c;
    final Object[] d;

    public qhx(qbv qbvVar, qco qcoVar) {
        super(2);
        this.a = qbvVar;
        this.b = qcoVar;
        qhy[] qhyVarArr = new qhy[2];
        for (int i = 0; i < 2; i++) {
            qhyVarArr[i] = new qhy(this, i);
        }
        this.c = qhyVarArr;
        this.d = new Object[2];
    }

    final void b(Throwable th, int i) {
        if (getAndSet(0) <= 0) {
            qmd.R(th);
            return;
        }
        qhy[] qhyVarArr = this.c;
        int length = qhyVarArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            qcr.g(qhyVarArr[i2]);
        }
        while (true) {
            i++;
            if (i >= 2) {
                this.a.b(th);
                return;
            }
            qcr.g(qhyVarArr[i]);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        if (getAndSet(0) > 0) {
            qhy[] qhyVarArr = this.c;
            int length = qhyVarArr.length;
            for (int i = 0; i < 2; i++) {
                qcr.g(qhyVarArr[i]);
            }
        }
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
