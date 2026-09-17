package com.google.android.apps.camera.whitebalance;

import android.content.Context;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.jrl;
import defpackage.jrz;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class ManualWhiteBalanceUi extends FrameLayout {
    private jrl a;
    private jrz b;

    public ManualWhiteBalanceUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = jrl.UNINITIALIZED;
        this.b = jrz.PORTRAIT;
    }

    public final ImageButton a() {
        return (ImageButton) findViewById(R.id.manual_wb_reset_button);
    }

    public final SeekBar b() {
        return (SeekBar) findViewById(R.id.manual_wb_slider);
    }

    public final ManualWhiteBalanceKnob c() {
        return (ManualWhiteBalanceKnob) findViewById(R.id.manual_wb_knob);
    }

    public final void d(jrz jrzVar, jrl jrlVar) {
        this.b = jrzVar;
        this.a = jrlVar;
        mip.es(this, jrzVar);
        if (c() != null) {
            mip.et(c(), jrzVar);
        }
        if (a() != null) {
            mip.et(a(), jrzVar);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.chameleon_layout, this);
        setLayerType(1, null);
        SeekBar seekBar = (SeekBar) findViewById(R.id.manual_wb_slider);
        seekBar.getClass();
        seekBar.setRotation(270.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) seekBar.getLayoutParams();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_touch_area);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_knob_size);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_knob_inset_size);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_width);
        int dimensionPixelSize5 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_height);
        layoutParams.width = dimensionPixelSize4;
        layoutParams.leftMargin = ((-Math.abs(layoutParams.width - dimensionPixelSize)) / 2) + dimensionPixelSize5;
        seekBar.setLayoutParams(layoutParams);
        seekBar.setPadding(0, 0, 0, 0);
        ManualWhiteBalanceKnob manualWhiteBalanceKnob = (ManualWhiteBalanceKnob) findViewById(R.id.manual_wb_knob);
        manualWhiteBalanceKnob.getClass();
        InsetDrawable insetDrawable = new InsetDrawable(getResources().getDrawable(R.drawable.bg_manual_wb_knob, null), dimensionPixelSize3);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) manualWhiteBalanceKnob.getLayoutParams();
        layoutParams2.leftMargin = ((Math.abs(dimensionPixelSize - dimensionPixelSize2) / 2) - dimensionPixelSize3) + dimensionPixelSize5;
        manualWhiteBalanceKnob.setLayoutParams(layoutParams2);
        manualWhiteBalanceKnob.setBackground(insetDrawable);
        ImageButton imageButton = (ImageButton) findViewById(R.id.manual_wb_reset_button);
        imageButton.getClass();
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) imageButton.getLayoutParams();
        int dimensionPixelSize6 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_width);
        int dimensionPixelSize7 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_height);
        int dimensionPixelSize8 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_touch_area);
        int dimensionPixelSize9 = getResources().getDimensionPixelSize(R.dimen.manual_wb_reset_btn_width);
        int dimensionPixelSize10 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_margin_between_reset_btn);
        int dimensionPixelSize11 = getResources().getDimensionPixelSize(R.dimen.manual_wb_reset_btn_inset_size);
        InsetDrawable insetDrawable2 = new InsetDrawable(getResources().getDrawable(R.drawable.ic_reset_outlines, null), dimensionPixelSize11);
        layoutParams3.bottomMargin = (dimensionPixelSize6 / 2) + (dimensionPixelSize9 / 2) + (dimensionPixelSize11 / 2) + dimensionPixelSize10;
        layoutParams3.leftMargin = ((Math.abs(dimensionPixelSize8 - dimensionPixelSize9) / 2) - dimensionPixelSize11) + dimensionPixelSize7;
        imageButton.setLayoutParams(layoutParams3);
        imageButton.setImageDrawable(insetDrawable2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d(this.b, this.a);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (jrz.b(this.b)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
    }
}
