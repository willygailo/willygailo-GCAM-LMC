package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class izl extends izz implements ihv {
    private final ihu b;
    private final ihw c;

    public izl(lda ldaVar, crs crsVar, crw crwVar) {
        super(ldaVar);
        ihw ihwVar = new ihw(new izy(this), crsVar, crwVar);
        this.c = ihwVar;
        ihu ihuVar = new ihu(ihwVar, false);
        this.b = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.b.b();
        this.c.e();
    }

    @Override // defpackage.izz, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.c();
    }

    @Override // defpackage.izz, defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.d();
    }

    @Override // defpackage.izz, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
