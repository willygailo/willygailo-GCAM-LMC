package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class dub extends AnimatorListenerAdapter {
    final /* synthetic */ FilmstripTransitionLayout a;

    public dub(FilmstripTransitionLayout filmstripTransitionLayout) {
        this.a = filmstripTransitionLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        dty dtyVar = this.a.i;
        if (dtyVar != null) {
            dtyVar.c.c.setVisibility(4);
            dtyVar.c.d.setVisibility(0);
            dtyVar.a.a(new CancellationException("Animation is cancelled"));
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FilmstripTransitionLayout filmstripTransitionLayout = this.a;
        if (filmstripTransitionLayout.g) {
            filmstripTransitionLayout.setVisibility(4);
        }
        FilmstripTransitionLayout filmstripTransitionLayout2 = this.a;
        if (filmstripTransitionLayout2.c) {
            filmstripTransitionLayout2.c = false;
            return;
        }
        dty dtyVar = filmstripTransitionLayout2.i;
        if (dtyVar != null) {
            if (!dtyVar.c.g.isDone()) {
                dtyVar.a.e(dtyVar.c.h(dtyVar.b));
                return;
            }
            CancellationException cancellationException = new CancellationException("Photos Launch was already cancelled.");
            ((oug) ((oug) ((oug) dtz.a.c()).h(cancellationException)).G((char) 914)).o("onTransitionEnd");
            dtyVar.a.a(cancellationException);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.a.f.setVisibility(4);
    }
}
