package com.google.android.apps.camera.rectiface.jni;

import defpackage.hlr;
import defpackage.hls;
import defpackage.lie;
import defpackage.ouj;

/* JADX INFO: loaded from: classes.dex */
public final class RectifaceWarpfieldImpl implements hlr, lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/rectiface/jni/RectifaceWarpfieldImpl");
    public long b = 0;

    static {
        hls.a();
    }

    public static native long initializeImpl();

    private static native void releaseImpl(long j);

    @Override // defpackage.hlr
    public final long a() {
        return this.b;
    }

    @Override // defpackage.hlr, java.lang.AutoCloseable, defpackage.lie
    public final void close() {
        long j = this.b;
        if (j != 0) {
            releaseImpl(j);
            this.b = 0L;
        }
    }
}
