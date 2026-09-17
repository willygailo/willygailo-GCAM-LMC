package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ihw implements ihs, ihv {
    public final ihs a;
    private final ihs[] b;

    public ihw(ihs ihsVar, ihs... ihsVarArr) {
        this.a = ihsVar;
        this.b = ihsVarArr;
    }

    @Override // defpackage.ihv
    public final void e() {
        mip.eP(this.a);
        for (ihs ihsVar : this.b) {
            mip.eP(ihsVar);
        }
    }

    @Override // defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.f();
        for (ihs ihsVar : this.b) {
            ihsVar.f();
        }
    }

    @Override // defpackage.ihs, defpackage.iht
    public final void g() {
        for (ihs ihsVar : this.b) {
            ihsVar.g();
        }
        this.a.g();
    }

    @Override // defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
