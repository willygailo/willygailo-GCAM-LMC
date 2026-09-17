package com.google.android.apps.camera.jni.federatedphoto;

import defpackage.lie;
import defpackage.lil;
import defpackage.ouj;

/* JADX INFO: loaded from: classes.dex */
public final class ModeSuggestionClient implements lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/jni/federatedphoto/ModeSuggestionClient");
    public final long b;
    public boolean c;

    public ModeSuggestionClient() {
        lil.b(ModeSuggestionClient.class, "modesuggestion-jni");
        long jNativeCreateClient = nativeCreateClient("ICALabelSensorDenseV1");
        this.b = jNativeCreateClient;
        if (jNativeCreateClient == 0) {
            throw new IllegalStateException("Could not initialize ModeSuggestionClient.");
        }
        this.c = false;
    }

    private native void nativeClose(long j);

    private static native long nativeCreateClient(String str);

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.c) {
            nativeClose(this.b);
            this.c = true;
        }
    }

    public native byte[] nativeProcess(long j, byte[] bArr);
}
