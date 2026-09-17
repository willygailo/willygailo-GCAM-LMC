package defpackage;

import android.animation.ObjectAnimator;
import android.widget.CheckBox;
import com.google.android.apps.camera.evcomp.EvCompView;

/* JADX INFO: loaded from: classes.dex */
public final class dne extends dmt implements ihv {
    public final ihu f;
    public final ihw g;
    public final ihw h;
    public final ihw i;

    public dne(EvCompView evCompView, CheckBox checkBox, ObjectAnimator objectAnimator, dna dnaVar, huq huqVar, dna dnaVar2, byte[] bArr) {
        super(evCompView, checkBox, objectAnimator, dnaVar, huqVar, null);
        ihw ihwVar = new ihw(new dnb(this), new ihs[0]);
        this.g = ihwVar;
        this.h = new ihw(new dnc(this), new ihs[0]);
        this.i = new ihw(new dnd(this), dnaVar2);
        ihu ihuVar = new ihu(ihwVar, false);
        this.f = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.dmo
    public final void a() {
        if (this.f.a() == null) {
            return;
        }
        ((dmo) this.f.a().a).a();
    }

    @Override // defpackage.dmo
    public final void b(int i, int i2, float f) {
        if (this.f.a() == null) {
            return;
        }
        ((dmo) this.f.a().a).b(i, i2, f);
    }

    @Override // defpackage.dmo
    public final void c(boolean z) {
        if (this.f.a() == null) {
            return;
        }
        ((dmo) this.f.a().a).c(z);
    }

    @Override // defpackage.dmo
    public final void d(boolean z, boolean z2) {
        if (this.f.a() == null) {
            return;
        }
        ((dmo) this.f.a().a).d(z, z2);
    }

    @Override // defpackage.ihv
    public final void e() {
        this.f.b();
        this.g.e();
        this.h.e();
        this.i.e();
    }

    @Override // defpackage.dmo, defpackage.ihs, defpackage.iht
    public final void f() {
        this.f.c();
    }

    @Override // defpackage.dmo, defpackage.ihs, defpackage.iht
    public final void g() {
        this.f.d();
    }

    @Override // defpackage.dmo, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
