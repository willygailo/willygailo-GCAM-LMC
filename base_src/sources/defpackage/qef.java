package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qef extends qbd {
    final qbf a;
    final qcn b;
    final qcl c;

    public qef(qbf qbfVar, qcn qcnVar, qcl qclVar) {
        this.a = qbfVar;
        this.b = qcnVar;
        this.c = qclVar;
    }

    @Override // defpackage.qbd
    protected final void f(qbe qbeVar) {
        this.a.e(new qee(this, qbeVar));
    }
}
