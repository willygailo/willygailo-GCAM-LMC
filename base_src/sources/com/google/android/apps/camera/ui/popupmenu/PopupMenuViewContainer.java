package com.google.android.apps.camera.ui.popupmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.jrz;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class PopupMenuViewContainer extends FrameLayout {
    private jrz a;

    public PopupMenuViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = jrz.PORTRAIT;
    }

    public final void a(jrz jrzVar) {
        this.a = jrzVar;
        mip.es(this, jrzVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a(this.a);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (jrz.b(this.a)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
    }
}
