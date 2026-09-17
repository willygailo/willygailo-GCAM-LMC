package com.google.googlex.gcam.creativecamera.seedark;

import android.hardware.HardwareBuffer;
import android.view.Surface;
import defpackage.pjw;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class SeeDarkNativeImpl implements pjw {
    private static final AtomicBoolean a;

    static {
        System.loadLibrary("SeeDarkJni");
        a = new AtomicBoolean();
    }

    public SeeDarkNativeImpl() {
        if (a.compareAndSet(false, true)) {
            init();
        }
    }

    private static native void init();

    public native void abortCapture(long j);

    @Override // defpackage.pjw
    public native long create(long j, String str, String str2);

    @Override // defpackage.pjw
    public native void delete(long j);

    @Override // defpackage.pjw
    public native void finishCapture(long j);

    @Override // defpackage.pjw
    public native void notifySurfaceChanged(long j, Surface surface);

    @Override // defpackage.pjw
    public native void processAndCloseFrame(long j, long j2, HardwareBuffer hardwareBuffer, Runnable runnable, long j3, long j4);

    @Override // defpackage.pjw
    public native void startCapture(long j, long j2, String str, Runnable runnable, Runnable runnable2, Runnable runnable3);
}
