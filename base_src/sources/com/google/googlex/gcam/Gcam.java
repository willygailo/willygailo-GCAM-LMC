package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class Gcam {
    public transient long a;
    protected transient boolean b = true;

    public Gcam(long j) {
        this.a = j;
    }

    public static long a(Gcam gcam) {
        if (gcam == null) {
            return 0L;
        }
        return gcam.a;
    }

    public final StaticMetadata b(int i) {
        return new StaticMetadata(GcamModuleJNI.Gcam_GetStaticMetadata(this.a, this, i), false);
    }

    public final Tuning c(int i) {
        return new Tuning(GcamModuleJNI.Gcam_GetTuning(this.a, this, i));
    }

    public final void d(ViewfinderProcessingOptions viewfinderProcessingOptions) {
        GcamModuleJNI.Gcam_ConfigureViewfinderProcessing(this.a, this, viewfinderProcessingOptions.a, viewfinderProcessingOptions);
    }

    public final synchronized void e() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_Gcam(j);
            }
            this.a = 0L;
        }
    }

    public final boolean f() {
        return GcamModuleJNI.Gcam_AllSensorIdsUnique(this.a, this);
    }

    protected final void finalize() {
        e();
    }
}
