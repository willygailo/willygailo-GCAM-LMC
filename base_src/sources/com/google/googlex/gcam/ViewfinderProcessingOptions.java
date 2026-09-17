package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class ViewfinderProcessingOptions {
    public transient long a;
    protected transient boolean b;

    public ViewfinderProcessingOptions() {
        this(GcamModuleJNI.new_ViewfinderProcessingOptions__SWIG_0());
    }

    public ViewfinderProcessingOptions(long j) {
        this.b = true;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ViewfinderProcessingOptions(j);
            }
            this.a = 0L;
        }
    }

    public final void b(int i) {
        GcamModuleJNI.ViewfinderProcessingOptions_motion_processing_method_set(this.a, this, i);
    }

    public final void c(boolean z) {
        GcamModuleJNI.ViewfinderProcessingOptions_process_gyro_set(this.a, this, z);
    }

    public final void d(boolean z) {
        GcamModuleJNI.ViewfinderProcessingOptions_save_motion_trace_set(this.a, this, z);
    }

    protected final void finalize() {
        a();
    }
}
