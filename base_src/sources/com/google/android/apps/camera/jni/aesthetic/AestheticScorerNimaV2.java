package com.google.android.apps.camera.jni.aesthetic;

import defpackage.enh;
import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class AestheticScorerNimaV2 implements enh {
    private long a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    static {
        try {
            System.loadLibrary("aesthetic_scorer_nima_v2_jni");
        } catch (UnsatisfiedLinkError e) {
            if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                throw e;
            }
        }
    }

    private native void nativeClose(long j);

    private static native long nativeLoad(boolean z);

    private native float nativeScoreYUV(long j, int i, int i2, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float[] fArr);

    @Override // defpackage.enh
    public final float a(int i, int i2, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float[] fArr) {
        if (this.b.get()) {
            return 0.0f;
        }
        return nativeScoreYUV(this.a, i, i2, buffer, i3, i4, buffer2, i5, i6, buffer3, i7, i8, fArr);
    }

    @Override // defpackage.enh
    public final void b() {
        if (this.b.getAndSet(true)) {
            return;
        }
        nativeClose(this.a);
    }

    @Override // defpackage.enh
    public final void c(boolean z) {
        if (this.b.getAndSet(false)) {
            this.a = nativeLoad(z);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            b();
        } finally {
            super.finalize();
        }
    }
}
