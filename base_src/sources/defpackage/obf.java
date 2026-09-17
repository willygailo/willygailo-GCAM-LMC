package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class obf extends nb {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public obf(Context context, AttributeSet attributeSet) {
        super(odn.a(context, attributeSet, com.google.android.GoogleCameraEngR18F1.R.attr.radioButtonStyle, com.google.android.GoogleCameraEngR18F1.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayA = nzw.a(context2, attributeSet, obg.a, com.google.android.GoogleCameraEngR18F1.R.attr.radioButtonStyle, com.google.android.GoogleCameraEngR18F1.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
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
                int iE = obr.e(this, com.google.android.GoogleCameraEngR18F1.R.attr.colorControlActivated);
                int iE2 = obr.e(this, com.google.android.GoogleCameraEngR18F1.R.attr.colorOnSurface);
                int iE3 = obr.e(this, com.google.android.GoogleCameraEngR18F1.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                this.b = new ColorStateList(iArr, new int[]{ohh.Y(iE3, iE, 1.0f), ohh.Y(iE3, iE2, 0.54f), ohh.Y(iE3, iE2, 0.38f), ohh.Y(iE3, iE2, 0.38f)});
            }
            setButtonTintList(this.b);
        }
    }
}
