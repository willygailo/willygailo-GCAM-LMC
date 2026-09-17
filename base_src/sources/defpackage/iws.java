package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class iws extends iwo {
    final /* synthetic */ iwt a;
    private lap b;

    public iws(iwt iwtVar) {
        this.a = iwtVar;
    }

    @Override // defpackage.iwo
    public void a() {
    }

    @Override // defpackage.iwo, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b = new lap();
        this.a.b.a();
        this.a.h.a.fB(false);
        ghx ghxVar = this.a.g;
        ghxVar.getClass();
        if (ghxVar.G()) {
            iwt iwtVar = this.a;
            iwtVar.c.g(iwtVar.g.e(), this.a.g.d(), this.a.g.a());
        }
    }

    @Override // defpackage.iwo, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.c.d();
        this.b.close();
        this.a.g = null;
    }
}
