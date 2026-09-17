package com.google.googlex.gcam.hdrplus;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
public interface EncodedBlobCallback {
    void onDataAvailable(int i, ByteBuffer byteBuffer, int i2, int i3);
}
