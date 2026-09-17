package com.google.android.apps.camera.jni.facebeautification;

import android.hardware.HardwareBuffer;
import defpackage.lil;

/* JADX INFO: loaded from: classes.dex */
public final class GpuRetoucherNative {
    static {
        lil.a(GpuRetoucherNative.class);
        init();
    }

    private GpuRetoucherNative() {
    }

    public static native long createRetoucher(boolean z, int i);

    public static native void init();

    public static native boolean process(long j, HardwareBuffer hardwareBuffer, boolean z, HardwareBuffer hardwareBuffer2, boolean z2, int i, int i2, Object[] objArr, float f, int i3);

    public static native void releaseRetoucher(long j);
}
