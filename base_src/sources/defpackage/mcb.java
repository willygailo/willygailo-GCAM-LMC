package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class mcb {
    public Context a;
    public ContentResolver b;
    public String c;
    public Integer d;
    public Integer e;
    public String f;
    private Uri g;
    private Uri h;
    private String i;
    private String j;
    private String k;
    private Integer l;
    private Integer m;

    public final mcc a() {
        ContentResolver contentResolver;
        Uri uri;
        Uri uri2;
        String str;
        String str2;
        String str3;
        Integer num;
        Context context = this.a;
        if (context != null && (contentResolver = this.b) != null && (uri = this.g) != null && (uri2 = this.h) != null && (str = this.c) != null && (str2 = this.i) != null && (str3 = this.j) != null && (num = this.d) != null && this.e != null && this.f != null && this.k != null && this.l != null && this.m != null) {
            return new mcc(context, contentResolver, uri, uri2, str, str2, str3, num.intValue(), this.e.intValue(), this.f, this.k, this.l.intValue(), this.m.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" context");
        }
        if (this.b == null) {
            sb.append(" contentResolver");
        }
        if (this.g == null) {
            sb.append(" photoInsertUri");
        }
        if (this.h == null) {
            sb.append(" videoInsertUri");
        }
        if (this.c == null) {
            sb.append(" displayNameColumnName");
        }
        if (this.i == null) {
            sb.append(" mimeTypeColumnName");
        }
        if (this.j == null) {
            sb.append(" isPendingColumnName");
        }
        if (this.d == null) {
            sb.append(" isPendingTrue");
        }
        if (this.e == null) {
            sb.append(" isPendingFalse");
        }
        if (this.f == null) {
            sb.append(" relativePathColumnName");
        }
        if (this.k == null) {
            sb.append(" mediaTypeColumnName");
        }
        if (this.l == null) {
            sb.append(" mediaTypeImage");
        }
        if (this.m == null) {
            sb.append(" mediaTypeVideo");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b() {
        this.j = "is_pending";
    }

    public final void c() {
        this.k = "media_type";
    }

    public final void d(int i) {
        this.l = Integer.valueOf(i);
    }

    public final void e(int i) {
        this.m = Integer.valueOf(i);
    }

    public final void f() {
        this.i = "mime_type";
    }

    public final void g(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null photoInsertUri");
        }
        this.g = uri;
    }

    public final void h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null videoInsertUri");
        }
        this.h = uri;
    }
}
