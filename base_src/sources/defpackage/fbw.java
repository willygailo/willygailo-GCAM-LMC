package defpackage;

import android.content.Intent;
import android.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fbw implements Preference.OnPreferenceClickListener {
    public final /* synthetic */ fcb a;
    private final /* synthetic */ int b;

    public /* synthetic */ fbw(fcb fcbVar, int i) {
        this.b = i;
        this.a = fcbVar;
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        switch (this.b) {
            case 0:
                this.a.startActivityForResult(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"), 2);
                return true;
            default:
                this.a.a.j.ag(2);
                return false;
        }
    }
}
