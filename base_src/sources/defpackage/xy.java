package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class xy {
    yf a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public xx e;

    public xy() {
    }

    public xy(xz xzVar) {
        this.e = new xx(this, xzVar);
    }

    public static final boolean l(yf yfVar) {
        return yfVar.l <= 1;
    }

    public final yf a(boolean[] zArr, yf yfVar) {
        int i;
        int i2 = this.e.a;
        yf yfVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float fB = this.e.b(i3);
            if (fB < 0.0f) {
                yf yfVarD = this.e.d(i3);
                if ((zArr == null || !zArr[yfVarD.c]) && yfVarD != yfVar && (((i = yfVarD.n) == 3 || i == 4) && fB < f)) {
                    f = fB;
                    yfVar2 = yfVarD;
                }
            }
        }
        return yfVar2;
    }

    final void b(yf yfVar) {
        yf yfVar2 = this.a;
        if (yfVar2 != null) {
            this.e.g(yfVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(yfVar, true);
        this.a = yfVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        xx xxVar = this.e;
        int i = xxVar.f;
        for (int i2 = 0; i != -1 && i2 < xxVar.a; i2++) {
            float[] fArr = xxVar.e;
            fArr[i] = fArr[i] / f;
            i = xxVar.d[i];
        }
    }

    public final void c(ya yaVar, yf yfVar, boolean z) {
        if (yfVar == null || !yfVar.g) {
            return;
        }
        this.b += yfVar.f * this.e.a(yfVar);
        this.e.c(yfVar, z);
        if (z) {
            yfVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            yaVar.c = true;
        }
    }

    public void d(ya yaVar, xy xyVar, boolean z) {
        xx xxVar = this.e;
        float fA = xxVar.a(xyVar.a);
        xxVar.c(xyVar.a, z);
        xx xxVar2 = xyVar.e;
        int i = xxVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            yf yfVarD = xxVar2.d(i2);
            xxVar.e(yfVarD, xxVar2.a(yfVarD) * fA, z);
        }
        this.b += xyVar.b * fA;
        if (z) {
            xyVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        yaVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(ya yaVar, int i) {
        this.e.g(yaVar.p(i), 1.0f);
        this.e.g(yaVar.p(i), -1.0f);
    }

    public final void g(yf yfVar, yf yfVar2, yf yfVar3, yf yfVar4, float f) {
        this.e.g(yfVar, -1.0f);
        this.e.g(yfVar2, 1.0f);
        this.e.g(yfVar3, f);
        this.e.g(yfVar4, -f);
    }

    public final void h(yf yfVar, yf yfVar2, yf yfVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(yfVar, 1.0f);
                this.e.g(yfVar2, -1.0f);
                this.e.g(yfVar3, -1.0f);
                return;
            }
        }
        this.e.g(yfVar, -1.0f);
        this.e.g(yfVar2, 1.0f);
        this.e.g(yfVar3, 1.0f);
    }

    public final void i(yf yfVar, yf yfVar2, yf yfVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(yfVar, 1.0f);
                this.e.g(yfVar2, -1.0f);
                this.e.g(yfVar3, 1.0f);
                return;
            }
        }
        this.e.g(yfVar, -1.0f);
        this.e.g(yfVar2, 1.0f);
        this.e.g(yfVar3, -1.0f);
    }

    public final void j(yf yfVar, yf yfVar2, yf yfVar3, yf yfVar4, float f) {
        this.e.g(yfVar3, 0.5f);
        this.e.g(yfVar4, 0.5f);
        this.e.g(yfVar, -0.5f);
        this.e.g(yfVar2, -0.5f);
        this.b = -f;
    }

    public yf k(boolean[] zArr) {
        return a(zArr, null);
    }

    public String toString() {
        String string;
        boolean z;
        yf yfVar = this.a;
        if (yfVar == null) {
            string = "0";
        } else {
            String strValueOf = String.valueOf(yfVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length());
            sb.append("");
            sb.append(strValueOf);
            string = sb.toString();
        }
        String strConcat = String.valueOf(string).concat(" = ");
        if (this.b != 0.0f) {
            String strValueOf2 = String.valueOf(strConcat);
            float f = this.b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 15);
            sb2.append(strValueOf2);
            sb2.append(f);
            strConcat = sb2.toString();
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            yf yfVarD = this.e.d(i2);
            if (yfVarD != null) {
                float fB = this.e.b(i2);
                if (fB != 0.0f) {
                    String string2 = yfVarD.toString();
                    if (z) {
                        if (fB > 0.0f) {
                            strConcat = String.valueOf(strConcat).concat(" + ");
                        } else {
                            strConcat = String.valueOf(strConcat).concat(" - ");
                            fB = -fB;
                        }
                    } else if (fB < 0.0f) {
                        strConcat = String.valueOf(strConcat).concat("- ");
                        fB = -fB;
                    }
                    if (fB == 1.0f) {
                        String strValueOf3 = String.valueOf(strConcat);
                        String strValueOf4 = String.valueOf(string2);
                        strConcat = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                    } else {
                        String strValueOf5 = String.valueOf(strConcat);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf5).length() + 16 + String.valueOf(string2).length());
                        sb3.append(strValueOf5);
                        sb3.append(fB);
                        sb3.append(" ");
                        sb3.append(string2);
                        strConcat = sb3.toString();
                    }
                    z = true;
                }
            }
        }
        return !z ? String.valueOf(strConcat).concat("0.0") : strConcat;
    }
}
