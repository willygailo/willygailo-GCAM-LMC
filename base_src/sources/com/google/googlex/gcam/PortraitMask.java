package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class PortraitMask {
    public transient long a;

    public PortraitMask() {
        this(GcamModuleJNI.new_PortraitMask());
    }

    public PortraitMask(long j) {
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
