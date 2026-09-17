package com.google.googlex.gcam.lasagna;

import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class LasagnaNativeProcessorJni {
    private static final AtomicBoolean a = new AtomicBoolean();

    public LasagnaNativeProcessorJni() {
        if (a.getAndSet(true)) {
            return;
        }
        init();
    }

    private static native void init();

    public native void abortShot(long j, int i);

    public native void addViewfinderFrame(long j, long j2, long j3, Runnable runnable);

    public native void analyzeShot(long j, int i, int i2);

    public native void beginShot(long j, int i);

    public native long create(int i, int i2, int i3, String str, long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator, LasagnaCallbacks lasagnaCallbacks);

    public native void delete(long j);

    public native void endShot(long j, int i);

    public native void printDiagnosticsToLog(long j);

    public native void processPslFrame(long j, int i, long j2, long j3, long j4, Runnable runnable);

    public native void processZslBurst(long j, int i, long j2, long j3);

    public native void setOptions(long j, int i, boolean z, float f, int i2, boolean z2, boolean z3);
}
