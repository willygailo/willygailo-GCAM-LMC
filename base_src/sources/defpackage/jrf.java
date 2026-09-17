package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* JADX INFO: loaded from: classes2.dex */
public final class jrf extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomLockView a;

    public jrf(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        this.a.f = true;
    }
}
