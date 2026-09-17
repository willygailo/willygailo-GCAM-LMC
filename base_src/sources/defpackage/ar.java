package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ar {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public float aa;
    ar ab;
    ar ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    final aq i;
    final aq j;
    final aq k;
    final aq l;
    final aq m;
    final aq n;
    final aq o;
    final aq p;
    protected final ArrayList q;
    public ar r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public ar() {
        aq aqVar = new aq(this, 2);
        this.i = aqVar;
        aq aqVar2 = new aq(this, 3);
        this.j = aqVar2;
        aq aqVar3 = new aq(this, 4);
        this.k = aqVar3;
        aq aqVar4 = new aq(this, 5);
        this.l = aqVar4;
        aq aqVar5 = new aq(this, 6);
        this.m = aqVar5;
        aq aqVar6 = new aq(this, 8);
        this.n = aqVar6;
        aq aqVar7 = new aq(this, 9);
        this.o = aqVar7;
        this.p = new aq(this, 7);
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        arrayList.add(aqVar);
        arrayList.add(aqVar2);
        arrayList.add(aqVar3);
        arrayList.add(aqVar4);
        arrayList.add(aqVar6);
        arrayList.add(aqVar7);
        arrayList.add(aqVar5);
    }

    private final void A(an anVar, boolean z, boolean z2, aq aqVar, aq aqVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        int i8 = i6;
        ap apVarE = anVar.e(aqVar);
        ap apVarE2 = anVar.e(aqVar2);
        ap apVarE3 = anVar.e(aqVar.b);
        ap apVarE4 = anVar.e(aqVar2.b);
        int iA = aqVar.a();
        int iA2 = aqVar2.a();
        int i9 = this.K;
        boolean z5 = i9 != 8;
        int i10 = i9 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (apVarE3 == null && apVarE4 == null) {
            ak akVarA = anVar.a();
            akVarA.g(apVarE, i);
            anVar.g(akVarA);
            if (z3) {
                return;
            }
            if (z) {
                anVar.g(an.c(anVar, apVarE2, apVarE, i4, true));
                return;
            } else {
                if (z6) {
                    anVar.g(an.c(anVar, apVarE2, apVarE, i10, false));
                    return;
                }
                ak akVarA2 = anVar.a();
                akVarA2.g(apVarE2, i2);
                anVar.g(akVarA2);
                return;
            }
        }
        if (apVarE3 != null && apVarE4 == null) {
            ak akVarA3 = anVar.a();
            akVarA3.h(apVarE, apVarE3, iA);
            anVar.g(akVarA3);
            if (z) {
                anVar.g(an.c(anVar, apVarE2, apVarE, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                ak akVarA4 = anVar.a();
                akVarA4.h(apVarE2, apVarE, i10);
                anVar.g(akVarA4);
                return;
            } else {
                ak akVarA5 = anVar.a();
                akVarA5.g(apVarE2, i2);
                anVar.g(akVarA5);
                return;
            }
        }
        if (apVarE3 == null) {
            ak akVarA6 = anVar.a();
            akVarA6.h(apVarE2, apVarE4, -iA2);
            anVar.g(akVarA6);
            if (z) {
                anVar.g(an.c(anVar, apVarE2, apVarE, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                ak akVarA7 = anVar.a();
                akVarA7.h(apVarE2, apVarE, i10);
                anVar.g(akVarA7);
                return;
            } else {
                ak akVarA8 = anVar.a();
                akVarA8.g(apVarE, i);
                anVar.g(akVarA8);
                return;
            }
        }
        if (!z6) {
            if (z3) {
                anVar.i(apVarE, apVarE3, iA, 3);
                anVar.j(apVarE2, apVarE4, -iA2, 3);
                anVar.g(an.b(anVar, apVarE, apVarE3, iA, f, apVarE4, apVarE2, iA2, true));
                return;
            }
            if (z4) {
                return;
            }
            if (i5 == 1) {
                if (i8 <= i10) {
                    i8 = i10;
                }
                int i11 = i7;
                if (i11 <= 0) {
                    i11 = i8;
                } else if (i11 >= i8) {
                    anVar.j(apVarE2, apVarE, i11, 3);
                    i11 = i8;
                }
                anVar.n(apVarE2, apVarE, i11, 3);
                anVar.i(apVarE, apVarE3, iA, 2);
                anVar.j(apVarE2, apVarE4, -iA2, 2);
                anVar.m(apVarE, apVarE3, iA, f, apVarE4, apVarE2, iA2);
                return;
            }
            if (i8 != 0 || i7 != 0) {
                if (i7 > 0) {
                    anVar.j(apVarE2, apVarE, i7, 3);
                }
                anVar.i(apVarE, apVarE3, iA, 2);
                anVar.j(apVarE2, apVarE4, -iA2, 2);
                anVar.m(apVarE, apVarE3, iA, f, apVarE4, apVarE2, iA2);
                return;
            }
            ak akVarA9 = anVar.a();
            akVarA9.h(apVarE, apVarE3, iA);
            anVar.g(akVarA9);
            ak akVarA10 = anVar.a();
            akVarA10.h(apVarE2, apVarE4, -iA2);
            anVar.g(akVarA10);
            return;
        }
        if (z) {
            anVar.g(an.c(anVar, apVarE2, apVarE, i4, true));
        } else {
            ak akVarA11 = anVar.a();
            akVarA11.h(apVarE2, apVarE, i10);
            anVar.g(akVarA11);
        }
        int i12 = aqVar.h;
        if (i12 != aqVar2.h) {
            if (i12 == 2) {
                ak akVarA12 = anVar.a();
                akVarA12.h(apVarE, apVarE3, iA);
                anVar.g(akVarA12);
                ap apVarF = anVar.f();
                ak akVarA13 = anVar.a();
                akVarA13.j(apVarE2, apVarE4, apVarF, -iA2);
                anVar.g(akVarA13);
                return;
            }
            ap apVarF2 = anVar.f();
            ak akVarA14 = anVar.a();
            akVarA14.i(apVarE, apVarE3, apVarF2, iA);
            anVar.g(akVarA14);
            ak akVarA15 = anVar.a();
            akVarA15.h(apVarE2, apVarE4, -iA2);
            anVar.g(akVarA15);
            return;
        }
        if (apVarE3 == apVarE4) {
            anVar.g(an.b(anVar, apVarE, apVarE3, 0, 0.5f, apVarE4, apVarE2, 0, true));
            return;
        }
        if (z4) {
            return;
        }
        int i13 = aqVar.i;
        ap apVarF3 = anVar.f();
        ak akVarA16 = anVar.a();
        akVarA16.i(apVarE, apVarE3, apVarF3, iA);
        if (i13 != 2) {
            anVar.k(akVarA16, (int) (-akVarA16.d.a(apVarF3)));
        }
        anVar.g(akVarA16);
        int i14 = aqVar2.i;
        ap apVarF4 = anVar.f();
        ak akVarA17 = anVar.a();
        akVarA17.j(apVarE2, apVarE4, apVarF4, -iA2);
        if (i14 != 2) {
            anVar.k(akVarA17, (int) (-akVarA17.d.a(apVarF4)));
        }
        anVar.g(akVarA17);
        anVar.g(an.b(anVar, apVarE, apVarE3, iA, f, apVarE4, apVarE2, iA2, false));
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int iMax = this.t;
        if (this.ae == 3) {
            if (this.d == 1) {
                iMax = Math.max(this.g, iMax);
            } else {
                iMax = this.g;
                if (iMax > 0) {
                    this.t = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i = this.h;
            if (i > 0 && i < iMax) {
                return i;
            }
        }
        return iMax;
    }

    public final int f() {
        int iMax = this.s;
        if (this.ad == 3) {
            if (this.c == 1) {
                iMax = Math.max(this.e, iMax);
            } else {
                iMax = this.e;
                if (iMax > 0) {
                    this.s = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i = this.f;
            if (i > 0 && i < iMax) {
                return i;
            }
        }
        return iMax;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public void j(al alVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }

    public final void k(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void l(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void m(int i) {
        if (i < 0) {
            this.E = 0;
        } else {
            this.E = i;
        }
    }

    public final void n(int i) {
        if (i < 0) {
            this.D = 0;
        } else {
            this.D = i;
        }
    }

    public void o(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public final void p(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void q(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void r() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s;
        int i4 = this.t;
        this.af = i;
        this.ag = i2;
        this.y = (i3 + i) - i;
        this.z = (i4 + i2) - i2;
    }

    public final boolean s() {
        return this.C > 0;
    }

    public final boolean t() {
        return this.r == null;
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ")";
    }

    public aq u(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
            default:
                return this.p;
            case 7:
                return this.n;
            case 8:
                return this.o;
        }
    }

    public final void v(int i, ar arVar, int i2, int i3, int i4) {
        u(i).d(arVar.u(i2), i3, i4, 2, 0, true);
    }

    public final void w(int i) {
        this.ad = i;
        if (i == 2) {
            q(this.F);
        }
    }

    public final void x(int i) {
        this.ae = i;
        if (i == 2) {
            k(this.G);
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:151:0x020f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0217  */
    /* JADX WARN: Code duplicated, block: B:164:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:169:0x030c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:0x030d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0317  */
    /* JADX WARN: Code duplicated, block: B:177:0x031a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0326  */
    /* JADX WARN: Code duplicated, block: B:187:0x032e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0340  */
    /* JADX WARN: Code duplicated, block: B:190:0x0345  */
    /* JADX WARN: Code duplicated, block: B:192:0x034a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0350  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:203:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:205:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:207:0x0403  */
    /* JADX WARN: Code duplicated, block: B:214:0x0458  */
    /* JADX WARN: Code duplicated, block: B:217:0x048a  */
    /* JADX WARN: Code duplicated, block: B:219:0x0492  */
    /* JADX WARN: Code duplicated, block: B:221:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:223:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:225:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:227:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:228:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:231:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:232:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:235:0x04fc  */
    public void y(an anVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        float f;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        int i8;
        ar arVar;
        ap apVar;
        aq aqVar;
        ak akVarA;
        int i9;
        int i10;
        ap apVar2;
        ap apVar3;
        int i11;
        int i12;
        ap apVar4;
        ap apVar5;
        aq aqVar2;
        aq aqVar3;
        aq aqVar4;
        int i13;
        aq aqVar5;
        aq aqVar6;
        aq aqVar7;
        aq aqVar8;
        aq aqVar9;
        aq aqVar10;
        aq aqVar11;
        aq aqVar12;
        aq aqVar13;
        aq aqVar14;
        boolean z8;
        aq aqVar15;
        aq aqVar16;
        boolean z9;
        ar arVar2;
        ar arVar3;
        ar arVar4;
        ar arVar5;
        ar arVar6;
        ar arVar7;
        ap apVarE = anVar.e(this.i);
        ap apVarE2 = anVar.e(this.k);
        ap apVarE3 = anVar.e(this.j);
        ap apVarE4 = anVar.e(this.l);
        ap apVarE5 = anVar.e(this.m);
        ar arVar8 = this.r;
        if (arVar8 != null) {
            aq aqVar17 = this.i;
            aq aqVar18 = aqVar17.b;
            if ((aqVar18 == null || aqVar18.b != aqVar17) && ((aqVar14 = (aqVar13 = this.k).b) == null || aqVar14.b != aqVar13)) {
                z8 = false;
            } else {
                ((as) arVar8).A(this, 0);
                z8 = true;
            }
            aq aqVar19 = this.j;
            aq aqVar20 = aqVar19.b;
            if ((aqVar20 == null || aqVar20.b != aqVar19) && ((aqVar16 = (aqVar15 = this.l).b) == null || aqVar16.b != aqVar15)) {
                z9 = false;
            } else {
                ((as) this.r).A(this, 1);
                z9 = true;
            }
            ar arVar9 = this.r;
            if (arVar9.ad == 2 && !z8) {
                aq aqVar21 = this.i;
                aq aqVar22 = aqVar21.b;
                if (aqVar22 == null || (arVar7 = aqVar22.a) != arVar9) {
                    ap apVarE6 = anVar.e(arVar9.i);
                    ak akVarA2 = anVar.a();
                    akVarA2.i(apVarE, apVarE6, anVar.f(), 0);
                    anVar.g(akVarA2);
                } else if (arVar7 == arVar9) {
                    aqVar21.i = 2;
                }
                aq aqVar23 = this.k;
                aq aqVar24 = aqVar23.b;
                if (aqVar24 == null || (arVar5 = aqVar24.a) != (arVar6 = this.r)) {
                    ap apVarE7 = anVar.e(this.r.k);
                    ak akVarA3 = anVar.a();
                    akVarA3.i(apVarE7, apVarE2, anVar.f(), 0);
                    anVar.g(akVarA3);
                } else if (arVar5 == arVar6) {
                    aqVar23.i = 2;
                }
            }
            ar arVar10 = this.r;
            if (arVar10.ae == 2 && !z9) {
                aq aqVar25 = this.j;
                aq aqVar26 = aqVar25.b;
                if (aqVar26 == null || (arVar4 = aqVar26.a) != arVar10) {
                    ap apVarE8 = anVar.e(arVar10.j);
                    ak akVarA4 = anVar.a();
                    akVarA4.i(apVarE3, apVarE8, anVar.f(), 0);
                    anVar.g(akVarA4);
                } else if (arVar4 == arVar10) {
                    aqVar25.i = 2;
                }
                aq aqVar27 = this.l;
                aq aqVar28 = aqVar27.b;
                if (aqVar28 == null || (arVar2 = aqVar28.a) != (arVar3 = this.r)) {
                    ap apVarE9 = anVar.e(this.r.l);
                    ak akVarA5 = anVar.a();
                    akVarA5.i(apVarE9, apVarE4, anVar.f(), 0);
                    anVar.g(akVarA5);
                } else if (arVar2 == arVar3) {
                    aqVar27.i = 2;
                }
            }
            z = z8;
            z2 = z9;
        } else {
            z = false;
            z2 = false;
        }
        int i14 = this.s;
        int i15 = this.D;
        int i16 = i14 < i15 ? i15 : i14;
        int i17 = this.t;
        int i18 = this.E;
        if (i17 >= i18) {
            i18 = i17;
        }
        int i19 = this.ad;
        boolean z10 = i19 != 3;
        int i20 = this.ae;
        boolean z11 = i20 != 3;
        if (!z10 && (aqVar11 = this.i) != null && (aqVar12 = this.k) != null && (aqVar11.b == null || aqVar12.b == null)) {
            z10 = true;
        }
        if (!z11 && (aqVar7 = this.j) != null && (aqVar8 = this.l) != null && (((aqVar9 = aqVar7.b) == null || aqVar8.b == null) && (this.C == 0 || ((aqVar10 = this.m) != null && (aqVar9 == null || aqVar10.b == null))))) {
            z11 = true;
        }
        int i21 = this.v;
        float f2 = this.u;
        if (f2 > 0.0f) {
            i = i16;
            if (this.K != 8) {
                if (i19 != 3) {
                    if (i19 == 3) {
                        i18 = i18;
                        f = f2;
                        z10 = true;
                        i2 = 0;
                        z3 = false;
                        i3 = (int) (i17 * f2);
                    } else {
                        if (i20 == 3) {
                            if (i21 == -1) {
                                f2 = 1.0f / f2;
                            }
                            i18 = (int) (i14 * f2);
                            i2 = 1;
                            z11 = true;
                        }
                        f = f2;
                        i3 = i;
                        z3 = false;
                    }
                } else if (i20 != 3) {
                    i19 = 3;
                    if (i19 == 3) {
                        i18 = i18;
                        f = f2;
                        z10 = true;
                        i2 = 0;
                        z3 = false;
                        i3 = (int) (i17 * f2);
                    } else {
                        if (i20 == 3) {
                            if (i21 == -1) {
                                f2 = 1.0f / f2;
                            }
                            i18 = (int) (i14 * f2);
                            i2 = 1;
                            z11 = true;
                        }
                        f = f2;
                        i3 = i;
                        z3 = false;
                    }
                } else if (!z10 || z11) {
                    if (z10 || !z11) {
                        i2 = i21;
                        i19 = 3;
                    } else if (i21 == -1) {
                        float f3 = 1.0f / f2;
                        i18 = i18;
                        z10 = z10;
                        i3 = i;
                        i19 = 3;
                        i2 = 1;
                        z3 = true;
                        f = f3;
                    } else {
                        i19 = 3;
                        i2 = 1;
                    }
                    f = f2;
                    i3 = i;
                    z3 = true;
                } else {
                    i18 = i18;
                    z10 = z10;
                    i19 = 3;
                    i2 = 0;
                    f = f2;
                    i3 = i;
                    z3 = true;
                }
            }
            z4 = !z3 && (i2 == 0 || i2 == -1);
            if (i19 == 2 || !(this instanceof as)) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (this.a != 2) {
                if (z4) {
                    aqVar6 = this.i;
                    if (aqVar6.b == null && this.k.b != null) {
                        ap apVarE10 = anVar.e(aqVar6);
                        ap apVarE11 = anVar.e(this.k);
                        ap apVarE12 = anVar.e(this.i.b);
                        ap apVarE13 = anVar.e(this.k.b);
                        anVar.i(apVarE10, apVarE12, this.i.a(), 3);
                        anVar.j(apVarE11, apVarE13, -this.k.a(), 3);
                        if (z) {
                            i4 = i18;
                            i5 = i2;
                        } else {
                            anVar.m(apVarE10, apVarE12, this.i.a(), this.H, apVarE13, apVarE11, this.k.a());
                            i4 = i18;
                            i5 = i2;
                        }
                    }
                }
                aq aqVar29 = this.i;
                aq aqVar30 = this.k;
                int i22 = this.w;
                i4 = i18;
                i5 = i2;
                A(anVar, z5, z10, aqVar29, aqVar30, i22, i22 + i3, i3, i15, this.H, z4, z, this.c, this.e, this.f);
            } else {
                i4 = i18;
                i5 = i2;
            }
            if (this.b == 2) {
                return;
            }
            if (this.ae == 2 || !(this instanceof as)) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z3) {
                i6 = i5;
                if (i6 != 1 || i6 == -1) {
                }
                i7 = this.C;
                if (i7 > 0) {
                    aqVar2 = this.l;
                    anVar.n(apVarE5, apVarE3, i7, 5);
                    aqVar3 = this.m;
                    if (aqVar3.b != null) {
                        aqVar4 = aqVar3;
                        i13 = this.C;
                    } else {
                        aqVar4 = aqVar2;
                        i13 = i4;
                    }
                    if (z7) {
                        aqVar5 = this.j;
                        if (aqVar5.b == null && this.l.b != null) {
                            ap apVarE14 = anVar.e(aqVar5);
                            ap apVarE15 = anVar.e(this.l);
                            ap apVarE16 = anVar.e(this.j.b);
                            ap apVarE17 = anVar.e(this.l.b);
                            anVar.i(apVarE14, apVarE16, this.j.a(), 3);
                            anVar.j(apVarE15, apVarE17, -this.l.a(), 3);
                            if (z2) {
                                apVar = apVarE3;
                                i8 = i6;
                            } else {
                                anVar.m(apVarE14, apVarE16, this.j.a(), this.I, apVarE17, apVarE15, this.l.a());
                                apVar = apVarE3;
                                i8 = i6;
                            }
                        }
                    }
                    aq aqVar31 = this.j;
                    int i23 = this.x;
                    i8 = i6;
                    A(anVar, z6, z11, aqVar31, aqVar4, i23, i23 + i13, i13, this.E, this.I, z7, z2, this.d, this.g, this.h);
                    anVar.n(apVarE4, apVarE3, i4, 5);
                    apVar = apVarE3;
                } else {
                    i8 = i6;
                    int i24 = i4;
                    if (z7) {
                        arVar = this;
                        aqVar = arVar.j;
                        if (aqVar.b == null && arVar.l.b != null) {
                            ap apVarE18 = anVar.e(aqVar);
                            ap apVarE19 = anVar.e(arVar.l);
                            ap apVarE20 = anVar.e(arVar.j.b);
                            ap apVarE21 = anVar.e(arVar.l.b);
                            anVar.i(apVarE18, apVarE20, arVar.j.a(), 3);
                            anVar.j(apVarE19, apVarE21, -arVar.l.a(), 3);
                            if (z2) {
                                apVarE4 = apVarE4;
                                apVar = apVarE3;
                            } else {
                                anVar.m(apVarE18, apVarE20, arVar.j.a(), arVar.I, apVarE21, apVarE19, arVar.l.a());
                                apVarE4 = apVarE4;
                                apVar = apVarE3;
                            }
                        }
                    } else {
                        arVar = this;
                    }
                    aq aqVar32 = arVar.j;
                    aq aqVar33 = arVar.l;
                    int i25 = arVar.x;
                    apVarE4 = apVarE4;
                    apVar = apVarE3;
                    A(anVar, z6, z11, aqVar32, aqVar33, i25, i25 + i24, i24, arVar.E, arVar.I, z7, z2, arVar.d, arVar.g, arVar.h);
                }
                if (z3) {
                    akVarA = anVar.a();
                    i9 = i8;
                    if (i9 == 0) {
                        akVarA.e(apVarE2, apVarE, apVarE4, apVar, f);
                        anVar.g(akVarA);
                        return;
                    }
                    if (i9 == 1) {
                        akVarA.e(apVarE4, apVar, apVarE2, r25, f);
                        anVar.g(akVarA);
                        return;
                    }
                    i10 = this.e;
                    if (i10 > 0) {
                        apVar2 = r25;
                        apVar3 = apVarE2;
                        i11 = 3;
                        anVar.i(apVar3, apVar2, i10, 3);
                    } else {
                        apVar2 = r25;
                        apVar3 = apVarE2;
                        i11 = 3;
                    }
                    i12 = this.g;
                    if (i12 > 0) {
                        apVar4 = apVarE4;
                        apVar5 = apVar;
                        anVar.i(apVar4, apVar5, i12, i11);
                    } else {
                        apVar4 = apVarE4;
                        apVar5 = apVar;
                    }
                    akVarA.e(apVar3, apVar2, apVar4, apVar5, f);
                    ap apVarD = anVar.d();
                    ap apVarD2 = anVar.d();
                    apVarD.c = 4;
                    apVarD2.c = 4;
                    akVarA.c(apVarD, apVarD2);
                    anVar.g(akVarA);
                }
            }
            i6 = i5;
            z7 = false;
            i7 = this.C;
            if (i7 > 0) {
                aqVar2 = this.l;
                anVar.n(apVarE5, apVarE3, i7, 5);
                aqVar3 = this.m;
                if (aqVar3.b != null) {
                    aqVar4 = aqVar3;
                    i13 = this.C;
                } else {
                    aqVar4 = aqVar2;
                    i13 = i4;
                }
                if (z7) {
                    aqVar5 = this.j;
                    if (aqVar5.b == null) {
                    }
                }
                aq aqVar34 = this.j;
                int i26 = this.x;
                i8 = i6;
                A(anVar, z6, z11, aqVar34, aqVar4, i26, i26 + i13, i13, this.E, this.I, z7, z2, this.d, this.g, this.h);
                anVar.n(apVarE4, apVarE3, i4, 5);
                apVar = apVarE3;
            } else {
                i8 = i6;
                int i27 = i4;
                if (z7) {
                    arVar = this;
                    aqVar = arVar.j;
                    if (aqVar.b == null) {
                    }
                } else {
                    arVar = this;
                }
                aq aqVar35 = arVar.j;
                aq aqVar36 = arVar.l;
                int i28 = arVar.x;
                apVarE4 = apVarE4;
                apVar = apVarE3;
                A(anVar, z6, z11, aqVar35, aqVar36, i28, i28 + i27, i27, arVar.E, arVar.I, z7, z2, arVar.d, arVar.g, arVar.h);
            }
            if (z3) {
                akVarA = anVar.a();
                i9 = i8;
                if (i9 == 0) {
                    akVarA.e(apVarE2, apVarE, apVarE4, apVar, f);
                    anVar.g(akVarA);
                    return;
                }
                if (i9 == 1) {
                    akVarA.e(apVarE4, apVar, apVarE2, r25, f);
                    anVar.g(akVarA);
                    return;
                }
                i10 = this.e;
                if (i10 > 0) {
                    apVar2 = r25;
                    apVar3 = apVarE2;
                    i11 = 3;
                    anVar.i(apVar3, apVar2, i10, 3);
                } else {
                    apVar2 = r25;
                    apVar3 = apVarE2;
                    i11 = 3;
                }
                i12 = this.g;
                if (i12 > 0) {
                    apVar4 = apVarE4;
                    apVar5 = apVar;
                    anVar.i(apVar4, apVar5, i12, i11);
                } else {
                    apVar4 = apVarE4;
                    apVar5 = apVar;
                }
                akVarA.e(apVar3, apVar2, apVar4, apVar5, f);
                ap apVarD3 = anVar.d();
                ap apVarD4 = anVar.d();
                apVarD3.c = 4;
                apVarD4.c = 4;
                akVarA.c(apVarD3, apVarD4);
                anVar.g(akVarA);
            }
        }
        i = i16;
        i2 = i21;
        i18 = i18;
        f = f2;
        i3 = i;
        z3 = false;
        if (z3) {
        }
        if (i19 == 2) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (this.a != 2) {
            if (z4) {
                aqVar6 = this.i;
                if (aqVar6.b == null) {
                }
            }
            aq aqVar210 = this.i;
            aq aqVar37 = this.k;
            int i29 = this.w;
            i4 = i18;
            i5 = i2;
            A(anVar, z5, z10, aqVar210, aqVar37, i29, i29 + i3, i3, i15, this.H, z4, z, this.c, this.e, this.f);
        } else {
            i4 = i18;
            i5 = i2;
        }
        if (this.b == 2) {
            return;
        }
        if (this.ae == 2) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (z3) {
            i6 = i5;
            z7 = i6 != 1 ? true : true;
            i7 = this.C;
            if (i7 > 0) {
                aqVar2 = this.l;
                anVar.n(apVarE5, apVarE3, i7, 5);
                aqVar3 = this.m;
                if (aqVar3.b != null) {
                    aqVar4 = aqVar3;
                    i13 = this.C;
                } else {
                    aqVar4 = aqVar2;
                    i13 = i4;
                }
                if (z7) {
                    aqVar5 = this.j;
                    if (aqVar5.b == null) {
                    }
                }
                aq aqVar38 = this.j;
                int i210 = this.x;
                i8 = i6;
                A(anVar, z6, z11, aqVar38, aqVar4, i210, i210 + i13, i13, this.E, this.I, z7, z2, this.d, this.g, this.h);
                anVar.n(apVarE4, apVarE3, i4, 5);
                apVar = apVarE3;
            } else {
                i8 = i6;
                int i211 = i4;
                if (z7) {
                    arVar = this;
                    aqVar = arVar.j;
                    if (aqVar.b == null) {
                    }
                } else {
                    arVar = this;
                }
                aq aqVar39 = arVar.j;
                aq aqVar310 = arVar.l;
                int i212 = arVar.x;
                apVarE4 = apVarE4;
                apVar = apVarE3;
                A(anVar, z6, z11, aqVar39, aqVar310, i212, i212 + i211, i211, arVar.E, arVar.I, z7, z2, arVar.d, arVar.g, arVar.h);
            }
            if (z3) {
                akVarA = anVar.a();
                i9 = i8;
                if (i9 == 0) {
                    akVarA.e(apVarE2, apVarE, apVarE4, apVar, f);
                    anVar.g(akVarA);
                    return;
                }
                if (i9 == 1) {
                    akVarA.e(apVarE4, apVar, apVarE2, r25, f);
                    anVar.g(akVarA);
                    return;
                }
                i10 = this.e;
                if (i10 > 0) {
                    apVar2 = r25;
                    apVar3 = apVarE2;
                    i11 = 3;
                    anVar.i(apVar3, apVar2, i10, 3);
                } else {
                    apVar2 = r25;
                    apVar3 = apVarE2;
                    i11 = 3;
                }
                i12 = this.g;
                if (i12 > 0) {
                    apVar4 = apVarE4;
                    apVar5 = apVar;
                    anVar.i(apVar4, apVar5, i12, i11);
                } else {
                    apVar4 = apVarE4;
                    apVar5 = apVar;
                }
                akVarA.e(apVar3, apVar2, apVar4, apVar5, f);
                ap apVarD5 = anVar.d();
                ap apVarD6 = anVar.d();
                apVarD5.c = 4;
                apVarD6.c = 4;
                akVarA.c(apVarD5, apVarD6);
                anVar.g(akVarA);
            }
        }
        i6 = i5;
        z7 = false;
        i7 = this.C;
        if (i7 > 0) {
            aqVar2 = this.l;
            anVar.n(apVarE5, apVarE3, i7, 5);
            aqVar3 = this.m;
            if (aqVar3.b != null) {
                aqVar4 = aqVar3;
                i13 = this.C;
            } else {
                aqVar4 = aqVar2;
                i13 = i4;
            }
            if (z7) {
                aqVar5 = this.j;
                if (aqVar5.b == null) {
                }
            }
            aq aqVar311 = this.j;
            int i213 = this.x;
            i8 = i6;
            A(anVar, z6, z11, aqVar311, aqVar4, i213, i213 + i13, i13, this.E, this.I, z7, z2, this.d, this.g, this.h);
            anVar.n(apVarE4, apVarE3, i4, 5);
            apVar = apVarE3;
        } else {
            i8 = i6;
            int i214 = i4;
            if (z7) {
                arVar = this;
                aqVar = arVar.j;
                if (aqVar.b == null) {
                }
            } else {
                arVar = this;
            }
            aq aqVar312 = arVar.j;
            aq aqVar313 = arVar.l;
            int i215 = arVar.x;
            apVarE4 = apVarE4;
            apVar = apVarE3;
            A(anVar, z6, z11, aqVar312, aqVar313, i215, i215 + i214, i214, arVar.E, arVar.I, z7, z2, arVar.d, arVar.g, arVar.h);
        }
        if (z3) {
            akVarA = anVar.a();
            i9 = i8;
            if (i9 == 0) {
                akVarA.e(apVarE2, apVarE, apVarE4, apVar, f);
                anVar.g(akVarA);
                return;
            }
            if (i9 == 1) {
                akVarA.e(apVarE4, apVar, apVarE2, r25, f);
                anVar.g(akVarA);
                return;
            }
            i10 = this.e;
            if (i10 > 0) {
                apVar2 = r25;
                apVar3 = apVarE2;
                i11 = 3;
                anVar.i(apVar3, apVar2, i10, 3);
            } else {
                apVar2 = r25;
                apVar3 = apVarE2;
                i11 = 3;
            }
            i12 = this.g;
            if (i12 > 0) {
                apVar4 = apVarE4;
                apVar5 = apVar;
                anVar.i(apVar4, apVar5, i12, i11);
            } else {
                apVar4 = apVarE4;
                apVar5 = apVar;
            }
            akVarA.e(apVar3, apVar2, apVar4, apVar5, f);
            ap apVarD7 = anVar.d();
            ap apVarD8 = anVar.d();
            apVarD7.c = 4;
            apVarD8.c = 4;
            akVarA.c(apVarD7, apVarD8);
            anVar.g(akVarA);
        }
    }

    public void z() {
        int i;
        int i2;
        int iP = an.p(this.i);
        int iP2 = an.p(this.j);
        int iP3 = an.p(this.k) - iP;
        int iP4 = an.p(this.l) - iP2;
        this.w = iP;
        this.x = iP2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && iP3 < (i2 = this.s)) {
            iP3 = i2;
        }
        if (this.ae == 1 && iP4 < (i = this.t)) {
            iP4 = i;
        }
        this.s = iP3;
        this.t = iP4;
        int i3 = this.E;
        if (iP4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (iP3 < i4) {
            this.s = i4;
        }
    }
}
