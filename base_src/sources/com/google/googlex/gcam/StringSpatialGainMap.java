package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class StringSpatialGainMap {
    public transient long a;

    public StringSpatialGainMap() {
        this(GcamModuleJNI.new_StringSpatialGainMap__SWIG_0());
    }

    public StringSpatialGainMap(long j) {
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
