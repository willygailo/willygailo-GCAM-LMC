package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
public enum pde implements ppg {
    UNKNOWN(0),
    TIMER_ZERO_SECONDS(1),
    TIMER_THREE_SECONDS(2),
    TIMER_TEN_SECONDS(3),
    TIMER_AUTO(4),
    HDR_AUTO(5),
    HDR_ON(6),
    HDR_OFF(7),
    HDR_READY(8),
    PHOTO_FLASH_ON(9),
    PHOTO_FLASH_OFF(10),
    PHOTO_FLASH_AUTO(11),
    PHOTO_FLASH_GRAYED(12),
    PHOTO_FLASH_UNGRAYED(13),
    PHOTO_FLASH_NS(55),
    VIDEO_FLASH_ON(14),
    VIDEO_FLASH_OFF(15),
    MICROVIDEO_ON(16),
    MICROVIDEO_AUTO(17),
    MICROVIDEO_OFF(18),
    EXT_MICROPHONE_ON(19),
    EXT_MICROPHONE_OFF(20),
    FPS_AUTO(21),
    FPS_24(48),
    FPS_30(22),
    FPS_60(23),
    WHITE_BALANCE_AUTO(24),
    WHITE_BALANCE_CLOUDY(25),
    WHITE_BALANCE_SUNNY(26),
    WHITE_BALANCE_INCANDESCENT(27),
    WHITE_BALANCE_FLUORESCENT(28),
    BEAUTIFICATION_ON_LIGHT(29),
    BEAUTIFICATION_ON_STRONG(30),
    BEAUTIFICATION_OFF(31),
    AF_ON(32),
    AF_ON_LOCKED(33),
    AF_OFF_NEAR(34),
    AF_OFF_FAR(35),
    AF_OFF_INFINITY(45),
    IMAX_AUDIO_ON(36),
    IMAX_AUDIO_OFF(37),
    SELECTED(38),
    UNSELECTED(39),
    HORIZONTAL_PHOTO_SPHERE(40),
    VERTICAL_PHOTO_SPHERE(41),
    WIDE_ANGLE_PHOTO_SPHERE(42),
    FISH_EYE_PHOTO_SPHERE(43),
    PHOTO_SPHERE(44),
    SIXTEEN_BY_NINE(46),
    FOUR_BY_THREE(47),
    RES_1080P(49),
    RES_2160P(50),
    PR_ON(51),
    PR_OFF(52),
    ASTRO_OFF(53),
    ASTRO_AUTO(54),
    MIC_INPUT_PHONE(56),
    MIC_INPUT_EXT_WIRED(57),
    MIC_INPUT_EXT_BLUETOOTH(58),
    SWISS_OFF(59),
    SWISS_ON(60),
    LASAGNA_TR_SMALL(61),
    LASAGNA_TR_MEDIUM(62),
    LASAGNA_TR_LARGE(63),
    FLOUNDER_OFF(64),
    FLOUNDER_ON(65),
    ASPECT_RATIO_SIXTEEN_BY_NINE(66),
    ASPECT_RATIO_FOUR_BY_THREE(67),
    ASPECT_RATIO_THREE_BY_FOUR(68),
    ASPECT_RATIO_NINE_BY_SIXTEEN(69),
    COCKTAIL_PARTY_OFF(70),
    COCKTAIL_PARTY_ON(71),
    VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE(72),
    VIDEO_ASPECT_RATIO_FOUR_BY_THREE(73),
    VIDEO_ASPECT_RATIO_THREE_BY_FOUR(74),
    VIDEO_ASPECT_RATIO_NINE_BY_SIXTEEN(75);

    public final int ay;

    pde(int i) {
        this.ay = i;
    }

    public static pde b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return TIMER_ZERO_SECONDS;
            case 2:
                return TIMER_THREE_SECONDS;
            case 3:
                return TIMER_TEN_SECONDS;
            case 4:
                return TIMER_AUTO;
            case 5:
                return HDR_AUTO;
            case 6:
                return HDR_ON;
            case 7:
                return HDR_OFF;
            case 8:
                return HDR_READY;
            case 9:
                return PHOTO_FLASH_ON;
            case 10:
                return PHOTO_FLASH_OFF;
            case 11:
                return PHOTO_FLASH_AUTO;
            case 12:
                return PHOTO_FLASH_GRAYED;
            case 13:
                return PHOTO_FLASH_UNGRAYED;
            case 14:
                return VIDEO_FLASH_ON;
            case 15:
                return VIDEO_FLASH_OFF;
            case 16:
                return MICROVIDEO_ON;
            case 17:
                return MICROVIDEO_AUTO;
            case 18:
                return MICROVIDEO_OFF;
            case 19:
                return EXT_MICROPHONE_ON;
            case 20:
                return EXT_MICROPHONE_OFF;
            case 21:
                return FPS_AUTO;
            case 22:
                return FPS_30;
            case 23:
                return FPS_60;
            case 24:
                return WHITE_BALANCE_AUTO;
            case 25:
                return WHITE_BALANCE_CLOUDY;
            case 26:
                return WHITE_BALANCE_SUNNY;
            case 27:
                return WHITE_BALANCE_INCANDESCENT;
            case 28:
                return WHITE_BALANCE_FLUORESCENT;
            case 29:
                return BEAUTIFICATION_ON_LIGHT;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return BEAUTIFICATION_ON_STRONG;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return BEAUTIFICATION_OFF;
            case 32:
                return AF_ON;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return AF_ON_LOCKED;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return AF_OFF_NEAR;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return AF_OFF_FAR;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return IMAX_AUDIO_ON;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return IMAX_AUDIO_OFF;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return SELECTED;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return UNSELECTED;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return HORIZONTAL_PHOTO_SPHERE;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return VERTICAL_PHOTO_SPHERE;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return WIDE_ANGLE_PHOTO_SPHERE;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return FISH_EYE_PHOTO_SPHERE;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return PHOTO_SPHERE;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return AF_OFF_INFINITY;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return SIXTEEN_BY_NINE;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return FOUR_BY_THREE;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return FPS_24;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return RES_1080P;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return RES_2160P;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return PR_ON;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return PR_OFF;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return ASTRO_OFF;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return ASTRO_AUTO;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return PHOTO_FLASH_NS;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return MIC_INPUT_PHONE;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return MIC_INPUT_EXT_WIRED;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return MIC_INPUT_EXT_BLUETOOTH;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return SWISS_OFF;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return SWISS_ON;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return LASAGNA_TR_SMALL;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return LASAGNA_TR_MEDIUM;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return LASAGNA_TR_LARGE;
            case 64:
                return FLOUNDER_OFF;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return FLOUNDER_ON;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return ASPECT_RATIO_SIXTEEN_BY_NINE;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return ASPECT_RATIO_FOUR_BY_THREE;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return ASPECT_RATIO_THREE_BY_FOUR;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return ASPECT_RATIO_NINE_BY_SIXTEEN;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return COCKTAIL_PARTY_OFF;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return COCKTAIL_PARTY_ON;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return VIDEO_ASPECT_RATIO_FOUR_BY_THREE;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return VIDEO_ASPECT_RATIO_THREE_BY_FOUR;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return VIDEO_ASPECT_RATIO_NINE_BY_SIXTEEN;
            default:
                return null;
        }
    }

    public static ppi c() {
        return pcm.q;
    }

    @Override // defpackage.ppg
    public final int a() {
        return this.ay;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ay);
    }
}
