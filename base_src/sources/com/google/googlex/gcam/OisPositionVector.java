package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class OisPositionVector {
    public transient long a;

    public OisPositionVector() {
        this(GcamModuleJNI.new_OisPositionVector__SWIG_0());
    }

    public OisPositionVector(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        if (this.a != 0) {
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
