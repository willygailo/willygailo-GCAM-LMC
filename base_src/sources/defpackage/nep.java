package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class nep {
    final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    final boolean f;
    final boolean g;
    public final boolean h;
    final oiu i;

    public nep(Uri uri) {
        this(uri, "", "", false, false);
    }

    public nep(Uri uri, String str, String str2, boolean z, boolean z2) {
        this.a = null;
        this.b = uri;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = false;
        this.g = false;
        this.h = z2;
        this.i = null;
    }

    public final nep a() {
        Uri uri = this.b;
        if (uri != null) {
            return new nep(uri, this.c, this.d, this.e, true);
        }
        throw new IllegalStateException("Cannot set enableAutoSubpackage on SharedPrefs-backed flags");
    }

    public final nep b() {
        if (this.c.isEmpty()) {
            return new nep(this.b, this.c, this.d, true, this.h);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    @Deprecated
    public final ner c(String str, boolean z) {
        return ner.b(this, str, Boolean.valueOf(z), false);
    }

    public final ner d(String str, long j) {
        return ner.c(this, str, Long.valueOf(j), true);
    }

    public final ner e(String str, String str2) {
        return ner.d(this, str, str2, true);
    }

    public final ner f(String str, boolean z) {
        return ner.b(this, str, Boolean.valueOf(z), true);
    }
}
