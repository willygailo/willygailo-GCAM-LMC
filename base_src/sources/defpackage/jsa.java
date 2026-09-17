package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jsa {
    private static final ouj a = ouj.h("com/google/android/apps/camera/uiutils/UiUtils");

    public static float a(float f) {
        return f * 0.0624f;
    }

    public static int b(float f) {
        return Math.round(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
    }

    public static void c(LinearLayout linearLayout) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            arrayList.add(linearLayout.getChildAt(i));
        }
        linearLayout.removeAllViews();
        Iterator it = obr.al(arrayList).iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
    }

    public static boolean d(View view) {
        int[] iArrE = e(view.getRootView());
        if (iArrE[0] != 0 || iArrE[1] != 0) {
            return true;
        }
        if (view.getRootWindowInsets() != null) {
            return view.getRootWindowInsets().getDisplayCutout() != null;
        }
        ((oug) ((oug) a.b()).G((char) 3490)).o("WindowInsets is null. Not able to check cutouts status!");
        return false;
    }

    public static int[] e(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }
}
