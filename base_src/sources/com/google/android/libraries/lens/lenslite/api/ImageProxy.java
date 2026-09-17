package com.google.android.libraries.lens.lenslite.api;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ImageProxy extends AutoCloseable {

    public interface Plane {
        ByteBuffer getBuffer();

        int getPixelStride();

        int getRowStride();
    }

    @Override // java.lang.AutoCloseable
    void close();

    Rect getCropRect();

    int getFormat();

    HardwareBuffer getHardwareBuffer();

    int getHeight();

    List getPlanes();

    long getTimestamp();

    int getWidth();

    void setCropRect(Rect rect);
}
