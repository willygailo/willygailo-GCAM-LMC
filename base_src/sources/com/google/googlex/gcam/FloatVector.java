package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class FloatVector {
    public transient long a;
    protected transient boolean b;

    public FloatVector() {
        this(GcamModuleJNI.new_FloatVector__SWIG_0(), true);
    }

    public FloatVector(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final float a(int i) {
        return GcamModuleJNI.FloatVector_get(this.a, this, i);
    }

    public final void b(float f) {
        GcamModuleJNI.FloatVector_add(this.a, this, f);
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FloatVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        c();
    }
}
