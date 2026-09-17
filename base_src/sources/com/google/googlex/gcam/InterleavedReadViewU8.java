package com.google.googlex.gcam;

import defpackage.pjk;

/* JADX INFO: loaded from: classes.dex */
public class InterleavedReadViewU8 {
    public transient long a;
    protected transient boolean b;

    public InterleavedReadViewU8() {
        this(GcamModuleJNI.new_InterleavedReadViewU8__SWIG_0());
    }

    public InterleavedReadViewU8(long j) {
        this.b = true;
        this.a = j;
    }

    public final int a() {
        return GcamModuleJNI.InterleavedReadViewU8_c_stride(this.a, this);
    }

    public final int b() {
        return GcamModuleJNI.InterleavedReadViewU8_channels(this.a, this);
    }

    public final int c() {
        return GcamModuleJNI.InterleavedReadViewU8_height(this.a, this);
    }

    public final int d() {
        return GcamModuleJNI.InterleavedReadViewU8_width(this.a, this);
    }

    public final int e() {
        return GcamModuleJNI.InterleavedReadViewU8_x_stride(this.a, this);
    }

    public final int f() {
        return GcamModuleJNI.InterleavedReadViewU8_y_stride(this.a, this);
    }

    protected final void finalize() {
        h();
    }

    public final pjk g() {
        long jInterleavedReadViewU8_data = GcamModuleJNI.InterleavedReadViewU8_data(this.a, this);
        if (jInterleavedReadViewU8_data == 0) {
            return null;
        }
        return new pjk(jInterleavedReadViewU8_data);
    }

    public final synchronized void h() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_InterleavedReadViewU8(j);
            }
            this.a = 0L;
        }
    }
}
