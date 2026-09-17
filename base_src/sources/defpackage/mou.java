package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mou {
    public static final mou a = a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    public static final mou b = a(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    public final float[] c;

    private mou(float[] fArr) {
        obr.aF(fArr.length == 9);
        this.c = fArr;
    }

    public static mou a(float[] fArr) {
        return new mou(Arrays.copyOf(fArr, fArr.length));
    }

    public static mou b() {
        return a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    }

    public final mou c(mou mouVar) {
        float[] fArrD = mouVar.d();
        float[] fArr = new float[9];
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    int i4 = i * 3;
                    int i5 = i4 + i2;
                    fArr[i5] = fArr[i5] + (this.c[(i3 * 3) + i2] * fArrD[i4 + i3]);
                }
            }
        }
        return a(fArr);
    }

    public final float[] d() {
        float[] fArr = this.c;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final float[] e(float[] fArr) {
        float[] fArr2 = this.c;
        float f = fArr2[6];
        float f2 = fArr[0];
        float f3 = fArr2[7];
        float f4 = fArr[1];
        float f5 = (f * f2) + (f3 * f4) + fArr2[8];
        return new float[]{(((fArr2[0] * f2) + (fArr2[1] * f4)) + fArr2[2]) / f5, (((fArr2[3] * fArr[0]) + (fArr2[4] * fArr[1])) + fArr2[5]) / f5};
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mou) {
            return Arrays.equals(this.c, ((mou) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    public final String toString() {
        float[] fArr = this.c;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        StringBuilder sb = new StringBuilder(153);
        sb.append("[");
        sb.append(f);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(f3);
        sb.append("; ");
        sb.append(f4);
        sb.append(", ");
        sb.append(f5);
        sb.append(", ");
        sb.append(f6);
        sb.append("; ");
        sb.append(f7);
        sb.append(", ");
        sb.append(f8);
        sb.append(", ");
        sb.append(f9);
        sb.append("]");
        return sb.toString();
    }
}
