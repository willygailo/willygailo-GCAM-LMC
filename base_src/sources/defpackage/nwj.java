package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class nwj {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new adt();
    public static final TimeInterpolator c = new ads();
    public static final TimeInterpolator d = new adu();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 < f3) {
            return f;
        }
        return f5 > f4 ? f2 : f + (((f5 - f3) / (f4 - f3)) * (f2 - f));
    }

    public static int c(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
