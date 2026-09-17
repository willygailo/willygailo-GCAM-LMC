package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class PostviewParams {
    public transient long a;
    protected transient boolean b;

    public PostviewParams() {
        long jNew_PostviewParams = GcamModuleJNI.new_PostviewParams();
        this.b = true;
        this.a = jNew_PostviewParams;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_PostviewParams(j);
            }
            this.a = 0L;
        }
    }

    public final void b(int i) {
        GcamModuleJNI.PostviewParams_pixel_format_set(this.a, this, i);
    }

    public final void c(int i) {
        GcamModuleJNI.PostviewParams_target_height_set(this.a, this, i);
    }

    public final void d(int i) {
        GcamModuleJNI.PostviewParams_target_width_set(this.a, this, i);
    }

    protected final void finalize() {
        a();
    }
}
