package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class jhl extends AnimatorListenerAdapter {
    final /* synthetic */ jhm a;

    public jhl(jhm jhmVar) {
        this.a = jhmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setForeground(null);
    }
}
