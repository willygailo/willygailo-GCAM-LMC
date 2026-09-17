package defpackage;

import android.view.View;
import androidx.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
public final class agj implements View.OnClickListener {
    final /* synthetic */ Preference a;

    public agj(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.gn(view);
    }
}
