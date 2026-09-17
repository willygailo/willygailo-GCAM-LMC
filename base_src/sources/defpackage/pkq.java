package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* JADX INFO: loaded from: classes2.dex */
public final class pkq {
    final Face[] a;
    int[] b;
    byte[] c;
    float[] d;

    public pkq(lzr lzrVar) {
        this.a = (Face[]) lzrVar.d(CaptureResult.STATISTICS_FACES);
        if (kda.m == null || kda.n == null || kda.o == null) {
            return;
        }
        this.b = (int[]) lzrVar.d(kda.m);
        this.c = (byte[]) lzrVar.d(kda.n);
        this.d = (float[]) lzrVar.d(kda.o);
    }

    public pkq(Face[] faceArr) {
        this.a = faceArr;
    }
}
