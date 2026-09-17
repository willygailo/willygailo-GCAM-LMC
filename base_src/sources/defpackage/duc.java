package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class duc implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ FilmstripTransitionLayout a;
    private final /* synthetic */ int b;

    public duc(FilmstripTransitionLayout filmstripTransitionLayout, int i) {
        this.b = i;
        this.a = filmstripTransitionLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                this.a.c(valueAnimator.getAnimatedFraction());
                this.a.invalidate();
                break;
            default:
                this.a.c(1.0f - valueAnimator.getAnimatedFraction());
                this.a.invalidate();
                break;
        }
    }
}
