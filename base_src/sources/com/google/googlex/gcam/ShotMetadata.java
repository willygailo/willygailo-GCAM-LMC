package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class ShotMetadata {
    public transient long a;
    protected transient boolean b;

    public ShotMetadata() {
        this(GcamModuleJNI.new_ShotMetadata__SWIG_0());
    }

    public ShotMetadata(long j) {
        this.b = true;
        this.a = j;
    }

    public static long c(ShotMetadata shotMetadata) {
        if (shotMetadata == null) {
            return 0L;
        }
        return shotMetadata.a;
    }

    public final int a() {
        return GcamModuleJNI.ShotMetadata_icc_profile_get(this.a, this);
    }

    public final int b() {
        return GcamModuleJNI.ShotMetadata_image_rotation_get(this.a, this);
    }

    public final long d() {
        return GcamModuleJNI.ShotMetadata_timestamp_unix_us_get(this.a, this);
    }

    public final AeResults e() {
        long jShotMetadata_ae_results_get = GcamModuleJNI.ShotMetadata_ae_results_get(this.a, this);
        if (jShotMetadata_ae_results_get == 0) {
            return null;
        }
        return new AeResults(jShotMetadata_ae_results_get, false);
    }

    public final FrameMetadata f() {
        long jShotMetadata_frame_metadata_get = GcamModuleJNI.ShotMetadata_frame_metadata_get(this.a, this);
        if (jShotMetadata_frame_metadata_get == 0) {
            return null;
        }
        return new FrameMetadata(jShotMetadata_frame_metadata_get, false);
    }

    protected final void finalize() {
        l();
    }

    public final StaticMetadata g() {
        long jShotMetadata_static_metadata_get = GcamModuleJNI.ShotMetadata_static_metadata_get(this.a, this);
        if (jShotMetadata_static_metadata_get == 0) {
            return null;
        }
        return new StaticMetadata(jShotMetadata_static_metadata_get, false);
    }

    public final String h() {
        return GcamModuleJNI.ShotMetadata_makernote_get(this.a, this);
    }

    public final String i() {
        return GcamModuleJNI.ShotMetadata_software_suffix_get(this.a, this);
    }

    public final String j() {
        return GcamModuleJNI.ShotMetadata_xmp_metadata_extended_get(this.a, this);
    }

    public final String k() {
        return GcamModuleJNI.ShotMetadata_xmp_metadata_main_get(this.a, this);
    }

    public final synchronized void l() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ShotMetadata(j);
            }
            this.a = 0L;
        }
    }

    public final void m(String str) {
        GcamModuleJNI.ShotMetadata_makernote_set(this.a, this, str);
    }

    public final void n(String str) {
        GcamModuleJNI.ShotMetadata_software_suffix_set(this.a, this, str);
    }

    public final boolean o() {
        return GcamModuleJNI.ShotMetadata_should_apply_deblur_badge_get(this.a, this);
    }
}
