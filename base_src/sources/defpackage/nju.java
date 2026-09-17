package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class nju {
    public Boolean a;
    public njy b;
    private Uri c;
    private pqm d;
    private njo e;
    private oom f;
    private Boolean g;

    public final njv a() {
        pqm pqmVar;
        njo njoVar;
        njy njyVar;
        Boolean bool;
        if (this.f == null) {
            this.f = oom.l();
        }
        Uri uri = this.c;
        if (uri != null && (pqmVar = this.d) != null && (njoVar = this.e) != null && (njyVar = this.b) != null && (bool = this.a) != null && this.g != null) {
            return new njv(uri, pqmVar, njoVar, this.f, njyVar, bool.booleanValue(), this.g.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" uri");
        }
        if (this.d == null) {
            sb.append(" schema");
        }
        if (this.e == null) {
            sb.append(" handler");
        }
        if (this.b == null) {
            sb.append(" variantConfig");
        }
        if (this.a == null) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if (this.g == null) {
            sb.append(" enableTracing");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b() {
        this.g = false;
    }

    public final void c(njo njoVar) {
        if (njoVar == null) {
            throw new NullPointerException("Null handler");
        }
        this.e = njoVar;
    }

    public final void d(pqm pqmVar) {
        if (pqmVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.d = pqmVar;
    }

    public final void e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.c = uri;
    }
}
