package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class hjs extends hjo implements ihv {
    public final ProgressOverlay a;
    public boolean b;
    public final AnimatedVectorDrawable c;
    public final ihu d;
    public final ihw e;
    public final ihw f;

    public hjs(ProgressOverlay progressOverlay) {
        lar.a();
        this.a = progressOverlay;
        AnimatedVectorDrawable animatedVectorDrawable = progressOverlay.a;
        this.c = animatedVectorDrawable;
        animatedVectorDrawable.registerAnimationCallback(new hjp(this));
        this.b = false;
        ihw ihwVar = new ihw(new hji(this), new ihs[0]);
        this.e = ihwVar;
        this.f = new ihw(new hjj(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.d = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.hjo
    public final void a() {
        if (this.d.a() == null) {
            return;
        }
        ((hjo) this.d.a().a).a();
    }

    @Override // defpackage.hjo
    public final void b() {
        if (this.d.a() == null) {
            return;
        }
        ((hjo) this.d.a().a).b();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.d.b();
        this.e.e();
        this.f.e();
    }

    @Override // defpackage.hjo, defpackage.ihs, defpackage.iht
    public final void f() {
        this.d.c();
    }

    @Override // defpackage.hjo, defpackage.ihs, defpackage.iht
    public final void g() {
        this.d.d();
    }

    @Override // defpackage.hjo, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
