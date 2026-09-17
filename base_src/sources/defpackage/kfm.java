package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.jni.eis.EisNative;

/* JADX INFO: loaded from: classes2.dex */
public final class kfm {
    public long a;

    public kfm() {
    }

    public kfm(long j) {
        this.a = j;
    }

    public kfm(eni eniVar, int i, int i2, float f, boolean z, String str) {
        this.a = EisNative.createHandle(eniVar.j, i, i2, f, z, -1, str);
    }

    public kfm(byte[] bArr) {
        this.a = 0L;
    }

    public final void a() {
        this.a = 0L;
    }

    public final void b() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final boolean c(long j) {
        return this.a == 0 || SystemClock.elapsedRealtime() - this.a > j;
    }

    public final synchronized int d() {
        long j;
        j = this.a;
        if (j == 0) {
            throw new IllegalStateException("getNumOfFramesToLookAhead() called on a released EisNativeWrapper.");
        }
        return EisNative.getNumOfFramesToLookAhead(j);
    }

    public final synchronized int e() {
        long j;
        j = this.a;
        if (j == 0) {
            throw new IllegalStateException("getNumStrips() called on a released EisNativeWrapper.");
        }
        return EisNative.getNumStrips(j);
    }

    public final synchronized void f() {
        long j = this.a;
        if (j == 0) {
            throw new IllegalStateException("release() called on a released EisNativeWrapper.");
        }
        EisNative.releaseHandle(j);
        this.a = 0L;
    }

    public final synchronized void g(int i, int i2) {
        long j = this.a;
        if (j == 0) {
            throw new IllegalStateException("setActiveArraySize() called on a released EisNativeWrapper.");
        }
        EisNative.setActiveArraySize(j, i, i2);
    }

    public final synchronized void h(int i, int i2) {
        long j = this.a;
        if (j == 0) {
            throw new IllegalStateException("setCropWindowSize() called on a released EisNativeWrapper.");
        }
        EisNative.setCropWindowSize(j, i, i2);
    }

    public final synchronized boolean i() {
        long j;
        j = this.a;
        if (j == 0) {
            throw new IllegalStateException("isTripodMode() called on a released EisNativeWrapper.");
        }
        return EisNative.isTripodMode(j);
    }

    public final synchronized long j(byte[] bArr, int i, int i2, long j, long j2, long j3, long j4, float f, float f2, float f3, float[] fArr, float[] fArr2, float[] fArr3) {
        long j5;
        j5 = this.a;
        if (j5 == 0) {
            throw new IllegalStateException("processFrame() called on a released EisNativeWrapper.");
        }
        return EisNative.processFrame(j5, bArr, i, i2, j, j2, j3, j4, f, f2, f3, true, 0L, fArr, fArr2, fArr3);
    }

    public final synchronized void k(float f, float f2, float f3, long j) {
        long j2 = this.a;
        if (j2 == 0) {
            throw new IllegalStateException("processGyro() called on a released EisNativeWrapper.");
        }
        EisNative.processGyro(j2, f, f2, f3, j);
    }

    public final synchronized void l(float f, float f2, long j) {
        long j2 = this.a;
        if (j2 == 0) {
            throw new IllegalStateException("processLensOffset() called on a released EisNativeWrapper.");
        }
        EisNative.processLensOffset(j2, f, f2, j);
    }

    public final synchronized void m() {
        long j = this.a;
        if (j == 0) {
            throw new IllegalStateException("setStabilizationStrength() called on a released EisNativeWrapper.");
        }
        EisNative.setStabilizationStrength(j, 1.0f);
    }
}
