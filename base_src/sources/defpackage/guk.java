package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* JADX INFO: loaded from: classes.dex */
public final class guk extends AnimatorListenerAdapter {
    final /* synthetic */ pih a;
    final /* synthetic */ OptionsMenuContainer b;

    public guk(OptionsMenuContainer optionsMenuContainer, pih pihVar) {
        this.b = optionsMenuContainer;
        this.a = pihVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.o.removeListener(this);
        this.b.g().setVisibility(8);
        super.onAnimationEnd(animator);
        this.a.o(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.o.removeListener(this);
        this.b.g().setVisibility(8);
        super.onAnimationEnd(animator);
        this.a.o(true);
    }
}
