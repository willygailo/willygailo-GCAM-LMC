package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.gl;
import defpackage.oae;
import defpackage.oaf;
import defpackage.oao;
import defpackage.oav;
import defpackage.oaw;
import defpackage.oaz;
import defpackage.obc;
import defpackage.obd;

/* JADX INFO: loaded from: classes.dex */
public final class LinearProgressIndicator extends oae {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        Context context2 = getContext();
        obd obdVar = (obd) this.a;
        setIndeterminateDrawable(new oav(context2, obdVar, new oaw(obdVar), obdVar.g == 0 ? new oaz(obdVar) : new obc(context2, obdVar)));
        Context context3 = getContext();
        obd obdVar2 = (obd) this.a;
        setProgressDrawable(new oao(context3, obdVar2, new oaw(obdVar2)));
    }

    @Override // defpackage.oae
    public final /* bridge */ /* synthetic */ oaf a(Context context, AttributeSet attributeSet) {
        return new obd(context, attributeSet);
    }

    @Override // defpackage.oae
    public final void g(int i) {
        oaf oafVar = this.a;
        if (oafVar != null && ((obd) oafVar).g == 0 && isIndeterminate()) {
            return;
        }
        super.g(i);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        obd obdVar = (obd) this.a;
        boolean z2 = false;
        if (obdVar.h == 1 || ((gl.f(this) == 1 && ((obd) this.a).h == 2) || (gl.f(this) == 0 && ((obd) this.a).h == 3))) {
            z2 = true;
        }
        obdVar.i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        oav indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        oao progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }
}
