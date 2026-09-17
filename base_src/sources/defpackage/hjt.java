package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class hjt implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public hjt(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static hjt a(qkg qkgVar) {
        return new hjt(qkgVar, 3);
    }

    public static hjt b(qkg qkgVar) {
        return new hjt(qkgVar, 7);
    }

    public static hjt c(qkg qkgVar) {
        return new hjt(qkgVar, 8);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                new hjn();
                ddf ddfVar = (ddf) this.a.get();
                ddi ddiVar = ddl.a;
                ddfVar.c();
                return new hjn();
            case 1:
                return new lbk(new lbi((ScheduledExecutorService) this.a.get(), 10L, TimeUnit.SECONDS));
            case 2:
                return new hkp((hko) this.a.get(), TimeUnit.NANOSECONDS.convert(500L, TimeUnit.MICROSECONDS));
            case 3:
                return new hky(((fub) this.a).get());
            case 4:
                return new hme((hmh) this.a.get());
            case 5:
                ddf ddfVar2 = (ddf) this.a.get();
                ddi ddiVar2 = ddl.a;
                ddfVar2.f();
                orx orxVar = orx.a;
                qmd.ae(orxVar);
                return orxVar;
            case 6:
                return new nox(this.a, null, null, null);
            case 7:
                return new hsl((ljf) this.a.get());
            case 8:
                return new huj((SharedPreferences) this.a.get());
            case 9:
                return ((huh) this.a).get().a("pref_camera_advice_settings", true);
            case 10:
                return ((huh) this.a).get().b("pref_af_mode_back", hte.ON.f);
            case 11:
                return ((huh) this.a).get().b("pref_af_mode_front", hte.ON.f);
            case 12:
                return ((huh) this.a).get().b("pref_camera_beholder_example_percent_key", -1);
            case 13:
                return ((huh) this.a).get().a("pref_camera_coach_key", true);
            case 14:
                return ((huh) this.a).get().c("pref_release_dialog_last_shown_version", "");
            case 15:
                return ((huh) this.a).get().a("pref_exposure_control_key", true);
            case 16:
                return ((huh) this.a).get().a("perf_has_run_first_education", false);
            case 17:
                return ((huh) this.a).get().a("key_ff_opt_in", false);
            case 18:
                return ((huh) this.a).get().a("pref_has_checked_dual_ev_brightness", false);
            case 19:
                return ((huh) this.a).get().a("pref_has_checked_dual_ev_shadow", false);
            default:
                return ((huh) this.a).get().a("pref_has_checked_lens_mode", false);
        }
    }
}
