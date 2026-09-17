package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iae {
    public iax a;
    private Integer b;
    private Integer c;
    private jrl d;
    private Float e;

    public final iaf a() {
        Integer num = this.b;
        if (num != null && this.c != null && this.a != null && this.d != null && this.e != null) {
            return new iaf(num.intValue(), this.c.intValue(), this.a, this.d, this.e.floatValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" numFramesPerSample");
        }
        if (this.c == null) {
            sb.append(" numSuccessiveSamplesRequired");
        }
        if (this.a == null) {
            sb.append(" suggestion");
        }
        if (this.d == null) {
            sb.append(" applicationMode");
        }
        if (this.e == null) {
            sb.append(" scoreThreshold");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(jrl jrlVar) {
        if (jrlVar == null) {
            throw new NullPointerException("Null applicationMode");
        }
        this.d = jrlVar;
    }

    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void e() {
        this.e = Float.valueOf(0.0f);
    }
}
