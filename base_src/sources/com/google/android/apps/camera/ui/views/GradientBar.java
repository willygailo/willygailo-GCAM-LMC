package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import defpackage.jrz;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class GradientBar extends View {
    public jrz a;

    public GradientBar(Context context) {
        super(context);
        this.a = jrz.PORTRAIT;
    }

    public GradientBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = jrz.PORTRAIT;
    }

    public final void a() {
        Trace.beginSection("unionBottombar2Navibar:applyOrientation");
        mip.es(this, this.a);
        Trace.endSection();
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("gradientBar:onLayout");
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a();
        }
        Trace.endSection();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        Trace.beginSection("unionBottombar2Navibar:onMeasure");
        if (jrz.b(this.a)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
        Trace.endSection();
    }
}
