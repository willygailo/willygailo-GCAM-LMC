package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class SceneFlicker {
    public transient long a;
    protected transient boolean b;

    public SceneFlicker() {
        long jNew_SceneFlicker = GcamModuleJNI.new_SceneFlicker();
        this.b = true;
        this.a = jNew_SceneFlicker;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_SceneFlicker(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
