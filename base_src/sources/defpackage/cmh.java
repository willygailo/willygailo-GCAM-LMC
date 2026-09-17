package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class cmh extends mip {
    private static final ouj c = ouj.h("com/google/android/apps/camera/camcorder/frameserver/listener/AutoFrameListener");
    public int a = 0;
    public int b = 0;

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_FRAME_DURATION);
        l.getClass();
        g(l.longValue());
    }

    final synchronized void g(long j) {
        try {
            if (j >= 29979000 && j <= 36641000) {
                this.a++;
            } else if (j >= 14999400 && j <= 18332600) {
                this.b++;
            } else {
                ((oug) ((oug) c.c()).G((char) 513)).r("Auto FPS received a frame that was neither 30 or 60 fps. Frame was: %f", Float.valueOf(1.0E9f / j));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
