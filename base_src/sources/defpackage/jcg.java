package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jcg {
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private oom d;

    public final jch a() {
        Boolean bool = this.a;
        if (bool != null && this.b != null && this.c != null && this.d != null) {
            return new jch(bool.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" supportDocumentScanning");
        }
        if (this.b == null) {
            sb.append(" supportTextFilterIntent");
        }
        if (this.c == null) {
            sb.append(" supportTranslate");
        }
        if (this.d == null) {
            sb.append(" supportedTranslateLanguages");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void e(oom oomVar) {
        if (oomVar == null) {
            throw new NullPointerException("Null supportedTranslateLanguages");
        }
        this.d = oomVar;
    }
}
