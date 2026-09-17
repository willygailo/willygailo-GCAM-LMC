package com.google.googlex.gcam.imageio;

import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import defpackage.ojc;

/* JADX INFO: loaded from: classes.dex */
public final class JpgHelper {
    private JpgHelper() {
    }

    public static ojc a(InterleavedReadViewU8 interleavedReadViewU8, JpgEncodeOptions jpgEncodeOptions, int i) {
        return ojc.h(encodeRgbToJpegAsByteArrayImpl(interleavedReadViewU8.a, jpgEncodeOptions.a, i));
    }

    private static native byte[] encodeRgbToJpegAsByteArrayImpl(long j, long j2, int i);

    public static native byte[] encodeYuvToJpegAsByteArrayImpl(long j, long j2, int i);
}
