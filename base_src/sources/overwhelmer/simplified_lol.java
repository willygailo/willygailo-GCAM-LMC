package overwhelmer;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
public class simplified_lol {
    public static float MaxExpMs;
    public static float MinExpMs;
    public static int mExpIndex;
    public static int mIsoIndex;
    public static float sDesiredExposureTimeMs;
    public static float sGainAE;
    public static float sManualDigitalGain = 1.0f;
    public static float sManualIsoGain;

    public static float getExposureTimeMS() {
        return getExposureTimeMSValues(mExpIndex);
    }

    private static float getExposureTimeMSValues(int i) {
        switch (i) {
            case 0:
                return 0.0f;
            case 1:
                return 60000.0f;
            case 2:
                return 32000.0f;
            case 3:
                return 16000.0f;
            case 4:
                return 12000.0f;
            case 5:
                return 10000.0f;
            case 6:
                return 8000.0f;
            case 7:
                return 7000.0f;
            case 8:
                return 6000.0f;
            case 9:
                return 5000.0f;
            case 10:
                return 4000.0f;
            case 11:
                return 3000.0f;
            case 12:
                return 2000.0f;
            case 13:
                return 1000.0f;
            case 14:
                return 500.0f;
            case 15:
                return 333.33334f;
            case 16:
                return 250.0f;
            case 17:
                return 200.0f;
            case 18:
                return 166.66667f;
            case 19:
                return 125.0f;
            case 20:
                return 100.0f;
            case 21:
                return 66.66666f;
            case 22:
                return 50.0f;
            case 23:
                return 33.333332f;
            case 24:
                return 16.666666f;
            case 25:
                return 10.0f;
            case 26:
                return 8.0f;
            case 27:
                return 5.0f;
            case 28:
                return 4.0f;
            case 29:
                return 3.33333f;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return 2.857142f;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return 2.5f;
            case 32:
                return 2.222222f;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return 2.0f;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return 1.66666f;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return 1.33333f;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return 1.0f;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return 0.8f;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return 0.666666f;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return 0.625f;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return 0.5f;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return 0.4f;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return 0.33333f;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return 0.25f;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return 0.2f;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return 0.166666f;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return 0.142857f;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return 0.125f;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return 0.1f;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return 0.066666f;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return 0.033333f;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return 0.025f;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return 0.02f;
            default:
                return 3333.3333f;
        }
    }

    public static void getManualExp() {
        float exposureTimeMS = getExposureTimeMS();
        if (exposureTimeMS != 0.0f) {
            if (exposureTimeMS > MaxExpMs) {
                sDesiredExposureTimeMs = MaxExpMs;
            } else if (exposureTimeMS < MinExpMs) {
                sDesiredExposureTimeMs = MinExpMs;
            } else {
                sDesiredExposureTimeMs = exposureTimeMS;
            }
        }
    }

    public static void setManualIsoSlider() {
        int i = mIsoIndex;
        if (i == 0) {
            sManualIsoGain = sGainAE;
            return;
        }
        if (i >= 1 && i <= 32) {
            sManualIsoGain = i;
            return;
        }
        for (int i2 = 6; i2 <= 9; i2++) {
            float f = 1 << i2;
            if (i == i2 + 27) {
                sManualIsoGain = f;
                return;
            }
        }
    }
}
