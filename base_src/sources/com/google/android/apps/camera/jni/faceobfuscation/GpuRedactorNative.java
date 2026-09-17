package com.google.android.apps.camera.jni.faceobfuscation;

import android.hardware.HardwareBuffer;
import defpackage.lil;

/* JADX INFO: loaded from: classes.dex */
public final class GpuRedactorNative {
    static {
        lil.a(GpuRedactorNative.class);
        init();
    }

    private GpuRedactorNative() {
    }

    public static native long createRedactor(boolean z);

    public static native void init();

    public static native boolean process(long j, HardwareBuffer hardwareBuffer, boolean z, HardwareBuffer hardwareBuffer2, boolean z2, int i, int i2, Object[] objArr, float f);

    public static native void releaseRedactor(long j);
}
