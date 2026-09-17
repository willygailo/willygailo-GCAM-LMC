package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* JADX INFO: loaded from: classes2.dex */
public final class jrc extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomLockView a;

    public jrc(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.e.setVisibility(0);
        this.a.a.setVisibility(0);
        super.onAnimationEnd(animator);
    }
}
