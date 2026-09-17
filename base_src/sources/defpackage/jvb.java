package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jvb extends juy implements ihv {
    public final qkg a;
    public final ihu b;
    public final ihw c;
    public final ihw d;

    public jvb(qkg qkgVar) {
        this.a = qkgVar;
        ihw ihwVar = new ihw(new jvc(this), new ihs[0]);
        this.c = ihwVar;
        this.d = new ihw(new jvd(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.b = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.juy
    public final void a() {
        if (this.b.a() == null) {
            return;
        }
        ((juy) this.b.a().a).a();
    }

    @Override // defpackage.juy
    public final void b() {
        if (this.b.a() == null) {
            return;
        }
        ((juy) this.b.a().a).b();
    }

    @Override // defpackage.juy
    public final void c() {
        if (this.b.a() == null) {
            return;
        }
        ((juy) this.b.a().a).c();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.b.b();
        this.c.e();
        this.d.e();
    }

    @Override // defpackage.juy, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.c();
    }

    @Override // defpackage.juy, defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.d();
    }

    @Override // defpackage.juy, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
