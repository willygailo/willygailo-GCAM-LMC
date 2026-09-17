package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class jkr extends AnimatorListenerAdapter {
    final /* synthetic */ jlq a;
    final /* synthetic */ jkz b;

    public jkr(jkz jkzVar, jlq jlqVar) {
        this.b = jkzVar;
        this.a = jlqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b.setVideoButtonAnimating(false);
        this.b.b.inFlightSpecBuilder.b(this.a.r);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b.setVideoButtonAnimating(true);
    }
}
