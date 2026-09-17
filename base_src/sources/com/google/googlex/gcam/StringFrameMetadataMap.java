package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class StringFrameMetadataMap {
    public transient long a;
    protected transient boolean b;

    public StringFrameMetadataMap() {
        this(GcamModuleJNI.new_StringFrameMetadataMap__SWIG_0(), true);
    }

    public StringFrameMetadataMap(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_StringFrameMetadataMap(j);
            }
            this.a = 0L;
        }
    }

    public final void b(String str, FrameMetadata frameMetadata) {
        GcamModuleJNI.StringFrameMetadataMap_set(this.a, this, str, FrameMetadata.b(frameMetadata), frameMetadata);
    }

    protected final void finalize() {
        a();
    }
}
