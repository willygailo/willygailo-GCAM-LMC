package com.google.android.apps.camera.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jpe;

/* JADX INFO: loaded from: classes.dex */
public class TracedFrameLayout extends FrameLayout {
    private final jpd a;

    public TracedFrameLayout(Context context) {
        super(context);
        this.a = a(this);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = a(this);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = a(this);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = a(this);
    }

    private static jpd a(View view) {
        Object tag = view.getTag();
        return tag == null ? jpc.a : new jpe(tag.toString());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.a.a("draw");
        super.draw(canvas);
        this.a.b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.a("onLayout");
        super.onLayout(z, i, i2, i3, i4);
        this.a.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.a.a("onMeasure");
        super.onMeasure(i, i2);
        this.a.b();
    }
}
