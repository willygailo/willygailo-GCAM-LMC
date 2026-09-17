package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
final class ctj implements Animator.AnimatorListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ ctl b;

    public ctj(ctl ctlVar, boolean z) {
        this.b = ctlVar;
        this.a = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.m = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        jeg jegVar = this.b.f;
        if (this.a) {
            jegVar.b();
        } else {
            jegVar.c();
        }
    }
}
