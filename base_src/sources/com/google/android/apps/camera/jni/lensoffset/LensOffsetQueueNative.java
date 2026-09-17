package com.google.android.apps.camera.jni.lensoffset;

import defpackage.lil;

/* JADX INFO: loaded from: classes.dex */
public final class LensOffsetQueueNative {
    static {
        lil.a(LensOffsetQueueNative.class);
    }

    private LensOffsetQueueNative() {
    }

    public static native long createHandle(int i, int i2, int i3);

    public static native boolean getLensOffsetAtTime(long j, long j2, float[] fArr);

    public static native boolean processAndEnqueueLensOffset(long j, long j2, float f, float f2);

    public static native void releaseHandle(long j);
}
