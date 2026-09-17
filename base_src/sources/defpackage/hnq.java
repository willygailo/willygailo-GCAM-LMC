package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes2.dex */
public final class hnq implements hnp {
    private final dqx a;
    private final float[] b = new float[3];

    public hnq(dqx dqxVar) {
        this.a = dqxVar;
    }

    @Override // defpackage.hnp
    public final float a(lzv lzvVar) {
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_EXPOSURE_TIME);
        float fSqrt = Float.NaN;
        float fLongValue = (l == null ? Float.NaN : l.longValue()) * (-5.0E-7f);
        Long l2 = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        if (l2 != null) {
            synchronized (this.b) {
                dqx dqxVar = this.a;
                if (dqxVar != null) {
                    dqu dquVarC = dqxVar.c(l2.longValue());
                    if (!dquVarC.e()) {
                        float[] fArr = dquVarC.a;
                        float f = fArr[0];
                        float f2 = fArr[1];
                        float f3 = fArr[2];
                        fSqrt = (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
                    }
                }
            }
        }
        return (float) Math.exp(fLongValue * fSqrt);
    }
}
