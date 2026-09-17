package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class an {
    private static int h = 1000;
    public ak[] c;
    public final al g;
    int a = 0;
    public final am b = new am();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private ap[] l = new ap[h];
    private int m = 0;
    private ak[] n = new ak[32];

    public an() {
        this.c = null;
        this.c = new ak[32];
        r();
        this.g = new al();
    }

    public static ak b(an anVar, ap apVar, ap apVar2, int i, float f, ap apVar3, ap apVar4, int i2, boolean z) {
        ak akVarA = anVar.a();
        akVarA.d(apVar, apVar2, i, f, apVar3, apVar4, i2);
        if (z) {
            ap apVarD = anVar.d();
            ap apVarD2 = anVar.d();
            apVarD.c = 4;
            apVarD2.c = 4;
            akVarA.c(apVarD, apVarD2);
        }
        return akVarA;
    }

    public static ak c(an anVar, ap apVar, ap apVar2, int i, boolean z) {
        ak akVarA = anVar.a();
        akVarA.h(apVar, apVar2, i);
        if (z) {
            anVar.k(akVarA, 1);
        }
        return akVarA;
    }

    public static final int p(Object obj) {
        ap apVar = ((aq) obj).f;
        if (apVar != null) {
            return (int) (apVar.d + 0.5f);
        }
        return 0;
    }

    private final void q() {
        int i = this.i;
        int i2 = i + i;
        this.i = i2;
        this.c = (ak[]) Arrays.copyOf(this.c, i2);
        al alVar = this.g;
        alVar.a = (ap[]) Arrays.copyOf(alVar.a, this.i);
        int i3 = this.i;
        this.d = new boolean[i3];
        this.j = i3;
        this.k = i3;
        this.b.a.clear();
    }

    private final void r() {
        int i = 0;
        while (true) {
            ak[] akVarArr = this.c;
            if (i >= akVarArr.length) {
                return;
            }
            ak akVar = akVarArr[i];
            if (akVar != null) {
                this.g.b.b(akVar);
            }
            this.c[i] = null;
            i++;
        }
    }

    private final ap s(int i) {
        ap apVar = (ap) this.g.c.a();
        if (apVar == null) {
            apVar = new ap(i);
        } else {
            apVar.b();
            apVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            h = i4;
            this.l = (ap[]) Arrays.copyOf(this.l, i4);
        }
        ap[] apVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        apVarArr[i5] = apVar;
        return apVar;
    }

    public final ak a() {
        ak akVar = (ak) this.g.b.a();
        if (akVar == null) {
            return new ak(this.g);
        }
        akVar.a = null;
        aj ajVar = akVar.d;
        ajVar.f = -1;
        ajVar.g = -1;
        ajVar.h = false;
        ajVar.a = 0;
        akVar.b = 0.0f;
        akVar.e = false;
        return akVar;
    }

    public final ap d() {
        if (this.e + 1 >= this.j) {
            q();
        }
        ap apVarS = s(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        apVarS.a = i;
        this.g.a[i] = apVarS;
        return apVarS;
    }

    public final ap e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            q();
        }
        aq aqVar = (aq) obj;
        ap apVar = aqVar.f;
        if (apVar == null) {
            aqVar.e();
            apVar = aqVar.f;
        }
        int i = apVar.a;
        if (i == -1) {
            int i2 = this.a + 1;
            this.a = i2;
            this.e++;
            apVar.a = i2;
            apVar.h = 1;
            this.g.a[i2] = apVar;
        } else if (i > this.a || this.g.a[i] == null) {
            if (i != -1) {
                apVar.b();
            }
            int i3 = this.a + 1;
            this.a = i3;
            this.e++;
            apVar.a = i3;
            apVar.h = 1;
            this.g.a[i3] = apVar;
        }
        return apVar;
    }

    public final ap f() {
        if (this.e + 1 >= this.j) {
            q();
        }
        ap apVarS = s(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        apVarS.a = i;
        this.g.a[i] = apVarS;
        return apVarS;
    }

    public final void g(ak akVar) {
        ak[] akVarArr;
        if (this.f + 1 >= this.k || this.e + 1 >= this.j) {
            q();
        }
        if (!akVar.e) {
            if (this.f > 0) {
                aj ajVar = akVar.d;
                ak[] akVarArr2 = this.c;
                int i = ajVar.f;
                int i2 = 0;
                while (i != -1 && i2 < ajVar.a) {
                    ap apVar = ajVar.b.a[ajVar.c[i]];
                    if (apVar.b != -1) {
                        float f = ajVar.e[i];
                        ajVar.c(apVar);
                        ak akVar2 = akVarArr2[apVar.b];
                        if (!akVar2.e) {
                            aj ajVar2 = akVar2.d;
                            int i3 = ajVar2.f;
                            for (int i4 = 0; i3 != -1 && i4 < ajVar2.a; i4++) {
                                ajVar.e(ajVar.b.a[ajVar2.c[i3]], ajVar2.e[i3] * f);
                                i3 = ajVar2.d[i3];
                            }
                        }
                        akVar.b += akVar2.b * f;
                        akVar2.a.a(akVar);
                        i = ajVar.f;
                        i2 = 0;
                    } else {
                        i = ajVar.d[i];
                        i2++;
                    }
                }
                if (akVar.d.a == 0) {
                    akVar.e = true;
                }
            }
            float f2 = akVar.b;
            if (f2 < 0.0f) {
                akVar.b = -f2;
                aj ajVar3 = akVar.d;
                int i5 = ajVar3.f;
                for (int i6 = 0; i5 != -1 && i6 < ajVar3.a; i6++) {
                    float[] fArr = ajVar3.e;
                    fArr[i5] = -fArr[i5];
                    i5 = ajVar3.d[i5];
                }
            }
            aj ajVar4 = akVar.d;
            int i7 = ajVar4.f;
            ap apVar2 = null;
            ap apVar3 = null;
            int i8 = 0;
            while (true) {
                if (i7 == -1 || i8 >= ajVar4.a) {
                    if (apVar2 != null) {
                        break;
                    }
                    apVar2 = apVar3;
                    break;
                }
                float[] fArr2 = ajVar4.e;
                float f3 = fArr2[i7];
                if (f3 < 0.0f) {
                    if (f3 > -0.001f) {
                        fArr2[i7] = 0.0f;
                        f3 = 0.0f;
                    }
                } else if (f3 < 0.001f) {
                    fArr2[i7] = 0.0f;
                    f3 = 0.0f;
                }
                if (f3 != 0.0f) {
                    ap apVar4 = ajVar4.b.a[ajVar4.c[i7]];
                    if (apVar4.h == 1) {
                        if (f3 < 0.0f) {
                            apVar2 = apVar4;
                            break;
                        } else if (apVar2 == null) {
                            apVar2 = apVar4;
                        }
                    } else if (f3 < 0.0f && (apVar3 == null || apVar4.c < apVar3.c)) {
                        apVar3 = apVar4;
                    }
                }
                i7 = ajVar4.d[i7];
                i8++;
            }
            if (apVar2 != null) {
                akVar.a(apVar2);
            }
            if (akVar.d.a == 0) {
                akVar.e = true;
            }
            ap apVar5 = akVar.a;
            if (apVar5 == null) {
                return;
            }
            if (apVar5.h != 1 && akVar.b < 0.0f) {
                return;
            }
        }
        ak akVar3 = this.c[this.f];
        if (akVar3 != null) {
            this.g.b.b(akVar3);
        }
        if (!akVar.e) {
            akVar.b();
        }
        ak[] akVarArr3 = this.c;
        int i9 = this.f;
        akVarArr3[i9] = akVar;
        ap apVar6 = akVar.a;
        apVar6.b = i9;
        this.f = i9 + 1;
        int i10 = apVar6.g;
        if (i10 > 0) {
            while (true) {
                akVarArr = this.n;
                int length = akVarArr.length;
                if (length >= i10) {
                    break;
                } else {
                    this.n = new ak[length + length];
                }
            }
            for (int i11 = 0; i11 < i10; i11++) {
                akVarArr[i11] = akVar.a.f[i11];
            }
            for (int i12 = 0; i12 < i10; i12++) {
                ak akVar4 = akVarArr[i12];
                if (akVar4 != akVar) {
                    akVar4.d.g(akVar4, akVar);
                    akVar4.b();
                }
            }
        }
    }

    public final void h(ap apVar, int i) {
        int i2 = apVar.b;
        if (i2 != -1) {
            ak akVar = this.c[i2];
            if (akVar.e) {
                akVar.b = i;
                return;
            }
            ak akVarA = a();
            akVarA.g(apVar, i);
            g(akVarA);
            return;
        }
        ak akVarA2 = a();
        akVarA2.a = apVar;
        float f = i;
        apVar.d = f;
        akVarA2.b = f;
        akVarA2.e = true;
        g(akVarA2);
    }

    public final void i(ap apVar, ap apVar2, int i, int i2) {
        ak akVarA = a();
        ap apVarF = f();
        apVarF.c = i2;
        akVarA.i(apVar, apVar2, apVarF, i);
        g(akVarA);
    }

    public final void j(ap apVar, ap apVar2, int i, int i2) {
        ak akVarA = a();
        ap apVarF = f();
        apVarF.c = i2;
        akVarA.j(apVar, apVar2, apVarF, i);
        g(akVarA);
    }

    public final void k(ak akVar, int i) {
        akVar.d.f(d(), i);
    }

    public final void l() {
        al alVar;
        int i = 0;
        while (true) {
            alVar = this.g;
            ap[] apVarArr = alVar.a;
            if (i >= apVarArr.length) {
                break;
            }
            ap apVar = apVarArr[i];
            if (apVar != null) {
                apVar.b();
            }
            i++;
        }
        ao aoVar = alVar.c;
        ap[] apVarArr2 = this.l;
        int i2 = this.m;
        int length = apVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ap apVar2 = apVarArr2[i3];
            int i4 = aoVar.b;
            if (i4 < 256) {
                aoVar.a[i4] = apVar2;
                aoVar.b = i4 + 1;
            }
        }
        this.m = 0;
        Arrays.fill(this.g.a, (Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        r();
        this.f = 0;
    }

    public final void m(ap apVar, ap apVar2, int i, float f, ap apVar3, ap apVar4, int i2) {
        ak akVarA = a();
        akVarA.d(apVar, apVar2, i, f, apVar3, apVar4, i2);
        ap apVarD = d();
        ap apVarD2 = d();
        apVarD.c = 4;
        apVarD2.c = 4;
        akVarA.c(apVarD, apVarD2);
        g(akVarA);
    }

    public final void n(ap apVar, ap apVar2, int i, int i2) {
        ak akVarA = a();
        akVarA.h(apVar, apVar2, i);
        ap apVarD = d();
        ap apVarD2 = d();
        apVarD.c = i2;
        apVarD2.c = i2;
        akVarA.c(apVarD, apVarD2);
        g(akVarA);
    }

    public final void o(am amVar) {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f) {
                i = 0;
                break;
            }
            ak akVar = this.c[i2];
            if (akVar.a.h != 1 && akVar.b < 0.0f) {
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                float f = Float.MAX_VALUE;
                while (true) {
                    if (i3 >= this.f) {
                        if (i4 == -1) {
                            break;
                        }
                        ak akVar2 = this.c[i4];
                        akVar2.a.b = -1;
                        akVar2.a(this.g.a[i5]);
                        akVar2.a.b = i4;
                        for (int i7 = 0; i7 < this.f; i7++) {
                            this.c[i7].k(akVar2);
                        }
                        amVar.a(this);
                        i3 = 0;
                        i4 = -1;
                        i5 = -1;
                        i6 = 0;
                        f = Float.MAX_VALUE;
                    } else {
                        ak akVar3 = this.c[i3];
                        if (akVar3.a.h != 1 && akVar3.b < 0.0f) {
                            for (int i8 = 1; i8 < this.e; i8++) {
                                ap apVar = this.g.a[i8];
                                float fA = akVar3.d.a(apVar);
                                if (fA > 0.0f) {
                                    for (int i9 = 0; i9 < 6; i9++) {
                                        float f2 = apVar.e[i9] / fA;
                                        if ((f2 < f && i9 == i6) || i9 > i6) {
                                            f = f2;
                                            i4 = i3;
                                            i5 = i8;
                                            i6 = i9;
                                        }
                                    }
                                }
                            }
                        }
                        i3++;
                    }
                }
                i = 0;
                break;
            }
            i2++;
        }
        while (i < this.f) {
            ak akVar4 = this.c[i];
            if (akVar4.a.h != 1 && akVar4.b < 0.0f) {
                return;
            } else {
                i++;
            }
        }
    }
}
