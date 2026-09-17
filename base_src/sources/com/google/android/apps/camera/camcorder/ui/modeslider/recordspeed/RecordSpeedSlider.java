package com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.ctv;
import defpackage.ddf;
import defpackage.ddl;
import defpackage.ei;
import defpackage.jem;
import defpackage.jen;
import defpackage.obr;
import defpackage.ols;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class RecordSpeedSlider extends LinearLayout implements jen {
    public final AtomicInteger a;
    public final int b;
    public ols c;
    public jem d;
    public ddf e;
    public int f;
    public int g;
    public int h;

    public RecordSpeedSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new AtomicInteger(-1);
        this.c = ols.r();
        this.b = getResources().getDimensionPixelSize(R.dimen.record_speed_slider_option_side_padding);
    }

    public final int a() {
        return this.a.get();
    }

    public final int b(int i) {
        if (i != this.f) {
            int i2 = this.h;
            if (i2 != 0) {
                return i2 == 1 ? i - 1 : i;
            }
            throw null;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append(i);
        sb.append(" is the index for back option");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.jen
    public final void c() {
        setEnabled(false);
    }

    @Override // defpackage.jen
    public final void d() {
        setEnabled(true);
    }

    @Override // defpackage.jen
    public final void e() {
        setVisibility(8);
    }

    public final void f(int i) {
        g(i, false);
    }

    public final void g(int i, boolean z) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Illegal index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i != this.a.get()) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                TextView textView = (TextView) getChildAt(i2);
                if (i2 == i) {
                    GradientDrawable gradientDrawable = (GradientDrawable) getContext().getDrawable(R.drawable.bg_record_speed_slider_knob);
                    if (gradientDrawable != null) {
                        if (this.e.k(ddl.ay)) {
                            k(textView, obr.e(textView, R.attr.colorOnSecondary));
                            gradientDrawable.setTint(obr.e(textView, R.attr.colorSecondary));
                        } else {
                            gradientDrawable.setTint(getContext().getColor(R.color.record_speed_slider_knob_bg_color_legacy));
                        }
                        textView.setBackground(gradientDrawable);
                    }
                    textView.setSelected(true);
                    textView.sendAccessibilityEvent(4);
                    if (i != this.f) {
                        Drawable drawable = getContext().getDrawable(this.g);
                        if (this.e.k(ddl.ay)) {
                            int iE = obr.e(textView, R.attr.colorOnSecondary);
                            if (drawable != null) {
                                drawable.setTint(iE);
                            }
                        }
                        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.record_speed_slider_knob_compound_padding_between_text);
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(dimensionPixelSize);
                        textView.setPadding(getResources().getDimensionPixelSize(R.dimen.record_speed_slider_drawable_left_padding), 0, this.b, 0);
                    } else if (this.e.k(ddl.ay)) {
                        textView.getCompoundDrawables()[0].setTint(obr.e(textView, R.attr.colorOnSecondary));
                    }
                } else {
                    if (this.e.k(ddl.ay)) {
                        k(textView, obr.e(textView, R.attr.colorOnSurface));
                    }
                    textView.setBackground(null);
                    textView.setSelected(false);
                    if (i2 != this.f) {
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(0);
                        int i3 = this.b;
                        textView.setPadding(i3, 0, i3, 0);
                    } else if (this.e.k(ddl.ay)) {
                        textView.getCompoundDrawables()[0].setTint(obr.e(textView, R.attr.colorOnSurface));
                    }
                }
            }
            this.a.set(i);
            jem jemVar = this.d;
            if (jemVar != null) {
                if (!z) {
                    jemVar.c(false);
                }
                this.d.a(this, i, z);
                if (z) {
                    return;
                }
                this.d.b(this, false);
            }
        }
    }

    @Override // defpackage.jen
    public final void h() {
        setVisibility(0);
    }

    public final boolean i() {
        return getChildAt(this.f) != null && getChildAt(this.f).getVisibility() == 0;
    }

    @Override // defpackage.jen
    public final boolean j() {
        return getVisibility() == 0;
    }

    public final void k(TextView textView, int i) {
        ei.e(getContext(), R.font.google_sans_medium_compat, new ctv(textView));
        textView.setTextColor(i);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
