package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.GoogleCameraEngR18F1.R;
import com.mdmitriev.auxlenses.AuxButtonsLayout;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hvb extends hvi {
    private static final ouj b = ouj.h("com/google/android/apps/camera/settings/app/upgrader/AppUpgrader");
    private final Context c;
    private final ddf d;
    private final hur e;
    private final lwf f;

    public hvb(Context context, lwf lwfVar, hur hurVar, ddf ddfVar) {
        super("pref_upgrade_version", 23);
        this.c = context;
        this.f = lwfVar;
        this.d = ddfVar;
        this.e = hurVar;
    }

    private final void e(lwd lwdVar, hub hubVar) {
        String strSwitchToPicturesize;
        lwd lwdVar2 = lwd.FRONT;
        switch (lwdVar) {
            case FRONT:
                strSwitchToPicturesize = "pref_camera_picturesize_front_key";
                break;
            case BACK:
                strSwitchToPicturesize = AuxButtonsLayout.switchToPicturesize();
                break;
            default:
                ((oug) ((oug) b.c()).G((char) 2650)).o("Ignoring attempt to upgrade size of unhandled camera facing direction");
                return;
        }
        lig ligVarBr = mip.br(hubVar.e(strSwitchToPicturesize));
        lvs lvsVarE = this.f.e(lwdVar);
        if (ligVarBr == null || lvsVarE == null || !lhs.h(ligVarBr).k(lhs.a)) {
            return;
        }
        ghx ghxVarA = fvq.A(lvsVarE, this.f, this.d);
        lig ligVarA = hvm.a(null, ghxVarA.x(256), ghxVarA.k());
        if (ligVarA != null) {
            hubVar.k(strSwitchToPicturesize, mip.bt(ligVarA));
        }
    }

    private final void f(hub hubVar, String str) {
        if (hubVar.n(str)) {
            hubVar.k(str, this.c.getString(R.string.pref_camera_video_flashmode_off));
        }
    }

    private final void g(hub hubVar, lwd lwdVar) {
        String strSwitchToPicturesize;
        hubVar.getClass();
        lwdVar.getClass();
        switch (lwdVar) {
            case FRONT:
                strSwitchToPicturesize = "pref_camera_picturesize_front_key";
                break;
            case BACK:
                strSwitchToPicturesize = AuxButtonsLayout.switchToPicturesize();
                break;
            default:
                ((oug) ((oug) b.c()).G((char) 2651)).o("Ignoring attempt to upgrade size of unhandled camera facing direction");
                return;
        }
        lvs lvsVarE = this.f.e(lwdVar);
        if (lvsVarE == null) {
            ((oug) ((oug) b.c()).G((char) 2653)).r("Failed to retrieve a camera id for facing: %s", lwdVar);
            hubVar.g(strSwitchToPicturesize);
            return;
        }
        ghx ghxVarA = fvq.A(lvsVarE, this.f, this.d);
        lig ligVarA = hvm.a(hubVar.e(strSwitchToPicturesize), ghxVarA.x(256), ghxVarA.k());
        if (ligVarA != null) {
            hubVar.k(strSwitchToPicturesize, mip.bt(ligVarA));
        }
    }

    @Override // defpackage.hvi
    public final void a(hub hubVar, int i) {
        String strE;
        Boolean bool;
        boolean z;
        Context context = this.c;
        if (i < 5) {
            SharedPreferences sharedPreferencesD = hubVar.d();
            SharedPreferences sharedPreferencesP = hubVar.p();
            if (sharedPreferencesD.contains(htu.a.a)) {
                String str = htu.a.a;
                Map<String, ?> all = sharedPreferencesD.getAll();
                if (all.containsKey(str) && !(all.get(str) instanceof String)) {
                    String str2 = htu.a.a;
                    try {
                        z = sharedPreferencesD.getBoolean(str2, false);
                    } catch (ClassCastException e) {
                        ((oug) ((oug) ((oug) hvi.a.b()).h(e)).G((char) 2660)).o("error reading old value, removing and returning default");
                        z = false;
                    }
                    sharedPreferencesD.edit().remove(str2).apply();
                    hubVar.l(htu.a.a, z);
                }
            }
            if (sharedPreferencesP.contains("pref_camera_hdr_plus_key") && "on".equals(c(sharedPreferencesP, "pref_camera_hdr_plus_key"))) {
                hubVar.l("pref_camera_hdr_plus_key", true);
            }
        }
        if (i < 2) {
            SharedPreferences sharedPreferencesP2 = hubVar.p();
            if (hubVar.n(htu.a.a)) {
                if (!hubVar.m(htu.a.a)) {
                    hubVar.g(htu.a.a);
                }
            } else if (sharedPreferencesP2.contains(htu.a.a) && "on".equals(c(sharedPreferencesP2, htu.a.a))) {
                hubVar.l(htu.a.a, true);
            }
        }
        if (i < 3) {
            g(hubVar, lwd.FRONT);
            g(hubVar, lwd.BACK);
        }
        if (i < 8 && hubVar.n("pref_camera_hdr_plus_key")) {
            String strE2 = hubVar.e("pref_camera_hdr_plus_key");
            if ("1".equals(strE2)) {
                bool = Boolean.TRUE;
            } else {
                bool = "0".equals(strE2) ? Boolean.FALSE : null;
            }
            if (bool != null) {
                hubVar.k("pref_camera_hdr_plus_key", true != bool.booleanValue() ? "off" : "on");
            }
        }
        if (i < 9 && hubVar.n("pref_camera_hdr_plus_key") && (strE = hubVar.e("pref_camera_hdr_plus_key")) != null && !strE.equals("on") && !strE.equals("off") && !strE.equals("auto")) {
            hubVar.g("pref_camera_hdr_plus_key");
        }
        if (i < 12) {
            e(lwd.FRONT, hubVar);
            e(lwd.BACK, hubVar);
        }
        if (i < 13 && hubVar.n("pref_camera_flashmode_key")) {
            String strE3 = hubVar.e("pref_camera_flashmode_key");
            hubVar.k(htu.i.a, strE3);
            hubVar.k(htu.j.a, strE3);
            hubVar.g("pref_camera_flashmode_key");
        }
        if (i < 14) {
            if (hubVar.n("pref_camera_video_flashmode_key")) {
                String strE4 = hubVar.e("pref_camera_video_flashmode_key");
                hubVar.k(htu.l.a, strE4);
                hubVar.k(htu.m.a, strE4);
                hubVar.g("pref_camera_video_flashmode_key");
            }
            String str3 = htu.o.a;
            if (hubVar.n("pref_camera_video_flashmode_thermally_disabled_key")) {
                hubVar.k(str3, hubVar.e("pref_camera_video_flashmode_thermally_disabled_key"));
                hubVar.g("pref_camera_video_flashmode_thermally_disabled_key");
            }
        }
        if (i < 16 && this.d.k(ddl.O)) {
            String str4 = htu.i.a;
            if (hubVar.n(str4)) {
                hubVar.k(str4, this.c.getString(R.string.pref_camera_video_flashmode_off));
            }
        }
        if (i < 17) {
            f(hubVar, htu.j.a);
            f(hubVar, htu.i.a);
        }
        if (i < 18 && !this.d.j(ddv.c) && gqt.AUTO.d.equals(hubVar.e(htu.j.a))) {
            f(hubVar, htu.j.a);
        }
        if (i < 19 && hubVar.n("pref_camera_dynamic_depth_enabled_key")) {
            hubVar.l("pref_camera_dynamic_depth_enabled_key", false);
        }
        if (i < 20) {
            String str5 = htu.s.a;
            String strE5 = hubVar.e("pref_video_quality_back_key");
            if (strE5 != null && strE5.contentEquals(context.getString(R.string.pref_video_quality_large)) && !hubVar.n(str5)) {
                hubVar.l(str5, true);
            }
        }
        if (i < 21) {
            String str6 = htu.s.a;
            boolean zM = hubVar.m(str6);
            hubVar.g(str6);
            if (zM) {
                this.e.fB(htl.RES_2160P);
            }
        }
        if (i < 22 && this.d.k(ddm.aa)) {
            hubVar.k(htu.j.a, "ns");
            hubVar.k(htu.i.a, "ns");
        }
        if (i >= 23 || this.d.k(ddl.L)) {
            return;
        }
        hubVar.k("pref_video_fps_p2018_key", htg.FPS_30.name());
        hubVar.k("pref_video_resolution", htl.RES_1080P.name());
    }

    @Override // defpackage.hvi
    protected final int b(hub hubVar) {
        SharedPreferences sharedPreferencesD = hubVar.d();
        if (sharedPreferencesD.contains("pref_strict_upgrade_version")) {
            Object obj = sharedPreferencesD.getAll().get("pref_strict_upgrade_version");
            sharedPreferencesD.edit().remove("pref_strict_upgrade_version").apply();
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        return super.b(hubVar);
    }
}
