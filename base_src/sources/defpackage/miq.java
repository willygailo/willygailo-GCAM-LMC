package defpackage;

import android.app.Activity;
import android.content.res.TypedArray;
import com.Helper;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class miq {
    private static final int[] a = {R.attr.dynamicColorThemeOverlay};

    public static void a(Activity activity) {
        if (Helper.MnFix()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            activity.setTheme(resourceId);
        }
    }
}
