package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes2.dex */
public class MeshTranslation {
    public transient long a;
    protected transient boolean b;

    public MeshTranslation() {
        this(GcamModuleJNI.new_MeshTranslation());
    }

    public MeshTranslation(long j) {
        this.b = true;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_MeshTranslation(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
