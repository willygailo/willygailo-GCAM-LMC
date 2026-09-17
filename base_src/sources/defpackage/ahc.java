package defpackage;

import androidx.preference.PreferenceGroup;

/* JADX INFO: loaded from: classes.dex */
final class ahc implements agn {
    final /* synthetic */ PreferenceGroup a;
    final /* synthetic */ ahe b;

    public ahc(ahe aheVar, PreferenceGroup preferenceGroup) {
        this.b = aheVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.agn
    public final boolean a() {
        this.a.ad(Integer.MAX_VALUE);
        this.b.f();
        return true;
    }
}
