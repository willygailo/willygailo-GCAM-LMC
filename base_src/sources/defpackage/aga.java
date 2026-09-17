package defpackage;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* JADX INFO: loaded from: classes.dex */
public final class aga extends agr {
    public EditText aa;
    public final Runnable ab = new afz(this);
    public long ac = -1;
    private CharSequence ad;

    private final EditTextPreference am() {
        return (EditTextPreference) al();
    }

    @Override // defpackage.agr
    protected final void ah(View view) {
        super.ah(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.aa = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.aa.setText(this.ad);
        EditText editText2 = this.aa;
        editText2.setSelection(editText2.getText().length());
        am();
    }

    @Override // defpackage.agr
    public final void ai(boolean z) {
        if (z) {
            String string = this.aa.getText().toString();
            EditTextPreference editTextPreferenceAm = am();
            if (editTextPreferenceAm.U(string)) {
                editTextPreferenceAm.i(string);
            }
        }
    }

    @Override // defpackage.agr
    protected final boolean aj() {
        return true;
    }

    public final void ak() {
        this.ac = -1L;
    }

    @Override // defpackage.agr, defpackage.bp, defpackage.bu
    public final void f(Bundle bundle) {
        super.f(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.ad);
    }

    @Override // defpackage.agr, defpackage.bp, defpackage.bu
    public final void gA(Bundle bundle) {
        super.gA(bundle);
        if (bundle == null) {
            this.ad = am().g;
        } else {
            this.ad = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }
}
