package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
final class ahd {
    final int a;
    final int b;
    final String c;

    public ahd(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.A;
        this.b = preference.B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahd)) {
            return false;
        }
        ahd ahdVar = (ahd) obj;
        return this.a == ahdVar.a && this.b == ahdVar.b && TextUtils.equals(this.c, ahdVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
