package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class as extends aw {
    int ag;
    int ah;
    private av am;
    protected final an af = new an();
    private int an = 0;
    private int ao = 0;
    private ar[] ap = new ar[4];
    private ar[] aq = new ar[4];
    private ar[] ar = new ar[4];
    public int ai = 2;
    private final boolean[] as = new boolean[3];
    private final ar[] at = new ar[4];
    public boolean aj = false;
    public boolean ak = false;

    private final int G(an anVar, ar[] arVarArr, ar arVar, int i, boolean[] zArr) {
        int i2;
        char c;
        char c2;
        zArr[0] = true;
        zArr[1] = false;
        ar arVar2 = null;
        arVarArr[0] = null;
        arVarArr[2] = null;
        arVarArr[1] = null;
        arVarArr[3] = null;
        float f = 0.0f;
        int i3 = 5;
        if (i == 0) {
            aq aqVar = arVar.i.b;
            boolean z = aqVar == null || aqVar.a == this;
            arVar.ab = null;
            ar arVar3 = arVar.K != 8 ? arVar : null;
            ar arVar4 = arVar;
            ar arVar5 = null;
            ar arVar6 = arVar3;
            i2 = 0;
            while (arVar4.k.b != null) {
                arVar4.ab = arVar2;
                if (arVar4.K != 8) {
                    if (arVar3 == null) {
                        arVar3 = arVar4;
                    }
                    if (arVar6 != null && arVar6 != arVar4) {
                        arVar6.ab = arVar4;
                    }
                    arVar6 = arVar4;
                } else {
                    aq aqVar2 = arVar4.i;
                    anVar.n(aqVar2.f, aqVar2.b.f, 0, 5);
                    anVar.n(arVar4.k.f, arVar4.i.f, 0, 5);
                }
                if (arVar4.K != 8 && arVar4.ad == 3) {
                    if (arVar4.ae == 3) {
                        zArr[0] = false;
                    }
                    if (arVar4.u <= f) {
                        zArr[0] = false;
                        int i4 = i2 + 1;
                        ar[] arVarArr2 = this.ap;
                        int length = arVarArr2.length;
                        if (i4 >= length) {
                            this.ap = (ar[]) Arrays.copyOf(arVarArr2, length + length);
                        }
                        this.ap[i2] = arVar4;
                        i2 = i4;
                    }
                }
                ar arVar7 = arVar4.k.b.a;
                aq aqVar3 = arVar7.i.b;
                if (aqVar3 == null || aqVar3.a != arVar4 || arVar7 == arVar4) {
                    break;
                }
                arVar5 = arVar7;
                arVar4 = arVar5;
                arVar2 = null;
                f = 0.0f;
            }
            aq aqVar4 = arVar4.k.b;
            if (aqVar4 != null && aqVar4.a != this) {
                z = false;
            }
            if (arVar.i.b == null || arVar5.k.b == null) {
                c2 = 1;
                zArr[1] = true;
            } else {
                c2 = 1;
            }
            arVar.X = z;
            arVar5.ab = null;
            arVarArr[0] = arVar;
            arVarArr[2] = arVar3;
            arVarArr[c2] = arVar5;
            arVarArr[3] = arVar6;
        } else {
            aq aqVar5 = arVar.j.b;
            boolean z2 = aqVar5 == null || aqVar5.a == this;
            arVar.ac = null;
            ar arVar8 = arVar;
            ar arVar9 = arVar.K != 8 ? arVar : null;
            ar arVar10 = arVar9;
            ar arVar11 = null;
            int i5 = 0;
            while (true) {
                if (arVar8.l.b == null) {
                    i2 = i5;
                    break;
                }
                arVar8.ac = null;
                if (arVar8.K != 8) {
                    if (arVar9 == null) {
                        arVar9 = arVar8;
                    }
                    if (arVar10 != null && arVar10 != arVar8) {
                        arVar10.ac = arVar8;
                    }
                    arVar10 = arVar8;
                } else {
                    aq aqVar6 = arVar8.j;
                    anVar.n(aqVar6.f, aqVar6.b.f, 0, i3);
                    anVar.n(arVar8.l.f, arVar8.j.f, 0, i3);
                }
                if (arVar8.K != 8 && arVar8.ae == 3) {
                    if (arVar8.ad == 3) {
                        zArr[0] = false;
                    }
                    if (arVar8.u <= 0.0f) {
                        zArr[0] = false;
                        int i6 = i5 + 1;
                        ar[] arVarArr3 = this.ap;
                        int length2 = arVarArr3.length;
                        if (i6 >= length2) {
                            this.ap = (ar[]) Arrays.copyOf(arVarArr3, length2 + length2);
                        }
                        this.ap[i5] = arVar8;
                        i5 = i6;
                    }
                }
                ar arVar12 = arVar8.l.b.a;
                aq aqVar7 = arVar12.j.b;
                if (aqVar7 == null || aqVar7.a != arVar8 || arVar12 == arVar8) {
                    i2 = i5;
                    break;
                }
                arVar11 = arVar12;
                arVar8 = arVar11;
                i3 = 5;
            }
            aq aqVar8 = arVar8.l.b;
            if (aqVar8 != null && aqVar8.a != this) {
                z2 = false;
            }
            if (arVar.j.b == null || arVar11.l.b == null) {
                c = 1;
                zArr[1] = true;
            } else {
                c = 1;
            }
            arVar.Y = z2;
            arVar11.ac = null;
            arVarArr[0] = arVar;
            arVarArr[2] = arVar9;
            arVarArr[c] = arVar11;
            arVarArr[3] = arVar10;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:259:0x051d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0528  */
    /* JADX WARN: Code duplicated, block: B:292:0x052a A[SYNTHETIC] */
    private final void H(an anVar) {
        int iG;
        float f;
        int i;
        aq aqVar;
        float fH;
        aq aqVar2;
        ar arVar;
        ar arVar2;
        ar arVar3;
        int i2;
        int i3;
        aq aqVar3;
        aq aqVar4;
        aq aqVar5;
        aq aqVar6;
        ar arVar4;
        aq aqVar7;
        aq aqVar8;
        int iA;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.an) {
            ar arVar5 = this.ar[i5];
            int iG2 = G(anVar, this.at, arVar5, 0, this.as);
            ar arVar6 = this.at[2];
            if (arVar6 == null) {
                i = i5;
            } else {
                boolean[] zArr = this.as;
                if (zArr[1]) {
                    int iB = arVar5.b();
                    while (arVar6 != null) {
                        anVar.h(arVar6.i.f, iB);
                        ar arVar7 = arVar6.ab;
                        iB += arVar6.i.a() + arVar6.h() + arVar6.k.a();
                        arVar6 = arVar7;
                    }
                    i = i5;
                } else {
                    int i6 = arVar5.V;
                    int i7 = this.ad;
                    int i8 = this.ai;
                    int i9 = 8;
                    float f2 = 0.0f;
                    char c = 3;
                    if ((i8 == 2 || i8 == 8) && zArr[i4] && arVar5.X && i6 != 2 && i7 != 2 && i6 == 0) {
                        ar arVar8 = arVar5;
                        ar arVar9 = null;
                        int i10 = 0;
                        float f3 = 0.0f;
                        int iA2 = 0;
                        while (arVar8 != null) {
                            if (arVar8.K != 8) {
                                i10++;
                                if (arVar8.ad != 3) {
                                    int iH = iA2 + arVar8.h();
                                    aq aqVar9 = arVar8.i;
                                    int iA3 = iH + (aqVar9.b != null ? aqVar9.a() : 0);
                                    aq aqVar10 = arVar8.k;
                                    iA2 = iA3 + (aqVar10.b != null ? aqVar10.a() : 0);
                                } else {
                                    f3 += arVar8.Z;
                                }
                            }
                            aq aqVar11 = arVar8.k.b;
                            ar arVar10 = aqVar11 != null ? aqVar11.a : null;
                            if (arVar10 != null && ((aqVar2 = arVar10.i.b) == null || aqVar2.a != arVar8)) {
                                arVar10 = null;
                            }
                            ar arVar11 = arVar10;
                            arVar9 = arVar8;
                            arVar8 = arVar11;
                        }
                        if (arVar9 != null) {
                            aq aqVar12 = arVar9.k.b;
                            iG = aqVar12 != null ? aqVar12.a.w : 0;
                            if (aqVar12 != null && aqVar12.a == this) {
                                iG = g();
                            }
                        } else {
                            iG = 0;
                        }
                        float f4 = iG - iA2;
                        float f5 = f4 / (i10 + 1);
                        if (iG2 == 0) {
                            f = f5;
                        } else {
                            f = f4 / iG2;
                            f5 = 0.0f;
                        }
                        while (arVar5 != null) {
                            aq aqVar13 = arVar5.i;
                            int iA4 = aqVar13.b != null ? aqVar13.a() : 0;
                            aq aqVar14 = arVar5.k;
                            int iA5 = aqVar14.b != null ? aqVar14.a() : 0;
                            if (arVar5.K != i9) {
                                float f6 = iA4;
                                float f7 = f5 + f6;
                                anVar.h(arVar5.i.f, (int) (f7 + 0.5f));
                                if (arVar5.ad == 3) {
                                    fH = f3 == 0.0f ? f7 + ((f - f6) - iA5) : f7 + ((((arVar5.Z * f4) / f3) - f6) - iA5);
                                } else {
                                    fH = f7 + arVar5.h();
                                }
                                anVar.h(arVar5.k.f, (int) (fH + 0.5f));
                                if (iG2 == 0) {
                                    fH += f;
                                }
                                f5 = fH + iA5;
                            } else {
                                int i11 = (int) ((f5 - (f / 2.0f)) + 0.5f);
                                anVar.h(arVar5.i.f, i11);
                                anVar.h(arVar5.k.f, i11);
                            }
                            aq aqVar15 = arVar5.k.b;
                            ar arVar12 = aqVar15 != null ? aqVar15.a : null;
                            arVar5 = (arVar12 == null || (aqVar = arVar12.i.b) == null || aqVar.a == arVar5) ? arVar12 : null;
                            if (arVar5 == this) {
                                arVar5 = null;
                            }
                            i9 = 8;
                        }
                        i = i5;
                    } else {
                        if (iG2 == 0) {
                            arVar = null;
                            arVar2 = null;
                            i4 = 0;
                        } else if (i6 == 2) {
                            arVar = null;
                            arVar2 = null;
                        } else {
                            ar arVar13 = null;
                            while (arVar6 != null) {
                                if (arVar6.ad != 3) {
                                    int iA6 = arVar6.i.a();
                                    if (arVar13 != null) {
                                        iA6 += arVar13.k.a();
                                    }
                                    aq aqVar16 = arVar6.i;
                                    aq aqVar17 = aqVar16.b;
                                    anVar.i(aqVar16.f, aqVar17.f, iA6, aqVar17.a.ad == 3 ? 2 : 3);
                                    int iA7 = arVar6.k.a();
                                    aq aqVar18 = arVar6.k.b.a.i;
                                    aq aqVar19 = aqVar18.b;
                                    if (aqVar19 != null && aqVar19.a == arVar6) {
                                        iA7 += aqVar18.a();
                                    }
                                    aq aqVar20 = arVar6.k;
                                    aq aqVar21 = aqVar20.b;
                                    anVar.j(aqVar20.f, aqVar21.f, -iA7, aqVar21.a.ad == 3 ? 2 : 3);
                                } else {
                                    f2 += arVar6.Z;
                                    aq aqVar22 = arVar6.k;
                                    if (aqVar22.b != null) {
                                        iA = aqVar22.a();
                                        if (arVar6 != this.at[3]) {
                                            iA += arVar6.k.b.a.i.a();
                                        }
                                    } else {
                                        iA = 0;
                                    }
                                    anVar.i(arVar6.k.f, arVar6.i.f, i4, 1);
                                    aq aqVar23 = arVar6.k;
                                    anVar.j(aqVar23.f, aqVar23.b.f, -iA, 1);
                                }
                                arVar13 = arVar6;
                                arVar6 = arVar6.ab;
                            }
                            if (iG2 != 1) {
                                int i12 = 0;
                                while (true) {
                                    int i13 = iG2 - 1;
                                    if (i12 >= i13) {
                                        break;
                                    }
                                    ar[] arVarArr = this.ap;
                                    ar arVar14 = arVarArr[i12];
                                    i12++;
                                    ar arVar15 = arVarArr[i12];
                                    aq aqVar24 = arVar14.i;
                                    ap apVar = aqVar24.f;
                                    ap apVar2 = arVar14.k.f;
                                    ap apVar3 = arVar15.i.f;
                                    ap apVar4 = arVar15.k.f;
                                    int i14 = iG2;
                                    ar[] arVarArr2 = this.at;
                                    ap apVar5 = arVar15 == arVarArr2[c] ? arVarArr2[1].k.f : apVar4;
                                    int iA8 = aqVar24.a();
                                    aq aqVar25 = arVar14.i.b;
                                    if (aqVar25 != null && (aqVar8 = (aqVar7 = aqVar25.a.k).b) != null && aqVar8.a == arVar14) {
                                        iA8 += aqVar7.a();
                                    }
                                    anVar.i(apVar, arVar14.i.b.f, iA8, 2);
                                    int iA9 = arVar14.k.a();
                                    if (arVar14.k.b != null && (arVar4 = arVar14.ab) != null) {
                                        aq aqVar26 = arVar4.i;
                                        iA9 += aqVar26.b != null ? aqVar26.a() : 0;
                                    }
                                    anVar.j(apVar2, arVar14.k.b.f, -iA9, 2);
                                    if (i12 == i13) {
                                        int iA10 = arVar15.i.a();
                                        aq aqVar27 = arVar15.i.b;
                                        if (aqVar27 != null && (aqVar6 = (aqVar5 = aqVar27.a.k).b) != null && aqVar6.a == arVar15) {
                                            iA10 += aqVar5.a();
                                        }
                                        anVar.i(apVar3, arVar15.i.b.f, iA10, 2);
                                        aq aqVar28 = arVar15.k;
                                        ar[] arVarArr3 = this.at;
                                        if (arVar15 == arVarArr3[3]) {
                                            aqVar28 = arVarArr3[1].k;
                                        }
                                        int iA11 = aqVar28.a();
                                        aq aqVar29 = aqVar28.b;
                                        if (aqVar29 != null && (aqVar4 = (aqVar3 = aqVar29.a.i).b) != null && aqVar4.a == arVar15) {
                                            iA11 += aqVar3.a();
                                        }
                                        i3 = 2;
                                        anVar.j(apVar5, aqVar28.b.f, -iA11, 2);
                                    } else {
                                        i3 = 2;
                                    }
                                    int i15 = arVar5.f;
                                    if (i15 > 0) {
                                        anVar.j(apVar2, apVar, i15, i3);
                                    }
                                    ak akVarA = anVar.a();
                                    akVarA.f(arVar14.Z, f2, arVar15.Z, apVar, arVar14.i.a(), apVar2, arVar14.k.a(), apVar3, arVar15.i.a(), apVar5, arVar15.k.a());
                                    anVar.g(akVarA);
                                    iG2 = i14;
                                    c = 3;
                                }
                            } else {
                                ar arVar16 = this.ap[i4];
                                int iA12 = arVar16.i.a();
                                aq aqVar30 = arVar16.i.b;
                                if (aqVar30 != null) {
                                    iA12 += aqVar30.a();
                                }
                                int iA13 = arVar16.k.a();
                                aq aqVar31 = arVar16.k.b;
                                if (aqVar31 != null) {
                                    iA13 += aqVar31.a();
                                }
                                ap apVar6 = arVar5.k.b.f;
                                ar[] arVarArr4 = this.at;
                                if (arVar16 == arVarArr4[3]) {
                                    apVar6 = arVarArr4[1].k.b.f;
                                }
                                if (arVar16.c == 1) {
                                    aq aqVar32 = arVar5.i;
                                    anVar.i(aqVar32.f, aqVar32.b.f, iA12, 1);
                                    anVar.j(arVar5.k.f, apVar6, -iA13, 1);
                                    anVar.n(arVar5.k.f, arVar5.i.f, arVar5.h(), 2);
                                    i = i5;
                                } else {
                                    aq aqVar33 = arVar16.i;
                                    anVar.n(aqVar33.f, aqVar33.b.f, iA12, 1);
                                    anVar.n(arVar16.k.f, apVar6, -iA13, 1);
                                }
                            }
                            i = i5;
                        }
                        while (arVar6 != null) {
                            ar arVar17 = arVar6.ab;
                            if (arVar17 == null) {
                                arVar = this.at[1];
                                i4 = 1;
                            }
                            if (i6 == 2) {
                                aq aqVar34 = arVar6.i;
                                int iA14 = aqVar34.a();
                                if (arVar2 != null) {
                                    iA14 += arVar2.k.a();
                                }
                                anVar.i(aqVar34.f, aqVar34.b.f, iA14, arVar6 != arVar6 ? 3 : 1);
                                if (arVar6.ad == 3) {
                                    aq aqVar35 = arVar6.k;
                                    if (arVar6.c == 1) {
                                        anVar.n(aqVar35.f, aqVar34.f, Math.max(arVar6.e, arVar6.h()), 3);
                                    } else {
                                        anVar.i(aqVar34.f, aqVar34.b.f, aqVar34.c, 3);
                                        anVar.j(aqVar35.f, aqVar34.f, arVar6.e, 3);
                                    }
                                }
                            } else if (i6 == 0 || i4 == 0 || arVar2 == null) {
                                if (i6 != 0 && i4 == 0 && arVar2 == null) {
                                    aq aqVar36 = arVar6.i;
                                    if (aqVar36.b == null) {
                                        anVar.h(aqVar36.f, arVar6.b());
                                    } else {
                                        anVar.n(arVar6.i.f, arVar5.i.b.f, aqVar36.a(), 5);
                                    }
                                } else {
                                    aq aqVar37 = arVar6.i;
                                    aq aqVar38 = arVar6.k;
                                    int iA15 = aqVar37.a();
                                    int iA16 = aqVar38.a();
                                    arVar3 = arVar6;
                                    anVar.i(aqVar37.f, aqVar37.b.f, iA15, 1);
                                    int i16 = i5;
                                    anVar.j(aqVar38.f, aqVar38.b.f, -iA16, 1);
                                    aq aqVar39 = aqVar37.b;
                                    ap apVar7 = aqVar39 != null ? aqVar39.f : null;
                                    if (arVar2 == null) {
                                        aq aqVar40 = arVar5.i.b;
                                        apVar7 = aqVar40 != null ? aqVar40.f : null;
                                    }
                                    if (arVar17 == null) {
                                        aq aqVar41 = arVar.k.b;
                                        arVar17 = aqVar41 != null ? aqVar41.a : null;
                                    }
                                    if (arVar17 != null) {
                                        ap apVar8 = arVar17.i.f;
                                        if (i4 != 0) {
                                            aq aqVar42 = arVar.k.b;
                                            apVar8 = aqVar42 != null ? aqVar42.f : null;
                                        }
                                        if (apVar7 == null || apVar8 == null) {
                                            i2 = i16;
                                        } else {
                                            ap apVar9 = apVar8;
                                            i2 = i16;
                                            anVar.m(aqVar37.f, apVar7, iA15, 0.5f, apVar9, aqVar38.f, iA16);
                                        }
                                    } else {
                                        i2 = i16;
                                    }
                                }
                                if (1 == i4) {
                                    arVar17 = null;
                                }
                                this = this;
                                arVar5 = arVar5;
                                i4 = i4;
                                i5 = i2;
                                arVar6 = arVar17;
                                arVar2 = arVar3;
                                arVar = arVar;
                            } else {
                                aq aqVar43 = arVar6.k;
                                if (aqVar43.b == null) {
                                    anVar.h(aqVar43.f, arVar6.b() + arVar6.y);
                                } else {
                                    anVar.n(arVar6.k.f, arVar.k.b.f, -aqVar43.a(), 5);
                                }
                            }
                            arVar3 = arVar6;
                            i2 = i5;
                            if (1 == i4) {
                                arVar17 = null;
                            }
                            this = this;
                            arVar5 = arVar5;
                            i4 = i4;
                            i5 = i2;
                            arVar6 = arVar17;
                            arVar2 = arVar3;
                            arVar = arVar;
                        }
                        ar arVar18 = arVar5;
                        i = i5;
                        if (i6 == 2) {
                            aq aqVar44 = arVar6.i;
                            aq aqVar45 = arVar.k;
                            int iA17 = aqVar44.a();
                            int iA18 = aqVar45.a();
                            aq aqVar46 = arVar18.i.b;
                            ap apVar10 = aqVar46 != null ? aqVar46.f : null;
                            aq aqVar47 = arVar.k.b;
                            ap apVar11 = aqVar47 != null ? aqVar47.f : null;
                            if (apVar10 != null && apVar11 != null) {
                                anVar.j(aqVar45.f, apVar11, -iA18, 1);
                                anVar.m(aqVar44.f, apVar10, iA17, arVar18.H, apVar11, aqVar45.f, iA18);
                            }
                        }
                    }
                }
            }
            i5 = i + 1;
            i4 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:269:0x053c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0547  */
    /* JADX WARN: Code duplicated, block: B:302:0x0549 A[SYNTHETIC] */
    private final void I(an anVar) {
        int iA;
        float f;
        int i;
        aq aqVar;
        float fD;
        aq aqVar2;
        ar arVar;
        ar arVar2;
        ar arVar3;
        int i2;
        ap apVar;
        ap apVar2;
        int i3;
        aq aqVar3;
        aq aqVar4;
        aq aqVar5;
        aq aqVar6;
        ar arVar4;
        aq aqVar7;
        aq aqVar8;
        int iA2;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.ao) {
            ar arVar5 = this.aq[i5];
            int iG = G(anVar, this.at, arVar5, 1, this.as);
            ar arVar6 = this.at[2];
            if (arVar6 == null) {
                i = i5;
            } else {
                boolean[] zArr = this.as;
                if (zArr[1]) {
                    int iC = arVar5.c();
                    while (arVar6 != null) {
                        anVar.h(arVar6.j.f, iC);
                        ar arVar7 = arVar6.ac;
                        iC += arVar6.j.a() + arVar6.d() + arVar6.l.a();
                        arVar6 = arVar7;
                    }
                    i = i5;
                } else {
                    int i6 = arVar5.W;
                    int i7 = this.ae;
                    int i8 = this.ai;
                    int i9 = 8;
                    float f2 = 0.0f;
                    char c = 3;
                    if ((i8 == 2 || i8 == 8) && zArr[i4] && arVar5.Y && i6 != 2 && i7 != 2 && i6 == 0) {
                        ar arVar8 = arVar5;
                        ar arVar9 = null;
                        int i10 = 0;
                        float f3 = 0.0f;
                        int iA3 = 0;
                        while (arVar8 != null) {
                            if (arVar8.K != 8) {
                                i10++;
                                if (arVar8.ae != 3) {
                                    int iD = iA3 + arVar8.d();
                                    aq aqVar9 = arVar8.j;
                                    int iA4 = iD + (aqVar9.b != null ? aqVar9.a() : 0);
                                    aq aqVar10 = arVar8.l;
                                    iA3 = iA4 + (aqVar10.b != null ? aqVar10.a() : 0);
                                } else {
                                    f3 += arVar8.aa;
                                }
                            }
                            aq aqVar11 = arVar8.l.b;
                            ar arVar10 = aqVar11 != null ? aqVar11.a : null;
                            if (arVar10 != null && ((aqVar2 = arVar10.j.b) == null || aqVar2.a != arVar8)) {
                                arVar10 = null;
                            }
                            ar arVar11 = arVar10;
                            arVar9 = arVar8;
                            arVar8 = arVar11;
                        }
                        if (arVar9 != null) {
                            aq aqVar12 = arVar9.l.b;
                            iA = aqVar12 != null ? aqVar12.a.w : 0;
                            if (aqVar12 != null && aqVar12.a == this) {
                                iA = a();
                            }
                        } else {
                            iA = 0;
                        }
                        float f4 = iA - iA3;
                        float f5 = f4 / (i10 + 1);
                        if (iG == 0) {
                            f = f5;
                        } else {
                            f = f4 / iG;
                            f5 = 0.0f;
                        }
                        while (arVar5 != null) {
                            aq aqVar13 = arVar5.j;
                            int iA5 = aqVar13.b != null ? aqVar13.a() : 0;
                            aq aqVar14 = arVar5.l;
                            int iA6 = aqVar14.b != null ? aqVar14.a() : 0;
                            if (arVar5.K != i9) {
                                float f6 = iA5;
                                float f7 = f5 + f6;
                                anVar.h(arVar5.j.f, (int) (f7 + 0.5f));
                                if (arVar5.ae == 3) {
                                    fD = f3 == 0.0f ? f7 + ((f - f6) - iA6) : f7 + ((((arVar5.aa * f4) / f3) - f6) - iA6);
                                } else {
                                    fD = f7 + arVar5.d();
                                }
                                anVar.h(arVar5.l.f, (int) (fD + 0.5f));
                                if (iG == 0) {
                                    fD += f;
                                }
                                f5 = fD + iA6;
                            } else {
                                int i11 = (int) ((f5 - (f / 2.0f)) + 0.5f);
                                anVar.h(arVar5.j.f, i11);
                                anVar.h(arVar5.l.f, i11);
                            }
                            aq aqVar15 = arVar5.l.b;
                            ar arVar12 = aqVar15 != null ? aqVar15.a : null;
                            arVar5 = (arVar12 == null || (aqVar = arVar12.j.b) == null || aqVar.a == arVar5) ? arVar12 : null;
                            if (arVar5 == this) {
                                arVar5 = null;
                            }
                            i9 = 8;
                        }
                        i = i5;
                    } else {
                        if (iG == 0) {
                            arVar = null;
                            arVar2 = null;
                            i4 = 0;
                        } else if (i6 == 2) {
                            arVar = null;
                            arVar2 = null;
                        } else {
                            ar arVar13 = null;
                            while (arVar6 != null) {
                                if (arVar6.ae != 3) {
                                    int iA7 = arVar6.j.a();
                                    if (arVar13 != null) {
                                        iA7 += arVar13.l.a();
                                    }
                                    aq aqVar16 = arVar6.j;
                                    aq aqVar17 = aqVar16.b;
                                    anVar.i(aqVar16.f, aqVar17.f, iA7, aqVar17.a.ae == 3 ? 2 : 3);
                                    int iA8 = arVar6.l.a();
                                    aq aqVar18 = arVar6.l.b.a.j;
                                    aq aqVar19 = aqVar18.b;
                                    if (aqVar19 != null && aqVar19.a == arVar6) {
                                        iA8 += aqVar18.a();
                                    }
                                    aq aqVar20 = arVar6.l;
                                    aq aqVar21 = aqVar20.b;
                                    anVar.j(aqVar20.f, aqVar21.f, -iA8, aqVar21.a.ae == 3 ? 2 : 3);
                                } else {
                                    f2 += arVar6.aa;
                                    aq aqVar22 = arVar6.l;
                                    if (aqVar22.b != null) {
                                        iA2 = aqVar22.a();
                                        if (arVar6 != this.at[3]) {
                                            iA2 += arVar6.l.b.a.j.a();
                                        }
                                    } else {
                                        iA2 = 0;
                                    }
                                    anVar.i(arVar6.l.f, arVar6.j.f, i4, 1);
                                    aq aqVar23 = arVar6.l;
                                    anVar.j(aqVar23.f, aqVar23.b.f, -iA2, 1);
                                }
                                arVar13 = arVar6;
                                arVar6 = arVar6.ac;
                            }
                            if (iG != 1) {
                                int i12 = 0;
                                while (true) {
                                    int i13 = iG - 1;
                                    if (i12 >= i13) {
                                        break;
                                    }
                                    ar[] arVarArr = this.ap;
                                    ar arVar14 = arVarArr[i12];
                                    i12++;
                                    ar arVar15 = arVarArr[i12];
                                    aq aqVar24 = arVar14.j;
                                    ap apVar3 = aqVar24.f;
                                    ap apVar4 = arVar14.l.f;
                                    ap apVar5 = arVar15.j.f;
                                    ap apVar6 = arVar15.l.f;
                                    int i14 = iG;
                                    ar[] arVarArr2 = this.at;
                                    ap apVar7 = arVar15 == arVarArr2[c] ? arVarArr2[1].l.f : apVar6;
                                    int iA9 = aqVar24.a();
                                    aq aqVar25 = arVar14.j.b;
                                    if (aqVar25 != null && (aqVar8 = (aqVar7 = aqVar25.a.l).b) != null && aqVar8.a == arVar14) {
                                        iA9 += aqVar7.a();
                                    }
                                    anVar.i(apVar3, arVar14.j.b.f, iA9, 2);
                                    int iA10 = arVar14.l.a();
                                    if (arVar14.l.b != null && (arVar4 = arVar14.ac) != null) {
                                        aq aqVar26 = arVar4.j;
                                        iA10 += aqVar26.b != null ? aqVar26.a() : 0;
                                    }
                                    anVar.j(apVar4, arVar14.l.b.f, -iA10, 2);
                                    if (i12 == i13) {
                                        int iA11 = arVar15.j.a();
                                        aq aqVar27 = arVar15.j.b;
                                        if (aqVar27 != null && (aqVar6 = (aqVar5 = aqVar27.a.l).b) != null && aqVar6.a == arVar15) {
                                            iA11 += aqVar5.a();
                                        }
                                        anVar.i(apVar5, arVar15.j.b.f, iA11, 2);
                                        aq aqVar28 = arVar15.l;
                                        ar[] arVarArr3 = this.at;
                                        if (arVar15 == arVarArr3[3]) {
                                            aqVar28 = arVarArr3[1].l;
                                        }
                                        int iA12 = aqVar28.a();
                                        aq aqVar29 = aqVar28.b;
                                        if (aqVar29 != null && (aqVar4 = (aqVar3 = aqVar29.a.j).b) != null && aqVar4.a == arVar15) {
                                            iA12 += aqVar3.a();
                                        }
                                        i3 = 2;
                                        anVar.j(apVar7, aqVar28.b.f, -iA12, 2);
                                    } else {
                                        i3 = 2;
                                    }
                                    int i15 = arVar5.h;
                                    if (i15 > 0) {
                                        anVar.j(apVar4, apVar3, i15, i3);
                                    }
                                    ak akVarA = anVar.a();
                                    akVarA.f(arVar14.aa, f2, arVar15.aa, apVar3, arVar14.j.a(), apVar4, arVar14.l.a(), apVar5, arVar15.j.a(), apVar7, arVar15.l.a());
                                    anVar.g(akVarA);
                                    iG = i14;
                                    c = 3;
                                }
                            } else {
                                ar arVar16 = this.ap[i4];
                                int iA13 = arVar16.j.a();
                                aq aqVar30 = arVar16.j.b;
                                if (aqVar30 != null) {
                                    iA13 += aqVar30.a();
                                }
                                int iA14 = arVar16.l.a();
                                aq aqVar31 = arVar16.l.b;
                                if (aqVar31 != null) {
                                    iA14 += aqVar31.a();
                                }
                                ap apVar8 = arVar5.l.b.f;
                                ar[] arVarArr4 = this.at;
                                if (arVar16 == arVarArr4[3]) {
                                    apVar8 = arVarArr4[1].l.b.f;
                                }
                                if (arVar16.d == 1) {
                                    aq aqVar32 = arVar5.j;
                                    anVar.i(aqVar32.f, aqVar32.b.f, iA13, 1);
                                    anVar.j(arVar5.l.f, apVar8, -iA14, 1);
                                    anVar.n(arVar5.l.f, arVar5.j.f, arVar5.d(), 2);
                                    i = i5;
                                } else {
                                    aq aqVar33 = arVar16.j;
                                    anVar.n(aqVar33.f, aqVar33.b.f, iA13, 1);
                                    anVar.n(arVar16.l.f, apVar8, -iA14, 1);
                                }
                            }
                            i = i5;
                        }
                        while (arVar6 != null) {
                            ar arVar17 = arVar6.ac;
                            if (arVar17 == null) {
                                arVar = this.at[1];
                                i4 = 1;
                            }
                            if (i6 == 2) {
                                aq aqVar34 = arVar6.j;
                                int iA15 = aqVar34.a();
                                if (arVar2 != null) {
                                    iA15 += arVar2.l.a();
                                }
                                int i16 = arVar6 != arVar6 ? 3 : 1;
                                aq aqVar35 = aqVar34.b;
                                if (aqVar35 != null) {
                                    apVar2 = aqVar34.f;
                                    apVar = aqVar35.f;
                                } else {
                                    aq aqVar36 = arVar6.m;
                                    aq aqVar37 = aqVar36.b;
                                    if (aqVar37 != null) {
                                        ap apVar9 = aqVar36.f;
                                        ap apVar10 = aqVar37.f;
                                        iA15 -= aqVar34.a();
                                        apVar2 = apVar9;
                                        apVar = apVar10;
                                    } else {
                                        apVar = null;
                                        apVar2 = null;
                                    }
                                }
                                if (apVar2 != null && apVar != null) {
                                    anVar.i(apVar2, apVar, iA15, i16);
                                }
                                if (arVar6.ae == 3) {
                                    aq aqVar38 = arVar6.l;
                                    if (arVar6.d == 1) {
                                        anVar.n(aqVar38.f, aqVar34.f, Math.max(arVar6.g, arVar6.d()), 3);
                                    } else {
                                        anVar.i(aqVar34.f, aqVar34.b.f, aqVar34.c, 3);
                                        anVar.j(aqVar38.f, aqVar34.f, arVar6.g, 3);
                                    }
                                }
                            } else if (i6 == 0 || i4 == 0 || arVar2 == null) {
                                if (i6 != 0 && i4 == 0 && arVar2 == null) {
                                    aq aqVar39 = arVar6.j;
                                    if (aqVar39.b == null) {
                                        anVar.h(aqVar39.f, arVar6.c());
                                    } else {
                                        anVar.n(arVar6.j.f, arVar5.j.b.f, aqVar39.a(), 5);
                                    }
                                } else {
                                    aq aqVar40 = arVar6.j;
                                    aq aqVar41 = arVar6.l;
                                    int iA16 = aqVar40.a();
                                    int iA17 = aqVar41.a();
                                    arVar3 = arVar6;
                                    anVar.i(aqVar40.f, aqVar40.b.f, iA16, 1);
                                    int i17 = i5;
                                    anVar.j(aqVar41.f, aqVar41.b.f, -iA17, 1);
                                    aq aqVar42 = aqVar40.b;
                                    ap apVar11 = aqVar42 != null ? aqVar42.f : null;
                                    if (arVar2 == null) {
                                        aq aqVar43 = arVar5.j.b;
                                        apVar11 = aqVar43 != null ? aqVar43.f : null;
                                    }
                                    if (arVar17 == null) {
                                        aq aqVar44 = arVar.l.b;
                                        arVar17 = aqVar44 != null ? aqVar44.a : null;
                                    }
                                    if (arVar17 != null) {
                                        ap apVar12 = arVar17.j.f;
                                        if (i4 != 0) {
                                            aq aqVar45 = arVar.l.b;
                                            apVar12 = aqVar45 != null ? aqVar45.f : null;
                                        }
                                        if (apVar11 == null || apVar12 == null) {
                                            i2 = i17;
                                        } else {
                                            ap apVar13 = apVar12;
                                            i2 = i17;
                                            anVar.m(aqVar40.f, apVar11, iA16, 0.5f, apVar13, aqVar41.f, iA17);
                                        }
                                    } else {
                                        i2 = i17;
                                    }
                                }
                                if (1 == i4) {
                                    arVar17 = null;
                                }
                                this = this;
                                arVar5 = arVar5;
                                i4 = i4;
                                i5 = i2;
                                arVar6 = arVar17;
                                arVar2 = arVar3;
                                arVar = arVar;
                            } else {
                                aq aqVar46 = arVar6.l;
                                if (aqVar46.b == null) {
                                    anVar.h(aqVar46.f, arVar6.c() + arVar6.z);
                                } else {
                                    anVar.n(arVar6.l.f, arVar.l.b.f, -aqVar46.a(), 5);
                                }
                            }
                            arVar3 = arVar6;
                            i2 = i5;
                            if (1 == i4) {
                                arVar17 = null;
                            }
                            this = this;
                            arVar5 = arVar5;
                            i4 = i4;
                            i5 = i2;
                            arVar6 = arVar17;
                            arVar2 = arVar3;
                            arVar = arVar;
                        }
                        ar arVar18 = arVar5;
                        i = i5;
                        if (i6 == 2) {
                            aq aqVar47 = arVar6.j;
                            aq aqVar48 = arVar.l;
                            int iA18 = aqVar47.a();
                            int iA19 = aqVar48.a();
                            aq aqVar49 = arVar18.j.b;
                            ap apVar14 = aqVar49 != null ? aqVar49.f : null;
                            aq aqVar50 = arVar.l.b;
                            ap apVar15 = aqVar50 != null ? aqVar50.f : null;
                            if (apVar14 != null && apVar15 != null) {
                                anVar.j(aqVar48.f, apVar15, -iA19, 1);
                                anVar.m(aqVar47.f, apVar14, iA18, arVar18.I, apVar15, aqVar48.f, iA19);
                            }
                        }
                    }
                }
            }
            i5 = i + 1;
            i4 = 0;
        }
    }

    final void A(ar arVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                aq aqVar = arVar.i;
                aq aqVar2 = aqVar.b;
                if (aqVar2 == null) {
                    break;
                }
                ar arVar2 = aqVar2.a;
                aq aqVar3 = arVar2.k.b;
                if (aqVar3 == null || aqVar3 != aqVar || arVar2 == arVar) {
                    break;
                } else {
                    arVar = arVar2;
                }
            }
            while (true) {
                int i3 = this.an;
                if (i2 >= i3) {
                    ar[] arVarArr = this.ar;
                    int length = arVarArr.length;
                    if (i3 + 1 >= length) {
                        this.ar = (ar[]) Arrays.copyOf(arVarArr, length + length);
                    }
                    ar[] arVarArr2 = this.ar;
                    int i4 = this.an;
                    arVarArr2[i4] = arVar;
                    this.an = i4 + 1;
                    return;
                }
                if (this.ar[i2] == arVar) {
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            while (true) {
                aq aqVar4 = arVar.j;
                aq aqVar5 = aqVar4.b;
                if (aqVar5 == null) {
                    break;
                }
                ar arVar3 = aqVar5.a;
                aq aqVar6 = arVar3.l.b;
                if (aqVar6 == null || aqVar6 != aqVar4 || arVar3 == arVar) {
                    break;
                } else {
                    arVar = arVar3;
                }
            }
            while (true) {
                int i5 = this.ao;
                if (i2 >= i5) {
                    ar[] arVarArr3 = this.aq;
                    int length2 = arVarArr3.length;
                    if (i5 + 1 >= length2) {
                        this.aq = (ar[]) Arrays.copyOf(arVarArr3, length2 + length2);
                    }
                    ar[] arVarArr4 = this.aq;
                    int i6 = this.ao;
                    arVarArr4[i6] = arVar;
                    this.ao = i6 + 1;
                    return;
                }
                if (this.aq[i2] == arVar) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0158 A[PHI: r0
      0x0158: PHI (r0v3 int) = (r0v2 int), (r0v2 int), (r0v6 int), (r0v6 int) binds: [B:94:0x0109, B:96:0x010f, B:114:0x0141, B:119:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void B(ar arVar, boolean[] zArr) {
        int iF;
        ar arVar2;
        aq aqVar;
        boolean z;
        aq aqVar2;
        aq aqVar3;
        ar arVar3;
        int i;
        boolean z2 = false;
        i = 0;
        int i2 = 0;
        z2 = false;
        z2 = false;
        if (arVar.ad == 3 && arVar.ae == 3 && arVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iF2 = arVar.f();
        if (arVar.ad == 3 && arVar.ae != 3 && arVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        arVar.T = true;
        if (arVar instanceof at) {
            at atVar = (at) arVar;
            if (atVar.ai == 1) {
                int i3 = atVar.ag;
                if (i3 != -1) {
                    i2 = i3;
                    i = 0;
                } else {
                    i = atVar.ah;
                    if (i == -1) {
                        i = 0;
                    }
                }
            } else {
                i = iF2;
                i2 = i;
            }
            iF2 = i;
        } else if (arVar.k.c() || arVar.i.c()) {
            aq aqVar4 = arVar.k;
            aq aqVar5 = aqVar4.b;
            if (aqVar5 != null && (aqVar3 = arVar.i.b) != null && (aqVar5 == aqVar3 || ((arVar3 = aqVar5.a) == aqVar3.a && arVar3 != arVar.r))) {
                zArr[0] = false;
                return;
            }
            ar arVar4 = null;
            if (aqVar5 != null) {
                arVar2 = aqVar5.a;
                iF = aqVar4.a() + iF2;
                if (!arVar2.t() && !arVar2.T) {
                    B(arVar2, zArr);
                }
            } else {
                iF = iF2;
                arVar2 = null;
            }
            aq aqVar6 = arVar.i;
            aq aqVar7 = aqVar6.b;
            if (aqVar7 != null) {
                arVar4 = aqVar7.a;
                iF2 += aqVar6.a();
                if (!arVar4.t() && !arVar4.T) {
                    B(arVar4, zArr);
                }
            }
            if (arVar.k.b != null && !arVar2.t()) {
                int i4 = arVar.k.b.g;
                if (i4 == 4) {
                    iF += arVar2.N - arVar2.f();
                } else if (i4 == 2) {
                    iF += arVar2.N;
                }
                if (arVar2.Q) {
                    z = true;
                } else {
                    z = (arVar2.i.b == null || arVar2.k.b == null || arVar2.ad == 3) ? false : true;
                }
                arVar.Q = z;
                if (z && ((aqVar2 = arVar2.i.b) == null || aqVar2.a != arVar)) {
                    iF += iF - arVar2.N;
                }
            }
            if (arVar.i.b == null || arVar4.t()) {
                i2 = iF2;
                iF2 = iF;
            } else {
                int i5 = arVar.i.b.g;
                if (i5 == 2) {
                    iF2 += arVar4.M - arVar4.f();
                } else if (i5 == 4) {
                    iF2 += arVar4.M;
                }
                if (arVar4.P) {
                    z2 = true;
                } else if (arVar4.i.b != null && arVar4.k.b != null && arVar4.ad != 3) {
                    z2 = true;
                }
                arVar.P = z2;
                if (!z2 || ((aqVar = arVar4.k.b) != null && aqVar.a == arVar)) {
                    i2 = iF2;
                    iF2 = iF;
                } else {
                    i2 = iF2 + (iF2 - arVar4.M);
                    iF2 = iF;
                }
            }
        } else {
            i2 = iF2 + arVar.w;
        }
        if (arVar.K == 8) {
            int i6 = arVar.s;
            i2 -= i6;
            iF2 -= i6;
        }
        arVar.M = i2;
        arVar.N = iF2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 4251. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void C(defpackage.ar r11, boolean[] r12) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as.C(ar, boolean[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0271 A[Catch: Exception -> 0x03d2, LOOP:7: B:101:0x026d->B:103:0x0271, LOOP_END, TryCatch #5 {Exception -> 0x03d2, blocks: (B:100:0x0262, B:101:0x026d, B:103:0x0271, B:106:0x027d), top: B:302:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x027d A[Catch: Exception -> 0x03d2, TRY_LEAVE, TryCatch #5 {Exception -> 0x03d2, blocks: (B:100:0x0262, B:101:0x026d, B:103:0x0271, B:106:0x027d), top: B:302:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x028c  */
    /* JADX WARN: Code duplicated, block: B:114:0x029d  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d4 A[Catch: Exception -> 0x02ea, TryCatch #3 {Exception -> 0x02ea, blocks: (B:115:0x029f, B:125:0x02b5, B:126:0x02ba, B:132:0x02d4, B:143:0x02f4, B:145:0x02f8, B:149:0x030e, B:135:0x02df), top: B:298:0x029f }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:135:0x02df A[Catch: Exception -> 0x02ea, TryCatch #3 {Exception -> 0x02ea, blocks: (B:115:0x029f, B:125:0x02b5, B:126:0x02ba, B:132:0x02d4, B:143:0x02f4, B:145:0x02f8, B:149:0x030e, B:135:0x02df), top: B:298:0x029f }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ec A[PHI: r13
      0x02ec: PHI (r13v4 int) = (r13v3 int), (r13v14 int) binds: [B:131:0x02d2, B:136:0x02e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:142:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f8 A[Catch: Exception -> 0x02ea, TryCatch #3 {Exception -> 0x02ea, blocks: (B:115:0x029f, B:125:0x02b5, B:126:0x02ba, B:132:0x02d4, B:143:0x02f4, B:145:0x02f8, B:149:0x030e, B:135:0x02df), top: B:298:0x029f }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0307  */
    /* JADX WARN: Code duplicated, block: B:149:0x030e A[Catch: Exception -> 0x02ea, TRY_LEAVE, TryCatch #3 {Exception -> 0x02ea, blocks: (B:115:0x029f, B:125:0x02b5, B:126:0x02ba, B:132:0x02d4, B:143:0x02f4, B:145:0x02f8, B:149:0x030e, B:135:0x02df), top: B:298:0x029f }] */
    /* JADX WARN: Code duplicated, block: B:153:0x031a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0322 A[Catch: Exception -> 0x034c, TRY_LEAVE, TryCatch #2 {Exception -> 0x034c, blocks: (B:155:0x031e, B:157:0x0322), top: B:296:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0336 A[Catch: Exception -> 0x03d0, TryCatch #1 {Exception -> 0x03d0, blocks: (B:171:0x0351, B:159:0x0328, B:161:0x032c, B:163:0x0336, B:167:0x0342, B:174:0x036a, B:175:0x037b, B:177:0x037f, B:178:0x0389, B:183:0x0392, B:189:0x03be, B:191:0x03c2, B:179:0x038c), top: B:294:0x0351, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x033e A[EDGE_INSN: B:165:0x033e->B:294:0x0351 BREAK  A[LOOP:12: B:154:0x031c->B:167:0x0342]] */
    /* JADX WARN: Code duplicated, block: B:166:0x0341 A[EDGE_INSN: B:166:0x0341->B:294:0x0351 BREAK  A[LOOP:12: B:154:0x031c->B:167:0x0342]] */
    /* JADX WARN: Code duplicated, block: B:167:0x0342 A[Catch: Exception -> 0x03d0, LOOP:12: B:154:0x031c->B:167:0x0342, LOOP_END, TryCatch #1 {Exception -> 0x03d0, blocks: (B:171:0x0351, B:159:0x0328, B:161:0x032c, B:163:0x0336, B:167:0x0342, B:174:0x036a, B:175:0x037b, B:177:0x037f, B:178:0x0389, B:183:0x0392, B:189:0x03be, B:191:0x03c2, B:179:0x038c), top: B:294:0x0351, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x036a A[Catch: Exception -> 0x03d0, TryCatch #1 {Exception -> 0x03d0, blocks: (B:171:0x0351, B:159:0x0328, B:161:0x032c, B:163:0x0336, B:167:0x0342, B:174:0x036a, B:175:0x037b, B:177:0x037f, B:178:0x0389, B:183:0x0392, B:189:0x03be, B:191:0x03c2, B:179:0x038c), top: B:294:0x0351, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x037f A[Catch: Exception -> 0x03d0, LOOP:13: B:175:0x037b->B:177:0x037f, LOOP_END, TryCatch #1 {Exception -> 0x03d0, blocks: (B:171:0x0351, B:159:0x0328, B:161:0x032c, B:163:0x0336, B:167:0x0342, B:174:0x036a, B:175:0x037b, B:177:0x037f, B:178:0x0389, B:183:0x0392, B:189:0x03be, B:191:0x03c2, B:179:0x038c), top: B:294:0x0351, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0398  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c2 A[Catch: Exception -> 0x03d0, TRY_LEAVE, TryCatch #1 {Exception -> 0x03d0, blocks: (B:171:0x0351, B:159:0x0328, B:161:0x032c, B:163:0x0336, B:167:0x0342, B:174:0x036a, B:175:0x037b, B:177:0x037f, B:178:0x0389, B:183:0x0392, B:189:0x03be, B:191:0x03c2, B:179:0x038c), top: B:294:0x0351, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:207:0x0402  */
    /* JADX WARN: Code duplicated, block: B:209:0x0414  */
    /* JADX WARN: Code duplicated, block: B:211:0x0423  */
    /* JADX WARN: Code duplicated, block: B:216:0x0433  */
    /* JADX WARN: Code duplicated, block: B:220:0x0442  */
    /* JADX WARN: Code duplicated, block: B:222:0x0449  */
    /* JADX WARN: Code duplicated, block: B:224:0x0455  */
    /* JADX WARN: Code duplicated, block: B:227:0x0464  */
    /* JADX WARN: Code duplicated, block: B:229:0x0468  */
    /* JADX WARN: Code duplicated, block: B:235:0x047e  */
    /* JADX WARN: Code duplicated, block: B:252:0x04de  */
    /* JADX WARN: Code duplicated, block: B:255:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:258:0x050b  */
    /* JADX WARN: Code duplicated, block: B:260:0x0517  */
    /* JADX WARN: Code duplicated, block: B:262:0x051c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x0532  */
    /* JADX WARN: Code duplicated, block: B:269:0x0539 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:273:0x054f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0553  */
    /* JADX WARN: Code duplicated, block: B:279:0x056e  */
    /* JADX WARN: Code duplicated, block: B:281:0x059e A[LOOP:15: B:280:0x059c->B:281:0x059e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:283:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:285:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:288:0x05e0 A[LOOP:16: B:287:0x05de->B:288:0x05e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:290:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:296:0x031e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0262 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x043f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0477 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0239  */
    /* JADX WARN: Code duplicated, block: B:93:0x0245  */
    /* JADX WARN: Code duplicated, block: B:97:0x0252  */
    @Override // defpackage.aw
    public final void D() {
        int i;
        boolean z;
        int size;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        ar arVar;
        ar arVar2;
        av avVar;
        int size2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z5;
        int i11;
        int i12;
        ar arVar3;
        int i13;
        boolean z6;
        int iMax;
        int iMax2;
        int i14;
        int i15;
        boolean[] zArr;
        int size3;
        int i16;
        ar arVar4;
        boolean zE;
        boolean z7;
        an anVar;
        am amVar;
        int i17;
        boolean z8;
        int i18;
        boolean z9;
        int i19;
        int size4;
        ap apVar;
        int i20;
        int i21;
        boolean z10;
        int i22;
        float f;
        int i23;
        int i24;
        boolean z11;
        ak akVar;
        int i25;
        ak akVar2;
        aj ajVar;
        int i26;
        int i27;
        int i28;
        int i29;
        float fA;
        float f2;
        boolean[] zArr2;
        int i30;
        ap apVar2;
        int i31;
        float f3;
        ar arVar5;
        char c;
        int i32 = this.w;
        int i33 = this.x;
        int iMax3 = Math.max(0, h());
        int iMax4 = Math.max(0, d());
        this.aj = false;
        this.ak = false;
        if (this.r != null) {
            if (this.am == null) {
                this.am = new av(this);
            }
            av avVar2 = this.am;
            avVar2.a = this.w;
            avVar2.b = this.x;
            avVar2.c = h();
            avVar2.d = d();
            int size5 = avVar2.e.size();
            for (int i34 = 0; i34 < size5; i34++) {
                au auVar = (au) avVar2.e.get(i34);
                auVar.a = u(auVar.a.g);
                aq aqVar = auVar.a;
                if (aqVar != null) {
                    auVar.b = aqVar.b;
                    auVar.c = aqVar.a();
                    aq aqVar2 = auVar.a;
                    auVar.e = aqVar2.h;
                    auVar.d = aqVar2.e;
                } else {
                    auVar.b = null;
                    auVar.c = 0;
                    auVar.e = 2;
                    auVar.d = 0;
                }
            }
            this.w = 0;
            this.x = 0;
            int size6 = this.q.size();
            for (int i35 = 0; i35 < size6; i35++) {
                ((aq) this.q.get(i35)).b();
            }
            j(this.af.g);
        } else {
            this.w = 0;
            this.x = 0;
        }
        int i36 = this.ae;
        int i37 = this.ad;
        if (this.ai == 2) {
            if (i36 != 2) {
                if (i37 == 2) {
                    i37 = 2;
                }
            }
            ArrayList arrayList = this.al;
            boolean[] zArr3 = this.as;
            int size7 = arrayList.size();
            zArr3[0] = true;
            int iMax5 = 0;
            int iMax6 = 0;
            int iMax7 = 0;
            int i38 = 0;
            int iMax8 = 0;
            int iMax9 = 0;
            int iMax10 = 0;
            while (true) {
                if (i38 >= size7) {
                    this.ag = Math.max(this.D, Math.max(Math.max(iMax5, iMax7), iMax6));
                    this.ah = Math.max(this.E, Math.max(Math.max(iMax8, iMax9), iMax10));
                    for (int i39 = 0; i39 < size7; i39++) {
                        ar arVar6 = (ar) arrayList.get(i39);
                        arVar6.T = false;
                        arVar6.U = false;
                        arVar6.P = false;
                        arVar6.Q = false;
                        arVar6.R = false;
                        arVar6.S = false;
                    }
                    c = 0;
                    break;
                }
                ar arVar7 = (ar) arrayList.get(i38);
                if (!arVar7.t()) {
                    if (!arVar7.T) {
                        B(arVar7, zArr3);
                    }
                    if (!arVar7.U) {
                        C(arVar7, zArr3);
                    }
                    if (!zArr3[0]) {
                        c = 0;
                        break;
                    }
                    int iH = (arVar7.M + arVar7.N) - arVar7.h();
                    int iD = (arVar7.L + arVar7.O) - arVar7.d();
                    int iH2 = arVar7.ad == 4 ? arVar7.h() + arVar7.i.c + arVar7.k.c : iH;
                    int iD2 = arVar7.ae == 4 ? arVar7.d() + arVar7.j.c + arVar7.l.c : iD;
                    int i40 = arVar7.K;
                    if (i40 == 8) {
                        iD2 = 0;
                    }
                    int i41 = i40 == 8 ? 0 : iH2;
                    iMax5 = Math.max(iMax5, arVar7.M);
                    iMax7 = Math.max(iMax7, arVar7.N);
                    iMax9 = Math.max(iMax9, arVar7.O);
                    iMax8 = Math.max(iMax8, arVar7.L);
                    iMax6 = Math.max(iMax6, i41);
                    iMax10 = Math.max(iMax10, iD2);
                }
                i38++;
                i37 = i37;
                i33 = i33;
                zArr3 = zArr3;
            }
            z = this.as[c];
            if (iMax3 > 0 && iMax4 > 0 && (this.ag > iMax3 || this.ah > iMax4)) {
                z = false;
            }
            if (z) {
                if (this.ad == 2) {
                    this.ad = 1;
                    if (iMax3 <= 0 || iMax3 >= this.ag) {
                        q(Math.max(this.D, this.ag));
                    } else {
                        this.aj = true;
                        q(iMax3);
                    }
                }
                if (this.ae == 2) {
                    this.ae = 1;
                    if (iMax4 <= 0 || iMax4 >= this.ah) {
                        k(Math.max(this.E, this.ah));
                    } else {
                        this.ak = true;
                        k(iMax4);
                    }
                }
            }
            i = i37;
            this.an = 0;
            this.ao = 0;
            size = this.al.size();
            for (i2 = 0; i2 < size; i2++) {
                arVar5 = (ar) this.al.get(i2);
                if (arVar5 instanceof aw) {
                    ((aw) arVar5).D();
                }
            }
            z2 = z;
            i3 = 0;
            z3 = true;
            while (z3) {
                i7 = i3 + 1;
                try {
                    this.af.l();
                    zE = E(this.af);
                    if (zE) {
                        try {
                            anVar = this.af;
                            amVar = anVar.b;
                            amVar.a(anVar);
                            anVar.o(amVar);
                            for (i17 = 0; i17 < anVar.e; i17++) {
                                anVar.d[i17] = false;
                            }
                            z8 = false;
                            i18 = 0;
                            while (!z8) {
                                size4 = amVar.a.size();
                                z7 = zE;
                                apVar = null;
                                i20 = 0;
                                i21 = 0;
                                while (i20 < size4) {
                                    int i42 = size4;
                                    try {
                                        apVar2 = (ap) amVar.a.get(i20);
                                        z5 = z2;
                                        i31 = 5;
                                        while (i31 >= 0) {
                                            i8 = i32;
                                            try {
                                                f3 = apVar2.e[i31];
                                                if (apVar == null && f3 < 0.0f && i31 >= i21) {
                                                    apVar = apVar2;
                                                    i21 = i31;
                                                }
                                                if (f3 <= 0.0f && i31 > i21) {
                                                    i21 = i31;
                                                    apVar = null;
                                                }
                                                i31--;
                                                i32 = i8;
                                            } catch (Exception e) {
                                                e = e;
                                                i9 = iMax3;
                                                i10 = iMax4;
                                                i11 = i36;
                                                z3 = z7;
                                                e.printStackTrace();
                                                if (!z3) {
                                                    zArr = this.as;
                                                    zArr[2] = false;
                                                    z();
                                                    size3 = this.al.size();
                                                    for (i16 = 0; i16 < size3; i16++) {
                                                        arVar4 = (ar) this.al.get(i16);
                                                        arVar4.z();
                                                        if (arVar4.ad == 3) {
                                                            zArr[2] = true;
                                                        }
                                                        if (arVar4.ae != 3) {
                                                        }
                                                    }
                                                } else {
                                                    z();
                                                    for (i12 = 0; i12 < size; i12++) {
                                                        arVar3 = (ar) this.al.get(i12);
                                                        if (arVar3.ad != 3) {
                                                            if (arVar3.ae != 3) {
                                                            }
                                                        } else {
                                                            if (arVar3.ae != 3) {
                                                            }
                                                        }
                                                    }
                                                }
                                                if (i7 < 8) {
                                                    i13 = i11;
                                                    z6 = false;
                                                } else {
                                                    i13 = i11;
                                                    z6 = false;
                                                }
                                                iMax = Math.max(this.D, h());
                                                if (iMax > h()) {
                                                    q(iMax);
                                                    this.ad = 1;
                                                    z6 = true;
                                                    z5 = true;
                                                }
                                                iMax2 = Math.max(this.E, d());
                                                if (iMax2 > d()) {
                                                    k(iMax2);
                                                    this.ae = 1;
                                                    z6 = true;
                                                    z5 = true;
                                                }
                                                if (z5) {
                                                    i14 = i10;
                                                    i15 = i9;
                                                } else {
                                                    if (this.ad == 2) {
                                                        i15 = i9;
                                                    } else {
                                                        i15 = i9;
                                                    }
                                                    if (this.ae == 2) {
                                                        i14 = i10;
                                                    } else {
                                                        i14 = i10;
                                                    }
                                                }
                                                iMax3 = i15;
                                                i36 = i13;
                                                iMax4 = i14;
                                                z2 = z5;
                                                i32 = i8;
                                                z3 = z6;
                                                i3 = i7;
                                            }
                                        }
                                        i20++;
                                        size4 = i42;
                                        z2 = z5;
                                    } catch (Exception e2) {
                                        e = e2;
                                        i8 = i32;
                                        z5 = z2;
                                    }
                                }
                                i8 = i32;
                                z5 = z2;
                                if (apVar != null) {
                                    zArr2 = anVar.d;
                                    i30 = apVar.a;
                                    if (zArr2[i30]) {
                                        z10 = false;
                                        apVar = null;
                                    } else {
                                        zArr2[i30] = true;
                                        i18++;
                                        if (i18 >= anVar.e) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                } else {
                                    z10 = false;
                                }
                                if (apVar != null) {
                                    f = Float.MAX_VALUE;
                                    i23 = 0;
                                    i24 = -1;
                                    while (i23 < anVar.f) {
                                        akVar2 = anVar.c[i23];
                                        boolean z12 = z10;
                                        int i43 = i18;
                                        try {
                                            if (akVar2.a.h == 1) {
                                                i9 = iMax3;
                                                i10 = iMax4;
                                            } else {
                                                ajVar = akVar2.d;
                                                i26 = ajVar.f;
                                                i10 = iMax4;
                                                i27 = -1;
                                                i9 = iMax3;
                                                if (i26 == -1) {
                                                    i28 = i26;
                                                    i29 = 0;
                                                    while (true) {
                                                        if (i28 != i27) {
                                                            try {
                                                                if (i29 < ajVar.a) {
                                                                    i11 = i36;
                                                                    if (ajVar.c[i28] == apVar.a) {
                                                                        fA = akVar2.d.a(apVar);
                                                                        if (fA < 0.0f) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        f2 = (-akVar2.b) / fA;
                                                                        if (f2 >= f) {
                                                                            break;
                                                                        }
                                                                        f = f2;
                                                                        i24 = i23;
                                                                        break;
                                                                    }
                                                                    i28 = ajVar.d[i28];
                                                                    i29++;
                                                                    i36 = i11;
                                                                    i27 = -1;
                                                                }
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                i11 = i36;
                                                                z3 = z7;
                                                                e.printStackTrace();
                                                                if (!z3) {
                                                                    zArr = this.as;
                                                                    zArr[2] = false;
                                                                    z();
                                                                    size3 = this.al.size();
                                                                    while (i16 < size3) {
                                                                        arVar4 = (ar) this.al.get(i16);
                                                                        arVar4.z();
                                                                        if (arVar4.ad == 3) {
                                                                            zArr[2] = true;
                                                                        }
                                                                        if (arVar4.ae != 3) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    z();
                                                                    while (i12 < size) {
                                                                        arVar3 = (ar) this.al.get(i12);
                                                                        if (arVar3.ad != 3) {
                                                                            if (arVar3.ae != 3) {
                                                                            }
                                                                        } else {
                                                                            if (arVar3.ae != 3) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (i7 < 8) {
                                                                    i13 = i11;
                                                                    z6 = false;
                                                                } else {
                                                                    i13 = i11;
                                                                    z6 = false;
                                                                }
                                                                iMax = Math.max(this.D, h());
                                                                if (iMax > h()) {
                                                                    q(iMax);
                                                                    this.ad = 1;
                                                                    z6 = true;
                                                                    z5 = true;
                                                                }
                                                                iMax2 = Math.max(this.E, d());
                                                                if (iMax2 > d()) {
                                                                    k(iMax2);
                                                                    this.ae = 1;
                                                                    z6 = true;
                                                                    z5 = true;
                                                                }
                                                                if (z5) {
                                                                    if (this.ad == 2) {
                                                                        i15 = i9;
                                                                    } else {
                                                                        i15 = i9;
                                                                    }
                                                                    if (this.ae == 2) {
                                                                        i14 = i10;
                                                                    } else {
                                                                        i14 = i10;
                                                                    }
                                                                } else {
                                                                    i14 = i10;
                                                                    i15 = i9;
                                                                }
                                                                iMax3 = i15;
                                                                i36 = i13;
                                                                iMax4 = i14;
                                                                z2 = z5;
                                                                i32 = i8;
                                                                z3 = z6;
                                                                i3 = i7;
                                                            }
                                                        }
                                                        i11 = i36;
                                                        break;
                                                    }
                                                }
                                                i23++;
                                                z10 = z12;
                                                i18 = i43;
                                                iMax4 = i10;
                                                iMax3 = i9;
                                                i36 = i11;
                                            }
                                            i23++;
                                            z10 = z12;
                                            i18 = i43;
                                            iMax4 = i10;
                                            iMax3 = i9;
                                            i36 = i11;
                                        } catch (Exception e4) {
                                            e = e4;
                                            z3 = z7;
                                            e.printStackTrace();
                                            if (!z3) {
                                                zArr = this.as;
                                                zArr[2] = false;
                                                z();
                                                size3 = this.al.size();
                                                while (i16 < size3) {
                                                    arVar4 = (ar) this.al.get(i16);
                                                    arVar4.z();
                                                    if (arVar4.ad == 3) {
                                                        zArr[2] = true;
                                                    }
                                                    if (arVar4.ae != 3) {
                                                    }
                                                }
                                            } else {
                                                z();
                                                while (i12 < size) {
                                                    arVar3 = (ar) this.al.get(i12);
                                                    if (arVar3.ad != 3) {
                                                        if (arVar3.ae != 3) {
                                                        }
                                                    } else {
                                                        if (arVar3.ae != 3) {
                                                        }
                                                    }
                                                }
                                            }
                                            if (i7 < 8) {
                                                i13 = i11;
                                                z6 = false;
                                            } else {
                                                i13 = i11;
                                                z6 = false;
                                            }
                                            iMax = Math.max(this.D, h());
                                            if (iMax > h()) {
                                                q(iMax);
                                                this.ad = 1;
                                                z6 = true;
                                                z5 = true;
                                            }
                                            iMax2 = Math.max(this.E, d());
                                            if (iMax2 > d()) {
                                                k(iMax2);
                                                this.ae = 1;
                                                z6 = true;
                                                z5 = true;
                                            }
                                            if (z5) {
                                                if (this.ad == 2) {
                                                    i15 = i9;
                                                } else {
                                                    i15 = i9;
                                                }
                                                if (this.ae == 2) {
                                                    i14 = i10;
                                                } else {
                                                    i14 = i10;
                                                }
                                            } else {
                                                i14 = i10;
                                                i15 = i9;
                                            }
                                            iMax3 = i15;
                                            i36 = i13;
                                            iMax4 = i14;
                                            z2 = z5;
                                            i32 = i8;
                                            z3 = z6;
                                            i3 = i7;
                                        }
                                        i11 = i36;
                                    }
                                    z11 = z10;
                                    i9 = iMax3;
                                    i10 = iMax4;
                                    i11 = i36;
                                    i22 = i18;
                                    if (i24 >= 0) {
                                        akVar = anVar.c[i24];
                                        akVar.a.b = -1;
                                        akVar.a(apVar);
                                        akVar.a.b = i24;
                                        for (i25 = 0; i25 < anVar.f; i25++) {
                                            anVar.c[i25].k(akVar);
                                        }
                                        amVar.a(anVar);
                                        try {
                                            anVar.o(amVar);
                                        } catch (Exception e5) {
                                            e5.printStackTrace();
                                        }
                                        z8 = z11;
                                    }
                                    zE = z7;
                                    z2 = z5;
                                    i32 = i8;
                                    i18 = i22;
                                    iMax4 = i10;
                                    iMax3 = i9;
                                    i36 = i11;
                                } else {
                                    i9 = iMax3;
                                    i10 = iMax4;
                                    i11 = i36;
                                    i22 = i18;
                                }
                                z8 = true;
                                zE = z7;
                                z2 = z5;
                                i32 = i8;
                                i18 = i22;
                                iMax4 = i10;
                                iMax3 = i9;
                                i36 = i11;
                            }
                            i8 = i32;
                            i9 = iMax3;
                            i10 = iMax4;
                            z5 = z2;
                            z9 = zE;
                            i11 = i36;
                            for (i19 = 0; i19 < anVar.f; i19++) {
                                ak akVar3 = anVar.c[i19];
                                akVar3.a.d = akVar3.b;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            i8 = i32;
                            i9 = iMax3;
                            i10 = iMax4;
                            z5 = z2;
                            z7 = zE;
                        }
                    } else {
                        i8 = i32;
                        i9 = iMax3;
                        i10 = iMax4;
                        z5 = z2;
                        z9 = zE;
                        i11 = i36;
                    }
                    z3 = z9;
                } catch (Exception e7) {
                    e = e7;
                    i8 = i32;
                    i9 = iMax3;
                    i10 = iMax4;
                    z5 = z2;
                    i11 = i36;
                }
                if (!z3) {
                    z();
                    while (i12 < size) {
                        arVar3 = (ar) this.al.get(i12);
                        if (arVar3.ad != 3 && arVar3.h() < arVar3.F) {
                            this.as[2] = true;
                            break;
                        } else {
                            if (arVar3.ae != 3 && arVar3.d() < arVar3.G) {
                                this.as[2] = true;
                                break;
                            }
                        }
                    }
                } else {
                    zArr = this.as;
                    zArr[2] = false;
                    z();
                    size3 = this.al.size();
                    while (i16 < size3) {
                        arVar4 = (ar) this.al.get(i16);
                        arVar4.z();
                        if (arVar4.ad == 3 && arVar4.h() < arVar4.F) {
                            zArr[2] = true;
                        }
                        if (arVar4.ae != 3 && arVar4.d() < arVar4.G) {
                            zArr[2] = true;
                        }
                    }
                }
                if (i7 < 8 || !this.as[2]) {
                    i13 = i11;
                    z6 = false;
                } else {
                    int iMax11 = 0;
                    int iMax12 = 0;
                    for (int i44 = 0; i44 < size; i44++) {
                        ar arVar8 = (ar) this.al.get(i44);
                        iMax11 = Math.max(iMax11, arVar8.w + arVar8.h());
                        iMax12 = Math.max(iMax12, arVar8.x + arVar8.d());
                    }
                    int iMax13 = Math.max(this.D, iMax11);
                    int iMax14 = Math.max(this.E, iMax12);
                    if (i != 2 || h() >= iMax13) {
                        z6 = false;
                    } else {
                        q(iMax13);
                        this.ad = 2;
                        z6 = true;
                        z5 = true;
                    }
                    i13 = i11;
                    if (i13 == 2 && d() < iMax14) {
                        k(iMax14);
                        this.ae = 2;
                        z6 = true;
                        z5 = true;
                    }
                }
                iMax = Math.max(this.D, h());
                if (iMax > h()) {
                    q(iMax);
                    this.ad = 1;
                    z6 = true;
                    z5 = true;
                }
                iMax2 = Math.max(this.E, d());
                if (iMax2 > d()) {
                    k(iMax2);
                    this.ae = 1;
                    z6 = true;
                    z5 = true;
                }
                if (z5) {
                    if (this.ad == 2 || i9 <= 0) {
                        i15 = i9;
                    } else {
                        i15 = i9;
                        if (h() > i15) {
                            this.aj = true;
                            this.ad = 1;
                            q(i15);
                            z6 = true;
                            z5 = true;
                        }
                    }
                    if (this.ae == 2 || i10 <= 0) {
                        i14 = i10;
                    } else {
                        i14 = i10;
                        if (d() > i14) {
                            this.ak = true;
                            this.ae = 1;
                            k(i14);
                            z6 = true;
                            z5 = true;
                        }
                    }
                } else {
                    i14 = i10;
                    i15 = i9;
                }
                iMax3 = i15;
                i36 = i13;
                iMax4 = i14;
                z2 = z5;
                i32 = i8;
                z3 = z6;
                i3 = i7;
            }
            i4 = i32;
            z4 = z2;
            i5 = i36;
            if (this.r != null) {
                int iMax15 = Math.max(this.D, h());
                int iMax16 = Math.max(this.E, d());
                avVar = this.am;
                this.w = avVar.a;
                this.x = avVar.b;
                q(avVar.c);
                k(avVar.d);
                size2 = avVar.e.size();
                for (i6 = 0; i6 < size2; i6++) {
                    au auVar2 = (au) avVar.e.get(i6);
                    u(auVar2.a.g).d(auVar2.b, auVar2.c, -1, auVar2.e, auVar2.d, false);
                }
                q(iMax15);
                k(iMax16);
            } else {
                this.w = i4;
                this.x = i33;
            }
            if (z4) {
                this.ad = i;
                this.ae = i5;
            }
            j(this.af.g);
            arVar2 = this;
            for (arVar = this.r; arVar != null; arVar = arVar.r) {
                arVar2 = arVar;
            }
            if (this == arVar2) {
                r();
            }
        }
        i = i37;
        z = false;
        this.an = 0;
        this.ao = 0;
        size = this.al.size();
        while (i2 < size) {
            arVar5 = (ar) this.al.get(i2);
            if (arVar5 instanceof aw) {
                ((aw) arVar5).D();
            }
        }
        z2 = z;
        i3 = 0;
        z3 = true;
        while (z3) {
            i7 = i3 + 1;
            this.af.l();
            zE = E(this.af);
            if (zE) {
                anVar = this.af;
                amVar = anVar.b;
                amVar.a(anVar);
                anVar.o(amVar);
                while (i17 < anVar.e) {
                    anVar.d[i17] = false;
                }
                z8 = false;
                i18 = 0;
                while (!z8) {
                    size4 = amVar.a.size();
                    z7 = zE;
                    apVar = null;
                    i20 = 0;
                    i21 = 0;
                    while (i20 < size4) {
                        int i45 = size4;
                        apVar2 = (ap) amVar.a.get(i20);
                        z5 = z2;
                        i31 = 5;
                        while (i31 >= 0) {
                            i8 = i32;
                            f3 = apVar2.e[i31];
                            if (apVar == null) {
                                apVar = apVar2;
                                i21 = i31;
                            }
                            if (f3 <= 0.0f) {
                            }
                            i31--;
                            i32 = i8;
                        }
                        i20++;
                        size4 = i45;
                        z2 = z5;
                    }
                    i8 = i32;
                    z5 = z2;
                    if (apVar != null) {
                        zArr2 = anVar.d;
                        i30 = apVar.a;
                        if (zArr2[i30]) {
                            z10 = false;
                            apVar = null;
                        } else {
                            zArr2[i30] = true;
                            i18++;
                            if (i18 >= anVar.e) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (apVar != null) {
                        f = Float.MAX_VALUE;
                        i23 = 0;
                        i24 = -1;
                        while (i23 < anVar.f) {
                            akVar2 = anVar.c[i23];
                            boolean z13 = z10;
                            int i46 = i18;
                            if (akVar2.a.h == 1) {
                                i9 = iMax3;
                                i10 = iMax4;
                            } else {
                                ajVar = akVar2.d;
                                i26 = ajVar.f;
                                i10 = iMax4;
                                i27 = -1;
                                i9 = iMax3;
                                if (i26 == -1) {
                                    i28 = i26;
                                    i29 = 0;
                                    while (true) {
                                        if (i28 != i27) {
                                            if (i29 < ajVar.a) {
                                                i11 = i36;
                                                if (ajVar.c[i28] == apVar.a) {
                                                    fA = akVar2.d.a(apVar);
                                                    if (fA < 0.0f) {
                                                        break;
                                                        break;
                                                    }
                                                    f2 = (-akVar2.b) / fA;
                                                    if (f2 >= f) {
                                                        f = f2;
                                                        i24 = i23;
                                                        break;
                                                    } else {
                                                        break;
                                                        break;
                                                    }
                                                }
                                                i28 = ajVar.d[i28];
                                                i29++;
                                                i36 = i11;
                                                i27 = -1;
                                            }
                                        }
                                        i11 = i36;
                                        break;
                                    }
                                }
                                i23++;
                                z10 = z13;
                                i18 = i46;
                                iMax4 = i10;
                                iMax3 = i9;
                                i36 = i11;
                            }
                            i11 = i36;
                            i23++;
                            z10 = z13;
                            i18 = i46;
                            iMax4 = i10;
                            iMax3 = i9;
                            i36 = i11;
                        }
                        z11 = z10;
                        i9 = iMax3;
                        i10 = iMax4;
                        i11 = i36;
                        i22 = i18;
                        if (i24 >= 0) {
                            akVar = anVar.c[i24];
                            akVar.a.b = -1;
                            akVar.a(apVar);
                            akVar.a.b = i24;
                            while (i25 < anVar.f) {
                                anVar.c[i25].k(akVar);
                            }
                            amVar.a(anVar);
                            anVar.o(amVar);
                            z8 = z11;
                        }
                        zE = z7;
                        z2 = z5;
                        i32 = i8;
                        i18 = i22;
                        iMax4 = i10;
                        iMax3 = i9;
                        i36 = i11;
                    } else {
                        i9 = iMax3;
                        i10 = iMax4;
                        i11 = i36;
                        i22 = i18;
                    }
                    z8 = true;
                    zE = z7;
                    z2 = z5;
                    i32 = i8;
                    i18 = i22;
                    iMax4 = i10;
                    iMax3 = i9;
                    i36 = i11;
                }
                i8 = i32;
                i9 = iMax3;
                i10 = iMax4;
                z5 = z2;
                z9 = zE;
                i11 = i36;
                while (i19 < anVar.f) {
                    ak akVar4 = anVar.c[i19];
                    akVar4.a.d = akVar4.b;
                }
            } else {
                i8 = i32;
                i9 = iMax3;
                i10 = iMax4;
                z5 = z2;
                z9 = zE;
                i11 = i36;
            }
            z3 = z9;
            if (!z3) {
                zArr = this.as;
                zArr[2] = false;
                z();
                size3 = this.al.size();
                while (i16 < size3) {
                    arVar4 = (ar) this.al.get(i16);
                    arVar4.z();
                    if (arVar4.ad == 3) {
                        zArr[2] = true;
                    }
                    if (arVar4.ae != 3) {
                    }
                }
            } else {
                z();
                while (i12 < size) {
                    arVar3 = (ar) this.al.get(i12);
                    if (arVar3.ad != 3) {
                        if (arVar3.ae != 3) {
                        }
                    } else {
                        if (arVar3.ae != 3) {
                        }
                    }
                }
            }
            if (i7 < 8) {
                i13 = i11;
                z6 = false;
            } else {
                i13 = i11;
                z6 = false;
            }
            iMax = Math.max(this.D, h());
            if (iMax > h()) {
                q(iMax);
                this.ad = 1;
                z6 = true;
                z5 = true;
            }
            iMax2 = Math.max(this.E, d());
            if (iMax2 > d()) {
                k(iMax2);
                this.ae = 1;
                z6 = true;
                z5 = true;
            }
            if (z5) {
                if (this.ad == 2) {
                    i15 = i9;
                } else {
                    i15 = i9;
                }
                if (this.ae == 2) {
                    i14 = i10;
                } else {
                    i14 = i10;
                }
            } else {
                i14 = i10;
                i15 = i9;
            }
            iMax3 = i15;
            i36 = i13;
            iMax4 = i14;
            z2 = z5;
            i32 = i8;
            z3 = z6;
            i3 = i7;
        }
        i4 = i32;
        z4 = z2;
        i5 = i36;
        if (this.r != null) {
            int iMax17 = Math.max(this.D, h());
            int iMax18 = Math.max(this.E, d());
            avVar = this.am;
            this.w = avVar.a;
            this.x = avVar.b;
            q(avVar.c);
            k(avVar.d);
            size2 = avVar.e.size();
            while (i6 < size2) {
                au auVar3 = (au) avVar.e.get(i6);
                u(auVar3.a.g).d(auVar3.b, auVar3.c, -1, auVar3.e, auVar3.d, false);
            }
            q(iMax17);
            k(iMax18);
        } else {
            this.w = i4;
            this.x = i33;
        }
        if (z4) {
            this.ad = i;
            this.ae = i5;
        }
        j(this.af.g);
        arVar2 = this;
        while (arVar != null) {
            arVar2 = arVar;
        }
        if (this == arVar2) {
            r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:185:0x05dc  */
    public final boolean E(an anVar) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        aq aqVar;
        int iD;
        int i6;
        aq aqVar2;
        int iH;
        int i7;
        y(anVar);
        int size = this.al.size();
        int i8 = this.ai;
        int i9 = 4;
        int i10 = 1;
        if (i8 == 2 || i8 == 4) {
            int size2 = this.al.size();
            int i11 = 0;
            while (true) {
                i = 3;
                i2 = -1;
                if (i11 >= size2) {
                    break;
                }
                ar arVar = (ar) this.al.get(i11);
                arVar.a = -1;
                arVar.b = -1;
                if (arVar.ad == 3 || arVar.ae == 3) {
                    arVar.a = 1;
                    arVar.b = 1;
                }
                i11++;
            }
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (!z2) {
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i14 < size2) {
                    ar arVar2 = (ar) this.al.get(i14);
                    if (arVar2.a == i2) {
                        int i17 = this.ad;
                        if (i17 == 2 || (i6 = arVar2.ad) == i) {
                            arVar2.a = i10;
                        } else if (i17 == 2 || i6 != i9) {
                            aq aqVar3 = arVar2.i;
                            aq aqVar4 = aqVar3.b;
                            if (aqVar4 == null || (aqVar2 = arVar2.k.b) == null) {
                                if (aqVar4 == null || aqVar4.a != this) {
                                    aq aqVar5 = arVar2.k.b;
                                    if (aqVar5 != null && aqVar5.a == this) {
                                        aqVar3.f = anVar.e(aqVar3);
                                        aq aqVar6 = arVar2.k;
                                        aqVar6.f = anVar.e(aqVar6);
                                        int iH2 = h() - arVar2.k.a();
                                        int iH3 = iH2 - arVar2.h();
                                        anVar.h(arVar2.i.f, iH3);
                                        anVar.h(arVar2.k.f, iH2);
                                        arVar2.a = 2;
                                        arVar2.l(iH3, iH2);
                                    } else if (aqVar4 != null && aqVar4.a.a == 2) {
                                        ap apVar = aqVar4.f;
                                        aqVar3.f = anVar.e(aqVar3);
                                        aq aqVar7 = arVar2.k;
                                        aqVar7.f = anVar.e(aqVar7);
                                        int iA = (int) (apVar.d + arVar2.i.a() + 0.5f);
                                        int iH4 = arVar2.h() + iA;
                                        anVar.h(arVar2.i.f, iA);
                                        anVar.h(arVar2.k.f, iH4);
                                        arVar2.a = 2;
                                        arVar2.l(iA, iH4);
                                    } else if (aqVar5 != null && aqVar5.a.a == 2) {
                                        ap apVar2 = aqVar5.f;
                                        aqVar3.f = anVar.e(aqVar3);
                                        aq aqVar8 = arVar2.k;
                                        aqVar8.f = anVar.e(aqVar8);
                                        int iA2 = (int) ((apVar2.d - arVar2.k.a()) + 0.5f);
                                        int iH5 = iA2 - arVar2.h();
                                        anVar.h(arVar2.i.f, iH5);
                                        anVar.h(arVar2.k.f, iA2);
                                        arVar2.a = 2;
                                        arVar2.l(iH5, iA2);
                                    } else if (aqVar4 == null && aqVar5 == null) {
                                        if (arVar2 instanceof at) {
                                            at atVar = (at) arVar2;
                                            if (atVar.ai == i10) {
                                                aqVar3.f = anVar.e(aqVar3);
                                                aq aqVar9 = arVar2.k;
                                                aqVar9.f = anVar.e(aqVar9);
                                                int i18 = atVar.ag;
                                                int iH6 = (int) ((i18 != -1 ? i18 : atVar.ah != -1 ? h() - atVar.ah : h() * atVar.af) + 0.5f);
                                                anVar.h(arVar2.i.f, iH6);
                                                anVar.h(arVar2.k.f, iH6);
                                                arVar2.a = 2;
                                                arVar2.b = 2;
                                                arVar2.l(iH6, iH6);
                                                arVar2.p(0, d());
                                            }
                                        } else {
                                            aqVar3.f = anVar.e(aqVar3);
                                            aq aqVar10 = arVar2.k;
                                            aqVar10.f = anVar.e(aqVar10);
                                            int i19 = arVar2.w;
                                            int iH7 = arVar2.h();
                                            anVar.h(arVar2.i.f, i19);
                                            anVar.h(arVar2.k.f, i19 + iH7);
                                            arVar2.a = 2;
                                        }
                                    }
                                } else {
                                    int iA3 = aqVar3.a();
                                    int iH8 = arVar2.h() + iA3;
                                    aq aqVar11 = arVar2.i;
                                    aqVar11.f = anVar.e(aqVar11);
                                    aq aqVar12 = arVar2.k;
                                    aqVar12.f = anVar.e(aqVar12);
                                    anVar.h(arVar2.i.f, iA3);
                                    anVar.h(arVar2.k.f, iH8);
                                    arVar2.a = 2;
                                    arVar2.l(iA3, iH8);
                                }
                            } else if (aqVar4.a == this && aqVar2.a == this) {
                                int iA4 = aqVar3.a();
                                int iA5 = arVar2.k.a();
                                if (this.ad == i) {
                                    iH = h() - iA5;
                                } else {
                                    iA4 += (int) (((((h() - iA4) - iA5) - arVar2.h()) * arVar2.H) + 0.5f);
                                    iH = iA4 + arVar2.h();
                                }
                                aq aqVar13 = arVar2.i;
                                aqVar13.f = anVar.e(aqVar13);
                                aq aqVar14 = arVar2.k;
                                aqVar14.f = anVar.e(aqVar14);
                                anVar.h(arVar2.i.f, iA4);
                                anVar.h(arVar2.k.f, iH);
                                arVar2.a = 2;
                                arVar2.l(iA4, iH);
                            } else {
                                arVar2.a = i10;
                            }
                        } else {
                            aq aqVar15 = arVar2.i;
                            aqVar15.f = anVar.e(aqVar15);
                            aq aqVar16 = arVar2.k;
                            aqVar16.f = anVar.e(aqVar16);
                            int i20 = arVar2.i.c;
                            int iH9 = h() - arVar2.k.c;
                            anVar.h(arVar2.i.f, i20);
                            anVar.h(arVar2.k.f, iH9);
                            arVar2.l(i20, iH9);
                            arVar2.a = 2;
                        }
                    }
                    if (arVar2.b == -1) {
                        int i21 = this.ae;
                        if (i21 == 2 || (i5 = arVar2.ae) == 3) {
                            arVar2.b = i10;
                        } else if (i21 == 2 || i5 != 4) {
                            aq aqVar17 = arVar2.j;
                            aq aqVar18 = aqVar17.b;
                            if (aqVar18 == null || (aqVar = arVar2.l.b) == null) {
                                if (aqVar18 == null || aqVar18.a != this) {
                                    aq aqVar19 = arVar2.l.b;
                                    if (aqVar19 != null && aqVar19.a == this) {
                                        aqVar17.f = anVar.e(aqVar17);
                                        aq aqVar20 = arVar2.l;
                                        aqVar20.f = anVar.e(aqVar20);
                                        int iD2 = d() - arVar2.l.a();
                                        int iD3 = iD2 - arVar2.d();
                                        anVar.h(arVar2.j.f, iD3);
                                        anVar.h(arVar2.l.f, iD2);
                                        if (arVar2.C > 0 || arVar2.K == 8) {
                                            aq aqVar21 = arVar2.m;
                                            aqVar21.f = anVar.e(aqVar21);
                                            anVar.h(arVar2.m.f, arVar2.C + iD3);
                                        }
                                        arVar2.b = 2;
                                        arVar2.p(iD3, iD2);
                                    } else if (aqVar18 != null && aqVar18.a.b == 2) {
                                        ap apVar3 = aqVar18.f;
                                        aqVar17.f = anVar.e(aqVar17);
                                        aq aqVar22 = arVar2.l;
                                        aqVar22.f = anVar.e(aqVar22);
                                        int iA6 = (int) (apVar3.d + arVar2.j.a() + 0.5f);
                                        int iD4 = arVar2.d() + iA6;
                                        anVar.h(arVar2.j.f, iA6);
                                        anVar.h(arVar2.l.f, iD4);
                                        if (arVar2.C > 0 || arVar2.K == 8) {
                                            aq aqVar23 = arVar2.m;
                                            aqVar23.f = anVar.e(aqVar23);
                                            anVar.h(arVar2.m.f, arVar2.C + iA6);
                                        }
                                        arVar2.b = 2;
                                        arVar2.p(iA6, iD4);
                                    } else if (aqVar19 == null || aqVar19.a.b != 2) {
                                        aq aqVar24 = arVar2.m.b;
                                        if (aqVar24 != null && aqVar24.a.b == 2) {
                                            ap apVar4 = aqVar24.f;
                                            aqVar17.f = anVar.e(aqVar17);
                                            aq aqVar25 = arVar2.l;
                                            aqVar25.f = anVar.e(aqVar25);
                                            int i22 = (int) ((apVar4.d - arVar2.C) + 0.5f);
                                            int iD5 = arVar2.d() + i22;
                                            anVar.h(arVar2.j.f, i22);
                                            anVar.h(arVar2.l.f, iD5);
                                            aq aqVar26 = arVar2.m;
                                            aqVar26.f = anVar.e(aqVar26);
                                            anVar.h(arVar2.m.f, arVar2.C + i22);
                                            arVar2.b = 2;
                                            arVar2.p(i22, iD5);
                                        } else if (aqVar24 == null && aqVar18 == null && aqVar19 == null) {
                                            if (arVar2 instanceof at) {
                                                at atVar2 = (at) arVar2;
                                                if (atVar2.ai == 0) {
                                                    aqVar17.f = anVar.e(aqVar17);
                                                    aq aqVar27 = arVar2.l;
                                                    aqVar27.f = anVar.e(aqVar27);
                                                    int i23 = atVar2.ag;
                                                    int iD6 = (int) ((i23 != -1 ? i23 : atVar2.ah != -1 ? d() - atVar2.ah : d() * atVar2.af) + 0.5f);
                                                    anVar.h(arVar2.j.f, iD6);
                                                    anVar.h(arVar2.l.f, iD6);
                                                    arVar2.b = 2;
                                                    arVar2.a = 2;
                                                    arVar2.p(iD6, iD6);
                                                    arVar2.l(0, h());
                                                }
                                            } else {
                                                aqVar17.f = anVar.e(aqVar17);
                                                aq aqVar28 = arVar2.l;
                                                aqVar28.f = anVar.e(aqVar28);
                                                int i24 = arVar2.x;
                                                int iD7 = arVar2.d();
                                                anVar.h(arVar2.j.f, i24);
                                                anVar.h(arVar2.l.f, iD7 + i24);
                                                if (arVar2.C > 0 || arVar2.K == 8) {
                                                    aq aqVar29 = arVar2.m;
                                                    aqVar29.f = anVar.e(aqVar29);
                                                    anVar.h(arVar2.m.f, i24 + arVar2.C);
                                                }
                                                arVar2.b = 2;
                                            }
                                        }
                                    } else {
                                        ap apVar5 = aqVar19.f;
                                        aqVar17.f = anVar.e(aqVar17);
                                        aq aqVar30 = arVar2.l;
                                        aqVar30.f = anVar.e(aqVar30);
                                        int iA7 = (int) ((apVar5.d - arVar2.l.a()) + 0.5f);
                                        int iD8 = iA7 - arVar2.d();
                                        anVar.h(arVar2.j.f, iD8);
                                        anVar.h(arVar2.l.f, iA7);
                                        if (arVar2.C > 0 || arVar2.K == 8) {
                                            aq aqVar31 = arVar2.m;
                                            aqVar31.f = anVar.e(aqVar31);
                                            anVar.h(arVar2.m.f, arVar2.C + iD8);
                                        }
                                        arVar2.b = 2;
                                        arVar2.p(iD8, iA7);
                                    }
                                } else {
                                    int iA8 = aqVar17.a();
                                    int iD9 = arVar2.d() + iA8;
                                    aq aqVar32 = arVar2.j;
                                    aqVar32.f = anVar.e(aqVar32);
                                    aq aqVar33 = arVar2.l;
                                    aqVar33.f = anVar.e(aqVar33);
                                    anVar.h(arVar2.j.f, iA8);
                                    anVar.h(arVar2.l.f, iD9);
                                    if (arVar2.C > 0 || arVar2.K == 8) {
                                        aq aqVar34 = arVar2.m;
                                        aqVar34.f = anVar.e(aqVar34);
                                        anVar.h(arVar2.m.f, arVar2.C + iA8);
                                    }
                                    arVar2.b = 2;
                                    arVar2.p(iA8, iD9);
                                }
                            } else if (aqVar18.a == this && aqVar.a == this) {
                                int iA9 = aqVar17.a();
                                int iA10 = arVar2.l.a();
                                if (this.ae == 3) {
                                    iD = arVar2.d() + iA9;
                                } else {
                                    iA9 = (int) (iA9 + ((((d() - iA9) - iA10) - arVar2.d()) * arVar2.I) + 0.5f);
                                    iD = arVar2.d() + iA9;
                                }
                                aq aqVar35 = arVar2.j;
                                aqVar35.f = anVar.e(aqVar35);
                                aq aqVar36 = arVar2.l;
                                aqVar36.f = anVar.e(aqVar36);
                                anVar.h(arVar2.j.f, iA9);
                                anVar.h(arVar2.l.f, iD);
                                if (arVar2.C > 0 || arVar2.K == 8) {
                                    aq aqVar37 = arVar2.m;
                                    aqVar37.f = anVar.e(aqVar37);
                                    anVar.h(arVar2.m.f, arVar2.C + iA9);
                                }
                                arVar2.b = 2;
                                arVar2.p(iA9, iD);
                            } else {
                                arVar2.b = i10;
                            }
                        } else {
                            aq aqVar38 = arVar2.j;
                            aqVar38.f = anVar.e(aqVar38);
                            aq aqVar39 = arVar2.l;
                            aqVar39.f = anVar.e(aqVar39);
                            int i25 = arVar2.j.c;
                            int iD10 = d() - arVar2.l.c;
                            anVar.h(arVar2.j.f, i25);
                            anVar.h(arVar2.l.f, iD10);
                            if (arVar2.C > 0 || arVar2.K == 8) {
                                aq aqVar40 = arVar2.m;
                                aqVar40.f = anVar.e(aqVar40);
                                anVar.h(arVar2.m.f, arVar2.C + i25);
                            }
                            arVar2.p(i25, iD10);
                            arVar2.b = 2;
                        }
                    }
                    if (arVar2.b == -1) {
                        i15++;
                    }
                    if (arVar2.a == -1) {
                        i16++;
                    }
                    i14++;
                    i9 = 4;
                    i10 = 1;
                    i = 3;
                    i2 = -1;
                }
                if (i15 == 0) {
                    if (i16 == 0) {
                        z2 = true;
                    } else {
                        i4 = 0;
                    }
                    i12 = i15;
                    i13 = i16;
                    i9 = 4;
                    i10 = 1;
                    i = 3;
                    i2 = -1;
                } else {
                    i4 = i15;
                }
                if (i12 == i4 && i13 == i16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i12 = i15;
                i13 = i16;
                i9 = 4;
                i10 = 1;
                i = 3;
                i2 = -1;
            }
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < size2; i28++) {
                ar arVar3 = (ar) this.al.get(i28);
                int i29 = arVar3.a;
                if (i29 == 1 || i29 == -1) {
                    i26++;
                }
                int i30 = arVar3.b;
                if (i30 == 1 || i30 == -1) {
                    i27++;
                }
            }
            if (i26 == 0 && i27 == 0) {
                return false;
            }
            i3 = 0;
            z = false;
        } else {
            i3 = 0;
            z = true;
        }
        while (i3 < size) {
            ar arVar4 = (ar) this.al.get(i3);
            if (arVar4 instanceof as) {
                int i31 = arVar4.ad;
                int i32 = arVar4.ae;
                if (i31 == 2) {
                    i7 = 1;
                    arVar4.w(1);
                    i31 = 2;
                } else {
                    i7 = 1;
                }
                if (i32 == 2) {
                    arVar4.x(i7);
                    i32 = 2;
                }
                arVar4.y(anVar);
                if (i31 == 2) {
                    arVar4.w(2);
                }
                if (i32 == 2) {
                    arVar4.x(2);
                }
            } else {
                if (z) {
                    if (this.ad != 2 && arVar4.ad == 4) {
                        aq aqVar41 = arVar4.i;
                        aqVar41.f = anVar.e(aqVar41);
                        aq aqVar42 = arVar4.k;
                        aqVar42.f = anVar.e(aqVar42);
                        int i33 = arVar4.i.c;
                        int iH10 = h() - arVar4.k.c;
                        anVar.h(arVar4.i.f, i33);
                        anVar.h(arVar4.k.f, iH10);
                        arVar4.l(i33, iH10);
                        arVar4.a = 2;
                    }
                    if (this.ae != 2 && arVar4.ae == 4) {
                        aq aqVar43 = arVar4.j;
                        aqVar43.f = anVar.e(aqVar43);
                        aq aqVar44 = arVar4.l;
                        aqVar44.f = anVar.e(aqVar44);
                        int i34 = arVar4.j.c;
                        int iD11 = d() - arVar4.l.c;
                        anVar.h(arVar4.j.f, i34);
                        anVar.h(arVar4.l.f, iD11);
                        if (arVar4.C > 0 || arVar4.K == 8) {
                            aq aqVar45 = arVar4.m;
                            aqVar45.f = anVar.e(aqVar45);
                            anVar.h(arVar4.m.f, arVar4.C + i34);
                        }
                        arVar4.p(i34, iD11);
                        arVar4.b = 2;
                    }
                }
                arVar4.y(anVar);
            }
            i3++;
        }
        if (this.an > 0) {
            H(anVar);
        }
        if (this.ao <= 0) {
            return true;
        }
        I(anVar);
        return true;
    }

    @Override // defpackage.aw, defpackage.ar
    public final void i() {
        this.af.l();
        super.i();
    }
}
