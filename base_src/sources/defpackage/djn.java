package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.SearchView;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.debug.ui.MaterialSearchViewPreference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class djn {
    public final Context a;
    public final SharedPreferences b;
    public PreferenceScreen c;
    public final List d = new ArrayList();

    public djn(Context context) {
        us usVar = new us(context, 2132083561);
        this.a = usVar;
        this.b = ahj.c(usVar);
    }

    public final void a(PreferenceScreen preferenceScreen) {
        this.c = preferenceScreen;
        Preference preference = new Preference(this.a);
        preference.R("Reset to default values");
        final int i = 0;
        preference.o = new agn(this) { // from class: djk
            public final /* synthetic */ djn a;

            {
                this.a = this;
            }

            @Override // defpackage.agn
            public final boolean a() {
                switch (i) {
                    case 0:
                        djn djnVar = this.a;
                        int iK = djnVar.c.k();
                        SharedPreferences.Editor editorEdit = djnVar.b.edit();
                        Iterator it = djnVar.d.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove(((djm) it.next()).b.t);
                        }
                        for (int i2 = 0; i2 < iK; i2++) {
                            editorEdit.remove(djnVar.c.o(i2).t);
                        }
                        editorEdit.apply();
                        djnVar.c.ac();
                        djnVar.a(djnVar.c);
                        break;
                    default:
                        mvc.a(this.a.a);
                        break;
                }
                return true;
            }
        };
        this.c.ag(preference);
        Preference preference2 = new Preference(this.a);
        preference2.R("Primes Log");
        final int i2 = 1;
        preference2.o = new agn(this) { // from class: djk
            public final /* synthetic */ djn a;

            {
                this.a = this;
            }

            @Override // defpackage.agn
            public final boolean a() {
                switch (i2) {
                    case 0:
                        djn djnVar = this.a;
                        int iK = djnVar.c.k();
                        SharedPreferences.Editor editorEdit = djnVar.b.edit();
                        Iterator it = djnVar.d.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove(((djm) it.next()).b.t);
                        }
                        for (int i3 = 0; i3 < iK; i3++) {
                            editorEdit.remove(djnVar.c.o(i3).t);
                        }
                        editorEdit.apply();
                        djnVar.c.ac();
                        djnVar.a(djnVar.c);
                        break;
                    default:
                        mvc.a(this.a.a);
                        break;
                }
                return true;
            }
        };
        this.c.ag(preference2);
        String string = this.b.getString("dev_setting_filter_key", "");
        MaterialSearchViewPreference materialSearchViewPreference = new MaterialSearchViewPreference(this.c.j);
        materialSearchViewPreference.A = R.layout.search_view_preference;
        materialSearchViewPreference.c = string;
        SearchView searchView = materialSearchViewPreference.a;
        if (searchView != null) {
            searchView.setQuery(string, true);
        }
        materialSearchViewPreference.b = new djl(this);
        this.c.ag(materialSearchViewPreference);
        this.d.clear();
        EditTextPreference editTextPreference = new EditTextPreference(this.c.j, null);
        editTextPreference.R("camera.onscreen_logcat_filter");
        editTextPreference.A = R.layout.preference_with_margin;
        this.d.add(new djm(editTextPreference));
        String string2 = this.b.contains("camera.onscreen_logcat_filter") ? this.b.getString("camera.onscreen_logcat_filter", "Gca") : "Gca";
        editTextPreference.i(string2);
        editTextPreference.n(string2);
        editTextPreference.n = new agm() { // from class: djj
            @Override // defpackage.agm
            public final boolean b(Preference preference3, Object obj) {
                djn djnVar = this.a;
                String str = (String) obj;
                preference3.n(str);
                SharedPreferences.Editor editorEdit = djnVar.b.edit();
                editorEdit.putString("camera.onscreen_logcat_filter", str);
                editorEdit.apply();
                return true;
            }
        };
        PreferenceCategory preferenceCategory = new PreferenceCategory(this.a);
        preferenceCategory.A = R.layout.material_preference_category_layout;
        preferenceScreen.ag(preferenceCategory);
        Collections.sort(this.d, cdg.d);
        String[] strArrSplit = this.b.getString("dev_setting_filter_key", "").split("(,|\\s)+", -1);
        for (djm djmVar : this.d) {
            for (String str : strArrSplit) {
                if (djmVar.a.contains(str)) {
                    preferenceCategory.ag(djmVar.b);
                    break;
                }
            }
        }
        Preference preferenceL = this.c.l(ddl.av.a);
        Preference preferenceL2 = this.c.l(ddl.au.a);
        if (preferenceL2 != null && preferenceL != null) {
            preferenceL2.H(ddl.av.a);
        }
        Preference preferenceL3 = this.c.l("camera.onscreen_logcat_filter");
        if (preferenceL3 == null || preferenceL2 == null) {
            return;
        }
        preferenceL3.H(ddl.au.a);
    }

    public final void b(String str) {
        this.b.edit().putString("dev_setting_filter_key", str).apply();
        this.c.ac();
        a(this.c);
    }
}
