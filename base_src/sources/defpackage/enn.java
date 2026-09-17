package defpackage;

import com.google.android.apps.camera.jni.gyro.GyroQueueNative;

/* JADX INFO: loaded from: classes.dex */
public final class enn implements enm {
    private static final ouj a = ouj.h("com/google/android/apps/camera/jni/gyro/GyroQueueImpl");
    private static final float[] b = e();
    private static final int[] c = {1, 0, 2};
    private static final int[] d = {1, 1, 1};
    private final Object f = new Object();
    private long h = 0;
    private final long e = GyroQueueNative.createHandle(c, d);
    private boolean g = false;

    private static final float[] e() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    @Override // defpackage.enm
    public final long a() {
        long j;
        synchronized (this.f) {
            j = this.h;
        }
        return j;
    }

    @Override // defpackage.enm
    public final void b(float f, float f2, float f3, long j) {
        synchronized (this.f) {
            if (!this.g && this.h < j) {
                this.h = j;
                GyroQueueNative.processAndEnqueueGyro(this.e, f, f2, f3, j);
            }
        }
    }

    @Override // defpackage.enm
    public final boolean c(long j, float f, float f2, float f3, float[] fArr) {
        System.arraycopy(b, 0, fArr, 0, 9);
        synchronized (this.f) {
            if (this.g) {
                return false;
            }
            if (GyroQueueNative.getProjectionMatrix(this.e, j, f, f2, f3, 0L, fArr)) {
                return true;
            }
            ((oug) ((oug) a.c()).G(1270)).q("Projection matrix could not be computed for timestamp = %d", j);
            return false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f) {
            if (this.g) {
                return;
            }
            this.g = true;
            GyroQueueNative.releaseHandle(this.e);
        }
    }

    @Override // defpackage.enm
    public final float[] d(long j, float f, float f2, float f3, long j2, float f4, float f5, float f6) throws Throwable {
        float[] fArrE = e();
        synchronized (this.f) {
            try {
                try {
                    if (this.g) {
                        return fArrE;
                    }
                    if (!GyroQueueNative.getTransformBetweenTime(this.e, j, f, f2, f3, j2, f4, f5, f6, 0L, fArrE)) {
                        ((oug) ((oug) a.c()).G(1272)).u("Transformation matrix could not be computed for timestamps %d - %d", j, j2);
                    }
                    return fArrE;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
