package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class StringStaticMetadataMap {
    public transient long a;
    protected transient boolean b;

    public StringStaticMetadataMap() {
        this(GcamModuleJNI.new_StringStaticMetadataMap__SWIG_0(), true);
    }

    public StringStaticMetadataMap(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_StringStaticMetadataMap(j);
            }
            this.a = 0L;
        }
    }

    public final void b(String str, StaticMetadata staticMetadata) {
        GcamModuleJNI.StringStaticMetadataMap_set(this.a, this, str, StaticMetadata.c(staticMetadata), staticMetadata);
    }

    protected final void finalize() {
        a();
    }
}
