package com.google.android.apps.camera.jni.microvideotonemap;

import android.graphics.Bitmap;
import defpackage.lil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class MicrovideoToneMapNative {
    static {
        lil.a(MicrovideoToneMapNative.class);
    }

    public static native int argbToYuv(Bitmap bitmap, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    public static native byte[] extractMeanVarianceMappingNative(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, ByteBuffer byteBuffer6, int i5, int i6);
}
