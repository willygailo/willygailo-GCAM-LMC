package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class aar {
    public static Drawable a(Context context, int i) {
        return context.getDrawable(i);
    }

    public static float b(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int iMin = Math.min((int) (200.0f * f), 199);
        float f2 = fArr[iMin];
        return f2 + (((f - (iMin * 0.005f)) / 0.005f) * (fArr[iMin + 1] - f2));
    }
}
