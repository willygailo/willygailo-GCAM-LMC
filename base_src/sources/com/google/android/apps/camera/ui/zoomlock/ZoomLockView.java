package com.google.android.apps.camera.ui.zoomlock;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.adt;
import defpackage.jra;
import defpackage.jrb;
import defpackage.jrc;
import defpackage.jrd;
import defpackage.jre;
import defpackage.jrf;
import defpackage.jrg;
import defpackage.jrz;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class ZoomLockView extends RelativeLayout {
    public ImageView a;
    public ImageView b;
    public AnimatorSet c;
    public ObjectAnimator d;
    public ImageView e;
    public boolean f;
    public jrz g;
    public jrg h;
    private AnimatorSet i;

    public ZoomLockView(Context context) {
        super(context);
        this.g = jrz.PORTRAIT;
    }

    public ZoomLockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = jrz.PORTRAIT;
    }

    private static ObjectAnimator c(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(new adt());
        objectAnimatorOfFloat.setStartDelay(50L);
        return objectAnimatorOfFloat;
    }

    private final ObjectAnimator d(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", getResources().getDimension(R.dimen.zoom_lock_translation));
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(new adt());
        objectAnimatorOfFloat.setStartDelay(50L);
        return objectAnimatorOfFloat;
    }

    public final void a() {
        Trace.beginSection("ZoomLockView:applyOrientation");
        ImageView imageView = this.a;
        if (imageView != null) {
            mip.et(imageView, this.g);
        }
        Trace.endSection();
    }

    public final void b() {
        if (this.f) {
            return;
        }
        this.i.start();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("ZoomLockView:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.zoom_lock_layout, (ViewGroup) this, true);
        setLayerType(1, null);
        this.a = (ImageView) findViewById(R.id.zoom_lock_icon);
        this.b = (ImageView) findViewById(R.id.lock_click_button);
        this.e = (ImageView) findViewById(R.id.zoom_lock_bg);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.b, "scaleX", 1.5f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.b, "scaleY", 1.5f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new adt());
        objectAnimatorOfFloat2.setInterpolator(new adt());
        objectAnimatorOfFloat.addListener(new jra(this));
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(getResources().getColor(R.color.zoom_lock_button_start_color, null)), Integer.valueOf(getResources().getColor(R.color.zoom_lock_button_end_color, null)));
        valueAnimatorOfObject.setDuration(200L);
        valueAnimatorOfObject.addUpdateListener(new jrb(this));
        valueAnimatorOfObject.addListener(new jrc(this));
        valueAnimatorOfObject.setStartDelay(50L);
        ObjectAnimator objectAnimatorD = d(this.e);
        ObjectAnimator objectAnimatorD2 = d(this.a);
        ObjectAnimator objectAnimatorC = c(this.e);
        ObjectAnimator objectAnimatorC2 = c(this.a);
        objectAnimatorC.addListener(new jrd(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.c.play(valueAnimatorOfObject).after(objectAnimatorOfFloat);
        this.c.play(objectAnimatorD).with(valueAnimatorOfObject);
        this.c.play(objectAnimatorC).with(valueAnimatorOfObject);
        this.c.play(objectAnimatorD2).with(valueAnimatorOfObject);
        this.c.play(objectAnimatorC2).with(valueAnimatorOfObject);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.d = objectAnimatorOfFloat3;
        objectAnimatorOfFloat3.setDuration(200L);
        this.d.setInterpolator(new adt());
        this.d.addListener(new jre(this));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.b, "scaleX", 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.b, "scaleY", 1.0f);
        objectAnimatorOfFloat4.setDuration(200L);
        objectAnimatorOfFloat5.setDuration(200L);
        objectAnimatorOfFloat4.setInterpolator(new adt());
        objectAnimatorOfFloat5.setInterpolator(new adt());
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.i = animatorSet2;
        animatorSet2.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5);
        this.i.addListener(new jrf(this));
        Trace.endSection();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("ZoomLockView:onLayout");
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a();
        }
        Trace.endSection();
    }
}
