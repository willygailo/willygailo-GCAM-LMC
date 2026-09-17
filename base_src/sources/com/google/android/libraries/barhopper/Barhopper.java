package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class Barhopper {
    private static final String TAG = "Barhopper";

    static {
        try {
            System.loadLibrary("barhopper");
        } catch (UnsatisfiedLinkError e) {
            Log.w(TAG, "Barhopper so is not available. To use this library correctly, either depend on the :barhopper BUILD target or link the barhopper/jni target directly. This warning can be safely ignored if doing the latter.");
        }
    }

    private Barhopper() {
    }

    public static native Barcode parseRawValue(String str, int i);

    public static Barcode[] recognize(int i, int i2, int i3, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        return recognizeStridedBufferNative(i, i2, i3, byteBuffer, recognitionOptions);
    }

    public static Barcode[] recognize(int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions) {
        return recognizeNative(i, i2, bArr, recognitionOptions);
    }

    public static Barcode[] recognize(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        return recognizeBitmapNative(bitmap, recognitionOptions);
    }

    public static native Barcode[] recognizeBitmapNative(Bitmap bitmap, RecognitionOptions recognitionOptions);

    public static native Barcode[] recognizeBufferNative(int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    public static native Barcode[] recognizeNative(int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions);

    public static native Barcode[] recognizeStridedBufferNative(int i, int i2, int i3, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    public static native Barcode[] recognizeStridedNative(int i, int i2, int i3, byte[] bArr, RecognitionOptions recognitionOptions);
}
