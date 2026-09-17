package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class NoiseModel {
    public transient long a;
    protected transient boolean b = true;

    public NoiseModel(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_NoiseModel(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
