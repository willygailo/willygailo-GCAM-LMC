package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class yu extends zg {
    ArrayList a;
    private int b;

    public yu(yk ykVar, int i) {
        super(ykVar);
        this.a = new ArrayList();
        this.g = i;
        yk ykVar2 = this.d;
        yk ykVarN = ykVar2.n(i);
        yk ykVar3 = ykVar2;
        yk ykVarN2 = ykVarN;
        while (ykVarN2 != null) {
            ykVar3 = ykVarN2;
            ykVarN2 = ykVarN2.n(this.g);
        }
        this.d = ykVar3;
        this.a.add(ykVar3.o(this.g));
        yk ykVarM = ykVar3.m(this.g);
        while (ykVarM != null) {
            this.a.add(ykVarM.o(this.g));
            ykVarM = ykVarM.m(this.g);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zg zgVar = (zg) arrayList.get(i2);
            int i3 = this.g;
            if (i3 == 0) {
                zgVar.d.f = this;
            } else if (i3 == 1) {
                zgVar.d.g = this;
            }
        }
        if (this.g == 0 && ((yl) this.d.T).d && this.a.size() > 1) {
            ArrayList arrayList2 = this.a;
            this.d = ((zg) arrayList2.get(arrayList2.size() - 1)).d;
        }
        this.b = this.g == 0 ? this.d.ai : this.d.aj;
    }

    private final yk g() {
        for (int i = 0; i < this.a.size(); i++) {
            yk ykVar = ((zg) this.a.get(i)).d;
            if (ykVar.ag != 8) {
                return ykVar;
            }
        }
        return null;
    }

    private final yk n() {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            yk ykVar = ((zg) this.a.get(size)).d;
            if (ykVar.ag != 8) {
                return ykVar;
            }
        }
        return null;
    }

    @Override // defpackage.zg
    public final long a() {
        int size = this.a.size();
        long jA = 0;
        for (int i = 0; i < size; i++) {
            zg zgVar = (zg) this.a.get(i);
            jA = jA + ((long) zgVar.i.e) + zgVar.a() + ((long) zgVar.j.e);
        }
        return jA;
    }

    @Override // defpackage.zg
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zg) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        yk ykVar = ((zg) this.a.get(0)).d;
        yk ykVar2 = ((zg) this.a.get(size2 - 1)).d;
        if (this.g == 0) {
            yj yjVar = ykVar.J;
            yj yjVar2 = ykVar2.L;
            yx yxVarL = l(yjVar, 0);
            int iB = yjVar.b();
            yk ykVarG = g();
            if (ykVarG != null) {
                iB = ykVarG.J.b();
            }
            if (yxVarL != null) {
                j(this.i, yxVarL, iB);
            }
            yx yxVarL2 = l(yjVar2, 0);
            int iB2 = yjVar2.b();
            yk ykVarN = n();
            if (ykVarN != null) {
                iB2 = ykVarN.L.b();
            }
            if (yxVarL2 != null) {
                j(this.j, yxVarL2, -iB2);
            }
        } else {
            yj yjVar3 = ykVar.K;
            yj yjVar4 = ykVar2.M;
            yx yxVarL3 = l(yjVar3, 1);
            int iB3 = yjVar3.b();
            yk ykVarG2 = g();
            if (ykVarG2 != null) {
                iB3 = ykVarG2.K.b();
            }
            if (yxVarL3 != null) {
                j(this.i, yxVarL3, iB3);
            }
            yx yxVarL4 = l(yjVar4, 1);
            int iB4 = yjVar4.b();
            yk ykVarN2 = n();
            if (ykVarN2 != null) {
                iB4 = ykVarN2.M.b();
            }
            if (yxVarL4 != null) {
                j(this.j, yxVarL4, -iB4);
            }
        }
        this.i.a = this;
        this.j.a = this;
    }

    @Override // defpackage.zg
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((zg) this.a.get(i)).c();
        }
    }

    @Override // defpackage.zg
    public final void d() {
        this.e = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zg) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.zg
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((zg) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:140:0x0215  */
    /* JADX WARN: Code duplicated, block: B:141:0x0219  */
    /* JADX WARN: Code duplicated, block: B:145:0x0220  */
    /* JADX WARN: Code duplicated, block: B:146:0x0224  */
    /* JADX WARN: Code duplicated, block: B:149:0x022b  */
    /* JADX WARN: Code duplicated, block: B:151:0x022f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0235 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x0237  */
    /* JADX WARN: Code duplicated, block: B:154:0x023b  */
    /* JADX WARN: Code duplicated, block: B:156:0x023e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0244 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0246  */
    /* JADX WARN: Code duplicated, block: B:161:0x024b  */
    /* JADX WARN: Code duplicated, block: B:164:0x025c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0267  */
    /* JADX WARN: Code duplicated, block: B:166:0x0269 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x026b  */
    /* JADX WARN: Code duplicated, block: B:168:0x026d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0274  */
    /* JADX WARN: Code duplicated, block: B:173:0x027a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0281  */
    /* JADX WARN: Code duplicated, block: B:176:0x0287  */
    /* JADX WARN: Code duplicated, block: B:183:0x029f  */
    /* JADX WARN: Code duplicated, block: B:184:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:187:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:197:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:199:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:202:0x02da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:207:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:208:0x02fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:210:0x0301  */
    /* JADX WARN: Code duplicated, block: B:214:0x0308  */
    /* JADX WARN: Code duplicated, block: B:215:0x030e  */
    /* JADX WARN: Code duplicated, block: B:217:0x0315  */
    /* JADX WARN: Code duplicated, block: B:218:0x031b  */
    /* JADX WARN: Code duplicated, block: B:225:0x0337  */
    /* JADX WARN: Code duplicated, block: B:226:0x0339  */
    /* JADX WARN: Code duplicated, block: B:228:0x033c  */
    /* JADX WARN: Code duplicated, block: B:229:0x0342  */
    /* JADX WARN: Code duplicated, block: B:236:0x035e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0361  */
    /* JADX WARN: Code duplicated, block: B:240:0x0365  */
    /* JADX WARN: Code duplicated, block: B:241:0x036a  */
    /* JADX WARN: Code duplicated, block: B:243:0x0370  */
    /* JADX WARN: Code duplicated, block: B:250:0x0385  */
    /* JADX WARN: Code duplicated, block: B:251:0x0388  */
    /* JADX WARN: Code duplicated, block: B:254:0x038d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x038f  */
    /* JADX WARN: Code duplicated, block: B:256:0x0394  */
    /* JADX WARN: Code duplicated, block: B:259:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:260:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:263:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:264:0x03be  */
    /* JADX WARN: Code duplicated, block: B:266:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:267:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:275:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:276:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:278:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:279:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:286:0x040a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    @Override // defpackage.zg, defpackage.yv
    public final void f() {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        int i11;
        int i12;
        int i13;
        zg zgVar;
        yy yyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zg zgVar2;
        int i19;
        yy yyVar2;
        int iMin;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        zg zgVar3;
        yy yyVar3;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        float f3;
        yx yxVar = this.i;
        if (yxVar.i) {
            yx yxVar2 = this.j;
            if (yxVar2.i) {
                yk ykVar = this.d.T;
                boolean z2 = ykVar instanceof yl ? ((yl) ykVar).d : false;
                int i30 = yxVar2.f - yxVar.f;
                int size = this.a.size();
                int i31 = 0;
                while (true) {
                    i = 8;
                    if (i31 >= size) {
                        i31 = -1;
                        break;
                    } else if (((zg) this.a.get(i31)).d.ag != 8) {
                        break;
                    } else {
                        i31++;
                    }
                }
                int i32 = size - 1;
                int i33 = i32;
                while (true) {
                    if (i33 < 0) {
                        i33 = -1;
                        break;
                    } else if (((zg) this.a.get(i33)).d.ag != 8) {
                        break;
                    } else {
                        i33--;
                    }
                }
                int i34 = 0;
                while (true) {
                    int i35 = 3;
                    if (i34 >= 2) {
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        f = 0.0f;
                        break;
                    }
                    i3 = 0;
                    int i36 = 0;
                    int i37 = 0;
                    f = 0.0f;
                    int i38 = 0;
                    while (i36 < size) {
                        zg zgVar4 = (zg) this.a.get(i36);
                        yk ykVar2 = zgVar4.d;
                        if (ykVar2.ag != i) {
                            i38++;
                            if (i36 > 0 && i36 >= i31) {
                                i3 += zgVar4.i.e;
                            }
                            yy yyVar4 = zgVar4.f;
                            int i39 = yyVar4.f;
                            boolean z3 = zgVar4.k != i35;
                            if (z3) {
                                int i40 = this.g;
                                if (i40 == 0) {
                                    if (!ykVar2.h.f.i) {
                                        return;
                                    } else {
                                        i28 = i39;
                                    }
                                } else if (i40 == 1 && !ykVar2.i.f.i) {
                                    return;
                                } else {
                                    i28 = i39;
                                }
                            } else {
                                i28 = i39;
                                if (zgVar4.c == 1 && i34 == 0) {
                                    i29 = yyVar4.m;
                                    i37++;
                                    z3 = true;
                                } else if (yyVar4.i) {
                                    i29 = i28;
                                    z3 = true;
                                }
                                if (z3) {
                                    i3 += i29;
                                } else {
                                    i37++;
                                    f3 = ykVar2.ak[this.g];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                }
                                if (i36 >= i32 && i36 < i33) {
                                    i3 += -zgVar4.j.e;
                                }
                            }
                            i29 = i28;
                            if (z3) {
                                i37++;
                                f3 = ykVar2.ak[this.g];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i3 += i29;
                            }
                            if (i36 >= i32) {
                            }
                        }
                        i36++;
                        i = 8;
                        i35 = 3;
                    }
                    if (i3 < i30 || i37 == 0) {
                        i2 = i37;
                        i4 = i38;
                        break;
                    } else {
                        i34++;
                        i = 8;
                    }
                }
                int i41 = this.i.f;
                if (z2) {
                    i41 = this.j.f;
                }
                if (i3 > i30) {
                    i41 = z2 ? i41 + ((int) (((i3 - i30) / 2.0f) + 0.5f)) : i41 - ((int) (((i3 - i30) / 2.0f) + 0.5f));
                }
                if (i2 > 0) {
                    float f4 = i30 - i3;
                    int i42 = (int) ((f4 / i2) + 0.5f);
                    int i43 = 0;
                    int i44 = 0;
                    while (i43 < size) {
                        zg zgVar5 = (zg) this.a.get(i43);
                        int i45 = i3;
                        yk ykVar3 = zgVar5.d;
                        int i46 = i42;
                        int i47 = i41;
                        if (ykVar3.ag == 8) {
                            z2 = z2;
                        } else if (zgVar5.k == 3) {
                            yy yyVar5 = zgVar5.f;
                            if (yyVar5.i) {
                                z2 = z2;
                            } else {
                                int i48 = f > 0.0f ? (int) (((ykVar3.ak[this.g] * f4) / f) + 0.5f) : i46;
                                if (this.g == 0) {
                                    i26 = ykVar3.w;
                                    i27 = ykVar3.v;
                                } else {
                                    i26 = ykVar3.z;
                                    i27 = ykVar3.y;
                                }
                                int iMax = Math.max(i27, zgVar5.c == 1 ? Math.min(i48, yyVar5.m) : i48);
                                if (i26 > 0) {
                                    iMax = Math.min(i26, iMax);
                                }
                                if (iMax != i48) {
                                    i44++;
                                    i48 = iMax;
                                }
                                zgVar5.f.c(i48);
                            }
                        } else {
                            z2 = z2;
                        }
                        i43++;
                        i3 = i45;
                        i42 = i46;
                        i41 = i47;
                        z2 = z2;
                        f4 = f4;
                        i4 = i4;
                    }
                    z = z2;
                    int i49 = i3;
                    i5 = i4;
                    i6 = i41;
                    if (i44 > 0) {
                        i2 -= i44;
                        i3 = 0;
                        for (int i50 = 0; i50 < size; i50++) {
                            zg zgVar6 = (zg) this.a.get(i50);
                            if (zgVar6.d.ag != 8) {
                                if (i50 > 0 && i50 >= i31) {
                                    i3 += zgVar6.i.e;
                                }
                                i3 += zgVar6.f.f;
                                if (i50 < i32 && i50 < i33) {
                                    i3 += -zgVar6.j.e;
                                }
                            }
                        }
                    } else {
                        i3 = i49;
                    }
                    if (this.b == 2 && i44 == 0) {
                        this.b = 0;
                    }
                    if (i3 > i30) {
                        i7 = 2;
                        this.b = 2;
                    } else {
                        i7 = 2;
                    }
                    if (i5 > 0 && i2 == 0) {
                        if (i31 == i33) {
                            this.b = i7;
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                    }
                    i8 = this.b;
                    if (i8 == 1) {
                        i20 = i5;
                        if (i20 > 1) {
                            i21 = (i30 - i3) / (i20 - 1);
                        } else if (i20 == 1) {
                            i21 = (i30 - i3) / 2;
                        } else {
                            i21 = 0;
                        }
                        if (i2 > 0) {
                            i21 = 0;
                        }
                        i22 = i6;
                        for (i23 = 0; i23 < size; i23++) {
                            if (z) {
                                i24 = size - (i23 + 1);
                            } else {
                                i24 = i23;
                            }
                            zgVar3 = (zg) this.a.get(i24);
                            if (zgVar3.d.ag == 8) {
                                zgVar3.i.c(i22);
                                zgVar3.j.c(i22);
                            } else {
                                if (i23 > 0) {
                                    if (z) {
                                        i22 -= i21;
                                    } else {
                                        i22 += i21;
                                    }
                                }
                                if (i23 > 0 && i23 >= i31) {
                                    if (z) {
                                        i22 -= zgVar3.i.e;
                                    } else {
                                        i22 += zgVar3.i.e;
                                    }
                                }
                                if (z) {
                                    zgVar3.j.c(i22);
                                } else {
                                    zgVar3.i.c(i22);
                                }
                                yyVar3 = zgVar3.f;
                                i25 = yyVar3.f;
                                if (zgVar3.k == 3 && zgVar3.c == 1) {
                                    i25 = yyVar3.m;
                                }
                                if (z) {
                                    i22 -= i25;
                                } else {
                                    i22 += i25;
                                }
                                if (z) {
                                    zgVar3.i.c(i22);
                                } else {
                                    zgVar3.j.c(i22);
                                }
                                zgVar3.h = true;
                                if (i23 >= i32 && i23 < i33) {
                                    i22 = z ? i22 - (-zgVar3.j.e) : i22 + (-zgVar3.j.e);
                                }
                            }
                        }
                        return;
                    }
                    i9 = i5;
                    if (i8 == 0) {
                        i15 = (i30 - i3) / (i9 + 1);
                        if (i2 > 0) {
                            i15 = 0;
                        }
                        i16 = i6;
                        for (i17 = 0; i17 < size; i17++) {
                            if (z) {
                                i18 = size - (i17 + 1);
                            } else {
                                i18 = i17;
                            }
                            zgVar2 = (zg) this.a.get(i18);
                            if (zgVar2.d.ag == 8) {
                                zgVar2.i.c(i16);
                                zgVar2.j.c(i16);
                            } else {
                                if (z) {
                                    i19 = i16 - i15;
                                } else {
                                    i19 = i16 + i15;
                                }
                                if (i17 > 0 && i17 >= i31) {
                                    if (z) {
                                        i19 -= zgVar2.i.e;
                                    } else {
                                        i19 += zgVar2.i.e;
                                    }
                                }
                                if (z) {
                                    zgVar2.j.c(i19);
                                } else {
                                    zgVar2.i.c(i19);
                                }
                                yyVar2 = zgVar2.f;
                                iMin = yyVar2.f;
                                if (zgVar2.k == 3 && zgVar2.c == 1) {
                                    iMin = Math.min(iMin, yyVar2.m);
                                }
                                if (z) {
                                    i16 = i19 - iMin;
                                } else {
                                    i16 = i19 + iMin;
                                }
                                if (z) {
                                    zgVar2.i.c(i16);
                                } else {
                                    zgVar2.j.c(i16);
                                }
                                if (i17 >= i32 && i17 < i33) {
                                    i16 = z ? i16 - (-zgVar2.j.e) : i16 + (-zgVar2.j.e);
                                }
                            }
                        }
                        return;
                    }
                    if (i8 == 2) {
                        if (this.g == 0) {
                            f2 = this.d.ad;
                        } else {
                            f2 = this.d.ae;
                        }
                        if (z) {
                            f2 = 1.0f - f2;
                        }
                        i10 = (int) (((i30 - i3) * f2) + 0.5f);
                        if (i10 >= 0 || i2 > 0) {
                        }
                        if (z) {
                            i11 = i6 - i10;
                        } else {
                            i11 = i6 + i10;
                        }
                        for (i12 = 0; i12 < size; i12++) {
                            if (z) {
                                i13 = size - (i12 + 1);
                            } else {
                                i13 = i12;
                            }
                            zgVar = (zg) this.a.get(i13);
                            if (zgVar.d.ag == 8) {
                                zgVar.i.c(i11);
                                zgVar.j.c(i11);
                            } else {
                                if (i12 > 0 && i12 >= i31) {
                                    if (z) {
                                        i11 -= zgVar.i.e;
                                    } else {
                                        i11 += zgVar.i.e;
                                    }
                                }
                                if (z) {
                                    zgVar.j.c(i11);
                                } else {
                                    zgVar.i.c(i11);
                                }
                                yyVar = zgVar.f;
                                i14 = yyVar.f;
                                if (zgVar.k == 3 && zgVar.c == 1) {
                                    i14 = yyVar.m;
                                }
                                if (z) {
                                    i11 -= i14;
                                } else {
                                    i11 += i14;
                                }
                                if (z) {
                                    zgVar.i.c(i11);
                                } else {
                                    zgVar.j.c(i11);
                                }
                                if (i12 >= i32 && i12 < i33) {
                                    i11 = z ? i11 - (-zgVar.j.e) : i11 + (-zgVar.j.e);
                                }
                            }
                        }
                    }
                }
                z = z2;
                i5 = i4;
                i6 = i41;
                if (i3 > i30) {
                    i7 = 2;
                    this.b = 2;
                } else {
                    i7 = 2;
                }
                if (i5 > 0) {
                    if (i31 == i33) {
                        this.b = i7;
                        i2 = 0;
                    } else {
                        i2 = 0;
                    }
                }
                i8 = this.b;
                if (i8 == 1) {
                    i20 = i5;
                    if (i20 > 1) {
                        i21 = (i30 - i3) / (i20 - 1);
                    } else if (i20 == 1) {
                        i21 = (i30 - i3) / 2;
                    } else {
                        i21 = 0;
                    }
                    if (i2 > 0) {
                        i21 = 0;
                    }
                    i22 = i6;
                    while (i23 < size) {
                        if (z) {
                            i24 = size - (i23 + 1);
                        } else {
                            i24 = i23;
                        }
                        zgVar3 = (zg) this.a.get(i24);
                        if (zgVar3.d.ag == 8) {
                            zgVar3.i.c(i22);
                            zgVar3.j.c(i22);
                        } else {
                            if (i23 > 0) {
                                if (z) {
                                    i22 -= i21;
                                } else {
                                    i22 += i21;
                                }
                            }
                            if (i23 > 0) {
                                if (z) {
                                    i22 -= zgVar3.i.e;
                                } else {
                                    i22 += zgVar3.i.e;
                                }
                            }
                            if (z) {
                                zgVar3.j.c(i22);
                            } else {
                                zgVar3.i.c(i22);
                            }
                            yyVar3 = zgVar3.f;
                            i25 = yyVar3.f;
                            if (zgVar3.k == 3) {
                                i25 = yyVar3.m;
                            }
                            if (z) {
                                i22 -= i25;
                            } else {
                                i22 += i25;
                            }
                            if (z) {
                                zgVar3.i.c(i22);
                            } else {
                                zgVar3.j.c(i22);
                            }
                            zgVar3.h = true;
                            if (i23 >= i32) {
                            }
                        }
                    }
                    return;
                }
                i9 = i5;
                if (i8 == 0) {
                    i15 = (i30 - i3) / (i9 + 1);
                    if (i2 > 0) {
                        i15 = 0;
                    }
                    i16 = i6;
                    while (i17 < size) {
                        if (z) {
                            i18 = size - (i17 + 1);
                        } else {
                            i18 = i17;
                        }
                        zgVar2 = (zg) this.a.get(i18);
                        if (zgVar2.d.ag == 8) {
                            zgVar2.i.c(i16);
                            zgVar2.j.c(i16);
                        } else {
                            if (z) {
                                i19 = i16 - i15;
                            } else {
                                i19 = i16 + i15;
                            }
                            if (i17 > 0) {
                                if (z) {
                                    i19 -= zgVar2.i.e;
                                } else {
                                    i19 += zgVar2.i.e;
                                }
                            }
                            if (z) {
                                zgVar2.j.c(i19);
                            } else {
                                zgVar2.i.c(i19);
                            }
                            yyVar2 = zgVar2.f;
                            iMin = yyVar2.f;
                            if (zgVar2.k == 3) {
                                iMin = Math.min(iMin, yyVar2.m);
                            }
                            if (z) {
                                i16 = i19 - iMin;
                            } else {
                                i16 = i19 + iMin;
                            }
                            if (z) {
                                zgVar2.i.c(i16);
                            } else {
                                zgVar2.j.c(i16);
                            }
                            if (i17 >= i32) {
                            }
                        }
                    }
                    return;
                }
                if (i8 == 2) {
                    if (this.g == 0) {
                        f2 = this.d.ad;
                    } else {
                        f2 = this.d.ae;
                    }
                    if (z) {
                        f2 = 1.0f - f2;
                    }
                    i10 = (int) (((i30 - i3) * f2) + 0.5f);
                    i10 = i10 >= 0 ? 0 : 0;
                    if (z) {
                        i11 = i6 - i10;
                    } else {
                        i11 = i6 + i10;
                    }
                    while (i12 < size) {
                        if (z) {
                            i13 = size - (i12 + 1);
                        } else {
                            i13 = i12;
                        }
                        zgVar = (zg) this.a.get(i13);
                        if (zgVar.d.ag == 8) {
                            zgVar.i.c(i11);
                            zgVar.j.c(i11);
                        } else {
                            if (i12 > 0) {
                                if (z) {
                                    i11 -= zgVar.i.e;
                                } else {
                                    i11 += zgVar.i.e;
                                }
                            }
                            if (z) {
                                zgVar.j.c(i11);
                            } else {
                                zgVar.i.c(i11);
                            }
                            yyVar = zgVar.f;
                            i14 = yyVar.f;
                            if (zgVar.k == 3) {
                                i14 = yyVar.m;
                            }
                            if (z) {
                                i11 -= i14;
                            } else {
                                i11 += i14;
                            }
                            if (z) {
                                zgVar.i.c(i11);
                            } else {
                                zgVar.j.c(i11);
                            }
                            if (i12 >= i32) {
                            }
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.g == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zg zgVar = (zg) arrayList.get(i);
            sb.append("<");
            sb.append(zgVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
