package com.google.android.apps.camera.imax.cyclops.processing;

import android.graphics.Bitmap;
import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;
import defpackage.ejo;

/* JADX INFO: loaded from: classes.dex */
public class NativeCaptureImpl implements ejo {
    public final int a;
    public final float b;
    private long nativeRef;

    static {
        System.loadLibrary("cyclops");
    }

    public NativeCaptureImpl() {
        this(512, 60.0f);
    }

    public NativeCaptureImpl(int i, float f) {
        this.nativeRef = 0L;
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.ejo
    public native float getCaptureProgress();

    @Override // defpackage.ejo
    public native Bitmap getPreview(int i);

    @Override // defpackage.ejo
    public native Texture getPreviewAsTexture();

    @Override // defpackage.ejo
    public native void getTrackerStats(TrackerStats trackerStats);

    public native void initialize(int i, int i2, int i3, int i4, int i5, float f);

    @Override // defpackage.ejo
    public native void release();

    @Override // defpackage.ejo
    public native void setMetaData(float f, int i, boolean z, int i2, boolean z2);

    @Override // defpackage.ejo
    public native void startCapture();

    @Override // defpackage.ejo
    public native int stopCapture(String str);

    @Override // defpackage.ejo
    public native boolean trackTexture(float[] fArr, float[] fArr2);
}
