package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class agd implements agp {
    public static agd a;
    public static agd b;
    private final /* synthetic */ int c;

    public agd(int i) {
        this.c = i;
    }

    @Override // defpackage.agp
    public final /* synthetic */ CharSequence a(Preference preference) {
        switch (this.c) {
            case 0:
                ListPreference listPreference = (ListPreference) preference;
                return TextUtils.isEmpty(listPreference.l()) ? listPreference.j.getString(R.string.not_set) : listPreference.l();
            default:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                return TextUtils.isEmpty(editTextPreference.g) ? editTextPreference.j.getString(R.string.not_set) : editTextPreference.g;
        }
    }
}
