package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class jok extends AnimatorListenerAdapter {
    final /* synthetic */ jom a;

    public jok(jom jomVar) {
        this.a = jomVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        jom jomVar = this.a;
        jomVar.n = 4;
        jomVar.d = jomVar.f;
        jomVar.e = jomVar.g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.n = 4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        jom jomVar = this.a;
        jomVar.n = 2;
        jomVar.setVisibility(0);
    }
}
