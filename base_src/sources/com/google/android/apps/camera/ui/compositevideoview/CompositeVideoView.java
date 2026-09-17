package com.google.android.apps.camera.ui.compositevideoview;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.VideoView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import defpackage.iwd;
import defpackage.iwe;
import defpackage.iwf;
import defpackage.iwg;
import defpackage.iwh;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeVideoView extends FrameLayout implements iwh {
    public VideoView a;
    public iwg b;
    private ImageView c;
    private CircularProgressIndicator d;

    public CompositeVideoView(Context context) {
        super(context);
    }

    public CompositeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompositeVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // defpackage.iwh
    public final void a() {
        this.c.setVisibility(8);
    }

    @Override // defpackage.iwh
    public final void b() {
        this.a.pause();
    }

    @Override // defpackage.iwh
    public final void c(iwg iwgVar) {
        this.b = iwgVar;
    }

    @Override // defpackage.iwh
    public final void d(float f) {
        this.d.setIndeterminate(false);
        CircularProgressIndicator circularProgressIndicator = this.d;
        circularProgressIndicator.setProgress((int) (circularProgressIndicator.getMax() * f));
    }

    @Override // defpackage.iwh
    public final void e(String str) {
        this.a.setVideoURI(Uri.parse(str));
    }

    @Override // defpackage.iwh
    public final void f() {
        this.d.setVisibility(8);
        this.c.setImageResource(R.drawable.quantum_gm_ic_get_app_white_24);
        ImageView imageView = this.c;
        imageView.setContentDescription(imageView.getResources().getString(R.string.cvv_download_desc));
        this.c.setOnClickListener(new iwd(this, 0));
        this.c.setVisibility(0);
    }

    @Override // defpackage.iwh
    public final void g() {
        this.d.setVisibility(8);
        this.c.setImageResource(R.drawable.gm_filled_play_arrow_white_24);
        ImageView imageView = this.c;
        imageView.setContentDescription(imageView.getResources().getString(R.string.cvv_play_desc));
        this.c.setOnClickListener(new iwd(this, 2));
        this.c.setVisibility(0);
    }

    @Override // defpackage.iwh
    public final void h() {
        this.c.setImageResource(R.drawable.quantum_gm_ic_get_app_white_24);
        ImageView imageView = this.c;
        imageView.setContentDescription(imageView.getResources().getString(R.string.cvv_download_desc));
        this.c.setOnClickListener(null);
        this.c.setVisibility(0);
        this.d.setVisibility(0);
    }

    @Override // defpackage.iwh
    public final void i() {
        this.a.start();
        this.a.setBackground(null);
    }

    @Override // defpackage.iwh
    public final void j() {
        this.a.stopPlayback();
    }

    @Override // defpackage.iwh
    public final boolean k() {
        return this.a.isPlaying();
    }

    @Override // defpackage.iwh
    public final void l() {
        this.a.seekTo(41);
        this.a.setBackground(null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundResource(R.drawable.cvv_root_background);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setClipToOutline(true);
        LayoutInflater.from(getContext()).inflate(R.layout.cvv_root, this);
        this.a = (VideoView) findViewById(R.id.cvv_videoview);
        this.c = (ImageView) findViewById(R.id.cvv_control);
        this.d = (CircularProgressIndicator) findViewById(R.id.cvv_progressbar);
        this.a.setOnTouchListener(new iwe(new GestureDetector(getContext(), new iwf(this)), 0));
        this.a.setOnClickListener(new iwd(this, 1));
        this.a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: iwb
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                iwg iwgVar = this.a.b;
                if (iwgVar != null) {
                    iwgVar.onCompletion(mediaPlayer);
                }
            }
        });
        this.a.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: iwc
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                iwg iwgVar = this.a.b;
                if (iwgVar != null) {
                    iwgVar.onPrepared(mediaPlayer);
                }
            }
        });
        f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.round((View.MeasureSpec.getSize(i) * 16.0f) / 9.0f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
