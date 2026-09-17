package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class FloatDeque {
    public transient long a;
    protected transient boolean b;

    public FloatDeque() {
        this(GcamModuleJNI.new_FloatDeque__SWIG_0(), true);
    }

    public FloatDeque(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FloatDeque(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
