package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class YuvReadView {
    public transient long a;
    protected transient boolean b;

    public YuvReadView() {
        this(GcamModuleJNI.new_YuvReadView__SWIG_3());
    }

    public YuvReadView(long j) {
        this.b = true;
        this.a = j;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_YuvReadView(j);
            }
            this.a = 0L;
        }
    }

    public final int b() {
        return GcamModuleJNI.YuvReadView_height(this.a, this);
    }

    public final int c() {
        return GcamModuleJNI.YuvReadView_width(this.a, this);
    }

    public final int d() {
        return GcamModuleJNI.YuvReadView_yuv_format(this.a, this);
    }

    protected void finalize() {
        a();
    }
}
