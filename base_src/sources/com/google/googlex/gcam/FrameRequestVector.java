package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class FrameRequestVector {
    public transient long a;
    protected transient boolean b;

    public FrameRequestVector() {
        this(GcamModuleJNI.new_FrameRequestVector__SWIG_0(), true);
    }

    public FrameRequestVector(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final long a() {
        return GcamModuleJNI.FrameRequestVector_size(this.a, this);
    }

    public final FrameRequest b(int i) {
        return new FrameRequest(GcamModuleJNI.FrameRequestVector_get(this.a, this, i), false);
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FrameRequestVector(j);
            }
            this.a = 0L;
        }
    }

    public final boolean d() {
        return GcamModuleJNI.FrameRequestVector_isEmpty(this.a, this);
    }

    protected final void finalize() {
        c();
    }
}
