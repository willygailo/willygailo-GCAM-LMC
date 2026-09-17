package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public enum dxh {
    NONE(kcx.BADGE, R.string.photo_name, R.string.photo_description, R.drawable.quantum_gm_ic_camera_alt_white_24),
    PANORAMA(kcx.BADGE, R.string.panorama_name, R.string.panorama_description, R.drawable.quantum_gm_ic_vrpano_white_24),
    PHOTOSPHERE(kcx.BADGE, R.string.photosphere_name, R.string.photosphere_description, R.drawable.quantum_ic_photosphere_white_24),
    BURSTS(kcx.BADGE, R.string.burst_name, R.string.burst_description, R.drawable.quantum_gm_ic_burst_mode_white_24),
    PORTRAIT(kcx.BADGE, R.string.portrait_name, R.string.portrait_description, R.drawable.quantum_gm_ic_portrait_white_24),
    NIGHT(kcx.BADGE, R.string.cuttlefish_name, R.string.cuttlefish_description, R.drawable.ic_cuttlefish),
    TIMELAPSE(kcx.BADGE, R.string.mode_timelapse, R.string.cheetah_description, R.drawable.quantum_gm_ic_fast_forward_vd_theme_24),
    MOTION_BLUR(kcx.BADGE, R.string.motion_blur, R.string.motion_blur_description, R.drawable.quantum_gm_ic_motion_blur_white_24),
    CINEMATIC(kcx.BADGE, R.string.cinematic_movements_name, R.string.cinematic_movements_description, R.drawable.quantum_gm_ic_stabilization_pan_vd_theme_24),
    DEBLUR_FUSION(kcx.BADGE, R.string.deblur_fusion, R.string.deblur_fusion_description, R.drawable.ic_face_deblur_24dp),
    SWISS_DOGFOOD(kcx.BADGE, R.string.dogfood_name, R.string.dogfood_description, R.drawable.quantum_gm_ic_dogfood_vd_theme_24),
    DOGFOOD_ONLY(kcx.BADGE, R.string.dogfood_name, R.string.dogfood_description, R.drawable.quantum_gm_ic_dogfood_vd_theme_24);

    public final kcx m;
    public final int n;
    public final int o;
    public final int p;

    dxh(kcx kcxVar, int i, int i2, int i3) {
        this.m = kcxVar;
        this.n = i;
        this.o = i2;
        this.p = i3;
        e(i2, "description");
        e(i3, "icon");
        e(i, "name");
        if (kcxVar.equals(kcx.BADGE)) {
            d(true, "Action activity must be null");
            d(true, "Action description must be null");
            d(true, "Action promotion message must be null");
        } else {
            d(false, "Action activity cannot be null");
            d(false, "Action description cannot be null");
            d(false, "Action promotion message cannot be null");
        }
    }

    public static ojc b(String str) {
        if (oje.d(str)) {
            return oih.a;
        }
        try {
            return ojc.h(a(str));
        } catch (IllegalArgumentException e) {
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length != 2 || !strArrSplit[0].equals("com.google.android.apps.camera.gallery.specialtype.SpecialType")) {
                return oih.a;
            }
            try {
                return ojc.h(a(strArrSplit[1]));
            } catch (IllegalArgumentException | NullPointerException e2) {
                return oih.a;
            }
        }
    }

    private static void d(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    private static void e(int i, String str) {
        d(i != 0, str.concat(" must be a valid resource id"));
    }

    public final String c() {
        String strValueOf = String.valueOf(name());
        return strValueOf.length() != 0 ? "com.google.android.apps.camera.gallery.specialtype.SpecialType-".concat(strValueOf) : new String("com.google.android.apps.camera.gallery.specialtype.SpecialType-");
    }
}
