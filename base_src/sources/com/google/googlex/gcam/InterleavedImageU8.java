package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class InterleavedImageU8 {
    public transient long a;
    protected transient boolean b;

    public InterleavedImageU8() {
        this(GcamModuleJNI.new_InterleavedImageU8__SWIG_0());
    }

    public InterleavedImageU8(int i, int i2, int i3) {
        this(GcamModuleJNI.new_InterleavedImageU8__SWIG_1(i, i2, i3));
    }

    public InterleavedImageU8(long j) {
        this.b = true;
        this.a = j;
    }

    public final int a() {
        return GcamModuleJNI.InterleavedImageU8_height(this.a, this);
    }

    public final int b() {
        return GcamModuleJNI.InterleavedImageU8_width(this.a, this);
    }

    public final InterleavedReadViewU8 c() {
        return new InterleavedReadViewU8(GcamModuleJNI.InterleavedImageU8_read_view(this.a, this));
    }

    public final InterleavedWriteViewU8 d() {
        return new InterleavedWriteViewU8(GcamModuleJNI.InterleavedImageU8_write_view(this.a, this));
    }

    public final synchronized void e() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_InterleavedImageU8(j);
            }
            this.a = 0L;
        }
    }

    public final boolean f() {
        return GcamModuleJNI.InterleavedImageU8_empty(this.a, this);
    }

    protected final void finalize() {
        e();
    }
}
