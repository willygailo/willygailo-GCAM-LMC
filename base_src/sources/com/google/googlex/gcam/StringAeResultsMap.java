package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class StringAeResultsMap {
    public transient long a;

    public StringAeResultsMap() {
        this(GcamModuleJNI.new_StringAeResultsMap__SWIG_0());
    }

    public StringAeResultsMap(long j) {
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
