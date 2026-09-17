package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.apps.camera.jni.facebeautification.FaceInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class enj extends FaceInfo {
    private final Rect a;
    private final Point b;
    private final Point c;
    private final float[] d;

    public enj(Rect rect, Point point, Point point2, float[] fArr) {
        this.a = rect;
        this.b = point;
        this.c = point2;
        this.d = fArr;
    }

    @Override // com.google.android.apps.camera.jni.facebeautification.FaceInfo
    public final Rect bounds() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Point point;
        Point point2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FaceInfo)) {
            return false;
        }
        FaceInfo faceInfo = (FaceInfo) obj;
        if (this.a.equals(faceInfo.bounds()) && ((point = this.b) != null ? point.equals(faceInfo.leftEye()) : faceInfo.leftEye() == null) && ((point2 = this.c) != null ? point2.equals(faceInfo.rightEye()) : faceInfo.rightEye() == null) && faceInfo.noseTip() == null && faceInfo.mouthCenter() == null && faceInfo.leftEarTragion() == null && faceInfo.rightEarTragion() == null) {
            if (Arrays.equals(this.d, faceInfo instanceof enj ? ((enj) faceInfo).d : faceInfo.faceAttributes())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.camera.jni.facebeautification.FaceInfo
    public final float[] faceAttributes() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Point point = this.b;
        int iHashCode2 = (iHashCode ^ (point == null ? 0 : point.hashCode())) * 1000003;
        Point point2 = this.c;
        return ((iHashCode2 ^ (point2 != null ? point2.hashCode() : 0)) * (-429739981)) ^ Arrays.hashCode(this.d);
    }

    @Override // com.google.android.apps.camera.jni.facebeautification.FaceInfo
    public final Point leftEarTragion() {
        return null;
    }

    @Override // com.google.android.apps.camera.jni.facebeautification.FaceInfo
    public final Point leftEye() {
        return this.b;
    }

    @Override // com.google.android.apps.camera.jni.facebeautification.FaceInfo
    public final Point mouthCenter() {
        return null;
    }

    @Override // com.google.android.apps.camera.jni.facebeautification.FaceInfo
    public final Point noseTip() {
        return null;
    }

    @Override // com.google.android.apps.camera.jni.facebeautification.FaceInfo
    public final Point rightEarTragion() {
        return null;
    }

    @Override // com.google.android.apps.camera.jni.facebeautification.FaceInfo
    public final Point rightEye() {
        return this.c;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf((Object) null);
        String strValueOf5 = String.valueOf((Object) null);
        String strValueOf6 = String.valueOf((Object) null);
        String strValueOf7 = String.valueOf((Object) null);
        String string = Arrays.toString(this.d);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        int length5 = String.valueOf(strValueOf5).length();
        int length6 = String.valueOf(strValueOf6).length();
        int length7 = String.valueOf(strValueOf7).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipForegroundColor + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(string).length());
        sb.append("FaceInfo{bounds=");
        sb.append(strValueOf);
        sb.append(", leftEye=");
        sb.append(strValueOf2);
        sb.append(", rightEye=");
        sb.append(strValueOf3);
        sb.append(", noseTip=");
        sb.append(strValueOf4);
        sb.append(", mouthCenter=");
        sb.append(strValueOf5);
        sb.append(", leftEarTragion=");
        sb.append(strValueOf6);
        sb.append(", rightEarTragion=");
        sb.append(strValueOf7);
        sb.append(", faceAttributes=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
