package com.google.android.apps.camera.legacy.app.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.TwoStatePreference;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.MenuItem;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import defpackage.bui;
import defpackage.ddf;
import defpackage.ddl;
import defpackage.etd;
import defpackage.euv;
import defpackage.ewb;
import defpackage.fcb;
import defpackage.fhq;
import defpackage.fjs;
import defpackage.hu;
import defpackage.iy;
import defpackage.jh;
import defpackage.jp;
import defpackage.ljf;
import defpackage.lzi;
import defpackage.miq;
import defpackage.ouj;

/* JADX INFO: loaded from: classes.dex */
public class CameraSettingsActivity extends etd {
    public static boolean p;
    public static boolean q;
    public ddf r;
    public lzi s;
    private final Object v = new Object();
    private fcb w;
    private boolean x;
    public static final ouj o = ouj.h("com/google/android/apps/camera/legacy/app/settings/CameraSettingsActivity");
    public static boolean isrestart = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.preference.PreferenceGroup] */
    public static void n(final fjs fjsVar, Preference preference) {
        final Object value;
        if (preference.getKey().equals("pref_category_developer")) {
            return;
        }
        boolean z = preference instanceof PreferenceGroup;
        if (z) {
            ?? r3 = (PreferenceGroup) preference;
            for (?? r0 = z; r0 < r3.getPreferenceCount(); r0++) {
                n(fjsVar, r3.getPreference(r0));
            }
            return;
        }
        if (preference.getOnPreferenceChangeListener() == null) {
            if (preference instanceof TwoStatePreference) {
                value = Boolean.valueOf(((TwoStatePreference) preference).isChecked());
            } else if (!(preference instanceof ListPreference)) {
                return;
            } else {
                value = ((ListPreference) preference).getValue();
            }
            preference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: fbs
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference2, Object obj) {
                    fjsVar.p(preference2.getKey(), value, obj);
                    return true;
                }
            });
        }
    }

    @Override // defpackage.fio, defpackage.ub, android.app.Activity
    public final void onBackPressed() {
        Context applicationContext = getApplicationContext();
        super.onBackPressed();
        if (isrestart) {
            Intent intent = new Intent(applicationContext, (Class<?>) CameraActivity.class);
            intent.addFlags(32768);
            intent.addFlags(268435456);
            intent.addFlags(65536);
            applicationContext.startActivity(intent);
            System.exit(0);
        }
    }

    @Override // defpackage.etd, defpackage.fio, defpackage.by, defpackage.ub, defpackage.ds, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (!this.x) {
            synchronized (this.v) {
                if (!this.x) {
                    euv euvVarD = ((CameraApp) getApplicationContext()).d();
                    ((etd) this).k = (ljf) ((ewb) euvVarD).k.get();
                    this.n = (bui) ((ewb) euvVarD).B.get();
                    this.l = fhq.b(((ewb) euvVarD).b);
                    this.m = (ddf) ((ewb) euvVarD).i.get();
                    this.r = (ddf) ((ewb) euvVarD).i.get();
                    this.s = (lzi) ((ewb) euvVarD).e.get();
                    this.x = true;
                }
            }
        }
        super.onCreate(bundle);
        p = this.r.k(ddl.ay);
        q = this.s.h();
        if (p) {
            miq.a(this);
            setContentView(R.layout.settings_activity_layout);
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        } else {
            setTheme(2132083562);
            setContentView(R.layout.settings_activity_layout_legacy);
        }
        String stringExtra = getIntent().getStringExtra("pref_screen_title");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        iy iyVar = (iy) g();
        if (iyVar.e instanceof Activity) {
            hu huVarA = iyVar.a();
            if (huVarA instanceof jp) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            iyVar.j = null;
            if (huVarA != null) {
                huVarA.e();
            }
            if (toolbar != null) {
                jh jhVar = new jh(toolbar, iyVar.u(), iyVar.h);
                iyVar.i = jhVar;
                iyVar.g.setCallback(jhVar.c);
            } else {
                iyVar.i = null;
                iyVar.g.setCallback(iyVar.h);
            }
            iyVar.e();
        }
        hu huVarF = f();
        huVarF.getClass();
        huVarF.g(true);
        huVarF.s();
        if (stringExtra == null) {
            setTitle(R.string.pref_camera_settings_category);
            huVarF.u();
        } else {
            setTitle(stringExtra);
            huVarF.i(stringExtra);
        }
        if (!p) {
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(android.R.attr.textColorPrimary, typedValue, true);
            Drawable drawableE = toolbar.e();
            drawableE.getClass();
            drawableE.setColorFilter(typedValue.data, PorterDuff.Mode.SRC_ATOP);
        }
        String stringExtra2 = getIntent().getStringExtra("pref_screen_extra");
        String stringExtra3 = getIntent().getStringExtra("pref_open_setting_page");
        boolean booleanExtra = getIntent().getBooleanExtra("pref_make_setting_page_root", false);
        this.w = new fcb();
        Bundle bundle2 = new Bundle(1);
        bundle2.putString("pref_screen_extra", stringExtra2);
        bundle2.putString("pref_open_setting_page", stringExtra3);
        bundle2.putBoolean("pref_make_setting_page_root", booleanExtra);
        this.w.setArguments(bundle2);
        getFragmentManager().beginTransaction().replace(R.id.settings_activity_content, this.w).commit();
    }

    @Override // defpackage.fio, defpackage.ub, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if ((getIntent().getFlags() & 33554432) != 0) {
                setResult(-1);
            }
            finish();
        }
        return true;
    }

    @Override // defpackage.fio, defpackage.by, defpackage.ub, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == 0) {
                    return;
                }
            }
            fcb fcbVar = this.w;
            int i3 = fcb.c;
            fcbVar.a();
        }
    }
}
