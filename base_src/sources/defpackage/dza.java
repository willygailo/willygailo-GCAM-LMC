package defpackage;

import android.graphics.Rect;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class dza {
    public static final ouj a = ouj.h("com/google/android/apps/camera/gyro/motionestimator/GyroTransformCalculator");
    public final enm b;
    public final int c;
    public final lig d;
    public final Object e = new Object();
    public final AtomicReference f = new AtomicReference();
    private final enr g;
    private final SizeF h;
    private final lig i;
    private final float j;
    private final Set k;

    public dza(SizeF sizeF, lig ligVar, lig ligVar2, int i, enm enmVar, enr enrVar, Set set) {
        obr.aF(true);
        this.h = sizeF;
        this.d = ligVar;
        this.i = ligVar2;
        this.c = i;
        this.b = enmVar;
        this.g = enrVar;
        this.k = set;
        float width = sizeF.getWidth() / sizeF.getHeight();
        float f = ligVar.a / ligVar.b;
        this.j = ((f / width) - 1.0f) / ((f + f) / width);
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        this.f.set(arrayList);
    }

    public static long d(long j, long j2, long j3) {
        return j + ((j2 + j3) / 2);
    }

    public final float a(float f, float f2, float[] fArr) {
        return (((1.0f / ((1.0f / f) - (f2 / 1000.0f))) * this.d.a) / this.h.getWidth()) * (fArr[0] + fArr[1]) * 0.5f;
    }

    public final long b(long j, float[] fArr) {
        float f = this.j;
        return (long) ((j * (1.0f - (f + f))) / fArr[1]);
    }

    public final long c(long j, long j2, float[] fArr) {
        if (j <= 0) {
            return j;
        }
        float f = j2;
        return j + ((long) (this.j * f)) + ((long) ((0.5f - (0.5f / fArr[1])) * f));
    }

    public final float[] e(String str, long j, long j2, long j3, lig ligVar, float[] fArr, boolean z) {
        float[] fArrB = {0.0f, 0.0f};
        if ((str == null || !this.k.contains(str)) && j >= 0) {
            long jD = d(j, j2, j3);
            fArrB = z ? this.g.b(jD, j3) : this.g.a(jD);
        }
        return new float[]{(ligVar.a - 1) * ((fArrB[0] * fArr[0]) + 0.5f), (ligVar.b - 1) * ((fArrB[1] * fArr[1]) + 0.5f)};
    }

    public final float[] f(Rect rect) {
        float[] fArr = {1.0f, 1.0f};
        if (rect != null) {
            fArr[0] = this.i.a / (rect.right - rect.left);
            fArr[1] = this.i.b / (rect.bottom - rect.top);
        }
        return fArr;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.h);
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 113 + String.valueOf(strValueOf2).length());
        sb.append("AbsoluteGyroTransformCalculator{imageSize=");
        sb.append(strValueOf);
        sb.append(", sensorSize=");
        sb.append(strValueOf2);
        sb.append(", timeoutMs=0, numOfStrips=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
