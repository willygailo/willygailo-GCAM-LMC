package com.google.android.apps.camera.ui.modeslider;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import defpackage.jrz;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class ModeSliderUi extends FrameLayout {
    private ModeSlider a;
    private RecordSpeedSlider b;
    private jrz c;

    public ModeSliderUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = jrz.PORTRAIT;
    }

    public final RecordSpeedSlider a() {
        RecordSpeedSlider recordSpeedSlider = this.b;
        recordSpeedSlider.getClass();
        return recordSpeedSlider;
    }

    public final ModeSlider b() {
        ModeSlider modeSlider = this.a;
        modeSlider.getClass();
        return modeSlider;
    }

    public final void c(jrz jrzVar) {
        this.c = jrzVar;
        mip.es(this, jrzVar);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.mode_slider_layout, this);
        setLayerType(1, null);
        ModeSlider modeSlider = (ModeSlider) findViewById(R.id.mode_slider);
        modeSlider.getClass();
        this.a = modeSlider;
        RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) findViewById(R.id.record_speed_slider);
        recordSpeedSlider.getClass();
        this.b = recordSpeedSlider;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            b().c = getMeasuredWidth();
            b().g();
            c(this.c);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (jrz.b(this.c)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
    }
}
