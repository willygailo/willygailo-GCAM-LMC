package com.google.googlex.gcam;

import com.Helper;

/* JADX INFO: loaded from: classes.dex */
public class GeometricCalibration {
    public transient long a;
    protected transient boolean b;

    public GeometricCalibration() {
        long jNew_GeometricCalibration = GcamModuleJNI.new_GeometricCalibration();
        this.b = true;
        this.a = jNew_GeometricCalibration;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_GeometricCalibration(j);
            }
            this.a = 0L;
        }
    }

    public final void b(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_distortion_set(this.a, this, fArr);
    }

    public final void c(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_intrinsic_calibration_set(this.a, this, fArr);
    }

    public final void d(int i) {
        if (Helper.GeometricCalibration != 0) {
            i = 1;
        }
        GcamModuleJNI.GeometricCalibration_quality_set(this.a, this, i);
    }

    protected final void finalize() {
        a();
    }
}
