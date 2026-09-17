package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class jlm extends AnimatorListenerAdapter {
    final /* synthetic */ ShutterButtonProgressOverlay a;

    public jlm(ShutterButtonProgressOverlay shutterButtonProgressOverlay) {
        this.a = shutterButtonProgressOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.a;
        shutterButtonProgressOverlay.k = 1;
        shutterButtonProgressOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.a;
        shutterButtonProgressOverlay.k = 1;
        shutterButtonProgressOverlay.setVisibility(4);
        this.a.g = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.a;
        shutterButtonProgressOverlay.b = shutterButtonProgressOverlay.e;
        shutterButtonProgressOverlay.k = 3;
    }
}
