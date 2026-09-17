package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import androidx.preference.ListPreference;

/* JADX INFO: loaded from: classes.dex */
public final class afx implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ DropDownPreference a;

    public afx(DropDownPreference dropDownPreference) {
        this.a = dropDownPreference;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            String string = ((ListPreference) this.a).h[i].toString();
            if (string.equals(((ListPreference) this.a).i) || !this.a.U(string)) {
                return;
            }
            this.a.o(string);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
