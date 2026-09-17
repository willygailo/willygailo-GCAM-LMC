package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gsp {
    public static final oor a = oor.s(gtv.FPS_AUTO, new gtl(gtv.FPS_AUTO, R.drawable.quantum_gm_ic_autofps_select_white_24, R.string.fps_auto, R.string.fps_auto_desc), gtv.FPS_24, new gtl(gtv.FPS_24, R.drawable.ic_options_24fps_24px, R.string.fps_24, R.string.fps_24_desc), gtv.FPS_30, new gtl(gtv.FPS_30, R.drawable.quantum_gm_ic_30fps_select_white_24, R.string.fps_30, R.string.fps_30_desc), gtv.FPS_60, new gtl(gtv.FPS_60, R.drawable.quantum_gm_ic_60fps_select_white_24, R.string.fps_60, R.string.fps_60_desc));
    public final gtk b = gtk.a(gtm.HDR, R.string.hdr_desc, R.string.hdr_plus_options_desc, oom.o(new gtl(gtv.HDR_OFF, R.drawable.ic_hdr_off_select_gm2_24px, R.string.hdr_off, R.string.hdr_off_desc), new gtl(gtv.HDR_AUTO, R.drawable.ic_hdr_on_select_gm2_24px, R.string.hdr_on, R.string.hdr_on_desc), new gtl(gtv.HDR_ON, R.drawable.ic_hdr_enhanced_select_gm2_24px, R.string.hdr_enhanced, R.string.hdr_enhanced_desc)));
    public final gtk c = gtk.a(gtm.RAW_OUTPUT, R.string.raw_desc, R.string.raw_output_desc, oom.n(new gtl(gtv.UNSELECTED, R.drawable.ic_raw_off_gm2_24px, R.string.raw_output_off_desc, R.string.raw_output_off_desc), new gtl(gtv.SELECTED, R.drawable.ic_raw_on_gm2_24px, R.string.raw_output_on_desc, R.string.raw_output_on_desc)));
    public final gtk d = d(gtm.BACK_PHOTO_FLASH);
    public final gtk e;
    public final gtk f;
    public final gtk g;
    public final gtk h;
    public final gtk i;
    public final gtk j;
    public final gtk k;
    public final gtk l;
    public final gtk m;
    public final gtk n;
    public final gtk o;
    public final gtk p;
    public final gtk q;
    public final gtk r;
    public final gtk s;
    public final oor t;
    private final ddf u;
    private final lco v;

    public gsp(ddf ddfVar, lco lcoVar, Set set) {
        int i;
        int i2;
        boolean z;
        gtk gtkVarA;
        this.u = ddfVar;
        this.v = lcoVar;
        if (ddfVar.j(ddv.c)) {
            gtkVarA = d(gtm.FRONT_PHOTO_FLASH);
        } else {
            gtm gtmVar = gtm.FRONT_PHOTO_FLASH;
            boolean zC = c();
            int i3 = zC ? R.drawable.quantum_gm_ic_do_not_disturb_white_24 : R.drawable.ic_lightbulb_off;
            ooh oohVar = new ooh();
            oohVar.g(new gtl(gtv.PHOTO_FLASH_OFF, i3, true != zC ? R.string.illumination_off_option_desc : R.string.cam_flash_off_alt, R.string.illumination_off_desc));
            if (zC) {
                oohVar.g(new gtl(gtv.PHOTO_FLASH_NS, R.drawable.ic_catshark_on, R.string.cam_flash_ns, R.string.flash_ns_desc));
                z = false;
                i = R.string.more_light_desc;
                i2 = R.string.more_light_options_desc;
            } else {
                i = R.string.illumination_desc;
                i2 = R.string.illumination_options_desc;
                z = true;
            }
            oohVar.g(new gtl(gtv.PHOTO_FLASH_ON, R.drawable.ic_lightbulb_on, true != z ? R.string.illumination_on_alt : R.string.illumination_on_option_desc, R.string.illumination_on_desc));
            gtkVarA = gtk.a(gtmVar, i, i2, oohVar.f());
        }
        this.e = gtkVarA;
        this.f = e(gtm.NIGHT_FRONT_PHOTO_FLASH);
        this.g = f(gtm.BACK_VIDEO_FLASH);
        this.h = ddfVar.j(ddv.c) ? f(gtm.FRONT_VIDEO_FLASH) : e(gtm.FRONT_VIDEO_FLASH);
        this.i = gtk.a(gtm.MICROVIDEO, R.string.micro_option_desc, R.string.micro_desc, oom.o(new gtl(gtv.MICROVIDEO_OFF, R.drawable.quantum_ic_motion_photos_off_white_24, R.string.micro_off, R.string.micro_off_desc), new gtl(gtv.MICROVIDEO_AUTO, R.drawable.quantum_gm_ic_motion_photos_auto_white_24, R.string.micro_auto, R.string.micro_auto_desc), new gtl(gtv.MICROVIDEO_ON, R.drawable.quantum_ic_motion_photos_on_white_24, R.string.micro_on, R.string.micro_on_desc)));
        this.j = gtk.a(gtm.BEAUTIFICATION, R.string.faceretouch, R.string.faceretouch_desc, oom.o(new gtl(gtv.BEAUTIFICATION_OFF, R.drawable.ic_faceretouch_off, R.string.faceretouch_off_option_desc, R.string.faceretouch_off_acc_desc), new gtl(gtv.BEAUTIFICATION_ON_LIGHT, R.drawable.ic_faceretouch_on_light, R.string.faceretouch_on_light_option_desc, R.string.faceretouch_on_light_acc_desc), new gtl(gtv.BEAUTIFICATION_ON_STRONG, R.drawable.ic_faceretouch_on_strong, R.string.faceretouch_on_strong_option_desc, R.string.faceretouch_on_strong_acc_desc)));
        this.k = gtk.a(gtm.MAKEUP, R.string.makeup_desc, R.string.makeup_desc, oom.p(new gtl(gtv.MAKEUP_OFF, R.drawable.quantum_gm_ic_palette_white_24, R.string.makeup_off_desc, R.string.makeup_off_desc), new gtl(gtv.MAKEUP_MAKEUP1, R.drawable.quantum_gm_ic_palette_white_24, R.string.makeup_makeup1_desc, R.string.makeup_makeup1_desc), new gtl(gtv.MAKEUP_MAKEUP2, R.drawable.quantum_gm_ic_palette_white_24, R.string.makeup_makeup2_desc, R.string.makeup_makeup2_desc), new gtl(gtv.MAKEUP_MAKEUP3, R.drawable.quantum_gm_ic_palette_white_24, R.string.makeup_makeup3_desc, R.string.makeup_makeup3_desc)));
        this.l = gtk.a(gtm.AF, R.string.af_option_desc, R.string.af_desc, oom.o(new gtl(gtv.AF_ON, R.drawable.quantum_gm_ic_center_focus_strong_white_24, R.string.af_on_option_desc, R.string.af_on_acc_desc), new gtl(gtv.AF_OFF_NEAR, R.drawable.quantum_gm_ic_mood_white_24, R.string.af_off_near_desc, R.string.af_off_near_acc_desc), new gtl(gtv.AF_OFF_FAR, R.drawable.quantum_gm_ic_people_white_24, R.string.af_off_far_desc, R.string.af_off_far_acc_desc)));
        ooh oohVar2 = new ooh();
        oohVar2.g(new gtl(gtv.AF_ON, R.drawable.quantum_gm_ic_center_focus_strong_white_24, R.string.af_on_option_desc, R.string.af_on_acc_desc));
        oohVar2.g(new gtl(gtv.AF_OFF_NEAR, R.drawable.quantum_gm_ic_people_white_24, R.string.af_off_near_desc, R.string.af_off_near_acc_desc));
        oohVar2.g(new gtl(gtv.AF_OFF_FAR, R.drawable.quantum_gm_ic_landscape_white_24, R.string.af_off_far_desc, R.string.af_off_far_acc_desc));
        if (ddfVar.k(dde.e)) {
            oohVar2.g(new gtl(gtv.AF_OFF_INFINITY, R.drawable.quantum_gm_ic_landscape_white_24, R.string.af_off_infinity_desc, R.string.af_off_infinity_acc_desc));
        }
        this.m = gtk.a(gtm.AF, R.string.af_option_desc, R.string.af_desc, oohVar2.f());
        this.n = gtk.a(gtm.IMAX_AUDIO, R.string.imax_audio_recording_desc, R.string.imax_audio_recording_desc, oom.n(new gtl(gtv.IMAX_AUDIO_OFF, R.drawable.quantum_gm_ic_mic_off_white_24, R.string.imax_disable_audio_recording, R.string.imax_disable_audio_recording_desc), new gtl(gtv.IMAX_AUDIO_ON, R.drawable.quantum_gm_ic_mic_white_24, R.string.imax_enable_audio_recording, R.string.imax_enable_audio_recording_desc)));
        ooh oohVar3 = new ooh();
        oohVar3.g(new gtl(gtv.ASPECT_RATIO_SIXTEEN_BY_NINE, R.drawable.ic_ratio_full, R.string.sixteen_by_nine, R.string.sixteen_by_nine_desc));
        oohVar3.g(new gtl(gtv.ASPECT_RATIO_FOUR_BY_THREE, R.drawable.ic_ratio_standard, R.string.four_by_three, R.string.four_by_three_desc));
        ddi ddiVar = ddl.a;
        ddfVar.e();
        this.o = gtk.a(gtm.ASPECT_RATIO, R.string.aspect_ratio_desc, R.string.aspect_ratio_desc, oohVar3.f());
        ooh oohVar4 = new ooh();
        oohVar4.g(new gtl(gtv.VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE, R.drawable.ic_ratio_full, R.string.sixteen_by_nine, R.string.sixteen_by_nine_desc));
        oohVar4.g(new gtl(gtv.VIDEO_ASPECT_RATIO_THREE_BY_FOUR, R.drawable.ic_ratio_standard, R.string.three_by_four, R.string.three_by_four_desc));
        this.p = gtk.a(gtm.VIDEO_ASPECT_RATIO, R.string.aspect_ratio_desc, R.string.aspect_ratio_desc, oohVar4.f());
        this.q = gtk.a(gtm.PHOTO_SPHERE, R.string.photosphere_type, R.string.photosphere_type_desc, oom.q(new gtl(gtv.PHOTO_SPHERE, R.drawable.quantum_ic_panorama_photosphere_white_24, R.string.panorama, R.string.panorama_desc), new gtl(gtv.HORIZONTAL_PHOTO_SPHERE, R.drawable.quantum_gm_ic_panorama_horizontal_white_24, R.string.panorama_horizontal, R.string.panorama_horizontal_desc), new gtl(gtv.VERTICAL_PHOTO_SPHERE, R.drawable.quantum_gm_ic_panorama_vertical_white_24, R.string.panorama_vertical, R.string.panorama_vertical_desc), new gtl(gtv.WIDE_ANGLE_PHOTO_SPHERE, R.drawable.quantum_gm_ic_panorama_wide_angle_white_24, R.string.panorama_wide, R.string.panorama_wide_desc), new gtl(gtv.FISH_EYE_PHOTO_SPHERE, R.drawable.quantum_gm_ic_panorama_fish_eye_white_24, R.string.panorama_fish_eye, R.string.panorama_fish_eye_desc)));
        this.r = gtk.a(gtm.ASTRO, R.string.astro_desc, R.string.astro_option_desc, oom.n(new gtl(gtv.ASTRO_OFF, R.drawable.quantum_gm_ic_astrophotography_off_white_24, R.string.astro_off_desc, R.string.astro_off_acc_desc), new gtl(gtv.ASTRO_AUTO, R.drawable.quantum_gm_ic_astrophotography_auto_white_24, R.string.astro_auto_desc, R.string.astro_auto_acc_desc)));
        this.t = oor.o((Map) Collection.EL.stream(set).collect(Collectors.toMap(cgw.p, new cgw(15))));
        this.s = gtk.a(gtm.VIDEO_RESOLUTION, R.string.video_res, R.string.video_res_desc, oom.n(new gtl(gtv.RES_1080P, R.drawable.ic_fhd_24px, R.string.video_res_fhd, R.string.video_res_fhd_desc), new gtl(gtv.RES_2160P, R.drawable.ic_4k_24px, R.string.video_res_4k, R.string.video_res_4k_desc)));
    }

    private final gtk d(gtm gtmVar) {
        int i;
        int i2;
        boolean zC = c();
        int i3 = zC ? R.drawable.quantum_gm_ic_do_not_disturb_white_24 : R.drawable.quantum_gm_ic_flash_off_white_24;
        ooh oohVar = new ooh();
        oohVar.g(new gtl(gtv.PHOTO_FLASH_OFF, i3, true != zC ? R.string.cam_flash_off : R.string.cam_flash_off_alt, R.string.flash_off_desc));
        if (zC) {
            oohVar.g(new gtl(gtv.PHOTO_FLASH_NS, R.drawable.ic_catshark_on, R.string.cam_flash_ns, R.string.flash_ns_desc));
            i = R.string.more_light_desc;
            i2 = R.string.more_light_options_desc;
        } else {
            oohVar.g(new gtl(gtv.PHOTO_FLASH_AUTO, R.drawable.quantum_gm_ic_flash_auto_white_24, R.string.cam_flash_auto, R.string.flash_auto_desc));
            i = R.string.flash_desc;
            i2 = R.string.flash_options_desc;
        }
        oohVar.g(new gtl(gtv.PHOTO_FLASH_ON, R.drawable.quantum_gm_ic_flash_on_white_24, true != zC ? R.string.cam_flash_on : R.string.cam_flash_on_alt, R.string.flash_on_desc));
        return gtk.a(gtmVar, i, i2, oohVar.f());
    }

    private final gtk e(gtm gtmVar) {
        return this.u.j(ddv.c) ? gtk.a(gtmVar, R.string.illumination_desc, R.string.illumination_options_desc, oom.n(new gtl(gtv.VIDEO_FLASH_OFF, R.drawable.ic_lightbulb_off, R.string.illumination_off_option_desc, R.string.illumination_off_desc), new gtl(gtv.VIDEO_FLASH_ON, R.drawable.ic_lightbulb_on, R.string.illumination_on_option_desc, R.string.illumination_on_desc))) : gtk.a(gtmVar, R.string.illumination_desc, R.string.illumination_options_desc, oom.n(new gtl(gtv.VIDEO_FLASH_OFF, R.drawable.ic_lightbulb_off, R.string.illumination_off_option_desc, R.string.illumination_off_desc), new gtl(gtv.VIDEO_FLASH_ON, R.drawable.ic_lightbulb_on, R.string.illumination_on_option_desc, R.string.illumination_on_desc)));
    }

    private static final gtk f(gtm gtmVar) {
        return gtk.a(gtmVar, R.string.flash_desc, R.string.flash_options_desc, oom.n(new gtl(gtv.VIDEO_FLASH_OFF, R.drawable.quantum_gm_ic_flash_off_white_24, R.string.cam_flash_off, R.string.flash_off_desc), new gtl(gtv.VIDEO_FLASH_ON, R.drawable.quantum_gm_ic_flash_on_white_24, R.string.cam_flash_on, R.string.flash_on_desc)));
    }

    public final gtk a(boolean z, String str) {
        if (!this.u.k(dcu.r)) {
            return gtk.a(gtm.MICROPHONE, R.string.ext_mic_desc, R.string.ext_mic_options_desc, oom.n(new gtl(gtv.MIC_INPUT_EXT_WIRED, R.drawable.quantum_ic_mic_external_on_white_24, R.string.ext_mic_on_option_desc, R.string.ext_mic_on_acc_desc), new gtl(gtv.MIC_INPUT_PHONE, R.drawable.quantum_ic_mic_external_off_white_24, R.string.ext_mic_off_option_desc, R.string.ext_mic_off_acc_desc)));
        }
        ooh oohVar = new ooh();
        oohVar.g(new gtl(gtv.MIC_INPUT_PHONE, R.drawable.quantum_gm_ic_mic_white_24, R.string.mic_input_phone_desc, R.string.mic_input_phone_acc_desc));
        if (z) {
            oohVar.g(new gtl(gtv.MIC_INPUT_EXT_WIRED, R.drawable.gm_filled_mic_external_on_white_24, R.string.mic_input_ext_wired_desc, R.string.mic_input_ext_wired_acc_desc));
        }
        if (!str.isEmpty()) {
            oohVar.g(new gtl(gtv.MIC_INPUT_EXT_BLUETOOTH, str, str));
        }
        return gtk.a(gtm.MICROPHONE, R.string.mic_input_desc, R.string.mic_input_options_desc, oohVar.f());
    }

    public final gtk b(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new gtl(gtv.TIMER_ZERO_SECONDS, R.drawable.quantum_gm_ic_timer_off_white_24, R.string.timer_off, R.string.timer_off_desc));
        if (z) {
            arrayList.add(new gtl(gtv.TIMER_AUTO, R.drawable.timer_option_auto_24px, R.string.timer_auto, R.string.timer_auto_desc));
        }
        arrayList.add(new gtl(gtv.TIMER_THREE_SECONDS, R.drawable.quantum_gm_ic_timer_3_alt_1_white_24, R.string.timer_3_seconds, R.string.timer_3_seconds_option_desc));
        arrayList.add(new gtl(gtv.TIMER_TEN_SECONDS, R.drawable.quantum_gm_ic_timer_10_alt_1_white_24, R.string.timer_10_seconds, R.string.timer_10_seconds_option_desc));
        return gtk.a(gtm.TIMER, R.string.timer_desc, R.string.timer_options_desc, oom.j(arrayList));
    }

    public final boolean c() {
        return this.u.k(ddm.aa) && !jrl.IMAGE_INTENT.equals(this.v.fA());
    }
}
