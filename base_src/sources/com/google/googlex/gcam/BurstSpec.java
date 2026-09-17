package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes2.dex */
public class BurstSpec {
    public transient long a;
    protected transient boolean b;

    public BurstSpec() {
        this(GcamModuleJNI.new_BurstSpec());
    }

    public BurstSpec(long j) {
        this.b = true;
        this.a = j;
    }

    public final float a(float f, boolean z) {
        return GcamModuleJNI.BurstSpec_TotalCaptureTimeMs__SWIG_0(this.a, this, f, z);
    }

    public final FrameRequestVector b() {
        long jBurstSpec_frame_requests_get = GcamModuleJNI.BurstSpec_frame_requests_get(this.a, this);
        if (jBurstSpec_frame_requests_get == 0) {
            return null;
        }
        return new FrameRequestVector(jBurstSpec_frame_requests_get, false);
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_BurstSpec(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        c();
    }
}
