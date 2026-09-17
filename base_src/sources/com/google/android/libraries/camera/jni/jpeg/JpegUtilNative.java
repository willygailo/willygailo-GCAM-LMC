package com.google.android.libraries.camera.jni.jpeg;

import android.graphics.Rect;
import android.os.SystemClock;
import com.Helper;
import defpackage.lic;
import defpackage.lil;
import defpackage.mac;
import defpackage.mad;
import defpackage.obr;
import defpackage.oxh;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class JpegUtilNative {
    static {
        lil.b(JpegUtilNative.class, "jpeg-jni");
    }

    public static int a(mad madVar, ByteBuffer byteBuffer, Rect rect, lic licVar) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        obr.aR(byteBuffer.isDirect(), "Output buffer must be direct");
        obr.aT(rect.left < rect.right, "Invalid crop rectangle: %s", rect);
        obr.aT(rect.top < rect.bottom, "Invalid crop rectangle: %s", rect);
        obr.aS(madVar.a() == 35, "Only ImageFormat.YUV_420_888 is supported, found %s", madVar.a());
        List listG = madVar.g();
        mac macVar = (mac) listG.get(0);
        mac macVar2 = (mac) listG.get(1);
        mac macVar3 = (mac) listG.get(2);
        obr.aQ(macVar.getBuffer().isDirect());
        obr.aQ(macVar2.getBuffer().isDirect());
        obr.aQ(macVar3.getBuffer().isDirect());
        obr.aR(macVar.getPixelStride() == 1, "Pixel stride for luma (Y) plane must be 1.");
        obr.aR(macVar2.getPixelStride() == 2, "Pixel stride for chroma (U) plane must be 2.");
        obr.aR(macVar3.getPixelStride() == 2, "Pixel stride for chroma (V) plane must be 2.");
        obr.aR(macVar2.getRowStride() == macVar3.getRowStride(), "Row strides for chroma planes (UV) must match.");
        int iC = madVar.c();
        int iB = madVar.b();
        int iCompressJpegFromYUV420spNative = compressJpegFromYUV420spNative(iC, iB, macVar.getBuffer(), macVar.getPixelStride(), macVar.getRowStride(), macVar2.getBuffer(), macVar2.getPixelStride(), macVar2.getRowStride(), macVar3.getBuffer(), macVar3.getPixelStride(), macVar3.getRowStride(), byteBuffer, Helper.getJPGQuality(), oxh.B(rect.left, 0, iC - 1), oxh.B(rect.top, 0, iB - 1), oxh.B(rect.right, 0, iC), oxh.B(rect.bottom, 0, iB), licVar.e);
        if (iCompressJpegFromYUV420spNative < byteBuffer.limit()) {
        }
        Locale locale = Locale.ROOT;
        double dElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
        Double.isNaN(dElapsedRealtimeNanos);
        String.format(locale, "Compressed %d bytes in %.2fms", Integer.valueOf(iCompressJpegFromYUV420spNative), Double.valueOf(dElapsedRealtimeNanos / 1000000.0d));
        return iCompressJpegFromYUV420spNative;
    }

    private static native int compressJpegFromYUV420spNative(int i, int i2, Object obj, int i3, int i4, Object obj2, int i5, int i6, Object obj3, int i7, int i8, Object obj4, int i9, int i10, int i11, int i12, int i13, int i14);
}
