package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
public enum pab implements ppg {
    UNKNOWN_TYPE(0),
    NAVIGATION_CHANGE(1),
    CAPTURE_DONE(3),
    DEPRECATED_TAP_TO_FOCUS(4),
    PHOTO_INTERACTION(5),
    FOREGROUND_EVENT(6),
    CAMERA_FAILURE(7),
    CONTROL_USED(12),
    CAPTURE_COMPUTE(13),
    BACKGROUND_EVENT(14),
    MEMORY_REPORT(15),
    MEMORY_WINDOW_STATS(16),
    STORAGE_WARNING(17),
    CAPTURE_PROFILE_START(18),
    CAPTURE_PROFILE(19),
    CAPTURE_PROFILE_ABORTED(20),
    CAMERA_PREWARM(21),
    OPEN_DEVICE_RETRY(22),
    CHANGE_CAMERA(23),
    BLOCK_SHOT(24),
    CAPTURE_PROFILE_FAILED(25),
    CAPTURE_PROFILE_START_COMMITTED(26),
    CAPTURE_PROFILE_DELETED(27),
    PREFERENCES_EVENT(28),
    CAMERA_CONTENT_PROVIDER(29),
    LAUNCH_PHOTOS_REVIEW_EVENT(30),
    PHOTO_VIDEO_MODE_CHANGE(31),
    ADVICE_SHOWN(32),
    PREFERENCE_CHANGE_EVENT(33),
    IRIS_EVENT(34),
    WEAR_LAUNCH_EVENT(35),
    WEAR_INSTALL_EVENT(36),
    THERMAL_EVENT(37),
    PHOTOBOOTH_SESSION_EVENT(38),
    MODE_SWITCH_EVENT(39),
    SLOW_PROCESSING_EVENT(40),
    CAMERA_SMARTS_EVENT(41),
    WEAR_SESSION_EVENT(42),
    MODE_SWITCH_ANIMATION_EVENT(43),
    INFLIGHT_FALLBACK_RESTORED_EVENT(44),
    OPTIONBAR_OPTION_CHANGE_EVENT(45),
    LENSLITE_INITIALIZATION_EVENT(46),
    LENSLITE_EVENT(47),
    PORTRAIT_SEGMENTER_INIT_FAILURE(48),
    FREQUENT_FACE_PREFERENCE_CHANGE_EVENT(49),
    DND_ACCESS_NEEDED_EVENT(50),
    ADVICE_HEEDED(51),
    VIDEO_SESSION_EVENT(52),
    EDUCATION_TOAST_EVENT(53),
    CAMERA_FATAL_ERROR_COUNTS_EVENT(54),
    SYSTEM_SERVICE_EVENT(55),
    CAMERA_FATAL_ERROR_DIALOG(56),
    FRAMING_HINT_STATUS(57),
    FRAMING_HINT_SHOWN(58),
    CATSHARK_TOGGLE_CHANGE_EVENT(59),
    ENTER_STORAGE_PREFERENCE_EVENT(60),
    STATS_3A_EVENT(61),
    SHOTLOSS_EVENT(62),
    IN_APP_UPDATE_EVENT(63),
    ZOOM_LOCK_EVENT(64),
    BOTTOM_SHEET_EVENT(65),
    HAL_UPDATE_EVENT(66),
    PROCESS_GC_EVENT(67),
    DUAL_FUSION_EVENT(68),
    LENS_SUGGESTION_CHIP_EVENT(69);

    public final int an;

    pab(int i) {
        this.an = i;
    }

    public static pab b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return NAVIGATION_CHANGE;
            case 2:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                return null;
            case 3:
                return CAPTURE_DONE;
            case 4:
                return DEPRECATED_TAP_TO_FOCUS;
            case 5:
                return PHOTO_INTERACTION;
            case 6:
                return FOREGROUND_EVENT;
            case 7:
                return CAMERA_FAILURE;
            case 12:
                return CONTROL_USED;
            case 13:
                return CAPTURE_COMPUTE;
            case 14:
                return BACKGROUND_EVENT;
            case 15:
                return MEMORY_REPORT;
            case 16:
                return MEMORY_WINDOW_STATS;
            case 17:
                return STORAGE_WARNING;
            case 18:
                return CAPTURE_PROFILE_START;
            case 19:
                return CAPTURE_PROFILE;
            case 20:
                return CAPTURE_PROFILE_ABORTED;
            case 21:
                return CAMERA_PREWARM;
            case 22:
                return OPEN_DEVICE_RETRY;
            case 23:
                return CHANGE_CAMERA;
            case 24:
                return BLOCK_SHOT;
            case 25:
                return CAPTURE_PROFILE_FAILED;
            case 26:
                return CAPTURE_PROFILE_START_COMMITTED;
            case 27:
                return CAPTURE_PROFILE_DELETED;
            case 28:
                return PREFERENCES_EVENT;
            case 29:
                return CAMERA_CONTENT_PROVIDER;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return LAUNCH_PHOTOS_REVIEW_EVENT;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return PHOTO_VIDEO_MODE_CHANGE;
            case 32:
                return ADVICE_SHOWN;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return PREFERENCE_CHANGE_EVENT;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return IRIS_EVENT;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return WEAR_LAUNCH_EVENT;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return WEAR_INSTALL_EVENT;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return THERMAL_EVENT;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return PHOTOBOOTH_SESSION_EVENT;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return MODE_SWITCH_EVENT;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return SLOW_PROCESSING_EVENT;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return CAMERA_SMARTS_EVENT;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return WEAR_SESSION_EVENT;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return MODE_SWITCH_ANIMATION_EVENT;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return INFLIGHT_FALLBACK_RESTORED_EVENT;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return OPTIONBAR_OPTION_CHANGE_EVENT;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return LENSLITE_INITIALIZATION_EVENT;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return LENSLITE_EVENT;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return PORTRAIT_SEGMENTER_INIT_FAILURE;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return FREQUENT_FACE_PREFERENCE_CHANGE_EVENT;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return DND_ACCESS_NEEDED_EVENT;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return ADVICE_HEEDED;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return VIDEO_SESSION_EVENT;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return EDUCATION_TOAST_EVENT;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return CAMERA_FATAL_ERROR_COUNTS_EVENT;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return SYSTEM_SERVICE_EVENT;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return CAMERA_FATAL_ERROR_DIALOG;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return FRAMING_HINT_STATUS;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return FRAMING_HINT_SHOWN;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return CATSHARK_TOGGLE_CHANGE_EVENT;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return ENTER_STORAGE_PREFERENCE_EVENT;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return STATS_3A_EVENT;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return SHOTLOSS_EVENT;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return IN_APP_UPDATE_EVENT;
            case 64:
                return ZOOM_LOCK_EVENT;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return BOTTOM_SHEET_EVENT;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return HAL_UPDATE_EVENT;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return PROCESS_GC_EVENT;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return DUAL_FUSION_EVENT;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return LENS_SUGGESTION_CHIP_EVENT;
        }
    }

    public static ppi c() {
        return mfw.u;
    }

    @Override // defpackage.ppg
    public final int a() {
        return this.an;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.an);
    }
}
