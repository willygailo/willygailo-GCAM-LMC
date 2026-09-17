package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class PixelRect {
    public transient long a;
    protected transient boolean b;

    public PixelRect() {
        this(GcamModuleJNI.new_PixelRect(), true);
    }

    public PixelRect(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final int a() {
        return GcamModuleJNI.PixelRect_x0_get(this.a, this);
    }

    public final int b() {
        return GcamModuleJNI.PixelRect_y0_get(this.a, this);
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_PixelRect(j);
            }
            this.a = 0L;
        }
    }

    public final void d(int i) {
        GcamModuleJNI.PixelRect_x0_set(this.a, this, i);
    }

    public final void e(int i) {
        GcamModuleJNI.PixelRect_x1_set(this.a, this, i);
    }

    public final void f(int i) {
        GcamModuleJNI.PixelRect_y0_set(this.a, this, i);
    }

    protected final void finalize() {
        c();
    }

    public final void g(int i) {
        GcamModuleJNI.PixelRect_y1_set(this.a, this, i);
    }
}
