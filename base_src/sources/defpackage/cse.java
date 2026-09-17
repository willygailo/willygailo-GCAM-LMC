package defpackage;

/* JADX INFO: loaded from: classes.dex */
class cse extends csa {
    final /* synthetic */ csg b;

    public cse(csg csgVar) {
        this.b = csgVar;
    }

    @Override // defpackage.csa, defpackage.crx
    public void c() {
        csg csgVar = this.b;
        csgVar.i.b();
        csgVar.e.startRecording();
        csgVar.h.v(false);
        csgVar.h.l(false);
        csgVar.f.Y();
        csgVar.g.d(false);
        if (csgVar.j.g()) {
            ((cuj) csgVar.j.c()).m();
        }
        jxn.c();
    }

    @Override // defpackage.csa, defpackage.ihs, defpackage.iht
    public final void f() {
        csg csgVar = this.b;
        csgVar.l = this;
        csgVar.k.ax = false;
    }

    @Override // defpackage.crx
    public final boolean fK() {
        return false;
    }

    @Override // defpackage.crx
    public final int j() {
        return 1;
    }
}
