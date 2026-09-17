package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class huu implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public huu(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return ((huh) this.a).get().a("pref_has_checked_ornament_mode", false);
            case 1:
                return ((huh) this.a).get().a("pref_has_checked_measure_mode", false);
            case 2:
                return ((huh) this.a).get().a("pref_has_checked_tiara_mode", false);
            case 3:
                return ((huh) this.a).get().a("pref_has_checked_gouda_mode", false);
            case 4:
                return ((huh) this.a).get().a("pref_camera_enable_iris", true);
            case 5:
                htp htpVar = ((huh) this.a).get();
                if (!htpVar.a.n("pref_link_first_time_chip_click_ms")) {
                    htpVar.b.f("Initializing default value (0) for key: (pref_link_first_time_chip_click_ms)");
                    htpVar.a.j("pref_link_first_time_chip_click_ms", 0L);
                }
                return new htb(htpVar.a);
            case 6:
                return ((huh) this.a).get().a("pref_has_shown_longp_education", false);
            case 7:
                return new htc(((huh) this.a).get().b("pref_ext_mic_key", hth.PHONE.d));
            case 8:
                return ((huh) this.a).get().b("pref_switch_to_next_mode_command_string", 72);
            case 9:
                return ((huh) this.a).get().a("perf_has_shown_options_bar", false);
            case 10:
                hug hugVar = (hug) this.a.get();
                jdy jdyVar = new jdy((char[]) null, (byte[]) null);
                jdyVar.i(hugVar.b(htu.l));
                jdyVar.i(hugVar.b(htu.m));
                jdyVar.i(hugVar.b(htu.n));
                return jdyVar;
            case 11:
                return ((huh) this.a).get().b("pref_switch_to_previous_mode_command_string", 71);
            case 12:
                return ((huh) this.a).get().a("key_promote_launch_wear", false);
            case 13:
                return ((huh) this.a).get().c("pref_camera_resolution", "full");
            case 14:
                return ((huh) this.a).get().a("perf_has_run_second_education", false);
            case 15:
                return ((huh) this.a).get().b("pref_shutter_command_string", 66);
            case 16:
                return ((huh) this.a).get().b("pref_switch_camera_command_string", 47);
            case 17:
                return new huo(((huh) this.a).get().c("pref_video_aspect_ratio", htk.SIXTEEN_BY_NINE.name()));
            case 18:
                return new hup(((huh) this.a).get().c("pref_video_fps_key", htg.FPS_30.name()));
            case 19:
                return new hup(((huh) this.a).get().c("pref_video_fps_4k_key", htg.FPS_30.name()));
            default:
                return new hup(((huh) this.a).get().c("pref_video_fps_cm_key", htg.FPS_30.name()));
        }
    }
}
