package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class QcIlluminantVector {
    public transient long a;
    protected transient boolean b;

    public QcIlluminantVector() {
        long jNew_QcIlluminantVector__SWIG_0 = GcamModuleJNI.new_QcIlluminantVector__SWIG_0();
        this.b = true;
        this.a = jNew_QcIlluminantVector__SWIG_0;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_QcIlluminantVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
