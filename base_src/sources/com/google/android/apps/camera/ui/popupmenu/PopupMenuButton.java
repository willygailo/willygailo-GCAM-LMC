package com.google.android.apps.camera.ui.popupmenu;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.mip;
import defpackage.mw;

/* JADX INFO: loaded from: classes.dex */
public class PopupMenuButton extends mw {
    public PopupMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(R.drawable.button_bg);
        setColorFilter(mip.dN(this));
    }

    public final void a(int i) {
        LayerDrawable layerDrawable = (LayerDrawable) getBackground().mutate();
        layerDrawable.setTintMode(PorterDuff.Mode.SRC);
        layerDrawable.getDrawable(1).mutate().setTint(i);
    }

    public final void b(int i) {
        ((LayerDrawable) getBackground()).getDrawable(0).mutate().setTint(i);
    }

    public final void c(boolean z) {
        if (z) {
            return;
        }
        setBackgroundResource(R.drawable.button_bg_legacy);
        setColorFilter(-1);
    }
}
