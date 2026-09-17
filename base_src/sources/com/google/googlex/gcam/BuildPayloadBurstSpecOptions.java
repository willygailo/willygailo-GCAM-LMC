package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class BuildPayloadBurstSpecOptions {
    public transient long a;
    protected transient boolean b;

    public BuildPayloadBurstSpecOptions() {
        this(GcamModuleJNI.new_BuildPayloadBurstSpecOptions__SWIG_0());
    }

    public BuildPayloadBurstSpecOptions(long j) {
        this.b = true;
        this.a = j;
    }

    public BuildPayloadBurstSpecOptions(BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions) {
        this(GcamModuleJNI.new_BuildPayloadBurstSpecOptions__SWIG_1(buildPayloadBurstSpecOptions.a, buildPayloadBurstSpecOptions));
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_BuildPayloadBurstSpecOptions(j);
            }
            this.a = 0L;
        }
    }

    public final void b(float f) {
        GcamModuleJNI.BuildPayloadBurstSpecOptions_max_exposure_time_ms_set(this.a, this, f);
    }

    public final void c(boolean z) {
        GcamModuleJNI.BuildPayloadBurstSpecOptions_recompute_ae_set(this.a, this, z);
    }

    protected final void finalize() {
        a();
    }
}
