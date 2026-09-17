package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jlp {
    private Integer A;
    public Integer a;
    public hti b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private ojc k;
    private String l;
    private Integer m;
    private Boolean n;
    private Integer o;
    private Integer p;
    private Integer q;
    private Integer r;
    private Integer s;
    private jkc t;
    private Integer u;
    private Integer v;
    private Integer w;
    private Integer x;
    private Integer y;
    private Integer z;

    public jlp() {
    }

    public jlp(jlq jlqVar) {
        this.k = oih.a;
        this.c = Integer.valueOf(jlqVar.f);
        this.d = Integer.valueOf(jlqVar.g);
        this.e = Integer.valueOf(jlqVar.h);
        this.f = Integer.valueOf(jlqVar.i);
        this.g = Integer.valueOf(jlqVar.j);
        this.h = Integer.valueOf(jlqVar.k);
        this.i = Integer.valueOf(jlqVar.l);
        this.j = Integer.valueOf(jlqVar.m);
        this.k = jlqVar.n;
        this.a = Integer.valueOf(jlqVar.o);
        this.l = jlqVar.p;
        this.m = Integer.valueOf(jlqVar.q);
        this.n = Boolean.valueOf(jlqVar.r);
        this.o = Integer.valueOf(jlqVar.s);
        this.p = Integer.valueOf(jlqVar.t);
        this.q = Integer.valueOf(jlqVar.u);
        this.r = Integer.valueOf(jlqVar.v);
        this.s = Integer.valueOf(jlqVar.w);
        this.t = jlqVar.x;
        this.b = jlqVar.y;
        this.u = Integer.valueOf(jlqVar.z);
        this.v = Integer.valueOf(jlqVar.A);
        this.w = Integer.valueOf(jlqVar.B);
        this.x = Integer.valueOf(jlqVar.C);
        this.y = Integer.valueOf(jlqVar.D);
        this.z = Integer.valueOf(jlqVar.E);
        this.A = Integer.valueOf(jlqVar.F);
    }

    public jlp(byte[] bArr) {
        this.k = oih.a;
    }

    public final void A(int i) {
        this.f = Integer.valueOf(i);
    }

    public final jlq a() {
        Integer num = this.c;
        if (num != null && this.d != null && this.e != null && this.f != null && this.g != null && this.h != null && this.i != null && this.j != null && this.a != null && this.l != null && this.m != null && this.n != null && this.o != null && this.p != null && this.q != null && this.r != null && this.s != null && this.t != null && this.b != null && this.u != null && this.v != null && this.w != null && this.x != null && this.y != null && this.z != null && this.A != null) {
            return new jlq(num.intValue(), this.d.intValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h.intValue(), this.i.intValue(), this.j.intValue(), this.k, this.a.intValue(), this.l, this.m.intValue(), this.n.booleanValue(), this.o.intValue(), this.p.intValue(), this.q.intValue(), this.r.intValue(), this.s.intValue(), this.t, this.b, this.u.intValue(), this.v.intValue(), this.w.intValue(), this.x.intValue(), this.y.intValue(), this.z.intValue(), this.A.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" photoCircleRadius");
        }
        if (this.d == null) {
            sb.append(" photoCircleAlpha");
        }
        if (this.e == null) {
            sb.append(" photoCircleColor");
        }
        if (this.f == null) {
            sb.append(" videoDotRadius");
        }
        if (this.g == null) {
            sb.append(" videoCircleColor");
        }
        if (this.h == null) {
            sb.append(" stopSquareHalfSize");
        }
        if (this.i == null) {
            sb.append(" portraitInnerCircleRadius");
        }
        if (this.j == null) {
            sb.append(" portraitOuterCircleRadius");
        }
        if (this.a == null) {
            sb.append(" buttonImageResourceId");
        }
        if (this.l == null) {
            sb.append(" buttonImageResourceEntryName");
        }
        if (this.m == null) {
            sb.append(" buttonImageRectHalfSize");
        }
        if (this.n == null) {
            sb.append(" animateRippleEffect");
        }
        if (this.o == null) {
            sb.append(" ripplePaintAlpha");
        }
        if (this.p == null) {
            sb.append(" rippleRadius");
        }
        if (this.q == null) {
            sb.append(" mainButtonColor");
        }
        if (this.r == null) {
            sb.append(" roundButtonRadius");
        }
        if (this.s == null) {
            sb.append(" outerButtonRadius");
        }
        if (this.t == null) {
            sb.append(" mode");
        }
        if (this.b == null) {
            sb.append(" timerOption");
        }
        if (this.u == null) {
            sb.append(" tickMarkLength");
        }
        if (this.v == null) {
            sb.append(" tickMarkPaddingToCircleEdge");
        }
        if (this.w == null) {
            sb.append(" tickMarkRectRoundRadius");
        }
        if (this.x == null) {
            sb.append(" tickMarkAlpha");
        }
        if (this.y == null) {
            sb.append(" mainOuterButtonAlpha");
        }
        if (this.z == null) {
            sb.append(" innerDotCenterOffset");
        }
        if (this.A == null) {
            sb.append(" innerDotColor");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null buttonImageResourceEntryName");
        }
        this.l = str;
    }

    public final void d(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void e() {
        this.z = 0;
    }

    public final void f(int i) {
        this.A = Integer.valueOf(i);
    }

    public final void g(int i) {
        this.y = Integer.valueOf(i);
    }

    public final void h(ojc ojcVar) {
        if (ojcVar == null) {
            throw new NullPointerException("Null buttonImage");
        }
        this.k = ojcVar;
    }

    public final void i(int i) {
        this.m = Integer.valueOf(i);
    }

    public final void j(int i) {
        this.q = Integer.valueOf(i);
    }

    public final void k(jkc jkcVar) {
        if (jkcVar == null) {
            throw new NullPointerException("Null mode");
        }
        this.t = jkcVar;
    }

    public final void l(int i) {
        this.s = Integer.valueOf(i);
    }

    public final void m(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void n(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void o(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void p(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void q(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void r(int i) {
        this.o = Integer.valueOf(i);
    }

    public final void s(int i) {
        this.p = Integer.valueOf(i);
    }

    public final void t(int i) {
        this.r = Integer.valueOf(i);
    }

    public final void u(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void v(int i) {
        this.x = Integer.valueOf(i);
    }

    public final void w(int i) {
        this.u = Integer.valueOf(i);
    }

    public final void x(int i) {
        this.v = Integer.valueOf(i);
    }

    public final void y(int i) {
        this.w = Integer.valueOf(i);
    }

    public final void z(int i) {
        this.g = Integer.valueOf(i);
    }
}
