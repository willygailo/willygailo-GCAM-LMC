package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class hot extends AnimatorListenerAdapter {
    final /* synthetic */ hou a;

    public hot(hou houVar) {
        this.a = houVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.a();
    }
}
