package defpackage;

import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes2.dex */
public final class inp extends ipx implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;
    public final ihw d;
    public final ihw e;

    public inp(BottomBarController bottomBarController, jak jakVar, ddf ddfVar, jfn jfnVar, jjp jjpVar, gtg gtgVar, jlb jlbVar, iqj iqjVar, epj epjVar) {
        super(bottomBarController, jakVar, ddfVar, jfnVar, jjpVar, gtgVar, jlbVar, iqjVar, epjVar);
        this.b = new ihw(new inl(this), new ihs[0]);
        this.c = new ihw(new inm(this), new ihs[0]);
        ihw ihwVar = new ihw(new inn(this), new ihs[0]);
        this.d = ihwVar;
        this.e = new ihw(new ino(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.iph
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((iph) this.a.a().a).a();
    }

    @Override // defpackage.iph
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((iph) this.a.a().a).b();
    }

    @Override // defpackage.iph
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((iph) this.a.a().a).c();
    }

    @Override // defpackage.iph
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((iph) this.a.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
        this.e.e();
    }

    @Override // defpackage.ipx, defpackage.iph, defpackage.ihs, defpackage.iht
    public final void f() {
        iqj iqjVar = this.l;
        iqjVar.b.set(0L);
        iqjVar.a.set(false);
        if (!iqjVar.k.k(dcu.J)) {
            iqjVar.i.a();
            irz irzVar = iqjVar.v;
            irzVar.a.set(true);
            if (irzVar.o != null) {
                irzVar.o.e(irzVar.p.a.c(((Double) irzVar.j.fA()).doubleValue()));
            }
        }
        iqj iqjVar2 = this.l;
        if (!iqjVar2.k.k(dcu.J)) {
            FrameLayout frameLayout = iqjVar2.v.n;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else if (iqjVar2.p.g()) {
            ((ctm) iqjVar2.p.c()).h(false);
        }
        this.l.b();
        this.f.setClickable(true);
        this.i.l(true);
        this.m.g(1);
        jxn.d();
        this.a.c();
    }

    @Override // defpackage.iph, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.iph
    public final void gl() {
        if (this.a.a() == null) {
            return;
        }
        ((iph) this.a.a().a).gl();
    }

    @Override // defpackage.iph, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
