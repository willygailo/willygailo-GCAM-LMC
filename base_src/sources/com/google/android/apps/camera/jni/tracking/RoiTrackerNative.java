package com.google.android.apps.camera.jni.tracking;

import android.content.Context;
import android.hardware.HardwareBuffer;
import defpackage.lil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class RoiTrackerNative {
    static {
        lil.a(RoiTrackerNative.class);
    }

    private RoiTrackerNative() {
    }

    public static native long createHandle(Context context, String str, int i);

    public static native int getCurrentTrackerIndex(long j);

    public static native boolean getIsRefresherCalled(long j);

    public static native void prepare(long j);

    public static native void releaseHandle(long j);

    public static native int startTracking(long j, boolean z, int i, int i2, float f, int i3, int i4, ByteBuffer byteBuffer, int i5, int i6, ByteBuffer byteBuffer2, int i7, int i8, ByteBuffer byteBuffer3, int i9, int i10, HardwareBuffer hardwareBuffer, float[] fArr);

    public static native void stopTracking(long j);

    public static native int updateRoi(long j, int i, float f, int i2, int i3, ByteBuffer byteBuffer, int i4, int i5, ByteBuffer byteBuffer2, int i6, int i7, ByteBuffer byteBuffer3, int i8, int i9, float[] fArr, HardwareBuffer hardwareBuffer, float[] fArr2);
}
