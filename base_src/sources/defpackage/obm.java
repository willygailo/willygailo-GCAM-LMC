package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;

/* JADX INFO: loaded from: classes2.dex */
public final class obm {
    private static final int[] a = {R.attr.state_pressed};
    private static final int[] b = {R.attr.state_selected, R.attr.state_pressed};
    private static final int[] c = {R.attr.state_selected};

    static {
        obm.class.getSimpleName();
    }

    private obm() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{c, StateSet.NOTHING}, new int[]{c(colorStateList, b), c(colorStateList, a)});
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        int iAlpha = Color.alpha(colorForState);
        return ek.d(colorForState, Math.min(iAlpha + iAlpha, 255));
    }
}
