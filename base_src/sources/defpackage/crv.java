package defpackage;

/* JADX INFO: loaded from: classes.dex */
class crv extends csa {
    final /* synthetic */ crw b;

    public crv(crw crwVar) {
        this.b = crwVar;
    }

    @Override // defpackage.csa, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.i = this;
    }

    @Override // defpackage.crx
    public final boolean fK() {
        return false;
    }

    @Override // defpackage.csa, defpackage.crx
    public void i() {
        crw crwVar = this.b;
        crwVar.h.d();
        crwVar.e.returnToVideoIntent();
        crwVar.f.z();
        crwVar.g.d(true);
        jxn.d();
    }

    @Override // defpackage.crx
    public final int j() {
        return 4;
    }
}
