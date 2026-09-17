package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
class hou extends hos {
    private Animator a;
    final /* synthetic */ hoz b;

    public hou(hoz hozVar) {
        this.b = hozVar;
    }

    @Override // defpackage.hos
    public void a() {
    }

    @Override // defpackage.hos
    public void b() {
    }

    @Override // defpackage.hos, defpackage.ihs, defpackage.iht
    public final void f() {
        Animator animatorB = ((hpc) this.b.b.get()).b(this.b.k());
        this.a = animatorB;
        animatorB.addListener(new hot(this));
        this.a.start();
    }

    @Override // defpackage.hos, defpackage.ihs, defpackage.iht
    public final void g() {
        if (this.a.isRunning()) {
            this.a.removeAllListeners();
            this.a.cancel();
        }
    }
}
