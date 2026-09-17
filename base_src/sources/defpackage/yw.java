package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class yw {
    public final yl a;
    public final yl d;
    final ArrayList f;
    public zl g;
    private final ys h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public yw(yl ylVar) {
        new ArrayList();
        this.g = null;
        this.h = new ys();
        this.f = new ArrayList();
        this.a = ylVar;
        this.d = ylVar;
    }

    private final void e(zg zgVar, int i, ArrayList arrayList) {
        for (yv yvVar : zgVar.i.j) {
            if (yvVar instanceof yx) {
                g((yx) yvVar, i, zgVar.j, arrayList, null);
            } else if (yvVar instanceof zg) {
                g(((zg) yvVar).i, i, zgVar.j, arrayList, null);
            }
        }
        for (yv yvVar2 : zgVar.j.j) {
            if (yvVar2 instanceof yx) {
                g((yx) yvVar2, i, zgVar.i, arrayList, null);
            } else if (yvVar2 instanceof zg) {
                g(((zg) yvVar2).j, i, zgVar.i, arrayList, null);
            }
        }
        if (i == 1) {
            for (yv yvVar3 : ((ze) zgVar).a.j) {
                if (yvVar3 instanceof yx) {
                    g((yx) yvVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(yk ykVar, int i, int i2, int i3, int i4) {
        ys ysVar = this.h;
        ysVar.i = i;
        ysVar.j = i3;
        ysVar.a = i2;
        ysVar.b = i4;
        this.g.a(ykVar, ysVar);
        ykVar.D(this.h.c);
        ykVar.y(this.h.d);
        ys ysVar2 = this.h;
        ykVar.F = ysVar2.f;
        ykVar.v(ysVar2.e);
    }

    private final void g(yx yxVar, int i, yx yxVar2, ArrayList arrayList, zd zdVar) {
        zg zgVar = yxVar.d;
        if (zgVar.e == null) {
            yl ylVar = this.a;
            if (zgVar == ylVar.h || zgVar == ylVar.i) {
                return;
            }
            if (zdVar == null) {
                zdVar = new zd(zgVar);
                arrayList.add(zdVar);
            }
            zgVar.e = zdVar;
            zdVar.c.add(zgVar);
            for (yv yvVar : zgVar.i.j) {
                if (yvVar instanceof yx) {
                    g((yx) yvVar, i, yxVar2, arrayList, zdVar);
                }
            }
            for (yv yvVar2 : zgVar.j.j) {
                if (yvVar2 instanceof yx) {
                    g((yx) yvVar2, i, yxVar2, arrayList, zdVar);
                }
            }
            if (i == 1 && (zgVar instanceof ze)) {
                for (yv yvVar3 : ((ze) zgVar).a.j) {
                    if (yvVar3 instanceof yx) {
                        g((yx) yvVar3, 1, yxVar2, arrayList, zdVar);
                    }
                }
            }
            Iterator it = zgVar.i.k.iterator();
            while (it.hasNext()) {
                g((yx) it.next(), i, yxVar2, arrayList, zdVar);
            }
            Iterator it2 = zgVar.j.k.iterator();
            while (it2.hasNext()) {
                g((yx) it2.next(), i, yxVar2, arrayList, zdVar);
            }
            if (i == 1 && (zgVar instanceof ze)) {
                Iterator it3 = ((ze) zgVar).a.k.iterator();
                while (it3.hasNext()) {
                    g((yx) it3.next(), 1, yxVar2, arrayList, zdVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    public final int a(yl ylVar, int i) {
        long jA;
        yx yxVar;
        yx yxVar2;
        boolean zContains;
        boolean zContains2;
        long jA2;
        yw ywVar = this;
        int size = ywVar.f.size();
        long j = 0;
        int i2 = 0;
        long jMax = 0;
        while (i2 < size) {
            zd zdVar = (zd) ywVar.f.get(i2);
            zg zgVar = zdVar.b;
            if (zgVar instanceof yu) {
                if (((yu) zgVar).g != i) {
                    jA = j;
                } else {
                    if (i == 0) {
                        yxVar = ylVar.h.i;
                    } else {
                        yxVar = ylVar.i.i;
                    }
                    if (i == 0) {
                        yxVar2 = ylVar.h.j;
                    } else {
                        yxVar2 = ylVar.i.j;
                    }
                    zContains = zgVar.i.k.contains(yxVar);
                    zContains2 = zdVar.b.j.k.contains(yxVar2);
                    jA2 = zdVar.b.a();
                    if (!zContains && zContains2) {
                        long jB = zdVar.b(zdVar.b.i, j);
                        long jA3 = zdVar.a(zdVar.b.j, j);
                        long j2 = jB - jA2;
                        zg zgVar2 = zdVar.b;
                        int i3 = zgVar2.j.e;
                        if (j2 >= (-i3)) {
                            j2 += (long) i3;
                        }
                        long j3 = zgVar2.i.e;
                        long j4 = ((-jA3) - jA2) - j3;
                        if (j4 >= j3) {
                            j4 -= j3;
                        }
                        yk ykVar = zgVar2.d;
                        float f = i == 0 ? ykVar.ad : ykVar.ae;
                        float f2 = f > 0.0f ? (long) ((j4 / f) + (j2 / (1.0f - f))) : 0L;
                        jA = (j3 + ((((long) ((f2 * f) + 0.5f)) + jA2) + ((long) ((f2 * (1.0f - f)) + 0.5f)))) - ((long) i3);
                    } else if (zContains) {
                        yx yxVar3 = zdVar.b.i;
                        jA = Math.max(zdVar.b(yxVar3, yxVar3.e), ((long) zdVar.b.i.e) + jA2);
                    } else if (zContains2) {
                        yx yxVar4 = zdVar.b.j;
                        jA = Math.max(-zdVar.a(yxVar4, yxVar4.e), ((long) (-zdVar.b.j.e)) + jA2);
                    } else {
                        zg zgVar3 = zdVar.b;
                        jA = (((long) zgVar3.i.e) + zgVar3.a()) - ((long) zdVar.b.j.e);
                    }
                }
            } else if (i == 0) {
                if (zgVar instanceof zc) {
                    if (i == 0) {
                        yxVar = ylVar.h.i;
                    } else {
                        yxVar = ylVar.i.i;
                    }
                    if (i == 0) {
                        yxVar2 = ylVar.h.j;
                    } else {
                        yxVar2 = ylVar.i.j;
                    }
                    zContains = zgVar.i.k.contains(yxVar);
                    zContains2 = zdVar.b.j.k.contains(yxVar2);
                    jA2 = zdVar.b.a();
                    if (!zContains) {
                        if (zContains) {
                            yx yxVar5 = zdVar.b.i;
                            jA = Math.max(zdVar.b(yxVar5, yxVar5.e), ((long) zdVar.b.i.e) + jA2);
                        } else if (zContains2) {
                            yx yxVar6 = zdVar.b.j;
                            jA = Math.max(-zdVar.a(yxVar6, yxVar6.e), ((long) (-zdVar.b.j.e)) + jA2);
                        } else {
                            zg zgVar4 = zdVar.b;
                            jA = (((long) zgVar4.i.e) + zgVar4.a()) - ((long) zdVar.b.j.e);
                        }
                    } else if (zContains) {
                        yx yxVar7 = zdVar.b.i;
                        jA = Math.max(zdVar.b(yxVar7, yxVar7.e), ((long) zdVar.b.i.e) + jA2);
                    } else if (zContains2) {
                        yx yxVar8 = zdVar.b.j;
                        jA = Math.max(-zdVar.a(yxVar8, yxVar8.e), ((long) (-zdVar.b.j.e)) + jA2);
                    } else {
                        zg zgVar5 = zdVar.b;
                        jA = (((long) zgVar5.i.e) + zgVar5.a()) - ((long) zdVar.b.j.e);
                    }
                } else {
                    jA = j;
                }
            } else if (zgVar instanceof ze) {
                if (i == 0) {
                    yxVar = ylVar.h.i;
                } else {
                    yxVar = ylVar.i.i;
                }
                if (i == 0) {
                    yxVar2 = ylVar.h.j;
                } else {
                    yxVar2 = ylVar.i.j;
                }
                zContains = zgVar.i.k.contains(yxVar);
                zContains2 = zdVar.b.j.k.contains(yxVar2);
                jA2 = zdVar.b.a();
                if (!zContains) {
                    if (zContains) {
                        yx yxVar9 = zdVar.b.i;
                        jA = Math.max(zdVar.b(yxVar9, yxVar9.e), ((long) zdVar.b.i.e) + jA2);
                    } else if (zContains2) {
                        yx yxVar10 = zdVar.b.j;
                        jA = Math.max(-zdVar.a(yxVar10, yxVar10.e), ((long) (-zdVar.b.j.e)) + jA2);
                    } else {
                        zg zgVar6 = zdVar.b;
                        jA = (((long) zgVar6.i.e) + zgVar6.a()) - ((long) zdVar.b.j.e);
                    }
                } else if (zContains) {
                    yx yxVar11 = zdVar.b.i;
                    jA = Math.max(zdVar.b(yxVar11, yxVar11.e), ((long) zdVar.b.i.e) + jA2);
                } else if (zContains2) {
                    yx yxVar12 = zdVar.b.j;
                    jA = Math.max(-zdVar.a(yxVar12, yxVar12.e), ((long) (-zdVar.b.j.e)) + jA2);
                } else {
                    zg zgVar7 = zdVar.b;
                    jA = (((long) zgVar7.i.e) + zgVar7.a()) - ((long) zdVar.b.j.e);
                }
            } else {
                jA = j;
            }
            jMax = Math.max(jMax, jA);
            i2++;
            ywVar = this;
            j = 0;
        }
        return (int) jMax;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.d.h.d();
        this.d.i.d();
        arrayList.add(this.d.h);
        arrayList.add(this.d.i);
        ArrayList arrayList2 = this.d.aH;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            yk ykVar = (yk) arrayList2.get(i);
            if (ykVar instanceof yn) {
                arrayList.add(new za(ykVar));
            } else {
                if (ykVar.I()) {
                    if (ykVar.f == null) {
                        ykVar.f = new yu(ykVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ykVar.f);
                } else {
                    arrayList.add(ykVar.h);
                }
                if (ykVar.J()) {
                    if (ykVar.g == null) {
                        ykVar.g = new yu(ykVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ykVar.g);
                } else {
                    arrayList.add(ykVar.i);
                }
                if (ykVar instanceof yo) {
                    arrayList.add(new zb(ykVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zg) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            zg zgVar = (zg) arrayList.get(i3);
            if (zgVar.d != this.d) {
                zgVar.b();
            }
        }
        this.f.clear();
        zd.a = 0;
        e(this.a.h, 0, this.f);
        e(this.a.i, 1, this.f);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        yy yyVar;
        ArrayList arrayList = this.a.aH;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            yk ykVar = (yk) arrayList.get(i3);
            if (!ykVar.e) {
                int[] iArr = ykVar.ap;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = ykVar.s;
                int i7 = ykVar.t;
                if (i4 == 2) {
                    i = i4;
                    z = true;
                } else if (i4 != 3) {
                    i = i4;
                    z = false;
                } else if (i6 == 1) {
                    z = true;
                    i = 3;
                } else {
                    z = false;
                    i = 3;
                }
                if (i5 == 2) {
                    i2 = i5;
                    z2 = true;
                } else if (i5 != 3) {
                    i2 = i5;
                    z2 = false;
                } else if (i7 == 1) {
                    z2 = true;
                    i2 = 3;
                } else {
                    z2 = false;
                    i2 = 3;
                }
                yy yyVar2 = ykVar.h.f;
                boolean z3 = yyVar2.i;
                yy yyVar3 = ykVar.i.f;
                boolean z4 = yyVar3.i;
                if (z3 && z4) {
                    f(ykVar, 1, yyVar2.f, 1, yyVar3.f);
                    ykVar.e = true;
                } else if (z3 && z2) {
                    f(ykVar, 1, yyVar2.f, 2, yyVar3.f);
                    if (i2 == 3) {
                        ykVar.i.f.m = ykVar.h();
                    } else {
                        ykVar.i.f.c(ykVar.h());
                        ykVar.e = true;
                    }
                } else if (z4 && z) {
                    f(ykVar, 2, yyVar2.f, 1, yyVar3.f);
                    if (i == 3) {
                        ykVar.h.f.m = ykVar.j();
                    } else {
                        ykVar.h.f.c(ykVar.j());
                        ykVar.e = true;
                    }
                }
                if (ykVar.e && (yyVar = ykVar.i.b) != null) {
                    yyVar.c(ykVar.aa);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:104:0x022f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0238  */
    /* JADX WARN: Code duplicated, block: B:109:0x0263  */
    /* JADX WARN: Code duplicated, block: B:111:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02da  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:134:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:135:0x030c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6 A[PHI: r7
      0x00b6: PHI (r7v10 int) = (r7v3 int), (r7v2 int) binds: [B:59:0x00b1, B:55:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0186  */
    /* JADX WARN: Code duplicated, block: B:84:0x0189 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0191  */
    /* JADX WARN: Code duplicated, block: B:90:0x0194  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f3  */
    public final void d(yl ylVar) {
        int iJ;
        int i;
        int iH;
        int iH2;
        int i2;
        int i3;
        yj[] yjVarArr;
        int i4;
        float f;
        ArrayList arrayList = ylVar.aH;
        int size = arrayList.size();
        char c = 0;
        int i5 = 0;
        while (i5 < size) {
            yk ykVar = (yk) arrayList.get(i5);
            int[] iArr = ykVar.ap;
            int i6 = iArr[c];
            int i7 = iArr[1];
            if (ykVar.ag == 8) {
                ykVar.e = true;
            } else {
                float f2 = ykVar.x;
                int i8 = 2;
                if (f2 < 1.0f && i6 == 3) {
                    ykVar.s = 2;
                    i6 = 3;
                }
                float f3 = ykVar.A;
                if (f3 < 1.0f && i7 == 3) {
                    ykVar.t = 2;
                    i7 = 3;
                }
                if (ykVar.W > 0.0f) {
                    if (i6 == 3 && (i7 == 2 || i7 == 1)) {
                        ykVar.s = 3;
                    } else if (i7 == 3 && (i6 == 2 || i6 == 1)) {
                        ykVar.t = 3;
                    } else if (i6 == 3 && i7 == 3) {
                        if (ykVar.s == 0) {
                            ykVar.s = 3;
                        }
                        if (ykVar.t == 0) {
                            ykVar.t = 3;
                        }
                    }
                }
                if (i6 == 3 && ykVar.s == 1 && (ykVar.J.e == null || ykVar.L.e == null)) {
                    i6 = 2;
                }
                int i9 = (i7 == 3 && ykVar.t == 1 && (ykVar.K.e == null || ykVar.M.e == null)) ? 2 : i7;
                zc zcVar = ykVar.h;
                zcVar.k = i6;
                int i10 = ykVar.s;
                zcVar.c = i10;
                ze zeVar = ykVar.i;
                zeVar.k = i9;
                int i11 = ykVar.t;
                zeVar.c = i11;
                if (i6 == 4 || i6 == 1) {
                    if (i9 != 4 || i9 == 1) {
                        i8 = i9;
                    } else if (i9 != 2) {
                        if (i6 == 3 || !(i9 == 2 || i9 == 1)) {
                            if (i9 != 3) {
                                i3 = i6;
                            } else if (i6 == 2 && i6 != 1) {
                                i3 = i6;
                            } else if (i11 == 3) {
                                if (i6 == 2) {
                                    f(ykVar, 2, 0, 2, 0);
                                }
                                int iJ2 = ykVar.j();
                                f = ykVar.W;
                                if (ykVar.X == -1) {
                                    f = 1.0f / f;
                                }
                                f(ykVar, 1, iJ2, 1, (int) ((iJ2 * f) + 0.5f));
                                ykVar.h.f.c(ykVar.j());
                                ykVar.i.f.c(ykVar.h());
                                ykVar.e = true;
                            } else if (i11 == 1) {
                                f(ykVar, i6, 0, 2, 0);
                                ykVar.i.f.m = ykVar.h();
                            } else {
                                i3 = i6;
                                if (i11 == 2) {
                                    i4 = ylVar.ap[1];
                                    if (i4 != 1 || i4 == 4) {
                                        f(ykVar, i3, ykVar.j(), 1, (int) ((f3 * ylVar.h()) + 0.5f));
                                        ykVar.h.f.c(ykVar.j());
                                        ykVar.i.f.c(ykVar.h());
                                        ykVar.e = true;
                                    }
                                } else {
                                    yjVarArr = ykVar.R;
                                    if (yjVarArr[2].e != null || yjVarArr[3].e == null) {
                                        f(ykVar, 2, 0, 3, 0);
                                        ykVar.h.f.c(ykVar.j());
                                        ykVar.i.f.c(ykVar.h());
                                        ykVar.e = true;
                                    }
                                }
                            }
                            if (i3 != 3 && i9 == 3) {
                                if (i10 == 1 || i11 == 1) {
                                    f(ykVar, 2, 0, 2, 0);
                                    ykVar.h.f.m = ykVar.j();
                                    ykVar.i.f.m = ykVar.h();
                                } else if (i11 == 2 && i10 == 2) {
                                    int[] iArr2 = ylVar.ap;
                                    if (iArr2[0] == 1 && iArr2[1] == 1) {
                                        f(ykVar, 1, (int) ((f2 * ylVar.j()) + 0.5f), 1, (int) ((f3 * ylVar.h()) + 0.5f));
                                        ykVar.h.f.c(ykVar.j());
                                        ykVar.i.f.c(ykVar.h());
                                        ykVar.e = true;
                                    }
                                }
                            }
                        } else if (i10 == 3) {
                            if (i9 == 2) {
                                f(ykVar, 2, 0, 2, 0);
                            }
                            int iH3 = ykVar.h();
                            f(ykVar, 1, (int) ((iH3 * ykVar.W) + 0.5f), 1, iH3);
                            ykVar.h.f.c(ykVar.j());
                            ykVar.i.f.c(ykVar.h());
                            ykVar.e = true;
                        } else if (i10 == 1) {
                            f(ykVar, 2, 0, i9, 0);
                            ykVar.h.f.m = ykVar.j();
                        } else if (i10 == 2) {
                            int i12 = ylVar.ap[c];
                            if (i12 == 1 || i12 == 4) {
                                f(ykVar, 1, (int) ((f2 * ylVar.j()) + 0.5f), i9, ykVar.h());
                                ykVar.h.f.c(ykVar.j());
                                ykVar.i.f.c(ykVar.h());
                                ykVar.e = true;
                            } else {
                                if (i9 != 3) {
                                    i3 = i6;
                                } else if (i6 == 2) {
                                    if (i11 == 3) {
                                        if (i6 == 2) {
                                            f(ykVar, 2, 0, 2, 0);
                                        }
                                        int iJ3 = ykVar.j();
                                        f = ykVar.W;
                                        if (ykVar.X == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(ykVar, 1, iJ3, 1, (int) ((iJ3 * f) + 0.5f));
                                        ykVar.h.f.c(ykVar.j());
                                        ykVar.i.f.c(ykVar.h());
                                        ykVar.e = true;
                                    } else if (i11 == 1) {
                                        f(ykVar, i6, 0, 2, 0);
                                        ykVar.i.f.m = ykVar.h();
                                    } else {
                                        i3 = i6;
                                        if (i11 == 2) {
                                            i4 = ylVar.ap[1];
                                            if (i4 != 1) {
                                            }
                                            f(ykVar, i3, ykVar.j(), 1, (int) ((f3 * ylVar.h()) + 0.5f));
                                            ykVar.h.f.c(ykVar.j());
                                            ykVar.i.f.c(ykVar.h());
                                            ykVar.e = true;
                                        } else {
                                            yjVarArr = ykVar.R;
                                            if (yjVarArr[2].e != null) {
                                            }
                                            f(ykVar, 2, 0, 3, 0);
                                            ykVar.h.f.c(ykVar.j());
                                            ykVar.i.f.c(ykVar.h());
                                            ykVar.e = true;
                                        }
                                    }
                                } else if (i11 == 3) {
                                    if (i6 == 2) {
                                        f(ykVar, 2, 0, 2, 0);
                                    }
                                    int iJ4 = ykVar.j();
                                    f = ykVar.W;
                                    if (ykVar.X == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(ykVar, 1, iJ4, 1, (int) ((iJ4 * f) + 0.5f));
                                    ykVar.h.f.c(ykVar.j());
                                    ykVar.i.f.c(ykVar.h());
                                    ykVar.e = true;
                                } else if (i11 == 1) {
                                    f(ykVar, i6, 0, 2, 0);
                                    ykVar.i.f.m = ykVar.h();
                                } else {
                                    i3 = i6;
                                    if (i11 == 2) {
                                        i4 = ylVar.ap[1];
                                        if (i4 != 1) {
                                        }
                                        f(ykVar, i3, ykVar.j(), 1, (int) ((f3 * ylVar.h()) + 0.5f));
                                        ykVar.h.f.c(ykVar.j());
                                        ykVar.i.f.c(ykVar.h());
                                        ykVar.e = true;
                                    } else {
                                        yjVarArr = ykVar.R;
                                        if (yjVarArr[2].e != null) {
                                        }
                                        f(ykVar, 2, 0, 3, 0);
                                        ykVar.h.f.c(ykVar.j());
                                        ykVar.i.f.c(ykVar.h());
                                        ykVar.e = true;
                                    }
                                }
                                if (i3 != 3) {
                                }
                            }
                        } else {
                            yj[] yjVarArr2 = ykVar.R;
                            if (yjVarArr2[c].e == null || yjVarArr2[1].e == null) {
                                f(ykVar, 2, 0, i9, 0);
                                ykVar.h.f.c(ykVar.j());
                                ykVar.i.f.c(ykVar.h());
                                ykVar.e = true;
                            } else {
                                if (i9 != 3) {
                                    i3 = i6;
                                } else if (i6 == 2) {
                                    if (i11 == 3) {
                                        if (i6 == 2) {
                                            f(ykVar, 2, 0, 2, 0);
                                        }
                                        int iJ5 = ykVar.j();
                                        f = ykVar.W;
                                        if (ykVar.X == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(ykVar, 1, iJ5, 1, (int) ((iJ5 * f) + 0.5f));
                                        ykVar.h.f.c(ykVar.j());
                                        ykVar.i.f.c(ykVar.h());
                                        ykVar.e = true;
                                    } else if (i11 == 1) {
                                        f(ykVar, i6, 0, 2, 0);
                                        ykVar.i.f.m = ykVar.h();
                                    } else {
                                        i3 = i6;
                                        if (i11 == 2) {
                                            i4 = ylVar.ap[1];
                                            if (i4 != 1) {
                                            }
                                            f(ykVar, i3, ykVar.j(), 1, (int) ((f3 * ylVar.h()) + 0.5f));
                                            ykVar.h.f.c(ykVar.j());
                                            ykVar.i.f.c(ykVar.h());
                                            ykVar.e = true;
                                        } else {
                                            yjVarArr = ykVar.R;
                                            if (yjVarArr[2].e != null) {
                                            }
                                            f(ykVar, 2, 0, 3, 0);
                                            ykVar.h.f.c(ykVar.j());
                                            ykVar.i.f.c(ykVar.h());
                                            ykVar.e = true;
                                        }
                                    }
                                } else if (i11 == 3) {
                                    if (i6 == 2) {
                                        f(ykVar, 2, 0, 2, 0);
                                    }
                                    int iJ6 = ykVar.j();
                                    f = ykVar.W;
                                    if (ykVar.X == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(ykVar, 1, iJ6, 1, (int) ((iJ6 * f) + 0.5f));
                                    ykVar.h.f.c(ykVar.j());
                                    ykVar.i.f.c(ykVar.h());
                                    ykVar.e = true;
                                } else if (i11 == 1) {
                                    f(ykVar, i6, 0, 2, 0);
                                    ykVar.i.f.m = ykVar.h();
                                } else {
                                    i3 = i6;
                                    if (i11 == 2) {
                                        i4 = ylVar.ap[1];
                                        if (i4 != 1) {
                                        }
                                        f(ykVar, i3, ykVar.j(), 1, (int) ((f3 * ylVar.h()) + 0.5f));
                                        ykVar.h.f.c(ykVar.j());
                                        ykVar.i.f.c(ykVar.h());
                                        ykVar.e = true;
                                    } else {
                                        yjVarArr = ykVar.R;
                                        if (yjVarArr[2].e != null) {
                                        }
                                        f(ykVar, 2, 0, 3, 0);
                                        ykVar.h.f.c(ykVar.j());
                                        ykVar.i.f.c(ykVar.h());
                                        ykVar.e = true;
                                    }
                                }
                                if (i3 != 3) {
                                }
                            }
                        }
                    }
                    iJ = ykVar.j();
                    if (i6 == 4) {
                        iJ = (ylVar.j() - ykVar.J.f) - ykVar.L.f;
                        i = 1;
                    } else {
                        i = i6;
                    }
                    iH = ykVar.h();
                    if (i8 == 4) {
                        iH2 = (ylVar.h() - ykVar.K.f) - ykVar.M.f;
                        i2 = 1;
                    } else {
                        iH2 = iH;
                        i2 = i8;
                    }
                    f(ykVar, i, iJ, i2, iH2);
                    ykVar.h.f.c(ykVar.j());
                    ykVar.i.f.c(ykVar.h());
                    ykVar.e = true;
                } else if (i6 == 2) {
                    i6 = 2;
                    if (i9 != 4) {
                        i8 = i9;
                    } else {
                        i8 = i9;
                    }
                    iJ = ykVar.j();
                    if (i6 == 4) {
                        iJ = (ylVar.j() - ykVar.J.f) - ykVar.L.f;
                        i = 1;
                    } else {
                        i = i6;
                    }
                    iH = ykVar.h();
                    if (i8 == 4) {
                        iH2 = (ylVar.h() - ykVar.K.f) - ykVar.M.f;
                        i2 = 1;
                    } else {
                        iH2 = iH;
                        i2 = i8;
                    }
                    f(ykVar, i, iJ, i2, iH2);
                    ykVar.h.f.c(ykVar.j());
                    ykVar.i.f.c(ykVar.h());
                    ykVar.e = true;
                } else if (i6 == 3) {
                    if (i9 != 3) {
                        i3 = i6;
                    } else if (i6 == 2) {
                        if (i11 == 3) {
                            if (i6 == 2) {
                                f(ykVar, 2, 0, 2, 0);
                            }
                            int iJ7 = ykVar.j();
                            f = ykVar.W;
                            if (ykVar.X == -1) {
                                f = 1.0f / f;
                            }
                            f(ykVar, 1, iJ7, 1, (int) ((iJ7 * f) + 0.5f));
                            ykVar.h.f.c(ykVar.j());
                            ykVar.i.f.c(ykVar.h());
                            ykVar.e = true;
                        } else if (i11 == 1) {
                            f(ykVar, i6, 0, 2, 0);
                            ykVar.i.f.m = ykVar.h();
                        } else {
                            i3 = i6;
                            if (i11 == 2) {
                                i4 = ylVar.ap[1];
                                if (i4 != 1) {
                                }
                                f(ykVar, i3, ykVar.j(), 1, (int) ((f3 * ylVar.h()) + 0.5f));
                                ykVar.h.f.c(ykVar.j());
                                ykVar.i.f.c(ykVar.h());
                                ykVar.e = true;
                            } else {
                                yjVarArr = ykVar.R;
                                if (yjVarArr[2].e != null) {
                                }
                                f(ykVar, 2, 0, 3, 0);
                                ykVar.h.f.c(ykVar.j());
                                ykVar.i.f.c(ykVar.h());
                                ykVar.e = true;
                            }
                        }
                    } else if (i11 == 3) {
                        if (i6 == 2) {
                            f(ykVar, 2, 0, 2, 0);
                        }
                        int iJ8 = ykVar.j();
                        f = ykVar.W;
                        if (ykVar.X == -1) {
                            f = 1.0f / f;
                        }
                        f(ykVar, 1, iJ8, 1, (int) ((iJ8 * f) + 0.5f));
                        ykVar.h.f.c(ykVar.j());
                        ykVar.i.f.c(ykVar.h());
                        ykVar.e = true;
                    } else if (i11 == 1) {
                        f(ykVar, i6, 0, 2, 0);
                        ykVar.i.f.m = ykVar.h();
                    } else {
                        i3 = i6;
                        if (i11 == 2) {
                            i4 = ylVar.ap[1];
                            if (i4 != 1) {
                            }
                            f(ykVar, i3, ykVar.j(), 1, (int) ((f3 * ylVar.h()) + 0.5f));
                            ykVar.h.f.c(ykVar.j());
                            ykVar.i.f.c(ykVar.h());
                            ykVar.e = true;
                        } else {
                            yjVarArr = ykVar.R;
                            if (yjVarArr[2].e != null) {
                            }
                            f(ykVar, 2, 0, 3, 0);
                            ykVar.h.f.c(ykVar.j());
                            ykVar.i.f.c(ykVar.h());
                            ykVar.e = true;
                        }
                    }
                    if (i3 != 3) {
                    }
                } else {
                    if (i9 != 3) {
                        i3 = i6;
                    } else if (i6 == 2) {
                        if (i11 == 3) {
                            if (i6 == 2) {
                                f(ykVar, 2, 0, 2, 0);
                            }
                            int iJ9 = ykVar.j();
                            f = ykVar.W;
                            if (ykVar.X == -1) {
                                f = 1.0f / f;
                            }
                            f(ykVar, 1, iJ9, 1, (int) ((iJ9 * f) + 0.5f));
                            ykVar.h.f.c(ykVar.j());
                            ykVar.i.f.c(ykVar.h());
                            ykVar.e = true;
                        } else if (i11 == 1) {
                            f(ykVar, i6, 0, 2, 0);
                            ykVar.i.f.m = ykVar.h();
                        } else {
                            i3 = i6;
                            if (i11 == 2) {
                                i4 = ylVar.ap[1];
                                if (i4 != 1) {
                                }
                                f(ykVar, i3, ykVar.j(), 1, (int) ((f3 * ylVar.h()) + 0.5f));
                                ykVar.h.f.c(ykVar.j());
                                ykVar.i.f.c(ykVar.h());
                                ykVar.e = true;
                            } else {
                                yjVarArr = ykVar.R;
                                if (yjVarArr[2].e != null) {
                                }
                                f(ykVar, 2, 0, 3, 0);
                                ykVar.h.f.c(ykVar.j());
                                ykVar.i.f.c(ykVar.h());
                                ykVar.e = true;
                            }
                        }
                    } else if (i11 == 3) {
                        if (i6 == 2) {
                            f(ykVar, 2, 0, 2, 0);
                        }
                        int iJ10 = ykVar.j();
                        f = ykVar.W;
                        if (ykVar.X == -1) {
                            f = 1.0f / f;
                        }
                        f(ykVar, 1, iJ10, 1, (int) ((iJ10 * f) + 0.5f));
                        ykVar.h.f.c(ykVar.j());
                        ykVar.i.f.c(ykVar.h());
                        ykVar.e = true;
                    } else if (i11 == 1) {
                        f(ykVar, i6, 0, 2, 0);
                        ykVar.i.f.m = ykVar.h();
                    } else {
                        i3 = i6;
                        if (i11 == 2) {
                            i4 = ylVar.ap[1];
                            if (i4 != 1) {
                            }
                            f(ykVar, i3, ykVar.j(), 1, (int) ((f3 * ylVar.h()) + 0.5f));
                            ykVar.h.f.c(ykVar.j());
                            ykVar.i.f.c(ykVar.h());
                            ykVar.e = true;
                        } else {
                            yjVarArr = ykVar.R;
                            if (yjVarArr[2].e != null) {
                            }
                            f(ykVar, 2, 0, 3, 0);
                            ykVar.h.f.c(ykVar.j());
                            ykVar.i.f.c(ykVar.h());
                            ykVar.e = true;
                        }
                    }
                    if (i3 != 3) {
                    }
                }
            }
            i5++;
            c = 0;
        }
    }
}
