package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hjz implements Comparable, lie {
    public final byte A;
    public final MeteringRectangle[] B;
    public final Map C;
    private final lzr D;
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final long m;
    public final Rect n;
    public final float o;
    public final hjy[] p;
    public final boolean q;
    public final int r;
    public final Rect s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final float z;

    static {
        new MeteringRectangle(0, 0, 0, 0, 0);
    }

    public hjz(lzr lzrVar, int i, Rect rect) {
        this(lzrVar, i, rect, null, (Rect) lzrVar.d(CaptureResult.SCALER_CROP_REGION));
    }

    public hjz(lzr lzrVar, int i, Rect rect, String str, Rect rect2) {
        byte[] bArr;
        this.D = lzrVar;
        this.a = str;
        long jLongValue = ((Long) f((Long) lzrVar.d(CaptureResult.SENSOR_TIMESTAMP), 0L)).longValue();
        this.b = jLongValue;
        this.c = ((Long) f((Long) lzrVar.d(CaptureResult.SENSOR_EXPOSURE_TIME), 0L)).longValue();
        this.d = ((Long) f((Long) lzrVar.d(CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW), 0L)).longValue();
        this.e = ((Integer) f((Integer) lzrVar.d(CaptureResult.SENSOR_SENSITIVITY), 0)).intValue();
        this.f = ((Integer) f((Integer) lzrVar.d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST), 0)).intValue();
        Float f = (Float) lzrVar.d(CaptureResult.LENS_FOCAL_LENGTH);
        Float fValueOf = Float.valueOf(0.0f);
        this.g = ((Float) f(f, fValueOf)).floatValue();
        this.h = ((Float) f((Float) lzrVar.d(CaptureResult.LENS_FOCUS_DISTANCE), fValueOf)).floatValue();
        this.i = ((Integer) f((Integer) lzrVar.d(CaptureResult.CONTROL_AF_STATE), 0)).intValue();
        this.j = ((Integer) f((Integer) lzrVar.d(CaptureResult.CONTROL_AE_STATE), 0)).intValue();
        this.k = ((Integer) f((Integer) lzrVar.d(CaptureResult.CONTROL_AWB_STATE), 0)).intValue();
        this.l = ((Integer) f((Integer) lzrVar.d(CaptureResult.LENS_STATE), 1)).intValue();
        this.n = rect2;
        if (kcz.c != null) {
            this.m = ((Long) f((Long) lzrVar.d(kcz.c), 0L)).longValue();
        } else {
            this.m = jLongValue;
        }
        if (kcz.r != null) {
            this.o = ((Float) f((Float) lzrVar.d(kcz.r), Float.valueOf(1.0f))).floatValue();
        } else {
            this.o = 1.0f;
        }
        this.r = i;
        this.s = (Rect) f(rect, new Rect());
        if (kda.m == null || lzrVar.d(kda.m) == null) {
            Face[] faceArr = (Face[]) lzrVar.d(CaptureResult.STATISTICS_FACES);
            int length = faceArr != null ? faceArr.length : 0;
            this.p = new hjy[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.p[i2] = e(hjy.a(faceArr[i2]));
            }
        } else {
            List listB = lzs.b(lzrVar);
            int size = listB.size();
            this.p = new hjy[size];
            for (int i3 = 0; i3 < size; i3++) {
                this.p[i3] = e(hjy.b((lzs) listB.get(i3)));
            }
        }
        if (kda.l != null) {
            this.q = ((Boolean) f((Boolean) this.D.d(kda.l), false)).booleanValue();
        } else {
            this.q = false;
        }
        this.t = ((Integer) f((Integer) this.D.d(CaptureResult.CONTROL_MODE), 2)).intValue();
        this.u = ((Integer) f((Integer) this.D.d(CaptureResult.CONTROL_AE_MODE), 1)).intValue();
        this.B = (MeteringRectangle[]) this.D.d(CaptureResult.CONTROL_AF_REGIONS);
        this.z = ((Float) f((Float) this.D.d(CaptureResult.LENS_APERTURE), fValueOf)).floatValue();
        this.v = ((Integer) f((Integer) this.D.d(CaptureResult.CONTROL_AF_MODE), 0)).intValue();
        this.x = ((Boolean) f((Boolean) this.D.d(CaptureResult.CONTROL_AE_LOCK), false)).booleanValue();
        this.w = ((Integer) f((Integer) this.D.d(CaptureResult.CONTROL_AWB_MODE), 0)).intValue();
        this.y = ((Boolean) f((Boolean) this.D.d(CaptureResult.CONTROL_AWB_LOCK), false)).booleanValue();
        this.A = ((Byte) f((Byte) this.D.d(CaptureResult.JPEG_QUALITY), (byte) 0)).byteValue();
        this.C = new HashMap();
        if (kdd.e == null || (bArr = (byte[]) lzrVar.d(kdd.e)) == null) {
            return;
        }
        oom oomVarB = enl.B(bArr);
        int i4 = ((orr) oomVarB).c;
        for (int i5 = 0; i5 < i4; i5++) {
            dwp dwpVar = (dwp) oomVarB.get(i5);
            this.C.put(Integer.valueOf(dwpVar.a), dwpVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    public static hjz a(lzv lzvVar, jth jthVar, int i) {
        lzr lzrVar;
        String str;
        lzr lzrVar2;
        String str2 = (String) lzvVar.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        Rect rect = null;
        if (str2 != null) {
            Map mapG = lzvVar.g();
            if (mapG.isEmpty()) {
                lzrVar = lzvVar;
                str = str2;
            } else {
                if (mapG.containsKey(str2)) {
                    lzrVar2 = (lzr) mapG.get(str2);
                } else {
                    Map.Entry entry = (Map.Entry) ((oor) mapG).entrySet().iterator().next();
                    str2 = (String) entry.getKey();
                    lzrVar2 = (lzr) entry.getValue();
                }
                rect = (Rect) lzrVar2.d(CaptureResult.SCALER_CROP_REGION);
                lzrVar = lzrVar2;
                str = str2;
            }
        } else {
            lzrVar = lzvVar;
            str = str2;
        }
        Rect rect2 = (Rect) jthVar.a(str).l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return new hjz(lzrVar, i, rect2, str, rect == null ? rect2 : rect);
    }

    private final float b(float f) {
        return ((f - this.n.left) * this.s.width()) / this.n.width();
    }

    private final float c(float f) {
        return ((f - this.n.top) * this.s.height()) / this.n.height();
    }

    private final PointF d(PointF pointF) {
        return new PointF(b(pointF.x), c(pointF.y));
    }

    private final hjy e(hjy hjyVar) {
        Rect rect = hjyVar.a;
        return new hjy(hjyVar.i, rect != null ? new Rect(Math.round(b(rect.left)), Math.round(c(rect.top)), Math.round(b(rect.right)), Math.round(c(rect.bottom))) : null, hjyVar.b, hjyVar.c != null ? d(hjyVar.c) : null, hjyVar.d != null ? d(hjyVar.d) : null, hjyVar.e != null ? d(hjyVar.e) : null, hjyVar.f != null ? d(hjyVar.f) : null, hjyVar.g != null ? d(hjyVar.g) : null, hjyVar.h != null ? d(hjyVar.h) : null, hjyVar.j, hjyVar.k, hjyVar.l);
    }

    private static Object f(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.b > ((hjz) obj).b ? 1 : (this.b == ((hjz) obj).b ? 0 : -1));
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        float f = this.g;
        int i = this.e;
        float f2 = this.h;
        int i2 = this.i;
        int i3 = this.j;
        int i4 = this.k;
        int i5 = this.l;
        String strValueOf = String.valueOf(this.n);
        long j4 = this.m;
        float f3 = this.o;
        String string = Arrays.toString(this.p);
        int i6 = this.r;
        String strValueOf2 = String.valueOf(this.s);
        String str = this.a;
        int i7 = this.t;
        int i8 = this.u;
        int i9 = this.v;
        int i10 = this.w;
        boolean z = this.x;
        boolean z2 = this.y;
        float f4 = this.z;
        byte b = this.A;
        String string2 = Arrays.toString(this.B);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(strValueOf2).length();
        StringBuilder sb = new StringBuilder(length + 643 + length2 + length3 + String.valueOf(str).length() + String.valueOf(string2).length());
        sb.append("CameraMetadata{, timestampNs=");
        sb.append(j);
        sb.append(", exposureTime=");
        sb.append(j2);
        sb.append(", rollingShutterTime=");
        sb.append(j3);
        sb.append(", focalLength=");
        sb.append(f);
        sb.append(", sensorSensitivity=");
        sb.append(i);
        sb.append(", focusDistance=");
        sb.append(f2);
        sb.append(", aFStatus=");
        sb.append(i2);
        sb.append(", aEStatus=");
        sb.append(i3);
        sb.append(", aWBStatus=");
        sb.append(i4);
        sb.append(", lensStatus=");
        sb.append(i5);
        sb.append(", cropRegion=");
        sb.append(strValueOf);
        sb.append(", mTimestampBootime=");
        sb.append(j4);
        sb.append(", subjectMotion=");
        sb.append(f3);
        sb.append(", faces=");
        sb.append(string);
        sb.append(", rotationDegrees=");
        sb.append(i6);
        sb.append(", activeArraySize=");
        sb.append(strValueOf2);
        sb.append(", physicalId=");
        sb.append(str);
        sb.append(", controlMode=");
        sb.append(i7);
        sb.append(", aeMode=");
        sb.append(i8);
        sb.append(", aFMode=");
        sb.append(i9);
        sb.append(", aWBMode=");
        sb.append(i10);
        sb.append(", aELock=");
        sb.append(z);
        sb.append(", aWBLock=");
        sb.append(z2);
        sb.append(", lenseAperture=");
        sb.append(f4);
        sb.append(", jpegQuality=");
        sb.append((int) b);
        sb.append(", autoFocusRegions=");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
