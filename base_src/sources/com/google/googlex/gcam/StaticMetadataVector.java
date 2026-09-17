package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class StaticMetadataVector {
    public transient long a;
    protected transient boolean b;

    public StaticMetadataVector() {
        long jNew_StaticMetadataVector__SWIG_0 = GcamModuleJNI.new_StaticMetadataVector__SWIG_0();
        this.b = true;
        this.a = jNew_StaticMetadataVector__SWIG_0;
    }

    public final void a(StaticMetadata staticMetadata) {
        GcamModuleJNI.StaticMetadataVector_add(this.a, this, StaticMetadata.c(staticMetadata), staticMetadata);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_StaticMetadataVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}
