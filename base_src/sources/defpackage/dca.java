package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dca {
    public Integer a;
    public iax b;

    public final dcb a() {
        Integer num = this.a;
        if (num != null && this.b != null) {
            return new dcb(num.intValue(), this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" successiveSamplesRequired");
        }
        if (this.b == null) {
            sb.append(" suggestion");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }
}
