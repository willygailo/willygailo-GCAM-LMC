package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid;

/* JADX INFO: loaded from: classes2.dex */
final class jgo extends AnimatorListenerAdapter {
    final /* synthetic */ MoreModesGrid a;

    public jgo(MoreModesGrid moreModesGrid) {
        this.a = moreModesGrid;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
        this.a.l = false;
    }
}
