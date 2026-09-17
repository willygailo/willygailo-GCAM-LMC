package com.google.googlex.gcam.hdrplus;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.base.function.IntByteArrayConsumer;
import com.google.googlex.gcam.base.function.IntConsumer;
import com.google.googlex.gcam.base.function.IntFloatConsumer;
import com.google.googlex.gcam.base.function.IntLongConsumer;
import com.google.googlex.gcam.base.function.IntStringConsumer;
import com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.RawClientAllocator;
import com.google.googlex.gcam.clientallocator.YuvClientAllocator;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class HdrPlusInterface {
    private static final AtomicBoolean a = new AtomicBoolean();

    public HdrPlusInterface() {
        if (a.compareAndSet(false, true)) {
            init();
        }
    }

    public static EncodedBlobCallback a(final EncodedBlobCallback encodedBlobCallback, final boolean z) {
        return new EncodedBlobCallback() { // from class: pkk
            @Override // com.google.googlex.gcam.hdrplus.EncodedBlobCallback
            public final void onDataAvailable(int i, ByteBuffer byteBuffer, int i2, int i3) {
                encodedBlobCallback.onDataAvailable(i, BufferUtils.d(byteBuffer, z), i2, i3);
            }
        };
    }

    private static native void init();

    public native boolean addPayloadFrame(long j, int i, long j2, long j3, long j4, Runnable runnable, long j5, Runnable runnable2, long j6, Runnable runnable3);

    public native void addViewfinderFrame(long j, int i, long j2, long j3, long j4, long j5, Runnable runnable);

    public native float getPostZoomSharpenStrength(long j, float f);

    public native void setBaseFrameCallback(long j, BaseFrameCallback baseFrameCallback);

    public native void setFinalImageCallback(long j, ManagedImageCallback managedImageCallback);

    public native void setFinalImageRgb16Allocator(long j, InterleavedU16ClientAllocator interleavedU16ClientAllocator);

    public native void setFinalImageRgbAllocator(long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator);

    public native void setFinalImageYuvAllocator(long j, YuvClientAllocator yuvClientAllocator);

    public native void setJpegCallback(long j, EncodedBlobCallback encodedBlobCallback);

    public native void setMergedDngCallback(long j, EncodedBlobCallback encodedBlobCallback);

    public native void setMergedPdAllocator(long j, InterleavedU16ClientAllocator interleavedU16ClientAllocator);

    public native void setMergedPdCallback(long j, IntLongConsumer intLongConsumer);

    public native void setMergedRawImageAllocator(long j, RawClientAllocator rawClientAllocator);

    public native void setMergedRawImageCallback(long j, ManagedImageCallback managedImageCallback);

    public native void setMutableMergedRawCallback(long j, MutableMergedRawCallback mutableMergedRawCallback);

    public native void setPostviewCallback(long j, ManagedImageCallback managedImageCallback);

    public native void setPostviewRgbAllocator(long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator);

    public native void setPostviewYuvAllocator(long j, YuvClientAllocator yuvClientAllocator);

    public native void setProgressCallback(long j, IntFloatConsumer intFloatConsumer);

    public native void setShotStatusCallbacks(long j, IntByteArrayConsumer intByteArrayConsumer, IntStringConsumer intStringConsumer, IntConsumer intConsumer);

    public native boolean temporallyBinViewfinderFrame(long j, int i, long j2, long j3, long j4, Runnable runnable, long j5, Runnable runnable2, long j6, long j7, Runnable runnable3, boolean z, int i2);
}
