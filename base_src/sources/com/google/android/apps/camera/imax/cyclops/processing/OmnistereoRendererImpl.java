package com.google.android.apps.camera.imax.cyclops.processing;

import com.google.android.apps.camera.imax.cyclops.image.StereoPanorama;
import defpackage.ejq;

/* JADX INFO: loaded from: classes.dex */
public class OmnistereoRendererImpl implements ejq {
    public boolean b;
    private long rendererRef = 0;
    private long modelRef = 0;
    private long exposureScalesRef = 0;
    public int a = 0;

    static {
        System.loadLibrary("cyclops");
    }

    public OmnistereoRendererImpl(String str, boolean z, double d, double d2) {
        this.b = false;
        this.b = nativeInitialize(str, 0, z, d, d2);
    }

    private native boolean nativeInitialize(String str, int i, boolean z, double d, double d2);

    public final void finalize() throws Throwable {
        super.finalize();
        nativeRelease();
    }

    @Override // defpackage.ejq
    public native StereoPanorama getResult(boolean z);

    public native void nativeApplyTexture(int i, int i2, int i3, int i4);

    public native void nativeRelease();
}
