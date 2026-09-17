package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final class dfn {
    public hsp a;
    public lig b;
    private Long c;
    private oom d;
    private String e;
    private String f;
    private Instant g;
    private Instant h;
    private Uri i;
    private Boolean j;
    private Integer k;

    public dfn() {
    }

    public dfn(dfo dfoVar) {
        this.c = Long.valueOf(dfoVar.b);
        this.a = dfoVar.c;
        this.d = dfoVar.d;
        this.e = dfoVar.e;
        this.f = dfoVar.f;
        this.g = dfoVar.g;
        this.h = dfoVar.h;
        this.i = dfoVar.i;
        this.j = Boolean.valueOf(dfoVar.j);
        this.b = dfoVar.k;
        this.k = Integer.valueOf(dfoVar.l);
    }

    public final dfo a() {
        Long l = this.c;
        if (l == null) {
            throw new IllegalStateException("Property \"contentId\" has not been set");
        }
        oom oomVarJ = oom.j(oom.m(Long.valueOf(l.longValue())));
        this.d = oomVarJ;
        Long l2 = this.c;
        if (l2 != null && oomVarJ != null && this.e != null && this.f != null && this.g != null && this.h != null && this.i != null && this.j != null && this.b != null && this.k != null) {
            return new dez(l2.longValue(), this.a, this.d, this.e, this.f, this.g, this.h, this.i, this.j.booleanValue(), this.b, this.k.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" contentId");
        }
        if (this.d == null) {
            sb.append(" allContentIds");
        }
        if (this.e == null) {
            sb.append(" title");
        }
        if (this.f == null) {
            sb.append(" mimeType");
        }
        if (this.g == null) {
            sb.append(" creationInstant");
        }
        if (this.h == null) {
            sb.append(" lastModifiedInstant");
        }
        if (this.i == null) {
            sb.append(" uri");
        }
        if (this.j == null) {
            sb.append(" inProgress");
        }
        if (this.b == null) {
            sb.append(" dimensions");
        }
        if (this.k == null) {
            sb.append(" orientation");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(long j) {
        this.c = Long.valueOf(j);
    }

    public final void c(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null creationInstant");
        }
        this.g = instant;
    }

    public final void d(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    public final void e(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null lastModifiedInstant");
        }
        this.h = instant;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        this.f = str;
    }

    public final void g(int i) {
        this.k = Integer.valueOf(i);
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.e = str;
    }

    public final void i(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.i = uri;
    }
}
