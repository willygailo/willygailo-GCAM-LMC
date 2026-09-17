package com.google.android.apps.camera.debug.ui;

import android.content.Context;
import android.widget.SearchView;
import androidx.preference.Preference;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.ahm;
import defpackage.djo;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSearchViewPreference extends Preference {
    public SearchView a;
    public SearchView.OnQueryTextListener b;
    public CharSequence c;

    public MaterialSearchViewPreference(Context context) {
        super(context);
        this.c = "";
    }

    @Override // androidx.preference.Preference
    public final void a(ahm ahmVar) {
        super.a(ahmVar);
        SearchView searchView = (SearchView) ahmVar.a.findViewById(R.id.search_view);
        this.a = searchView;
        searchView.setOnQueryTextListener(new djo(this));
        this.a.setQuery(this.c, true);
    }
}
