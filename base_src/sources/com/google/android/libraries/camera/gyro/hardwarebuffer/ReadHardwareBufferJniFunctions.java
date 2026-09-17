package com.google.android.libraries.camera.gyro.hardwarebuffer;

import android.hardware.HardwareBuffer;
import defpackage.lil;

/* JADX INFO: loaded from: classes.dex */
public class ReadHardwareBufferJniFunctions {
    static {
        lil.b(ReadHardwareBufferJniFunctions.class, "hardwarebuffer-jni");
    }

    public static native boolean isSupported();

    public static native boolean readHardwareBuffer(HardwareBuffer hardwareBuffer, byte[] bArr, int i, int i2, int i3);
}
