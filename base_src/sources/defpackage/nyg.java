package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class nyg extends mq {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public nyg(Context context, AttributeSet attributeSet) {
        super(odn.a(context, attributeSet, com.google.android.GoogleCameraEngR18F1.R.attr.checkboxStyle, com.google.android.GoogleCameraEngR18F1.R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayA = nzw.a(context2, attributeSet, nyh.a, com.google.android.GoogleCameraEngR18F1.R.attr.checkboxStyle, com.google.android.GoogleCameraEngR18F1.R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        if (typedArrayA.hasValue(0)) {
            setButtonTintList(obr.c(context2, typedArrayA, 0));
        }
        this.c = typedArrayA.getBoolean(1, false);
        typedArrayA.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            if (this.b == null) {
                int[][] iArr = a;
                int length = iArr.length;
                int iE = obr.e(this, com.google.android.GoogleCameraEngR18F1.R.attr.colorControlActivated);
                int iE2 = obr.e(this, com.google.android.GoogleCameraEngR18F1.R.attr.colorSurface);
                int iE3 = obr.e(this, com.google.android.GoogleCameraEngR18F1.R.attr.colorOnSurface);
                this.b = new ColorStateList(iArr, new int[]{ohh.Y(iE2, iE, 1.0f), ohh.Y(iE2, iE3, 0.54f), ohh.Y(iE2, iE3, 0.38f), ohh.Y(iE2, iE3, 0.38f)});
            }
            setButtonTintList(this.b);
        }
    }
}
