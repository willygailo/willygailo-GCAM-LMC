package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes2.dex */
public class StaticMetadata {
    public transient long a;
    protected transient boolean b;

    public StaticMetadata() {
        this(GcamModuleJNI.new_StaticMetadata__SWIG_0(), true);
    }

    public StaticMetadata(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long c(StaticMetadata staticMetadata) {
        if (staticMetadata == null) {
            return 0L;
        }
        return staticMetadata.a;
    }

    public final int a() {
        return GcamModuleJNI.StaticMetadata_lens_facing_get(this.a, this);
    }

    public final int b() {
        return GcamModuleJNI.StaticMetadata_sensor_id_get(this.a, this);
    }

    public final synchronized void d() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_StaticMetadata(j);
            }
            this.a = 0L;
        }
    }

    public final void e(int i) {
        GcamModuleJNI.StaticMetadata_frame_raw_max_height_set(this.a, this, i);
    }

    public final void f(int i) {
        GcamModuleJNI.StaticMetadata_sensor_id_set(this.a, this, i);
    }

    protected final void finalize() {
        d();
    }
}
