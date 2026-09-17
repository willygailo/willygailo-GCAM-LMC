package defpackage;

import com.google.lens.sdk.LensApi;

/* JADX INFO: loaded from: classes2.dex */
public final class ze extends zg {
    public final yx a;
    yy b;

    public ze(yk ykVar) {
        super(ykVar);
        yx yxVar = new yx(this);
        this.a = yxVar;
        this.b = null;
        this.i.l = 6;
        this.j.l = 7;
        yxVar.l = 8;
        this.g = 1;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:118:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:120:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:122:0x031b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0328  */
    /* JADX WARN: Code duplicated, block: B:127:0x0330  */
    /* JADX WARN: Code duplicated, block: B:129:0x0336  */
    /* JADX WARN: Code duplicated, block: B:130:0x0352  */
    /* JADX WARN: Code duplicated, block: B:132:0x0359  */
    /* JADX WARN: Code duplicated, block: B:134:0x035f  */
    /* JADX WARN: Code duplicated, block: B:136:0x037e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0389  */
    /* JADX WARN: Code duplicated, block: B:139:0x038f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0395  */
    /* JADX WARN: Code duplicated, block: B:142:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:151:0x03de  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:158:0x0410  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.zg
    public final void b() {
        yk ykVar;
        yk ykVar2;
        yj[] yjVarArr;
        yj yjVar;
        yj yjVar2;
        yj yjVar3;
        yj yjVar4;
        yk ykVar3;
        yk ykVar4;
        zc zcVar;
        yx yxVarK;
        yx yxVarK2;
        yx yxVarK3;
        yk ykVar5;
        zc zcVar2;
        yk ykVar6;
        yk ykVar7 = this.d;
        if (ykVar7.e) {
            this.f.c(ykVar7.h());
        }
        if (!this.f.i) {
            this.k = this.d.O();
            if (this.d.F) {
                this.b = new yy(this);
            }
            if (this.k != 3) {
                if (this.k == 4 && (ykVar6 = this.d.T) != null && ykVar6.O() == 1) {
                    int iH = ykVar6.h();
                    int iB = this.d.K.b();
                    int iB2 = this.d.M.b();
                    j(this.i, ykVar6.i.i, this.d.K.b());
                    j(this.j, ykVar6.i.j, -this.d.M.b());
                    this.f.c((iH - iB) - iB2);
                    return;
                }
                if (this.k == 1) {
                    this.f.c(this.d.h());
                }
            }
        } else if (this.k == 4 && (ykVar = this.d.T) != null && ykVar.O() == 1) {
            j(this.i, ykVar.i.i, this.d.K.b());
            j(this.j, ykVar.i.j, -this.d.M.b());
            return;
        }
        yy yyVar = this.f;
        if (!yyVar.i) {
            if (this.k == 3) {
                yk ykVar8 = this.d;
                switch (ykVar8.t) {
                    case 2:
                        yk ykVar9 = ykVar8.T;
                        if (ykVar9 != null) {
                            yy yyVar2 = ykVar9.i.f;
                            yyVar.k.add(yyVar2);
                            yyVar2.j.add(this.f);
                            yy yyVar3 = this.f;
                            yyVar3.b = true;
                            yyVar3.j.add(this.i);
                            this.f.j.add(this.j);
                        }
                        break;
                    case 3:
                        if (!ykVar8.J()) {
                            yk ykVar10 = this.d;
                            if (ykVar10.s != 3) {
                                yy yyVar4 = ykVar10.h.f;
                                this.f.k.add(yyVar4);
                                yyVar4.j.add(this.f);
                                yy yyVar5 = this.f;
                                yyVar5.b = true;
                                yyVar5.j.add(this.i);
                                this.f.j.add(this.j);
                            }
                        }
                        break;
                }
            }
            ykVar2 = this.d;
            yjVarArr = ykVar2.R;
            yjVar = yjVarArr[2];
            yjVar2 = yjVar.e;
            if (yjVar2 == null && yjVarArr[3].e != null) {
                if (ykVar2.J()) {
                    this.i.e = this.d.R[2].b();
                    this.j.e = -this.d.R[3].b();
                } else {
                    yx yxVarK4 = k(this.d.R[2]);
                    yx yxVarK5 = k(this.d.R[3]);
                    if (yxVarK4 != null) {
                        yxVarK4.a(this);
                    }
                    if (yxVarK5 != null) {
                        yxVarK5.a(this);
                    }
                    this.l = 4;
                }
                if (this.d.F) {
                    i(this.a, this.i, 1, this.b);
                }
            } else if (yjVar2 != null) {
                yxVarK3 = k(yjVar);
                if (yxVarK3 != null) {
                    j(this.i, yxVarK3, this.d.R[2].b());
                    i(this.j, this.i, 1, this.f);
                    if (this.d.F) {
                        i(this.a, this.i, 1, this.b);
                    }
                    if (this.k == 3) {
                        ykVar5 = this.d;
                        if (ykVar5.W > 0.0f) {
                            zcVar2 = ykVar5.h;
                            if (zcVar2.k == 3) {
                                zcVar2.f.j.add(this.f);
                                this.f.k.add(this.d.h.f);
                                this.f.a = this;
                            }
                        }
                    }
                }
            } else {
                yjVar3 = yjVarArr[3];
                if (yjVar3.e != null) {
                    yxVarK2 = k(yjVar3);
                    if (yxVarK2 != null) {
                        j(this.j, yxVarK2, -this.d.R[3].b());
                        i(this.i, this.j, -1, this.f);
                        if (this.d.F) {
                            i(this.a, this.i, 1, this.b);
                        }
                    }
                } else {
                    yjVar4 = yjVarArr[4];
                    if (yjVar4.e != null) {
                        yxVarK = k(yjVar4);
                        if (yxVarK != null) {
                            j(this.a, yxVarK, 0);
                            i(this.i, this.a, -1, this.b);
                            i(this.j, this.i, 1, this.f);
                        }
                    } else if (!(ykVar2 instanceof yo) && (ykVar3 = ykVar2.T) != null) {
                        j(this.i, ykVar3.i.i, ykVar2.l());
                        i(this.j, this.i, 1, this.f);
                        if (this.d.F) {
                            i(this.a, this.i, 1, this.b);
                        }
                        if (this.k == 3) {
                            ykVar4 = this.d;
                            if (ykVar4.W > 0.0f) {
                                zcVar = ykVar4.h;
                                if (zcVar.k == 3) {
                                    zcVar.f.j.add(this.f);
                                    this.f.k.add(this.d.h.f);
                                    this.f.a = this;
                                }
                            }
                        }
                    }
                }
            }
            if (this.f.k.size() == 0) {
                this.f.c = true;
            }
        }
        yk ykVar11 = this.d;
        if (ykVar11.e) {
            yj[] yjVarArr2 = ykVar11.R;
            yj yjVar5 = yjVarArr2[2];
            yj yjVar6 = yjVar5.e;
            if (yjVar6 != null && yjVarArr2[3].e != null) {
                if (ykVar11.J()) {
                    this.i.e = this.d.R[2].b();
                    this.j.e = -this.d.R[3].b();
                } else {
                    yx yxVarK6 = k(this.d.R[2]);
                    if (yxVarK6 != null) {
                        j(this.i, yxVarK6, this.d.R[2].b());
                    }
                    yx yxVarK7 = k(this.d.R[3]);
                    if (yxVarK7 != null) {
                        j(this.j, yxVarK7, -this.d.R[3].b());
                    }
                    this.i.b = true;
                    this.j.b = true;
                }
                yk ykVar12 = this.d;
                if (ykVar12.F) {
                    j(this.a, this.i, ykVar12.aa);
                    return;
                }
                return;
            }
            if (yjVar6 != null) {
                yx yxVarK8 = k(yjVar5);
                if (yxVarK8 != null) {
                    j(this.i, yxVarK8, this.d.R[2].b());
                    j(this.j, this.i, this.f.f);
                    yk ykVar13 = this.d;
                    if (ykVar13.F) {
                        j(this.a, this.i, ykVar13.aa);
                        return;
                    }
                    return;
                }
                return;
            }
            yj yjVar7 = yjVarArr2[3];
            if (yjVar7.e != null) {
                yx yxVarK9 = k(yjVar7);
                if (yxVarK9 != null) {
                    j(this.j, yxVarK9, -this.d.R[3].b());
                    j(this.i, this.j, -this.f.f);
                }
                yk ykVar14 = this.d;
                if (ykVar14.F) {
                    j(this.a, this.i, ykVar14.aa);
                    return;
                }
                return;
            }
            yj yjVar8 = yjVarArr2[4];
            if (yjVar8.e != null) {
                yx yxVarK10 = k(yjVar8);
                if (yxVarK10 != null) {
                    j(this.a, yxVarK10, 0);
                    j(this.i, this.a, -this.d.aa);
                    j(this.j, this.i, this.f.f);
                    return;
                }
                return;
            }
            if ((ykVar11 instanceof yo) || ykVar11.T == null || ykVar11.L(7).e != null) {
                return;
            }
            yk ykVar15 = this.d;
            j(this.i, ykVar15.T.i.i, ykVar15.l());
            j(this.j, this.i, this.f.f);
            yk ykVar16 = this.d;
            if (ykVar16.F) {
                j(this.a, this.i, ykVar16.aa);
                return;
            }
            return;
        }
        yyVar.a(this);
        ykVar2 = this.d;
        yjVarArr = ykVar2.R;
        yjVar = yjVarArr[2];
        yjVar2 = yjVar.e;
        if (yjVar2 == null) {
            if (yjVar2 != null) {
                yxVarK3 = k(yjVar);
                if (yxVarK3 != null) {
                    j(this.i, yxVarK3, this.d.R[2].b());
                    i(this.j, this.i, 1, this.f);
                    if (this.d.F) {
                        i(this.a, this.i, 1, this.b);
                    }
                    if (this.k == 3) {
                        ykVar5 = this.d;
                        if (ykVar5.W > 0.0f) {
                            zcVar2 = ykVar5.h;
                            if (zcVar2.k == 3) {
                                zcVar2.f.j.add(this.f);
                                this.f.k.add(this.d.h.f);
                                this.f.a = this;
                            }
                        }
                    }
                }
            } else {
                yjVar3 = yjVarArr[3];
                if (yjVar3.e != null) {
                    yxVarK2 = k(yjVar3);
                    if (yxVarK2 != null) {
                        j(this.j, yxVarK2, -this.d.R[3].b());
                        i(this.i, this.j, -1, this.f);
                        if (this.d.F) {
                            i(this.a, this.i, 1, this.b);
                        }
                    }
                } else {
                    yjVar4 = yjVarArr[4];
                    if (yjVar4.e != null) {
                        yxVarK = k(yjVar4);
                        if (yxVarK != null) {
                            j(this.a, yxVarK, 0);
                            i(this.i, this.a, -1, this.b);
                            i(this.j, this.i, 1, this.f);
                        }
                    } else if (!(ykVar2 instanceof yo)) {
                        j(this.i, ykVar3.i.i, ykVar2.l());
                        i(this.j, this.i, 1, this.f);
                        if (this.d.F) {
                            i(this.a, this.i, 1, this.b);
                        }
                        if (this.k == 3) {
                            ykVar4 = this.d;
                            if (ykVar4.W > 0.0f) {
                                zcVar = ykVar4.h;
                                if (zcVar.k == 3) {
                                    zcVar.f.j.add(this.f);
                                    this.f.k.add(this.d.h.f);
                                    this.f.a = this;
                                }
                            }
                        }
                    }
                }
            }
        } else if (yjVar2 != null) {
            yxVarK3 = k(yjVar);
            if (yxVarK3 != null) {
                j(this.i, yxVarK3, this.d.R[2].b());
                i(this.j, this.i, 1, this.f);
                if (this.d.F) {
                    i(this.a, this.i, 1, this.b);
                }
                if (this.k == 3) {
                    ykVar5 = this.d;
                    if (ykVar5.W > 0.0f) {
                        zcVar2 = ykVar5.h;
                        if (zcVar2.k == 3) {
                            zcVar2.f.j.add(this.f);
                            this.f.k.add(this.d.h.f);
                            this.f.a = this;
                        }
                    }
                }
            }
        } else {
            yjVar3 = yjVarArr[3];
            if (yjVar3.e != null) {
                yxVarK2 = k(yjVar3);
                if (yxVarK2 != null) {
                    j(this.j, yxVarK2, -this.d.R[3].b());
                    i(this.i, this.j, -1, this.f);
                    if (this.d.F) {
                        i(this.a, this.i, 1, this.b);
                    }
                }
            } else {
                yjVar4 = yjVarArr[4];
                if (yjVar4.e != null) {
                    yxVarK = k(yjVar4);
                    if (yxVarK != null) {
                        j(this.a, yxVarK, 0);
                        i(this.i, this.a, -1, this.b);
                        i(this.j, this.i, 1, this.f);
                    }
                } else if (!(ykVar2 instanceof yo)) {
                    j(this.i, ykVar3.i.i, ykVar2.l());
                    i(this.j, this.i, 1, this.f);
                    if (this.d.F) {
                        i(this.a, this.i, 1, this.b);
                    }
                    if (this.k == 3) {
                        ykVar4 = this.d;
                        if (ykVar4.W > 0.0f) {
                            zcVar = ykVar4.h;
                            if (zcVar.k == 3) {
                                zcVar.f.j.add(this.f);
                                this.f.k.add(this.d.h.f);
                                this.f.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (this.f.k.size() == 0) {
            this.f.c = true;
        }
    }

    @Override // defpackage.zg
    public final void c() {
        yx yxVar = this.i;
        if (yxVar.i) {
            this.d.Z = yxVar.f;
        }
    }

    @Override // defpackage.zg
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.a.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.zg
    public final boolean e() {
        return this.k != 3 || this.d.t == 0;
    }

    @Override // defpackage.zg, defpackage.yv
    public final void f() {
        int i;
        int i2 = this.l;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        switch (i3) {
            case 3:
                yk ykVar = this.d;
                m(ykVar.K, ykVar.M, 1);
                return;
            default:
                yy yyVar = this.f;
                if (yyVar.c && !yyVar.i && this.k == 3) {
                    yk ykVar2 = this.d;
                    switch (ykVar2.t) {
                        case 2:
                            yk ykVar3 = ykVar2.T;
                            if (ykVar3 != null) {
                                yy yyVar2 = ykVar3.i.f;
                                if (yyVar2.i) {
                                    yyVar.c((int) ((yyVar2.f * ykVar2.A) + 0.5f));
                                }
                            }
                            break;
                        case 3:
                            yy yyVar3 = ykVar2.h.f;
                            if (yyVar3.i) {
                                switch (ykVar2.X) {
                                    case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                                        i = (int) ((yyVar3.f / ykVar2.W) + 0.5f);
                                        break;
                                    case 0:
                                        i = (int) ((yyVar3.f * ykVar2.W) + 0.5f);
                                        break;
                                    default:
                                        i = (int) ((yyVar3.f / ykVar2.W) + 0.5f);
                                        break;
                                }
                                yyVar.c(i);
                            }
                            break;
                    }
                }
                yx yxVar = this.i;
                if (yxVar.c) {
                    yx yxVar2 = this.j;
                    if (yxVar2.c) {
                        if (yxVar.i && yxVar2.i && this.f.i) {
                            return;
                        }
                        if (!this.f.i && this.k == 3) {
                            yk ykVar4 = this.d;
                            if (ykVar4.s == 0 && !ykVar4.J()) {
                                yx yxVar3 = (yx) this.i.k.get(0);
                                yx yxVar4 = (yx) this.j.k.get(0);
                                int i4 = yxVar3.f;
                                yx yxVar5 = this.i;
                                int i5 = i4 + yxVar5.e;
                                int i6 = yxVar4.f + this.j.e;
                                yxVar5.c(i5);
                                this.j.c(i6);
                                this.f.c(i6 - i5);
                                return;
                            }
                        }
                        if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                            int i7 = (((yx) this.j.k.get(0)).f + this.j.e) - (((yx) this.i.k.get(0)).f + this.i.e);
                            yy yyVar4 = this.f;
                            int i8 = yyVar4.m;
                            if (i7 < i8) {
                                yyVar4.c(i7);
                            } else {
                                yyVar4.c(i8);
                            }
                        }
                        if (this.f.i && this.i.k.size() > 0 && this.j.k.size() > 0) {
                            yx yxVar6 = (yx) this.i.k.get(0);
                            yx yxVar7 = (yx) this.j.k.get(0);
                            int i9 = yxVar6.f;
                            yx yxVar8 = this.i;
                            int i10 = yxVar8.e + i9;
                            int i11 = yxVar7.f;
                            int i12 = this.j.e + i11;
                            float f = this.d.ae;
                            if (yxVar6 == yxVar7) {
                                f = 0.5f;
                            }
                            if (yxVar6 != yxVar7) {
                                i11 = i12;
                            }
                            if (yxVar6 != yxVar7) {
                                i9 = i10;
                            }
                            yxVar8.c((int) (i9 + 0.5f + (((i11 - i9) - this.f.f) * f)));
                            this.j.c(this.i.f + this.f.f);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void g() {
        this.h = false;
        this.i.b();
        this.i.i = false;
        this.j.b();
        this.j.i = false;
        this.a.b();
        this.a.i = false;
        this.f.i = false;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d.ah);
        return strValueOf.length() != 0 ? "VerticalRun ".concat(strValueOf) : new String("VerticalRun ");
    }
}
