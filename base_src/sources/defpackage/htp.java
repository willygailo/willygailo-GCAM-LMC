package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class htp {
    public final hub a;
    public final lis b;

    public htp(hub hubVar, lir lirVar) {
        this.a = hubVar;
        this.b = lirVar.a("Settings");
    }

    public final lda a(String str, boolean z) {
        if (!this.a.n(str)) {
            lis lisVar = this.b;
            StringBuilder sb = new StringBuilder(str.length() + 46);
            sb.append("Initializing default value (");
            sb.append(z);
            sb.append(") for key: (");
            sb.append(str);
            sb.append(")");
            lisVar.f(sb.toString());
            this.a.l(str, z);
        }
        return new hst(this.a, str);
    }

    public final lda b(String str, int i) {
        if (!this.a.n(str)) {
            lis lisVar = this.b;
            StringBuilder sb = new StringBuilder(str.length() + 52);
            sb.append("Initializing default value (");
            sb.append(i);
            sb.append(") for key: (");
            sb.append(str);
            sb.append(")");
            lisVar.f(sb.toString());
            this.a.i(str, i);
        }
        return new hta(this.a, str);
    }

    public final lda c(String str, String str2) {
        if (!this.a.n(str)) {
            lis lisVar = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 41 + String.valueOf(str).length());
            sb.append("Initializing default value (");
            sb.append(str2);
            sb.append(") for key: (");
            sb.append(str);
            sb.append(")");
            lisVar.f(sb.toString());
            this.a.k(str, str2);
        }
        return new hui(this.a, str);
    }
}
