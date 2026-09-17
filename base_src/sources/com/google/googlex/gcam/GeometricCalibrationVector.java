package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class GeometricCalibrationVector {
    public transient long a;
    protected transient boolean b;

    public GeometricCalibrationVector() {
        this(GcamModuleJNI.new_GeometricCalibrationVector__SWIG_0(), true);
    }

    public GeometricCalibrationVector(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final void a(GeometricCalibration geometricCalibration) {
        GcamModuleJNI.GeometricCalibrationVector_add(this.a, this, geometricCalibration.a, geometricCalibration);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_GeometricCalibrationVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}
