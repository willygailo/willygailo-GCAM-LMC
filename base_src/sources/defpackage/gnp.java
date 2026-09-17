package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* JADX INFO: loaded from: classes.dex */
public final class gnp extends mip {
    private final lij a;

    public gnp(lij lijVar) {
        this.a = lijVar;
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        Face[] faceArr = (Face[]) lzvVar.d(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) lzvVar.d(CaptureResult.SCALER_CROP_REGION);
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_FRAME_DURATION);
        if (faceArr == null || rect == null || l == null) {
            return;
        }
        this.a.fB(new gnq(faceArr, rect, l.longValue()));
    }
}
