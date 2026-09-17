package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yn extends yk {
    private boolean ar;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public yj d = this.K;
    public int aq = 0;

    public yn() {
        this.S.clear();
        this.S.add(this.d);
        int length = this.R.length;
        for (int i = 0; i < 6; i++) {
            this.R[i] = this.d;
        }
    }

    @Override // defpackage.yk
    public final yj L(int i) {
        switch (i - 1) {
            case 1:
            case 3:
                if (this.aq == 1) {
                    return this.d;
                }
                return null;
            case 2:
            case 4:
                if (this.aq == 0) {
                    return this.d;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // defpackage.yk
    public final void S(boolean z) {
        if (this.T == null) {
            return;
        }
        int iO = ya.o(this.d);
        if (this.aq == 1) {
            this.Y = iO;
            this.Z = 0;
            y(this.T.h());
            D(0);
            return;
        }
        this.Y = 0;
        this.Z = iO;
        D(this.T.j());
        y(0);
    }

    public final void a(int i) {
        this.d.e(i);
        this.ar = true;
    }

    @Override // defpackage.yk
    public final void b(ya yaVar, boolean z) {
        yk ykVar = this.T;
        if (ykVar == null) {
            return;
        }
        Object objL = ykVar.L(2);
        Object objL2 = ykVar.L(4);
        yk ykVar2 = this.T;
        boolean z2 = ykVar2 != null && ykVar2.ap[0] == 2;
        if (this.aq == 0) {
            objL = ykVar.L(3);
            objL2 = ykVar.L(5);
            yk ykVar3 = this.T;
            z2 = ykVar3 != null && ykVar3.ap[1] == 2;
        }
        if (this.ar) {
            yj yjVar = this.d;
            if (yjVar.c) {
                yf yfVarB = yaVar.b(yjVar);
                yaVar.f(yfVarB, this.d.a());
                if (this.b != -1) {
                    if (z2) {
                        yaVar.g(yaVar.b(objL2), yfVarB, 0, 5);
                    }
                } else if (this.c != -1 && z2) {
                    yf yfVarB2 = yaVar.b(objL2);
                    yaVar.g(yfVarB, yaVar.b(objL), 0, 5);
                    yaVar.g(yfVarB2, yfVarB, 0, 5);
                }
                this.ar = false;
                return;
            }
        }
        if (this.b != -1) {
            yf yfVarB3 = yaVar.b(this.d);
            yaVar.m(yfVarB3, yaVar.b(objL), this.b, 8);
            if (z2) {
                yaVar.g(yaVar.b(objL2), yfVarB3, 0, 5);
                return;
            }
            return;
        }
        if (this.c != -1) {
            yf yfVarB4 = yaVar.b(this.d);
            yf yfVarB5 = yaVar.b(objL2);
            yaVar.m(yfVarB4, yfVarB5, -this.c, 8);
            if (z2) {
                yaVar.g(yfVarB4, yaVar.b(objL), 0, 5);
                yaVar.g(yfVarB5, yfVarB4, 0, 5);
                return;
            }
            return;
        }
        if (this.a != -1.0f) {
            yf yfVarB6 = yaVar.b(this.d);
            yf yfVarB7 = yaVar.b(objL2);
            float f = this.a;
            xy xyVarA = yaVar.a();
            xyVarA.e.g(yfVarB6, -1.0f);
            xyVarA.e.g(yfVarB7, f);
            yaVar.e(xyVarA);
        }
    }

    public final void c(int i) {
        if (this.aq == i) {
            return;
        }
        this.aq = i;
        this.S.clear();
        if (this.aq == 1) {
            this.d = this.J;
        } else {
            this.d = this.K;
        }
        this.S.add(this.d);
        int length = this.R.length;
        for (int i2 = 0; i2 < 6; i2++) {
            this.R[i2] = this.d;
        }
    }

    @Override // defpackage.yk
    public final boolean d() {
        return true;
    }

    @Override // defpackage.yk
    public final boolean e() {
        return this.ar;
    }

    @Override // defpackage.yk
    public final boolean f() {
        return this.ar;
    }
}
