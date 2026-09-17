package com.google.android.apps.camera.ui.elapsedtimeui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.elapsedtimeui.LongPressElapsedTimeView;

/* JADX INFO: loaded from: classes.dex */
public class LongPressElapsedTimeView extends LinearLayout {
    public Animation a;
    public Animation b;
    public ImageView c;
    public final Runnable d;

    public LongPressElapsedTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Runnable() { // from class: jbc
            @Override // java.lang.Runnable
            public final void run() {
                LongPressElapsedTimeView longPressElapsedTimeView = this.a;
                ImageView imageView = longPressElapsedTimeView.c;
                if (imageView != null) {
                    if (imageView.getVisibility() == 0) {
                        longPressElapsedTimeView.c.setVisibility(4);
                    } else {
                        longPressElapsedTimeView.c.setVisibility(0);
                    }
                    longPressElapsedTimeView.postDelayed(longPressElapsedTimeView.d, 500L);
                }
            }
        };
    }

    public final TextView a() {
        return (TextView) findViewById(R.id.long_shot_output_timer);
    }

    public final TextView b() {
        return (TextView) findViewById(R.id.long_shot_recording_timer);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.longshot_elapsed_time_layout, this);
        setLayerType(1, null);
        setBackground(getResources().getDrawable(R.drawable.top_shot_background, null));
        this.a = AnimationUtils.loadAnimation(getContext(), R.anim.blink_animation);
        this.b = AnimationUtils.loadAnimation(getContext(), R.anim.blink_animation_2s);
        this.c = (ImageView) findViewById(R.id.indicator_icon);
    }
}
