package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class InterleavedReadViewU16 {
    public transient long a;
    protected transient boolean b;

    public InterleavedReadViewU16() {
        this(GcamModuleJNI.new_InterleavedReadViewU16__SWIG_0());
    }

    public InterleavedReadViewU16(long j) {
        this.b = true;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_InterleavedReadViewU16(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
