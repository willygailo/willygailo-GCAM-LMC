package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes2.dex */
public class GenerateRgbImageOptions {
    public transient long a;
    protected transient boolean b;

    public GenerateRgbImageOptions() {
        long jNew_GenerateRgbImageOptions = GcamModuleJNI.new_GenerateRgbImageOptions();
        this.b = true;
        this.a = jNew_GenerateRgbImageOptions;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_GenerateRgbImageOptions(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
