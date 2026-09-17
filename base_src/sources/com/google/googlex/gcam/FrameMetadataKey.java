package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetadataKey {
    public transient long a;
    protected transient boolean b;

    public FrameMetadataKey(long j, int i) {
        long jNew_FrameMetadataKey = GcamModuleJNI.new_FrameMetadataKey(j, i);
        this.b = true;
        this.a = jNew_FrameMetadataKey;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FrameMetadataKey(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
