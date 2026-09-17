package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Binder;
import android.os.Process;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "SIMPLE";
            case 3:
                return "CHOICE";
            case 4:
                return "PLURAL";
            case 5:
                return "SELECT";
            case 6:
                return "SELECTORDINAL";
            default:
                return "null";
        }
    }

    public static boolean b(int i) {
        return i == 4 || i == 6;
    }

    public static int c(String str) {
        int iCharAt = 0;
        for (int i = 0; i < str.length(); i++) {
            iCharAt = (iCharAt * 31) + str.charAt(i);
        }
        return iCharAt;
    }

    public static boolean d(int i) {
        return i == 13 || i == 14;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ba A[Catch: RuntimeException -> 0x00c0, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00c0, blocks: (B:57:0x00b4, B:59:0x00ba), top: B:69:0x00b4 }] */
    public static bz e(Context context, bu buVar, boolean z, boolean z2) {
        Animator animatorLoadAnimator;
        br brVar = buVar.P;
        int iY = 0;
        int i = brVar == null ? 0 : brVar.f;
        int iP = z2 ? z ? buVar.p() : buVar.q() : z ? buVar.n() : buVar.o();
        buVar.P(0, 0, 0, 0);
        ViewGroup viewGroup = buVar.L;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            buVar.L.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = buVar.L;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (iP == 0) {
            if (i != 0) {
                switch (i) {
                    case 4097:
                        iY = true == z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        break;
                    case 4099:
                        iY = true == z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                        break;
                    case 4100:
                        iY = !z ? y(context, android.R.attr.activityOpenExitAnimation) : y(context, android.R.attr.activityOpenEnterAnimation);
                        break;
                    case 8194:
                        iY = true == z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                        break;
                    case 8197:
                        iY = !z ? y(context, android.R.attr.activityCloseExitAnimation) : y(context, android.R.attr.activityCloseEnterAnimation);
                        break;
                    default:
                        iY = -1;
                        break;
                }
            }
        } else {
            iY = iP;
        }
        if (iY != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iY));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iY);
                    if (animationLoadAnimation != null) {
                        return new bz(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iY);
                        if (animatorLoadAnimator != null) {
                            return new bz(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e3) {
                        if (zEquals) {
                            throw e3;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iY);
                        if (animationLoadAnimation2 != null) {
                            return new bz(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iY);
                if (animatorLoadAnimator != null) {
                    return new bz(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    public static final psj g(int i) {
        switch (i - 1) {
            case 0:
                poy poyVarI = psj.i();
                poyVarI.F(2);
                return (psj) poyVarI.j();
            case 1:
                poy poyVarI2 = psj.i();
                poyVarI2.F(2);
                return (psj) poyVarI2.j();
            case 2:
                poy poyVarI3 = psj.i();
                poyVarI3.F(2);
                return (psj) poyVarI3.j();
            case 3:
                poy poyVarI4 = psj.i();
                poyVarI4.F(1);
                return (psj) poyVarI4.j();
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case 32:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_colorAccent /* 50 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_colorError /* 56 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case 64:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_editTextBackground /* 68 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_panelBackground /* 86 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
            case 198:
            case 221:
            case 248:
            case 249:
            default:
                poy poyVarI5 = psj.i();
                poyVarI5.F(1);
                return (psj) poyVarI5.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_spinnerStyle /* 100 */:
                poy poyVarI6 = psj.i();
                poyVarI6.F(3);
                return (psj) poyVarI6.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_switchStyle /* 101 */:
                poy poyVarI7 = psj.i();
                poyVarI7.F(3);
                return (psj) poyVarI7.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                poy poyVarI8 = psj.i();
                poyVarI8.F(3);
                return (psj) poyVarI8.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                poy poyVarI9 = psj.i();
                poyVarI9.F(3);
                return (psj) poyVarI9.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                poy poyVarI10 = psj.i();
                poyVarI10.F(3);
                return (psj) poyVarI10.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                poy poyVarI11 = psj.i();
                poyVarI11.F(3);
                return (psj) poyVarI11.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                poy poyVarI12 = psj.i();
                poyVarI12.F(3);
                return (psj) poyVarI12.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                poy poyVarI13 = psj.i();
                poyVarI13.F(2);
                return (psj) poyVarI13.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                poy poyVarI14 = psj.i();
                poyVarI14.F(3);
                return (psj) poyVarI14.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                poy poyVarI15 = psj.i();
                poyVarI15.F(3);
                return (psj) poyVarI15.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                poy poyVarI16 = psj.i();
                poyVarI16.F(2);
                return (psj) poyVarI16.j();
            case 111:
                poy poyVarI17 = psj.i();
                poyVarI17.F(3);
                return (psj) poyVarI17.j();
            case 112:
                poy poyVarI18 = psj.i();
                poyVarI18.F(3);
                return (psj) poyVarI18.j();
            case 113:
                poy poyVarI19 = psj.i();
                poyVarI19.F(3);
                return (psj) poyVarI19.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                poy poyVarI20 = psj.i();
                poyVarI20.F(2);
                return (psj) poyVarI20.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                poy poyVarI21 = psj.i();
                poyVarI21.F(3);
                return (psj) poyVarI21.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                poy poyVarI22 = psj.i();
                poyVarI22.F(3);
                return (psj) poyVarI22.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                poy poyVarI23 = psj.i();
                poyVarI23.F(3);
                return (psj) poyVarI23.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                poy poyVarI24 = psj.i();
                poyVarI24.F(3);
                return (psj) poyVarI24.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                poy poyVarM = psj.c.m();
                poyVarM.F(3);
                return (psj) poyVarM.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                poy poyVarM2 = psj.c.m();
                poyVarM2.F(3);
                return (psj) poyVarM2.j();
            case 121:
                poy poyVarM3 = psj.c.m();
                poyVarM3.F(3);
                return (psj) poyVarM3.j();
            case 122:
                poy poyVarM4 = psj.c.m();
                poyVarM4.F(3);
                return (psj) poyVarM4.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                poy poyVarM5 = psj.c.m();
                poyVarM5.F(3);
                return (psj) poyVarM5.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                poy poyVarM6 = psj.c.m();
                poyVarM6.F(3);
                return (psj) poyVarM6.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                poy poyVarM7 = psj.c.m();
                poyVarM7.F(3);
                return (psj) poyVarM7.j();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                poy poyVarM8 = psj.c.m();
                poyVarM8.F(3);
                return (psj) poyVarM8.j();
            case 127:
                poy poyVarM9 = psj.c.m();
                poyVarM9.F(3);
                return (psj) poyVarM9.j();
            case 128:
                poy poyVarM10 = psj.c.m();
                poyVarM10.F(3);
                return (psj) poyVarM10.j();
            case 129:
                poy poyVarM11 = psj.c.m();
                poyVarM11.F(3);
                return (psj) poyVarM11.j();
            case 130:
                poy poyVarM12 = psj.c.m();
                poyVarM12.F(3);
                return (psj) poyVarM12.j();
            case ScriptIntrinsicBLAS.NON_UNIT /* 131 */:
                poy poyVarM13 = psj.c.m();
                poyVarM13.F(3);
                return (psj) poyVarM13.j();
            case ScriptIntrinsicBLAS.UNIT /* 132 */:
                poy poyVarI25 = psj.i();
                poyVarI25.F(3);
                return (psj) poyVarI25.j();
            case 133:
                poy poyVarI26 = psj.i();
                poyVarI26.F(3);
                return (psj) poyVarI26.j();
            case 134:
                poy poyVarI27 = psj.i();
                poyVarI27.F(3);
                return (psj) poyVarI27.j();
            case 135:
                poy poyVarI28 = psj.i();
                poyVarI28.F(2);
                return (psj) poyVarI28.j();
            case 136:
                poy poyVarI29 = psj.i();
                poyVarI29.F(2);
                return (psj) poyVarI29.j();
            case 137:
                poy poyVarI30 = psj.i();
                poyVarI30.F(2);
                return (psj) poyVarI30.j();
            case 138:
                poy poyVarI31 = psj.i();
                poyVarI31.F(2);
                return (psj) poyVarI31.j();
            case 139:
                poy poyVarI32 = psj.i();
                poyVarI32.F(2);
                return (psj) poyVarI32.j();
            case 140:
                poy poyVarI33 = psj.i();
                poyVarI33.F(2);
                return (psj) poyVarI33.j();
            case ScriptIntrinsicBLAS.LEFT /* 141 */:
                poy poyVarI34 = psj.i();
                poyVarI34.F(2);
                return (psj) poyVarI34.j();
            case ScriptIntrinsicBLAS.RIGHT /* 142 */:
                poy poyVarI35 = psj.i();
                poyVarI35.F(2);
                return (psj) poyVarI35.j();
            case 143:
                poy poyVarI36 = psj.i();
                poyVarI36.F(2);
                return (psj) poyVarI36.j();
            case 144:
                poy poyVarI37 = psj.i();
                poyVarI37.F(2);
                return (psj) poyVarI37.j();
            case 145:
                poy poyVarI38 = psj.i();
                poyVarI38.F(2);
                return (psj) poyVarI38.j();
            case 146:
                poy poyVarI39 = psj.i();
                poyVarI39.F(2);
                return (psj) poyVarI39.j();
            case 147:
                poy poyVarI40 = psj.i();
                poyVarI40.F(2);
                return (psj) poyVarI40.j();
            case 148:
                poy poyVarI41 = psj.i();
                poyVarI41.F(2);
                return (psj) poyVarI41.j();
            case 149:
                poy poyVarI42 = psj.i();
                poyVarI42.F(2);
                return (psj) poyVarI42.j();
            case 150:
                poy poyVarI43 = psj.i();
                poyVarI43.F(3);
                return (psj) poyVarI43.j();
            case 151:
                poy poyVarI44 = psj.i();
                poyVarI44.F(3);
                return (psj) poyVarI44.j();
            case 152:
                poy poyVarI45 = psj.i();
                poyVarI45.F(3);
                return (psj) poyVarI45.j();
            case 153:
                poy poyVarI46 = psj.i();
                poyVarI46.F(3);
                return (psj) poyVarI46.j();
            case 154:
                poy poyVarI47 = psj.i();
                poyVarI47.F(3);
                return (psj) poyVarI47.j();
            case 155:
                poy poyVarI48 = psj.i();
                poyVarI48.F(3);
                return (psj) poyVarI48.j();
            case 156:
                poy poyVarI49 = psj.i();
                poyVarI49.F(3);
                return (psj) poyVarI49.j();
            case 157:
                poy poyVarM14 = psj.c.m();
                poyVarM14.F(23);
                return (psj) poyVarM14.j();
            case 158:
                poy poyVarI50 = psj.i();
                poyVarI50.F(2);
                return (psj) poyVarI50.j();
            case 159:
                poy poyVarI51 = psj.i();
                poyVarI51.F(2);
                return (psj) poyVarI51.j();
            case 160:
                poy poyVarI52 = psj.i();
                poyVarI52.F(2);
                return (psj) poyVarI52.j();
            case 161:
                poy poyVarI53 = psj.i();
                poy poyVarI54 = psh.i();
                poyVarI54.A(2);
                poyVarI54.A(16);
                poyVarI53.D((psh) poyVarI54.j());
                return (psj) poyVarI53.j();
            case 162:
                poy poyVarI55 = psj.i();
                poy poyVarI56 = psh.i();
                poyVarI56.A(2);
                poyVarI56.A(16);
                poyVarI55.D((psh) poyVarI56.j());
                return (psj) poyVarI55.j();
            case 163:
                poy poyVarI57 = psj.i();
                poy poyVarI58 = psh.i();
                poyVarI58.A(2);
                poyVarI58.A(16);
                poyVarI57.D((psh) poyVarI58.j());
                return (psj) poyVarI57.j();
            case 164:
                poy poyVarI59 = psj.i();
                poy poyVarI60 = psh.i();
                poyVarI60.A(2);
                poyVarI60.A(16);
                poyVarI59.D((psh) poyVarI60.j());
                return (psj) poyVarI59.j();
            case 165:
                poy poyVarM15 = psj.c.m();
                poyVarM15.F(2);
                return (psj) poyVarM15.j();
            case 166:
                poy poyVarM16 = psj.c.m();
                poyVarM16.F(5);
                return (psj) poyVarM16.j();
            case 167:
                poy poyVarI61 = psj.i();
                poyVarI61.F(2);
                return (psj) poyVarI61.j();
            case 168:
                poy poyVarM17 = psj.c.m();
                poyVarM17.F(21);
                return (psj) poyVarM17.j();
            case 169:
                poy poyVarM18 = psj.c.m();
                poyVarM18.F(21);
                return (psj) poyVarM18.j();
            case 170:
                poy poyVarM19 = psj.c.m();
                poyVarM19.F(21);
                return (psj) poyVarM19.j();
            case 171:
                poy poyVarM20 = psj.c.m();
                poyVarM20.F(21);
                return (psj) poyVarM20.j();
            case 172:
                poy poyVarM21 = psj.c.m();
                poyVarM21.F(3);
                return (psj) poyVarM21.j();
            case 173:
                poy poyVarM22 = psj.c.m();
                poyVarM22.F(3);
                return (psj) poyVarM22.j();
            case 174:
                poy poyVarM23 = psj.c.m();
                poyVarM23.F(3);
                return (psj) poyVarM23.j();
            case 175:
                poy poyVarM24 = psj.c.m();
                poyVarM24.F(3);
                return (psj) poyVarM24.j();
            case 176:
                poy poyVarM25 = psj.c.m();
                poyVarM25.F(3);
                return (psj) poyVarM25.j();
            case 177:
                poy poyVarI62 = psj.i();
                poyVarI62.F(15);
                return (psj) poyVarI62.j();
            case 178:
                poy poyVarI63 = psj.i();
                poyVarI63.F(15);
                return (psj) poyVarI63.j();
            case 179:
                poy poyVarI64 = psj.i();
                poyVarI64.F(15);
                return (psj) poyVarI64.j();
            case 180:
                poy poyVarI65 = psj.i();
                poyVarI65.F(15);
                return (psj) poyVarI65.j();
            case 181:
                poy poyVarM26 = psj.c.m();
                poyVarM26.F(21);
                return (psj) poyVarM26.j();
            case 182:
                poy poyVarM27 = psj.c.m();
                poyVarM27.F(6);
                return (psj) poyVarM27.j();
            case 183:
                poy poyVarM28 = psj.c.m();
                poyVarM28.F(8);
                return (psj) poyVarM28.j();
            case 184:
                poy poyVarM29 = psj.c.m();
                poyVarM29.F(2);
                return (psj) poyVarM29.j();
            case 185:
                poy poyVarM30 = psj.c.m();
                poyVarM30.F(9);
                return (psj) poyVarM30.j();
            case 186:
                poy poyVarM31 = psj.c.m();
                poy poyVarI66 = psh.i();
                poyVarI66.A(6);
                poyVarI66.A(9);
                poy poyVarI67 = psi.i();
                poyVarI67.C(10);
                poyVarI67.C(11);
                poyVarI66.z((psi) poyVarI67.j());
                poyVarM31.D((psh) poyVarI66.j());
                return (psj) poyVarM31.j();
            case 187:
                poy poyVarM32 = psj.c.m();
                poy poyVarI68 = psi.i();
                poyVarI68.C(19);
                poy poyVarI69 = psh.i();
                poyVarI69.A(9);
                poyVarI69.A(8);
                poyVarI68.B((psh) poyVarI69.j());
                poyVarM32.E((psi) poyVarI68.j());
                return (psj) poyVarM32.j();
            case 188:
                poy poyVarM33 = psj.c.m();
                poy poyVarI70 = psi.i();
                poyVarI70.C(3);
                poyVarI70.C(15);
                poyVarM33.E((psi) poyVarI70.j());
                return (psj) poyVarM33.j();
            case 189:
                poy poyVarM34 = psj.c.m();
                poy poyVarM35 = psi.c.m();
                poyVarM35.C(3);
                poyVarM35.C(15);
                poyVarM34.E((psi) poyVarM35.j());
                return (psj) poyVarM34.j();
            case 190:
                poy poyVarM36 = psj.c.m();
                poy poyVarM37 = psi.c.m();
                poyVarM37.C(3);
                poyVarM37.C(15);
                poyVarM36.E((psi) poyVarM37.j());
                return (psj) poyVarM36.j();
            case 191:
                poy poyVarM38 = psj.c.m();
                poy poyVarM39 = psi.c.m();
                poyVarM39.C(3);
                poyVarM39.C(15);
                poyVarM38.E((psi) poyVarM39.j());
                return (psj) poyVarM38.j();
            case 192:
                poy poyVarM40 = psj.c.m();
                poyVarM40.F(2);
                return (psj) poyVarM40.j();
            case 193:
                poy poyVarM41 = psj.c.m();
                poyVarM41.F(2);
                return (psj) poyVarM41.j();
            case 194:
                poy poyVarI71 = psj.i();
                poyVarI71.F(2);
                return (psj) poyVarI71.j();
            case 195:
                poy poyVarM42 = psj.c.m();
                poyVarM42.F(26);
                return (psj) poyVarM42.j();
            case 196:
                poy poyVarM43 = psj.c.m();
                poyVarM43.F(3);
                return (psj) poyVarM43.j();
            case 197:
                poy poyVarI72 = psj.i();
                poyVarI72.F(13);
                return (psj) poyVarI72.j();
            case 199:
                poy poyVarI73 = psj.i();
                poyVarI73.F(2);
                return (psj) poyVarI73.j();
            case 200:
                poy poyVarI74 = psj.i();
                poyVarI74.F(2);
                return (psj) poyVarI74.j();
            case 201:
                poy poyVarI75 = psj.i();
                poyVarI75.F(2);
                return (psj) poyVarI75.j();
            case 202:
                poy poyVarI76 = psj.i();
                poyVarI76.F(2);
                return (psj) poyVarI76.j();
            case 203:
                poy poyVarI77 = psj.i();
                poyVarI77.F(2);
                return (psj) poyVarI77.j();
            case 204:
                poy poyVarM44 = psj.c.m();
                poyVarM44.F(14);
                return (psj) poyVarM44.j();
            case 205:
                poy poyVarI78 = psj.i();
                poyVarI78.F(2);
                return (psj) poyVarI78.j();
            case 206:
                poy poyVarI79 = psj.i();
                poyVarI79.F(2);
                return (psj) poyVarI79.j();
            case 207:
                poy poyVarI80 = psj.i();
                poyVarI80.F(2);
                return (psj) poyVarI80.j();
            case 208:
                poy poyVarM45 = psj.c.m();
                poyVarM45.F(3);
                return (psj) poyVarM45.j();
            case 209:
                poy poyVarM46 = psj.c.m();
                poyVarM46.F(2);
                return (psj) poyVarM46.j();
            case 210:
                poy poyVarM47 = psj.c.m();
                poy poyVarM48 = psi.c.m();
                poyVarM48.C(25);
                poyVarM48.C(24);
                poyVarM47.E((psi) poyVarM48.j());
                return (psj) poyVarM47.j();
            case 211:
                poy poyVarM49 = psj.c.m();
                poy poyVarM50 = psi.c.m();
                poyVarM50.C(25);
                poyVarM50.C(24);
                poyVarM49.E((psi) poyVarM50.j());
                return (psj) poyVarM49.j();
            case 212:
                poy poyVarM51 = psj.c.m();
                poy poyVarM52 = psi.c.m();
                poyVarM52.C(25);
                poyVarM52.C(24);
                psi psiVar = (psi) poyVarM52.j();
                if (poyVarM51.c) {
                    poyVarM51.m();
                    poyVarM51.c = false;
                }
                psj psjVar = (psj) poyVarM51.b;
                psiVar.getClass();
                psjVar.b = psiVar;
                psjVar.a = 3;
                return (psj) poyVarM51.j();
            case 213:
                poy poyVarM53 = psj.c.m();
                poyVarM53.F(2);
                return (psj) poyVarM53.j();
            case 214:
                poy poyVarM54 = psj.c.m();
                poyVarM54.F(2);
                return (psj) poyVarM54.j();
            case 215:
                poy poyVarM55 = psj.c.m();
                poyVarM55.F(17);
                return (psj) poyVarM55.j();
            case 216:
                poy poyVarM56 = psj.c.m();
                poyVarM56.F(2);
                return (psj) poyVarM56.j();
            case 217:
                poy poyVarM57 = psj.c.m();
                poyVarM57.F(4);
                return (psj) poyVarM57.j();
            case 218:
                poy poyVarM58 = psj.c.m();
                poyVarM58.F(10);
                return (psj) poyVarM58.j();
            case 219:
                poy poyVarM59 = psj.c.m();
                poyVarM59.F(2);
                return (psj) poyVarM59.j();
            case 220:
                poy poyVarM60 = psj.c.m();
                poyVarM60.F(2);
                return (psj) poyVarM60.j();
            case 222:
                poy poyVarM61 = psj.c.m();
                poyVarM61.F(2);
                return (psj) poyVarM61.j();
            case 223:
                poy poyVarM62 = psj.c.m();
                poyVarM62.F(1);
                return (psj) poyVarM62.j();
            case 224:
                poy poyVarM63 = psj.c.m();
                poyVarM63.F(18);
                return (psj) poyVarM63.j();
            case 225:
                poy poyVarM64 = psj.c.m();
                poyVarM64.F(18);
                return (psj) poyVarM64.j();
            case 226:
                poy poyVarM65 = psj.c.m();
                poyVarM65.F(9);
                return (psj) poyVarM65.j();
            case 227:
                poy poyVarM66 = psj.c.m();
                poyVarM66.F(18);
                return (psj) poyVarM66.j();
            case 228:
                poy poyVarM67 = psj.c.m();
                poyVarM67.F(2);
                return (psj) poyVarM67.j();
            case 229:
                poy poyVarM68 = psj.c.m();
                poyVarM68.F(2);
                return (psj) poyVarM68.j();
            case 230:
                poy poyVarM69 = psj.c.m();
                poyVarM69.F(2);
                return (psj) poyVarM69.j();
            case 231:
                poy poyVarM70 = psj.c.m();
                poyVarM70.F(2);
                return (psj) poyVarM70.j();
            case 232:
                poy poyVarM71 = psj.c.m();
                if (poyVarM71.c) {
                    poyVarM71.m();
                    poyVarM71.c = false;
                }
                psj psjVar2 = (psj) poyVarM71.b;
                psjVar2.b = 1;
                psjVar2.a = 1;
                return (psj) poyVarM71.j();
            case 233:
                poy poyVarM72 = psj.c.m();
                poyVarM72.F(20);
                return (psj) poyVarM72.j();
            case 234:
                poy poyVarM73 = psj.c.m();
                if (poyVarM73.c) {
                    poyVarM73.m();
                    poyVarM73.c = false;
                }
                psj psjVar3 = (psj) poyVarM73.b;
                psjVar3.b = 21;
                psjVar3.a = 1;
                return (psj) poyVarM73.j();
            case 235:
                poy poyVarM74 = psj.c.m();
                if (poyVarM74.c) {
                    poyVarM74.m();
                    poyVarM74.c = false;
                }
                psj psjVar4 = (psj) poyVarM74.b;
                psjVar4.b = 21;
                psjVar4.a = 1;
                return (psj) poyVarM74.j();
            case 236:
                poy poyVarM75 = psj.c.m();
                if (poyVarM75.c) {
                    poyVarM75.m();
                    poyVarM75.c = false;
                }
                psj psjVar5 = (psj) poyVarM75.b;
                psjVar5.b = 21;
                psjVar5.a = 1;
                return (psj) poyVarM75.j();
            case 237:
                poy poyVarM76 = psj.c.m();
                poyVarM76.F(21);
                return (psj) poyVarM76.j();
            case 238:
                poy poyVarM77 = psj.c.m();
                poyVarM77.F(23);
                return (psj) poyVarM77.j();
            case 239:
                poy poyVarM78 = psj.c.m();
                poyVarM78.F(4);
                return (psj) poyVarM78.j();
            case 240:
                poy poyVarM79 = psj.c.m();
                poyVarM79.F(2);
                return (psj) poyVarM79.j();
            case 241:
                poy poyVarM80 = psj.c.m();
                poyVarM80.F(2);
                return (psj) poyVarM80.j();
            case 242:
                poy poyVarM81 = psj.c.m();
                if (poyVarM81.c) {
                    poyVarM81.m();
                    poyVarM81.c = false;
                }
                psj psjVar6 = (psj) poyVarM81.b;
                psjVar6.b = 1;
                psjVar6.a = 1;
                return (psj) poyVarM81.j();
            case 243:
                poy poyVarM82 = psj.c.m();
                if (poyVarM82.c) {
                    poyVarM82.m();
                    poyVarM82.c = false;
                }
                psj psjVar7 = (psj) poyVarM82.b;
                psjVar7.b = 1;
                psjVar7.a = 1;
                return (psj) poyVarM82.j();
            case 244:
                poy poyVarM83 = psj.c.m();
                if (poyVarM83.c) {
                    poyVarM83.m();
                    poyVarM83.c = false;
                }
                psj psjVar8 = (psj) poyVarM83.b;
                psjVar8.b = 26;
                psjVar8.a = 1;
                return (psj) poyVarM83.j();
            case 245:
                poy poyVarM84 = psj.c.m();
                poyVarM84.F(2);
                return (psj) poyVarM84.j();
            case 246:
                poy poyVarM85 = psj.c.m();
                poyVarM85.F(2);
                return (psj) poyVarM85.j();
            case 247:
                poy poyVarM86 = psj.c.m();
                poyVarM86.F(2);
                return (psj) poyVarM86.j();
            case 250:
                poy poyVarM87 = psj.c.m();
                if (poyVarM87.c) {
                    poyVarM87.m();
                    poyVarM87.c = false;
                }
                psj psjVar9 = (psj) poyVarM87.b;
                psjVar9.b = 1;
                psjVar9.a = 1;
                return (psj) poyVarM87.j();
            case 251:
                poy poyVarM88 = psj.c.m();
                if (poyVarM88.c) {
                    poyVarM88.m();
                    poyVarM88.c = false;
                }
                psj psjVar10 = (psj) poyVarM88.b;
                psjVar10.b = 1;
                psjVar10.a = 1;
                return (psj) poyVarM88.j();
            case 252:
                poy poyVarM89 = psj.c.m();
                if (poyVarM89.c) {
                    poyVarM89.m();
                    poyVarM89.c = false;
                }
                psj psjVar11 = (psj) poyVarM89.b;
                psjVar11.b = 3;
                psjVar11.a = 1;
                return (psj) poyVarM89.j();
            case 253:
                poy poyVarM90 = psj.c.m();
                if (poyVarM90.c) {
                    poyVarM90.m();
                    poyVarM90.c = false;
                }
                psj psjVar12 = (psj) poyVarM90.b;
                psjVar12.b = 3;
                psjVar12.a = 1;
                return (psj) poyVarM90.j();
            case 254:
                poy poyVarM91 = psj.c.m();
                if (poyVarM91.c) {
                    poyVarM91.m();
                    poyVarM91.c = false;
                }
                psj psjVar13 = (psj) poyVarM91.b;
                psjVar13.b = 3;
                psjVar13.a = 1;
                return (psj) poyVarM91.j();
            case 255:
                poy poyVarM92 = psj.c.m();
                if (poyVarM92.c) {
                    poyVarM92.m();
                    poyVarM92.c = false;
                }
                psj psjVar14 = (psj) poyVarM92.b;
                psjVar14.b = 1;
                psjVar14.a = 1;
                return (psj) poyVarM92.j();
            case 256:
                poy poyVarM93 = psj.c.m();
                if (poyVarM93.c) {
                    poyVarM93.m();
                    poyVarM93.c = false;
                }
                psj psjVar15 = (psj) poyVarM93.b;
                psjVar15.b = 27;
                psjVar15.a = 1;
                return (psj) poyVarM93.j();
            case 257:
                poy poyVarM94 = psj.c.m();
                if (poyVarM94.c) {
                    poyVarM94.m();
                    poyVarM94.c = false;
                }
                psj psjVar16 = (psj) poyVarM94.b;
                psjVar16.b = 28;
                psjVar16.a = 1;
                return (psj) poyVarM94.j();
            case 258:
                poy poyVarM95 = psj.c.m();
                if (poyVarM95.c) {
                    poyVarM95.m();
                    poyVarM95.c = false;
                }
                psj psjVar17 = (psj) poyVarM95.b;
                psjVar17.b = 28;
                psjVar17.a = 1;
                return (psj) poyVarM95.j();
            case 259:
                poy poyVarM96 = psj.c.m();
                if (poyVarM96.c) {
                    poyVarM96.m();
                    poyVarM96.c = false;
                }
                psj psjVar18 = (psj) poyVarM96.b;
                psjVar18.b = 28;
                psjVar18.a = 1;
                return (psj) poyVarM96.j();
            case 260:
                poy poyVarM97 = psj.c.m();
                if (poyVarM97.c) {
                    poyVarM97.m();
                    poyVarM97.c = false;
                }
                psj psjVar19 = (psj) poyVarM97.b;
                psjVar19.b = 1;
                psjVar19.a = 1;
                return (psj) poyVarM97.j();
            case 261:
                poy poyVarM98 = psj.c.m();
                if (poyVarM98.c) {
                    poyVarM98.m();
                    poyVarM98.c = false;
                }
                psj psjVar20 = (psj) poyVarM98.b;
                psjVar20.b = 1;
                psjVar20.a = 1;
                return (psj) poyVarM98.j();
        }
    }

    public static Shader.TileMode h(int i) {
        switch (i) {
            case 1:
                return Shader.TileMode.REPEAT;
            case 2:
                return Shader.TileMode.MIRROR;
            default:
                return Shader.TileMode.CLAMP;
        }
    }

    public static List i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static void j(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    public static int k(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int iMyUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
            AppOpsManager appOpsManagerB = aao.b(context);
            iNoteProxyOpNoThrow = aao.a(appOpsManagerB, strPermissionToOp, Binder.getCallingUid(), packageName);
            if (iNoteProxyOpNoThrow == 0) {
                iNoteProxyOpNoThrow = aao.a(appOpsManagerB, strPermissionToOp, iMyUid, aao.c(context));
            }
        } else {
            iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
        }
        return iNoteProxyOpNoThrow != 0 ? -2 : 0;
    }

    public static /* synthetic */ String l(int i) {
        switch (i) {
            case 1:
                return "REMOVED";
            case 2:
                return "VISIBLE";
            case 3:
                return "GONE";
            case 4:
                return "INVISIBLE";
            default:
                return "null";
        }
    }

    public static int m(int i) {
        switch (i) {
            case 0:
                return 2;
            case 4:
                return 4;
            case 8:
                return 3;
            default:
                throw new IllegalArgumentException("Unknown visibility " + i);
        }
    }

    public static int n(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m(view.getVisibility());
    }

    public static void o(int i, View view) {
        switch (i - 1) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (cu.Q(2)) {
                        String str = "SpecialEffectsController: Removing view " + view + " from container " + viewGroup;
                    }
                    viewGroup.removeView(view);
                }
                break;
            case 1:
                if (cu.Q(2)) {
                    String str2 = "SpecialEffectsController: Setting view " + view + " to VISIBLE";
                }
                view.setVisibility(0);
                break;
            case 2:
                if (cu.Q(2)) {
                    String str3 = "SpecialEffectsController: Setting view " + view + " to GONE";
                }
                view.setVisibility(8);
                break;
            default:
                if (cu.Q(2)) {
                    String str4 = "SpecialEffectsController: Setting view " + view + " to INVISIBLE";
                }
                view.setVisibility(4);
                break;
        }
    }

    public static /* synthetic */ String p(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "ADDING";
            case 3:
                return "REMOVING";
            default:
                return "null";
        }
    }

    public static Intent q(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strS = s(activity);
        if (strS == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strS);
        try {
            return t(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strS + "' in manifest");
            return null;
        }
    }

    public static Intent r(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strT = t(context, componentName);
        if (strT == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strT);
        return t(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String s(Activity activity) {
        try {
            return t(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String t(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    private static int y(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
