package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class AeResults {
    public transient long a;
    protected transient boolean b;

    public AeResults() {
        this(GcamModuleJNI.new_AeResults(), true);
    }

    public AeResults(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(AeResults aeResults) {
        if (aeResults == null) {
            return 0L;
        }
        return aeResults.a;
    }

    public final float a(int i) {
        return GcamModuleJNI.AeResults_FinalTet(this.a, this, i);
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AeResults(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        c();
    }
}
