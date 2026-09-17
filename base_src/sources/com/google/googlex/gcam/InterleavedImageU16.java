package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class InterleavedImageU16 {
    public transient long a;
    protected transient boolean b;

    public InterleavedImageU16() {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_0());
    }

    public InterleavedImageU16(long j) {
        this.b = true;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_InterleavedImageU16(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
