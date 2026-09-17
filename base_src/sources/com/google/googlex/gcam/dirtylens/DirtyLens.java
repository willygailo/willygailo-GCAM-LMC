package com.google.googlex.gcam.dirtylens;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class DirtyLens {
    private static final AtomicBoolean a = new AtomicBoolean();

    public DirtyLens() {
        if (a.compareAndSet(false, true)) {
            init();
        }
    }

    public static native boolean getDirtyLensRawScore(long j, float[] fArr);

    private static native void init();
}
