package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class cei {
    private Uri a;
    private String b;
    private Boolean c;

    public final cej a() {
        String str;
        Boolean bool;
        Uri uri = this.a;
        if (uri != null && (str = this.b) != null && (bool = this.c) != null) {
            return new cej(uri, str, bool.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" uri");
        }
        if (this.b == null) {
            sb.append(" mediaId");
        }
        if (this.c == null) {
            sb.append(" isDeleted");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null mediaId");
        }
        this.b = str;
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.a = uri;
    }
}
