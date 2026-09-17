package defpackage;

import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class aaz {
    public final LocaleList a;

    public aaz(LocaleList localeList) {
        this.a = localeList;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((aaz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
