package com.google.android.apps.camera.optionsbar.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.htf;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class LinearMinibarImpl extends LinearLayoutCompat {
    public LinearMinibarImpl(Context context) {
        super(context);
    }

    public LinearMinibarImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LinearMinibarImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private final View w() {
        return findViewById(R.id.minibar_item_bluetooth_mic);
    }

    private final View x() {
        return findViewById(R.id.minibar_item_face_light);
    }

    private final View y() {
        return findViewById(R.id.minibar_item_face_strong);
    }

    public final View a() {
        return findViewById(R.id.minibar_item_chevron);
    }

    public final View b() {
        return findViewById(R.id.minibar_item_gear);
    }

    public final View c() {
        return findViewById(R.id.minibar_item_motion_on_always);
    }

    public final View g() {
        return findViewById(R.id.minibar_item_motion_on_auto);
    }

    public final void h(boolean z) {
        findViewById(R.id.minibar_item_auto_astro).setVisibility(true != z ? 8 : 0);
    }

    public final void i(boolean z) {
        findViewById(R.id.minibar_item_auto_night_sight).setVisibility(true != z ? 8 : 0);
    }

    public final void j(boolean z, int i, int i2) {
        ImageView imageView = (ImageView) findViewById(R.id.minibar_item_ext1);
        if (true != z) {
            i = 0;
        }
        imageView.setImageResource(i);
        imageView.setContentDescription(z ? getResources().getString(i2) : null);
        imageView.setVisibility(true != z ? 8 : 0);
    }

    public final void k(boolean z, int i, int i2) {
        ImageView imageView = (ImageView) findViewById(R.id.minibar_item_ext2);
        if (true != z) {
            i = 0;
        }
        imageView.setImageResource(i);
        imageView.setContentDescription(z ? getResources().getString(i2) : null);
        imageView.setVisibility(true != z ? 8 : 0);
    }

    public final void l(htf htfVar) {
        htf htfVar2 = htf.OFF;
        switch (htfVar) {
            case OFF:
                y().setVisibility(8);
                x().setVisibility(8);
                break;
            case ON_LIGHT:
                y().setVisibility(8);
                x().setVisibility(0);
                break;
            default:
                y().setVisibility(0);
                x().setVisibility(8);
                break;
        }
    }

    public final void m(boolean z) {
        findViewById(R.id.minibar_item_flash).setVisibility(true != z ? 8 : 0);
    }

    public final void n(boolean z) {
        b().setVisibility(true != z ? 8 : 0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundTintList(ColorStateList.valueOf(mip.dT(this)));
    }

    public final void t(boolean z, String str) {
        w().setVisibility(true != z ? 8 : 0);
        w().setContentDescription(str);
    }

    public final void u(boolean z) {
        findViewById(R.id.minibar_item_wired_mic).setVisibility(true != z ? 8 : 0);
    }

    public final boolean v() {
        View[] viewArr = {x(), y(), c(), g()};
        for (int i = 0; i < 4; i++) {
            if (viewArr[i].getVisibility() == 0) {
                return false;
            }
        }
        return true;
    }
}
