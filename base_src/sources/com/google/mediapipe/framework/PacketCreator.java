package com.google.mediapipe.framework;

/* JADX INFO: loaded from: classes.dex */
public class PacketCreator {
    public Graph a;

    public PacketCreator(Graph graph) {
        this.a = graph;
    }

    private void releaseWithSyncToken(long j, TextureReleaseCallback textureReleaseCallback) {
        textureReleaseCallback.release(new GraphGlSyncToken(j));
    }

    public native long nativeCreateGpuBuffer(long j, int i, int i2, int i3, TextureReleaseCallback textureReleaseCallback);
}
