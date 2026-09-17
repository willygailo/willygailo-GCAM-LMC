package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cqi extends cqw implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;
    public final ihw d;
    public final ihw e;

    public cqi(kas kasVar, nvb nvbVar, lda ldaVar, ddf ddfVar, ivf ivfVar, ojc ojcVar, cvo cvoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(kasVar, nvbVar, ldaVar, ddfVar, ivfVar, ojcVar, cvoVar, null, null, null);
        this.b = new ihw(new cqe(this), new ihs[0]);
        this.c = new ihw(new cqf(this), new ihs[0]);
        ihw ihwVar = new ihw(new cqg(this), new ihs[0]);
        this.d = ihwVar;
        this.e = new ihw(new cqh(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.cqr
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((cqr) this.a.a().a).a();
    }

    @Override // defpackage.cqr
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((cqr) this.a.a().a).b();
    }

    @Override // defpackage.cqr
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((cqr) this.a.a().a).c();
    }

    @Override // defpackage.cqr
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((cqr) this.a.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
        this.e.e();
    }

    @Override // defpackage.cqr, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.cqr, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.cqr, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
