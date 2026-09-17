package com.google.mediapipe.framework;

/* JADX INFO: loaded from: classes.dex */
public class GraphTextureFrame implements TextureFrame {
    public int a;
    public int b;
    public long c;
    private long d;
    private int e;

    public GraphTextureFrame(long j, long j2) {
        this.c = Long.MIN_VALUE;
        this.d = j;
        this.e = nativeGetTextureName(j);
        this.a = nativeGetWidth(this.d);
        this.b = nativeGetHeight(this.d);
        this.c = j2;
    }

    private native int nativeGetHeight(long j);

    private native int nativeGetTextureName(long j);

    private native int nativeGetWidth(long j);

    private native void nativeGpuWait(long j);

    private native void nativeReleaseBuffer(long j);

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return this.b;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getTextureName() {
        nativeGpuWait(this.d);
        return this.e;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return this.c;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return this.a;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final void release() {
        long j = this.d;
        if (j != 0) {
            nativeReleaseBuffer(j);
            this.d = 0L;
        }
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
        glSyncToken.release();
        release();
    }
}
