package com.google.android.libraries.camera.jni.surface;

import android.view.Surface;
import defpackage.lil;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceNative {
    static {
        lil.b(SurfaceNative.class, "surface-jni");
    }

    public static native int setSurfaceGeometry(Surface surface, int i, int i2, int i3);

    public static native int setSurfaceTransform(Surface surface, int i);
}
