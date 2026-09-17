package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* JADX INFO: loaded from: classes2.dex */
final class kan extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomUi a;

    public kan(ZoomUi zoomUi) {
        this.a = zoomUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.e().setVisibility(0);
        this.a.e().setBackground(this.a.getResources().getDrawable(R.drawable.bg_zoom_seekbar_dark, null));
        animator.removeAllListeners();
    }
}
