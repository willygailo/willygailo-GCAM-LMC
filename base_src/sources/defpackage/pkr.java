package defpackage;

import MC.hslh;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.LensShadingMap;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.RggbChannelVector;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import com.AGC;
import com.Fix.ColorTransform;
import com.Fix.IsoTime;
import com.Fix.Pref;
import com.Helper;
import com.SDE.Awb;
import com.SpatialGainMapValue;
import com.custom.Astro;
import com.custom.OneShot;
import com.custom.slider;
import com.google.android.apps.camera.bottombar.R;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.DngColorCalibration;
import com.google.googlex.gcam.DngColorCalibrationVector;
import com.google.googlex.gcam.FaceInfo;
import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.FloatArray4;
import com.google.googlex.gcam.FloatArray9;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.FrameMetadataKey;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.MeshTranslation;
import com.google.googlex.gcam.MeshWarp;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.PixelRectVector;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.WeightedNormalizedRect;
import com.google.googlex.gcam.WeightedNormalizedRectVector;
import com.google.googlex.gcam.WeightedPixelRect;
import com.google.googlex.gcam.WeightedPixelRectVector;
import com.juliantsependa.ColorTune;
import j$.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import overwhelmer.simplified_lol;

/* JADX INFO: loaded from: classes3.dex */
public final class pkr {
    public static final String c = pkr.class.getSimpleName();
    public static final lzi d = lzi.a();
    private static final lvp k = null;
    public final lvp a;
    public final lvq b;

    public pkr(lvp lvpVar, lvq lvqVar) {
        Helper.GetLens(lvpVar);
        this.a = lvpVar;
        k = lvpVar;
        this.b = lvqVar;
        obr.aG(lzh.a().f, "Android Q or higher required.");
    }

    public static FloatVector A(float[] fArr) {
        FloatVector floatVector = new FloatVector();
        BufferUtils.setFloatVectorImpl(fArr, floatVector.a);
        return floatVector;
    }

    private static void B(MeteringRectangle[] meteringRectangleArr, boolean z, WeightedPixelRectVector weightedPixelRectVector) {
        if (meteringRectangleArr != null) {
            for (MeteringRectangle meteringRectangle : meteringRectangleArr) {
                if (z || meteringRectangle.getMeteringWeight() != 0) {
                    WeightedPixelRect weightedPixelRect = new WeightedPixelRect();
                    Rect rect = meteringRectangle.getRect();
                    long jWeightedPixelRect_rect_get = GcamModuleJNI.WeightedPixelRect_rect_get(weightedPixelRect.a, weightedPixelRect);
                    PixelRect pixelRect = jWeightedPixelRect_rect_get == 0 ? null : new PixelRect(jWeightedPixelRect_rect_get, false);
                    pixelRect.d(rect.left);
                    pixelRect.e(rect.right);
                    pixelRect.f(rect.top);
                    pixelRect.g(rect.bottom);
                    GcamModuleJNI.WeightedPixelRect_weight_set(weightedPixelRect.a, weightedPixelRect, meteringRectangle.getMeteringWeight());
                    GcamModuleJNI.WeightedPixelRectVector_add(weightedPixelRectVector.a, weightedPixelRectVector, weightedPixelRect.a, weightedPixelRect);
                }
            }
        }
    }

    private static void C(lvp lvpVar, pkq pkqVar, Map map, FaceInfoVector faceInfoVector) {
        Float f;
        int length;
        int[] iArr;
        pkq pkqVar2 = pkqVar;
        Rect rect = (Rect) lvpVar.n(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Face[] faceArr = pkqVar2.a;
        if (faceArr != null) {
            int i = 0;
            int i2 = 0;
            while (i < faceArr.length) {
                Face face = faceArr[i];
                Rect bounds = face.getBounds();
                float f2 = iWidth;
                float fExactCenterX = bounds.exactCenterX() / f2;
                float f3 = iHeight;
                float fExactCenterY = bounds.exactCenterY() / f3;
                float fWidth = (bounds.width() + bounds.height()) / 2.0f;
                float f4 = iWidth > iHeight ? fWidth / f2 : fWidth / f3;
                float score = (face.getScore() - 1) / 99.0f;
                if (fExactCenterX < 0.0f || fExactCenterX > 1.0f || fExactCenterY < 0.0f || fExactCenterY > 1.0f || f4 < 0.0f || f4 > 1.0f || score < 0.0f || score > 1.0f) {
                    Log.w(c, String.format("Face data is bad: (%d, %d) - (%d, %d), score %d", Integer.valueOf(bounds.left), Integer.valueOf(bounds.top), Integer.valueOf(bounds.right), Integer.valueOf(bounds.bottom), Integer.valueOf(face.getScore())));
                } else {
                    FaceInfo faceInfo = new FaceInfo();
                    i = i;
                    GcamModuleJNI.FaceInfo_pos_x_set(faceInfo.a, faceInfo, fExactCenterX);
                    GcamModuleJNI.FaceInfo_pos_y_set(faceInfo.a, faceInfo, fExactCenterY);
                    GcamModuleJNI.FaceInfo_size_set(faceInfo.a, faceInfo, f4);
                    GcamModuleJNI.FaceInfo_confidence_set(faceInfo.a, faceInfo, score);
                    Face[] faceArr2 = pkqVar2.a;
                    if (faceArr2 == null || (length = faceArr2.length) <= 0 || (iArr = pkqVar2.b) == null || iArr.length != length) {
                        int[] iArr2 = {1, 2, 46};
                        int i3 = 0;
                        for (int i4 = 3; i3 < i4; i4 = 3) {
                            int i5 = iArr2[i3];
                            int i6 = i5 - 1;
                            lwd lwdVar = lwd.FRONT;
                            Point leftEyePosition = null;
                            if (i5 == 0) {
                                throw null;
                            }
                            switch (i6) {
                                case 0:
                                    leftEyePosition = face.getLeftEyePosition();
                                    break;
                                case 1:
                                    leftEyePosition = face.getRightEyePosition();
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                    leftEyePosition = face.getMouthPosition();
                                    break;
                            }
                            if (leftEyePosition != null) {
                                FaceInfo.Landmark landmark = new FaceInfo.Landmark();
                                landmark.b(leftEyePosition.x / f2);
                                landmark.c(leftEyePosition.y / f3);
                                faceInfo.a().b(i6, landmark);
                            }
                            i3++;
                        }
                    } else {
                        float[] fArr = pkqVar2.d;
                        byte[] bArr = pkqVar2.c;
                        if (fArr != null && bArr != null) {
                            int i7 = 0;
                            while (true) {
                                int i8 = iArr[i];
                                if (i7 < i8) {
                                    FaceInfo.Landmark landmark2 = new FaceInfo.Landmark();
                                    int i9 = i2 + i7;
                                    int i10 = i9 + i9;
                                    landmark2.b(fArr[i10] / f2);
                                    landmark2.c(fArr[i10 + 1] / f3);
                                    faceInfo.a().b(bArr[i9], landmark2);
                                    i7++;
                                } else {
                                    i2 += i8;
                                }
                            }
                        }
                    }
                    if (map != null && (f = (Float) map.get(Integer.valueOf(face.getId()))) != null) {
                        GcamModuleJNI.FaceInfo_familiarity_set(faceInfo.a, faceInfo, f.floatValue());
                    }
                    GcamModuleJNI.FaceInfoVector_add(faceInfoVector.a, faceInfoVector, faceInfo.a, faceInfo);
                }
                i++;
                pkqVar2 = pkqVar;
            }
        }
    }

    public static boolean D(lzr lzrVar) {
        lzi lziVar = d;
        if (lziVar.e() || lziVar.g() || lziVar.i || lziVar.h() || lziVar.m) {
            return (lzrVar == null ? -1 : (Integer) lzrVar.d(CaptureResult.CONTROL_SCENE_MODE)).intValue() == 3;
        }
        return false;
    }

    public static float[] E(lvp lvpVar) {
        float[] fArr;
        if (kdd.l != null && (fArr = (float[]) lvpVar.l(kdd.l)) != null) {
            return fArr;
        }
        Range range = (Range) lvpVar.n(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        return new float[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()};
    }

    public static float b(long j) {
        return j / 1000000.0f;
    }

    public static int c(lvp lvpVar) {
        return d(lvpVar, null, null);
    }

    public static int d(lvp lvpVar, lvq lvqVar, lzv lzvVar) {
        return AGC.getGcamSensorId(lvpVar, lvqVar, lzvVar);
    }

    public static long e(lvp lvpVar) {
        lwp lwpVarH = h(lvpVar);
        long jG = lvpVar.g(lwpVarH.a, lwpVarH.b);
        return ((int) jG) != 0 ? jG : AGC.getReadoutTimeNs(lvpVar);
    }

    public static lwp h(lvp lvpVar) {
        List listX = lvpVar.x(37);
        int i = Helper.samsu;
        List listX2 = lvpVar.x(i);
        int i2 = Helper.sams;
        List listX3 = lvpVar.x(i2);
        if (!listX.isEmpty()) {
            return new lwp(37, mip.bs(listX));
        }
        if (!listX2.isEmpty()) {
            return new lwp(i, mip.bs(listX2));
        }
        if (listX3.isEmpty()) {
            throw new IllegalArgumentException("No HDR+ compatible raw format supported.");
        }
        return new lwp(i2, mip.bs(listX3));
    }

    public static lzv i(lzv lzvVar, String str) {
        Map mapG = lzvVar.g();
        if (mapG.isEmpty()) {
            return lzvVar;
        }
        lzr lzrVar = (lzr) mapG.get(str);
        if (lzrVar != null) {
            return new lzu(lzrVar);
        }
        String str2 = c;
        String strValueOf = String.valueOf(str);
        Log.w(str2, strValueOf.length() != 0 ? "Physical metadata is null for images from camera ".concat(strValueOf) : new String("Physical metadata is null for images from camera "));
        return lzvVar;
    }

    public static MeshWarp o(Rect rect, lzr lzrVar) {
        MeshWarp meshWarp = new MeshWarp(GcamModuleJNI.new_MeshWarp(), true);
        if (kdb.l != null && kdb.j != null && kdb.k != null && (kdb.m == null || lzrVar.d(kdb.m) == null || !((Boolean) lzrVar.d(kdb.m)).booleanValue())) {
            float[] fArr = (float[]) lzrVar.d(kdb.l);
            int[] iArr = (int[]) lzrVar.d(kdb.j);
            int[] iArr2 = (int[]) lzrVar.d(kdb.k);
            if (fArr != null && iArr != null && iArr.length == 2 && iArr2 != null && iArr2.length == 4) {
                int length = fArr.length;
                int i = iArr[0] * iArr[1];
                if (length == i + i) {
                    FloatVector floatVectorA = A(fArr);
                    GcamModuleJNI.MeshWarp_mesh_warp_data_set(meshWarp.a, meshWarp, floatVectorA.a, floatVectorA);
                    GcamModuleJNI.MeshWarp_grid_cols_set(meshWarp.a, meshWarp, iArr[0]);
                    GcamModuleJNI.MeshWarp_grid_rows_set(meshWarp.a, meshWarp, iArr[1]);
                    PixelRect pixelRect = new PixelRect();
                    pixelRect.d(iArr2[0]);
                    pixelRect.f(iArr2[1]);
                    pixelRect.e(iArr2[0] + iArr2[2]);
                    pixelRect.g(iArr2[1] + iArr2[3]);
                    GcamModuleJNI.MeshWarp_mesh_warp_crop_region_set(meshWarp.a, meshWarp, pixelRect.a, pixelRect);
                    obr.aK(!rect.isEmpty(), "Invalid physical scaler crop region: %s", rect);
                    PixelRect pixelRect2 = new PixelRect();
                    pixelRect2.d(rect.left);
                    pixelRect2.e(rect.right);
                    pixelRect2.f(rect.top);
                    pixelRect2.g(rect.bottom);
                    GcamModuleJNI.MeshWarp_mesh_warp_dst_region_set(meshWarp.a, meshWarp, pixelRect2.a, pixelRect2);
                } else {
                    Log.e(c, String.format("Mesh data length (%d) and grid dimension (%dx%dx2) mismatch.", Integer.valueOf(length), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])));
                }
            }
        }
        return meshWarp;
    }

    public static void q(lvp lvpVar, lzr lzrVar, FaceInfoVector faceInfoVector) {
        C(lvpVar, new pkq(lzrVar), null, faceInfoVector);
    }

    public static void r(lvp lvpVar, Face[] faceArr, FaceInfoVector faceInfoVector) {
        C(lvpVar, new pkq(faceArr), null, faceInfoVector);
    }

    public static float[] s(lvp lvpVar, lzv lzvVar) {
        float f;
        float fMax = 1.0f;
        Float f2 = kdc.s != null ? (Float) lzvVar.d(kdc.s) : null;
        int iFloatValue = f2 != null ? (int) f2.floatValue() : ((Integer) lzvVar.d(CaptureResult.SENSOR_SENSITIVITY)).intValue();
        int iIntValue = ((Integer) ((Range) lvpVar.n(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue();
        int iIntValue2 = ((Integer) lvpVar.n(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY)).intValue();
        if (Helper.getSunlightFix == 0 || iFloatValue <= iIntValue || 120 <= iFloatValue) {
            float f3 = iFloatValue;
            float f4 = iIntValue2;
            if (f3 > f4) {
                f = f4 / iIntValue;
                fMax = Math.max(f3 / f4, 1.0f);
            } else {
                f = f3 / iIntValue;
            }
        } else {
            f = 1.0f;
        }
        return new float[]{f, fMax};
    }

    public static int[] t(int i) {
        switch (i) {
            case 0:
            case 1:
                return new int[]{0, 1, 2, 3};
            case 2:
            case 3:
            case 4:
            case 5:
                return new int[]{0, 2, 1, 3};
            default:
                throw new IllegalArgumentException("CameraCharacteristics: unsupported colorFilterArrangment");
        }
    }

    public static StaticMetadata v(lvp lvpVar) {
        int i;
        int i2;
        StaticMetadata staticMetadata = new StaticMetadata(GcamModuleJNI.new_StaticMetadata__SWIG_0(), true);
        GcamModuleJNI.StaticMetadata_make_set(staticMetadata.a, staticMetadata, "Google");
        GcamModuleJNI.StaticMetadata_model_set(staticMetadata.a, staticMetadata, Build.MODEL);
        GcamModuleJNI.StaticMetadata_device_set(staticMetadata.a, staticMetadata, Helper.SetHDRInterface());
        String strA = lzj.a.a("ro.revision");
        if (strA != null && !strA.isEmpty()) {
            GcamModuleJNI.StaticMetadata_hardware_revision_set(staticMetadata.a, staticMetadata, strA);
        }
        String strValueOf = String.valueOf(GcamModuleJNI.GetVersion());
        GcamModuleJNI.StaticMetadata_software_set(staticMetadata.a, staticMetadata, strValueOf.length() != 0 ? "HDR+ ".concat(strValueOf) : new String("HDR+ "));
        GcamModuleJNI.StaticMetadata_device_os_version_set(staticMetadata.a, staticMetadata, Build.FINGERPRINT);
        GcamModuleJNI.StaticMetadata_device_os_unix_ms_set(staticMetadata.a, staticMetadata, Build.TIME);
        staticMetadata.f(c(lvpVar));
        GcamModuleJNI.StaticMetadata_has_flash_set(staticMetadata.a, staticMetadata, lvpVar.H());
        lwd lwdVarK = lvpVar.k();
        lwd lwdVar = lwd.FRONT;
        switch (lwdVarK) {
            case FRONT:
                i = 0;
                break;
            case BACK:
                i = 1;
                break;
            case EXTERNAL:
                i = 2;
                break;
            default:
                i = -1;
                break;
        }
        GcamModuleJNI.StaticMetadata_lens_facing_set(staticMetadata.a, staticMetadata, i);
        List listR = lvpVar.r();
        obr.aG(!listR.isEmpty(), "Cameras must have at least one focal length.");
        FloatVector floatVector = new FloatVector();
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            floatVector.b(((Float) it.next()).floatValue());
        }
        GcamModuleJNI.StaticMetadata_available_focal_lengths_mm_set(staticMetadata.a, staticMetadata, floatVector.a, floatVector);
        float[] fArr = (float[]) lvpVar.n(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        obr.aG(fArr.length > 0, "Cameras must have at least one f-number (aperture size).");
        FloatVector floatVectorA = A(fArr);
        GcamModuleJNI.StaticMetadata_available_f_numbers_set(staticMetadata.a, staticMetadata, floatVectorA.a, floatVectorA);
        GcamModuleJNI.StaticMetadata_white_level_set(staticMetadata.a, staticMetadata, hslh.getWhiteLevel(((Integer) lvpVar.l(CameraCharacteristics.SENSOR_INFO_WHITE_LEVEL)).intValue()));
        Rect[] rectArr = (Rect[]) lvpVar.l(CameraCharacteristics.SENSOR_OPTICAL_BLACK_REGIONS);
        if (rectArr != null) {
            PixelRectVector pixelRectVector = new PixelRectVector();
            for (Rect rect : rectArr) {
                PixelRect pixelRect = new PixelRect();
                pixelRect.d(rect.left);
                pixelRect.e(rect.right);
                pixelRect.f(rect.top);
                pixelRect.g(rect.bottom);
                pixelRectVector.a(pixelRect);
            }
            GcamModuleJNI.StaticMetadata_optically_black_regions_set(staticMetadata.a, staticMetadata, pixelRectVector.a, pixelRectVector);
        }
        int iIntValue = ((Integer) lvpVar.n(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue();
        switch (iIntValue) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 3;
                break;
            case 2:
                i2 = 4;
                break;
            case 3:
                i2 = 2;
                break;
            default:
                String str = c;
                StringBuilder sb = new StringBuilder(93);
                sb.append("convertToBayerPattern: unsupported color filter arrangement: ");
                sb.append(iIntValue);
                sb.append(", returning kInvalid.");
                Log.w(str, sb.toString());
                i2 = 0;
                break;
        }
        GcamModuleJNI.StaticMetadata_bayer_pattern_set(staticMetadata.a, staticMetadata, i2);
        long[] jArr = {((Long) ((Range) lvpVar.n(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE)).getLower()).longValue(), ((Long) ((Range) lvpVar.n(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE)).getUpper()).longValue()};
        float[] fArr2 = {b(jArr[0]), b(jArr[1])};
        Float fValueOf = null;
        if (lvpVar.k() == lwd.BACK) {
            lzi lziVar = d;
            if (lziVar.e() || lziVar.f || lziVar.g() || lziVar.h() || lziVar.i || lziVar.m) {
                int iC = c(lvpVar);
                if (iC == 0) {
                    fValueOf = Float.valueOf(32000.0f);
                } else if (iC == 4 || iC == 5 || iC == 8) {
                    fValueOf = Float.valueOf(24000.0f);
                }
            }
        }
        if (fValueOf != null) {
            fArr2[1] = Math.max(fValueOf.floatValue(), fArr2[0]);
        }
        GcamModuleJNI.StaticMetadata_exposure_time_range_ms_set(staticMetadata.a, staticMetadata, fArr2);
        float[] fArrE = E(lvpVar);
        float fX = x(lvpVar);
        GcamModuleJNI.StaticMetadata_iso_range_set(staticMetadata.a, staticMetadata, fArrE);
        GcamModuleJNI.StaticMetadata_max_analog_iso_set(staticMetadata.a, staticMetadata, fX);
        DngColorCalibrationVector dngColorCalibrationVector = new DngColorCalibrationVector();
        Integer num = (Integer) lvpVar.l(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT1);
        if (num != null) {
            FloatArray9 floatArray9Z = z((ColorSpaceTransform) lvpVar.n(CameraCharacteristics.SENSOR_COLOR_TRANSFORM1));
            FloatArray9 floatArray9Z2 = z((ColorSpaceTransform) lvpVar.n(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM1));
            DngColorCalibration dngColorCalibration = new DngColorCalibration();
            dngColorCalibration.b(num.intValue());
            dngColorCalibration.d(floatArray9Z);
            dngColorCalibration.c(floatArray9Z2);
            dngColorCalibrationVector.a(dngColorCalibration);
        }
        Byte b = (Byte) lvpVar.l(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT2);
        if (b != null) {
            FloatArray9 floatArray9Z3 = z((ColorSpaceTransform) lvpVar.n(CameraCharacteristics.SENSOR_COLOR_TRANSFORM2));
            FloatArray9 floatArray9Z4 = z((ColorSpaceTransform) lvpVar.n(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM2));
            DngColorCalibration dngColorCalibration2 = new DngColorCalibration();
            dngColorCalibration2.b(b.byteValue());
            dngColorCalibration2.d(floatArray9Z3);
            dngColorCalibration2.c(floatArray9Z4);
            dngColorCalibrationVector.a(dngColorCalibration2);
        }
        GcamModuleJNI.StaticMetadata_dng_color_calibration_set(staticMetadata.a, staticMetadata, dngColorCalibrationVector.a, dngColorCalibrationVector);
        Awb.getQcColorCalibration(staticMetadata);
        SizeF sizeF = (SizeF) lvpVar.n(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        GcamModuleJNI.StaticMetadata_sensor_physical_width_mm_set(staticMetadata.a, staticMetadata, sizeF.getWidth());
        GcamModuleJNI.StaticMetadata_sensor_physical_height_mm_set(staticMetadata.a, staticMetadata, sizeF.getHeight());
        Size size = (Size) lvpVar.n(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        GcamModuleJNI.StaticMetadata_pixel_array_width_set(staticMetadata.a, staticMetadata, size.getWidth());
        GcamModuleJNI.StaticMetadata_pixel_array_height_set(staticMetadata.a, staticMetadata, size.getHeight());
        Rect rect2 = (Rect) lvpVar.n(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
        PixelRect pixelRect2 = new PixelRect();
        pixelRect2.d(rect2.left);
        pixelRect2.e(rect2.right);
        pixelRect2.f(rect2.top);
        pixelRect2.g(rect2.bottom);
        GcamModuleJNI.StaticMetadata_active_area_set(staticMetadata.a, staticMetadata, pixelRect2.a, pixelRect2);
        lwp lwpVarH = h(lvpVar);
        GcamModuleJNI.StaticMetadata_frame_raw_max_width_set(staticMetadata.a, staticMetadata, lwpVarH.b.a);
        staticMetadata.e(lwpVarH.b.b);
        GcamModuleJNI.StaticMetadata_raw_bits_per_pixel_set(staticMetadata.a, staticMetadata, ImageFormat.getBitsPerPixel(lwpVarH.a));
        GcamModuleJNI.StaticMetadata_frame_readout_time_ms_set(staticMetadata.a, staticMetadata, b(e(lvpVar)));
        for (int i3 : (int[]) lvpVar.n(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION)) {
            if (i3 == 1) {
                GcamModuleJNI.StaticMetadata_has_ois_set(staticMetadata.a, staticMetadata, true);
            }
        }
        return staticMetadata;
    }

    public static float x(lvp lvpVar) {
        Float f;
        return (kdd.m == null || (f = (Float) lvpVar.l(kdd.m)) == null) ? ((Integer) lvpVar.n(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY)).intValue() : f.floatValue();
    }

    public static lvp y(lvp lvpVar, lvq lvqVar, lzv lzvVar) {
        if (!lvpVar.L()) {
            return lvpVar;
        }
        Set<lvs> setB = lvpVar.B();
        if (setB.size() == 1) {
            return lvqVar.a((lvs) setB.iterator().next());
        }
        Map mapG = lzvVar.g();
        String strE = (!mapG.isEmpty() || d.d()) ? ((orw) mapG).c == 1 ? ((lzr) Collection.EL.stream(((oor) mapG).values()).findFirst().get()).e() : null : lzvVar.e();
        if (strE != null) {
            for (lvs lvsVar : setB) {
                if (strE.equals(lvsVar.a)) {
                    return lvqVar.a(lvsVar);
                }
            }
            Log.e(c, String.format("Physical camera ID not found: %s in %s", strE, setB));
            throw new IllegalArgumentException(strE.length() != 0 ? "Physical camera with matching ID not found: ".concat(strE) : new String("Physical camera with matching ID not found: "));
        }
        Map mapG2 = lzvVar.g();
        Float f = ((orw) mapG2).c == 1 ? (Float) ((lzr) Collection.EL.stream(((oor) mapG2).values()).findFirst().get()).d(CaptureResult.LENS_FOCAL_LENGTH) : (Float) lzvVar.d(CaptureResult.LENS_FOCAL_LENGTH);
        f.getClass();
        Iterator it = setB.iterator();
        while (it.hasNext()) {
            lvp lvpVarA = lvqVar.a((lvs) it.next());
            List listR = lvpVarA.r();
            obr.aG(listR.size() == 1, "Physical cameras must have single focal length.");
            if (f.floatValue() == ((Float) listR.get(0)).floatValue()) {
                return lvpVarA;
            }
        }
        throw new IllegalArgumentException("Physical camera with matching focal length not found.");
    }

    public static FloatArray9 z(ColorSpaceTransform colorSpaceTransform) {
        Rational[] rationalArr = new Rational[9];
        colorSpaceTransform.copyElements(rationalArr, 0);
        FloatArray9 floatArray9 = new FloatArray9();
        for (int i = 0; i < 9; i++) {
            floatArray9.b(i, rationalArr[i].floatValue());
        }
        return floatArray9;
    }

    public final float a(int i) {
        int iGetAeCompension = i + Helper.GetAeCompension(i);
        Rational rational = (Rational) this.a.n(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        return new Rational(iGetAeCompension * rational.getNumerator(), rational.getDenominator()).floatValue();
    }

    public final long f(lzv lzvVar) {
        return e(g(lzvVar));
    }

    public final lvp g(lzv lzvVar) {
        return y(this.a, this.b, lzvVar);
    }

    public final AwbInfo j(lzv lzvVar) {
        int i;
        float f;
        FloatArray9 floatArray9Z;
        Rational[] rationalArr = (Rational[]) lzvVar.d(CaptureResult.SENSOR_NEUTRAL_COLOR_POINT);
        float fFloatValue = rationalArr[0].floatValue();
        float fFloatValue2 = rationalArr[1].floatValue();
        float fFloatValue3 = rationalArr[2].floatValue();
        float[] fArr = {fFloatValue, fFloatValue2, fFloatValue3};
        ColorTune.WB1 = fFloatValue;
        ColorTune.WB2 = fFloatValue2;
        ColorTune.WB3 = fFloatValue3;
        AwbInfo awbInfo = new AwbInfo(GcamModuleJNI.new_AwbInfo__SWIG_0(), true);
        int[] iArrT = t(((Integer) g(lzvVar).n(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue());
        FloatArray4 floatArray4 = new FloatArray4();
        int iSelectTint = Helper.SelectTint();
        if (iSelectTint == 0) {
            RggbChannelVector rggbChannelVector = (RggbChannelVector) lzvVar.d(CaptureResult.COLOR_CORRECTION_GAINS);
            i = 4;
            f = 1.0f;
            if (rggbChannelVector == null) {
                Log.w(c, "CaptureResult missing COLOR_CORRECTION_GAINS.");
                for (int i2 = 0; i2 < 4; i2++) {
                    floatArray4.d(i2, 1.0f);
                }
            } else {
                for (int i3 = 0; i3 < 4; i3++) {
                    floatArray4.d(i3, rggbChannelVector.getComponent(iArrT[i3]));
                }
            }
        } else {
            Rational[] rationalArr2 = (Rational[]) lzvVar.d(CaptureResult.SENSOR_NEUTRAL_COLOR_POINT);
            i = 4;
            f = 1.0f;
            floatArray4.d(0, 1.0f / rationalArr2[0].floatValue());
            floatArray4.d(1, 1.0f);
            floatArray4.d(2, 1.0f);
            floatArray4.d(3, 1.0f / rationalArr2[2].floatValue());
            Log.w(c, "CaptureResult is present COLOR_CORRECTION_GAINS NEUTRAL.");
        }
        GcamModuleJNI.AwbInfo_rggb_gains_set(awbInfo.a, awbInfo, floatArray4.a, floatArray4);
        ColorSpaceTransform colorSpaceTransform = (ColorSpaceTransform) lzvVar.d(CaptureResult.COLOR_CORRECTION_TRANSFORM);
        if (colorSpaceTransform == null) {
            Log.w(c, "CaptureResult missing COLOR_CORRECTION_TRANSFORM.");
            FloatArray9 floatArray9 = new FloatArray9();
            floatArray9.b(0, f);
            floatArray9.b(iSelectTint, 0.0f);
            floatArray9.b(2, 0.0f);
            floatArray9.b(3, 0.0f);
            floatArray9.b(i, f);
            floatArray9.b(5, 0.0f);
            floatArray9.b(6, 0.0f);
            floatArray9.b(7, 0.0f);
            floatArray9.b(8, f);
            floatArray9Z = floatArray9;
        } else {
            floatArray9Z = z(colorSpaceTransform);
        }
        FloatArray9 pseudoCT = ColorTransform.getPseudoCT(floatArray9Z, lzvVar);
        GcamModuleJNI.AwbInfo_rgb2rgb_set(awbInfo.a, awbInfo, pseudoCT.a, pseudoCT);
        return awbInfo;
    }

    public final FrameMetadata k(lzv lzvVar) {
        return l(lzvVar, null);
    }

    public final FrameMetadata l(lzv lzvVar, GyroSampleVector gyroSampleVector) {
        return m(lzvVar, gyroSampleVector, null);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 7 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:34)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:24)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:295)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final com.google.googlex.gcam.FrameMetadata m(defpackage.lzv r36, com.google.googlex.gcam.GyroSampleVector r37, java.util.Map r38) {
        /*
            Method dump skipped, instruction units count: 2216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkr.m(lzv, com.google.googlex.gcam.GyroSampleVector, java.util.Map):com.google.googlex.gcam.FrameMetadata");
    }

    public final FrameMetadataKey n(lzv lzvVar) {
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return null;
        }
        return new FrameMetadataKey(l.longValue(), d(g(lzvVar), this.b, lzvVar));
    }

    public final SpatialGainMap p(lzv lzvVar) {
        if (Helper.Exynos != 0) {
            return SpatialGainMapValue.getSpatialGainMap(lzvVar);
        }
        LensShadingMap lensShadingMap = (LensShadingMap) lzvVar.d(CaptureResult.STATISTICS_LENS_SHADING_CORRECTION_MAP);
        if (lensShadingMap == null) {
            int iIntValue = ((Integer) lzvVar.c().a(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE)).intValue();
            String str = c;
            StringBuilder sb = new StringBuilder(112);
            sb.append("android.statistics.lensShadingMap was null, returning the empty SpatialGainMap(). Requested mode was ");
            sb.append(iIntValue);
            Log.w(str, sb.toString());
            return new SpatialGainMap();
        }
        int columnCount = lensShadingMap.getColumnCount();
        int rowCount = lensShadingMap.getRowCount();
        SpatialGainMap spatialGainMap = new SpatialGainMap(GcamModuleJNI.new_SpatialGainMap__SWIG_2(columnCount, rowCount, false));
        int[] iArrT = t(((Integer) g(lzvVar).n(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue());
        for (int i = 0; i < 4; i++) {
            int i2 = iArrT[i];
            for (int i3 = 0; i3 < rowCount; i3++) {
                for (int i4 = 0; i4 < columnCount; i4++) {
                    GcamModuleJNI.SpatialGainMap_WriteRggb(spatialGainMap.a, spatialGainMap, i4, i3, i, lensShadingMap.getGainFactor(i2, i4, i3));
                }
            }
        }
        return spatialGainMap;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    /* JADX WARN: Code duplicated, block: B:17:0x007a  */
    public final void u(FrameRequest frameRequest, lzv lzvVar, gzs gzsVar) {
        int iMenuValue;
        lvp lvpVarG = g(lzvVar);
        float fC = frameRequest.c();
        float fLongValue = slider.getEXPTGT().longValue();
        if (((int) fLongValue) != 0) {
            fC = fLongValue / 1000000.0f;
            frameRequest.b(fC);
        }
        simplified_lol.sGainAE = frameRequest.a();
        simplified_lol.setManualIsoSlider();
        float f = simplified_lol.sManualIsoGain;
        frameRequest.setDesired_analog_gain(f);
        float fB = frameRequest.b();
        if (Helper.sFront != 0) {
            int iMenuValue2 = Pref.MenuValue("pref_aemode_front_key");
            if (iMenuValue2 != 0) {
                IsoTime.sGetDesired_exposure_time_ms = fC;
                IsoTime.sGetDesired_analog_gain = f;
                IsoTime.sGetDesired_digital_gain = fB;
                IsoTime.isoTimeFParametrs(iMenuValue2);
                fC = IsoTime.sGetDesired_exposure_time_ms;
                f = IsoTime.sGetDesired_analog_gain;
                fB = IsoTime.sGetDesired_digital_gain;
            }
        } else if (Helper.sModeNS == 0) {
            iMenuValue = Pref.MenuValue("pref_aemode_back_key");
            if (iMenuValue != 0) {
                IsoTime.sGetDesired_exposure_time_ms = fC;
                IsoTime.sGetDesired_analog_gain = f;
                IsoTime.sGetDesired_digital_gain = fB;
                IsoTime.isoTimeParametrs(iMenuValue);
                fC = IsoTime.sGetDesired_exposure_time_ms;
                f = IsoTime.sGetDesired_analog_gain;
                fB = IsoTime.sGetDesired_digital_gain;
            }
        } else if (OneShot.OneShotState != 0) {
            int iMenuValue3 = Pref.MenuValue("pref_aemode_oneshot_key");
            IsoTime.sGetDesired_exposure_time_ms = fC;
            IsoTime.sGetDesired_analog_gain = f;
            IsoTime.sGetDesired_digital_gain = fB;
            IsoTime.isoTimeOneShotParametrs(iMenuValue3);
            fC = IsoTime.sGetDesired_exposure_time_ms;
            f = IsoTime.sGetDesired_analog_gain;
            fB = IsoTime.sGetDesired_digital_gain;
        } else if (Astro.AstroState != 0) {
            int iMenuValue4 = Pref.MenuValue("pref_aemode_astro_key");
            IsoTime.sGetDesired_exposure_time_ms = fC;
            IsoTime.sGetDesired_analog_gain = f;
            IsoTime.sGetDesired_digital_gain = fB;
            IsoTime.isoTimeAstroParametrs(iMenuValue4);
            fC = IsoTime.sGetDesired_exposure_time_ms;
            f = IsoTime.sGetDesired_analog_gain;
            fB = IsoTime.sGetDesired_digital_gain;
        } else {
            iMenuValue = Pref.MenuValue("pref_aemode_back_key");
            if (iMenuValue != 0) {
                IsoTime.sGetDesired_exposure_time_ms = fC;
                IsoTime.sGetDesired_analog_gain = f;
                IsoTime.sGetDesired_digital_gain = fB;
                IsoTime.isoTimeParametrs(iMenuValue);
                fC = IsoTime.sGetDesired_exposure_time_ms;
                f = IsoTime.sGetDesired_analog_gain;
                fB = IsoTime.sGetDesired_digital_gain;
            }
        }
        gzsVar.a(CaptureRequest.CONTROL_MODE, 1);
        gzsVar.a(CaptureRequest.CONTROL_AE_MODE, 0);
        gzsVar.a(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf((long) (fC * 1000000.0f)));
        gzsVar.a(CaptureRequest.SENSOR_FRAME_DURATION, 0L);
        gzsVar.a(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf((int) (fB * f * E(lvpVarG)[0])));
        gzsVar.a(CaptureRequest.BLACK_LEVEL_LOCK, Boolean.valueOf(GcamModuleJNI.FrameRequest_try_to_lock_black_level_get(frameRequest.a, frameRequest)));
        long jFrameRequest_awb_get = GcamModuleJNI.FrameRequest_awb_get(frameRequest.a, frameRequest);
        AwbInfo awbInfo = jFrameRequest_awb_get == 0 ? null : new AwbInfo(jFrameRequest_awb_get, false);
        if (GcamModuleJNI.AwbInfo_IsValid(awbInfo.a, awbInfo)) {
            gzsVar.a(CaptureRequest.CONTROL_AWB_MODE, 0);
            gzsVar.a(CaptureRequest.COLOR_CORRECTION_MODE, 0);
            int[] iArrT = t(((Integer) lvpVarG.n(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue());
            long jAwbInfo_rggb_gains_get = GcamModuleJNI.AwbInfo_rggb_gains_get(awbInfo.a, awbInfo);
            FloatArray4 floatArray4 = jAwbInfo_rggb_gains_get == 0 ? null : new FloatArray4(jAwbInfo_rggb_gains_get, false);
            gzsVar.a(CaptureRequest.COLOR_CORRECTION_GAINS, new RggbChannelVector(floatArray4.a(iArrT[0]), floatArray4.a(iArrT[1]), floatArray4.a(iArrT[2]), floatArray4.a(iArrT[3])));
            long jAwbInfo_rgb2rgb_get = GcamModuleJNI.AwbInfo_rgb2rgb_get(awbInfo.a, awbInfo);
            FloatArray9 floatArray9 = jAwbInfo_rgb2rgb_get != 0 ? new FloatArray9(jAwbInfo_rgb2rgb_get, false) : null;
            obr.aI(GcamModuleJNI.FloatArray9_size(floatArray9.a, floatArray9) == 9, "ccm must have length %s.", 9);
            Rational[] rationalArr = new Rational[9];
            for (int i = 0; i < 9; i++) {
                rationalArr[i] = new Rational((int) (GcamModuleJNI.FloatArray9_get(floatArray9.a, floatArray9, i) * 10000.0f), 10000);
            }
            gzsVar.a(CaptureRequest.COLOR_CORRECTION_TRANSFORM, new ColorSpaceTransform(rationalArr));
        }
        gzsVar.a(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE, 1);
        gzsVar.a(CaptureRequest.STATISTICS_OIS_DATA_MODE, 1);
        gzsVar.a(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(kda.k != null ? 128 : lvpVarG.j().e));
    }

    public final void w(AeShotParams aeShotParams, lzv lzvVar, float f, lig ligVar) {
        lvp lvpVarG = g(lzvVar);
        lzv lzvVarI = i(lzvVar, lvpVarG.i().a);
        Rect rect = (Rect) lzvVarI.d(CaptureResult.SCALER_CROP_REGION);
        rect.getClass();
        MeshWarp meshWarpO = o(rect, lzvVar);
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) lzvVarI.d(CaptureResult.CONTROL_AE_REGIONS);
        Rect rect2 = (Rect) lzvVarI.d(CaptureResult.SCALER_CROP_REGION);
        rect2.getClass();
        obr.aK(!rect2.isEmpty(), "Invalid scaler crop region: %s", rect2);
        Rect rect3 = (Rect) lvpVarG.n(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Rect rectC = lhs.h(ligVar).c(rect2);
        if (rect3.contains(rectC)) {
            MeshTranslation meshTranslation = new MeshTranslation(GcamModuleJNI.MeshWarp_TranslationHint(meshWarpO.a, meshWarpO));
            Rect rect4 = new Rect(rectC);
            rect4.offset(rect3.left - GcamModuleJNI.MeshTranslation_x_get(meshTranslation.a, meshTranslation), rect3.top - GcamModuleJNI.MeshTranslation_y_get(meshTranslation.a, meshTranslation));
            if (rect3.contains(rect4)) {
                rectC.set(rect4);
                rectC.offset(-rect3.left, -rect3.top);
            } else {
                int iB = oxh.B(rect4.left, rect3.left, rect3.right - rect4.width());
                int iB2 = oxh.B(rect4.top, rect3.top, rect3.bottom - rect4.height());
                rectC.set(new Rect(iB, iB2, rect4.width() + iB, rect4.height() + iB2));
                rectC.offset(-rect3.left, -rect3.top);
                Log.w(c, "translateAeCrop failed because translation exceeds active array.");
            }
        } else {
            Log.w(c, "aeCrop exceeds preCorrectionActiveArraySize.");
        }
        NormalizedRect normalizedRect = new NormalizedRect();
        float f2 = 1.0f;
        float fWidth = 1.0f / rect3.width();
        float fHeight = 1.0f / rect3.height();
        normalizedRect.c(rectC.left * fWidth);
        normalizedRect.e(rectC.top * fHeight);
        normalizedRect.d(rectC.right * fWidth);
        normalizedRect.f(rectC.bottom * fHeight);
        aeShotParams.e(normalizedRect);
        WeightedNormalizedRectVector weightedNormalizedRectVectorC = aeShotParams.c();
        WeightedNormalizedRect weightedNormalizedRect = new WeightedNormalizedRect();
        weightedNormalizedRect.b(1.0f);
        NormalizedRect normalizedRect2 = new NormalizedRect();
        GcamModuleJNI.WeightedNormalizedRect_rect_set(weightedNormalizedRect.a, weightedNormalizedRect, NormalizedRect.a(normalizedRect2), normalizedRect2);
        weightedNormalizedRectVectorC.b(weightedNormalizedRect);
        if (meteringRectangleArr != null) {
            int i = 0;
            while (i < meteringRectangleArr.length) {
                if (meteringRectangleArr[i].getMeteringWeight() != 0) {
                    WeightedNormalizedRect weightedNormalizedRect2 = new WeightedNormalizedRect();
                    Rect rect5 = meteringRectangleArr[i].getRect();
                    float fExactCenterX = rect5.exactCenterX();
                    float fExactCenterY = rect5.exactCenterY();
                    float fMin = Math.min(rectC.width(), rectC.height()) * 0.06125f;
                    float fH = oxh.H((fExactCenterX - fMin) / rect3.width(), 0.0f, f2);
                    float fH2 = oxh.H((fExactCenterY - fMin) / rect3.height(), 0.0f, f2);
                    float fH3 = oxh.H((fExactCenterX + fMin) / rect3.width(), 0.0f, f2);
                    float fH4 = oxh.H((fExactCenterY + fMin) / rect3.height(), 0.0f, f2);
                    long jWeightedNormalizedRect_rect_get = GcamModuleJNI.WeightedNormalizedRect_rect_get(weightedNormalizedRect2.a, weightedNormalizedRect2);
                    NormalizedRect normalizedRect3 = jWeightedNormalizedRect_rect_get == 0 ? null : new NormalizedRect(jWeightedNormalizedRect_rect_get, false);
                    normalizedRect3.c(fH);
                    normalizedRect3.e(fH2);
                    normalizedRect3.d(fH3);
                    normalizedRect3.f(fH4);
                    weightedNormalizedRect2.b(f);
                    weightedNormalizedRectVectorC.b(weightedNormalizedRect2);
                }
                i++;
                f2 = 1.0f;
            }
        }
    }
}
