package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* JADX INFO: loaded from: classes2.dex */
public final class jrd extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomLockView a;

    public jrd(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.bringToFront();
        super.onAnimationEnd(animator);
        jrg jrgVar = this.a.h;
        if (jrgVar != null) {
            jrgVar.a.b(true);
        }
    }
}
