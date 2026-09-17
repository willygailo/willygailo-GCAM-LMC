package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class DebugParams {
    public transient long a;
    protected transient boolean b;

    public DebugParams() {
        long jNew_DebugParams = GcamModuleJNI.new_DebugParams();
        this.b = true;
        this.a = jNew_DebugParams;
    }

    public final ImageSaverParams a() {
        long jDebugParams_image_saver_params_get = GcamModuleJNI.DebugParams_image_saver_params_get(this.a, this);
        if (jDebugParams_image_saver_params_get == 0) {
            return null;
        }
        return new ImageSaverParams(jDebugParams_image_saver_params_get, false);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_DebugParams(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}
