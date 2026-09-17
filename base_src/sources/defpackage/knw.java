package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class knw {
    private final String a;
    private final String b = "";
    private final int c;

    public knw(String str) {
        this.a = str;
        int i = 2;
        mip.dn(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.c = i;
    }

    protected final String a(String str) {
        return this.b.concat(str);
    }

    public final void b(String str) {
        if (this.c <= 3) {
            a(str);
        }
    }

    public final void c(String str) {
        Log.e(this.a, a(str));
    }
}
