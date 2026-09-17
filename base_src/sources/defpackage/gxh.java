package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class gxh implements bpt {
    final /* synthetic */ pih a;
    final /* synthetic */ pih b;
    final /* synthetic */ pih c;
    final /* synthetic */ gxi d;

    public gxh(gxi gxiVar, pih pihVar, pih pihVar2, pih pihVar3) {
        this.d = gxiVar;
        this.a = pihVar;
        this.b = pihVar2;
        this.c = pihVar3;
    }

    @Override // defpackage.bpt
    public final pht a() {
        return this.c;
    }

    @Override // defpackage.bpt
    public final pht b() {
        return this.a;
    }

    @Override // defpackage.bpt
    public final pht c() {
        return this.b;
    }

    @Override // defpackage.bpt
    public final void d() {
        if (this.d.n.k(ddl.br)) {
            gxi gxiVar = this.d;
            gxiVar.d.a.fB(true);
            ((Executor) gxiVar.e.c()).execute(new gxc(gxiVar, 1));
        } else {
            ((Executor) this.d.e.c()).execute(new gxg(this, 1));
            gxi gxiVar2 = this.d;
            gxiVar2.d.a.fB(true);
            ((Executor) gxiVar2.e.c()).execute(new gxc(gxiVar2, 0));
        }
    }

    @Override // defpackage.bpt
    public final void e() {
        this.d.m.f();
        this.d.d.a();
        this.d.h(true, false, true);
    }

    @Override // defpackage.bpt
    public final void f() {
        ((Executor) this.d.e.c()).execute(new gxg(this, 0));
        this.d.m.f();
        this.d.c();
        this.d.d.a();
        this.d.h(true, true, true);
    }

    @Override // defpackage.bpt
    public final void g() {
        ((Executor) this.d.e.c()).execute(new gxg(this, 2));
        this.d.c();
        this.d.h(true, true, false);
    }
}
