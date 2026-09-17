package com.google.mediapipe.framework;

/* JADX INFO: loaded from: classes.dex */
public final class GraphGlSyncToken implements GlSyncToken {
    private long a;

    public GraphGlSyncToken(long j) {
        this.a = j;
    }

    private static native void nativeRelease(long j);

    private static native void nativeWaitOnCpu(long j);

    private static native void nativeWaitOnGpu(long j);

    @Override // com.google.mediapipe.framework.GlSyncToken
    public final void release() {
        long j = this.a;
        if (j != 0) {
            nativeRelease(j);
            this.a = 0L;
        }
    }

    @Override // com.google.mediapipe.framework.GlSyncToken
    public final void waitOnCpu() {
        long j = this.a;
        if (j != 0) {
            nativeWaitOnCpu(j);
        }
    }

    @Override // com.google.mediapipe.framework.GlSyncToken
    public final void waitOnGpu() {
        long j = this.a;
        if (j != 0) {
            nativeWaitOnGpu(j);
        }
    }
}
