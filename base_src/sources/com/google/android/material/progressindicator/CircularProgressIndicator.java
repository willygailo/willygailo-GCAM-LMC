package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.oae;
import defpackage.oaf;
import defpackage.oag;
import defpackage.oal;
import defpackage.oam;
import defpackage.oao;
import defpackage.oav;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressIndicator extends oae {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        Context context2 = getContext();
        oam oamVar = (oam) this.a;
        setIndeterminateDrawable(new oav(context2, oamVar, new oag(oamVar), new oal(oamVar)));
        Context context3 = getContext();
        oam oamVar2 = (oam) this.a;
        setProgressDrawable(new oao(context3, oamVar2, new oag(oamVar2)));
    }

    @Override // defpackage.oae
    public final /* bridge */ /* synthetic */ oaf a(Context context, AttributeSet attributeSet) {
        return new oam(context, attributeSet);
    }
}
