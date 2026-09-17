package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iyf extends iwn implements ihv {
    private final ihu a;
    private final ihw b;

    public iyf(ixj ixjVar, iwt iwtVar, crs crsVar) {
        ihw ihwVar = new ihw(new izm(1), ixjVar, iwtVar, crsVar);
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

    @Override // defpackage.iwn, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.iwn, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.iwn, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
