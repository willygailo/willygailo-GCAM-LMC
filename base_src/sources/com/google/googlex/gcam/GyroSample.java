package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class GyroSample {
    public transient long a;
    protected transient boolean b;

    public GyroSample() {
        long jNew_GyroSample = GcamModuleJNI.new_GyroSample();
        this.b = true;
        this.a = jNew_GyroSample;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_GyroSample(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
