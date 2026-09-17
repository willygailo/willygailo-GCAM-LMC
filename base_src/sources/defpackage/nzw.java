package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nzw {
    private static final int[] a = {R.attr.colorPrimary};
    private static final int[] b = {R.attr.colorPrimaryVariant};

    public static TypedArray a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nzr.b, i, i2);
        boolean z = true;
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                b(context, b, "Theme.MaterialComponents");
            }
        }
        b(context, a, "Theme.AppCompat");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, nzr.b, i, i2);
        if (typedArrayObtainStyledAttributes2.getBoolean(2, false)) {
            if (iArr2.length != 0) {
                TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
                int i3 = 0;
                while (true) {
                    if (i3 > 0) {
                        typedArrayObtainStyledAttributes3.recycle();
                        break;
                    }
                    if (typedArrayObtainStyledAttributes3.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes3.recycle();
                        z = false;
                        break;
                    }
                    i3++;
                }
            } else if (typedArrayObtainStyledAttributes2.getResourceId(0, -1) == -1) {
                z = false;
            }
            typedArrayObtainStyledAttributes2.recycle();
            if (!z) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        } else {
            typedArrayObtainStyledAttributes2.recycle();
        }
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    private static void b(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i <= 0; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                StringBuilder sb = new StringBuilder(str.length() + 77);
                sb.append("The style on this component requires your app theme to be ");
                sb.append(str);
                sb.append(" (or a descendant).");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
