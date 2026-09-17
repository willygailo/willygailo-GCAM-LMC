package defpackage;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class nhj {
    private final nhm a = new nhm(100);

    public final boolean a(CharSequence charSequence, nhh nhhVar) {
        String str = nhhVar.a;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = this.a.a(str).matcher(charSequence);
        return matcher.lookingAt() && matcher.matches();
    }
}
