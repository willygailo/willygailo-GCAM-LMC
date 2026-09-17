package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lbc {
    public String a;
    public Boolean b;
    public lbb c;
    private Integer d;
    private Integer e;

    public final lbd a() {
        Integer num = this.d;
        if (num != null && this.a != null && this.e != null && this.b != null && this.c != null) {
            return new lbd(num.intValue(), this.a, this.e.intValue(), this.b.booleanValue(), this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" threadCount");
        }
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.e == null) {
            sb.append(" androidThreadPriority");
        }
        if (this.b == null) {
            sb.append(" propagateErrors");
        }
        if (this.c == null) {
            sb.append(" threadBodyDecorator");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }
}
