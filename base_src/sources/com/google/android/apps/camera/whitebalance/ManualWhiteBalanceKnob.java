package com.google.android.apps.camera.whitebalance;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.guf;

/* JADX INFO: loaded from: classes.dex */
public class ManualWhiteBalanceKnob extends ImageView {
    public final int a;

    public ManualWhiteBalanceKnob(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_width);
        setOnTouchListener(guf.d);
    }
}
