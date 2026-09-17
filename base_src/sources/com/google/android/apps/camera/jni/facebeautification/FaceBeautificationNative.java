package com.google.android.apps.camera.jni.facebeautification;

import defpackage.lil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class FaceBeautificationNative {
    static {
        lil.a(FaceBeautificationNative.class);
        init();
    }

    private FaceBeautificationNative() {
    }

    public static native long createHandle(int i, int i2, boolean z);

    public static native byte[] doFaceBeautification(long j, int i, int i2, int i3, ByteBuffer byteBuffer, int i4, int i5, ByteBuffer byteBuffer2, int i6, int i7, ByteBuffer byteBuffer3, int i8, int i9, FaceInfo[] faceInfoArr, int i10, int i11);

    public static native void init();

    public static native void releaseHandle(long j);
}
