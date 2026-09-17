package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import defpackage.gl;
import defpackage.mw;
import defpackage.nzk;
import defpackage.nzl;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends mw implements Checkable {
    private static final int[] c = {R.attr.state_checked};
    public boolean a;
    public boolean b;
    private boolean d;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.GoogleCameraEngR18F1.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.d = true;
        gl.F(this, new nzk(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), c) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nzl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nzl nzlVar = (nzl) parcelable;
        super.onRestoreInstanceState(nzlVar.d);
        setChecked(nzlVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        nzl nzlVar = new nzl(super.onSaveInstanceState());
        nzlVar.a = this.a;
        return nzlVar;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.b || this.a == z) {
            return;
        }
        this.a = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.d) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }
}
