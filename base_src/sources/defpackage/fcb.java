package defpackage;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Environment;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.Fix.FileFilterSo;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import com.google.android.apps.camera.ui.preference.StorageStatusPreference;
import com.mycompany.myapp40.MainActivity$100000001;
import com.settings.Pref;
import j$.util.Collection;
import j$.util.function.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fcb extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final /* synthetic */ int c = 0;
    public fce a;
    public ManagedSwitchPreference b;
    private String d;
    private ManagedSwitchPreference e;
    private lap f;
    private final HashMap g = new HashMap();

    private final PreferenceScreen c(PreferenceGroup preferenceGroup, String str) {
        PreferenceScreen preferenceScreenC;
        if ((preferenceGroup instanceof PreferenceScreen) && str.equals(preferenceGroup.getKey())) {
            return (PreferenceScreen) preferenceGroup;
        }
        for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
            Preference preference = preferenceGroup.getPreference(i);
            if ((preference instanceof PreferenceGroup) && (preferenceScreenC = c((PreferenceGroup) preference, str)) != null) {
                return preferenceScreenC;
            }
        }
        return null;
    }

    private final void d(PreferenceGroup preferenceGroup) {
        for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
            Preference preference = preferenceGroup.getPreference(i);
            if (preference instanceof PreferenceGroup) {
                d((PreferenceGroup) preference);
            }
        }
    }

    private final void e(String str) {
        PreferenceGroup parent;
        Preference preferenceFindPreference = findPreference(str);
        if (preferenceFindPreference == null || (parent = preferenceFindPreference.getParent()) == null || parent.removePreference(preferenceFindPreference)) {
            return;
        }
        ((oug) ((oug) CameraSettingsActivity.o.c()).G((char) 1628)).r("Failed to remove preference :%s", str);
    }

    private final void f(PreferenceScreen preferenceScreen) {
        Intent intent = new Intent(getActivity(), (Class<?>) CameraSettingsActivity.class);
        intent.putExtra("pref_screen_extra", preferenceScreen.getKey());
        intent.putExtra("pref_screen_title", preferenceScreen.getTitle());
        preferenceScreen.setIntent(intent);
    }

    private final void g(String str) {
        Preference preferenceFindPreference = findPreference(str);
        if (preferenceFindPreference instanceof PreferenceScreen) {
            f((PreferenceScreen) preferenceFindPreference);
        }
    }

    private final void g3(PreferenceGroup preferenceGroup) {
        for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
            Preference preference = preferenceGroup.getPreference(i);
            if (preference instanceof PreferenceGroup) {
                g3((PreferenceGroup) preference);
            } else if (preference != null && preference.getClass().getSimpleName().equalsIgnoreCase("EditTextPreference")) {
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.setSummary(editTextPreference.getText());
            }
        }
    }

    public static String[] getFileNames(File[] fileArr) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (fileArr.length == 0) {
            arrayList = (ArrayList) null;
        } else {
            arrayList2.add("Google Stock");
            for (File file : fileArr) {
                arrayList2.add(file.getName());
            }
            arrayList = arrayList2;
        }
        return (String[]) arrayList2.toArray(new String[arrayList.size()]);
    }

    public final void CreateList() {
        File file = new File(Environment.getExternalStorageDirectory() + "/LMC8.4/libs/");
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles(new FileFilterSo());
            if (0 < fileArrListFiles.length) {
                Arrays.sort(fileArrListFiles, new MainActivity$100000001());
                String[] fileNames = getFileNames(fileArrListFiles);
                CreateListeDirFront("Front Camera Lib from Dir", "pref_libs_fromdir_key_front", fileNames, fileNames);
                CreateListeDirMain("Main Camera Lib from Dir", "pref_libs_fromdir_key", fileNames, fileNames);
                CreateListeDir2("Camera Tele Lib from Dir", "pref_libs_fromdir_key_2", fileNames, fileNames);
                CreateListeDir3("Camera Wide Lib from Dir", "pref_libs_fromdir_key_3", fileNames, fileNames);
                CreateListeDir4("Camera ID4 Lib from Dir", "pref_libs_fromdir_key_4", fileNames, fileNames);
                CreateListeDir5("Camera ID5 Lib from Dir", "pref_libs_fromdir_key_5", fileNames, fileNames);
            }
        }
    }

    public final void CreateListeDir2(CharSequence charSequence, String str, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("camera2lib_group_key");
        if (preferenceScreen != null) {
            ListPreference listPreference = new ListPreference(getPreferenceScreen().getContext());
            listPreference.setTitle(charSequence);
            listPreference.setDialogTitle(charSequence);
            listPreference.setKey(str);
            listPreference.setLayoutResource(R.layout.preference_with_margin);
            listPreference.setIcon(R.drawable.hsl_load);
            listPreference.setSummary("%s");
            listPreference.setEntries(charSequenceArr);
            listPreference.setEntryValues(charSequenceArr2);
            listPreference.setValueIndex(0);
            preferenceScreen.addPreference(listPreference);
        }
    }

    public final void CreateListeDir3(CharSequence charSequence, String str, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("camera3lib_group_key");
        if (preferenceScreen != null) {
            ListPreference listPreference = new ListPreference(getPreferenceScreen().getContext());
            listPreference.setTitle(charSequence);
            listPreference.setDialogTitle(charSequence);
            listPreference.setKey(str);
            listPreference.setLayoutResource(R.layout.preference_with_margin);
            listPreference.setIcon(R.drawable.hsl_load);
            listPreference.setSummary("%s");
            listPreference.setEntries(charSequenceArr);
            listPreference.setEntryValues(charSequenceArr2);
            listPreference.setValueIndex(0);
            preferenceScreen.addPreference(listPreference);
        }
    }

    public final void CreateListeDir4(CharSequence charSequence, String str, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("camera4lib_group_key");
        if (preferenceScreen != null) {
            ListPreference listPreference = new ListPreference(getPreferenceScreen().getContext());
            listPreference.setTitle(charSequence);
            listPreference.setDialogTitle(charSequence);
            listPreference.setKey(str);
            listPreference.setLayoutResource(R.layout.preference_with_margin);
            listPreference.setIcon(R.drawable.hsl_load);
            listPreference.setSummary("%s");
            listPreference.setEntries(charSequenceArr);
            listPreference.setEntryValues(charSequenceArr2);
            listPreference.setValueIndex(0);
            preferenceScreen.addPreference(listPreference);
        }
    }

    public final void CreateListeDir5(CharSequence charSequence, String str, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("camera5lib_group_key");
        if (preferenceScreen != null) {
            ListPreference listPreference = new ListPreference(getPreferenceScreen().getContext());
            listPreference.setTitle(charSequence);
            listPreference.setDialogTitle(charSequence);
            listPreference.setKey(str);
            listPreference.setLayoutResource(R.layout.preference_with_margin);
            listPreference.setIcon(R.drawable.hsl_load);
            listPreference.setSummary("%s");
            listPreference.setEntries(charSequenceArr);
            listPreference.setEntryValues(charSequenceArr2);
            listPreference.setValueIndex(0);
            preferenceScreen.addPreference(listPreference);
        }
    }

    public final void CreateListeDirFront(CharSequence charSequence, String str, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("frontcameralib_group_key");
        if (preferenceScreen != null) {
            ListPreference listPreference = new ListPreference(getPreferenceScreen().getContext());
            listPreference.setTitle(charSequence);
            listPreference.setDialogTitle(charSequence);
            listPreference.setKey(str);
            listPreference.setLayoutResource(R.layout.preference_with_margin);
            listPreference.setIcon(R.drawable.hsl_load);
            listPreference.setSummary("%s");
            listPreference.setEntries(charSequenceArr);
            listPreference.setEntryValues(charSequenceArr2);
            listPreference.setValueIndex(0);
            preferenceScreen.addPreference(listPreference);
        }
    }

    public final void CreateListeDirMain(CharSequence charSequence, String str, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("maincameralib_group_key");
        if (preferenceScreen != null) {
            ListPreference listPreference = new ListPreference(getPreferenceScreen().getContext());
            listPreference.setTitle(charSequence);
            listPreference.setDialogTitle(charSequence);
            listPreference.setKey(str);
            listPreference.setLayoutResource(R.layout.preference_with_margin);
            listPreference.setIcon(R.drawable.hsl_load);
            listPreference.setSummary("%s");
            listPreference.setEntries(charSequenceArr);
            listPreference.setEntryValues(charSequenceArr2);
            listPreference.setValueIndex(0);
            preferenceScreen.addPreference(listPreference);
        }
    }

    public final void a() {
        this.a.l.l(htu.a.a, false);
        this.b.setChecked(false);
    }

    public final boolean b() {
        return getActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || getActivity().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    @Override // android.preference.PreferenceFragment
    public final PreferenceScreen getPreferenceScreen() {
        PreferenceScreen preferenceScreen = super.getPreferenceScreen();
        String str = this.d;
        if (str == null || preferenceScreen == null) {
            return preferenceScreen;
        }
        PreferenceScreen preferenceScreenC = c(preferenceScreen, str);
        if (preferenceScreenC != null) {
            return preferenceScreenC;
        }
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14);
        sb.append("key ");
        sb.append(str2);
        sb.append(" not found");
        throw new RuntimeException(sb.toString());
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        d((PreferenceCategory) findPreference("pref_category_resolution_camera"));
        d((PreferenceCategory) findPreference("pref_category_resolution_video"));
        if (!this.a.m.contains("pref_category_custom_hotkeys") && (preferenceScreen = (PreferenceScreen) findPreference("pref_category_custom_hotkeys")) != null) {
            for (int i = 0; i < preferenceScreen.getPreferenceCount(); i++) {
                Preference preference = preferenceScreen.getPreference(i);
                String string = preference.getSharedPreferences().getString(preference.getKey(), "-1");
                if (!this.g.containsKey(preference.getKey())) {
                    this.g.put(preference.getKey(), string);
                }
            }
        }
        View view = getView();
        view.getClass();
        ((ListView) view.findViewById(android.R.id.list)).setDivider(null);
        super.onActivityCreated(bundle);
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        NotificationManager notificationManager;
        super.onActivityResult(i, i2, intent);
        if (i == 2 && (notificationManager = (NotificationManager) getActivity().getSystemService("notification")) != null && notificationManager.isNotificationPolicyAccessGranted()) {
            e("pref_dnd_access_needed");
        }
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
    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        String string;
        euv euvVarD = ((ewc) getActivity().getApplication()).d();
        super.onCreate(bundle);
        this.f = new lap();
        fce fceVarA = euvVarD.j(new khx(getContext(), (byte[]) null)).a();
        this.a = fceVarA;
        fceVarA.a(getContext());
        List list = this.a.m;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.d = arguments.getString("pref_screen_extra");
        }
        addPreferencesFromResource(R.xml.camera_preferences);
        Pref.AddSettingsPref(this);
        if (!CameraSettingsActivity.p) {
            findPreference("pref_category_general").setLayoutResource(R.layout.preference_category_first_layout);
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("prefscreen_top");
        oti otiVarListIterator = ((orx) this.a.d).listIterator();
        while (true) {
            int i2 = 0;
            i = 1;
            if (!otiVarListIterator.hasNext()) {
                break;
            }
            hvc hvcVar = (hvc) otiVarListIterator.next();
            fbz fbzVar = new fbz(preferenceScreen.getContext());
            fbzVar.setTitle(hvcVar.b());
            fbzVar.setKey(hvcVar.c());
            fbzVar.setOrder(hvcVar.a());
            fbzVar.setLayoutResource(true != CameraSettingsActivity.p ? R.layout.preference_category_layout_legacy : R.layout.preference_category_layout);
            fbzVar.setOrderingAsAdded(true);
            preferenceScreen.addPreference(fbzVar);
            if (hvcVar.a() < 0) {
                findPreference("pref_category_general").setLayoutResource(true != CameraSettingsActivity.p ? R.layout.preference_category_layout_legacy : R.layout.preference_category_layout);
            }
            int size = hvcVar.d().size() - 1;
            for (hvd hvdVar : hvcVar.d()) {
                fca fcaVar = new fca(fbzVar.getContext(), i2, size);
                i2++;
                fcaVar.setTitle(hvdVar.b());
                fcaVar.setKey(hvdVar.d());
                fcaVar.setSummary(hvdVar.e());
                fcaVar.setIcon(hvdVar.a());
                Intent intentC = hvdVar.c();
                if (intentC != null) {
                    fcaVar.setIntent(intentC);
                }
                fcaVar.setLayoutResource(R.layout.preference_with_margin);
                fbzVar.addPreference(fcaVar);
            }
        }
        Iterator it = this.a.n.iterator();
        while (it.hasNext()) {
            this.f.c((lie) it.next());
        }
        if (!list.contains("pref_audio_zoom_key")) {
            final ManagedSwitchPreference managedSwitchPreference = (ManagedSwitchPreference) findPreference("pref_audio_zoom_key");
            managedSwitchPreference.c = new Preference.OnPreferenceChangeListener() { // from class: fbu
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference, Object obj) {
                    this.a.a.j.p(preference.getKey(), Boolean.valueOf(managedSwitchPreference.isChecked()), obj);
                    return true;
                }
            };
        }
        if (!list.contains("pref_camera_enable_iris")) {
            ((ManagedSwitchPreference) findPreference("pref_camera_enable_iris")).setSummary(getString(true != CameraSettingsActivity.q ? R.string.pref_camera_lens_subtitle_legacy : R.string.pref_camera_lens_subtitle_p21));
        }
        ManagedSwitchPreference managedSwitchPreference2 = (ManagedSwitchPreference) findPreference(htu.a.a);
        this.b = managedSwitchPreference2;
        managedSwitchPreference2.c = new fbt(this, i);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            e((String) it2.next());
        }
        if (!list.contains("pref_category_developer")) {
            this.a.a.a((PreferenceScreen) findPreference("pref_category_developer"));
        }
        if (!list.contains("pref_category_social_share")) {
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) findPreference("pref_category_social_share");
            final ids idsVar = this.a.b;
            idsVar.m = preferenceScreen2;
            idsVar.e.f();
            if (!((Boolean) idsVar.c.c(htu.B)).booleanValue() && !((Boolean) idsVar.c.c(htu.C)).booleanValue()) {
                if (idsVar.e.j("image/*") || idsVar.e.j("video/*")) {
                    idsVar.d.e(htu.z, true);
                } else {
                    idsVar.d.e(htu.z, false);
                }
                idsVar.c.c(htu.z);
            }
            boolean zBooleanValue = ((Boolean) idsVar.c.c(htu.z)).booleanValue();
            final ManagedSwitchPreference managedSwitchPreference3 = (ManagedSwitchPreference) preferenceScreen2.findPreference(htu.z.a);
            if (managedSwitchPreference3 != null) {
                managedSwitchPreference3.setTitle(idsVar.d(zBooleanValue));
                int iX = idsVar.g.k(ddl.ay) ? ohh.X(idsVar.a, R.attr.colorOnPrimary, -1) : -1;
                managedSwitchPreference3.g = Integer.valueOf(iX);
                int color = idsVar.g.k(ddl.ay) ? iX : idsVar.a.getResources().getColor(R.color.settings_switch_button_thumb, null);
                int color2 = iX;
                managedSwitchPreference3.d = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{color, color});
                int[][] iArr = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
                int[] iArr2 = new int[2];
                iArr2[0] = idsVar.g.k(ddl.ay) ? color2 : idsVar.a.getResources().getColor(R.color.settings_switch_button_track_disable, null);
                if (!idsVar.g.k(ddl.ay)) {
                    color2 = idsVar.a.getResources().getColor(R.color.settings_switch_button_track_activity, null);
                }
                iArr2[1] = color2;
                managedSwitchPreference3.e = new ColorStateList(iArr, iArr2);
                managedSwitchPreference3.f = Integer.valueOf(idsVar.b(zBooleanValue));
                managedSwitchPreference3.setChecked(zBooleanValue);
                managedSwitchPreference3.c = new Preference.OnPreferenceChangeListener() { // from class: idp
                    @Override // android.preference.Preference.OnPreferenceChangeListener
                    public final boolean onPreferenceChange(Preference preference, Object obj) {
                        ids idsVar2 = idsVar;
                        idsVar2.f.p(preference.getKey(), Boolean.valueOf(managedSwitchPreference3.isChecked()), obj);
                        Boolean bool = (Boolean) obj;
                        idsVar2.f(bool.booleanValue());
                        boolean zBooleanValue2 = bool.booleanValue();
                        int i3 = 0;
                        if (!zBooleanValue2) {
                            oom oomVarF = idsVar2.h.f();
                            int i4 = ((orr) oomVarF).c;
                            for (int i5 = 0; i5 < i4; i5++) {
                                ManagedSwitchPreference managedSwitchPreference4 = (ManagedSwitchPreference) oomVarF.get(i5);
                                idsVar2.j.put(managedSwitchPreference4.getKey(), Boolean.valueOf(idsVar2.b.m(managedSwitchPreference4.getKey())));
                                idsVar2.e(managedSwitchPreference4, false);
                            }
                        } else if (Collection.EL.stream(idsVar2.j.values()).anyMatch(bql.l)) {
                            oom oomVarF2 = idsVar2.h.f();
                            int i6 = ((orr) oomVarF2).c;
                            while (i3 < i6) {
                                ManagedSwitchPreference managedSwitchPreference5 = (ManagedSwitchPreference) oomVarF2.get(i3);
                                Boolean bool2 = (Boolean) idsVar2.j.get(managedSwitchPreference5.getKey());
                                bool2.getClass();
                                idsVar2.e(managedSwitchPreference5, bool2.booleanValue());
                                i3++;
                            }
                            idsVar2.j.clear();
                        } else if (Collection.EL.stream(idsVar2.i.values()).anyMatch(bql.l)) {
                            oom oomVarF3 = idsVar2.h.f();
                            int i7 = ((orr) oomVarF3).c;
                            while (i3 < i7) {
                                ManagedSwitchPreference managedSwitchPreference6 = (ManagedSwitchPreference) oomVarF3.get(i3);
                                Boolean bool3 = (Boolean) idsVar2.i.get(managedSwitchPreference6.getKey());
                                bool3.getClass();
                                idsVar2.e(managedSwitchPreference6, bool3.booleanValue());
                                i3++;
                            }
                        } else {
                            idsVar2.e.g(idsVar2.l);
                            oom oomVarF4 = idsVar2.h.f();
                            int i8 = ((orr) oomVarF4).c;
                            while (i3 < i8) {
                                ManagedSwitchPreference managedSwitchPreference7 = (ManagedSwitchPreference) oomVarF4.get(i3);
                                idsVar2.e(managedSwitchPreference7, idsVar2.b.m(managedSwitchPreference7.getKey()));
                                i3++;
                            }
                        }
                        idsVar2.g();
                        return true;
                    }
                };
            }
            Preference preferenceFindPreference = preferenceScreen2.findPreference("key_social_share_info");
            if (preferenceFindPreference != null) {
                preferenceFindPreference.setSummary(mip.ey(R.plurals.social_share_info, 3, 3).a(idsVar.a.getResources()));
            }
            idsVar.l = idsVar.c(idsVar.e.c("image/*"), idsVar.e.c("video/*"));
            idsVar.e.h(idsVar.l);
            idsVar.e.e(idsVar.l);
            oom<ResolveInfo> oomVar = idsVar.l;
            oor oorVarA = idsVar.e.a();
            for (ResolveInfo resolveInfo : oomVar) {
                idm idmVar = (idm) oorVarA.get(resolveInfo.activityInfo.packageName);
                idmVar.getClass();
                ManagedSwitchPreference managedSwitchPreference4 = new ManagedSwitchPreference(idsVar.a);
                String string2 = resolveInfo.activityInfo.applicationInfo.loadLabel(idsVar.k).toString();
                String string3 = resolveInfo.loadLabel(idsVar.k).toString();
                managedSwitchPreference4.setTitle(string2);
                if (!string2.equals(string3)) {
                    managedSwitchPreference4.setSummary(string3);
                }
                managedSwitchPreference4.setKey(idmVar.b());
                managedSwitchPreference4.setDefaultValue(Boolean.valueOf(idsVar.b.m(idmVar.b())));
                managedSwitchPreference4.setPersistent(true);
                int dimensionPixelSize = idsVar.a.getResources().getDimensionPixelSize(R.dimen.camera_settings_switch_button_icon_size);
                ((ayk) axv.c(idsVar.a).c().d(resolveInfo.loadIcon(idsVar.k)).g(bkx.a()).t(dimensionPixelSize, dimensionPixelSize)).k(new idr(managedSwitchPreference4));
                managedSwitchPreference4.setLayoutResource(true != idsVar.g.k(ddl.ay) ? R.layout.preference_with_social_app_margin_legacy : R.layout.preference_with_social_app_margin);
                managedSwitchPreference4.c = new Preference.OnPreferenceChangeListener() { // from class: ido
                    @Override // android.preference.Preference.OnPreferenceChangeListener
                    public final boolean onPreferenceChange(Preference preference, Object obj) {
                        ids idsVar2 = idsVar;
                        int iA = idsVar2.a();
                        boolean z = true;
                        idsVar2.d.e(htu.D, true);
                        if (((Boolean) idsVar2.c.c(htu.z)).booleanValue()) {
                            Boolean bool = (Boolean) obj;
                            if (bool.booleanValue() && iA > 3) {
                                Toast toast = idsVar2.n;
                                if (toast != null) {
                                    toast.cancel();
                                }
                                idsVar2.n = Toast.makeText(idsVar2.a, mip.ey(R.plurals.social_share_select_error, 3, 3).a(idsVar2.a.getResources()), 0);
                                idsVar2.n.show();
                                idsVar2.e((ManagedSwitchPreference) preference, false);
                                z = false;
                            } else if (!bool.booleanValue() && iA <= 0) {
                                idsVar2.f(false);
                            }
                        } else {
                            idsVar2.f(true);
                        }
                        if (z) {
                            preference.getKey();
                            idsVar2.b.m(preference.getKey());
                            idsVar2.g();
                            idsVar2.f.p(preference.getKey(), Boolean.valueOf(idsVar2.b.m(preference.getKey())), obj);
                        }
                        return z;
                    }
                };
                preferenceScreen2.addPreference(managedSwitchPreference4);
                idsVar.h.g(managedSwitchPreference4);
                idsVar.i.put(managedSwitchPreference4.getKey(), Boolean.valueOf(idsVar.b.m(idmVar.b())));
            }
            idsVar.g();
        }
        if (!list.contains("pref_category_frequent_faces")) {
            PreferenceScreen preferenceScreen3 = (PreferenceScreen) findPreference("pref_category_frequent_faces");
            final dwd dwdVar = this.a.p;
            Activity activity = getActivity();
            ManagedSwitchPreference managedSwitchPreference5 = (ManagedSwitchPreference) preferenceScreen3.findPreference("key_ff_opt_in");
            if (managedSwitchPreference5 != null) {
                managedSwitchPreference5.setChecked(((Boolean) dwdVar.b.fA()).booleanValue());
                final byte[] bArr = null;
                managedSwitchPreference5.c = new Preference.OnPreferenceChangeListener(bArr) { // from class: dwa
                    @Override // android.preference.Preference.OnPreferenceChangeListener
                    public final boolean onPreferenceChange(Preference preference, Object obj) {
                        dwd dwdVar2 = this.a;
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        if (!zBooleanValue2) {
                            dwd.a(dwdVar2.a);
                        }
                        dwdVar2.c.f(zBooleanValue2);
                        return true;
                    }
                };
                managedSwitchPreference5.b(dwdVar.a.getResources().getString(R.string.frequent_faces_learn_more), new dwb(activity, 0));
            }
        }
        if (!list.contains("pref_category_storage")) {
            PreferenceScreen preferenceScreen4 = (PreferenceScreen) findPreference("pref_category_storage");
            preferenceScreen4.setOnPreferenceClickListener(new fbw(this, 1));
            final ilk ilkVar = this.a.e;
            final Activity activity2 = getActivity();
            ilkVar.f = (StorageStatusPreference) preferenceScreen4.findPreference("pref_storage_status");
            StorageStatusPreference storageStatusPreference = ilkVar.f;
            storageStatusPreference.e = ilkVar.e;
            storageStatusPreference.setLayoutResource(true != ilkVar.e ? R.layout.preference_storage_status_legacy : R.layout.preference_storage_status);
            final ManagedSwitchPreference managedSwitchPreference6 = (ManagedSwitchPreference) preferenceScreen4.findPreference(htu.F.a);
            final ManagedSwitchPreference managedSwitchPreference7 = (ManagedSwitchPreference) preferenceScreen4.findPreference(htu.G.a);
            managedSwitchPreference7.setSummary(activity2.getResources().getString(R.string.pref_low_storage_mode_auto_disable_summary, 1));
            managedSwitchPreference7.setEnabled(managedSwitchPreference6.isChecked());
            managedSwitchPreference6.c = new Preference.OnPreferenceChangeListener() { // from class: ili
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference, Object obj) {
                    ilk ilkVar2 = ilkVar;
                    ManagedSwitchPreference managedSwitchPreference8 = managedSwitchPreference7;
                    ManagedSwitchPreference managedSwitchPreference9 = managedSwitchPreference6;
                    if (Boolean.TRUE.equals(obj)) {
                        ilkVar2.a.b();
                        managedSwitchPreference8.setEnabled(true);
                    } else {
                        ilkVar2.a.a();
                        managedSwitchPreference8.setEnabled(false);
                    }
                    ilkVar2.b();
                    ilkVar2.d.p(managedSwitchPreference9.getKey(), Boolean.valueOf(managedSwitchPreference9.isChecked()), obj);
                    return true;
                }
            };
            String string4 = activity2.getResources().getString(R.string.settings_impacted_button);
            ile ileVar = new ile(activity2);
            managedSwitchPreference6.j = string4;
            managedSwitchPreference6.l = ileVar;
            final int i3 = 2;
            preferenceScreen4.findPreference("pref_free_up_space").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: fbv
                @Override // android.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    switch (i3) {
                        case 0:
                            Activity activity3 = activity2;
                            int i4 = fcb.c;
                            int i5 = bre.a;
                            bre.a(activity3.getPackageName(), activity3.getApplicationContext());
                            break;
                        case 1:
                            Activity activity4 = activity2;
                            int i6 = fcb.c;
                            int i7 = bre.a;
                            Context applicationContext = activity4.getApplicationContext();
                            activity4.getPackageName();
                            bre.b(applicationContext, activity4);
                            break;
                        default:
                            activity2.startActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"));
                            break;
                    }
                    return true;
                }
            });
            plk.af(ilkVar.h.b(ilkVar.b), new ilj(ilkVar), ilkVar.c);
        }
        if (!list.contains("pref_chameleon_control_key")) {
            ((ManagedSwitchPreference) findPreference("pref_chameleon_control_key")).m = new View.OnClickListener() { // from class: fbx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fcb fcbVar = this.a;
                    if (fcbVar.a.i.g()) {
                        ((jzh) fcbVar.a.i.c()).b(fcbVar.getContext());
                    }
                }
            };
        }
        PreferenceScreen preferenceScreen5 = (PreferenceScreen) findPreference("pref_category_advanced");
        if (preferenceScreen5.getPreferenceCount() <= 0) {
            e("pref_category_advanced");
        } else {
            ManagedSwitchPreference managedSwitchPreference8 = (ManagedSwitchPreference) preferenceScreen5.findPreference("pref_camera_raw_output_option_available_key");
            if (managedSwitchPreference8 != null) {
                final Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.google.android.apps.photos");
                intent.putExtra("android.intent.extra.FROM_STORAGE", true);
                intent.setType("image/*");
                managedSwitchPreference8.b(getString(R.string.pref_raw_output_control_action_button), new Runnable() { // from class: fby
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.startActivity(intent);
                    }
                });
                managedSwitchPreference8.c = new fbt(this, 0);
            }
        }
        if (!list.contains(htu.q.a)) {
            this.e = (ManagedSwitchPreference) findPreference(htu.q.a);
        }
        ojc ojcVar = this.a.h;
        if (!list.contains("pref_camera_kepler_enabled_key") && ojcVar.g()) {
            ManagedSwitchPreference managedSwitchPreference9 = (ManagedSwitchPreference) findPreference("pref_camera_kepler_enabled_key");
            managedSwitchPreference9.setTitle(R.string.pref_kepler_title);
            managedSwitchPreference9.setSummary(R.string.pref_kepler_summary);
        }
        if (arguments != null && (string = arguments.getString("pref_open_setting_page")) != null) {
            PreferenceScreen preferenceScreen6 = (PreferenceScreen) findPreference("prefscreen_top");
            Preference preferenceFindPreference2 = findPreference(string);
            if (preferenceFindPreference2 != null) {
                ListAdapter rootAdapter = getPreferenceScreen().getRootAdapter();
                int i4 = 0;
                while (true) {
                    if (i4 >= rootAdapter.getCount()) {
                        i4 = -1;
                        break;
                    } else if (((Preference) rootAdapter.getItem(i4)).getKey().equals(string)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 != -1) {
                    PreferenceScreen preferenceScreen7 = (PreferenceScreen) preferenceFindPreference2;
                    f(preferenceScreen7);
                    Intent intent2 = preferenceScreen7.getIntent();
                    if (getActivity().getCallingActivity() != null) {
                        intent2.setFlags(33554432);
                    }
                    preferenceScreen7.setIntent(intent2);
                    preferenceScreen6.onItemClick(null, null, i4, 0L);
                }
            }
            if (arguments.getBoolean("pref_make_setting_page_root")) {
                getActivity().finish();
            }
        }
        oqt oqtVar = this.a.o;
        for (String str : oqtVar.n()) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference(str);
            for (Preference preference : ((olp) oqtVar).b(str)) {
                if (preferenceGroup.addPreference(preference)) {
                    preference.getTitle();
                } else {
                    ((oug) ((oug) CameraSettingsActivity.o.c()).G((char) 1627)).r("Could not add %s", preference.getTitle());
                }
            }
        }
        Iterator it3 = this.a.f.iterator();
        while (it3.hasNext()) {
            jhu jhuVar = (jhu) findPreference((String) it3.next());
            if (jhuVar != null) {
                final fce fceVar = this.a;
                jhuVar.a(new Function() { // from class: fcd
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((iln) fceVar.g.get()).a());
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                });
            }
        }
        CameraSettingsActivity.n(this.a.j, getPreferenceScreen());
        CreateList();
        g3((PreferenceScreen) findPreference("prefscreen_top"));
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f.close();
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        String string;
        super.onResume();
        Activity activity = getActivity();
        g("pref_category_advanced");
        g("pref_category_gestures");
        g("pref_category_developer");
        g("pref_category_social_share");
        g("pref_category_frequent_faces");
        g("pref_category_storage");
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("pref_category_social_share");
        int i = 0;
        if (preferenceScreen != null) {
            ids idsVar = this.a.b;
            if (((Boolean) idsVar.c.c(htu.z)).booleanValue()) {
                ArrayList<String> arrayList = new ArrayList();
                oom oomVarC = idsVar.c(idsVar.e.d("image/*"), idsVar.e.d("video/*"));
                int size = oomVarC.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(((ResolveInfo) oomVarC.get(i2)).activityInfo.applicationInfo.loadLabel(idsVar.k).toString());
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
                string = idsVar.a.getResources().getString(R.string.social_share_off);
            }
            preferenceScreen.setSummary(string);
        }
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) findPreference("pref_category_frequent_faces");
        if (preferenceScreen2 != null) {
            dwd dwdVar = this.a.p;
            preferenceScreen2.setSummary(dwdVar.a.getResources().getString(true != ((Boolean) dwdVar.b.fA()).booleanValue() ? R.string.frequent_faces_off : R.string.frequent_faces_on));
        }
        if (!this.a.m.contains("pref_category_custom_hotkeys")) {
            g("pref_category_custom_hotkeys");
        }
        int i3 = 2;
        findPreference("pref_category_gestures").setSummary(findPreference(htu.e.a) != null ? getResources().getString(R.string.pref_gestures_summary, getResources().getString(R.string.pref_camera_volume_key_action_title), getResources().getString(R.string.pref_camera_double_tap_action_title)) : getResources().getString(R.string.pref_camera_volume_key_action_title));
        Preference preferenceFindPreference = findPreference("pref_category_storage");
        if (preferenceFindPreference != null) {
            preferenceFindPreference.setSummary(getResources().getString(R.string.pref_storage_summary, getResources().getString(R.string.pref_low_storage_mode), getResources().getString(R.string.pref_free_up_space)));
        }
        ListPreference listPreference = (ListPreference) findPreference(htu.c.a);
        listPreference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue(listPreference.getValue())]);
        listPreference.setOnPreferenceChangeListener(new fbt(this, i3));
        findPreference("pref_config_name_fast_option_available_key").setOnPreferenceClickListener(new xxx(activity));
        findPreference("pref_deleted_settings_option_available_key").setOnPreferenceClickListener(new tsp(activity));
        findPreference("pref_load_awb_option_available_key").setOnPreferenceClickListener(new loadawb(activity));
        findPreference("pref_load_nm_option_available_key").setOnPreferenceClickListener(new loadnoise(activity));
        Preference preferenceFindPreference2 = findPreference("pref_dnd_access_needed");
        if (preferenceFindPreference2 != null) {
            preferenceFindPreference2.setOnPreferenceClickListener(new fbw(this, i));
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("pref_category_resolution_camera");
        if (preferenceCategory != null) {
            Preference preferenceFindPreference3 = preferenceCategory.findPreference("pref_camera_resolution");
            Preference preferenceFindPreference4 = preferenceCategory.findPreference("pref_camera_selfie_mirror_key");
            preferenceCategory.removeAll();
            if (preferenceFindPreference3 != null) {
                preferenceCategory.addPreference(preferenceFindPreference3);
            }
            if (preferenceFindPreference4 != null) {
                preferenceCategory.addPreference(preferenceFindPreference4);
            }
        }
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        if (!b()) {
            a();
        }
        ManagedSwitchPreference managedSwitchPreference = this.e;
        if (managedSwitchPreference != null) {
            managedSwitchPreference.setEnabled(true);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 13, instructions: 37 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:34)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:24)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:295)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcb.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
