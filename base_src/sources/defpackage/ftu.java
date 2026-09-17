package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ftu {
    private final float[] a;
    private final float[] b;

    public ftu(float[] fArr, float[] fArr2) {
        this.a = fArr;
        this.b = fArr2;
    }

    public final float a(float f) {
        int iBinarySearch = Arrays.binarySearch(this.a, f);
        if (iBinarySearch == -1) {
            return this.b[0];
        }
        if (iBinarySearch < -201) {
            return this.b[200];
        }
        if (iBinarySearch >= 0) {
            return this.b[iBinarySearch];
        }
        int i = (-iBinarySearch) - 1;
        float[] fArr = this.a;
        int i2 = i - 1;
        float f2 = fArr[i2];
        float[] fArr2 = this.b;
        float f3 = fArr2[i2];
        float f4 = fArr[i];
        float f5 = fArr2[i];
        if (f <= f2) {
            return f3;
        }
        return f < f4 ? f3 + (((f - f2) / (f4 - f2)) * (f5 - f3)) : f5;
    }
}
