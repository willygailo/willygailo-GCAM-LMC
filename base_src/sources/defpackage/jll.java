package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class jll extends AnimatorListenerAdapter {
    final /* synthetic */ ShutterButtonProgressOverlay a;

    public jll(ShutterButtonProgressOverlay shutterButtonProgressOverlay) {
        this.a = shutterButtonProgressOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.a;
        shutterButtonProgressOverlay.k = 4;
        shutterButtonProgressOverlay.b = shutterButtonProgressOverlay.e;
        shutterButtonProgressOverlay.c = shutterButtonProgressOverlay.f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.k = 4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.a;
        shutterButtonProgressOverlay.k = 2;
        shutterButtonProgressOverlay.setVisibility(0);
    }
}
