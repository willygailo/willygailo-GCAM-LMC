package com.google.googlex.gcam.imageproc;

/* JADX INFO: loaded from: classes.dex */
public final class Resample {
    private Resample() {
    }

    public static native boolean downsampleImpl(long j, int i, long j2);

    public static native boolean resampleLanczosYuvImpl(long j, float f, long j2);

    public static native boolean rotateImpl(long j, int i, long j2);
}
