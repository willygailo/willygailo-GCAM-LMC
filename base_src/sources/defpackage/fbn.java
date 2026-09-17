package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.legacy.app.settings.CameraMaterialSettingsActivity;
import com.google.android.apps.camera.ui.preference.MaterialKeyListenerPreference;
import com.google.android.apps.camera.ui.preference.MaterialManagedSwitchPreference;
import com.google.android.apps.camera.ui.preference.MaterialStorageStatusPreference;
import j$.util.Collection;
import j$.util.function.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class fbn extends agy implements SharedPreferences.OnSharedPreferenceChangeListener {
    public fbq ab;
    public MaterialManagedSwitchPreference ac;
    private String ad;
    private MaterialManagedSwitchPreference ae;
    private lap af;
    private final HashMap ag = new HashMap();

    private final PreferenceScreen am(PreferenceGroup preferenceGroup, String str) {
        PreferenceScreen preferenceScreenAm;
        if ((preferenceGroup instanceof PreferenceScreen) && str.equals(preferenceGroup.t)) {
            return (PreferenceScreen) preferenceGroup;
        }
        for (int i = 0; i < preferenceGroup.k(); i++) {
            Preference preferenceO = preferenceGroup.o(i);
            if ((preferenceO instanceof PreferenceGroup) && (preferenceScreenAm = am((PreferenceGroup) preferenceO, str)) != null) {
                return preferenceScreenAm;
            }
        }
        return null;
    }

    private final void an(PreferenceGroup preferenceGroup) {
        for (int i = 0; i < preferenceGroup.k(); i++) {
            Preference preferenceO = preferenceGroup.o(i);
            if (preferenceO instanceof PreferenceGroup) {
                an((PreferenceGroup) preferenceO);
            }
        }
    }

    private final void ao(String str) {
        PreferenceGroup preferenceGroup;
        Preference preferenceA = a(str);
        if (preferenceA == null || (preferenceGroup = preferenceA.D) == null) {
            return;
        }
        boolean zAf = preferenceGroup.af(preferenceA);
        preferenceGroup.A();
        if (zAf) {
            return;
        }
        ((oug) ((oug) CameraMaterialSettingsActivity.k.c()).G((char) 1616)).r("Failed to remove preference :%s", str);
    }

    private final void ap(String str) {
        Preference preferenceA = a(str);
        if (preferenceA instanceof PreferenceScreen) {
            PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceA;
            by byVarW = w();
            byVarW.getClass();
            Intent intent = new Intent(byVarW, (Class<?>) CameraMaterialSettingsActivity.class);
            intent.putExtra("pref_screen_extra", preferenceScreen.t);
            intent.putExtra("pref_screen_title", preferenceScreen.q);
            preferenceScreen.u = intent;
        }
    }

    @Override // defpackage.bu
    public final void H(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        PreferenceCategory preferenceCategory = (PreferenceCategory) a("pref_category_resolution_camera");
        if (preferenceCategory != null) {
            an(preferenceCategory);
        }
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) a("pref_category_resolution_video");
        if (preferenceCategory2 != null) {
            an(preferenceCategory2);
        }
        if (!this.ab.u.contains("pref_category_custom_hotkeys") && (preferenceScreen = (PreferenceScreen) a("pref_category_custom_hotkeys")) != null) {
            for (int i = 0; i < preferenceScreen.k(); i++) {
                Preference preferenceO = preferenceScreen.o(i);
                String string = preferenceO.q().getString(preferenceO.t, "-1");
                if (!this.ag.containsKey(preferenceO.t)) {
                    this.ag.put(preferenceO.t, string);
                }
            }
        }
        super.H(bundle);
    }

    @Override // defpackage.bu
    public final void I(int i, int i2, Intent intent) {
        super.I(i, i2, intent);
        if (i == 2) {
            by byVarW = w();
            byVarW.getClass();
            NotificationManager notificationManager = (NotificationManager) byVarW.getSystemService("notification");
            if (notificationManager == null || !notificationManager.isNotificationPolicyAccessGranted()) {
                return;
            }
            ao("pref_dnd_access_needed");
        }
    }

    @Override // defpackage.bu
    public final void J() {
        super.J();
        this.af.close();
    }

    @Override // defpackage.bu
    public final void K() {
        super.K();
        k().q().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // defpackage.bu
    public final void L() {
        String string;
        super.L();
        by byVarW = w();
        byVarW.getClass();
        ap("pref_category_advanced");
        ap("pref_category_gestures");
        ap("pref_category_developer");
        ap("pref_category_social_share");
        ap("pref_category_frequent_faces");
        ap("pref_category_storage");
        PreferenceScreen preferenceScreen = (PreferenceScreen) a("pref_category_social_share");
        if (preferenceScreen != null) {
            idk idkVar = this.ab.c;
            if (((Boolean) idkVar.c.c(htu.z)).booleanValue()) {
                ArrayList<String> arrayList = new ArrayList();
                oom oomVarB = idkVar.b(idkVar.e.d("image/*"), idkVar.e.d("video/*"));
                int size = oomVarB.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((ResolveInfo) oomVarB.get(i)).activityInfo.applicationInfo.loadLabel(idkVar.j).toString());
                }
                string = "";
                boolean z = false;
                for (String str : arrayList) {
                    if (z) {
                        string = String.valueOf(string).concat(", ");
                    }
                    String strValueOf = String.valueOf(string);
                    String strValueOf2 = String.valueOf(str);
                    string = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                    z = true;
                }
            } else {
                string = idkVar.a.getResources().getString(R.string.social_share_off);
            }
            preferenceScreen.n(string);
        }
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) a("pref_category_frequent_faces");
        if (preferenceScreen2 != null) {
            dwd dwdVar = this.ab.i;
            preferenceScreen2.n(dwdVar.a.getResources().getString(true != ((Boolean) dwdVar.b.fA()).booleanValue() ? R.string.frequent_faces_off : R.string.frequent_faces_on));
        }
        if (!this.ab.u.contains("pref_category_custom_hotkeys")) {
            ap("pref_category_custom_hotkeys");
        }
        Preference preferenceA = a("pref_category_gestures");
        if (preferenceA != null) {
            preferenceA.n(a(htu.e.a) != null ? t().getString(R.string.pref_gestures_summary, t().getString(R.string.pref_camera_volume_key_action_title), t().getString(R.string.pref_camera_double_tap_action_title)) : t().getString(R.string.pref_camera_volume_key_action_title));
        }
        Preference preferenceA2 = a("pref_category_storage");
        if (preferenceA2 != null) {
            preferenceA2.n(t().getString(R.string.pref_storage_summary, t().getString(R.string.pref_low_storage_mode), t().getString(R.string.pref_free_up_space)));
        }
        ListPreference listPreference = (ListPreference) a(htu.c.a);
        if (listPreference != null) {
            listPreference.n(listPreference.g[listPreference.k(listPreference.i)]);
            listPreference.M(new fbi(this, 2));
        }
        Preference preferenceA3 = a("pref_launch_help");
        if (preferenceA3 != null) {
            preferenceA3.o = new fbk(byVarW, 1);
        }
        Preference preferenceA4 = a("pref_launch_feedback");
        if (preferenceA4 != null) {
            preferenceA4.o = new fbk(byVarW, 0);
        }
        Preference preferenceA5 = a("pref_dnd_access_needed");
        if (preferenceA5 != null) {
            preferenceA5.o = new fbl(this, 0);
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) a("pref_category_resolution_camera");
        if (preferenceCategory != null) {
            Preference preferenceL = preferenceCategory.l("pref_camera_resolution");
            Preference preferenceL2 = preferenceCategory.l("pref_camera_selfie_mirror_key");
            preferenceCategory.ac();
            if (preferenceL != null) {
                preferenceCategory.ag(preferenceL);
            }
            if (preferenceL2 != null) {
                preferenceCategory.ag(preferenceL2);
            }
        }
        k().q().registerOnSharedPreferenceChangeListener(this);
        if (!al()) {
            ak();
        }
        MaterialManagedSwitchPreference materialManagedSwitchPreference = this.ae;
        if (materialManagedSwitchPreference != null) {
            materialManagedSwitchPreference.I(true);
        }
    }

    public final void ak() {
        this.ab.s.l(htu.a.a, false);
        this.ac.k(false);
    }

    public final boolean al() {
        by byVarW = w();
        byVarW.getClass();
        if (byVarW.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return true;
        }
        by byVarW2 = w();
        byVarW2.getClass();
        return byVarW2.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.agy, defpackage.bu
    public final void gA(Bundle bundle) {
        by byVar;
        Bundle bundle2;
        CharSequence string;
        MaterialManagedSwitchPreference materialManagedSwitchPreference;
        PreferenceScreen preferenceScreen;
        PreferenceScreen preferenceScreen2;
        PreferenceScreen preferenceScreen3;
        PreferenceScreen preferenceScreen4;
        MaterialManagedSwitchPreference materialManagedSwitchPreference2;
        final MaterialManagedSwitchPreference materialManagedSwitchPreference3;
        int i;
        super.gA(bundle);
        by byVarW = w();
        Context contextR = r();
        if (byVarW == null || contextR == null) {
            return;
        }
        euv euvVarD = ((ewc) byVarW.getApplication()).d();
        this.af = new lap();
        khx khxVar = new khx(byVarW, (char[]) null);
        ewb ewbVar = ((ewb) euvVarD).d;
        elc elcVar = new elc((qkg) new fbr(khxVar, null, null), ewbVar.az, ewbVar.i, 10, (int[]) null);
        lwf lwfVar = (lwf) ewbVar.ac.get();
        ddf ddfVar = (ddf) ewbVar.i.get();
        Context context = khxVar.a;
        djn djnVar = new djn(context);
        idk idkVar = new idk(khxVar.a, (hub) ewbVar.v.get(), (huf) ewbVar.az.get(), (hug) ewbVar.az.get(), (idt) ewbVar.fd.get(), (fjs) ewbVar.t.get());
        lar larVar = (lar) ewbVar.o.get();
        gqy gqyVar = (gqy) ewbVar.bL.get();
        orx orxVar = orx.a;
        orx orxVar2 = orx.a;
        orx orxVar3 = orx.a;
        lda ldaVar = (lda) ewbVar.dy.get();
        fjs fjsVar = (fjs) ewbVar.t.get();
        lda ldaVar2 = (lda) ewbVar.dA.get();
        lda ldaVar3 = (lda) ewbVar.fr.get();
        dwd dwdVar = new dwd(ewbVar.c.b, (lda) ewbVar.bt.get(), (fjs) ewbVar.t.get());
        ila ilaVar = new ila(hcv.b((lda) ewbVar.dA.get(), (lda) ewbVar.dQ.get(), (lda) ewbVar.dK.get(), (lda) ewbVar.Y.get(), (hur) ewbVar.dI.get(), (huq) ewbVar.dH.get(), (huf) ewbVar.az.get(), (hug) ewbVar.az.get()), (ilx) ewbVar.eq.get(), new ilg((lda) ewbVar.dA.get(), (lda) ewbVar.dQ.get(), (lda) ewbVar.dK.get(), (hur) ewbVar.dI.get(), (huq) ewbVar.dH.get(), (huf) ewbVar.az.get()), (ScheduledExecutorService) ewbVar.j.get(), (lar) ewbVar.o.get(), (fjs) ewbVar.t.get());
        pyn pynVarA = pyr.a(elcVar);
        nvb nvbVar = (nvb) ewbVar.cZ.get();
        hub hubVar = (hub) ewbVar.v.get();
        hug hugVar = (hug) ewbVar.az.get();
        boolean zA = ewbVar.A();
        ojc ojcVarM = ewbVar.m();
        ewbVar.n();
        final fbq fbqVar = new fbq(lwfVar, ddfVar, djnVar, idkVar, larVar, gqyVar, orxVar, orxVar2, orxVar3, ldaVar, fjsVar, ldaVar2, ldaVar3, dwdVar, ilaVar, pynVarA, nvbVar, hubVar, hugVar, zA, ojcVarM, null, null);
        this.ab = fbqVar;
        int i2 = 0;
        boolean z = false;
        for (lwd lwdVar : lwd.values()) {
            if (fbqVar.x.j(lwdVar)) {
                lvs lvsVarE = fbqVar.x.e(lwdVar);
                lvsVarE.getClass();
                z = z || fbqVar.x.f(lvsVarE).M();
            }
        }
        if (fbqVar.a.k(ddm.X)) {
            fbqVar.u.add("pref_camera_hdrplus_option_available_key");
        } else {
            fbqVar.v.add(fbqVar.o.a(new lij() { // from class: fbo
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    fbq fbqVar2 = fbqVar;
                    if (((Boolean) obj).booleanValue()) {
                        return;
                    }
                    fbqVar2.e.fB(gqx.AUTO);
                }
            }, fbqVar.d));
        }
        String str = "pref_camera_raw_output_option_available_key";
        if (!fbqVar.a.k(ddu.r)) {
            fbqVar.u.add("pref_camera_raw_output_option_available_key");
        }
        if (!fbqVar.a.k(dcv.b)) {
            fbqVar.u.add("pref_camera_coach_key");
        }
        ddf ddfVar2 = fbqVar.a;
        ddi ddiVar = dcs.a;
        ddfVar2.c();
        if (!fbqVar.a.k(ddl.aQ)) {
            List list = fbqVar.u;
        }
        fbqVar.a.f();
        List list2 = fbqVar.u;
        if (!z) {
            List list3 = fbqVar.u;
            String str2 = htu.q.a;
        }
        if (!fbqVar.a.k(dcu.o) || !fbqVar.y.c()) {
            List list4 = fbqVar.u;
            String str3 = htu.r.a;
        }
        fbqVar.x.i();
        if (1 == 0) {
            fbqVar.m.e(htu.g, true);
            List list5 = fbqVar.u;
            String str4 = htu.g.a;
        }
        fbqVar.a.b();
        List list6 = fbqVar.u;
        if (!fbqVar.a.k(ddl.aV) && !fbqVar.a.k(ddl.aW)) {
            List list7 = fbqVar.u;
        }
        if (!fbqVar.a.k(ddd.a)) {
            List list8 = fbqVar.u;
        }
        String str5 = "pref_camera_kepler_enabled_key";
        if (!fbqVar.a.k(ddm.ak)) {
            List list9 = fbqVar.u;
        }
        if (!fbqVar.a.k(ddl.bo)) {
            List list10 = fbqVar.u;
        }
        PackageManager packageManager = contextR.getPackageManager();
        if (packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_COARSE_LOCATION", contextR.getPackageName()) || packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_FINE_LOCATION", contextR.getPackageName())) {
            List list11 = fbqVar.u;
            String str6 = htu.a.a;
        }
        if (!fbqVar.a.k(ddl.aH)) {
            List list12 = fbqVar.u;
        }
        NotificationManager notificationManager = (NotificationManager) contextR.getSystemService("notification");
        if (fbqVar.t || (notificationManager != null && notificationManager.isNotificationPolicyAccessGranted())) {
            List list13 = fbqVar.u;
        }
        if (!fbqVar.a.k(ddl.K)) {
            fbqVar.r.fB(false);
            List list14 = fbqVar.u;
        }
        Set set = fbqVar.k;
        Set set2 = fbqVar.k;
        Set set3 = fbqVar.k;
        String str7 = htu.r.a;
        if (!fbqVar.a.k(ddl.bn)) {
            ddf ddfVar3 = fbqVar.a;
            ddg ddgVar = dds.a;
            ddfVar3.f();
            List list15 = fbqVar.u;
            String str8 = htu.e.a;
        }
        if (!fbqVar.a.k(deh.a)) {
            fbqVar.u.add("pref_chameleon_control_key");
        }
        oti otiVarListIterator = ((orx) fbqVar.f).listIterator();
        while (otiVarListIterator.hasNext()) {
            hve hveVar = (hve) otiVarListIterator.next();
            if (((String) hveVar.h().get(i2)).equals("PhotoResolution")) {
                ListPreference listPreference = new ListPreference(contextR);
                listPreference.Q(hveVar.e());
                listPreference.g = listPreference.j.getResources().getTextArray(hveVar.a());
                listPreference.h = listPreference.j.getResources().getTextArray(hveVar.b());
                listPreference.L(hveVar.g());
                listPreference.x = hveVar.f();
                listPreference.J(hveVar.c());
                listPreference.O(hveVar.d());
                listPreference.A = R.layout.preference_with_margin;
                listPreference.N(3);
                fbqVar.w.l("pref_category_resolution_camera", listPreference);
                i2 = 0;
            } else {
                i2 = 0;
            }
        }
        oti otiVarListIterator2 = ((orx) fbqVar.g).listIterator();
        while (otiVarListIterator2.hasNext()) {
            hvf hvfVar = (hvf) otiVarListIterator2.next();
            if (((String) hvfVar.e().get(0)).equals("Advanced")) {
                SwitchPreference switchPreference = new SwitchPreference(contextR);
                switchPreference.Q(hvfVar.b());
                switchPreference.O(hvfVar.a());
                switchPreference.L(hvfVar.d());
                switchPreference.x = hvfVar.c();
                MaterialManagedSwitchPreference materialManagedSwitchPreference4 = new MaterialManagedSwitchPreference(contextR);
                materialManagedSwitchPreference4.x = true;
                materialManagedSwitchPreference4.L(switchPreference.t);
                materialManagedSwitchPreference4.n(switchPreference.m());
                materialManagedSwitchPreference4.R(switchPreference.q);
                if (switchPreference.s == null && (i = switchPreference.r) != 0) {
                    switchPreference.s = jr.b(switchPreference.j, i);
                }
                materialManagedSwitchPreference4.K(switchPreference.s);
                materialManagedSwitchPreference4.e = switchPreference.n;
                materialManagedSwitchPreference4.N(switchPreference.p);
                materialManagedSwitchPreference4.A = R.layout.preference_with_margin;
                fbqVar.w.l("pref_category_advanced", materialManagedSwitchPreference4);
            }
        }
        List list16 = fbqVar.u;
        List list17 = this.ab.u;
        Bundle bundle3 = this.l;
        if (bundle3 != null) {
            this.ad = bundle3.getString("pref_screen_extra");
        }
        ahj ahjVar = this.a;
        if (ahjVar == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextR2 = r();
        PreferenceScreen preferenceScreenK = k();
        ahjVar.f(true);
        int i3 = ahf.a;
        Object[] objArr = new Object[2];
        String[] strArr = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};
        XmlResourceParser xml = contextR2.getResources().getXml(R.xml.camera_material_preferences);
        try {
            Preference preferenceA = ahf.a(xml, preferenceScreenK, contextR2, objArr, ahjVar, strArr);
            xml.close();
            PreferenceScreen preferenceScreen5 = (PreferenceScreen) preferenceA;
            preferenceScreen5.C(ahjVar);
            ahjVar.f(false);
            ahj ahjVar2 = this.a;
            PreferenceScreen preferenceScreen6 = ahjVar2.b;
            if (preferenceScreen5 != preferenceScreen6) {
                if (preferenceScreen6 != null) {
                    preferenceScreen6.D();
                }
                ahjVar2.b = preferenceScreen5;
                if (preferenceScreen5 != null) {
                    this.c = true;
                    if (this.d && !this.aa.hasMessages(1)) {
                        this.aa.obtainMessage(1).sendToTarget();
                    }
                }
            }
            PreferenceScreen preferenceScreen7 = (PreferenceScreen) a("prefscreen_top");
            if (preferenceScreen7 != null) {
                oti otiVarListIterator3 = ((orx) this.ab.h).listIterator();
                while (otiVarListIterator3.hasNext()) {
                    hvc hvcVar = (hvc) otiVarListIterator3.next();
                    PreferenceCategory preferenceCategory = new PreferenceCategory(preferenceScreen7.j);
                    preferenceCategory.Q(hvcVar.b());
                    preferenceCategory.L(hvcVar.c());
                    preferenceCategory.N(hvcVar.a());
                    ((PreferenceGroup) preferenceCategory).c = true;
                    preferenceScreen7.ag(preferenceCategory);
                    for (hvd hvdVar : hvcVar.d()) {
                        PreferenceScreen preferenceScreen8 = preferenceScreen7;
                        Preference preference = new Preference(preferenceCategory.j);
                        preference.Q(hvdVar.b());
                        preference.L(hvdVar.d());
                        preference.n(hvdVar.e());
                        preference.J(hvdVar.a());
                        Intent intentC = hvdVar.c();
                        if (intentC != null) {
                            preference.u = intentC;
                        }
                        preference.A = R.layout.preference_with_margin;
                        preferenceCategory.ag(preference);
                        preferenceScreen7 = preferenceScreen8;
                    }
                    preferenceScreen7 = preferenceScreen7;
                }
            }
            Iterator it = this.ab.v.iterator();
            while (it.hasNext()) {
                this.af.c((lie) it.next());
            }
            if (!list17.contains("pref_audio_zoom_key") && (materialManagedSwitchPreference3 = (MaterialManagedSwitchPreference) a("pref_audio_zoom_key")) != null) {
                materialManagedSwitchPreference3.e = new agm() { // from class: fbj
                    @Override // defpackage.agm
                    public final boolean b(Preference preference2, Object obj) {
                        this.a.ab.p.p(preference2.t, Boolean.valueOf(((TwoStatePreference) materialManagedSwitchPreference3).a), obj);
                        return true;
                    }
                };
            }
            if (!list17.contains("pref_camera_enable_iris") && (materialManagedSwitchPreference2 = (MaterialManagedSwitchPreference) a("pref_camera_enable_iris")) != null) {
                materialManagedSwitchPreference2.n(E(true != CameraMaterialSettingsActivity.l ? R.string.pref_camera_lens_subtitle_legacy : R.string.pref_camera_lens_subtitle_p21));
            }
            Preference preferenceA2 = a(htu.a.a);
            preferenceA2.getClass();
            MaterialManagedSwitchPreference materialManagedSwitchPreference5 = (MaterialManagedSwitchPreference) preferenceA2;
            this.ac = materialManagedSwitchPreference5;
            materialManagedSwitchPreference5.e = new fbi(this, 1);
            Iterator it2 = list17.iterator();
            while (it2.hasNext()) {
                ao((String) it2.next());
            }
            if (!list17.contains("pref_category_developer") && (preferenceScreen4 = (PreferenceScreen) a("pref_category_developer")) != null) {
                this.ab.b.a(preferenceScreen4);
            }
            if (list17.contains("pref_category_social_share") || (preferenceScreen3 = (PreferenceScreen) a("pref_category_social_share")) == null) {
                bundle3 = bundle3;
                str = "pref_camera_raw_output_option_available_key";
                str5 = "pref_camera_kepler_enabled_key";
            } else {
                final idk idkVar2 = this.ab.c;
                idkVar2.l = preferenceScreen3;
                idkVar2.e.f();
                if (!((Boolean) idkVar2.c.c(htu.B)).booleanValue() && !((Boolean) idkVar2.c.c(htu.C)).booleanValue()) {
                    if (idkVar2.e.j("image/*") || idkVar2.e.j("video/*")) {
                        idkVar2.d.e(htu.z, true);
                    } else {
                        idkVar2.d.e(htu.z, false);
                    }
                    idkVar2.c.c(htu.z);
                }
                boolean zBooleanValue = ((Boolean) idkVar2.c.c(htu.z)).booleanValue();
                final MaterialManagedSwitchPreference materialManagedSwitchPreference6 = (MaterialManagedSwitchPreference) preferenceScreen3.l(htu.z.a);
                if (materialManagedSwitchPreference6 != null) {
                    materialManagedSwitchPreference6.R(idkVar2.c(zBooleanValue));
                    int iX = ohh.X(idkVar2.a, R.attr.colorOnPrimary, -1);
                    materialManagedSwitchPreference6.i = Integer.valueOf(iX);
                    materialManagedSwitchPreference6.f = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{iX, iX});
                    materialManagedSwitchPreference6.g = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{iX, iX});
                    materialManagedSwitchPreference6.h = Integer.valueOf(ohh.X(idkVar2.a, R.attr.colorPrimary, -16777216));
                    materialManagedSwitchPreference6.k(zBooleanValue);
                    materialManagedSwitchPreference6.e = new agm() { // from class: ide
                        @Override // defpackage.agm
                        public final boolean b(Preference preference2, Object obj) {
                            idk idkVar3 = idkVar2;
                            idkVar3.f.p(preference2.t, Boolean.valueOf(((TwoStatePreference) materialManagedSwitchPreference6).a), obj);
                            Boolean bool = (Boolean) obj;
                            idkVar3.e(bool.booleanValue());
                            boolean zBooleanValue2 = bool.booleanValue();
                            int i4 = 0;
                            if (!zBooleanValue2) {
                                oom oomVarF = idkVar3.g.f();
                                int i5 = ((orr) oomVarF).c;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    MaterialManagedSwitchPreference materialManagedSwitchPreference7 = (MaterialManagedSwitchPreference) oomVarF.get(i6);
                                    Map map = idkVar3.i;
                                    String str9 = materialManagedSwitchPreference7.t;
                                    map.put(str9, Boolean.valueOf(idkVar3.b.m(str9)));
                                    idkVar3.d(materialManagedSwitchPreference7, false);
                                }
                            } else if (Collection.EL.stream(idkVar3.i.values()).anyMatch(bql.k)) {
                                oom oomVarF2 = idkVar3.g.f();
                                int i7 = ((orr) oomVarF2).c;
                                while (i4 < i7) {
                                    MaterialManagedSwitchPreference materialManagedSwitchPreference8 = (MaterialManagedSwitchPreference) oomVarF2.get(i4);
                                    Boolean bool2 = (Boolean) idkVar3.i.get(materialManagedSwitchPreference8.t);
                                    bool2.getClass();
                                    idkVar3.d(materialManagedSwitchPreference8, bool2.booleanValue());
                                    i4++;
                                }
                                idkVar3.i.clear();
                            } else if (Collection.EL.stream(idkVar3.h.values()).anyMatch(bql.k)) {
                                oom oomVarF3 = idkVar3.g.f();
                                int i8 = ((orr) oomVarF3).c;
                                while (i4 < i8) {
                                    MaterialManagedSwitchPreference materialManagedSwitchPreference9 = (MaterialManagedSwitchPreference) oomVarF3.get(i4);
                                    Boolean bool3 = (Boolean) idkVar3.h.get(materialManagedSwitchPreference9.t);
                                    bool3.getClass();
                                    idkVar3.d(materialManagedSwitchPreference9, bool3.booleanValue());
                                    i4++;
                                }
                            } else {
                                idkVar3.e.g(idkVar3.k);
                                oom oomVarF4 = idkVar3.g.f();
                                int i9 = ((orr) oomVarF4).c;
                                while (i4 < i9) {
                                    MaterialManagedSwitchPreference materialManagedSwitchPreference10 = (MaterialManagedSwitchPreference) oomVarF4.get(i4);
                                    idkVar3.d(materialManagedSwitchPreference10, idkVar3.b.m(materialManagedSwitchPreference10.t));
                                    i4++;
                                }
                            }
                            idkVar3.f();
                            return true;
                        }
                    };
                }
                Preference preferenceL = preferenceScreen3.l("key_social_share_info");
                if (preferenceL != null) {
                    preferenceL.n(mip.ey(R.plurals.social_share_info, 3, 3).a(idkVar2.a.getResources()));
                }
                idkVar2.k = idkVar2.b(idkVar2.e.c("image/*"), idkVar2.e.c("video/*"));
                idkVar2.e.h(idkVar2.k);
                idkVar2.e.e(idkVar2.k);
                oom<ResolveInfo> oomVar = idkVar2.k;
                oor oorVarA = idkVar2.e.a();
                for (ResolveInfo resolveInfo : oomVar) {
                    idm idmVar = (idm) oorVarA.get(resolveInfo.activityInfo.packageName);
                    idmVar.getClass();
                    MaterialManagedSwitchPreference materialManagedSwitchPreference7 = new MaterialManagedSwitchPreference(idkVar2.a);
                    String string2 = resolveInfo.activityInfo.applicationInfo.loadLabel(idkVar2.j).toString();
                    String string3 = resolveInfo.loadLabel(idkVar2.j).toString();
                    materialManagedSwitchPreference7.R(string2);
                    if (!string2.equals(string3)) {
                        materialManagedSwitchPreference7.n(string3);
                    }
                    materialManagedSwitchPreference7.L(idmVar.b());
                    materialManagedSwitchPreference7.x = Boolean.valueOf(idkVar2.b.m(idmVar.b()));
                    materialManagedSwitchPreference7.w = true;
                    int dimensionPixelSize = idkVar2.a.getResources().getDimensionPixelSize(R.dimen.camera_settings_switch_button_icon_size);
                    ((ayk) axv.c(idkVar2.a).c().d(resolveInfo.loadIcon(idkVar2.j)).g(bkx.a()).t(dimensionPixelSize, dimensionPixelSize)).k(new idi(materialManagedSwitchPreference7));
                    materialManagedSwitchPreference7.A = R.layout.material_preference_with_social_app_margin;
                    materialManagedSwitchPreference7.e = new idj(idkVar2);
                    preferenceScreen3.ag(materialManagedSwitchPreference7);
                    idkVar2.g.g(materialManagedSwitchPreference7);
                    idkVar2.h.put(materialManagedSwitchPreference7.t, Boolean.valueOf(idkVar2.b.m(idmVar.b())));
                }
                idkVar2.f();
            }
            if (list17.contains("pref_category_frequent_faces") || (preferenceScreen2 = (PreferenceScreen) a("pref_category_frequent_faces")) == null) {
                byVar = byVarW;
            } else {
                final dwd dwdVar2 = this.ab.i;
                MaterialManagedSwitchPreference materialManagedSwitchPreference8 = (MaterialManagedSwitchPreference) preferenceScreen2.l("key_ff_opt_in");
                if (materialManagedSwitchPreference8 != null) {
                    materialManagedSwitchPreference8.k(((Boolean) dwdVar2.b.fA()).booleanValue());
                    materialManagedSwitchPreference8.e = new agm() { // from class: dwc
                        @Override // defpackage.agm
                        public final boolean b(Preference preference2, Object obj) {
                            dwd dwdVar3 = dwdVar2;
                            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                            if (!zBooleanValue2) {
                                String strValueOf = String.valueOf(dwdVar3.a.getNoBackupFilesDir());
                                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 6);
                                sb.append(strValueOf);
                                sb.append("/ff.pb");
                                new File(sb.toString()).delete();
                                String strValueOf2 = String.valueOf(dwdVar3.a.getNoBackupFilesDir());
                                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 10);
                                sb2.append(strValueOf2);
                                sb2.append("/ff.pb_tmp");
                                File file = new File(sb2.toString());
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                            dwdVar3.c.f(zBooleanValue2);
                            return true;
                        }
                    };
                    byVar = byVarW;
                    materialManagedSwitchPreference8.ae(dwdVar2.a.getResources().getString(R.string.frequent_faces_learn_more), new dwb(byVar, 2));
                } else {
                    byVar = byVarW;
                }
            }
            if (!list17.contains("pref_category_storage") && (preferenceScreen = (PreferenceScreen) a("pref_category_storage")) != null) {
                preferenceScreen.o = new fbl(this, 1);
                final ila ilaVar2 = this.ab.j;
                MaterialStorageStatusPreference materialStorageStatusPreference = (MaterialStorageStatusPreference) preferenceScreen.l("pref_storage_status");
                materialStorageStatusPreference.getClass();
                ilaVar2.e = materialStorageStatusPreference;
                ilaVar2.e.A = R.layout.material_preference_storage_status;
                final MaterialManagedSwitchPreference materialManagedSwitchPreference9 = (MaterialManagedSwitchPreference) preferenceScreen.l(htu.F.a);
                final MaterialManagedSwitchPreference materialManagedSwitchPreference10 = (MaterialManagedSwitchPreference) preferenceScreen.l(htu.G.a);
                if (materialManagedSwitchPreference10 != null && materialManagedSwitchPreference9 != null) {
                    materialManagedSwitchPreference10.n(byVar.getResources().getString(R.string.pref_low_storage_mode_auto_disable_summary, 1));
                    materialManagedSwitchPreference10.I(((TwoStatePreference) materialManagedSwitchPreference9).a);
                    materialManagedSwitchPreference9.e = new agm() { // from class: iky
                        @Override // defpackage.agm
                        public final boolean b(Preference preference2, Object obj) {
                            ila ilaVar3 = ilaVar2;
                            MaterialManagedSwitchPreference materialManagedSwitchPreference11 = materialManagedSwitchPreference10;
                            MaterialManagedSwitchPreference materialManagedSwitchPreference12 = materialManagedSwitchPreference9;
                            if (Boolean.TRUE.equals(obj)) {
                                ilaVar3.a.b();
                                materialManagedSwitchPreference11.I(true);
                            } else {
                                ilaVar3.a.a();
                                materialManagedSwitchPreference11.I(false);
                            }
                            ilaVar3.a();
                            ilaVar3.d.p(materialManagedSwitchPreference12.t, Boolean.valueOf(((TwoStatePreference) materialManagedSwitchPreference12).a), obj);
                            return true;
                        }
                    };
                    String string4 = byVar.getResources().getString(R.string.settings_impacted_button);
                    ile ileVar = new ile(byVar);
                    materialManagedSwitchPreference9.H = string4;
                    materialManagedSwitchPreference9.J = ileVar;
                }
                Preference preferenceL2 = preferenceScreen.l("pref_free_up_space");
                if (preferenceL2 != null) {
                    preferenceL2.o = new fbk(byVar, 2);
                }
                plk.af(ilaVar2.g.b(ilaVar2.b), new ikz(ilaVar2), ilaVar2.c);
            }
            PreferenceScreen preferenceScreen9 = (PreferenceScreen) a("pref_category_advanced");
            if (preferenceScreen9 != null) {
                if (preferenceScreen9.k() <= 0) {
                    ao("pref_category_advanced");
                } else {
                    MaterialManagedSwitchPreference materialManagedSwitchPreference11 = (MaterialManagedSwitchPreference) preferenceScreen9.l(str);
                    if (materialManagedSwitchPreference11 != null) {
                        final Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setPackage("com.google.android.apps.photos");
                        intent.putExtra("android.intent.extra.FROM_STORAGE", true);
                        intent.setType("image/*");
                        materialManagedSwitchPreference11.ae(E(R.string.pref_raw_output_control_action_button), new Runnable() { // from class: fbm
                            @Override // java.lang.Runnable
                            public final void run() {
                                fbn fbnVar = this.a;
                                Intent intent2 = intent;
                                cf cfVar = fbnVar.z;
                                if (cfVar != null) {
                                    cfVar.d(intent2, -1);
                                    return;
                                }
                                throw new IllegalStateException("Fragment " + fbnVar + " not attached to Activity");
                            }
                        });
                        materialManagedSwitchPreference11.e = new fbi(this, 0);
                    }
                }
            }
            if (!list17.contains(htu.q.a)) {
                MaterialManagedSwitchPreference materialManagedSwitchPreference12 = (MaterialManagedSwitchPreference) a(htu.q.a);
                materialManagedSwitchPreference12.getClass();
                this.ae = materialManagedSwitchPreference12;
            }
            ojc ojcVar = this.ab.n;
            CharSequence charSequence = str5;
            if (!list17.contains(charSequence) && ojcVar.g() && (materialManagedSwitchPreference = (MaterialManagedSwitchPreference) a(charSequence)) != null) {
                materialManagedSwitchPreference.Q(R.string.pref_kepler_title);
                materialManagedSwitchPreference.O(R.string.pref_kepler_summary);
            }
            if (bundle3 != null && (string = (bundle2 = bundle3).getString("pref_open_setting_page")) != null) {
                Preference preferenceA3 = a(string);
                if (preferenceA3 != null) {
                    ah(preferenceA3);
                }
                if (bundle2.getBoolean("pref_make_setting_page_root")) {
                    byVar.finish();
                }
            }
            oqt oqtVar = this.ab.w;
            for (CharSequence charSequence2 : oqtVar.n()) {
                PreferenceGroup preferenceGroup = (PreferenceGroup) a(charSequence2);
                if (preferenceGroup != null) {
                    for (Preference preference2 : ((olp) oqtVar).b(charSequence2)) {
                        preferenceGroup.ag(preference2);
                        CharSequence charSequence3 = preference2.q;
                    }
                }
            }
            Iterator it3 = this.ab.k.iterator();
            while (it3.hasNext()) {
                jib jibVar = (jib) a((String) it3.next());
                if (jibVar != null) {
                    final fbq fbqVar2 = this.ab;
                    jibVar.ac(new Function() { // from class: fbp
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            return Function.CC.$default$andThen(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            return Boolean.valueOf(((iln) fbqVar2.l.get()).a());
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            return Function.CC.$default$compose(this, function);
                        }
                    });
                }
            }
            CameraMaterialSettingsActivity.f(this.ab.p, k());
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    @Override // defpackage.agy
    public final PreferenceScreen k() {
        PreferenceScreen preferenceScreen = this.a.b;
        String str = this.ad;
        if (str == null || preferenceScreen == null) {
            return preferenceScreen;
        }
        PreferenceScreen preferenceScreenAm = am(preferenceScreen, str);
        if (preferenceScreenAm != null) {
            return preferenceScreenAm;
        }
        String str2 = this.ad;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14);
        sb.append("key ");
        sb.append(str2);
        sb.append(" not found");
        throw new RuntimeException(sb.toString());
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ListPreference listPreference;
        Preference preferenceA;
        ListPreference listPreference2;
        if (this.ab.u.contains("pref_category_custom_hotkeys")) {
            return;
        }
        if (this.ag.containsKey(str) && (preferenceA = a(str)) != null) {
            String string = preferenceA.q().getString(str, "-1");
            this.ag.put(str, string);
            int i = Integer.parseInt(string);
            if ((i == 24 || i == 25) && (listPreference2 = (ListPreference) a(htu.f.a)) != null) {
                listPreference2.o(t().getString(R.string.preference_volume_key_off));
            }
            if (!string.equals("-1") && this.ag.containsValue(string)) {
                HashMap map = new HashMap();
                for (String str2 : this.ag.keySet()) {
                    if (!str2.equals(str) && ((String) this.ag.get(str2)).equals(string)) {
                        map.put(str2, "-1");
                        MaterialKeyListenerPreference materialKeyListenerPreference = (MaterialKeyListenerPreference) a(str2);
                        if (materialKeyListenerPreference != null) {
                            materialKeyListenerPreference.k("-1");
                        }
                    }
                }
                this.ag.putAll(map);
            }
        }
        if (!str.equals(htu.f.a) || (listPreference = (ListPreference) a(str)) == null || listPreference.i.equals(t().getString(R.string.preference_volume_key_off))) {
            return;
        }
        HashMap map2 = new HashMap();
        for (String str3 : this.ag.keySet()) {
            int i2 = Integer.parseInt((String) this.ag.get(str3));
            if (i2 == 25 || i2 == 24) {
                map2.put(str3, "-1");
                MaterialKeyListenerPreference materialKeyListenerPreference2 = (MaterialKeyListenerPreference) a(str3);
                if (materialKeyListenerPreference2 != null) {
                    materialKeyListenerPreference2.k("-1");
                }
            }
        }
        this.ag.putAll(map2);
    }
}
