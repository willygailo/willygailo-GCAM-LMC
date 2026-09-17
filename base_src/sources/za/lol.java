package za;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import com.Helper;
import com.google.android.apps.camera.bottombar.R;
import defpackage.kvg;

/* JADX INFO: loaded from: classes2.dex */
public class lol {
    protected static int API2_Analog_ISO = 0;
    protected static long API2_EXP = 0;
    protected static int API2_ISO = 0;
    private static final float CROP_1_23 = 5.6f;
    private static final float CROP_1_255 = 5.9f;
    private static final float CROP_1_26 = 6.0f;
    private static int EnablesaturationMode = 0;
    private static int ISO_AE = 0;
    private static int ISO_Out = 0;
    private static final long S_2_NS = 1000000000;
    private static long Shutter_AE;
    private static long Shutter_Adjusted;
    public static int TrailVal;
    private static float focusDistance;
    private static int focusMode;
    public static int isoVal2;
    private static int saturationMode;
    public static int shutterVal;
    private static long shutterdurationl;
    private static lol lol = new lol();
    private static float ISO_to_Gain_Quant = 2.0f;

    public static float[] BlackShift(int i, int i2) {
        if (i2 == 0) {
            return new float[]{64.0f, 64.0f, 64.0f, 64.0f};
        }
        if (i > 99 && i < 200) {
            return new float[]{63.875f, 64.0f, 64.8125f, 64.25f};
        }
        if (i > 200 && i < 400) {
            return new float[]{63.75f, 65.0f, 63.75f, 63.9375f};
        }
        if (i > 400 && i < 800) {
            return new float[]{63.75f, 63.75f, 64.75f, 63.6875f};
        }
        if (i > 800 && i < 1600) {
            return new float[]{63.5625f, 63.5f, 64.4375f, 63.5f};
        }
        if (i > 1600 && i < 3200) {
            return new float[]{64.125f, 64.625f, 63.9375f, 63.9375f};
        }
        if (i > 3200 && i < 6400) {
            return new float[]{63.3125f, 64.3125f, 67.92969f, 63.6875f};
        }
        if (i > 6400 && i < 12800) {
            return new float[]{61.6875f, 62.6875f, 62.9375f, 63.4375f};
        }
        if (i <= 12800 || i >= 19200) {
            return i < 19200 ? new float[]{72.0f, 72.0f, 71.0f, 72.0f} : new float[]{62.25f, 64.6875f, 64.5625f, 64.875f};
        }
        return new float[]{59.75f, 63.4375f, 61.9375f, 63.0f};
    }

    public static float[] BlackShiftOBJ(Integer num, Integer num2) {
        if (num2.intValue() == 1) {
            return new float[]{16.0f, 16.0f, 16.0f, 16.0f};
        }
        if (num.intValue() > 3200 && num.intValue() < 6400) {
            return new float[]{65.0f, 65.0f, 64.0f, 65.0f};
        }
        if (num.intValue() <= 6400 || num.intValue() >= 8800) {
            return (num.intValue() <= 8800 || num.intValue() >= 12800) ? new float[]{64.0f, 64.0f, 64.0f, 64.0f} : new float[]{66.0f, 66.0f, 66.0f, 67.0f};
        }
        return new float[]{65.0f, 65.0f, 65.0f, 64.0f};
    }

    private static long ISO_100() {
        return (long) (Shutter_AE * (ISO_AE / 100));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    private static long Rule500(float f, String str) {
        switch (str) {
            case "IMX363":
            case "IMX362":
            case "S5K2L7":
            case "IMX345":
                return (long) (500.0f / (CROP_1_255 * f));
            case "IMX377":
            case "IMX378":
            case "IMX380":
            case "IMX477":
                return (long) (500.0f / (CROP_1_255 * f));
            default:
                return 19000000000L;
        }
    }

    public static String SlideVALUES() {
        return "AUTO,1s,2s,4s,8s,10s,16s,32s";
    }

    public static void calc_quantization(kvg kvgVar) {
        try {
            ISO_to_Gain_Quant = 100.0f / ((Integer) ((Range) kvgVar.b(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue();
        } catch (Exception e) {
            ISO_to_Gain_Quant = 2.0f;
        }
    }

    public static void calcdist(int i) {
        focusMode = i;
        logMSG("SLIDER 1 IDX: " + shutterVal);
        switch (i) {
            case 1:
                String stringPreference = getStringPreference("inf_focus_key");
                if (TextUtils.isEmpty(stringPreference)) {
                    stringPreference = "1.51";
                }
                focusDistance = Float.parseFloat(stringPreference);
                break;
            case 2:
                String stringPreference2 = getStringPreference("2m_focus_key");
                if (TextUtils.isEmpty(stringPreference2)) {
                    stringPreference2 = "2.2";
                }
                focusDistance = Float.parseFloat(stringPreference2);
                break;
            case 3:
                String stringPreference3 = getStringPreference("s_focus_key");
                if (TextUtils.isEmpty(stringPreference3)) {
                    stringPreference3 = "3.21";
                }
                focusDistance = Float.parseFloat(stringPreference3);
                break;
            case 4:
                String stringPreference4 = getStringPreference("m_focus_key");
                if (TextUtils.isEmpty(stringPreference4)) {
                    stringPreference4 = "13.14";
                }
                focusDistance = Float.parseFloat(stringPreference4);
                break;
            case 5:
                focusDistance = 0.005f;
                break;
            case 6:
                focusDistance = 0.006f;
                break;
            case 7:
                focusDistance = 0.007f;
                break;
            case 8:
                focusDistance = 0.008f;
                break;
            case 9:
                focusDistance = 0.009f;
                break;
            case 10:
                focusDistance = 0.01f;
                break;
            case 11:
                focusDistance = 0.03f;
                break;
            case 12:
                focusDistance = 0.05f;
                break;
            case 13:
                focusDistance = 0.07f;
                break;
            case 14:
                focusDistance = 0.09f;
                break;
            case 15:
                focusDistance = 0.11f;
                break;
            case 16:
                focusDistance = 0.21f;
                break;
            case 17:
                focusDistance = 0.31f;
                break;
            case 18:
                focusDistance = 0.41f;
                break;
            case 19:
                focusDistance = 0.51f;
                break;
            case 20:
                focusDistance = 0.61f;
                break;
            case 21:
                focusDistance = 0.71f;
                break;
            case 22:
                focusDistance = 0.81f;
                break;
            case 23:
                focusDistance = 0.91f;
                break;
            case 24:
                focusDistance = 0.95f;
                break;
            case 25:
                focusDistance = 1.01f;
                break;
            case 26:
                focusDistance = 1.21f;
                break;
            case 27:
                focusDistance = 1.41f;
                break;
            case 28:
                focusDistance = 1.61f;
                break;
            case 29:
                focusDistance = 1.81f;
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                focusDistance = 2.01f;
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                focusDistance = 2.21f;
                break;
            case 32:
                focusDistance = 2.41f;
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                focusDistance = 2.61f;
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                focusDistance = 2.81f;
                break;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                focusDistance = 3.01f;
                break;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                focusDistance = 3.21f;
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                focusDistance = 3.41f;
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                focusDistance = 3.61f;
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                focusDistance = 3.81f;
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                focusDistance = 4.01f;
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                focusDistance = 4.21f;
                break;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                focusDistance = 4.41f;
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                focusDistance = 4.61f;
                break;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                focusDistance = 4.81f;
                break;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                focusDistance = 5.01f;
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                focusDistance = 5.21f;
                break;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                focusDistance = 5.41f;
                break;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                focusDistance = 5.61f;
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                focusDistance = 5.81f;
                break;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                focusDistance = 6.01f;
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                focusDistance = 6.21f;
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                focusDistance = 6.41f;
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                focusDistance = 6.61f;
                break;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                focusDistance = 6.81f;
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                focusDistance = 7.01f;
                break;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                focusDistance = 7.21f;
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                focusDistance = 7.41f;
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                focusDistance = 7.61f;
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                focusDistance = 7.81f;
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                focusDistance = 8.01f;
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                focusDistance = 8.21f;
                break;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                focusDistance = 8.41f;
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                focusDistance = 8.61f;
                break;
            case 64:
                focusDistance = 9.01f;
                break;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                focusDistance = 9.21f;
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                focusDistance = 9.41f;
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                focusDistance = 9.61f;
                break;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                focusDistance = 9.81f;
                break;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                focusDistance = 9.9f;
                break;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                focusDistance = 10.0f;
                break;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                focusDistance = 11.0f;
                break;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                focusDistance = 12.0f;
                break;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                focusDistance = 14.0f;
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                focusDistance = 15.0f;
                break;
            default:
                focusDistance = 0.0f;
                if (0 == 0) {
                }
                break;
        }
    }

    public static float[] getCCM_1() {
        return new float[]{1.2341f, 0.666f, 0.0994f, -0.2806f, 1.0683f, 0.2451f, 0.0127f, 0.0727f, 0.5789f};
    }

    public static float[] getCCM_2() {
        return new float[]{1.0612f, -0.4169f, -0.1001f, -0.3982f, 1.2675f, 0.1412f, -0.0558f, 0.162f, 0.5206f};
    }

    public static Long getEXPTGT() {
        return Long.valueOf(getSLIDER()[0]);
    }

    public static Long getEXPTGT2() {
        return Long.valueOf(getSLIDER()[0]);
    }

    public static Float[] getFM_1() {
        return new Float[]{Float.valueOf(0.4187f), Float.valueOf(0.4351f), Float.valueOf(0.1105f), Float.valueOf(0.1772f), Float.valueOf(0.7902f), Float.valueOf(0.0326f), Float.valueOf(0.047f), Float.valueOf(0.001f), Float.valueOf(0.7772f)};
    }

    public static Float[] getFM_2() {
        return new Float[]{Float.valueOf(0.4226f), Float.valueOf(0.4079f), Float.valueOf(0.1337f), Float.valueOf(0.1871f), Float.valueOf(0.7745f), Float.valueOf(0.0384f), Float.valueOf(0.0618f), Float.valueOf(0.0047f), Float.valueOf(0.7586f)};
    }

    public static Float getFocusDistance() {
        return Float.valueOf(focusDistance);
    }

    public static Integer getFocusMode() {
        return Integer.valueOf(focusMode);
    }

    public static int getFocusValue() {
        return focusMode == 0 ? 5 : 0;
    }

    private static long getISO(int i) {
        long j = ISO_AE;
        switch (i) {
            case 1:
                return j;
            case 2:
                return 200L;
            case 3:
                return 400L;
            case 4:
                return 800L;
            case 5:
                return 1600L;
            case 6:
                return 3200L;
            case 7:
                return 4800L;
            case 8:
                return 6400L;
            case 9:
                return 12800L;
            case 10:
                return 25600L;
            case 11:
                return -17536L;
            case 12:
                return -1536L;
            default:
                return j;
        }
    }

    public static Integer getISOTGT() {
        if (isoVal2 == 0) {
            ISO_Out = ISO_AE;
            return Integer.valueOf(ISO_Out);
        }
        int iRound = Math.round(getSLIDER2()[0] / 2.0f);
        ISO_Out = iRound;
        return Integer.valueOf(iRound);
    }

    public static Integer getISOTGTzF6() {
        ISO_Out = (int) getSLIDER()[1];
        return Integer.valueOf(ISO_Out);
    }

    public static int getISO_Out() {
        return Math.round(ISO_Out * 1.1f);
    }

    public static float getISO_to_Gain_Quant() {
        return ISO_to_Gain_Quant;
    }

    public static lol getInstance() {
        return lol;
    }

    public static int getIsoVal() {
        if (shutterVal == 9001) {
            return R.styleable.AppCompatTheme_textAppearanceListItemSecondary;
        }
        if (shutterVal == 9002) {
            return 800;
        }
        if (shutterVal == 9003 || shutterVal == 9999) {
            return 252;
        }
        return shutterVal * 4;
    }

    public static long[] getSLIDER() {
        switch (shutterVal) {
            case 0:
                return new long[]{Shutter_AE};
            case 1:
                return new long[]{getShutter(1)};
            case 2:
                return new long[]{getShutter(2)};
            case 3:
                return new long[]{getShutter(3)};
            case 4:
                return new long[]{getShutter(4)};
            case 5:
                return new long[]{getShutter(5)};
            case 6:
                return new long[]{getShutter(6)};
            case 7:
                return new long[]{getShutter(7)};
            case 8:
                return new long[]{getShutter(8)};
            case 9:
                return new long[]{getShutter(9)};
            case 10:
                return new long[]{getShutter(10)};
            case 11:
                return new long[]{getShutter(11)};
            case 12:
                return new long[]{getShutter(12)};
            case 13:
                return new long[]{getShutter(13)};
            case 14:
                return new long[]{getShutter(14)};
            case 15:
                return new long[]{getShutter(15)};
            case 16:
                return new long[]{getShutter(16)};
            case 17:
                return new long[]{getShutter(17)};
            case 18:
                return new long[]{getShutter(18)};
            case 19:
                return new long[]{getShutter(19)};
            case 20:
                return new long[]{getShutter(20)};
            default:
                return new long[]{getShutter(0)};
        }
    }

    public static long[] getSLIDER2() {
        switch (isoVal2) {
            case 0:
                return new long[]{ISO_AE};
            case 1:
                return new long[]{getISO(1)};
            case 2:
                return new long[]{getISO(2)};
            case 3:
                return new long[]{getISO(3)};
            case 4:
                return new long[]{getISO(4)};
            case 5:
                return new long[]{getISO(5)};
            case 6:
                return new long[]{getISO(6)};
            case 7:
                return new long[]{getISO(7)};
            case 8:
                return new long[]{getISO(8)};
            case 9:
                return new long[]{getISO(9)};
            case 10:
                return new long[]{getISO(10)};
            case 11:
                return new long[]{getISO(11)};
            default:
                return new long[]{getISO(0)};
        }
    }

    private static long getShutter(int i) {
        switch (i) {
            case 1:
                return 33333L;
            case 2:
                return 500000L;
            case 3:
                return 667000L;
            case 4:
                return 1000000L;
            case 5:
                return 4000000L;
            case 6:
                return 10000000L;
            case 7:
                return 20000000L;
            case 8:
                return 40000000L;
            case 9:
                return 62500000L;
            case 10:
                return 125000000L;
            case 11:
                return 250000000L;
            case 12:
                return 500000000L;
            case 13:
                return S_2_NS;
            case 14:
                return 2000000000L;
            case 15:
                return 4000000000L;
            case 16:
                return 8000000000L;
            case 17:
                return 16000000000L;
            case 18:
                return 32000000000L;
            case 19:
                return 59000000000L;
            default:
                return S_2_NS;
        }
    }

    public static long getShutter_Adjusted() {
        if (shutterVal == 9001 || shutterVal == 9002 || shutterVal == 9999 || shutterVal == 9003) {
            return 19000000000L;
        }
        if (shutterVal > 0 && shutterVal < ISO_AE) {
            return Math.round(((long) (ISO_AE / shutterVal)) * Shutter_AE);
        }
        return Shutter_AE;
    }

    public static String getStringPreference(String str) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(Helper.getAppContext()).getString(str, null);
        } catch (Exception e) {
            return null;
        }
    }

    private static int isoLut(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 100;
            case 2:
                return 156;
            case 3:
                return 200;
            case 4:
                return 312;
            case 5:
                return 400;
            case 6:
                return 625;
            case 7:
                return 800;
            case 8:
                return 1000;
            case 9:
                return 1250;
            case 10:
                return 1600;
            case 11:
                return 2500;
            case 12:
                return 3200;
            case 13:
                return 5000;
            case 14:
                return 6400;
            case 15:
                return 9600;
            case 16:
                return 10000;
            case 17:
                return 12800;
            case 18:
                return 25600;
            case 19:
                return 9001;
            case 20:
                return 9002;
            case 21:
                return 9003;
            case 22:
                return 9999;
            default:
                return 0;
        }
    }

    public static void logArray(float[] fArr) {
        for (float f : fArr) {
            Log.i("DeezNutz", "logArray Index: " + f);
        }
    }

    public static void logFloat(float f) {
        Log.i("DeezNutz", "logFloat: " + f);
    }

    public static void logInt(int i) {
        Log.i("DeezNutz", "logINT: " + i);
    }

    public static void logLong(long j) {
        Log.i("DeezNutz", "logLong: " + j);
    }

    public static void logMSG(String str) {
        Log.i("DeezNuts", "MSG: " + str);
    }

    public static void logRECT(Rect[] rectArr) {
        for (Rect rect : rectArr) {
            Log.i("DeezNutz Array", "RECT LEFT: " + rect.left + "RECT Right: " + rect.right + "RECT Top: " + rect.top + "RECT Bottom: " + rect.bottom);
        }
    }

    public static void logRECToptical(Rect[] rectArr) {
        for (Rect rect : rectArr) {
            Log.i("DeezNutz Optical", "RECT LEFT: " + rect.left + "RECT Right: " + rect.right + "RECT Top: " + rect.top + "RECT Bottom: " + rect.bottom);
        }
    }

    public static boolean onVaar() {
        return false;
    }

    private static int saturationMode(int i) {
        switch (i) {
            case 0:
                return 25;
            case 1:
                return 17;
            case 2:
                return 16;
            case 3:
                return 9;
            case 4:
                return 8;
            case 5:
                return 7;
            case 6:
                return 6;
            case 7:
                return 5;
            case 8:
                return 4;
            case 9:
                return 3;
            case 10:
                return 2;
            case 11:
                return 1;
            case 12:
                return 0;
            default:
                return 25;
        }
    }

    public static Integer saturationMode() {
        return Integer.valueOf(saturationMode);
    }

    public static void setAPI2_Analog_ISO(int i) {
        API2_Analog_ISO = i;
    }

    public static void setApi2Exp(long j) {
        API2_EXP = j;
    }

    public static void setApi2Iso(int i) {
        API2_ISO = i;
    }

    public static void setISO(int i) {
        isoVal2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append("SLIDER 3 IDX: ");
        int i2 = isoVal2;
        sb.append(i2);
        logMSG(sb.toString());
        if (i2 != 0) {
            Helper.ShowToast("Use HDR+ Enhanced or Night Sight");
        }
    }

    public static void setISeek(int i) {
        shutterVal = i;
        StringBuilder sb = new StringBuilder();
        sb.append("SLIDER 0 IDX: ");
        int i2 = shutterVal;
        sb.append(i2);
        logMSG(sb.toString());
        if (i2 != 0) {
            Helper.ShowToast("Use HDR+ Enhanced or Night Sight");
        }
    }

    public static void setIsoAe(Integer num) {
        ISO_AE = num.intValue() / 4;
    }

    public static void setSHseek(int i) {
        shutterdurationl = shutterLut(i);
    }

    public static void setShutter_AE(Long l) {
        Shutter_AE = l.longValue();
    }

    public static void setShutter_OS(Long l) {
        Shutter_AE = l.longValue();
    }

    public static void setTrails(int i) {
        TrailVal = i;
        StringBuilder sb = new StringBuilder();
        sb.append("SLIDER 4 IDX: ");
        int i2 = TrailVal;
        sb.append(i2);
        logMSG(sb.toString());
        if (i2 != 0) {
            Helper.ShowToast("Use HDR+ Enhanced or Night Sight");
        }
    }

    public static void setsaturation(int i) {
        saturationMode = i;
    }

    private static long shutterLut(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 33333L;
            case 2:
                return 66666L;
            case 3:
                return 100000L;
            case 4:
                return 125000L;
            case 5:
                return 156250L;
            case 6:
                return 312500L;
            case 7:
                return 400000L;
            case 8:
                return 500000L;
            case 9:
                return 625000L;
            case 10:
                return 800000L;
            case 11:
                return 1000000L;
            case 12:
                return 1250000L;
            case 13:
                return 1428571L;
            case 14:
                return 1666666L;
            case 15:
                return 2000000L;
            case 16:
                return 2500000L;
            case 17:
                return 3333333L;
            case 18:
                return 5000000L;
            case 19:
                return 10000000L;
            case 20:
                return 12500000L;
            case 21:
                return 17857142L;
            case 22:
                return 20000000L;
            case 23:
                return 25000000L;
            case 24:
                return 33333333L;
            case 25:
                return 62500000L;
            case 26:
                return 66666666L;
            case 27:
                return 100000000L;
            case 28:
                return 125000000L;
            case 29:
                return 166666666L;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return 250000000L;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return 333333333L;
            case 32:
                return 500000000L;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return S_2_NS;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return 2000000000L;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return 3000000000L;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return 4000000000L;
            default:
                return 33333333L;
        }
    }
}
