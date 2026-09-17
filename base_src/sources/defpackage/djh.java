package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.SearchView;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class djh {
    public final Context a;
    public final SharedPreferences b;
    public PreferenceScreen c;
    public final List d = new ArrayList();
    private final boolean f;
    private final ddf sh;

    /* JADX INFO: renamed from: djh$5, reason: invalid class name */
    public final class AnonymousClass5 extends CheckBoxPreference {
        public boolean showAsChecked;

        public AnonymousClass5(Context context, String str, String str2) {
            super(context);
            setKey(str);
            setTitle(str2);
        }

        private final CheckBox findCheckBox(View view) {
            if (view instanceof CheckBox) {
                return (CheckBox) view;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                CheckBox checkBoxFindCheckBox = findCheckBox(viewGroup.getChildAt(i));
                if (checkBoxFindCheckBox != null) {
                    return checkBoxFindCheckBox;
                }
            }
            return null;
        }

        @Override // android.preference.CheckBoxPreference, android.preference.Preference
        public final void onBindView(View view) {
            super.onBindView(view);
            if (isEnabled()) {
                return;
            }
            CheckBox checkBoxFindCheckBox = findCheckBox(view);
            if (this.showAsChecked) {
                if (checkBoxFindCheckBox != null) {
                    checkBoxFindCheckBox.setChecked(true);
                }
            } else {
                if (checkBoxFindCheckBox == null) {
                    return;
                }
                checkBoxFindCheckBox.setChecked(false);
            }
        }
    }

    public djh(Context context, ddf ddfVar) {
        us usVar = new us(context, 2132083561);
        this.a = usVar;
        this.b = PreferenceManager.getDefaultSharedPreferences(usVar);
        this.sh = ddfVar;
        this.f = ddfVar.k(ddl.ay);
    }

    public final void a(PreferenceScreen preferenceScreen) {
        this.c = preferenceScreen;
        Preference preference = new Preference(this.a);
        preference.setTitle("Reset to default values");
        final int i = 0;
        preference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(this) { // from class: dje
            public final /* synthetic */ djh a;

            {
                this.a = this;
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference2) {
                switch (i) {
                    case 0:
                        djh djhVar = this.a;
                        int preferenceCount = djhVar.c.getPreferenceCount();
                        SharedPreferences.Editor editorEdit = djhVar.b.edit();
                        Iterator it = djhVar.d.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove(((djg) it.next()).b.getKey());
                        }
                        for (int i2 = 0; i2 < preferenceCount; i2++) {
                            editorEdit.remove(djhVar.c.getPreference(i2).getKey());
                        }
                        editorEdit.apply();
                        djhVar.c.removeAll();
                        djhVar.a(djhVar.c);
                        break;
                    default:
                        mvc.a(this.a.a);
                        break;
                }
                return true;
            }
        });
        this.c.addPreference(preference);
        Preference preference2 = new Preference(this.a);
        preference2.setTitle("Primes Log");
        final int i2 = 1;
        preference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(this) { // from class: dje
            public final /* synthetic */ djh a;

            {
                this.a = this;
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference3) {
                switch (i2) {
                    case 0:
                        djh djhVar = this.a;
                        int preferenceCount = djhVar.c.getPreferenceCount();
                        SharedPreferences.Editor editorEdit = djhVar.b.edit();
                        Iterator it = djhVar.d.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove(((djg) it.next()).b.getKey());
                        }
                        for (int i3 = 0; i3 < preferenceCount; i3++) {
                            editorEdit.remove(djhVar.c.getPreference(i3).getKey());
                        }
                        editorEdit.apply();
                        djhVar.c.removeAll();
                        djhVar.a(djhVar.c);
                        break;
                    default:
                        mvc.a(this.a.a);
                        break;
                }
                return true;
            }
        });
        this.c.addPreference(preference2);
        String string = this.b.getString("dev_setting_filter_key", "");
        djq djqVar = new djq(this.c.getContext());
        djqVar.c = string;
        SearchView searchView = djqVar.a;
        if (searchView != null) {
            searchView.setQuery(string, true);
        }
        djqVar.b = new djf(this);
        this.c.addPreference(djqVar);
        this.d.clear();
        EditTextPreference editTextPreference = new EditTextPreference(this.c.getContext());
        editTextPreference.setTitle("camera.onscreen_logcat_filter");
        editTextPreference.setLayoutResource(R.layout.preference_with_margin);
        this.d.add(new djg("camera.onscreen_logcat_filter", editTextPreference));
        c();
        String string2 = this.b.contains("camera.onscreen_logcat_filter") ? this.b.getString("camera.onscreen_logcat_filter", "Gca") : "Gca";
        editTextPreference.setText(string2);
        editTextPreference.setSummary(string2);
        editTextPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: djd
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference3, Object obj) {
                djh djhVar = this.a;
                String str = (String) obj;
                preference3.setSummary(str);
                SharedPreferences.Editor editorEdit = djhVar.b.edit();
                editorEdit.putString("camera.onscreen_logcat_filter", str);
                editorEdit.apply();
                return true;
            }
        });
        PreferenceCategory preferenceCategory = new PreferenceCategory(this.a);
        ddf ddfVar = this.sh;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        preferenceCategory.setLayoutResource(true != this.f ? R.layout.preference_category_layout_legacy : R.layout.preference_category_layout);
        preferenceScreen.addPreference(preferenceCategory);
        Collections.sort(this.d, cdg.c);
        String[] strArrSplit = this.b.getString("dev_setting_filter_key", "").split("(,|\\s)+", -1);
        for (djg djgVar : this.d) {
            for (String str : strArrSplit) {
                if (djgVar.a.contains(str)) {
                    preferenceCategory.addPreference(djgVar.b);
                    break;
                }
            }
        }
        Preference preferenceFindPreference = this.c.findPreference(ddl.av.a);
        Preference preferenceFindPreference2 = this.c.findPreference(ddl.au.a);
        if (preferenceFindPreference2 != null && preferenceFindPreference != null) {
            preferenceFindPreference2.setDependency(ddl.av.a);
        }
        Preference preferenceFindPreference3 = this.c.findPreference("camera.onscreen_logcat_filter");
        if (preferenceFindPreference3 == null || preferenceFindPreference2 == null) {
            return;
        }
        preferenceFindPreference3.setDependency(ddl.au.a);
    }

    public final void b(String str) {
        this.b.edit().putString("dev_setting_filter_key", str).apply();
        this.c.removeAll();
        a(this.c);
    }

    public final void c() {
        int i = 0;
        for (Map.Entry entry : this.sh.sh().entrySet()) {
            e(d(entry.getValue()), d(entry.getKey()));
            i++;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        String name = obj.getClass().getName();
        byte b = -1;
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    b = 1;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    b = 4;
                }
                break;
            case 99303:
                if (name.equals("ddg")) {
                    b = 6;
                }
                break;
            case 99305:
                if (name.equals("ddi")) {
                    b = 5;
                }
                break;
            case 99340:
                if (name.equals("dem")) {
                    b = 7;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    b = 2;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    b = 3;
                }
                break;
            case 1195259493:
                if (name.equals("java.lang.String")) {
                    b = 0;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                return obj;
            case 5:
                return ((ddi) obj).a;
            case 6:
                return ((ddg) obj).a;
            case 7:
                return ((dem) obj).a;
        }
    }

    public void e(Object obj, Object obj2) {
        if (obj != null) {
            switch (obj.getClass().getName().hashCode()) {
                case -2056817302:
                    h((String) obj2, (String) obj2, false, (Integer) obj);
                    break;
                case -527879800:
                    g((String) obj2, (String) obj2, false, (Float) obj);
                    break;
                case 155276373:
                    i((String) obj2, (String) obj2, false, (String) obj);
                    break;
                case 344809556:
                    f((String) obj2, (String) obj2, false, ((Boolean) obj).booleanValue());
                    break;
                case 1195259493:
                    i((String) obj2, (String) obj2, false, (String) obj);
                    break;
            }
        }
    }

    public final void f(final String str, String str2, boolean z, boolean z2) {
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.c.getContext(), str, str2);
        if (z) {
            anonymousClass5.setSummary("Property cannot be changed, already set via setprop!");
            if (z2) {
                anonymousClass5.setEnabled(false);
                anonymousClass5.showAsChecked = true;
            } else {
                anonymousClass5.setEnabled(false);
            }
        } else if (z2) {
            anonymousClass5.setChecked(true);
        }
        anonymousClass5.setLayoutResource(R.layout.preference_with_margin);
        anonymousClass5.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: djh.1
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                djh.this.b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).apply();
                return true;
            }
        });
        this.d.add(new djg(str2, anonymousClass5));
    }

    public final void g(final String str, String str2, boolean z, Float f) {
        EditTextPreference editTextPreference = new EditTextPreference(this.c.getContext());
        editTextPreference.setTitle(str);
        editTextPreference.setLayoutResource(R.layout.preference_with_margin);
        if (this.b.contains(str)) {
            f = Float.valueOf(this.b.getFloat(str, 0.0f));
        }
        editTextPreference.setText(Float.toString(f.floatValue()));
        editTextPreference.setSummary(Float.toString(f.floatValue()));
        editTextPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: djh.2
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                String str3 = (String) obj;
                djh.this.b.edit().putFloat(str, Float.parseFloat(str3)).apply();
                preference.setSummary(Float.toString(Float.parseFloat(str3)));
                return true;
            }
        });
        this.d.add(new djg(str2, editTextPreference));
    }

    public final void h(final String str, String str2, boolean z, Integer num) {
        EditTextPreference editTextPreference = new EditTextPreference(this.c.getContext());
        editTextPreference.setTitle(str);
        editTextPreference.setLayoutResource(R.layout.preference_with_margin);
        if (this.b.contains(str)) {
            num = Integer.valueOf(this.b.getInt(str, 0));
        }
        editTextPreference.setText(Integer.toString(num.intValue()));
        editTextPreference.setSummary(Integer.toString(num.intValue()));
        editTextPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: djh.3
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                String str3 = (String) obj;
                djh.this.b.edit().putInt(str, Integer.parseInt(str3)).apply();
                preference.setSummary(str3);
                return true;
            }
        });
        this.d.add(new djg(str2, editTextPreference));
    }

    public final void i(final String str, String str2, boolean z, String str3) {
        EditTextPreference editTextPreference = new EditTextPreference(this.c.getContext());
        editTextPreference.setTitle(str);
        editTextPreference.setLayoutResource(R.layout.preference_with_margin);
        if (this.b.contains(str)) {
            str3 = this.b.getString(str, null);
        }
        editTextPreference.setText(str3);
        editTextPreference.setSummary(str3);
        editTextPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: djh.4
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                String str4 = (String) obj;
                String str5 = str;
                if (str4 == null || str4.length() <= 0) {
                    djh.this.j(preference, str, str4);
                } else {
                    djh.this.b.edit().putString(str5, str4).apply();
                    preference.setSummary(str4);
                }
                return true;
            }
        });
        this.d.add(new djg(str2, editTextPreference));
    }

    public final void j(Preference preference, String str, String str2) {
        this.b.edit().remove(str).apply();
        preference.setSummary(str2);
    }
}
