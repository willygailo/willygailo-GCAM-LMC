package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class DngColorCalibrationVector {
    public transient long a;
    protected transient boolean b;

    public DngColorCalibrationVector() {
        long jNew_DngColorCalibrationVector__SWIG_0 = GcamModuleJNI.new_DngColorCalibrationVector__SWIG_0();
        this.b = true;
        this.a = jNew_DngColorCalibrationVector__SWIG_0;
    }

    public final void a(DngColorCalibration dngColorCalibration) {
        GcamModuleJNI.DngColorCalibrationVector_add(this.a, this, dngColorCalibration.a, dngColorCalibration);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_DngColorCalibrationVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}
