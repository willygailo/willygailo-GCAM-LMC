package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* JADX INFO: loaded from: classes.dex */
public final class afv implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ CheckBoxPreference a;

    public afv(CheckBoxPreference checkBoxPreference) {
        this.a = checkBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.a.U(Boolean.valueOf(z))) {
            this.a.k(z);
        } else {
            compoundButton.setChecked(!z);
        }
    }
}
