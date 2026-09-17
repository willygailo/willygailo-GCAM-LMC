package com.google.googlex.gcam.creativecamera.portraitmode;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class PortraitSegmenterInterface {
    private static final AtomicBoolean a = new AtomicBoolean();

    public PortraitSegmenterInterface() {
        if (a.compareAndSet(false, true)) {
            init();
        }
    }

    private static native void init();

    public native boolean dummyImageProducesReasonableMask();

    public native long getSegmenterHandle();

    public native boolean initSegmenter(long j, long j2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    public native void release();
}
