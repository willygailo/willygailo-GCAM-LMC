package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class hsi {
    private Long a;
    private Uri b;
    private hsr c;
    private Boolean d;

    public final hsj a() {
        Uri uri = this.b;
        if (uri == null) {
            throw new IllegalStateException("Property \"uri\" has not been set");
        }
        obr.aR(!uri.equals(Uri.EMPTY), "MediaStoreRecord should only be created with a valid MediaStore Uri");
        String lastPathSegment = uri.getLastPathSegment();
        lastPathSegment.getClass();
        Long lValueOf = Long.valueOf(Long.parseLong(lastPathSegment));
        this.a = lValueOf;
        if (lValueOf != null && this.b != null && this.c != null && this.d != null) {
            return new hsj(lValueOf.longValue(), this.b, this.c, this.d.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mediaStoreId");
        }
        if (this.b == null) {
            sb.append(" uri");
        }
        if (this.c == null) {
            sb.append(" sessionType");
        }
        if (this.d == null) {
            sb.append(" secure");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void c(hsr hsrVar) {
        if (hsrVar == null) {
            throw new NullPointerException("Null sessionType");
        }
        this.c = hsrVar;
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.b = uri;
    }
}
