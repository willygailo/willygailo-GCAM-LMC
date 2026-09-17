package com.google.android.apps.camera.rewind.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.jrz;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class RewindPreview extends FrameLayout {
    public jrz a;

    public RewindPreview(Context context) {
        super(context);
    }

    public RewindPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RewindPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a() {
        mip.es(this, this.a);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a == null || !z) {
            return;
        }
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        jrz jrzVar = this.a;
        if (jrzVar == null || jrz.b(jrzVar)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
    }
}
