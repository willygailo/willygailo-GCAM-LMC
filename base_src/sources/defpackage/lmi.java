package defpackage;

import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class lmi {
    private static final double b = Math.log(2.0d);
    private static final Long c = 1000L;
    public final ExifInterface a;

    public lmi(ExifInterface exifInterface) {
        this.a = exifInterface;
    }

    public static ExifInterface a(byte[] bArr) {
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.r(bArr);
        } catch (IOException e) {
            Log.w("CAM_CameraExif", "Failed to read EXIF data", e);
        }
        return exifInterface;
    }

    public static lmi b() {
        return new lmi(new ExifInterface());
    }

    public static final lid i(Float f, Long l) {
        if (f == null || l == null) {
            return null;
        }
        return new lid((long) (f.floatValue() * l.longValue()), l.longValue());
    }

    private static final lid j(Double d, Long l) {
        double dDoubleValue = d.doubleValue();
        double dLongValue = l.longValue();
        Double.isNaN(dLongValue);
        return new lid((long) (dDoubleValue * dLongValue), l.longValue());
    }

    public final void c(int i, Object obj) {
        if (obj != null) {
            ExifInterface exifInterface = this.a;
            exifInterface.y(exifInterface.i(i, obj));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(Location location) {
        ExifInterface exifInterface = this.a;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        lmg lmgVarI = exifInterface.i(ExifInterface.aT, ExifInterface.w(latitude));
        lmg lmgVarI2 = exifInterface.i(ExifInterface.aV, ExifInterface.w(longitude));
        lmg lmgVarI3 = exifInterface.i(ExifInterface.aS, latitude >= 0.0d ? "N" : "S");
        lmg lmgVarI4 = exifInterface.i(ExifInterface.aU, longitude >= 0.0d ? "E" : "W");
        if (lmgVarI != null && lmgVarI2 != null && lmgVarI3 != null && lmgVarI4 != null) {
            exifInterface.y(lmgVarI);
            exifInterface.y(lmgVarI2);
            exifInterface.y(lmgVarI3);
            exifInterface.y(lmgVarI4);
        }
        ExifInterface exifInterface2 = this.a;
        long time = location.getTime();
        lmg lmgVarI5 = exifInterface2.i(ExifInterface.bs, exifInterface2.bC.format(Long.valueOf(time)));
        if (lmgVarI5 != null) {
            exifInterface2.y(lmgVarI5);
            exifInterface2.bD.setTimeInMillis(time);
            lmg lmgVarI6 = exifInterface2.i(ExifInterface.aY, new lid[]{new lid(exifInterface2.bD.get(11), 1L), new lid(exifInterface2.bD.get(12), 1L), new lid(exifInterface2.bD.get(13), 1L)});
            if (lmgVarI6 != null) {
                exifInterface2.y(lmgVarI6);
            }
        }
        if (location.hasAltitude()) {
            ExifInterface exifInterface3 = this.a;
            double altitude = location.getAltitude();
            int i = ExifInterface.aX;
            double dAbs = Math.abs(altitude);
            double dLongValue = ExifInterface.bx.longValue();
            Double.isNaN(dLongValue);
            lmg lmgVarI7 = exifInterface3.i(i, new lid((int) (dAbs * dLongValue), ExifInterface.bx.longValue()));
            lmg lmgVarI8 = exifInterface3.i(ExifInterface.aW, Byte.valueOf(altitude >= 0.0d ? (byte) 0 : (byte) 1));
            if (lmgVarI7 == null || lmgVarI8 == null) {
                return;
            }
            exifInterface3.y(lmgVarI7);
            exifInterface3.y(lmgVarI8);
        }
    }

    public final void e() {
        c(ExifInterface.g, Build.MANUFACTURER);
        c(ExifInterface.h, Build.MODEL);
    }

    public final void f(int i, int i2, lic licVar, ojc ojcVar) {
        Object lidVar;
        e();
        ExifInterface exifInterface = this.a;
        int i3 = ExifInterface.ai;
        Integer numValueOf = Integer.valueOf(i);
        exifInterface.y(exifInterface.i(i3, numValueOf));
        ExifInterface exifInterface2 = this.a;
        int i4 = ExifInterface.aj;
        Integer numValueOf2 = Integer.valueOf(i2);
        exifInterface2.y(exifInterface2.i(i4, numValueOf2));
        ExifInterface exifInterface3 = this.a;
        exifInterface3.y(exifInterface3.i(ExifInterface.a, numValueOf));
        ExifInterface exifInterface4 = this.a;
        exifInterface4.y(exifInterface4.i(ExifInterface.b, numValueOf2));
        ExifInterface exifInterface5 = this.a;
        exifInterface5.y(exifInterface5.i(ExifInterface.j, Short.valueOf(lmb.b(licVar).i)));
        if (ojcVar.g()) {
            lzr lzrVar = (lzr) ojcVar.c();
            Long l = 1000000000L;
            Long l2 = (Long) lzrVar.d(CaptureResult.SENSOR_EXPOSURE_TIME);
            c(ExifInterface.F, l2 != null ? new lid(l2.longValue(), l.longValue()) : null);
            if (l2 != null) {
                double dLongValue = l2.longValue();
                double dLongValue2 = l.longValue();
                Double.isNaN(dLongValue);
                Double.isNaN(dLongValue2);
                c(ExifInterface.Q, j(Double.valueOf(Math.log(Double.valueOf(dLongValue / dLongValue2).doubleValue()) / b), 100L));
            }
            Integer numValueOf3 = (Integer) lzrVar.d(CaptureResult.SENSOR_SENSITIVITY);
            if (numValueOf3 != null) {
                Integer num = (Integer) lzrVar.d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                if (num != null) {
                    numValueOf3 = Integer.valueOf(numValueOf3.intValue() * (num.intValue() / 100));
                }
                c(ExifInterface.J, numValueOf3);
            }
            Float f = (Float) lzrVar.d(CaptureResult.LENS_APERTURE);
            c(ExifInterface.G, i(f, 100L));
            if (f != null) {
                double dDoubleValue = Double.valueOf(Math.log(f.floatValue()) / b).doubleValue();
                c(ExifInterface.R, j(Double.valueOf(dDoubleValue + dDoubleValue), 100L));
            }
            c(ExifInterface.Z, i((Float) lzrVar.d(CaptureResult.LENS_FOCAL_LENGTH), 1000L));
            Integer num2 = (Integer) lzrVar.d(CaptureResult.FLASH_STATE);
            short s = 1;
            if (num2 == null || num2.intValue() != 3) {
                c(ExifInterface.Y, (short) 0);
            } else {
                c(ExifInterface.Y, (short) 1);
            }
            Float f2 = (Float) lzrVar.d(CaptureResult.LENS_FOCUS_DISTANCE);
            if (f2 != null) {
                if (f2.floatValue() > 1.0E-6f) {
                    float fFloatValue = 1.0f / f2.floatValue();
                    lidVar = i(Float.valueOf(fFloatValue), c);
                    if (fFloatValue >= 1.0f) {
                        s = fFloatValue < 3.0f ? (short) 2 : (short) 3;
                    }
                } else if (f2.floatValue() >= 0.0f) {
                    lidVar = new lid(-1L, 1L);
                    s = 3;
                } else {
                    lidVar = new lid(0L, 1L);
                    s = 0;
                }
                c(ExifInterface.V, lidVar);
                c(ExifInterface.aI, Short.valueOf(s));
            }
        }
    }

    public final void g(long j) {
        if (j > 0) {
            this.a.x(ExifInterface.s, j, TimeZone.getDefault());
            this.a.x(ExifInterface.M, j, TimeZone.getDefault());
            this.a.x(ExifInterface.N, j, TimeZone.getDefault());
        }
    }

    public final void h(lwd lwdVar, lid lidVar, lid lidVar2) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        c(ExifInterface.aK, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(lwd.a(lwdVar).concat(" camera"));
        if (lidVar != null) {
            double dA = lidVar.a();
            StringBuilder sb = new StringBuilder(26);
            sb.append(dA);
            sb.append("mm");
            arrayList.add(sb.toString());
        }
        if (lidVar2 != null) {
            double dA2 = lidVar2.a();
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("f/");
            sb2.append(dA2);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb3.append((String) arrayList.get(i));
            if (i < arrayList.size() - 1) {
                sb3.append(' ');
            }
        }
        ExifInterface exifInterface = this.a;
        exifInterface.y(exifInterface.i(ExifInterface.aL, sb3.toString()));
    }
}
