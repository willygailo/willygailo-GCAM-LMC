package com.google.android.apps.camera.rectiface.jni;

import defpackage.hls;

/* JADX INFO: loaded from: classes.dex */
public final class RectifaceOutput {
    public long a = initializeImpl();

    static {
        hls.a();
    }

    private static native int getCameraFovInDegreeImpl(long j);

    private static native float getFaceConformalityAfterShapeCorrectionImpl(long j, int i);

    private static native int getFaceConformalityAfterShapeCorrectionSizeImpl(long j);

    private static native float getFaceConformalityBeforeShapeCorrectionImpl(long j, int i);

    private static native int getFaceConformalityBeforeShapeCorrectionSizeImpl(long j);

    private static native int getFaceDistortionCorrectionProcessingTimeMsImpl(long j);

    private static native int getPortraitRelightingTimeMsImpl(long j);

    private static native int getShapeCorrectionModeImpl(long j);

    private static native long initializeImpl();

    private static native void releaseImpl(long j);

    public final float a(int i) {
        return getFaceConformalityAfterShapeCorrectionImpl(this.a, i);
    }

    public final float b(int i) {
        return getFaceConformalityBeforeShapeCorrectionImpl(this.a, i);
    }

    public final int c() {
        return getCameraFovInDegreeImpl(this.a);
    }

    public final int d() {
        return getFaceConformalityAfterShapeCorrectionSizeImpl(this.a);
    }

    public final int e() {
        return getFaceConformalityBeforeShapeCorrectionSizeImpl(this.a);
    }

    public final int f() {
        return getFaceDistortionCorrectionProcessingTimeMsImpl(this.a);
    }

    public final int g() {
        return getPortraitRelightingTimeMsImpl(this.a);
    }

    public final int h() {
        return getCameraFovInDegreeImpl(this.a);
    }

    public final int i() {
        return getShapeCorrectionModeImpl(this.a);
    }

    public final void j() {
        releaseImpl(this.a);
    }
}
