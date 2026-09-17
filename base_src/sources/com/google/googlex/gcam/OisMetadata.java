package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class OisMetadata {
    public transient long a;
    protected transient boolean b;

    public OisMetadata() {
        long jNew_OisMetadata = GcamModuleJNI.new_OisMetadata();
        this.b = true;
        this.a = jNew_OisMetadata;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_OisMetadata(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
