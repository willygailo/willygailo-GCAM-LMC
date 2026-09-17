package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class jkx extends AnimatorListenerAdapter {
    final /* synthetic */ jky a;

    public jkx(jky jkyVar) {
        this.a = jkyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.b.inFlightSpecBuilder.b(true);
    }
}
