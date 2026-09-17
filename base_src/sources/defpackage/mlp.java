package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mlp {
    public String a;
    public String b;
    private Integer c;
    private Integer d;

    public final mlq a() {
        String str;
        Integer num;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null && (num = this.c) != null && this.d != null) {
            return new mlq(str2, str, num.intValue(), this.d.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mime");
        }
        if (this.b == null) {
            sb.append(" semantic");
        }
        if (this.c == null) {
            sb.append(" length");
        }
        if (this.d == null) {
            sb.append(" padding");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }
}
