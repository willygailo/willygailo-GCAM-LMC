package com.google.android.apps.camera.ui.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.views.ToggleUi;
import defpackage.adt;
import defpackage.iem;
import defpackage.jow;
import defpackage.jrz;
import defpackage.mip;
import defpackage.ope;
import defpackage.oug;
import defpackage.ouj;
import j$.time.Duration;
import j$.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class ToggleUi extends FrameLayout {
    public jrz b;
    public ToggleButton c;
    public ImageView d;
    public AnimatorSet e;
    private static final ouj f = ouj.h("com/google/android/apps/camera/ui/views/ToggleUi");
    public static final Duration a = Duration.ofMillis(200);

    public class ToggleButton extends ImageButton {
        private static final ouj b = ouj.h("com/google/android/apps/camera/ui/views/ToggleUi$ToggleButton");
        public boolean a;

        public ToggleButton(Context context) {
            super(context);
        }

        public ToggleButton(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public ToggleButton(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public ToggleButton(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }

        @Override // android.view.View
        public final void setScaleX(float f) {
            if (this.a) {
                super.setScaleX(f);
            } else {
                ((oug) ((oug) b.c()).G((char) 3467)).r("setScaleX ignored %s", Float.valueOf(f));
            }
        }

        @Override // android.view.View
        public final void setScaleY(float f) {
            if (this.a) {
                super.setScaleY(f);
            } else {
                ((oug) ((oug) b.c()).G((char) 3468)).r("setScaleY ignored %s", Float.valueOf(f));
            }
        }
    }

    public ToggleUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void g(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        valueAnimator.addUpdateListener(animatorUpdateListener);
        valueAnimator.setInterpolator(new adt());
    }

    public final void a(jrz jrzVar) {
        this.b = jrzVar;
        mip.es(this, jrzVar);
        Collection.EL.stream(ope.H(this.c)).forEach(new iem(jrzVar, 2));
    }

    public final void b() {
        AnimatorSet animatorSet = this.e;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.e.cancel();
    }

    public final void c(int i) {
        this.d.setImageResource(i);
    }

    public final void d(Drawable drawable) {
        if (drawable != null) {
            this.c.setImageDrawable(drawable);
        } else {
            ((oug) ((oug) f.b()).G((char) 3471)).o("Invalid button image resource.");
        }
    }

    public final void e(int i) {
        this.c.setContentDescription(getResources().getString(i));
    }

    public final void f(boolean z, int i) {
        this.d.setPressed(z);
        this.c.setImageAlpha(i);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("ToggleUi:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.toggle_view_contents, this);
        final int i = 1;
        setLayerType(1, null);
        Trace.endSection();
        this.c = (ToggleButton) findViewById(R.id.toggle_button);
        this.d = (ImageView) findViewById(R.id.toggle_background);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        g(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener(this) { // from class: jov
            public final /* synthetic */ ToggleUi a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        ToggleUi toggleUi = this.a;
                        toggleUi.c.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        toggleUi.c.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        this.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int i2 = 0;
        g(valueAnimatorOfFloat2, new ValueAnimator.AnimatorUpdateListener(this) { // from class: jov
            public final /* synthetic */ ToggleUi a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        ToggleUi toggleUi = this.a;
                        toggleUi.c.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        toggleUi.c.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        this.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.e = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.e.setDuration(a.toMillis());
        this.e.addListener(new jow(this));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a(this.b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (jrz.b(this.b)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
    }
}
