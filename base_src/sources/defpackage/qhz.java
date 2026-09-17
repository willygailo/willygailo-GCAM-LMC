package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qhz extends qbu {
    final qbw[] a;
    final qco b;

    public qhz(qbw[] qbwVarArr, qco qcoVar) {
        this.a = qbwVarArr;
        this.b = qcoVar;
    }

    @Override // defpackage.qbu
    protected final void o(qbv qbvVar) {
        qbw[] qbwVarArr = this.a;
        qhx qhxVar = new qhx(qbvVar, this.b);
        qbvVar.gR(qhxVar);
        for (int i = 0; i < 2 && qhxVar.get() > 0; i++) {
            qbw qbwVar = qbwVarArr[i];
            if (qbwVar == null) {
                qhxVar.b(new NullPointerException("One of the sources is null"), i);
                return;
            }
            qbwVar.n(qhxVar.c[i]);
        }
    }
}
