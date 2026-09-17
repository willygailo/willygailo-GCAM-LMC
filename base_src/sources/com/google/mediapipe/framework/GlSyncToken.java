package com.google.mediapipe.framework;

/* JADX INFO: loaded from: classes.dex */
public interface GlSyncToken {
    void release();

    void waitOnCpu();

    void waitOnGpu();
}
