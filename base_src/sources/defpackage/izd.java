package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class izd extends izn implements ihv {
    private final ihu a;
    private final ihw b;

    public izd(izr izrVar, iwt iwtVar) {
        ihw ihwVar = new ihw(new izm(0), izrVar, iwtVar);
        this.b = ihwVar;
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
    }

    @Override // defpackage.izn, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.izn, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.izn, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
