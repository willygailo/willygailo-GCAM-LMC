package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class agi extends agr {
    final Set aa = new HashSet();
    boolean ab;
    CharSequence[] ac;
    CharSequence[] ad;

    private final MultiSelectListPreference am() {
        return (MultiSelectListPreference) al();
    }

    @Override // defpackage.agr
    public final void ai(boolean z) {
        if (z && this.ab) {
            MultiSelectListPreference multiSelectListPreferenceAm = am();
            if (multiSelectListPreferenceAm.U(this.aa)) {
                multiSelectListPreferenceAm.k(this.aa);
            }
        }
        this.ab = false;
    }

    @Override // defpackage.agr, defpackage.bp, defpackage.bu
    public final void f(Bundle bundle) {
        super.f(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.aa));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ab);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ac);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.ad);
    }

    @Override // defpackage.agr
    protected final void fq(id idVar) {
        int length = this.ad.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.aa.contains(this.ad[i].toString());
        }
        CharSequence[] charSequenceArr = this.ac;
        agh aghVar = new agh(this);
        hz hzVar = idVar.a;
        hzVar.n = charSequenceArr;
        hzVar.w = aghVar;
        hzVar.s = zArr;
        hzVar.t = true;
    }

    @Override // defpackage.agr, defpackage.bp, defpackage.bu
    public final void gA(Bundle bundle) {
        super.gA(bundle);
        if (bundle != null) {
            this.aa.clear();
            this.aa.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.ab = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.ac = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.ad = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceAm = am();
        if (multiSelectListPreferenceAm.g == null || multiSelectListPreferenceAm.h == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.aa.clear();
        this.aa.addAll(multiSelectListPreferenceAm.i);
        this.ab = false;
        this.ac = multiSelectListPreferenceAm.g;
        this.ad = multiSelectListPreferenceAm.h;
    }
}
