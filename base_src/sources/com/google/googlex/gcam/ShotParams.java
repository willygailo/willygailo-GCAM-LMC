package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class ShotParams {
    public transient long a;
    protected transient boolean b;

    public ShotParams() {
        this(GcamModuleJNI.new_ShotParams__SWIG_0());
    }

    public ShotParams(long j) {
        this.b = true;
        this.a = j;
    }

    public ShotParams(ShotParams shotParams) {
        this(GcamModuleJNI.new_ShotParams__SWIG_1(shotParams.a, shotParams));
    }

    public final AeShotParams a() {
        long jShotParams_ae_get = GcamModuleJNI.ShotParams_ae_get(this.a, this);
        if (jShotParams_ae_get == 0) {
            return null;
        }
        return new AeShotParams(jShotParams_ae_get, false);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ShotParams(j);
            }
            this.a = 0L;
        }
    }

    public final void c(AwbInfo awbInfo) {
        GcamModuleJNI.ShotParams_force_wb_set(this.a, this, AwbInfo.a(awbInfo), awbInfo);
    }

    public final void d(int i) {
        GcamModuleJNI.ShotParams_image_rotation_set(this.a, this, i);
    }

    public final void e(boolean z) {
        GcamModuleJNI.ShotParams_manually_rotate_final_jpg_set(this.a, this, z);
    }

    public final void f(boolean z) {
        GcamModuleJNI.ShotParams_recompute_wb_on_base_frame_set(this.a, this, z);
    }

    protected final void finalize() {
        b();
    }

    public final void g(boolean z) {
        GcamModuleJNI.ShotParams_shasta_enabled_set(this.a, this, z);
    }

    public final void h(float f) {
        GcamModuleJNI.ShotParams_tripod_max_total_capture_time_ms_set(this.a, this, f);
    }
}
