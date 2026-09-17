package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import defpackage.jkc;
import defpackage.jkz;
import defpackage.jlj;
import defpackage.jsa;

/* JADX INFO: loaded from: classes.dex */
public class SnapshotButton extends ShutterButton {
    public SnapshotButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButton
    protected float getDefaultScale() {
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.snapshot_button_scale, typedValue, true);
        return typedValue.getFloat();
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButton
    protected float getOuterCircleStrokeWidth() {
        return jsa.b(2.0f);
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButton
    public void setClickEnabled(boolean z) {
        super.setClickEnabled(z);
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButton
    public void setMode(jkc jkcVar, jkz jkzVar, boolean z) {
        if (jkcVar.equals(jkc.PHOTO_PRESSED)) {
            super.setMode(jkc.PHOTO_PRESSED, jkzVar, z);
        } else {
            super.setMode(jkc.PHOTO_IDLE, jkzVar, z);
        }
    }

    public void wirePressedStateAnimationListener() {
        final jkz jkzVar = new jkz(this);
        setListener(new jlj() { // from class: com.google.android.apps.camera.bottombar.SnapshotButton.1
            @Override // defpackage.jlj, defpackage.jli
            public void onShutterButtonPressedStateChanged(boolean z) {
                SnapshotButton.this.runPressedStateAnimation(z, jkzVar);
            }
        });
        setClickEnabled(true);
    }
}
