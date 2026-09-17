package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class inw implements bpt {
    final /* synthetic */ bnh a;
    final /* synthetic */ inx b;

    public inw(inx inxVar, bnh bnhVar) {
        this.b = inxVar;
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
        return this.b.t;
    }

    @Override // defpackage.bpt
    public final void d() {
        this.b.a.a.fB(true);
        this.b.o.j(aap.e());
        this.b.e.set(true);
        this.b.k.f(false);
    }

    @Override // defpackage.bpt
    public final void e() {
        this.b.b(false, true);
    }

    @Override // defpackage.bpt
    public final void f() {
        this.b.b(true, true);
    }

    @Override // defpackage.bpt
    public final void g() {
        this.b.b(true, false);
    }
}
