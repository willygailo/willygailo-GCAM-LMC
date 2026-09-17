package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.preference.Preference;

/* JADX INFO: loaded from: classes2.dex */
public class tsp implements Preference.OnPreferenceClickListener {
    private final /* synthetic */ Activity a;

    tsp(Activity activity) {
        this.a = activity;
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        new AlertDialog.Builder(this.a).setTitle("Restore settings?").setPositiveButton("Yes", new ztq(this.a)).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).create().show();
        return true;
    }
}
