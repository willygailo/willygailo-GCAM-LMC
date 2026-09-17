package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
class how extends hos {
    private Animator a;
    final /* synthetic */ hoz b;

    public how(hoz hozVar) {
        this.b = hozVar;
    }

    @Override // defpackage.hos
    public void a() {
    }

    @Override // defpackage.hos
    public void c() {
    }

    @Override // defpackage.hos
    public void d() {
    }

    @Override // defpackage.hos, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.i();
        Animator animatorC = ((hpc) this.b.b.get()).c(this.b.k());
        this.a = animatorC;
        animatorC.addListener(new hov(this));
        this.a.start();
    }

    @Override // defpackage.hos, defpackage.ihs, defpackage.iht
    public final void g() {
        if (this.a.isRunning()) {
            this.a.removeAllListeners();
            this.a.cancel();
        }
        this.b.j();
    }
}
