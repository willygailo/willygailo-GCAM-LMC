package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class jvk extends jvx implements ihv {
    public final ihu a;
    public final ihw b = new ihw(new jvh(this), new ihs[0]);
    public final ihw c = new ihw(new jvi(this), new ihs[0]);
    private final ihw l;

    public jvk() {
        ihw ihwVar = new ihw(new jvj(this), new ihs[0]);
        this.l = ihwVar;
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.jvr
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((jvr) this.a.a().a).a();
    }

    @Override // defpackage.jvr
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((jvr) this.a.a().a).b();
    }

    @Override // defpackage.jvr
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((jvr) this.a.a().a).c();
    }

    @Override // defpackage.jvr
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((jvr) this.a.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.l.e();
    }

    @Override // defpackage.jvr, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.jvr, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.jvr
    public final void gs() {
        if (this.a.a() == null) {
            return;
        }
        ((jvr) this.a.a().a).gs();
    }

    @Override // defpackage.jvr, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }

    @Override // defpackage.jvr
    public final void i() {
        if (this.a.a() == null) {
            return;
        }
        ((jvr) this.a.a().a).i();
    }

    @Override // defpackage.jvx, defpackage.jvr
    public final void j(jvy jvyVar, Uri uri, jvb jvbVar, jvo jvoVar, int i, boolean z, boolean z2) {
        if (this.a.a() != null) {
            ((jvr) this.a.a().a).j(jvyVar, uri, jvbVar, jvoVar, i, z, z2);
            return;
        }
        jvyVar.getClass();
        this.d = jvyVar;
        this.e = ((jwd) jvyVar).f;
        this.f = jvbVar;
        this.g = jvoVar;
        this.h = uri;
        this.i = i;
        this.j = z;
        this.k = z2;
    }

    @Override // defpackage.jvr
    public final void k() {
        if (this.a.a() == null) {
            return;
        }
        ((jvr) this.a.a().a).k();
    }
}
