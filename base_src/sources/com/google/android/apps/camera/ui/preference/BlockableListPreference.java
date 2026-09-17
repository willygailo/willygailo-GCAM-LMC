package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import defpackage.jhu;
import j$.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class BlockableListPreference extends ListPreference implements jhu {
    private Function a;

    public BlockableListPreference(Context context) {
        super(context);
    }

    public BlockableListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BlockableListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // defpackage.jhu
    public final void a(Function function) {
        this.a = function;
    }

    @Override // android.preference.DialogPreference, android.preference.Preference
    protected final void onClick() {
        Function function = this.a;
        if (function == null || !((Boolean) function.apply(this)).booleanValue()) {
            super.onClick();
        }
    }
}
