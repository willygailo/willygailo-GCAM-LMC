package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class FloatArray4 {
    public transient long a;
    protected transient boolean b;

    public FloatArray4() {
        this(GcamModuleJNI.new_FloatArray4__SWIG_0(), true);
    }

    public FloatArray4(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final float a(int i) {
        return GcamModuleJNI.FloatArray4_get(this.a, this, i);
    }

    public final long b() {
        return GcamModuleJNI.FloatArray4_size(this.a, this);
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FloatArray4(j);
            }
            this.a = 0L;
        }
    }

    public final void d(int i, float f) {
        GcamModuleJNI.FloatArray4_set(this.a, this, i, f);
    }

    protected final void finalize() {
        c();
    }
}
