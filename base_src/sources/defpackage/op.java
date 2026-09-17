package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class op extends AnimatorListenerAdapter {
    final /* synthetic */ or a;
    private boolean b = false;

    public op(or orVar) {
        this.a = orVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        if (((Float) this.a.p.getAnimatedValue()).floatValue() == 0.0f) {
            or orVar = this.a;
            orVar.q = 0;
            orVar.e(0);
        } else {
            or orVar2 = this.a;
            orVar2.q = 2;
            orVar2.d();
        }
    }
}
