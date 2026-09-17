package com.google.googlex.gcam.creativecamera.portraitmode;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class PortraitRelightingProcessorInterface {
    private static final AtomicBoolean a = new AtomicBoolean();

    public PortraitRelightingProcessorInterface() {
        if (a.compareAndSet(false, true)) {
            init();
        }
    }

    private static native void init();

    public native long getPortraitRelightingProcessorHandle();

    public native boolean initPortraitRelightingProcessor(String str, boolean z, boolean z2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6);

    public native void release();

    public native boolean reload();

    public native void unload();
}
