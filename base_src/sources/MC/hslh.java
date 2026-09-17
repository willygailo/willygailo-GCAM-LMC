package MC;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Range;
import com.CameraAPI2Keys;
import com.Fix.Pref;
import com.Helper;
import com.SDE.LensValue;
import defpackage.luz;

/* JADX INFO: loaded from: classes4.dex */
public class hslh {
    public static luz GetC2apiPref(luz luzVar) {
        int iMenuValue = Pref.MenuValue("pref_ois_key");
        if (iMenuValue != 0) {
            luzVar.b(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(iMenuValue - 1));
        }
        int iMenuValue2 = Pref.MenuValue("pref_ois_data_key");
        if (iMenuValue2 != 0) {
            luzVar.b(CaptureRequest.STATISTICS_OIS_DATA_MODE, Integer.valueOf(iMenuValue2 - 1));
        }
        if (Build.MANUFACTURER.equals("samsung")) {
            int iMenuValue3 = Pref.MenuValue("pref_c2a_livehdr_key");
            if (iMenuValue3 != 0) {
                if (iMenuValue3 == 1) {
                    luzVar.b(CameraAPI2Keys.CONTROL_LIVE_HDR_MODE, 1);
                } else if (iMenuValue3 == 2) {
                    luzVar.b(CameraAPI2Keys.CONTROL_LIVE_HDR_LEVEL, 1);
                }
            }
            int iMenuValue4 = Pref.MenuValue("pref_c2a_metering_key");
            if (iMenuValue4 != 0) {
                luzVar.b(CameraAPI2Keys.CONTROL_METERING_MODE, Integer.valueOf(iMenuValue4 - 1));
            }
            luzVar.b(CameraAPI2Keys.LENS_APERTURE, Float.valueOf(Helper.setAperture()));
            int iMenuValue5 = Pref.MenuValue("pref_aperture_key");
            if (iMenuValue5 != 0) {
                luzVar.b(CameraAPI2Keys.LENS_APERTURE, Float.valueOf(iMenuValue5 + (-1) == 0 ? 1.5f : 2.4f));
            }
        }
        if (Pref.MenuValue("pref_shading_mode_key") != 0) {
            luzVar.b(CaptureRequest.SHADING_MODE, 0);
        }
        int iMenuValue6 = Pref.MenuValue("pref_c2a_antibanding_key");
        if (iMenuValue6 != 0) {
            luzVar.b(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, Integer.valueOf(iMenuValue6 - 1));
        }
        int iMenuValue7 = Pref.MenuValue("pref_c2a_hotpixel_key");
        if (iMenuValue7 != 0) {
            luzVar.b(CaptureRequest.HOT_PIXEL_MODE, Integer.valueOf(iMenuValue7 - 1));
        }
        int iMenuValue8 = Pref.MenuValue("pref_c2a_aberration_key");
        if (iMenuValue8 != 0) {
            luzVar.b(CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE, Integer.valueOf(iMenuValue8 - 1));
        }
        int iMenuValue9 = Pref.MenuValue("pref_c2a_distortion_key");
        if (iMenuValue9 != 0) {
            luzVar.b(CaptureRequest.DISTORTION_CORRECTION_MODE, Integer.valueOf(iMenuValue9 - 1));
        }
        int iMenuValue10 = Pref.MenuValue("pref_c2a_colorcorrection_key");
        if (iMenuValue10 != 0) {
            luzVar.b(CaptureRequest.COLOR_CORRECTION_MODE, Integer.valueOf(iMenuValue10 - 1));
        }
        int iMenuValue11 = Pref.MenuValue("pref_c2a_tonemap_key");
        if (iMenuValue11 != 0) {
            luzVar.b(CaptureRequest.TONEMAP_MODE, Integer.valueOf(iMenuValue11 - 1));
        }
        return luzVar;
    }

    public static Range GetTargetFps() {
        return new Range(Integer.valueOf(Pref.MenuValue(LensValue.SetLensValue("pref_vffps_low_key"))), Integer.valueOf(Pref.MenuValue(LensValue.SetLensValue("pref_vffps_high_key"))));
    }

    public static void HapticFeedback(Context context) {
        if (Pref.MenuValue("pref_vibro_button_key") != 0) {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (Build.VERSION.SDK_INT >= 28) {
                vibrator.vibrate(VibrationEffect.createPredefined(0));
            } else {
                vibrator.vibrate(300L);
            }
        }
    }

    public static int getWhiteLevel(int i) {
        String str;
        if (Helper.sFront == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                    str = "pref_white_level_key";
                    break;
                case 1:
                    str = "pref_white_level_key_2";
                    break;
                case 2:
                    str = "pref_white_level_key_3";
                    break;
                case 3:
                    str = "pref_white_level_key_4";
                    break;
                case 4:
                    str = "pref_white_level_key_5";
                    break;
                default:
                    str = "pref_white_level_key";
                    break;
            }
        } else {
            str = "pref_white_level_key_front";
        }
        int iMenuValue = Pref.MenuValue(str);
        return iMenuValue != 0 ? iMenuValue : i;
    }
}
