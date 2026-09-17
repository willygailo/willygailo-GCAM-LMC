package com.google.android.apps.camera.rewind;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextSwitcher;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public class RewindExportShotView extends TextSwitcher {
    public final String a;
    public final String b;

    public RewindExportShotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = getResources().getString(R.string.mcfly_export_hdr_shot_button_text);
        this.b = getResources().getString(R.string.mcfly_export_shot_button_text);
    }
}
