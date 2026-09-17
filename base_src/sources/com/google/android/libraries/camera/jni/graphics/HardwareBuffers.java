package com.google.android.libraries.camera.jni.graphics;

import android.hardware.HardwareBuffer;
import defpackage.lil;

/* JADX INFO: loaded from: classes.dex */
public class HardwareBuffers {
    static {
        lil.b(HardwareBuffers.class, "graphics-jni");
    }

    private HardwareBuffers() {
    }

    public static native HardwareBuffer fork(HardwareBuffer hardwareBuffer);

    public static native boolean lockingIsSupported();
}
