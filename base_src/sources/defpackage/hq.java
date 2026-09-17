package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.camera.bottombar.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class hq {
    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }

    public static String b(String str) {
        return str.toLowerCase(Locale.US).replaceAll("_", "-");
    }

    public static String c(String str) {
        return str.toUpperCase(Locale.US).replaceAll("-", "_");
    }

    public static String d(int i) {
        switch (i) {
            case 1:
                return "OPEN_CAMERA";
            case 2:
                return "RELEASE";
            case 3:
                return "RECONNECT";
            case 4:
                return "UNLOCK";
            case 5:
                return "LOCK";
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                return "SET_PREVIEW_TEXTURE_ASYNC";
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                return "START_PREVIEW_ASYNC";
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                return "STOP_PREVIEW";
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return "SET_PREVIEW_CALLBACK_WITH_BUFFER";
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                return "ADD_CALLBACK_BUFFER";
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return "SET_PREVIEW_DISPLAY_ASYNC";
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return "SET_PREVIEW_CALLBACK";
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                return "SET_ONE_SHOT_PREVIEW_CALLBACK";
            case 201:
                return "SET_PARAMETERS";
            case 202:
                return "GET_PARAMETERS";
            case 203:
                return "REFRESH_PARAMETERS";
            case 204:
                return "APPLY_SETTINGS";
            case 301:
                return "AUTO_FOCUS";
            case 302:
                return "CANCEL_AUTO_FOCUS";
            case 303:
                return "SET_AUTO_FOCUS_MOVE_CALLBACK";
            case 304:
                return "SET_ZOOM_CHANGE_LISTENER";
            case 305:
                return "CANCEL_AUTO_FOCUS_FINISH";
            case 461:
                return "SET_FACE_DETECTION_LISTENER";
            case 462:
                return "START_FACE_DETECTION";
            case 463:
                return "STOP_FACE_DETECTION";
            case 501:
                return "ENABLE_SHUTTER_SOUND";
            case 502:
                return "SET_DISPLAY_ORIENTATION";
            case 601:
                return "CAPTURE_PHOTO";
            default:
                return "UNKNOWN(" + i + ")";
        }
    }
}
