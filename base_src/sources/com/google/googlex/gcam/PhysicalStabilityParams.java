package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes2.dex */
public class PhysicalStabilityParams {
    public transient long a;

    public PhysicalStabilityParams() {
        this(GcamModuleJNI.new_PhysicalStabilityParams());
    }

    public PhysicalStabilityParams(long j) {
        this.a = j;
    }

    public final PhysicalStabilityThresholds a() {
        long jPhysicalStabilityParams_thresholds_get = GcamModuleJNI.PhysicalStabilityParams_thresholds_get(this.a, this);
        if (jPhysicalStabilityParams_thresholds_get == 0) {
            return null;
        }
        return new PhysicalStabilityThresholds(jPhysicalStabilityParams_thresholds_get);
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
