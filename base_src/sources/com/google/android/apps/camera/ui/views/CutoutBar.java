package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import defpackage.bpx;
import defpackage.dcw;
import defpackage.dcy;
import defpackage.ddf;
import defpackage.jrz;
import defpackage.mip;
import defpackage.ouj;

/* JADX INFO: loaded from: classes.dex */
public class CutoutBar extends View {
    public static final ouj a = ouj.h("com/google/android/apps/camera/ui/views/CutoutBar");
    public final dcw b;
    public float c;
    public float d;
    public float e;
    public jrz f;

    /* JADX WARN: Multi-variable type inference failed */
    public CutoutBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = jrz.PORTRAIT;
        ddf ddfVarA = ((bpx) context).a();
        this.b = dcy.a(ddfVarA, ((Integer) ddfVarA.a(dcy.a).c()).intValue());
    }

    public final void a() {
        Trace.beginSection("FrontLensIndicator:applyOrientation");
        mip.es(this, this.f);
        Trace.endSection();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f = this.c;
        float f2 = this.d;
        float f3 = this.e;
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        canvas.drawCircle(f, f2, f3, paint);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        Trace.beginSection("FrontLensIndicator:onMeasure");
        if (jrz.b(this.f)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
        Trace.endSection();
    }
}
