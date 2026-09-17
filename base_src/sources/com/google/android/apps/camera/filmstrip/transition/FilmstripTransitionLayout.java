package com.google.android.apps.camera.filmstrip.transition;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import defpackage.dty;
import defpackage.dub;
import defpackage.duc;
import defpackage.dud;
import defpackage.due;
import defpackage.duf;
import defpackage.jsa;
import defpackage.lzh;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class FilmstripTransitionLayout extends FrameLayout {
    public final ValueAnimator a;
    public final ValueAnimator b;
    public boolean c;
    public boolean d;
    public FilmstripTransitionThumbnailView e;
    public RoundedThumbnailView f;
    public boolean g;
    public due h;
    public dty i;
    private final lzh j;

    public FilmstripTransitionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.d = false;
        this.i = null;
        this.j = lzh.a();
        this.g = true;
        setVisibility(4);
        b(0.0f);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_slow_in);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(0L);
        valueAnimatorOfFloat.setInterpolator(interpolatorLoadInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new duc(this, 1));
        valueAnimatorOfFloat.addListener(new dub(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(0L);
        valueAnimatorOfFloat2.setInterpolator(interpolatorLoadInterpolator);
        valueAnimatorOfFloat2.addUpdateListener(new duc(this, 0));
        valueAnimatorOfFloat2.addListener(new dud(this));
    }

    public final duf a() {
        int iMax;
        this.f.getClass();
        SizeF sizeF = new SizeF(this.e.a().getWidth(), this.e.a().getHeight());
        float thumbnailFinalDiameter = this.f.getThumbnailFinalDiameter();
        Point pointEk = mip.ek(this.f);
        float rippleRingMaxDiameterDp = this.f.getRippleRingMaxDiameterDp();
        RectF rectF = new RectF(pointEk.x, pointEk.y, pointEk.x + rippleRingMaxDiameterDp, pointEk.y + rippleRingMaxDiameterDp);
        View rootView = getRootView();
        int[] iArrE = jsa.e(rootView);
        int iMax2 = 0;
        int i = iArrE[0];
        RectF rectF2 = new RectF(i, iArrE[1], i + rootView.getWidth(), iArrE[1] + rootView.getHeight());
        Context context = getContext();
        Point point = new Point();
        ((Activity) context).getWindowManager().getDefaultDisplay().getRealSize(point);
        RectF rectF3 = new RectF(0.0f, 0.0f, point.x, point.y);
        if (this.j.e && jsa.d(this)) {
            int[] iArrE2 = jsa.e(getRootView());
            WindowInsets rootWindowInsets = getRootWindowInsets();
            if (getResources().getConfiguration().orientation == 1) {
                iMax = Math.max(iArrE2[1] + rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetBottom());
            } else {
                iMax2 = Math.max(iArrE2[0] + rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetRight());
                iMax = 0;
            }
            Point point2 = new Point(iMax2, iMax);
            rectF3.inset(point2.x, point2.y);
        }
        return new duf(sizeF, rectF2, rectF3, rectF, thumbnailFinalDiameter);
    }

    public final void b(float f) {
        setBackgroundColor(Color.argb((int) (f * 255.0f), 0, 0, 0));
    }

    public final void c(float f) {
        due dueVar = this.h;
        dueVar.getClass();
        float fB = dueVar.b(f);
        this.e.setScaleX(fB);
        this.e.setScaleY(fB);
        PointF pointFC = this.h.c(f);
        this.e.setTranslationX(pointFC.x);
        this.e.setTranslationY(pointFC.y);
        this.e.b(this.h.a(f));
        b(due.d(f));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = (FilmstripTransitionThumbnailView) findViewById(com.google.android.GoogleCameraEngR18F1.R.id.transition_thumbnail_view);
    }
}
