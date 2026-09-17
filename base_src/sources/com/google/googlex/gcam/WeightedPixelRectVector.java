package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes2.dex */
public class WeightedPixelRectVector {
    public transient long a;

    public WeightedPixelRectVector() {
        this(GcamModuleJNI.new_WeightedPixelRectVector__SWIG_0());
    }

    public WeightedPixelRectVector(long j) {
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
