package com.google.android.apps.camera.zoomui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.bpx;
import defpackage.ddf;
import defpackage.ddi;
import defpackage.ddl;
import defpackage.kag;
import defpackage.lzi;
import defpackage.oug;
import defpackage.ouj;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class ZoomKnob extends TextView {
    private static final ouj k = ouj.h("com/google/android/apps/camera/zoomui/ZoomKnob");
    public final AtomicBoolean a;
    public final Resources b;
    public final int c;
    public final int d;
    public final AtomicReference e;
    public int f;
    public float g;
    public boolean h;
    public SeekBar i;
    public lzi j;
    private final int l;

    /* JADX WARN: Multi-variable type inference failed */
    public ZoomKnob(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new AtomicBoolean(false);
        this.e = new AtomicReference(kag.MAIN_ONLY);
        Resources resources = context.getResources();
        this.b = resources;
        this.l = resources.getDimensionPixelSize(R.dimen.zoom_seekbar_width);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.zoom_knob_size);
        this.d = dimensionPixelSize;
        this.c = (dimensionPixelSize - getResources().getDimensionPixelSize(R.dimen.zoom_icon_size)) / 2;
        if (context instanceof bpx) {
            ddf ddfVarA = ((bpx) context).a();
            ddi ddiVar = ddl.a;
            ddfVarA.f();
        }
    }

    public final void a(boolean z) {
        this.a.set(z);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        int dimensionPixelSize = this.b.getDimensionPixelSize(R.dimen.zoom_knob_lift);
        int dimensionPixelSize2 = this.b.getDimensionPixelSize(R.dimen.zoom_icon_size);
        int i = this.f;
        int i2 = dimensionPixelSize + (dimensionPixelSize2 / 2) + i;
        if (true == z) {
            i = i2;
        }
        layoutParams.bottomMargin = i;
        setLayoutParams(layoutParams);
    }

    public final void b(boolean z) {
        if (z) {
            this.i.getThumb().mutate().setAlpha(255);
        } else {
            this.i.getThumb().mutate().setAlpha(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0078  */
    /* JADX WARN: Code duplicated, block: B:21:0x0086  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ee  */
    public final void c(int i, float f, float f2, float f3) {
        float f4;
        double dDoubleValue;
        CharSequence charSequenceConcat;
        lzi lziVar;
        int i2 = this.l;
        float f5 = this.g;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) (((((int) (i2 * f5)) / 2) * (i - 50000)) / 50000.0f);
        layoutParams.rightMargin = 0;
        setLayoutParams(layoutParams);
        kag kagVar = kag.OFF;
        switch ((kag) this.e.get()) {
            case MAIN_ONLY:
                if (f2 >= 1.0f) {
                    f4 = f / f2;
                }
                if (!Float.isNaN(f4) || Float.isInfinite(f4) || f4 <= 0.0f) {
                    ouj oujVar = k;
                    ((oug) ((oug) oujVar.c()).G((char) 3552)).r("Invalid zoom value: %g", Float.valueOf(f4));
                    ((oug) ((oug) oujVar.c()).G(3553)).A("Zoom ratio: %g, Min zoom: %g, BaseZoom: %g", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
                } else {
                    f = f4;
                }
                double dRound = Math.round(f * 100.0f);
                Double.isNaN(dRound);
                dDoubleValue = new BigDecimal((float) (dRound / 100.0d)).setScale(2, 4).doubleValue();
                charSequenceConcat = String.valueOf(new DecimalFormat("0.0").format(dDoubleValue)).concat("×");
                lziVar = this.j;
                if (lziVar != null && lziVar.k && Math.round(10.0d * dDoubleValue) / 10 >= 4.0f) {
                    charSequenceConcat = String.valueOf(new DecimalFormat("0").format(Math.round(dDoubleValue))).concat("×");
                }
                setText(charSequenceConcat);
                return;
            case OFF:
                f4 = f;
                if (Float.isNaN(f4)) {
                    ouj oujVar2 = k;
                    ((oug) ((oug) oujVar2.c()).G((char) 3552)).r("Invalid zoom value: %g", Float.valueOf(f4));
                    ((oug) ((oug) oujVar2.c()).G(3553)).A("Zoom ratio: %g, Min zoom: %g, BaseZoom: %g", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
                } else {
                    ouj oujVar3 = k;
                    ((oug) ((oug) oujVar3.c()).G((char) 3552)).r("Invalid zoom value: %g", Float.valueOf(f4));
                    ((oug) ((oug) oujVar3.c()).G(3553)).A("Zoom ratio: %g, Min zoom: %g, BaseZoom: %g", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
                }
                double dRound2 = Math.round(f * 100.0f);
                Double.isNaN(dRound2);
                dDoubleValue = new BigDecimal((float) (dRound2 / 100.0d)).setScale(2, 4).doubleValue();
                charSequenceConcat = String.valueOf(new DecimalFormat("0.0").format(dDoubleValue)).concat("×");
                lziVar = this.j;
                if (lziVar != null) {
                    charSequenceConcat = String.valueOf(new DecimalFormat("0").format(Math.round(dDoubleValue))).concat("×");
                }
                setText(charSequenceConcat);
                return;
            case FRONT_PORTRAIT:
                f4 = f / f3;
                if (Float.isNaN(f4)) {
                    ouj oujVar4 = k;
                    ((oug) ((oug) oujVar4.c()).G((char) 3552)).r("Invalid zoom value: %g", Float.valueOf(f4));
                    ((oug) ((oug) oujVar4.c()).G(3553)).A("Zoom ratio: %g, Min zoom: %g, BaseZoom: %g", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
                } else {
                    ouj oujVar5 = k;
                    ((oug) ((oug) oujVar5.c()).G((char) 3552)).r("Invalid zoom value: %g", Float.valueOf(f4));
                    ((oug) ((oug) oujVar5.c()).G(3553)).A("Zoom ratio: %g, Min zoom: %g, BaseZoom: %g", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
                }
                double dRound3 = Math.round(f * 100.0f);
                Double.isNaN(dRound3);
                dDoubleValue = new BigDecimal((float) (dRound3 / 100.0d)).setScale(2, 4).doubleValue();
                charSequenceConcat = String.valueOf(new DecimalFormat("0.0").format(dDoubleValue)).concat("×");
                lziVar = this.j;
                if (lziVar != null) {
                    charSequenceConcat = String.valueOf(new DecimalFormat("0").format(Math.round(dDoubleValue))).concat("×");
                }
                setText(charSequenceConcat);
                return;
            case ALL:
                f4 = f / f2;
                if (Float.isNaN(f4)) {
                    ouj oujVar6 = k;
                    ((oug) ((oug) oujVar6.c()).G((char) 3552)).r("Invalid zoom value: %g", Float.valueOf(f4));
                    ((oug) ((oug) oujVar6.c()).G(3553)).A("Zoom ratio: %g, Min zoom: %g, BaseZoom: %g", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
                } else {
                    ouj oujVar7 = k;
                    ((oug) ((oug) oujVar7.c()).G((char) 3552)).r("Invalid zoom value: %g", Float.valueOf(f4));
                    ((oug) ((oug) oujVar7.c()).G(3553)).A("Zoom ratio: %g, Min zoom: %g, BaseZoom: %g", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
                }
                double dRound4 = Math.round(f * 100.0f);
                Double.isNaN(dRound4);
                dDoubleValue = new BigDecimal((float) (dRound4 / 100.0d)).setScale(2, 4).doubleValue();
                charSequenceConcat = String.valueOf(new DecimalFormat("0.0").format(dDoubleValue)).concat("×");
                lziVar = this.j;
                if (lziVar != null) {
                    charSequenceConcat = String.valueOf(new DecimalFormat("0").format(Math.round(dDoubleValue))).concat("×");
                }
                setText(charSequenceConcat);
                return;
            default:
                String strValueOf = String.valueOf(this.e.get());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 39);
                sb.append("Not a supported normalization setting: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
