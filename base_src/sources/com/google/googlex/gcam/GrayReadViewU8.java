package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class GrayReadViewU8 {
    public transient long a;
    protected transient boolean b;

    public GrayReadViewU8() {
        this(GcamModuleJNI.new_GrayReadViewU8__SWIG_0());
    }

    public GrayReadViewU8(long j) {
        this.b = true;
        this.a = j;
    }

    public final int a() {
        return GcamModuleJNI.GrayReadViewU8_x_stride(this.a, this);
    }

    public final int b() {
        return GcamModuleJNI.GrayReadViewU8_y_stride(this.a, this);
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_GrayReadViewU8(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        c();
    }
}
