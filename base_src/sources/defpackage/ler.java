package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ler {
    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private Integer k;
    private Integer l;
    private Integer m;

    public final les a() {
        Integer num = this.a;
        if (num != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null && this.g != null && this.h != null && this.i != null && this.j != null && this.k != null && this.l != null && this.m != null) {
            return new les(num.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h.intValue(), this.i.intValue(), this.j.intValue(), this.k.intValue(), this.l.intValue(), this.m.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" audioBitRate");
        }
        if (this.b == null) {
            sb.append(" audioChannels");
        }
        if (this.c == null) {
            sb.append(" audioCodec");
        }
        if (this.d == null) {
            sb.append(" audioSampleRate");
        }
        if (this.e == null) {
            sb.append(" fileFormat");
        }
        if (this.f == null) {
            sb.append(" quality");
        }
        if (this.g == null) {
            sb.append(" videoBitRate");
        }
        if (this.h == null) {
            sb.append(" videoCodec");
        }
        if (this.i == null) {
            sb.append(" videoCodecProfile");
        }
        if (this.j == null) {
            sb.append(" videoCodecLevel");
        }
        if (this.k == null) {
            sb.append(" videoFrameHeight");
        }
        if (this.l == null) {
            sb.append(" videoFrameRate");
        }
        if (this.m == null) {
            sb.append(" videoFrameWidth");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void e(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void f(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void g(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void h(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void i(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void j(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void k(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void l(int i) {
        this.k = Integer.valueOf(i);
    }

    public final void m(int i) {
        this.l = Integer.valueOf(i);
    }

    public final void n(int i) {
        this.m = Integer.valueOf(i);
    }
}
