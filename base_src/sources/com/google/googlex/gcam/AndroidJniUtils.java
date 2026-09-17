package com.google.googlex.gcam;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidJniUtils {
    private AndroidJniUtils() {
    }

    public static native long getAHardwareBufferPtr(HardwareBuffer hardwareBuffer);

    public static native long lockBitmap(Bitmap bitmap);

    static native long lockSurface(Surface surface);

    public static native void unlockBitmap(Bitmap bitmap);

    static native void unlockSurface(long j);
}
