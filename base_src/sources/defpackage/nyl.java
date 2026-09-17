package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nyl {
    private static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public nyl(Context context) {
        boolean zH = obr.h(context, R.attr.elevationOverlayEnabled, false);
        int iX = ohh.X(context, R.attr.elevationOverlayColor, 0);
        int iX2 = ohh.X(context, R.attr.elevationOverlayAccentColor, 0);
        int iX3 = ohh.X(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = zH;
        this.d = iX;
        this.e = iX2;
        this.b = iX3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        float f2 = this.f;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iY = ohh.Y(ek.d(i, 255), this.d, fMin);
        if (fMin > 0.0f && (i2 = this.e) != 0) {
            iY = ek.c(ek.d(i2, c), iY);
        }
        return ek.d(iY, iAlpha);
    }

    public final int b(int i, float f) {
        return (this.a && ek.d(i, 255) == this.b) ? a(i, f) : i;
    }
}
