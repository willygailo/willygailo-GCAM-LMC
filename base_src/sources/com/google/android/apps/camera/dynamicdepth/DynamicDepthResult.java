package com.google.android.apps.camera.dynamicdepth;

import android.hardware.camera2.CaptureResult;
import defpackage.dkr;
import defpackage.lie;
import defpackage.lig;
import defpackage.lzv;

/* JADX INFO: loaded from: classes.dex */
public class DynamicDepthResult implements lie {
    public long a;

    public DynamicDepthResult(int i, int i2, boolean z) {
        dkr.a();
        this.a = alloc(i, i2, 0, false, z, null, null);
    }

    public DynamicDepthResult(lig ligVar, int i, boolean z, boolean z2, lzv lzvVar) {
        float[] fArr;
        float[] fArr2;
        if (lzvVar != null) {
            float[] fArr3 = (float[]) lzvVar.d(CaptureResult.LENS_INTRINSIC_CALIBRATION);
            fArr2 = (float[]) lzvVar.d(CaptureResult.LENS_DISTORTION);
            fArr = fArr3;
        } else {
            fArr = null;
            fArr2 = null;
        }
        this.a = alloc(ligVar.a, ligVar.b, i, z, z2, fArr, fArr2);
    }

    private static native long alloc(int i, int i2, int i3, boolean z, boolean z2, float[] fArr, float[] fArr2);

    private static native void dealloc(long j);

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        dealloc(this.a);
        this.a = 0L;
    }
}
