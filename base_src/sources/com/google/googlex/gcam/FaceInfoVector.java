package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class FaceInfoVector {
    public transient long a;
    protected transient boolean b;

    public FaceInfoVector() {
        this(GcamModuleJNI.new_FaceInfoVector__SWIG_0(), true);
    }

    public FaceInfoVector(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FaceInfoVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
