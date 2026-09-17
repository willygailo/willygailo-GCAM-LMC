package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class SpatialGainMap {
    public transient long a;
    protected transient boolean b;

    public SpatialGainMap() {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_0());
    }

    public SpatialGainMap(long j) {
        this.b = true;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_SpatialGainMap(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
