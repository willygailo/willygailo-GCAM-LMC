package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eud implements lij {
    public final /* synthetic */ eur a;
    private final /* synthetic */ int b;

    public /* synthetic */ eud(eur eurVar, int i) {
        this.b = i;
        this.a = eurVar;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        switch (this.b) {
            case 0:
                eur eurVar = this.a;
                if (((fxl) obj).c) {
                    btv btvVar = eurVar.n;
                    obr.ao(btvVar);
                    btvVar.h(eurVar.v == jrl.MORE_MODES);
                }
                break;
            default:
                eur eurVar2 = this.a;
                ghx ghxVar = ((cwi) obj).a;
                if (ghxVar.k() == lwd.BACK) {
                    eurVar2.b.resetCameraSwitch(false);
                } else {
                    eurVar2.b.resetCameraSwitch(true);
                }
                eurVar2.t.J(ghxVar);
                kbi kbiVar = (kbi) eurVar2.O;
                boolean z = (kbiVar.A == ghxVar.k() && kbiVar.P == ghxVar.b() && kbiVar.K == ghxVar.L()) ? false : true;
                kbiVar.A = ghxVar.k();
                kbiVar.K = ghxVar.L();
                if (z) {
                    if (kbiVar.c.k(ddl.V)) {
                        kbiVar.I.h();
                        kbiVar.g();
                    }
                    kbiVar.t(ghxVar.c());
                    if (kbiVar.c.k(ddl.X)) {
                        kbiVar.x.set(true);
                    } else {
                        kbiVar.n();
                        kbiVar.p(false);
                    }
                }
                if (eurVar2.S.g()) {
                    ((bys) eurVar2.S.c()).t(ghxVar);
                }
                break;
        }
    }
}
