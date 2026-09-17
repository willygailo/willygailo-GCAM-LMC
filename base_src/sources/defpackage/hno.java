package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* JADX INFO: loaded from: classes2.dex */
public final class hno implements hnp {
    private final /* synthetic */ int a;

    public hno(int i) {
        this.a = i;
    }

    @Override // defpackage.hnp
    public final float a(lzv lzvVar) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) lzvVar.d(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    return Float.NaN;
                }
                return (num.intValue() == 4 || num.intValue() == 2) ? 1.0f : 0.0f;
            case 1:
                Integer num2 = (Integer) lzvVar.d(CaptureResult.CONTROL_AE_STATE);
                if (num2 == null) {
                    return Float.NaN;
                }
                return (num2.intValue() == 2 || num2.intValue() == 3) ? 1.0f : 0.0f;
            case 2:
                Integer num3 = (Integer) lzvVar.d(CaptureResult.CONTROL_AWB_STATE);
                if (num3 == null) {
                    return Float.NaN;
                }
                return (num3.intValue() == 2 || num3.intValue() == 3) ? 1.0f : 0.0f;
            case 3:
                Face[] faceArr = (Face[]) lzvVar.d(CaptureResult.STATISTICS_FACES);
                if (faceArr != null) {
                    return faceArr.length;
                }
                return Float.NaN;
            default:
                Integer num4 = (Integer) lzvVar.d(CaptureResult.LENS_STATE);
                return (num4 == null || num4.intValue() == 0) ? 1.0f : 0.0f;
        }
    }
}
