package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.mw;

/* JADX INFO: loaded from: classes.dex */
public class ScalableButton extends mw {
    private static final float DEFAULT_SIZE = 1.0f;
    private static final float SCALED_SIZE = 1.05f;

    public ScalableButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    private void initialize() {
        super.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.apps.camera.bottombar.ScalableButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ScalableButton.lambda$initialize$0(view, motionEvent);
                return false;
            }
        });
    }

    static /* synthetic */ boolean lambda$initialize$0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.animate().scaleX(SCALED_SIZE);
            view.animate().scaleY(SCALED_SIZE);
            return false;
        }
        if (motionEvent.getAction() != 1) {
            return false;
        }
        view.animate().scaleX(DEFAULT_SIZE);
        view.animate().scaleY(DEFAULT_SIZE);
        return false;
    }
}
