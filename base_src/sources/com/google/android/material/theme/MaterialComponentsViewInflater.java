package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.mo;
import defpackage.mq;
import defpackage.nb;
import defpackage.nu;
import defpackage.nyg;
import defpackage.obf;
import defpackage.odi;
import defpackage.odl;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final mo a(Context context, AttributeSet attributeSet) {
        return new odi(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final mq c(Context context, AttributeSet attributeSet) {
        return new nyg(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final nb d(Context context, AttributeSet attributeSet) {
        return new obf(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final nu e(Context context, AttributeSet attributeSet) {
        return new odl(context, attributeSet);
    }
}
