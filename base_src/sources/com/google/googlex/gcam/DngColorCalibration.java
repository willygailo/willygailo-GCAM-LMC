package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes2.dex */
public class DngColorCalibration {
    public transient long a;
    protected transient boolean b;

    public DngColorCalibration() {
        long jNew_DngColorCalibration = GcamModuleJNI.new_DngColorCalibration();
        this.b = true;
        this.a = jNew_DngColorCalibration;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_DngColorCalibration(j);
            }
            this.a = 0L;
        }
    }

    public final void b(int i) {
        GcamModuleJNI.DngColorCalibration_illuminant_set(this.a, this, i);
    }

    public final void c(FloatArray9 floatArray9) {
        GcamModuleJNI.DngColorCalibration_model_rgb_to_device_rgb_set(this.a, this, floatArray9.a, floatArray9);
    }

    public final void d(FloatArray9 floatArray9) {
        GcamModuleJNI.DngColorCalibration_xyz_to_model_rgb_set(this.a, this, floatArray9.a, floatArray9);
    }

    protected final void finalize() {
        a();
    }
}
