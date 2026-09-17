package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* JADX INFO: loaded from: classes2.dex */
public final class jra extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomLockView a;

    public jra(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        super.onAnimationStart(animator);
    }
}
