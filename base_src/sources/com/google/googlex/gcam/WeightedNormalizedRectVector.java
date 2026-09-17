package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class WeightedNormalizedRectVector {
    public transient long a;

    public WeightedNormalizedRectVector() {
        this(GcamModuleJNI.new_WeightedNormalizedRectVector__SWIG_0());
    }

    public WeightedNormalizedRectVector(long j) {
        this.a = j;
    }

    public final long a() {
        return GcamModuleJNI.WeightedNormalizedRectVector_size(this.a, this);
    }

    public final void b(WeightedNormalizedRect weightedNormalizedRect) {
        GcamModuleJNI.WeightedNormalizedRectVector_add(this.a, this, weightedNormalizedRect.a, weightedNormalizedRect);
    }

    public final synchronized void c() {
        if (this.a != 0) {
            this.a = 0L;
        }
    }

    protected final void finalize() {
        c();
    }
}
