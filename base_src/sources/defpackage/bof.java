package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;

/* JADX INFO: loaded from: classes.dex */
public class bof extends mip {
    private float LFD;
    private final ggz a;
    private final boolean b;
    private final ggo c;
    private final koq d;

    public bof(ggo ggoVar, ggz ggzVar, koq koqVar, boolean z, byte[] bArr) {
        this.c = ggoVar;
        this.a = ggzVar;
        this.d = koqVar;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:69:0x0161  */
    /* JADX WARN: Code duplicated, block: B:70:0x0170  */
    private final ojc w(lzv lzvVar) {
        ojc ojcVar;
        MeteringRectangle[] meteringRectangleArr;
        ojc ojcVarI;
        ojc ojcVarI2;
        int length;
        if (!this.b) {
            MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) lzvVar.d(CaptureResult.CONTROL_AF_REGIONS);
            if (meteringRectangleArr2 == null || meteringRectangleArr2.length <= 0) {
                return oih.a;
            }
            MeteringRectangle meteringRectangle = meteringRectangleArr2[0];
            return meteringRectangle.getRect().isEmpty() ? oih.a : ojc.i(bpv.a(-2, meteringRectangle.getRect()));
        }
        koq koqVar = this.d;
        koqVar.b++;
        MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) lzvVar.d(CaptureResult.CONTROL_AF_REGIONS);
        if (meteringRectangleArr3 == null || meteringRectangleArr3.length == 0) {
            ojcVar = oih.a;
        } else {
            Rect rect = meteringRectangleArr3[0].getRect();
            Face[] faceArr = (Face[]) lzvVar.d(CaptureResult.STATISTICS_FACES);
            if (faceArr == null) {
                ojcVar = oih.a;
            } else {
                ojc ojcVarI3 = oih.a;
                for (Face face : faceArr) {
                    Rect bounds = face.getBounds();
                    if (Math.abs(rect.centerX() - bounds.centerX()) < 100 && Math.abs(rect.centerY() - bounds.centerY()) < 100) {
                        Rect bounds2 = face.getBounds();
                        if (bounds2.width() * bounds2.height() > 0) {
                            ojcVarI3 = ojc.i(face);
                        }
                    }
                }
                ojcVar = ojcVarI3;
            }
        }
        if (ojcVar.g()) {
            koqVar.c = ((Face) ojcVar.c()).getId();
        }
        Face[] faceArr2 = (Face[]) lzvVar.d(CaptureResult.STATISTICS_FACES);
        if (faceArr2 == null || (length = faceArr2.length) <= 0) {
            meteringRectangleArr = (MeteringRectangle[]) lzvVar.d(CaptureResult.CONTROL_AF_REGIONS);
            if (meteringRectangleArr != null || meteringRectangleArr.length == 0) {
                ojcVarI = oih.a;
            } else {
                Face[] faceArr3 = (Face[]) lzvVar.d(CaptureResult.STATISTICS_FACES);
                if (faceArr3 == null || faceArr3.length <= 0) {
                    Rect rect2 = (Rect) lzvVar.d(CaptureResult.SCALER_CROP_REGION);
                    Rect rect3 = meteringRectangleArr[0].getRect();
                    ojcVarI = (Math.abs(rect2.centerX() - rect3.centerX()) >= 100 || Math.abs(rect3.centerY() - rect2.centerY()) >= 100) ? oih.a : ojc.i(new Rect(rect3.centerX() - 50, rect3.centerY() - 50, rect3.centerX() + 50, rect3.centerY() + 50));
                } else {
                    ojcVarI = oih.a;
                }
            }
            if (ojcVarI.g()) {
                ojcVarI2 = ojc.i(bpv.a(-2, (Rect) ojcVarI.c()));
            } else {
                ojcVarI2 = oih.a;
            }
        } else {
            int i = 0;
            while (true) {
                if (i < length) {
                    Face face2 = faceArr2[i];
                    if (koqVar.c == face2.getId()) {
                        ojcVarI2 = ojc.i(bpv.a(face2.getId(), new Rect(face2.getBounds())));
                    } else {
                        i++;
                    }
                } else {
                    meteringRectangleArr = (MeteringRectangle[]) lzvVar.d(CaptureResult.CONTROL_AF_REGIONS);
                    if (meteringRectangleArr != null) {
                        ojcVarI = oih.a;
                    } else {
                        ojcVarI = oih.a;
                    }
                    if (ojcVarI.g()) {
                        ojcVarI2 = ojc.i(bpv.a(-2, (Rect) ojcVarI.c()));
                    } else {
                        ojcVarI2 = oih.a;
                    }
                }
            }
        }
        if (!ojcVarI2.g()) {
            return oih.a;
        }
        int i2 = ((bpv) ojcVarI2.c()).a;
        if (i2 == koqVar.a) {
            return ojcVarI2;
        }
        if (koqVar.b <= 15) {
            return oih.a;
        }
        koqVar.b = 0;
        koqVar.a = i2;
        return ojcVarI2;
    }

    protected boolean a(lzv lzvVar) {
        return false;
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        Rect rect;
        Integer num;
        ojc ojcVarI;
        int iMax;
        if (lzvVar.d(CaptureResult.CONTROL_AF_MODE) != null) {
            Integer num2 = (Integer) lzvVar.d(CaptureResult.CONTROL_AF_MODE);
            num2.getClass();
            int iIntValue = num2.intValue();
            hkc hkcVar = (hkc) hkc.g.get(Integer.valueOf(iIntValue));
            if (hkcVar == null) {
                StringBuilder sb = new StringBuilder(35);
                sb.append("unknown metadata value: ");
                sb.append(iIntValue);
                new IllegalArgumentException(sb.toString());
                return;
            }
            Object objD = lzvVar.d(CaptureResult.CONTROL_AF_STATE);
            if (objD != null) {
                Integer num3 = (Integer) objD;
                num3.getClass();
                int iIntValue2 = num3.intValue();
                Object objD2 = lzvVar.d(CaptureResult.LENS_FOCUS_DISTANCE);
                if (objD2 != null) {
                    Float f = (Float) objD2;
                    float fFloatValue = f.floatValue();
                    if (this.LFD != fFloatValue) {
                        this.LFD = fFloatValue;
                        if (2 == iIntValue2) {
                            iIntValue2 = 1;
                        }
                    }
                    hkd hkdVarA = hkd.a(iIntValue2);
                    Float f2 = f;
                    f2.getClass();
                    boolean zA = a(lzvVar);
                    ojc ojcVarW = w(lzvVar);
                    if (ojcVarW.g() && (rect = (Rect) lzvVar.d(CaptureResult.SCALER_CROP_REGION)) != null) {
                        ggz ggzVar = this.a;
                        Rect rect2 = ((bpv) ojcVarW.c()).b;
                        PointF pointF = new PointF(rect2.exactCenterX(), rect2.exactCenterY());
                        PointF pointFK = ggzVar.a.k(new PointF((pointF.x - rect.left) / rect.width(), (pointF.y - rect.top) / rect.height()));
                        ggl gglVar = new ggl();
                        gglVar.a(false);
                        gglVar.b = -1;
                        gglVar.a = pointFK;
                        int i = ((bpv) ojcVarW.c()).a;
                        boolean z = i >= 0 || i == -1;
                        gglVar.a(z);
                        PointF pointF2 = gglVar.a;
                        if (pointF2 == null || (num = gglVar.b) == null || gglVar.c == null) {
                            StringBuilder sb2 = new StringBuilder();
                            if (gglVar.a == null) {
                                sb2.append(" normalizedCenterPoint");
                            }
                            if (gglVar.b == null) {
                                sb2.append(" confidenceScore");
                            }
                            if (gglVar.c == null) {
                                sb2.append(" isFace");
                            }
                            String strValueOf = String.valueOf(sb2);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                            sb3.append("Missing required properties:");
                            sb3.append(strValueOf);
                            throw new IllegalStateException(sb3.toString());
                        }
                        ojcVarI = ojc.i(new ggm(pointF2, num.intValue(), gglVar.c.booleanValue()));
                    } else {
                        ojcVarI = oih.a;
                    }
                    ojc ojcVarW2 = w(lzvVar);
                    if (ojcVarW2.g()) {
                        Rect rect3 = ((bpv) ojcVarW2.c()).b;
                        iMax = (int) (Math.max(rect3.width(), rect3.height()) * (true != this.b ? 1.0f : 1.3f));
                    } else {
                        iMax = 0;
                    }
                    this.c.fB(new ggn(hkcVar, hkdVarA, f2.floatValue(), zA, ojcVarI, iMax));
                }
            }
        }
    }
}
