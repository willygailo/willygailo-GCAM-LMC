package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gww implements bpt {
    final /* synthetic */ pih a;
    final /* synthetic */ bnh b;
    final /* synthetic */ gwx c;

    public gww(gwx gwxVar, pih pihVar, bnh bnhVar) {
        this.c = gwxVar;
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
        gwx gwxVar = this.c;
        gwxVar.c.a.fB(true);
        gwxVar.a.j(aap.e());
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
