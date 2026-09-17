package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class jrm extends AnimatorListenerAdapter {
    final /* synthetic */ Consumer a;

    public jrm(Consumer consumer) {
        this.a = consumer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.accept(animator);
    }
}
