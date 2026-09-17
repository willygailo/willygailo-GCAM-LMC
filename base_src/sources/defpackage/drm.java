package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class drm extends mip {
    final /* synthetic */ lmr a;
    final /* synthetic */ drs b;

    public drm(lmr lmrVar, drs drsVar) {
        this.a = lmrVar;
        this.b = drsVar;
    }

    @Override // defpackage.mip
    public final void fG(lzv lzvVar) {
        lmw lmwVarB = this.a.b();
        if (lmwVarB == null || lzvVar == null) {
            return;
        }
        this.b.a(lmwVarB.b, lzvVar);
    }
}
