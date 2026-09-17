package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;

/* JADX INFO: loaded from: classes.dex */
public final class duy {
    public final FocusIndicatorRingView a;
    public final duj b;
    public final dul c;

    public duy(FocusIndicatorRingView focusIndicatorRingView, duj dujVar, dul dulVar) {
        this.a = focusIndicatorRingView;
        this.b = dujVar;
        this.c = dulVar;
    }

    public final ValueAnimator.AnimatorUpdateListener a() {
        return new dux(this, 1);
    }

    public final ValueAnimator.AnimatorUpdateListener b() {
        return new dux(this, 0);
    }

    public final ValueAnimator.AnimatorUpdateListener c() {
        return new dux(this, 2);
    }

    public final ValueAnimator.AnimatorUpdateListener d() {
        return new dux(this, 3);
    }
}
