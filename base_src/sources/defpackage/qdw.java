package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qdw extends qbd {
    final nrc a;

    public qdw(nrc nrcVar) {
        this.a = nrcVar;
    }

    @Override // defpackage.qbd
    protected final void f(qbe qbeVar) {
        qdv qdvVar = new qdv(qbeVar);
        qbeVar.gR(qdvVar);
        try {
            nrc nrcVar = this.a;
            nrcVar.a.a.a().g(nrcVar.a.a(), new nrb(qdvVar, nrcVar.a, nrcVar.b));
        } catch (Throwable th) {
            qmd.Y(th);
            qdvVar.b(th);
        }
    }
}
