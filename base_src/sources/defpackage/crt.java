package defpackage;

/* JADX INFO: loaded from: classes.dex */
class crt extends csa {
    final /* synthetic */ crw b;

    public crt(crw crwVar) {
        this.b = crwVar;
    }

    @Override // defpackage.csa, defpackage.crx
    public void c() {
        crw crwVar = this.b;
        crwVar.h.b();
        crwVar.e.startVideoIntentRecording();
        crwVar.f.aa();
        crwVar.g.d(false);
        jxn.c();
    }

    @Override // defpackage.csa, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.i = this;
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
