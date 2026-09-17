package com.google.android.apps.camera.ui.elapsedtimeui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public class ElapsedTimerView extends LinearLayout {
    public ElapsedTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final TextView a() {
        return (TextView) findViewById(R.id.output_timer);
    }

    public final TextView b() {
        return (TextView) findViewById(R.id.recording_timer);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.elapsed_time_layout, this);
        setLayerType(1, null);
    }
}
