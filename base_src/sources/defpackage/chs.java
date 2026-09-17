package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class chs implements bpt {
    final /* synthetic */ pih a;
    final /* synthetic */ chv b;

    public chs(chv chvVar, pih pihVar) {
        this.b = chvVar;
        this.a = pihVar;
    }

    @Override // defpackage.bpt
    public final pht a() {
        return this.a;
    }

    @Override // defpackage.bpt
    public final pht b() {
        pih pihVar = this.b.j;
        pihVar.getClass();
        return pihVar;
    }

    @Override // defpackage.bpt
    public final pht c() {
        pih pihVar = this.b.i;
        pihVar.getClass();
        return pihVar;
    }

    @Override // defpackage.bpt
    public final void d() {
        if (this.b.h.k(ddl.br)) {
            chv chvVar = this.b;
            chvVar.e.d.fB(true);
            chvVar.f.j(aap.e());
        } else {
            this.b.b();
            chv chvVar2 = this.b;
            chvVar2.e.d.fB(true);
            chvVar2.f.j(aap.f());
        }
    }

    @Override // defpackage.bpt
    public final void e() {
        this.b.d.a();
        this.b.f(true, false, true);
    }

    @Override // defpackage.bpt
    public final void f() {
        this.b.b();
        chv chvVar = this.b;
        chvVar.c();
        chvVar.d.a();
        chvVar.f(true, true, true);
    }

    @Override // defpackage.bpt
    public final void g() {
        this.b.b();
        this.b.c();
        this.b.f(true, true, false);
    }
}
