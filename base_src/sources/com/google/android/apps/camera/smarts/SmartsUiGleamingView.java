package com.google.android.apps.camera.smarts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.iab;
import defpackage.lar;

/* JADX INFO: loaded from: classes.dex */
public class SmartsUiGleamingView extends View {
    public AnimatedVectorDrawable a;
    public int b;
    private AnimatedVectorDrawable c;

    public SmartsUiGleamingView(Context context) {
        super(context);
    }

    public SmartsUiGleamingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        lar.a();
        this.c.setVisible(false, false);
        this.a.setVisible(false, false);
        setVisibility(4);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        this.c.draw(canvas);
        this.a.draw(canvas);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        iab iabVar = new iab(this);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.gleam_animated_vector, null);
        this.c = animatedVectorDrawable;
        animatedVectorDrawable.setCallback(this);
        getResources().getDimensionPixelSize(R.dimen.smarts_gleam_animation_width);
        this.c.registerAnimationCallback(iabVar);
        this.c.setVisible(false, false);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.longpress_gleam_animated_vector, null);
        this.a = animatedVectorDrawable2;
        animatedVectorDrawable2.setCallback(this);
        this.b = getResources().getDimensionPixelSize(R.dimen.smarts_longpress_gleam_animation_width) / 2;
        this.a.registerAnimationCallback(iabVar);
        this.a.setVisible(false, false);
        setVisibility(4);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.c || drawable == this.a || super.verifyDrawable(drawable);
    }
}
