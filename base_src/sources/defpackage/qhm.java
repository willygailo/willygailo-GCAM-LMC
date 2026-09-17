package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qhm extends qbd {
    final qbw a;
    final qco b;

    public qhm(qbw qbwVar, qco qcoVar) {
        this.a = qbwVar;
        this.b = qcoVar;
    }

    @Override // defpackage.qbd
    protected final void f(qbe qbeVar) {
        qhl qhlVar = new qhl(qbeVar, this.b);
        qbeVar.gR(qhlVar);
        this.a.n(qhlVar);
    }
}
