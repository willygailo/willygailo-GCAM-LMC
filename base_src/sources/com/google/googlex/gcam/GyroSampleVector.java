package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class GyroSampleVector {
    public transient long a;
    protected transient boolean b;

    public GyroSampleVector() {
        long jNew_GyroSampleVector__SWIG_0 = GcamModuleJNI.new_GyroSampleVector__SWIG_0();
        this.b = true;
        this.a = jNew_GyroSampleVector__SWIG_0;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_GyroSampleVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
