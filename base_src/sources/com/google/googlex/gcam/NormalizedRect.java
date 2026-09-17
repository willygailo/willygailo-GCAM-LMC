package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class NormalizedRect {
    public transient long a;
    protected transient boolean b;

    public NormalizedRect() {
        this(GcamModuleJNI.new_NormalizedRect(), true);
    }

    public NormalizedRect(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long a(NormalizedRect normalizedRect) {
        if (normalizedRect == null) {
            return 0L;
        }
        return normalizedRect.a;
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_NormalizedRect(j);
            }
            this.a = 0L;
        }
    }

    public final void c(float f) {
        GcamModuleJNI.NormalizedRect_x0_set(this.a, this, f);
    }

    public final void d(float f) {
        GcamModuleJNI.NormalizedRect_x1_set(this.a, this, f);
    }

    public final void e(float f) {
        GcamModuleJNI.NormalizedRect_y0_set(this.a, this, f);
    }

    public final void f(float f) {
        GcamModuleJNI.NormalizedRect_y1_set(this.a, this, f);
    }

    protected final void finalize() {
        b();
    }
}
