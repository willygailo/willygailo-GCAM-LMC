package defpackage;

import com.google.android.apps.camera.evcomp.EvCompView;

/* JADX INFO: loaded from: classes.dex */
public final class dni extends dna implements ihv {
    public final ihu o;
    public final ihw p;
    public final ihw q;
    public final ihw r;

    public dni(qkg qkgVar, EvCompView evCompView, lda ldaVar, lda ldaVar2, lda ldaVar3, lda ldaVar4, huq huqVar, ojc ojcVar, boolean z, byte[] bArr) {
        super(qkgVar, evCompView, ldaVar, ldaVar2, ldaVar3, ldaVar4, huqVar, ojcVar, z, null);
        ihw ihwVar = new ihw(new dnf(this), new ihs[0]);
        this.p = ihwVar;
        this.q = new ihw(new dng(this), new ihs[0]);
        this.r = new ihw(new dnh(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.o = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.dmu
    public final void a() {
        if (this.o.a() == null) {
            return;
        }
        ((dmu) this.o.a().a).a();
    }

    @Override // defpackage.dmu
    public final void b(dmg dmgVar) {
        if (this.o.a() == null) {
            return;
        }
        ((dmu) this.o.a().a).b(dmgVar);
    }

    @Override // defpackage.dmu
    public final void c() {
        if (this.o.a() == null) {
            return;
        }
        ((dmu) this.o.a().a).c();
    }

    @Override // defpackage.dmu
    public final void d(float f, dmg dmgVar) {
        if (this.o.a() == null) {
            return;
        }
        ((dmu) this.o.a().a).d(f, dmgVar);
    }

    @Override // defpackage.ihv
    public final void e() {
        this.o.b();
        this.p.e();
        this.q.e();
        this.r.e();
    }

    @Override // defpackage.dmu, defpackage.ihs, defpackage.iht
    public final void f() {
        this.o.c();
    }

    @Override // defpackage.dmu, defpackage.ihs, defpackage.iht
    public final void g() {
        this.o.d();
    }

    @Override // defpackage.dmu, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
