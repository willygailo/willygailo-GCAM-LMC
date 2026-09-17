package com.google.android.apps.camera.progressoverlay;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public class ProgressOverlay extends FrameLayout {
    public AnimatedVectorDrawable a;
    private ImageView b;

    public ProgressOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        super.onFinishInflate();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        removeAllViewsInLayout();
        layoutInflater.inflate(R.layout.large_progress_overlay, this);
        this.b = (ImageView) findViewById(R.id.large_progress_circular);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(R.drawable.large_processing_indicator_animation);
        this.a = animatedVectorDrawable;
        this.b.setImageDrawable(animatedVectorDrawable);
    }

    public final void b() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.progress_overlay, this);
        this.b = (ImageView) findViewById(R.id.progress_circular);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(R.drawable.processing_indicator_animation);
        this.a = animatedVectorDrawable;
        this.b.setImageDrawable(animatedVectorDrawable);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        b();
    }
}
