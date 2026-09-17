package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
final class ctk implements Animator.AnimatorListener {
    final /* synthetic */ ctl a;

    public ctk(ctl ctlVar) {
        this.a = ctlVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f.a();
        this.a.n = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
