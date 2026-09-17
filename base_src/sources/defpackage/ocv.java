package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class ocv extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ ocw b;

    public ocv(ocw ocwVar, int i) {
        this.b = ocwVar;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b = this.a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b = this.a;
    }
}
