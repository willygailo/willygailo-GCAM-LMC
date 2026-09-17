package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class FrameRequest {
    public transient long a;
    protected transient boolean b;

    public FrameRequest() {
        this(GcamModuleJNI.new_FrameRequest__SWIG_0(), true);
    }

    public FrameRequest(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final float a() {
        return GcamModuleJNI.FrameRequest_desired_analog_gain_get(this.a, this);
    }

    public final float b() {
        return GcamModuleJNI.FrameRequest_desired_digital_gain_get(this.a, this);
    }

    public void b(float f) {
        GcamModuleJNI.FrameRequest_desired_exposure_time_ms_set(this.a, this, f);
    }

    public final float c() {
        return GcamModuleJNI.FrameRequest_desired_exposure_time_ms_get(this.a, this);
    }

    public final int d() {
        return GcamModuleJNI.FrameRequest_type_get(this.a, this);
    }

    public final synchronized void e() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FrameRequest(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        e();
    }

    public void setDesired_analog_gain(float f) {
        GcamModuleJNI.FrameRequest_desired_analog_gain_set(this.a, this, f);
    }
}
