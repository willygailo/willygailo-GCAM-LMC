package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ye extends xy {
    public int f;
    final yd g;
    private yf[] h;
    private yf[] i;

    public ye(xz xzVar) {
        super(xzVar);
        this.h = new yf[128];
        this.i = new yf[128];
        this.f = 0;
        this.g = new yd(this);
    }

    @Override // defpackage.xy
    public final void d(ya yaVar, xy xyVar, boolean z) {
        yf yfVar = xyVar.a;
        if (yfVar == null) {
            return;
        }
        xx xxVar = xyVar.e;
        int i = xxVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            yf yfVarD = xxVar.d(i2);
            float fB = xxVar.b(i2);
            yd ydVar = this.g;
            ydVar.a = yfVarD;
            if (ydVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = ydVar.a.i;
                    float f = fArr[i3] + (yfVar.i[i3] * fB);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ydVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ydVar.b.n(ydVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = yfVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fB;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ydVar.a.i[i4] = f3;
                    } else {
                        ydVar.a.i[i4] = 0.0f;
                    }
                }
                m(yfVarD);
            }
            this.b += xyVar.b * fB;
        }
        n(yfVar);
    }

    @Override // defpackage.xy
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.xy
    public final yf k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            yf[] yfVarArr = this.h;
            yf yfVar = yfVarArr[i2];
            if (!zArr[yfVar.c]) {
                yd ydVar = this.g;
                ydVar.a = yfVar;
                int i3 = 8;
                if (i != -1) {
                    yf yfVar2 = yfVarArr[i];
                    while (i3 >= 0) {
                        float f = yfVar2.i[i3];
                        float f2 = ydVar.a.i[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ydVar.a.i[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(yf yfVar) {
        int i;
        int i2 = this.f;
        yf[] yfVarArr = this.h;
        int length = yfVarArr.length;
        if (i2 + 1 > length) {
            yf[] yfVarArr2 = (yf[]) Arrays.copyOf(yfVarArr, length + length);
            this.h = yfVarArr2;
            int length2 = yfVarArr2.length;
            this.i = (yf[]) Arrays.copyOf(yfVarArr2, length2 + length2);
        }
        yf[] yfVarArr3 = this.h;
        int i3 = this.f;
        yfVarArr3[i3] = yfVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && yfVarArr3[i4 - 1].c > yfVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new yc(0));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        yfVar.b = true;
        yfVar.a(this);
    }

    public final void n(yf yfVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == yfVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i >= i2) {
                        this.f = i2;
                        yfVar.b = false;
                        return;
                    } else {
                        yf[] yfVarArr = this.h;
                        int i3 = i + 1;
                        yfVarArr[i] = yfVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.xy
    public final String toString() {
        float f = this.b;
        StringBuilder sb = new StringBuilder(29);
        sb.append(" goal -> (");
        sb.append(f);
        sb.append(") : ");
        String string = sb.toString();
        for (int i = 0; i < this.f; i++) {
            this.g.a = this.h[i];
            String strValueOf = String.valueOf(string);
            String strValueOf2 = String.valueOf(this.g);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length());
            sb2.append(strValueOf);
            sb2.append(strValueOf2);
            sb2.append(" ");
            string = sb2.toString();
        }
        return string;
    }
}
