package com.google.android.apps.camera.ui.modeslider;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.modeslider.ModeSlider;
import defpackage.ddf;
import defpackage.ddl;
import defpackage.ei;
import defpackage.jdw;
import defpackage.jdx;
import defpackage.jdy;
import defpackage.jdz;
import defpackage.jem;
import defpackage.jen;
import defpackage.jsa;
import defpackage.obr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ModeSlider extends LinearLayout implements jen {
    public jem a;
    List b;
    public int c;
    private final AtomicInteger d;
    private final int e;
    private ddf f;
    private final LinearLayout.LayoutParams g;

    public ModeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new AtomicInteger(-1);
        this.b = new ArrayList();
        this.c = 0;
        this.e = context.getResources().getDimensionPixelSize(R.dimen.mode_slider_mode_side_padding);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, getResources().getDimensionPixelSize(R.dimen.mode_slider_knob_height));
        this.g = layoutParams;
        layoutParams.gravity = 8388627;
    }

    private final void m(TextView textView, int i) {
        ei.e(getContext(), R.font.google_sans_medium_compat, new jdx(textView));
        textView.setTextColor(i);
    }

    public final int a() {
        return this.d.get();
    }

    public final int b(jdz jdzVar) {
        if (!this.b.contains(jdzVar)) {
            String strValueOf = String.valueOf(jdzVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
            sb.append("Unsupported mode item: ");
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext() && !((jdz) it.next()).equals(jdzVar)) {
            i++;
        }
        return i;
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

    public final jdz f(int i) {
        return (jdz) this.b.get(i);
    }

    final void g() {
        if (this.c <= 0 || a() == -1) {
            return;
        }
        getChildAt(a()).setLayoutParams(this.g);
        ((TextView) getChildAt(a())).setMaxWidth(Integer.MAX_VALUE);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mode_slider_side_margin);
        int i = this.c - (dimensionPixelSize + dimensionPixelSize);
        int size = this.b.size();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mode_slider_side_padding);
        if (getMeasuredWidth() <= i || size <= 1) {
            return;
        }
        int width = ((i - (dimensionPixelSize2 + dimensionPixelSize2)) - getChildAt(a()).getWidth()) / (size - 1);
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != a()) {
                ((TextView) getChildAt(i2)).setMaxWidth(width);
            }
        }
    }

    @Override // defpackage.jen
    public final void h() {
        setVisibility(0);
    }

    public final void i(jdy jdyVar, ddf ddfVar) {
        this.b.clear();
        this.b.addAll(jdyVar.h);
        this.f = ddfVar;
        List list = jdyVar.h;
        removeAllViews();
        this.d.set(-1);
        int size = this.b.size();
        float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mode_slider_mode_text_size);
        float fA = jsa.a(getResources().getDimension(R.dimen.mode_slider_mode_text_letter_spacing));
        for (final int i = 0; i < size; i++) {
            String str = ((jdz) this.b.get(i)).b;
            String str2 = ((jdz) this.b.get(i)).c;
            TextView textView = new TextView(getContext());
            textView.setLayoutParams(this.g);
            textView.setSingleLine(true);
            textView.setBackgroundColor(0);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setText(str);
            textView.setGravity(17);
            if (ddfVar.k(ddl.ay)) {
                m(textView, obr.e(textView, R.attr.colorOnSurface));
            } else {
                m(textView, getContext().getColor(R.color.mode_slider_text_color_legacy));
            }
            textView.setTextAlignment(4);
            textView.setTextSize(0, dimensionPixelSize);
            textView.setLetterSpacing(fA);
            int i2 = this.e;
            textView.setPadding(i2, 0, i2, 0);
            textView.setContentDescription(str2);
            textView.setOnClickListener(new View.OnClickListener() { // from class: jdv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ModeSlider modeSlider = this.a;
                    int i3 = i;
                    modeSlider.a.c(true);
                    modeSlider.l(i3, true);
                    modeSlider.a.b(modeSlider, true);
                }
            });
            addView(textView, i);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mode_slider_side_padding);
        setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        setOnTouchListener(new jdw(this));
    }

    @Override // defpackage.jen
    public final boolean j() {
        return getVisibility() == 0;
    }

    public final void k(int i) {
        l(i, false);
    }

    public final void l(int i, boolean z) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Illegal index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i != this.d.get()) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                TextView textView = (TextView) getChildAt(i2);
                if (i2 == i) {
                    Drawable drawable = getContext().getDrawable(R.drawable.bg_mode_slider_knob);
                    if (drawable != null) {
                        if (this.f.k(ddl.ay)) {
                            m(textView, obr.e(textView, R.attr.colorOnSecondary));
                            drawable.setTint(obr.e(textView, R.attr.colorSecondary));
                        } else {
                            drawable.setTint(getContext().getColor(R.color.mode_slider_knob_bg_color_legacy));
                        }
                        textView.setBackground(drawable);
                    }
                    textView.setSelected(true);
                } else {
                    textView.setBackground(null);
                    if (this.f.k(ddl.ay)) {
                        m(textView, obr.e(textView, R.attr.colorOnSurface));
                    }
                    textView.setSelected(false);
                }
            }
            this.d.set(i);
            g();
            jem jemVar = this.a;
            if (jemVar != null) {
                if (!z) {
                    jemVar.c(false);
                }
                this.a.a(this, i, z);
                if (z) {
                    return;
                }
                this.a.b(this, false);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
