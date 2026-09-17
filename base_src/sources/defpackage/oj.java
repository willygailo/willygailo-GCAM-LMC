package defpackage;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class oj {
    public static final Rect a = new Rect();

    static {
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException e) {
        }
    }

    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static Rect b(Drawable drawable) {
        Insets opticalInsets = drawable.getOpticalInsets();
        Rect rect = new Rect();
        rect.left = opticalInsets.left;
        rect.right = opticalInsets.right;
        rect.top = opticalInsets.top;
        rect.bottom = opticalInsets.bottom;
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof eq) {
                return c(((eq) drawable).a());
            }
            if (drawable instanceof js) {
                return c(((js) drawable).a);
            }
            if (drawable instanceof ScaleDrawable) {
                return c(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!c(drawable2)) {
                return false;
            }
        }
        return true;
    }
}
