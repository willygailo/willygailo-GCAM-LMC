package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.googlex.gcam.Tuning;

/* JADX INFO: loaded from: classes.dex */
public final class eck {
    public final Tuning a;
    public final gnq b;

    public eck(Tuning tuning, lzv lzvVar) {
        this.a = tuning;
        Face[] faceArr = (Face[]) lzvVar.d(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) lzvVar.d(CaptureResult.SCALER_CROP_REGION);
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_FRAME_DURATION);
        if (faceArr == null) {
            throw new IllegalStateException("STATISTICS_FACES not present in metadata.");
        }
        if (rect == null) {
            throw new IllegalStateException("SCALER_CROP_REGION not present in metadata.");
        }
        this.b = new gnq(faceArr, rect, l != null ? l.longValue() : 0L);
    }
}
