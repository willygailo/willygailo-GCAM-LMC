package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public class agy extends bu implements ahi, ahg, ahh, afw {
    public ahj a;
    RecyclerView b;
    public boolean c;
    public boolean d;
    private final agu ab = new agu(this);
    private int ac = R.layout.preference_list_fragment;
    public final Handler aa = new ags(this);
    private final Runnable ad = new agt(this);

    @Override // defpackage.bu
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = r().obtainStyledAttributes(null, ahn.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.ac = typedArrayObtainStyledAttributes.getResourceId(0, this.ac);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(r());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.ac, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!r().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            recyclerView.V(new LinearLayoutManager());
            recyclerView.T(new ahl(recyclerView));
        }
        if (recyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.b = recyclerView;
        recyclerView.am(this.ab);
        agu aguVar = this.ab;
        if (drawable != null) {
            aguVar.b = drawable.getIntrinsicHeight();
        } else {
            aguVar.b = 0;
        }
        aguVar.a = drawable;
        aguVar.d.b.G();
        if (dimensionPixelSize != -1) {
            agu aguVar2 = this.ab;
            aguVar2.b = dimensionPixelSize;
            aguVar2.d.b.G();
        }
        this.ab.c = z;
        if (this.b.getParent() == null) {
            viewGroup2.addView(this.b);
        }
        this.aa.post(this.ad);
        return viewInflate;
    }

    @Override // defpackage.bu
    public final void M(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenK;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenK = k()) != null) {
            preferenceScreenK.x(bundle2);
        }
        if (this.c) {
            l();
        }
        this.d = true;
    }

    @Override // defpackage.afw
    public final Preference a(CharSequence charSequence) {
        ahj ahjVar = this.a;
        if (ahjVar == null) {
            return null;
        }
        return ahjVar.e(charSequence);
    }

    @Override // defpackage.ahg
    public final void ah(Preference preference) {
        bp agiVar;
        if ((r() instanceof agv) && ((agv) r()).a()) {
            return;
        }
        if (!((w() instanceof agv) && ((agv) w()).a()) && z().d("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.t;
                agiVar = new aga();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                agiVar.Q(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.t;
                agiVar = new agf();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                agiVar.Q(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = preference.t;
                agiVar = new agi();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                agiVar.Q(bundle3);
            }
            agiVar.ae(this);
            agiVar.k(z(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // defpackage.ahi
    public final boolean ai(Preference preference) {
        if (preference.v == null) {
            return false;
        }
        if ((!(r() instanceof agw) || !((agw) r()).a()) && (!(w() instanceof agw) || !((agw) w()).a())) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            cu cuVarZ = z();
            Bundle bundleR = preference.r();
            ce ceVarE = cuVarZ.e();
            x().getClassLoader();
            bu buVarB = ceVarE.b(preference.v);
            buVarB.Q(bundleR);
            buVarB.ae(this);
            dd ddVarH = cuVarZ.h();
            ddVarH.p(((View) this.M.getParent()).getId(), buVarB);
            if (!ddVarH.k) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            ddVarH.j = true;
            ddVarH.l = null;
            ddVarH.g();
        }
        return true;
    }

    @Override // defpackage.ahh
    public final void aj() {
        if (!((r() instanceof agx) && ((agx) r()).a()) && (w() instanceof agx)) {
            ((agx) w()).a();
        }
    }

    @Override // defpackage.bu
    public final void f(Bundle bundle) {
        PreferenceScreen preferenceScreenK = k();
        if (preferenceScreenK != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenK.y(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.bu
    public final void g() {
        super.g();
        ahj ahjVar = this.a;
        ahjVar.c = this;
        ahjVar.d = this;
    }

    @Override // defpackage.bu
    public void gA(Bundle bundle) {
        super.gA(bundle);
        TypedValue typedValue = new TypedValue();
        r().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        r().getTheme().applyStyle(i, false);
        ahj ahjVar = new ahj(r());
        this.a = ahjVar;
        ahjVar.e = this;
        Bundle bundle2 = this.l;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
    }

    @Override // defpackage.bu
    public final void gw() {
        this.aa.removeCallbacks(this.ad);
        this.aa.removeMessages(1);
        if (this.c) {
            this.b.U(null);
            PreferenceScreen preferenceScreenK = k();
            if (preferenceScreenK != null) {
                preferenceScreenK.D();
            }
        }
        this.b = null;
        super.gw();
    }

    @Override // defpackage.bu
    public final void h() {
        super.h();
        ahj ahjVar = this.a;
        ahjVar.c = null;
        ahjVar.d = null;
    }

    public PreferenceScreen k() {
        throw null;
    }

    final void l() {
        PreferenceScreen preferenceScreenK = k();
        if (preferenceScreenK != null) {
            this.b.U(new ahe(preferenceScreenK));
            preferenceScreenK.B();
        }
    }
}
