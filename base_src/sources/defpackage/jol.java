package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class jol extends AnimatorListenerAdapter {
    final /* synthetic */ jom a;

    public jol(jom jomVar) {
        this.a = jomVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        jom jomVar = this.a;
        jomVar.n = 1;
        jomVar.setVisibility(4);
        this.a.h = -1L;
        this.a.i = -1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jom jomVar = this.a;
        jomVar.n = 1;
        jomVar.setVisibility(4);
        this.a.h = -1L;
        this.a.i = -1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        jom jomVar = this.a;
        jomVar.d = jomVar.f;
        jomVar.n = 3;
    }
}
