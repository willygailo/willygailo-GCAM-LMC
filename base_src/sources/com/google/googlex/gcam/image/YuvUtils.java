package com.google.googlex.gcam.image;

import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvReadView;
import defpackage.obr;

/* JADX INFO: loaded from: classes.dex */
public final class YuvUtils {
    public static boolean a(YuvReadView yuvReadView, InterleavedWriteViewU8 interleavedWriteViewU8) {
        long j = yuvReadView.a;
        long jA = InterleavedWriteViewU8.a(interleavedWriteViewU8);
        obr.aG(j != 0, "src view is null");
        obr.aG(jA != 0, "dst view is null");
        return yuvToRgbImpl(j, jA);
    }

    public static native boolean rgbToYuvImpl(long j, long j2);

    private static native boolean yuvToRgbImpl(long j, long j2);
}
