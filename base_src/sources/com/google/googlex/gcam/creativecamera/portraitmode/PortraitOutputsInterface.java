package com.google.googlex.gcam.creativecamera.portraitmode;

import com.google.googlex.gcam.base.function.LongConsumer;
import com.google.googlex.gcam.base.function.LongFloatConsumer;
import com.google.googlex.gcam.base.function.LongStringConsumer;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class PortraitOutputsInterface {
    private static final AtomicBoolean a = new AtomicBoolean();

    public PortraitOutputsInterface() {
        if (a.compareAndSet(false, true)) {
            init();
        }
    }

    private static native void init();

    public native void setCompleteCallback(long j, LongConsumer longConsumer);

    public native void setDebugHardwareBufferCallback(long j, PortraitOpaqueHandleCallback portraitOpaqueHandleCallback);

    public native void setDebugImageCallback(long j, PortraitImageCallback portraitImageCallback);

    public native void setDebugRgbAllocator(long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator);

    public native void setHardwareBufferCallback(long j, PortraitOpaqueHandleCallback portraitOpaqueHandleCallback);

    public native void setImageCallback(long j, PortraitImageCallback portraitImageCallback);

    public native void setLogCallback(long j, LongStringConsumer longStringConsumer);

    public native void setProgressCallback(long j, LongFloatConsumer longFloatConsumer);

    public native void setRgbAllocator(long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator);

    public native void setSecondaryHardwareBufferCallback(long j, PortraitOpaqueHandleCallback portraitOpaqueHandleCallback);

    public native void setSecondaryImageCallback(long j, PortraitImageCallback portraitImageCallback);

    public native void setUpsampledInputHardwareBufferCallback(long j, PortraitOpaqueHandleCallback portraitOpaqueHandleCallback);

    public native void setUpsampledInputImageCallback(long j, PortraitImageCallback portraitImageCallback);
}
