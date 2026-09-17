package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* JADX INFO: loaded from: classes2.dex */
final class kao extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomUi a;

    public kao(ZoomUi zoomUi) {
        this.a = zoomUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.b().setVisibility(4);
        this.a.f().setVisibility(4);
        this.a.b().setAlpha(1.0f);
        this.a.f().setAlpha(1.0f);
    }
}
