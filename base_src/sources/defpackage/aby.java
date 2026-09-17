package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class aby implements Interpolator {
    private final /* synthetic */ int a;

    public aby(int i) {
        this.a = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            default:
                return Math.abs(f2);
        }
    }
}
