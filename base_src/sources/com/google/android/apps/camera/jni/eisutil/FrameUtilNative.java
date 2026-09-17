package com.google.android.apps.camera.jni.eisutil;

import defpackage.lil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class FrameUtilNative {
    static {
        lil.a(FrameUtilNative.class);
    }

    public static native int convertAYUVToNV12(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2);

    public static native void convertNV21ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);

    public static native int convertNV21ToYUV24(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5);

    public static native void mirrorYUV420888(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, boolean z);
}
