package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qdu extends qbd {
    final qbf a;
    final qbf b;

    public qdu(qbf qbfVar, qbf qbfVar2) {
        this.a = qbfVar;
        this.b = qbfVar2;
    }

    @Override // defpackage.qbd
    protected final void f(qbe qbeVar) {
        this.a.e(new qdt(qbeVar, this.b));
    }
}
