package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class drq extends mip {
    final /* synthetic */ lmr a;
    final /* synthetic */ lnx b;
    final /* synthetic */ drr c;

    public drq(drr drrVar, lmr lmrVar, lnx lnxVar) {
        this.c = drrVar;
        this.a = lmrVar;
        this.b = lnxVar;
    }

    @Override // defpackage.mip
    public final void fx() {
        this.a.close();
    }

    @Override // defpackage.mip
    public final void fy() {
        try {
            lic licVarB = this.c.b.b();
            lzv lzvVarC = this.a.c();
            int i = licVarB.e;
            if (lzvVarC != null) {
                new hjz(lzvVarC, i, this.c.a);
                lmw lmwVarB = this.a.b();
                mad madVarD = this.a.d(this.b);
                if (lmwVarB != null && madVarD != null) {
                    try {
                        dsg dsgVar = this.c.c;
                        dsgVar.a.g(lmwVarB.b, dsgVar.b.a(madVarD));
                    } catch (Throwable th) {
                        try {
                            madVarD.close();
                        } catch (Throwable th2) {
                        }
                        throw th;
                    }
                }
                if (madVarD != null) {
                    madVarD.close();
                }
            }
            this.a.close();
        } catch (Throwable th3) {
            this.a.close();
            throw th3;
        }
    }
}
