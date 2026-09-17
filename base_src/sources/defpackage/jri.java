package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jri {
    private static final Map a;
    private final int b;
    private final int c;
    private final int d;

    static {
        oon oonVarM = oor.m();
        oonVarM.e(jrl.UNINITIALIZED, new jri(0, 0, 0));
        oonVarM.e(jrl.PHOTO, new jri(R.string.mode_camera, R.string.mode_camera_desc, R.drawable.quantum_gm_ic_camera_alt_vd_theme_24));
        oonVarM.e(jrl.VIDEO, new jri(R.string.mode_video, R.string.mode_video_desc, R.drawable.quantum_gm_ic_videocam_vd_theme_24));
        oonVarM.e(jrl.IMAX, new jri(R.string.mode_panorama, R.string.mode_panorama_desc, R.drawable.quantum_gm_ic_vrpano_vd_theme_24));
        oonVarM.e(jrl.PHOTO_SPHERE, new jri(R.string.mode_photosphere, R.string.mode_photosphere_desc, R.drawable.quantum_ic_photosphere_vd_theme_24));
        oonVarM.e(jrl.SLOW_MOTION, new jri(R.string.mode_video_slomo, R.string.mode_video_slomo_desc, R.drawable.quantum_gm_ic_slow_motion_video_vd_theme_24));
        oonVarM.e(jrl.MOTION_BLUR, new jri(R.string.mode_motion_blur, R.string.mode_motion_blur_desc, R.drawable.quantum_gm_ic_motion_blur_white_24));
        oonVarM.e(jrl.PORTRAIT, new jri(R.string.mode_portrait, R.string.mode_portrait_desc, R.drawable.quantum_gm_ic_portrait_vd_theme_24));
        oonVarM.e(jrl.IMAGE_INTENT, new jri(R.string.mode_camera, R.string.mode_camera_desc, R.drawable.quantum_gm_ic_camera_alt_vd_theme_24));
        oonVarM.e(jrl.VIDEO_INTENT, new jri(R.string.mode_video, R.string.mode_video_desc, R.drawable.quantum_gm_ic_videocam_vd_theme_24));
        oonVarM.e(jrl.ORNAMENT, new jri(R.string.mode_ornament, R.string.mode_ornament_desc, R.drawable.ic_playground_dark_24));
        oonVarM.e(jrl.MEASURE, new jri(R.string.mode_measure, R.string.mode_measure_desc, R.drawable.ic_measure_dark_24));
        oonVarM.e(jrl.LENS, new jri(R.string.mode_lens, R.string.mode_lens_desc, R.drawable.quantum_ic_google_lens_new_vd_theme_24));
        oonVarM.e(jrl.TIARA, new jri(R.string.mode_photobooth, R.string.mode_photobooth_desc, R.drawable.ic_photobooth_mode));
        oonVarM.e(jrl.LONG_EXPOSURE, new jri(R.string.mode_cuttlefish, R.string.mode_cuttlefish_desc, R.drawable.ic_cuttlefish));
        oonVarM.e(jrl.TIME_LAPSE, new jri(R.string.mode_timelapse, R.string.mode_cheetah_desc, R.drawable.quantum_gm_ic_fast_forward_vd_theme_24));
        oonVarM.e(jrl.SETTINGS, new jri(R.string.mode_settings, R.string.settings_open_desc, R.drawable.quantum_gm_ic_settings_vd_theme_24));
        oonVarM.e(jrl.MORE_MODES, new jri(R.string.modes, R.string.more_modes_desc, R.drawable.navigation_empty_icon));
        oonVarM.e(jrl.REWIND, new jri(R.string.mode_rewind, R.string.mode_rewind_desc, R.drawable.quantum_ic_fast_rewind_vd_theme_24));
        a = oonVarM.c();
    }

    public jri(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static jri b(jrl jrlVar) {
        jri jriVar = (jri) a.get(jrlVar);
        jriVar.getClass();
        return jriVar;
    }

    public static boolean e(jrl jrlVar) {
        return ope.I(jrl.PORTRAIT, jrl.PHOTO).contains(jrlVar);
    }

    public static int f(jrl jrlVar) {
        jrl jrlVar2 = jrl.UNINITIALIZED;
        switch (jrlVar.ordinal()) {
            case 1:
                return 2;
            case 2:
                return 9;
            case 3:
                return 23;
            case 4:
                return 6;
            case 5:
                return 24;
            case 6:
                return 22;
            case 7:
                return 20;
            case 8:
                return 21;
            case 9:
                return 25;
            case 10:
                return 26;
            case 11:
                return 36;
            case 12:
                return 29;
            case 13:
                return 11;
            case 14:
                return 13;
            case 15:
                return 28;
            case 16:
                return 31;
            case 17:
            default:
                return 1;
            case 18:
                return 27;
        }
    }

    public final Drawable a(Resources resources) {
        return resources.getDrawable(this.d, null);
    }

    public final String c(Resources resources) {
        return resources.getString(this.c);
    }

    public final String d(Resources resources) {
        return resources.getString(this.b);
    }
}
