package com.google.android.libraries.camera.jni.yuv;

import android.graphics.Bitmap;
import defpackage.lil;
import defpackage.lxk;
import defpackage.mac;
import defpackage.mad;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class YuvUtilNative {
    static {
        lil.b(YuvUtilNative.class, "yuv-jni");
    }

    public static Bitmap a(mad madVar) {
        lxk lxkVar = lxk.ROTATION_0;
        List listG = madVar.g();
        mac macVar = (mac) listG.get(0);
        mac macVar2 = (mac) listG.get(1);
        mac macVar3 = (mac) listG.get(2);
        ByteBuffer buffer = macVar.getBuffer();
        ByteBuffer buffer2 = macVar2.getBuffer();
        ByteBuffer buffer3 = macVar3.getBuffer();
        int iC = madVar.c();
        int iB = madVar.b();
        int[] iArr = new int[iC * iB];
        if (convertYUV420ToARGBNative(madVar.c(), madVar.b(), buffer, macVar.getPixelStride(), macVar.getRowStride(), buffer2, macVar2.getPixelStride(), macVar2.getRowStride(), buffer3, macVar3.getPixelStride(), macVar3.getRowStride(), iArr, lxkVar.i)) {
            return lxkVar.j ? Bitmap.createBitmap(iArr, iB, iC, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(iArr, iC, iB, Bitmap.Config.ARGB_8888);
        }
        return null;
    }

    private static native boolean convertYUV420ToARGBNative(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, int[] iArr, int i9);

    public static native boolean copyYUV_420_888Native(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    public static native boolean downsampleYUV_420_888toNV21Native(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i9);

    private static native boolean generateCircleThumbnailNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int[] iArr);
}
