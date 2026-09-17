package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class jrn extends AnimatorListenerAdapter {
    final /* synthetic */ Consumer a;

    public jrn(Consumer consumer) {
        this.a = consumer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.accept(animator);
    }
}
