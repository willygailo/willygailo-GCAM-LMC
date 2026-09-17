package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class InterleavedImageF {
    private transient long a;

    public InterleavedImageF() {
        this(GcamModuleJNI.new_InterleavedImageF());
    }

    public InterleavedImageF(long j) {
        this.a = j;
    }

    public static long a(InterleavedImageF interleavedImageF) {
        if (interleavedImageF == null) {
            return 0L;
        }
        return interleavedImageF.a;
    }

    public final synchronized void b() {
        if (this.a != 0) {
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}
