package com.google.android.apps.camera.jni.eis;

import defpackage.lil;

/* JADX INFO: loaded from: classes.dex */
public final class EisNative {
    static {
        lil.a(EisNative.class);
    }

    public static native long createHandle(int i, int i2, int i3, float f, boolean z, int i4, String str);

    public static native int getNumOfFramesToLookAhead(long j);

    public static native int getNumStrips(long j);

    public static native boolean isTripodMode(long j);

    public static native long processFrame(long j, byte[] bArr, int i, int i2, long j2, long j3, long j4, long j5, float f, float f2, float f3, boolean z, long j6, float[] fArr, float[] fArr2, float[] fArr3);

    public static native boolean processGyro(long j, float f, float f2, float f3, long j2);

    public static native boolean processLensOffset(long j, float f, float f2, long j2);

    public static native void releaseHandle(long j);

    public static native void setActiveArraySize(long j, int i, int i2);

    public static native void setCropWindowSize(long j, int i, int i2);

    public static native void setStabilizationStrength(long j, float f);
}
