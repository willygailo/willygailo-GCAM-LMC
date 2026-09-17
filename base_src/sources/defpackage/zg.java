package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zg implements yv {
    public int c;
    public yk d;
    zd e;
    protected int k;
    public final yy f = new yy(this);
    public int g = 0;
    public boolean h = false;
    public final yx i = new yx(this);
    public final yx j = new yx(this);
    protected int l = 1;

    public zg(yk ykVar) {
        this.d = ykVar;
    }

    protected static final void j(yx yxVar, yx yxVar2, int i) {
        yxVar.k.add(yxVar2);
        yxVar.e = i;
        yxVar2.j.add(yxVar);
    }

    protected static final yx k(yj yjVar) {
        yj yjVar2 = yjVar.e;
        if (yjVar2 == null) {
            return null;
        }
        yk ykVar = yjVar2.d;
        switch (yjVar2.i - 1) {
            case 1:
                return ykVar.h.i;
            case 2:
                return ykVar.i.i;
            case 3:
                return ykVar.h.j;
            case 4:
                return ykVar.i.j;
            case 5:
                return ykVar.i.a;
            default:
                return null;
        }
    }

    protected static final yx l(yj yjVar, int i) {
        yj yjVar2 = yjVar.e;
        if (yjVar2 == null) {
            return null;
        }
        yk ykVar = yjVar2.d;
        zg zgVar = i == 0 ? ykVar.h : ykVar.i;
        switch (yjVar2.i - 1) {
            case 1:
            case 2:
                return zgVar.i;
            case 3:
            case 4:
                return zgVar.j;
            default:
                return null;
        }
    }

    public long a() {
        yy yyVar = this.f;
        if (yyVar.i) {
            return yyVar.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.yv
    public void f() {
        throw null;
    }

    protected final int h(int i, int i2) {
        if (i2 == 0) {
            yk ykVar = this.d;
            int i3 = ykVar.w;
            int iMax = Math.max(ykVar.v, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            return iMax == i ? i : iMax;
        }
        yk ykVar2 = this.d;
        int i4 = ykVar2.z;
        int iMax2 = Math.max(ykVar2.y, i);
        if (i4 > 0) {
            iMax2 = Math.min(i4, i);
        }
        return iMax2 == i ? i : iMax2;
    }

    protected final void i(yx yxVar, yx yxVar2, int i, yy yyVar) {
        yxVar.k.add(yxVar2);
        yxVar.k.add(this.f);
        yxVar.g = i;
        yxVar.h = yyVar;
        yxVar2.j.add(yxVar);
        yyVar.j.add(yxVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [zc] */
    /* JADX WARN: Type inference failed for: r7v2, types: [zg] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ze] */
    protected final void m(yj yjVar, yj yjVar2, int i) {
        yy yyVar;
        float f;
        int i2;
        yx yxVarK = k(yjVar);
        yx yxVarK2 = k(yjVar2);
        if (yxVarK.i && yxVarK2.i) {
            int iB = yxVarK.f + yjVar.b();
            int iB2 = yxVarK2.f - yjVar2.b();
            int i3 = iB2 - iB;
            yy yyVar2 = this.f;
            if (!yyVar2.i && this.k == 3) {
                switch (this.c) {
                    case 0:
                        yyVar2.c(h(i3, i));
                        break;
                    case 1:
                        this.f.c(Math.min(h(yyVar2.m, i), i3));
                        break;
                    case 2:
                        yk ykVar = this.d;
                        yk ykVar2 = ykVar.T;
                        if (ykVar2 != null) {
                            yy yyVar3 = (i == 0 ? ykVar2.h : ykVar2.i).f;
                            if (yyVar3.i) {
                                yyVar2.c(h((int) ((yyVar3.f * (i == 0 ? ykVar.x : ykVar.A)) + 0.5f), i));
                            }
                        }
                        break;
                    case 3:
                        yk ykVar3 = this.d;
                        ?? r7 = ykVar3.h;
                        if (r7.k == 3 && r7.c == 3) {
                            ze zeVar = ykVar3.i;
                            if (zeVar.k != 3 || zeVar.c != 3) {
                                if (i == 0) {
                                    r7 = ykVar3.i;
                                }
                                yyVar = r7.f;
                                if (yyVar.i) {
                                    f = ykVar3.W;
                                    if (i == 1) {
                                        i2 = (int) ((yyVar.f / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * yyVar.f) + 0.5f);
                                    }
                                    yyVar2.c(i2);
                                }
                            }
                        } else {
                            if (i == 0) {
                                r7 = ykVar3.i;
                            }
                            yyVar = r7.f;
                            if (yyVar.i) {
                                f = ykVar3.W;
                                if (i == 1) {
                                    i2 = (int) ((yyVar.f / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * yyVar.f) + 0.5f);
                                }
                                yyVar2.c(i2);
                            }
                        }
                        break;
                }
            }
            yy yyVar4 = this.f;
            if (yyVar4.i) {
                int i4 = yyVar4.f;
                if (i4 == i3) {
                    this.i.c(iB);
                    this.j.c(iB2);
                    return;
                }
                float f2 = i == 0 ? this.d.ad : this.d.ae;
                if (yxVarK == yxVarK2) {
                    iB = yxVarK.f;
                    iB2 = yxVarK2.f;
                    f2 = 0.5f;
                }
                this.i.c((int) (iB + 0.5f + (((iB2 - iB) - i4) * f2)));
                this.j.c(this.i.f + this.f.f);
            }
        }
    }
}
