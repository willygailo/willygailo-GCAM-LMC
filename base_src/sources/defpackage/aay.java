package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class aay {
    public final aaz a;

    static {
        new LocaleList(new Locale[0]);
    }

    public aay(aaz aazVar) {
        this.a = aazVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aay) && this.a.equals(((aay) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
