package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gwq implements bpt {
    final /* synthetic */ pih a;
    final /* synthetic */ bnh b;
    final /* synthetic */ gws c;

    public gwq(gws gwsVar, pih pihVar, bnh bnhVar) {
        this.c = gwsVar;
        this.a = pihVar;
        this.b = bnhVar;
    }

    @Override // defpackage.bpt
    public final pht a() {
        return plk.V(new lce(this.b.a));
    }

    @Override // defpackage.bpt
    public final pht b() {
        return plk.V(aao.f());
    }

    @Override // defpackage.bpt
    public final pht c() {
        return this.a;
    }

    @Override // defpackage.bpt
    public final void d() {
        gws gwsVar = this.c;
        gwsVar.a.a.fB(true);
        gwsVar.c.j(aap.e());
    }

    @Override // defpackage.bpt
    public final void e() {
        this.c.b(false, true);
    }

    @Override // defpackage.bpt
    public final void f() {
        this.c.b(true, true);
    }

    @Override // defpackage.bpt
    public final void g() {
        this.c.b(true, false);
    }
}
