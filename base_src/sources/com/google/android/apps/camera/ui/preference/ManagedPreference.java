package com.google.android.apps.camera.ui.preference;

import android.R;
import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.jhx;

/* JADX INFO: loaded from: classes.dex */
public class ManagedPreference extends Preference {
    public ManagedPreference(Context context) {
        super(context);
    }

    public ManagedPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ManagedPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.preference.Preference
    protected final void onBindView(View view) {
        super.onBindView(view);
        TextView textView = (TextView) view.findViewById(R.id.summary);
        if (textView != null) {
            textView.setAccessibilityDelegate(new jhx());
        }
    }
}
