package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes2.dex */
public class WeightedNormalizedRect {
    public transient long a;
    protected transient boolean b;

    public WeightedNormalizedRect() {
        long jNew_WeightedNormalizedRect = GcamModuleJNI.new_WeightedNormalizedRect();
        this.b = true;
        this.a = jNew_WeightedNormalizedRect;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_WeightedNormalizedRect(j);
            }
            this.a = 0L;
        }
    }

    public final void b(float f) {
        GcamModuleJNI.WeightedNormalizedRect_weight_set(this.a, this, f);
    }

    protected final void finalize() {
        a();
    }
}
