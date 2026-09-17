package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class chh implements bpt {
    final /* synthetic */ bnh a;
    final /* synthetic */ chi b;

    public chh(chi chiVar, bnh bnhVar) {
        this.b = chiVar;
        this.a = bnhVar;
    }

    @Override // defpackage.bpt
    public final pht a() {
        return plk.V(new lce(this.a.a));
    }

    @Override // defpackage.bpt
    public final pht b() {
        return plk.V(aao.f());
    }

    @Override // defpackage.bpt
    public final pht c() {
        pih pihVar;
        synchronized (this.b) {
            pihVar = this.b.d;
            pihVar.getClass();
        }
        return pihVar;
    }

    @Override // defpackage.bpt
    public final void d() {
        this.b.b();
        chi chiVar = this.b;
        chiVar.b.d.fB(true);
        chiVar.a.j(aap.e());
    }

    @Override // defpackage.bpt
    public final void e() {
        this.b.d(false, true);
    }

    @Override // defpackage.bpt
    public final void f() {
        this.b.d(true, true);
    }

    @Override // defpackage.bpt
    public final void g() {
        this.b.d(true, false);
    }
}
