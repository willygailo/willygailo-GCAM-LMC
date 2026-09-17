package com.SDE;

import com.Fix.Pref;
import com.Helper;
import com.awb.Internal;
import com.google.android.apps.camera.bottombar.R;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.QcColorCalibration;
import com.google.googlex.gcam.QcIlluminantVector;
import com.google.googlex.gcam.StaticMetadata;

/* JADX INFO: loaded from: classes.dex */
public class Awb {
    public static float[] awbArr_B_G;
    public static float awbArr_GR_GB;
    public static float[] awbArr_R_G;
    public static int awbArr_len;

    public static int AuxCamKey() {
        String str;
        if (Helper.sFront == 0) {
            switch (Pref.sAuxKey) {
                case 0:
                    str = "pref_awb_key";
                    break;
                case 1:
                    str = "pref_awb_key_2";
                    break;
                case 2:
                    str = "pref_awb_key_3";
                    break;
                case 3:
                    str = "pref_awb_key_4";
                    break;
                case 4:
                    str = "pref_awb_key_5";
                    break;
                default:
                    str = "pref_awb_key";
                    break;
            }
        } else {
            str = "pref_awb_key_front";
        }
        return Pref.MenuValue(str);
    }

    public static void getQcColorCalibration(StaticMetadata staticMetadata) {
        setAWB();
        setGRGB();
        QcColorCalibration qcColorCalibration = new QcColorCalibration();
        try {
            float[] fArr = awbArr_R_G;
            float[] fArr2 = awbArr_B_G;
            int i = awbArr_len;
            Helper.getAwbLog(fArr, fArr2, i);
            QcIlluminantVector qcIlluminantVector = new QcIlluminantVector();
            for (int i2 = 0; i2 < i; i2++) {
                QcColorCalibration.IlluminantData illuminantData = new QcColorCalibration.IlluminantData();
                GcamModuleJNI.QcColorCalibration_IlluminantData_rg_ratio_set(illuminantData.a, illuminantData, fArr[i2]);
                GcamModuleJNI.QcColorCalibration_IlluminantData_bg_ratio_set(illuminantData.a, illuminantData, fArr2[i2]);
                GcamModuleJNI.QcIlluminantVector_add(qcIlluminantVector.a, qcIlluminantVector, illuminantData.a, illuminantData);
            }
            GcamModuleJNI.QcColorCalibration_illuminant_data_set(qcColorCalibration.a, qcColorCalibration, qcIlluminantVector.a, qcIlluminantVector);
            qcColorCalibration.a(awbArr_GR_GB);
        } catch (Throwable unused) {
        }
        GcamModuleJNI.StaticMetadata_qc_color_calibration_set(staticMetadata.a, staticMetadata, qcColorCalibration.a, qcColorCalibration);
    }

    private static void setAWB() {
        float[] fArrRG;
        float[] fArrBG;
        float[] fArr;
        float[] fArr2;
        int iAuxCamKey = AuxCamKey();
        if (iAuxCamKey == -1) {
            float[] fArr3 = AwbData.MANUAL1_WB_CALIB_R_G;
            float[] fArr4 = AwbData.MANUAL1_WB_CALIB_B_G;
            awbArr_R_G = fArr3;
            awbArr_B_G = fArr4;
            awbArr_len = fArr3.length;
            return;
        }
        if (iAuxCamKey == -2) {
            String stringValue = Pref.getStringValue(LensValue.SetLensValue1("pref_load_awb_key"));
            if (stringValue.equalsIgnoreCase("Default") || stringValue.equalsIgnoreCase("0")) {
                fArrRG = AwbData.NEXUS_EXPERIMENTAL_2016_WB_CALIB_R_G;
                fArrBG = AwbData.NEXUS_EXPERIMENTAL_2016_WB_CALIB_B_G;
            } else {
                fArrRG = Internal.RG();
                fArrBG = Internal.BG();
            }
            awbArr_R_G = fArrRG;
            awbArr_B_G = fArrBG;
            awbArr_len = fArrRG.length;
            return;
        }
        switch (iAuxCamKey) {
            case 0:
                fArr = AwbData.NEXUS_EXPERIMENTAL_2016_WB_CALIB_R_G;
                fArr2 = AwbData.NEXUS_EXPERIMENTAL_2016_WB_CALIB_B_G;
                break;
            case 1:
                fArr = AwbData.NEXUS_EXPERIMENTAL_2016_FRONT_WB_CALIB_R_G;
                fArr2 = AwbData.NEXUS_EXPERIMENTAL_2016_FRONT_WB_CALIB_B_G;
                break;
            case 2:
                fArr = AwbData.NEXUS_EXPERIMENTAL_2017_WB_CALIB_R_G;
                fArr2 = AwbData.NEXUS_EXPERIMENTAL_2017_WB_CALIB_B_G;
                break;
            case 3:
                fArr = AwbData.NEXUS_EXPERIMENTAL_2018_WB_CALIB_R_G;
                fArr2 = AwbData.NEXUS_EXPERIMENTAL_2018_WB_CALIB_B_G;
                break;
            case 4:
                fArr = AwbData.NEXUS_EXPERIMENTAL_2019_WB_CALIB_R_G;
                fArr2 = AwbData.NEXUS_EXPERIMENTAL_2019_WB_CALIB_B_G;
                break;
            case 5:
                fArr = AwbData.NEXUS_EXPERIMENTAL_2019_FRONT_WB_CALIB_R_G;
                fArr2 = AwbData.NEXUS_EXPERIMENTAL_2019_FRONT_WB_CALIB_B_G;
                break;
            case 6:
                fArr = AwbData.NEXUS_EXPERIMENTAL_2019_TELE_WB_CALIB_R_G;
                fArr2 = AwbData.NEXUS_EXPERIMENTAL_2019_TELE_WB_CALIB_B_G;
                break;
            case 7:
                fArr = AwbData.IMX350_WB_CALIB_R_G;
                fArr2 = AwbData.IMX350_WB_CALIB_B_G;
                break;
            case 8:
                fArr = AwbData.IMX361_WB_CALIB_R_G;
                fArr2 = AwbData.IMX361_WB_CALIB_B_G;
                break;
            case 9:
                fArr = AwbData.IMX363_WB_CALIB_R_G;
                fArr2 = AwbData.IMX363_WB_CALIB_B_G;
                break;
            case 10:
                fArr = AwbData.IMX371_WB_CALIB_R_G;
                fArr2 = AwbData.IMX371_WB_CALIB_B_G;
                break;
            case 11:
                fArr = AwbData.IMX398_WB_CALIB_R_G;
                fArr2 = AwbData.IMX398_WB_CALIB_B_G;
                break;
            case 12:
                fArr = AwbData.IMX471_WB_CALIB_R_G;
                fArr2 = AwbData.IMX471_WB_CALIB_B_G;
                break;
            case 13:
                fArr = AwbData.IMX586_OFILM_WB_CALIB_R_G;
                fArr2 = AwbData.IMX586_OFILM_WB_CALIB_B_G;
                break;
            case 14:
                fArr = AwbData.IMX586_SEMCO_WB_CALIB_R_G;
                fArr2 = AwbData.IMX586_SEMCO_WB_CALIB_B_G;
                break;
            case 15:
                fArr = AwbData.IMX586_CEPHEUS_WB_CALIB_R_G;
                fArr2 = AwbData.IMX586_CEPHEUS_WB_CALIB_B_G;
                break;
            case 16:
                fArr = AwbData.IMX586_VIOLET_WB_CALIB_R_G;
                fArr2 = AwbData.IMX586_VIOLET_WB_CALIB_B_G;
                break;
            case 17:
                fArr = AwbData.IMX586_SUNNY_WB_CALIB_R_G;
                fArr2 = AwbData.IMX586_SUNNY_WB_CALIB_B_G;
                break;
            case 18:
                fArr = AwbData.IMX586_WB_CALIB_R_G;
                fArr2 = AwbData.IMX586_WB_CALIB_B_G;
                break;
            case 19:
                fArr = AwbData.IMX686_WB_CALIB_R_G;
                fArr2 = AwbData.IMX686_WB_CALIB_B_G;
                break;
            case 20:
                fArr = AwbData.IMX689_WB_CALIB_R_G;
                fArr2 = AwbData.IMX689_WB_CALIB_B_G;
                break;
            case 21:
                fArr = AwbData.IMX689_MOD_WB_CALIB_R_G;
                fArr2 = AwbData.IMX689_MOD_WB_CALIB_B_G;
                break;
            case 22:
                fArr = AwbData.S5K2L7_WB_CALIB_R_G;
                fArr2 = AwbData.S5K2L7_WB_CALIB_B_G;
                break;
            case 23:
                fArr = AwbData.S5K3L6_WB_CALIB_R_G;
                fArr2 = AwbData.S5K3L6_WB_CALIB_B_G;
                break;
            case 24:
                fArr = AwbData.S5K3T2_WB_CALIB_R_G;
                fArr2 = AwbData.S5K3T2_WB_CALIB_B_G;
                break;
            case 25:
                fArr = AwbData.S5KGD1_WB_CALIB_R_G;
                fArr2 = AwbData.S5KGD1_WB_CALIB_B_G;
                break;
            case 26:
                fArr = AwbData.S5KGM1_WB_CALIB_R_G;
                fArr2 = AwbData.S5KGM1_WB_CALIB_B_G;
                break;
            case 27:
                fArr = AwbData.S5KGW1_WB_CALIB_R_G;
                fArr2 = AwbData.S5KGW1_WB_CALIB_B_G;
                break;
            case 28:
                fArr = AwbData.S5KHMX_WB_CALIB_R_G;
                fArr2 = AwbData.S5KHMX_WB_CALIB_B_G;
                break;
            case 29:
                fArr = AwbData.OV02A10_WB_CALIB_R_G;
                fArr2 = AwbData.OV02A10_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                fArr = AwbData.OV08A10_WB_CALIB_R_G;
                fArr2 = AwbData.OV08A10_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                fArr = AwbData.OV12A10_WB_CALIB_R_G;
                fArr2 = AwbData.OV12A10_WB_CALIB_B_G;
                break;
            case 32:
                fArr = AwbData.OV13855_WB_CALIB_R_G;
                fArr2 = AwbData.OV13855_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                fArr = AwbData.OV13880_WB_CALIB_R_G;
                fArr2 = AwbData.OV13880_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                fArr = AwbData.IMX355_RN10P_ULTRA_WB_CALIB_R_G;
                fArr2 = AwbData.IMX355_RN10P_ULTRA_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                fArr = AwbData.IMX471_RN10P_FRONT_WB_CALIB_R_G;
                fArr2 = AwbData.IMX471_RN10P_FRONT_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                fArr = AwbData.OV5675_RN10P_MACRO_WB_CALIB_R_G;
                fArr2 = AwbData.OV5675_RN10P_MACRO_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                fArr = AwbData.S5KHM2_RN10P_WIDE_WB_CALIB_R_G;
                fArr2 = AwbData.S5KHM2_RN10P_WIDE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                fArr = AwbData.S5KGW3_RN10_WIDE_WB_CALIB_R_G;
                fArr2 = AwbData.S5KGW3_RN10_WIDE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                fArr = AwbData.S5KGM1RN7_WB_CALIB_R_G;
                fArr2 = AwbData.S5KGM1RN7_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                fArr = AwbData.OV13855RN7Front_WB_CALIB_R_G;
                fArr2 = AwbData.OV13855RN7Front_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                fArr = AwbData.NIKITA_IMX351_MAIN_WB_CALIB_R_G;
                fArr2 = AwbData.NIKITA_IMX351_MAIN_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                fArr = AwbData.NIKITA_IMX351_WIDE_WB_CALIB_R_G;
                fArr2 = AwbData.NIKITA_IMX351_WIDE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                fArr = AwbData.NIKITA_SF846_WB_CALIB_R_G;
                fArr2 = AwbData.NIKITA_SF846_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                fArr = AwbData.SAVITAR_OV48C_WB_CALIB_R_G;
                fArr2 = AwbData.SAVITAR_OV48C_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                fArr = AwbData.SAVITAR_SAMSUNG_HMX_WB_CALIB_R_G;
                fArr2 = AwbData.SAVITAR_SAMSUNG_HMX_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                fArr = AwbData.NIKITA_IMX298_XIAOMI_WB_CALIB_R_G;
                fArr2 = AwbData.NIKITA_IMX298_XIAOMI_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                fArr = AwbData.NIKITA_IMX298_LG_WB_CALIB_R_G;
                fArr2 = AwbData.NIKITA_IMX298_LG_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                fArr = AwbData.NIKITA_IMX298_ASUS_WB_CALIB_R_G;
                fArr2 = AwbData.NIKITA_IMX298_ASUS_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                fArr = AwbData.S5KGM2_RN9S_WB_CALIB_R_G;
                fArr2 = AwbData.S5KGM2_RN9S_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                fArr = AwbData.OV8856_RN9SWIDE_WB_CALIB_R_G;
                fArr2 = AwbData.OV8856_RN9SWIDE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                fArr = AwbData.OV16A1Q_RN9SFRONT_WB_CALIB_R_G;
                fArr2 = AwbData.OV16A1Q_RN9SFRONT_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                fArr = AwbData.IMX682_POCOX3_WIDE_WB_CALIB_R_G;
                fArr2 = AwbData.IMX682_POCOX3_WIDE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                fArr = AwbData.S5K3T2_POCOX3FRONT_WB_CALIB_R_G;
                fArr2 = AwbData.S5K3T2_POCOX3FRONT_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                fArr = AwbData.S5K3T1_MI9_WB_CALIB_R_G;
                fArr2 = AwbData.S5K3T1_MI9_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                fArr = AwbData.IMX355_RN10_MAIN_WB_CALIB_R_G;
                fArr2 = AwbData.IMX355_RN10_MAIN_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                fArr = AwbData.OV13b10_RN10_FRONT_WB_CALIB_R_G;
                fArr2 = AwbData.OV13b10_RN10_FRONT_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                fArr = AwbData.IMX582_RN10_WIDE_WB_CALIB_R_G;
                fArr2 = AwbData.IMX582_RN10_WIDE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                fArr = AwbData.GC02M1_RN10_MACRO_WB_CALIB_R_G;
                fArr2 = AwbData.GC02M1_RN10_MACRO_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                fArr = AwbData.OV13B10_MI10TP_ULTRA_WB_CALIB_R_G;
                fArr2 = AwbData.OV13B10_MI10TP_ULTRA_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                fArr = AwbData.S5K3T2_MI10TP_FRONT_WB_CALIB_R_G;
                fArr2 = AwbData.S5K3T2_MI10TP_FRONT_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                fArr = AwbData.S5K5E9YX_MI10TP_MACRO_WB_CALIB_R_G;
                fArr2 = AwbData.S5K5E9YX_MI10TP_MACRO_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                fArr = AwbData.S5KGW1_REALX2_MAIN_WB_CALIB_R_G;
                fArr2 = AwbData.S5KGW1_REALX2_MAIN_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                fArr = AwbData.IMX319_REALX2_WIDE_WB_CALIB_R_G;
                fArr2 = AwbData.IMX319_REALX2_WIDE_WB_CALIB_B_G;
                break;
            case 64:
                fArr = AwbData.S5K3M5SX_REALX2_TELE_WB_CALIB_R_G;
                fArr2 = AwbData.S5K3M5SX_REALX2_TELE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                fArr = AwbData.IMX417_REALX2_FRONT_WB_CALIB_R_G;
                fArr2 = AwbData.IMX417_REALX2_FRONT_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                fArr = AwbData.S5K5E9_RN9S_MACRO_WB_CALIB_R_G;
                fArr2 = AwbData.S5K5E9_RN9S_MACRO_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                fArr = AwbData.IMX586_MI11U_TELE_WB_CALIB_R_G;
                fArr2 = AwbData.IMX586_MI11U_TELE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                fArr = AwbData.IMX586_MI11U_ULTRAWIDE_WB_CALIB_R_G;
                fArr2 = AwbData.IMX586_MI11U_ULTRAWIDE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                fArr = AwbData.GN2_MI11U_MAIN_WB_CALIB_R_G;
                fArr2 = AwbData.GN2_MI11U_MAIN_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                fArr = AwbData.S5K3T2_MI11U_FRONT_WB_CALIB_R_G;
                fArr2 = AwbData.S5K3T2_MI11U_FRONT_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                fArr = AwbData.ov50a_X30_MAIN_WB_CALIB_R_G;
                fArr2 = AwbData.ov50a_X30_MAIN_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                fArr = AwbData.ov60a_X30_FRONT_WB_CALIB_R_G;
                fArr2 = AwbData.ov60a_X30_FRONT_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                fArr = AwbData.s5kjn1_X30_ULTRAWIDE_WB_CALIB_R_G;
                fArr2 = AwbData.s5kjn1_X30_ULTRAWIDE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                fArr = AwbData.imx582_Mi9T_MAIN_WB_CALIB_R_G;
                fArr2 = AwbData.imx582_Mi9T_MAIN_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                fArr = AwbData.s5k3l6_Mi9T_ULTRAWIDE_WB_CALIB_R_G;
                fArr2 = AwbData.s5k3l6_Mi9T_ULTRAWIDE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                fArr = AwbData.ov8856_X3p_ULTRAWIDE_WB_CALIB_R_G;
                fArr2 = AwbData.ov8856_X3p_ULTRAWIDE_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                fArr = AwbData.imx582_X3p_MAIN_WB_CALIB_R_G;
                fArr2 = AwbData.imx582_X3p_MAIN_WB_CALIB_B_G;
                break;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                fArr = AwbData.AWB_PIXEL3MOD2_WB_CALIB_R_G;
                fArr2 = AwbData.AWB_PIXEL3MOD2_WB_CALIB_B_G;
                break;
            default:
                fArr = AwbData.NEXUS_EXPERIMENTAL_2016_WB_CALIB_R_G;
                fArr2 = AwbData.NEXUS_EXPERIMENTAL_2016_WB_CALIB_B_G;
                break;
        }
        awbArr_R_G = fArr;
        awbArr_B_G = fArr2;
        awbArr_len = fArr.length;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private static void setGRGB() {
        float[] fArrBGRG;
        float f;
        int iMenuValue = Pref.MenuValue(LensValue.SetLensValue("pref_grgb_back_key"));
        if (iMenuValue != -1) {
            switch (iMenuValue) {
                case 0:
                    f = 1.0f;
                    break;
                case 1:
                    f = AwbData.NEXUS_DEFAULT_2016_WB_CALIB_GR_GB;
                    break;
                case 2:
                    f = AwbData.NEXUS_DEFAULT_2016_FRONT_WB_CALIB_GR_GB;
                    break;
                case 3:
                    f = AwbData.NEXUS_DEFAULT_WB_CALIB_GR_GB;
                    break;
                case 4:
                    f = AwbData.NEXUS_DEFAULT_2019_FRONT_WB_CALIB_GR_GB;
                    break;
                case 5:
                    f = AwbData.NEXUS_DEFAULT_2019_TELE_WB_CALIB_GR_GB;
                    break;
                case 6:
                    f = AwbData.PIXEL3MOD2_WB_CALIB_GR_GB;
                    break;
            }
            awbArr_GR_GB = f;
            return;
        }
        String stringValue = Pref.getStringValue(LensValue.SetLensValue1("pref_load_awb_key"));
        awbArr_GR_GB = (stringValue.equalsIgnoreCase("Default") || stringValue.equalsIgnoreCase("0") || (fArrBGRG = Internal.BGRG()) == null || fArrBGRG.length == 0) ? 1.0f : fArrBGRG[0];
    }
}
