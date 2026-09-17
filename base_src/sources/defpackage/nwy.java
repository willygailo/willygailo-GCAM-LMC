package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class nwy implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ CollapsingToolbarLayout a;

    public nwy(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.e(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
