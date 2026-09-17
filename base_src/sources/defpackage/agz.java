package defpackage;

import androidx.preference.PreferenceGroup;

/* JADX INFO: loaded from: classes.dex */
public final class agz implements Runnable {
    final /* synthetic */ PreferenceGroup a;

    public agz(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            this.a.a.clear();
        }
    }
}
