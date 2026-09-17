package defpackage;

import android.hardware.HardwareBuffer;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public interface pjw {
    long create(long j, String str, String str2);

    void delete(long j);

    void finishCapture(long j);

    void notifySurfaceChanged(long j, Surface surface);

    void processAndCloseFrame(long j, long j2, HardwareBuffer hardwareBuffer, Runnable runnable, long j3, long j4);

    void startCapture(long j, long j2, String str, Runnable runnable, Runnable runnable2, Runnable runnable3);
}
