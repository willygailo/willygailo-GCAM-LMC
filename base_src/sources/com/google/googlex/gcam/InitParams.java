package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class InitParams {
    public transient long a;
    protected transient boolean b;

    public InitParams() {
        long jNew_InitParams = GcamModuleJNI.new_InitParams();
        this.b = true;
        this.a = jNew_InitParams;
    }

    public final int a() {
        return GcamModuleJNI.InitParams_execute_finish_on_get(this.a, this);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_InitParams(j);
            }
            this.a = 0L;
        }
    }

    public final void c(int i) {
        GcamModuleJNI.InitParams_execute_finish_on_set(this.a, this, i);
    }

    protected final void finalize() {
        b();
    }
}
