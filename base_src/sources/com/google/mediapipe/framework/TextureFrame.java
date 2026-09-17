package com.google.mediapipe.framework;

/* JADX INFO: loaded from: classes2.dex */
public interface TextureFrame extends TextureReleaseCallback {
    int getHeight();

    int getTextureName();

    long getTimestamp();

    int getWidth();

    void release();

    @Override // com.google.mediapipe.framework.TextureReleaseCallback
    void release(GlSyncToken glSyncToken);
}
