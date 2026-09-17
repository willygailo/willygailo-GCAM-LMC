package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class aj {
    public final al b;
    private final ak i;
    public int a = 0;
    private int j = 8;
    public int[] c = new int[8];
    public int[] d = new int[8];
    public float[] e = new float[8];
    public int f = -1;
    public int g = -1;
    public boolean h = false;

    public aj(ak akVar, al alVar) {
        this.i = akVar;
        this.b = alVar;
    }

    public final float a(ap apVar) {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.c[i] == apVar.a) {
                return this.e[i];
            }
            i = this.d[i];
        }
        return 0.0f;
    }

    final float b(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.e[i2];
            }
            i2 = this.d[i2];
        }
        return 0.0f;
    }

    public final float c(ap apVar) {
        int i = this.f;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                int i4 = this.c[i];
                if (i4 == apVar.a) {
                    if (i == this.f) {
                        this.f = this.d[i];
                    } else {
                        int[] iArr = this.d;
                        iArr[i3] = iArr[i];
                    }
                    this.b.a[i4].a(this.i);
                    this.a--;
                    this.c[i] = -1;
                    if (this.h) {
                        this.g = i;
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

    final ap d(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.b.a[this.c[i2]];
            }
            i2 = this.d[i2];
        }
        return null;
    }

    public final void e(ap apVar, float f) {
        if (f == 0.0f) {
            return;
        }
        int i = this.f;
        if (i == -1) {
            this.f = 0;
            this.e[0] = f;
            this.c[0] = apVar.a;
            this.d[0] = -1;
            this.a++;
            if (this.h) {
                return;
            }
            this.g++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.c[i];
            int i5 = apVar.a;
            if (i4 == i5) {
                float[] fArr = this.e;
                float f2 = fArr[i] + f;
                fArr[i] = f2;
                if (f2 == 0.0f) {
                    if (i == this.f) {
                        this.f = this.d[i];
                    } else {
                        int[] iArr = this.d;
                        iArr[i2] = iArr[i];
                    }
                    this.b.a[i4].a(this.i);
                    if (this.h) {
                        this.g = i;
                    }
                    this.a--;
                    return;
                }
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.d[i];
        }
        int length = this.g;
        int i6 = length + 1;
        if (this.h) {
            int[] iArr2 = this.c;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i6;
        }
        int length2 = this.c.length;
        if (length >= length2 && this.a < length2) {
            int i7 = 0;
            while (true) {
                int[] iArr3 = this.c;
                if (i7 >= iArr3.length) {
                    break;
                }
                if (iArr3[i7] == -1) {
                    length = i7;
                    break;
                }
                i7++;
            }
        }
        int length3 = this.c.length;
        if (length >= length3) {
            int i8 = this.j;
            int i9 = i8 + i8;
            this.j = i9;
            this.h = false;
            this.g = length3 - 1;
            this.e = Arrays.copyOf(this.e, i9);
            this.c = Arrays.copyOf(this.c, this.j);
            this.d = Arrays.copyOf(this.d, this.j);
            length = length3;
        }
        int[] iArr4 = this.c;
        iArr4[length] = apVar.a;
        this.e[length] = f;
        if (i2 != -1) {
            int[] iArr5 = this.d;
            iArr5[length] = iArr5[i2];
            iArr5[i2] = length;
        } else {
            this.d[length] = this.f;
            this.f = length;
        }
        this.a++;
        if (!this.h) {
            this.g++;
        }
        int i10 = this.g;
        int length4 = iArr4.length;
        if (i10 >= length4) {
            this.h = true;
            this.g = length4 - 1;
        }
    }

    public final void f(ap apVar, float f) {
        if (f == 0.0f) {
            c(apVar);
            return;
        }
        int i = this.f;
        if (i == -1) {
            this.f = 0;
            this.e[0] = f;
            this.c[0] = apVar.a;
            this.d[0] = -1;
            this.a++;
            if (this.h) {
                return;
            }
            this.g++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.c[i];
            int i5 = apVar.a;
            if (i4 == i5) {
                this.e[i] = f;
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.d[i];
        }
        int length = this.g;
        int i6 = length + 1;
        if (this.h) {
            int[] iArr = this.c;
            if (iArr[length] != -1) {
                length = iArr.length;
            }
        } else {
            length = i6;
        }
        int length2 = this.c.length;
        if (length >= length2 && this.a < length2) {
            int i7 = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i7 >= iArr2.length) {
                    break;
                }
                if (iArr2[i7] == -1) {
                    length = i7;
                    break;
                }
                i7++;
            }
        }
        int length3 = this.c.length;
        if (length >= length3) {
            int i8 = this.j;
            int i9 = i8 + i8;
            this.j = i9;
            this.h = false;
            this.g = length3 - 1;
            this.e = Arrays.copyOf(this.e, i9);
            this.c = Arrays.copyOf(this.c, this.j);
            this.d = Arrays.copyOf(this.d, this.j);
            length = length3;
        }
        int[] iArr3 = this.c;
        iArr3[length] = apVar.a;
        this.e[length] = f;
        if (i2 != -1) {
            int[] iArr4 = this.d;
            iArr4[length] = iArr4[i2];
            iArr4[i2] = length;
        } else {
            this.d[length] = this.f;
            this.f = length;
        }
        int i10 = this.a + 1;
        this.a = i10;
        if (!this.h) {
            this.g++;
        }
        if (i10 >= iArr3.length) {
            this.h = true;
        }
    }

    final void g(ak akVar, ak akVar2) {
        int i = this.f;
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            int i3 = this.c[i];
            ap apVar = akVar2.a;
            if (i3 == apVar.a) {
                float f = this.e[i];
                c(apVar);
                aj ajVar = akVar2.d;
                int i4 = ajVar.f;
                for (int i5 = 0; i4 != -1 && i5 < ajVar.a; i5++) {
                    e(this.b.a[ajVar.c[i4]], ajVar.e[i4] * f);
                    i4 = ajVar.d[i4];
                }
                akVar.b += akVar2.b * f;
                akVar2.a.a(akVar);
                i = this.f;
                i2 = 0;
            } else {
                i = this.d[i];
                i2++;
            }
        }
    }

    public final String toString() {
        int i = this.f;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            str = ((str + " -> ") + this.e[i] + " : ") + this.b.a[this.c[i]];
            i = this.d[i];
        }
        return str;
    }
}
