package defpackage;

import android.graphics.PointF;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lzs {
    public final Face a;
    public final float b;
    public final float c;
    public final float d;
    private final PointF[] e;
    private final HashMap f = new HashMap();

    public lzs(Face face, byte[] bArr, float[] fArr, float[] fArr2) {
        this.e = new PointF[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            this.f.put(Byte.valueOf(bArr[i]), Integer.valueOf(i));
            int i2 = i + i;
            this.e[i] = new PointF(fArr[i2], fArr[i2 + 1]);
        }
        this.a = face;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.d = fArr2[2];
    }

    public static List b(lzr lzrVar) {
        ArrayList arrayList = new ArrayList();
        Face[] faceArr = (Face[]) lzrVar.d(CaptureResult.STATISTICS_FACES);
        int[] iArr = (int[]) lzrVar.d(kda.m);
        byte[] bArr = (byte[]) lzrVar.d(kda.n);
        float[] fArr = (float[]) lzrVar.d(kda.o);
        float[] fArr2 = (float[]) lzrVar.d(kda.p);
        float[] fArr3 = (float[]) lzrVar.d(kda.q);
        if (faceArr != null && iArr != null && bArr != null && fArr != null && fArr2 != null && fArr3 != null) {
            int length = faceArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = iArr[i];
                byte[] bArr2 = new byte[i3];
                int i4 = i3 + i3;
                float[] fArr4 = new float[i4];
                float[] fArr5 = new float[i3];
                int[] iArr2 = iArr;
                float[] fArr6 = new float[3];
                int i5 = i2 + i3;
                int i6 = length;
                int length2 = bArr.length;
                ArrayList arrayList2 = arrayList;
                if (i5 <= length2) {
                    System.arraycopy(bArr, i2, bArr2, 0, i3);
                } else {
                    StringBuilder sb = new StringBuilder(47);
                    sb.append("faceLandmarkIds length is too short:");
                    sb.append(length2);
                    Log.e("FaceExt2018", sb.toString());
                }
                int length3 = fArr.length;
                if (i5 + i5 <= length3) {
                    System.arraycopy(fArr, i2 + i2, fArr4, 0, i4);
                } else {
                    StringBuilder sb2 = new StringBuilder(46);
                    sb2.append("faceLandmarkXy length is too short:");
                    sb2.append(length3);
                    Log.e("FaceExt2018", sb2.toString());
                }
                int length4 = fArr2.length;
                if (i5 <= length4) {
                    System.arraycopy(fArr2, i2, fArr5, 0, i3);
                } else {
                    StringBuilder sb3 = new StringBuilder(49);
                    sb3.append("faceLandmarkDepth length is too short:");
                    sb3.append(length4);
                    Log.e("FaceExt2018", sb3.toString());
                }
                int i7 = i * 3;
                int length5 = fArr3.length;
                if (i7 + 3 <= length5) {
                    System.arraycopy(fArr3, i7, fArr6, 0, 3);
                } else {
                    StringBuilder sb4 = new StringBuilder(47);
                    sb4.append("faceOrientation length is too short:");
                    sb4.append(length5);
                    Log.e("FaceExt2018", sb4.toString());
                }
                arrayList2.add(new lzs(faceArr[i], bArr2, fArr4, fArr6));
                i++;
                arrayList = arrayList2;
                i2 = i5;
                iArr = iArr2;
                length = i6;
                bArr = bArr;
            }
        }
        return arrayList;
    }

    public final PointF a(byte b) {
        HashMap map = this.f;
        Byte bValueOf = Byte.valueOf(b);
        if (map.containsKey(bValueOf)) {
            return this.e[((Integer) this.f.get(bValueOf)).intValue()];
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Landmark:");
        sb.append((int) b);
        sb.append(" not detected for this face.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final String toString() {
        return String.format("{ bounds: %s, score: %s, id: %d }", this.a.getBounds(), Integer.valueOf(this.a.getScore()), Integer.valueOf(this.a.getId()));
    }
}
