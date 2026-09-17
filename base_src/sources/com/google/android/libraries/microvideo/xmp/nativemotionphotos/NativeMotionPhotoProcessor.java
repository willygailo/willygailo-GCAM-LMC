package com.google.android.libraries.microvideo.xmp.nativemotionphotos;

import defpackage.ovk;
import defpackage.psp;

/* JADX INFO: loaded from: classes.dex */
public final class NativeMotionPhotoProcessor {
    static {
        ovk.h("NativeMotionPhotoProc");
        System.loadLibrary("native");
    }

    private NativeMotionPhotoProcessor() {
    }

    public static byte[] a(psp pspVar) {
        return encodeVideoMetadata(pspVar.g());
    }

    private static native byte[] encodeVideoMetadata(byte[] bArr);
}
