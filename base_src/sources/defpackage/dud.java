package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class dud extends AnimatorListenerAdapter {
    final /* synthetic */ FilmstripTransitionLayout a;

    public dud(FilmstripTransitionLayout filmstripTransitionLayout) {
        this.a = filmstripTransitionLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(4);
        this.a.f.setVisibility(0);
        FilmstripTransitionLayout filmstripTransitionLayout = this.a;
        if (filmstripTransitionLayout.d) {
            filmstripTransitionLayout.d = false;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
