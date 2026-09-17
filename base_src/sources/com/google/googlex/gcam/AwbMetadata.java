package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class AwbMetadata {
    public transient long a;

    public AwbMetadata() {
        this(GcamModuleJNI.new_AwbMetadata());
    }

    public AwbMetadata(long j) {
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
