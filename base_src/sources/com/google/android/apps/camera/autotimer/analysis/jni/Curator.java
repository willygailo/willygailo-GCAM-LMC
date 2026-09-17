package com.google.android.apps.camera.autotimer.analysis.jni;

import defpackage.lil;
import defpackage.mad;
import defpackage.ppd;
import defpackage.pud;
import defpackage.pum;
import defpackage.pvb;

/* JADX INFO: loaded from: classes2.dex */
public class Curator implements BaseCurator {
    private long pointer;

    public Curator(pum pumVar) {
        lil.b(Curator.class, "smartcapture_native");
        nativeAllocate();
        nativeInitialize(pumVar.g());
    }

    private native void nativeAllocate();

    private native void nativeDispose();

    private native void nativeInitialize(byte[] bArr);

    private native byte[] nativeProcessImage(AnalysisImage analysisImage, byte[] bArr);

    private native void nativeReset();

    private native void nativeSetSaveAllowed(boolean z);

    private native void nativeTriggerCapture();

    private native void nativeUpdateCaptureTriggers(byte[] bArr);

    private native void nativeUpdateIndividualCaptureTrigger(int i);

    @Override // com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator
    public final pvb a(mad madVar, pud pudVar) {
        return (pvb) ppd.p(pvb.e, nativeProcessImage(new AnalysisImage(madVar), pudVar.g()));
    }

    @Override // com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator
    public final void b(boolean z) {
        nativeSetSaveAllowed(z);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        nativeDispose();
    }

    public native void nativeSetCaptureEnabled(boolean z);
}
