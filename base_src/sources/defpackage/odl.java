package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class odl extends nu {
    public odl(Context context, AttributeSet attributeSet) {
        super(odn.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (c(context2)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, odm.b, R.attr.textViewStyle, 0);
            int iA = a(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iA != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, odm.b, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                b(theme, resourceId);
            }
        }
    }

    private static int a(Context context, TypedArray typedArray, int... iArr) {
        int iB = -1;
        for (int i = 0; i < 2 && iB < 0; i++) {
            iB = obr.b(context, typedArray, iArr[i], -1);
        }
        return iB;
    }

    private final void b(Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, odm.a);
        int iA = a(getContext(), typedArrayObtainStyledAttributes, 1, 2);
        typedArrayObtainStyledAttributes.recycle();
        if (iA >= 0) {
            fz.b(this, iA);
        }
    }

    private static boolean c(Context context) {
        return obr.h(context, com.google.android.GoogleCameraEngR18F1.R.attr.textAppearanceLineHeightEnabled, true);
    }

    @Override // defpackage.nu, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (c(context)) {
            b(context.getTheme(), i);
        }
    }
}
