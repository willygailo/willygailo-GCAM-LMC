package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Rational;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class aus extends awy {
    private static final axo x = new axo("AndCam2Capabs");

    public aus(CameraCharacteristics cameraCharacteristics) {
        super(new hq(), null);
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        for (Range range : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) {
            this.b.add(new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()});
        }
        this.c.addAll(axn.c(Arrays.asList(streamConfigurationMap.getOutputSizes(SurfaceTexture.class))));
        for (int i : streamConfigurationMap.getOutputFormats()) {
            this.d.add(Integer.valueOf(i));
        }
        this.e.addAll(axn.c(Arrays.asList(streamConfigurationMap.getOutputSizes(MediaRecorder.class))));
        this.f.addAll(axn.c(Arrays.asList(streamConfigurationMap.getOutputSizes(256))));
        this.g.addAll(this.d);
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                aww awwVarB = b(i2);
                if (awwVarB != null) {
                    this.h.add(awwVarB);
                }
            }
        }
        this.i.add(awu.OFF);
        if (((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue()) {
            this.i.add(awu.AUTO);
            this.i.add(awu.ON);
            this.i.add(awu.TORCH);
            for (int i3 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) {
                if (i3 == 4) {
                    this.i.add(awu.RED_EYE);
                }
            }
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 != null) {
            for (int i4 : iArr2) {
                awv awvVarA = a(i4);
                if (awvVarA != null) {
                    this.j.add(awvVarA);
                }
            }
        }
        int[] iArr3 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr3 != null) {
            for (int i5 : iArr3) {
                awx awxVarC = c(i5);
                if (awxVarC != null) {
                    this.k.add(awxVarC);
                }
            }
        }
        Range range2 = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        this.n = ((Integer) range2.getLower()).intValue();
        this.o = ((Integer) range2.getUpper()).intValue();
        Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        this.p = rational.getNumerator() / rational.getDenominator();
        this.q = ((Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue();
        this.s = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
        this.t = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        if (f(awv.AUTO)) {
            int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            this.r = iIntValue;
            if (iIntValue > 0) {
                this.l.add(awt.FOCUS_AREA);
            }
        }
        if (this.s > 0) {
            this.l.add(awt.METERING_AREA);
        }
        if (this.t > 1.0f) {
            this.l.add(awt.ZOOM);
        }
    }

    public static awv a(int i) {
        switch (i) {
            case 0:
                return awv.FIXED;
            case 1:
                return awv.AUTO;
            case 2:
                return awv.MACRO;
            case 3:
                return awv.CONTINUOUS_VIDEO;
            case 4:
                return awv.CONTINUOUS_PICTURE;
            case 5:
                return awv.EXTENDED_DOF;
            default:
                axp.c(x, "Unable to convert from API 2 focus mode: " + i);
                return null;
        }
    }

    public static aww b(int i) {
        switch (i) {
            case 0:
                return aww.AUTO;
            case 1:
            case 6:
            default:
                if (i == axm.a) {
                    return aww.HDR;
                }
                axp.c(x, "Unable to convert from API 2 scene mode: " + i);
                return null;
            case 2:
                return aww.ACTION;
            case 3:
                return aww.PORTRAIT;
            case 4:
                return aww.LANDSCAPE;
            case 5:
                return aww.NIGHT;
            case 7:
                return aww.THEATRE;
            case 8:
                return aww.BEACH;
            case 9:
                return aww.SNOW;
            case 10:
                return aww.SUNSET;
            case 11:
                return aww.STEADYPHOTO;
            case 12:
                return aww.FIREWORKS;
            case 13:
                return aww.SPORTS;
            case 14:
                return aww.PARTY;
            case 15:
                return aww.CANDLELIGHT;
            case 16:
                return aww.BARCODE;
        }
    }

    public static awx c(int i) {
        switch (i) {
            case 1:
                return awx.AUTO;
            case 2:
                return awx.INCANDESCENT;
            case 3:
                return awx.FLUORESCENT;
            case 4:
                return awx.WARM_FLUORESCENT;
            case 5:
                return awx.DAYLIGHT;
            case 6:
                return awx.CLOUDY_DAYLIGHT;
            case 7:
                return awx.TWILIGHT;
            case 8:
                return awx.SHADE;
            default:
                axp.c(x, "Unable to convert from API 2 white balance: " + i);
                return null;
        }
    }
}
