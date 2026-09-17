package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetadata {
    public transient long a;
    protected transient boolean b;

    public FrameMetadata() {
        this(GcamModuleJNI.new_FrameMetadata(), true);
    }

    public FrameMetadata(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(FrameMetadata frameMetadata) {
        if (frameMetadata == null) {
            return 0L;
        }
        return frameMetadata.a;
    }

    public final int a() {
        return GcamModuleJNI.FrameMetadata_sensor_id_get(this.a, this);
    }

    public final long c() {
        return GcamModuleJNI.FrameMetadata_timestamp_ns_get(this.a, this);
    }

    public final AeMetadata d() {
        long jFrameMetadata_ae_get = GcamModuleJNI.FrameMetadata_ae_get(this.a, this);
        if (jFrameMetadata_ae_get == 0) {
            return null;
        }
        return new AeMetadata(jFrameMetadata_ae_get);
    }

    public final AfMetadata e() {
        long jFrameMetadata_af_get = GcamModuleJNI.FrameMetadata_af_get(this.a, this);
        if (jFrameMetadata_af_get == 0) {
            return null;
        }
        return new AfMetadata(jFrameMetadata_af_get);
    }

    public final AwbMetadata f() {
        long jFrameMetadata_awb_get = GcamModuleJNI.FrameMetadata_awb_get(this.a, this);
        if (jFrameMetadata_awb_get == 0) {
            return null;
        }
        return new AwbMetadata(jFrameMetadata_awb_get);
    }

    protected final void finalize() {
        h();
    }

    public final LiveHdrMetadata g() {
        long jFrameMetadata_live_hdr_get = GcamModuleJNI.FrameMetadata_live_hdr_get(this.a, this);
        if (jFrameMetadata_live_hdr_get == 0) {
            return null;
        }
        return new LiveHdrMetadata(jFrameMetadata_live_hdr_get, false);
    }

    public final synchronized void h() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FrameMetadata(j);
            }
            this.a = 0L;
        }
    }

    public final void i(FloatArray4 floatArray4) {
        GcamModuleJNI.FrameMetadata_black_levels_bayer_set(this.a, this, floatArray4.a, floatArray4);
    }

    public final void j(int i) {
        GcamModuleJNI.FrameMetadata_flash_set(this.a, this, i);
    }
}
