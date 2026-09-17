package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class ibl extends icw implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;
    public final ihw d;
    public final ihw e;
    public final ihw f;
    public final ihw g;

    public ibl(Context context, ida idaVar, ibm ibmVar, bue bueVar, icf icfVar, Handler handler, PackageManager packageManager, Resources resources, idd iddVar, ick ickVar, iet ietVar) {
        super(context, idaVar, ibmVar, bueVar, icfVar, handler, packageManager, resources, iddVar, ickVar, ietVar);
        ihw ihwVar = new ihw(new ibf(this), new ihs[0]);
        this.b = ihwVar;
        this.c = new ihw(new ibg(this), new ihs[0]);
        this.d = new ihw(new ibh(this), new ihs[0]);
        this.e = new ihw(new ibi(this), new ihs[0]);
        this.f = new ihw(new ibj(this), new ihs[0]);
        this.g = new ihw(new ibk(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.icw, defpackage.icl
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).a();
    }

    @Override // defpackage.icw, defpackage.icl
    public final void b(bty btyVar, boolean z) {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).b(btyVar, z);
    }

    @Override // defpackage.icw, defpackage.icl
    public final void d(bty btyVar, boolean z) {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).d(btyVar, z);
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
        this.e.e();
        this.f.e();
        this.g.e();
    }

    @Override // defpackage.icw, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.icw, defpackage.icl, defpackage.fig
    public final void fV() {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).fV();
    }

    @Override // defpackage.icw, defpackage.icl, defpackage.fgl
    public final boolean fX() {
        if (this.a.a() == null) {
            return false;
        }
        return ((icl) this.a.a().a).fX();
    }

    @Override // defpackage.icw, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.icw, defpackage.icl
    public final void gk() {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).gk();
    }

    @Override // defpackage.icw, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }

    @Override // defpackage.icw, defpackage.icl
    public final void i() {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).i();
    }

    @Override // defpackage.icw, defpackage.icl
    public final void j() {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).j();
    }

    @Override // defpackage.icw, defpackage.icl
    public final void k() {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).k();
    }

    @Override // defpackage.icw, defpackage.icl
    public final void l(ResolveInfo resolveInfo) {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).l(resolveInfo);
    }

    @Override // defpackage.icw, defpackage.icl
    public final void m() {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).m();
    }

    @Override // defpackage.icw, defpackage.icl
    public final void n() {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).n();
    }

    @Override // defpackage.icw, defpackage.icl
    public final void o() {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).o();
    }

    @Override // defpackage.icw, defpackage.icl
    public final void p(long j) {
        if (this.a.a() == null) {
            return;
        }
        ((icl) this.a.a().a).p(j);
    }
}
