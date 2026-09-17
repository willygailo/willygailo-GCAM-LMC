package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class PhysicalStabilityThresholds {
    public transient long a;

    public PhysicalStabilityThresholds() {
        this(GcamModuleJNI.new_PhysicalStabilityThresholds());
    }

    public PhysicalStabilityThresholds(long j) {
        this.a = j;
    }

    public final float a() {
        return GcamModuleJNI.PhysicalStabilityThresholds_tripod_speed_rad_per_sec_get(this.a, this);
    }

    public final synchronized void b() {
        if (this.a != 0) {
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}
