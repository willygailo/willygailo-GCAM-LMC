package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ckf implements lyy {
    final /* synthetic */ ckg a;

    public ckf(ckg ckgVar) {
        this.a = ckgVar;
    }

    @Override // defpackage.lyy
    public final void h(lic licVar) {
        Integer numB = this.a.b(licVar);
        synchronized (this.a.d) {
            ckg ckgVar = this.a;
            if (!ckgVar.e) {
                ckgVar.b.fB(numB);
            }
            this.a.c.fB(lic.b(numB.intValue()));
        }
    }
}
