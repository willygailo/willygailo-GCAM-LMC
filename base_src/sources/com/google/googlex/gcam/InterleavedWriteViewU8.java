package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class InterleavedWriteViewU8 {
    public transient long a;
    protected transient boolean b;

    public InterleavedWriteViewU8() {
        this(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_0());
    }

    public InterleavedWriteViewU8(long j) {
        this.b = true;
        this.a = j;
    }

    public static long a(InterleavedWriteViewU8 interleavedWriteViewU8) {
        if (interleavedWriteViewU8 == null) {
            return 0L;
        }
        return interleavedWriteViewU8.a;
    }

    public final InterleavedReadViewU8 b() {
        return new InterleavedReadViewU8(GcamModuleJNI.InterleavedWriteViewU8_read_view(this.a, this));
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_InterleavedWriteViewU8(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        c();
    }
}
