package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qfh extends qbj {
    final nqy a;

    public qfh(nqy nqyVar) {
        this.a = nqyVar;
    }

    @Override // defpackage.qbj
    protected final void b(qbk qbkVar) {
        qfg qfgVar = new qfg(qbkVar);
        qbkVar.c(qfgVar);
        try {
            nqy nqyVar = this.a;
            ((kvk) nqyVar.a.invoke()).g(nqyVar.b.a(), new nqx(nqyVar.b, (nrl) nqyVar.c.invoke(), qfgVar));
        } catch (Throwable th) {
            qmd.Y(th);
            qfgVar.c(th);
        }
    }
}
