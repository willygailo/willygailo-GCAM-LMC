package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* JADX INFO: loaded from: classes.dex */
public final class dov {
    public final oom a;
    public final float b;
    private final long c;

    public dov() {
    }

    public dov(long j, oom oomVar, float f) {
        this.c = j;
        if (oomVar == null) {
            throw new NullPointerException("Null faces");
        }
        this.a = oomVar;
        this.b = f;
    }

    public static dov a(lzv lzvVar) {
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        Face[] faceArr = (Face[]) lzvVar.d(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) lzvVar.d(CaptureResult.SCALER_CROP_REGION);
        l.getClass();
        ooh oohVarE = oom.e();
        if (faceArr != null && rect != null) {
            int length = faceArr.length;
            int i = 0;
            while (i < length) {
                Rect bounds = faceArr[i].getBounds();
                oohVarE.g(new RectF((bounds.left - rect.left) / rect.width(), (bounds.top - rect.top) / rect.height(), (bounds.right - rect.left) / rect.width(), (bounds.bottom - rect.top) / rect.height()));
                i++;
                length = length;
                faceArr = faceArr;
                l = l;
            }
        }
        return new dov(l.longValue(), oom.j(oohVarE.f()), rect != null ? rect.width() / rect.height() : 1.0f);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dov) {
            dov dovVar = (dov) obj;
            if (this.c == dovVar.c && obr.an(this.a, dovVar.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(dovVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        return Float.floatToIntBits(this.b) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.c;
        String strValueOf = String.valueOf(this.a);
        float f = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 98);
        sb.append("FaceMetadata{timestampNs=");
        sb.append(j);
        sb.append(", faces=");
        sb.append(strValueOf);
        sb.append(", normalizingRectAspectRatio=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
