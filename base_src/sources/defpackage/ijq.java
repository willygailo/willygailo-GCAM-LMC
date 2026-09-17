package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ijq {
    public Boolean a;
    public Boolean b;

    public final ijr a() {
        Boolean bool = this.a;
        if (bool != null && this.b != null) {
            return new ijr(bool.booleanValue(), this.b.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" logDurationFromStart");
        }
        if (this.b == null) {
            sb.append(" logDurationFromLast");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
