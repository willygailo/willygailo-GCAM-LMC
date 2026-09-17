package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yh extends yo {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    public final int a() {
        switch (this.a) {
            case 0:
            case 1:
                return 0;
            case 2:
            case 3:
                return 1;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa A[DONT_INVERT, PHI: r7
      0x00fa: PHI (r7v9 boolean) = (r7v3 boolean), (r7v10 boolean) binds: [B:78:0x00f4, B:80:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0103  */
    @Override // defpackage.yk
    public final void b(ya yaVar, boolean z) {
        yj[] yjVarArr;
        boolean z2;
        yj[] yjVarArr2 = this.R;
        yjVarArr2[0] = this.J;
        yjVarArr2[2] = this.K;
        yjVarArr2[1] = this.L;
        yjVarArr2[3] = this.M;
        int i = 0;
        while (true) {
            yjVarArr = this.R;
            int length = yjVarArr.length;
            if (i >= 6) {
                break;
            }
            yj yjVar = yjVarArr[i];
            yjVar.h = yaVar.b(yjVar);
            i++;
        }
        int i2 = this.a;
        if (i2 < 0 || i2 >= 4) {
            return;
        }
        yj yjVar2 = yjVarArr[i2];
        if (!this.d) {
            c();
        }
        if (this.d) {
            this.d = false;
            int i3 = this.a;
            if (i3 == 0 || i3 == 1) {
                yaVar.f(this.J.h, this.Y);
                yaVar.f(this.L.h, this.Y);
                return;
            } else {
                if (i3 == 2 || i3 == 3) {
                    yaVar.f(this.K.h, this.Z);
                    yaVar.f(this.M.h, this.Z);
                    return;
                }
                return;
            }
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.ar) {
                z2 = false;
                break;
            }
            yk ykVar = this.aq[i4];
            if (this.b || ykVar.d()) {
                int i5 = this.a;
                if ((i5 == 0 || i5 == 1) && ykVar.N() == 3 && ykVar.J.e != null && ykVar.L.e != null) {
                    z2 = true;
                    break;
                }
                int i6 = this.a;
                if ((i6 == 2 || i6 == 3) && ykVar.O() == 3 && ykVar.K.e != null && ykVar.M.e != null) {
                    z2 = true;
                    break;
                }
            }
            i4++;
        }
        boolean z3 = this.J.f() || this.L.f();
        boolean z4 = this.K.f() || this.M.f();
        int i7 = 5;
        if (z2) {
            i7 = 4;
        } else {
            int i8 = this.a;
            if (i8 != 0) {
                if (i8 != 2) {
                    if ((i8 == 1 || !z3) && (i8 != 3 || !z4)) {
                        i7 = 4;
                    }
                } else if (!z4) {
                    z4 = false;
                    if (i8 == 1) {
                        i7 = 4;
                    } else {
                        i7 = 4;
                    }
                }
            } else if (!z3) {
                i8 = 0;
                z3 = false;
                if (i8 != 2) {
                    if (i8 == 1) {
                        i7 = 4;
                    } else {
                        i7 = 4;
                    }
                } else if (!z4) {
                    z4 = false;
                    if (i8 == 1) {
                        i7 = 4;
                    } else {
                        i7 = 4;
                    }
                }
            }
        }
        for (int i9 = 0; i9 < this.ar; i9++) {
            yk ykVar2 = this.aq[i9];
            if (this.b || ykVar2.d()) {
                yf yfVarB = yaVar.b(ykVar2.R[this.a]);
                yj[] yjVarArr3 = ykVar2.R;
                int i10 = this.a;
                yj yjVar3 = yjVarArr3[i10];
                yjVar3.h = yfVarB;
                yj yjVar4 = yjVar3.e;
                int i11 = (yjVar4 == null || yjVar4.d != this) ? 0 : yjVar3.f;
                if (i10 == 0 || i10 == 2) {
                    yf yfVar = yjVar2.h;
                    int i12 = this.c;
                    xy xyVarA = yaVar.a();
                    yf yfVarC = yaVar.c();
                    yfVarC.e = 0;
                    xyVarA.i(yfVar, yfVarB, yfVarC, i12 - i11);
                    yaVar.e(xyVarA);
                } else {
                    yf yfVar2 = yjVar2.h;
                    int i13 = this.c;
                    xy xyVarA2 = yaVar.a();
                    yf yfVarC2 = yaVar.c();
                    yfVarC2.e = 0;
                    xyVarA2.h(yfVar2, yfVarB, yfVarC2, i13 + i11);
                    yaVar.e(xyVarA2);
                }
                yaVar.m(yjVar2.h, yfVarB, this.c + i11, i7);
            }
        }
        int i14 = this.a;
        if (i14 == 0) {
            yaVar.m(this.L.h, this.J.h, 0, 8);
            yaVar.m(this.J.h, this.T.L.h, 0, 4);
            yaVar.m(this.J.h, this.T.J.h, 0, 0);
            return;
        }
        if (i14 == 1) {
            yaVar.m(this.J.h, this.L.h, 0, 8);
            yaVar.m(this.J.h, this.T.J.h, 0, 4);
            yaVar.m(this.J.h, this.T.L.h, 0, 0);
        } else if (i14 == 2) {
            yaVar.m(this.M.h, this.K.h, 0, 8);
            yaVar.m(this.K.h, this.T.M.h, 0, 4);
            yaVar.m(this.K.h, this.T.K.h, 0, 0);
        } else if (i14 == 3) {
            yaVar.m(this.K.h, this.M.h, 0, 8);
            yaVar.m(this.K.h, this.T.K.h, 0, 4);
            yaVar.m(this.K.h, this.T.M.h, 0, 0);
        }
    }

    public final boolean c() {
        int i;
        int i2 = 0;
        boolean z = true;
        while (true) {
            i = this.ar;
            if (i2 >= i) {
                break;
            }
            yk ykVar = this.aq[i2];
            if (this.b || ykVar.d()) {
                int i3 = this.a;
                if ((i3 == 0 || i3 == 1) && !ykVar.e()) {
                    z = false;
                } else {
                    int i4 = this.a;
                    if ((i4 == 2 || i4 == 3) && !ykVar.f()) {
                        z = false;
                    }
                }
            }
            i2++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.ar; i5++) {
            yk ykVar2 = this.aq[i5];
            if (this.b || ykVar2.d()) {
                if (!z2) {
                    int i6 = this.a;
                    if (i6 == 0) {
                        iMax = ykVar2.L(2).a();
                    } else if (i6 == 1) {
                        iMax = ykVar2.L(4).a();
                    } else if (i6 == 2) {
                        iMax = ykVar2.L(3).a();
                    } else if (i6 == 3) {
                        iMax = ykVar2.L(5).a();
                    }
                }
                int i7 = this.a;
                if (i7 == 0) {
                    iMax = Math.min(iMax, ykVar2.L(2).a());
                    z2 = true;
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, ykVar2.L(4).a());
                    z2 = true;
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, ykVar2.L(3).a());
                    z2 = true;
                } else {
                    if (i7 == 3) {
                        iMax = Math.max(iMax, ykVar2.L(5).a());
                    }
                    z2 = true;
                }
            }
        }
        int i8 = iMax + this.c;
        int i9 = this.a;
        if (i9 == 0 || i9 == 1) {
            w(i8, i8);
        } else {
            x(i8, i8);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.yk
    public final boolean d() {
        return true;
    }

    @Override // defpackage.yk
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.yk
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.yk
    public final String toString() {
        String str = this.ah;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append("[Barrier] ");
        sb.append(str);
        sb.append(" {");
        String string = sb.toString();
        for (int i = 0; i < this.ar; i++) {
            yk ykVar = this.aq[i];
            if (i > 0) {
                string = String.valueOf(string).concat(", ");
            }
            String strValueOf = String.valueOf(string);
            String strValueOf2 = String.valueOf(ykVar.ah);
            string = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        }
        return String.valueOf(string).concat("}");
    }
}
