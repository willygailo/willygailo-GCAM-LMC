package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class xx {
    protected final xz b;
    private final xy g;
    int a = 0;
    private int h = 8;
    public int[] c = new int[8];
    public int[] d = new int[8];
    public float[] e = new float[8];
    public int f = -1;
    private int i = -1;
    private boolean j = false;

    public xx(xy xyVar, xz xzVar) {
        this.g = xyVar;
        this.b = xzVar;
    }

    public final float a(yf yfVar) {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.c[i] == yfVar.c) {
                return this.e[i];
            }
            i = this.d[i];
        }
        return 0.0f;
    }

    public final float b(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.e[i2];
            }
            i2 = this.d[i2];
        }
        return 0.0f;
    }

    public final float c(yf yfVar, boolean z) {
        int i = this.f;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                if (this.c[i] == yfVar.c) {
                    if (i == this.f) {
                        this.f = this.d[i];
                    } else {
                        int[] iArr = this.d;
                        iArr[i3] = iArr[i];
                    }
                    if (z) {
                        yfVar.b(this.g);
                    }
                    yfVar.l--;
                    this.a--;
                    this.c[i] = -1;
                    if (this.j) {
                        this.i = i;
                    }
                    return this.e[i];
                }
                i2++;
                i3 = i;
                i = this.d[i];
            }
        }
        return 0.0f;
    }

    public final yf d(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.b.a[this.c[i2]];
            }
            i2 = this.d[i2];
        }
        return null;
    }

    public final void e(yf yfVar, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f;
            if (i == -1) {
                this.f = 0;
                this.e[0] = f;
                this.c[0] = yfVar.c;
                this.d[0] = -1;
                yfVar.l++;
                yfVar.a(this.g);
                this.a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int length = this.c.length;
                if (i2 >= length) {
                    this.j = true;
                    this.i = length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.c[i];
                int i6 = yfVar.c;
                if (i5 == i6) {
                    float[] fArr = this.e;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f) {
                            this.f = this.d[i];
                        } else {
                            int[] iArr = this.d;
                            iArr[i3] = iArr[i];
                        }
                        if (z) {
                            yfVar.b(this.g);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        yfVar.l--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.d[i];
            }
            int length2 = this.i;
            int i7 = length2 + 1;
            if (this.j) {
                int[] iArr2 = this.c;
                if (iArr2[length2] != -1) {
                    length2 = iArr2.length;
                }
            } else {
                length2 = i7;
            }
            int length3 = this.c.length;
            if (length2 >= length3 && this.a < length3) {
                int i8 = 0;
                while (true) {
                    int[] iArr3 = this.c;
                    if (i8 >= iArr3.length) {
                        break;
                    }
                    if (iArr3[i8] == -1) {
                        length2 = i8;
                        break;
                    }
                    i8++;
                }
            }
            int length4 = this.c.length;
            if (length2 >= length4) {
                int i9 = this.h;
                int i10 = i9 + i9;
                this.h = i10;
                this.j = false;
                this.i = length4 - 1;
                this.e = Arrays.copyOf(this.e, i10);
                this.c = Arrays.copyOf(this.c, this.h);
                this.d = Arrays.copyOf(this.d, this.h);
                length2 = length4;
            }
            this.c[length2] = yfVar.c;
            this.e[length2] = f;
            if (i3 != -1) {
                int[] iArr4 = this.d;
                iArr4[length2] = iArr4[i3];
                iArr4[i3] = length2;
            } else {
                this.d[length2] = this.f;
                this.f = length2;
            }
            yfVar.l++;
            yfVar.a(this.g);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i11 = this.i;
            int length5 = this.c.length;
            if (i11 >= length5) {
                this.j = true;
                this.i = length5 - 1;
            }
        }
    }

    public final void f() {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            yf yfVar = this.b.a[this.c[i]];
            if (yfVar != null) {
                yfVar.b(this.g);
            }
            i = this.d[i];
        }
        this.f = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final void g(yf yfVar, float f) {
        if (f == 0.0f) {
            c(yfVar, true);
            return;
        }
        int i = this.f;
        if (i == -1) {
            this.f = 0;
            this.e[0] = f;
            this.c[0] = yfVar.c;
            this.d[0] = -1;
            yfVar.l++;
            yfVar.a(this.g);
            this.a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int length = this.c.length;
            if (i2 >= length) {
                this.j = true;
                this.i = length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.c[i];
            int i6 = yfVar.c;
            if (i5 == i6) {
                this.e[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.d[i];
        }
        int length2 = this.i;
        int i7 = length2 + 1;
        if (this.j) {
            int[] iArr = this.c;
            if (iArr[length2] != -1) {
                length2 = iArr.length;
            }
        } else {
            length2 = i7;
        }
        int length3 = this.c.length;
        if (length2 >= length3 && this.a < length3) {
            int i8 = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i8 >= iArr2.length) {
                    break;
                }
                if (iArr2[i8] == -1) {
                    length2 = i8;
                    break;
                }
                i8++;
            }
        }
        int length4 = this.c.length;
        if (length2 >= length4) {
            int i9 = this.h;
            int i10 = i9 + i9;
            this.h = i10;
            this.j = false;
            this.i = length4 - 1;
            this.e = Arrays.copyOf(this.e, i10);
            this.c = Arrays.copyOf(this.c, this.h);
            this.d = Arrays.copyOf(this.d, this.h);
            length2 = length4;
        }
        this.c[length2] = yfVar.c;
        this.e[length2] = f;
        if (i3 != -1) {
            int[] iArr3 = this.d;
            iArr3[length2] = iArr3[i3];
            iArr3[i3] = length2;
        } else {
            this.d[length2] = this.f;
            this.f = length2;
        }
        yfVar.l++;
        yfVar.a(this.g);
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.j) {
            this.i++;
        }
        int length5 = this.c.length;
        if (i11 >= length5) {
            this.j = true;
        }
        if (this.i >= length5) {
            this.j = true;
            this.i = length5 - 1;
        }
    }

    public final String toString() {
        int i = this.f;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            String strValueOf = String.valueOf(String.valueOf(string).concat(" -> "));
            float f = this.e[i];
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
            sb.append(strValueOf);
            sb.append(f);
            sb.append(" : ");
            String strValueOf2 = String.valueOf(sb.toString());
            String strValueOf3 = String.valueOf(this.b.a[this.c[i]]);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
            sb2.append(strValueOf2);
            sb2.append(strValueOf3);
            string = sb2.toString();
            i = this.d[i];
        }
        return string;
    }
}
