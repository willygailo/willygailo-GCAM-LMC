package com.google.android.apps.camera.ui.remotecontrol;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.jrz;

/* JADX INFO: loaded from: classes.dex */
public class RemoteControlView extends FrameLayout {
    public TextView a;
    public TextView b;
    public TextView c;
    public TextView d;
    public View e;
    public View f;
    private LinearLayout g;
    private int h;

    public RemoteControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void b(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
        layoutParams.topMargin = this.h;
        layoutParams.bottomMargin = this.h;
        layoutParams.gravity = i | 1;
        this.g.setLayoutParams(layoutParams);
    }

    public final void a() {
        this.b.setText("--");
        this.a.setText("--");
        this.c.setText("");
        this.e.setVisibility(8);
        this.d.setText("");
        this.f.setVisibility(8);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("RemoteControlUi:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.remote_control_view_contents, this);
        this.a = (TextView) findViewById(R.id.device_battery);
        this.b = (TextView) findViewById(R.id.phone_battery);
        this.c = (TextView) findViewById(R.id.water_depth);
        this.d = (TextView) findViewById(R.id.water_temp);
        this.e = findViewById(R.id.water_depth_container);
        this.f = findViewById(R.id.water_temp_container);
        this.g = (LinearLayout) findViewById(R.id.remote_control_content);
        this.h = getResources().getDimensionPixelSize(R.dimen.remote_control_view_margin);
        setLayerType(1, null);
        a();
        Trace.endSection();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (jrz.a(getDisplay(), getContext())) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
                layoutParams.topMargin = this.h;
                layoutParams.gravity = 49;
                this.g.setLayoutParams(layoutParams);
                break;
            case LANDSCAPE:
                b(80);
                break;
            case REVERSE_LANDSCAPE:
                b(48);
                break;
        }
        super.onMeasure(i, i2);
    }
}
