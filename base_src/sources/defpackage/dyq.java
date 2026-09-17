package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dyq {
    public static final ouj a = ouj.h("com/google/android/apps/camera/gyro/GyroVec");

    public static float a(float f, float f2, double d) {
        double d2 = f;
        Double.isNaN(d2);
        double d3 = f2;
        Double.isNaN(d3);
        return (float) (((1.0d - d) * d2) + (d * d3));
    }
}
