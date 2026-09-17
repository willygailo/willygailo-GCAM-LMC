package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qfn extends qbm {
    final qbw a;
    final qco b;

    public qfn(qbw qbwVar, qco qcoVar) {
        this.a = qbwVar;
        this.b = qcoVar;
    }

    @Override // defpackage.qbm
    protected final void g(qbq qbqVar) {
        qfm qfmVar = new qfm(qbqVar, this.b);
        qbqVar.gR(qfmVar);
        this.a.n(qfmVar);
    }
}
