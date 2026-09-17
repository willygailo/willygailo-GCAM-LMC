package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class AeMetadata {
    public transient long a;

    public AeMetadata() {
        this(GcamModuleJNI.new_AeMetadata());
    }

    public AeMetadata(long j) {
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
