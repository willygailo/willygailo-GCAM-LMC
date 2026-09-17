package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.captureframe.CaptureFrameUi;

/* JADX INFO: loaded from: classes2.dex */
public final class ive extends AnimatorListenerAdapter {
    final /* synthetic */ CaptureFrameUi a;
    final /* synthetic */ ivf b;

    public ive(ivf ivfVar, CaptureFrameUi captureFrameUi) {
        this.b = ivfVar;
        this.a = captureFrameUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        synchronized (this.b.d) {
            if (this.b.c.equals(ivh.HIDDEN)) {
                this.a.setVisibility(8);
            }
            ivf ivfVar = this.b;
            ivfVar.b = ivfVar.c;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        synchronized (this.b.d) {
            if (!this.b.c.equals(ivh.HIDDEN)) {
                this.a.setVisibility(0);
            }
        }
    }
}
