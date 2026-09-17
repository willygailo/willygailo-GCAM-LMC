package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ion extends mip {
    final /* synthetic */ lmr a;
    final /* synthetic */ lmv b;
    final /* synthetic */ ioq c;

    public ion(ioq ioqVar, lmr lmrVar, lmv lmvVar) {
        this.c = ioqVar;
        this.a = lmrVar;
        this.b = lmvVar;
    }

    @Override // defpackage.mip
    public final void fF() {
        this.a.close();
        lmu lmuVar = this.c.aa;
        if (lmuVar != null) {
            this.b.l(lmuVar);
            ioq ioqVar = this.c;
            ioqVar.aa = null;
            ioqVar.n.execute(new Runnable() { // from class: iom
                @Override // java.lang.Runnable
                public final void run() {
                    ion ionVar = this.a;
                    ipa ipaVar = ionVar.c.ag;
                    obr.ao(ipaVar);
                    ipf ipfVar = ipaVar.g;
                    ipfVar.q.c(new iot(ipfVar, 7));
                    inx inxVar = ionVar.c.u;
                    if (inxVar.n.G()) {
                        inxVar.f.g(inxVar.n.e(), inxVar.n.d(), inxVar.n.a());
                    }
                    inxVar.a.a();
                    inxVar.p.c(inxVar.g.a(inxVar, inxVar.n, inxVar.u.a, lcv.g(false), false));
                    ionVar.c.e.fB(true);
                }
            });
        }
    }
}
