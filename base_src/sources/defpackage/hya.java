package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.smarts.SmartsChipView;

/* JADX INFO: loaded from: classes2.dex */
public final class hya extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ SmartsChipView b;

    public hya(SmartsChipView smartsChipView, int i) {
        this.b = smartsChipView;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setVisibility(this.a);
    }
}
