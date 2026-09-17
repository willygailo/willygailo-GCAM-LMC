package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public class PauseResumeButton extends ImageButton {
    private static final int[] STATE_PAUSED = {R.attr.state_paused};
    private final Context context;
    private boolean firstTimeLaunch;
    private boolean isP20NewUI;
    private boolean isResumeState;
    private PauseResumeButtonListener listener;
    private Drawable pauseResumeAnimatable;
    private Drawable resumePauseAnimatable;

    public interface PauseResumeButtonListener {
        void onPauseButtonClicked();

        void onResumeButtonClicked();
    }

    public PauseResumeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.firstTimeLaunch = true;
        this.isP20NewUI = false;
        this.context = context;
    }

    public boolean isResumeState() {
        return this.isResumeState;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.isResumeState) {
            return super.onCreateDrawableState(i);
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        mergeDrawableStates(iArrOnCreateDrawableState, STATE_PAUSED);
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        transitionToPauseState(this.isP20NewUI);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.firstTimeLaunch) {
            transitionToPauseState(this.isP20NewUI);
            this.firstTimeLaunch = false;
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.isResumeState) {
            PauseResumeButtonListener pauseResumeButtonListener = this.listener;
            if (pauseResumeButtonListener != null) {
                pauseResumeButtonListener.onResumeButtonClicked();
            }
        } else {
            PauseResumeButtonListener pauseResumeButtonListener2 = this.listener;
            if (pauseResumeButtonListener2 != null) {
                pauseResumeButtonListener2.onPauseButtonClicked();
            }
        }
        return super.performClick();
    }

    public void resetButton(boolean z) {
        transitionToPauseState(z);
        refreshDrawableState();
    }

    public void setListener(PauseResumeButtonListener pauseResumeButtonListener, boolean z) {
        this.listener = pauseResumeButtonListener;
        this.isP20NewUI = z;
    }

    protected void transitionToPauseState(boolean z) {
        if (this.resumePauseAnimatable == null || this.firstTimeLaunch) {
            this.resumePauseAnimatable = this.context.getResources().getDrawable(z ? R.drawable.ic_pause_circle_outline_24px : R.drawable.ic_resume_pause_animation, null);
        }
        setImageDrawable(this.resumePauseAnimatable);
        if (z) {
            setBackground(this.context.getResources().getDrawable(R.drawable.crossfade_button_background));
        } else {
            ((Animatable) this.resumePauseAnimatable).start();
            setBackground(this.context.getResources().getDrawable(R.drawable.crossfade_button_background_legacy));
        }
        this.isP20NewUI = z;
        this.isResumeState = false;
        setContentDescription(getResources().getString(R.string.pause_video_recording));
        refreshDrawableState();
    }

    protected void transitionToResumeState(boolean z) {
        if (this.pauseResumeAnimatable == null || this.firstTimeLaunch) {
            this.pauseResumeAnimatable = this.context.getResources().getDrawable(z ? R.drawable.resume_center_circle : R.drawable.ic_pause_resume_animation, null);
        }
        setImageDrawable(this.pauseResumeAnimatable);
        if (!z) {
            ((Animatable) this.pauseResumeAnimatable).start();
        }
        this.isP20NewUI = z;
        this.isResumeState = true;
        setContentDescription(getResources().getString(R.string.resume_video_recording));
        refreshDrawableState();
    }
}
