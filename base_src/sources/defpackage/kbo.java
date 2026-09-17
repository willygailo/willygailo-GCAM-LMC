package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class kbo extends AnimatorListenerAdapter {
    final /* synthetic */ kbx a;

    public kbo(kbx kbxVar) {
        this.a = kbxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c();
    }
}
