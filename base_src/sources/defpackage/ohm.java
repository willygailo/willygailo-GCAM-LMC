package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ohm {
    private Integer a;
    private Integer b;
    private ohl c;
    private Integer d;
    private Float e;
    private Integer f;
    private Integer g;

    public final ohn a() {
        Integer num = this.a;
        if (num != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new ohn(num.intValue(), this.b.intValue(), this.c, this.d.intValue(), this.e.floatValue(), this.f.intValue(), this.g.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" thumbnailImageWidthPixels");
        }
        if (this.b == null) {
            sb.append(" thumbnailImageHeightPixels");
        }
        if (this.c == null) {
            sb.append(" thumbnailImageColorspace");
        }
        if (this.d == null) {
            sb.append(" videoFramesPerSecond");
        }
        if (this.e == null) {
            sb.append(" audioSampleRateHz");
        }
        if (this.f == null) {
            sb.append(" audioBytesPerSample");
        }
        if (this.g == null) {
            sb.append(" audioNumChannels");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void d(float f) {
        this.e = Float.valueOf(f);
    }

    public final void e(ohl ohlVar) {
        if (ohlVar == null) {
            throw new NullPointerException("Null thumbnailImageColorspace");
        }
        this.c = ohlVar;
    }

    public final void f(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void g(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void h(int i) {
        this.d = Integer.valueOf(i);
    }
}
