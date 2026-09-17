package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class AfMetadata {
    public transient long a;

    public AfMetadata() {
        this(GcamModuleJNI.new_AfMetadata());
    }

    public AfMetadata(long j) {
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
