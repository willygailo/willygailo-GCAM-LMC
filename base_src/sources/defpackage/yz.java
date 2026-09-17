package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class yz {
    public static final ys a = new ys();
    public static int b = 0;
    public static int c = 0;

    public static boolean a(yk ykVar) {
        boolean z;
        boolean z2;
        int iN = ykVar.N();
        int iO = ykVar.O();
        yk ykVar2 = ykVar.T;
        if (ykVar2 == null) {
            ykVar2 = null;
        }
        if (ykVar2 != null) {
            ykVar2.N();
        }
        if (ykVar2 != null) {
            ykVar2.O();
        }
        if (iN == 1 || ykVar.e() || iN == 2) {
            z = true;
        } else {
            if (iN == 3) {
                if (ykVar.s == 0 && ykVar.W == 0.0f && ykVar.G(0)) {
                    iN = 3;
                    z = true;
                } else {
                    iN = 3;
                }
            }
            z = iN == 3 && ykVar.s == 1 && ykVar.H(0, ykVar.j());
        }
        if (iO == 1 || ykVar.f() || iO == 2 || (iO == 3 && ykVar.t == 0 && ykVar.W == 0.0f && ykVar.G(1))) {
            z2 = true;
        } else {
            z2 = iN == 3 && ykVar.t == 1 && ykVar.H(1, ykVar.h());
        }
        if (ykVar.W > 0.0f) {
            if (z || z2) {
                return true;
            }
            z2 = false;
            z = false;
        }
        return z && z2;
    }

    public static void b(int i, yk ykVar, zl zlVar, boolean z) {
        yj yjVar;
        yj yjVar2;
        yj yjVar3;
        yj yjVar4;
        yj yjVar5;
        if (ykVar.n) {
            return;
        }
        b++;
        if (!(ykVar instanceof yl) && ykVar.K() && a(ykVar)) {
            yl.X(ykVar, zlVar, new ys());
        }
        yj yjVarL = ykVar.L(2);
        yj yjVarL2 = ykVar.L(4);
        int iA = yjVarL.a();
        int iA2 = yjVarL2.a();
        HashSet<yj> hashSet = yjVarL.a;
        float f = 0.0f;
        if (hashSet != null && yjVarL.c) {
            for (yj yjVar6 : hashSet) {
                yk ykVar2 = yjVar6.d;
                int i2 = i + 1;
                boolean zA = a(ykVar2);
                if (ykVar2.K() && zA) {
                    yl.X(ykVar2, zlVar, new ys());
                }
                if (ykVar2.N() != 3 || zA) {
                    if (ykVar2.K()) {
                        f = 0.0f;
                    } else {
                        yj yjVar7 = ykVar2.J;
                        if (yjVar6 == yjVar7 && ykVar2.L.e == null) {
                            int iB = yjVar7.b() + iA;
                            ykVar2.w(iB, ykVar2.j() + iB);
                            b(i2, ykVar2, zlVar, z);
                        } else {
                            yj yjVar8 = ykVar2.L;
                            if (yjVar6 == yjVar8 && yjVar7.e == null) {
                                int iB2 = iA - yjVar8.b();
                                ykVar2.w(iB2 - ykVar2.j(), iB2);
                                b(i2, ykVar2, zlVar, z);
                            } else if (yjVar6 == yjVar7) {
                                yj yjVar9 = yjVar8.e;
                                if (yjVar9 == null || !yjVar9.c) {
                                    f = 0.0f;
                                } else if (ykVar2.I()) {
                                    f = 0.0f;
                                } else {
                                    e(i2, zlVar, ykVar2, z);
                                    f = 0.0f;
                                }
                            }
                            f = 0.0f;
                        }
                    }
                } else if (ykVar2.N() == 3 && ykVar2.w >= 0 && ykVar2.v >= 0 && (ykVar2.ag == 8 || (ykVar2.s == 0 && ykVar2.W == f))) {
                    if (!ykVar2.I() && ((yjVar6 == (yjVar3 = ykVar2.J) && (yjVar5 = ykVar2.L.e) != null && yjVar5.c) || (yjVar6 == ykVar2.L && (yjVar4 = yjVar3.e) != null && yjVar4.c))) {
                        if (!ykVar2.I()) {
                            f(i2, ykVar, zlVar, ykVar2, z);
                        }
                    }
                }
            }
        }
        if (ykVar instanceof yn) {
            return;
        }
        HashSet<yj> hashSet2 = yjVarL2.a;
        if (hashSet2 != null && yjVarL2.c) {
            for (yj yjVar10 : hashSet2) {
                yk ykVar3 = yjVar10.d;
                int i3 = i + 1;
                boolean zA2 = a(ykVar3);
                if (ykVar3.K() && zA2) {
                    yl.X(ykVar3, zlVar, new ys());
                }
                yj yjVar11 = ykVar3.J;
                boolean z2 = false;
                if (yjVar10 == yjVar11 && (yjVar2 = ykVar3.L.e) != null && yjVar2.c) {
                    z2 = true;
                } else if (yjVar10 == ykVar3.L && (yjVar = yjVar11.e) != null && yjVar.c) {
                    z2 = true;
                }
                if (ykVar3.N() != 3 || zA2) {
                    if (!ykVar3.K()) {
                        yj yjVar12 = ykVar3.J;
                        if (yjVar10 == yjVar12 && ykVar3.L.e == null) {
                            int iB3 = yjVar12.b() + iA2;
                            ykVar3.w(iB3, ykVar3.j() + iB3);
                            b(i3, ykVar3, zlVar, z);
                        } else {
                            yj yjVar13 = ykVar3.L;
                            if (yjVar10 == yjVar13 && yjVar12.e == null) {
                                int iB4 = iA2 - yjVar13.b();
                                ykVar3.w(iB4 - ykVar3.j(), iB4);
                                b(i3, ykVar3, zlVar, z);
                            } else if (z2 && !ykVar3.I()) {
                                e(i3, zlVar, ykVar3, z);
                            }
                        }
                    }
                } else if (ykVar3.N() == 3 && ykVar3.w >= 0 && ykVar3.v >= 0) {
                    if (ykVar3.ag != 8) {
                        if (ykVar3.s == 0) {
                            if (ykVar3.W == 0.0f) {
                            }
                        }
                    }
                    if (!ykVar3.I() && z2 && !ykVar3.I()) {
                        f(i3, ykVar, zlVar, ykVar3, z);
                    }
                }
            }
        }
        ykVar.n = true;
    }

    public static void c(int i, yk ykVar, zl zlVar) {
        yj yjVar;
        yj yjVar2;
        yj yjVar3;
        yj yjVar4;
        yj yjVar5;
        yj yjVar6;
        if (ykVar.o) {
            return;
        }
        c++;
        if (!(ykVar instanceof yl) && ykVar.K() && a(ykVar)) {
            yl.X(ykVar, zlVar, new ys());
        }
        yj yjVarL = ykVar.L(3);
        yj yjVarL2 = ykVar.L(5);
        int iA = yjVarL.a();
        int iA2 = yjVarL2.a();
        HashSet<yj> hashSet = yjVarL.a;
        if (hashSet != null && yjVarL.c) {
            for (yj yjVar7 : hashSet) {
                yk ykVar2 = yjVar7.d;
                int i2 = i + 1;
                boolean zA = a(ykVar2);
                if (ykVar2.K() && zA) {
                    yl.X(ykVar2, zlVar, new ys());
                }
                if (ykVar2.O() != 3 || zA) {
                    if (!ykVar2.K()) {
                        yj yjVar8 = ykVar2.K;
                        if (yjVar7 == yjVar8 && ykVar2.M.e == null) {
                            int iB = yjVar8.b() + iA;
                            ykVar2.x(iB, ykVar2.h() + iB);
                            c(i2, ykVar2, zlVar);
                        } else {
                            yj yjVar9 = ykVar2.M;
                            if (yjVar7 == yjVar9 && yjVar9.e == null) {
                                int iB2 = iA - yjVar9.b();
                                ykVar2.x(iB2 - ykVar2.h(), iB2);
                                c(i2, ykVar2, zlVar);
                            } else if (yjVar7 == yjVar8 && (yjVar3 = yjVar9.e) != null && yjVar3.c) {
                                g(i2, zlVar, ykVar2);
                            }
                        }
                    }
                } else if (ykVar2.O() == 3 && ykVar2.z >= 0 && ykVar2.y >= 0 && (ykVar2.ag == 8 || (ykVar2.t == 0 && ykVar2.W == 0.0f))) {
                    if (!ykVar2.J() && ((yjVar7 == (yjVar4 = ykVar2.K) && (yjVar6 = ykVar2.M.e) != null && yjVar6.c) || (yjVar7 == ykVar2.M && (yjVar5 = yjVar4.e) != null && yjVar5.c))) {
                        if (!ykVar2.J()) {
                            h(i2, ykVar, zlVar, ykVar2);
                        }
                    }
                }
            }
        }
        if (ykVar instanceof yn) {
            return;
        }
        HashSet<yj> hashSet2 = yjVarL2.a;
        if (hashSet2 != null && yjVarL2.c) {
            for (yj yjVar10 : hashSet2) {
                yk ykVar3 = yjVar10.d;
                int i3 = i + 1;
                boolean zA2 = a(ykVar3);
                if (ykVar3.K() && zA2) {
                    yl.X(ykVar3, zlVar, new ys());
                }
                yj yjVar11 = ykVar3.K;
                boolean z = false;
                if (yjVar10 == yjVar11 && (yjVar2 = ykVar3.M.e) != null && yjVar2.c) {
                    z = true;
                } else if (yjVar10 == ykVar3.M && (yjVar = yjVar11.e) != null && yjVar.c) {
                    z = true;
                }
                if (ykVar3.O() != 3 || zA2) {
                    if (!ykVar3.K()) {
                        yj yjVar12 = ykVar3.K;
                        if (yjVar10 == yjVar12 && ykVar3.M.e == null) {
                            int iB3 = yjVar12.b() + iA2;
                            ykVar3.x(iB3, ykVar3.h() + iB3);
                            c(i3, ykVar3, zlVar);
                        } else {
                            yj yjVar13 = ykVar3.M;
                            if (yjVar10 == yjVar13 && yjVar12.e == null) {
                                int iB4 = iA2 - yjVar13.b();
                                ykVar3.x(iB4 - ykVar3.h(), iB4);
                                c(i3, ykVar3, zlVar);
                            } else if (z && !ykVar3.J()) {
                                g(i3, zlVar, ykVar3);
                            }
                        }
                    }
                } else if (ykVar3.O() == 3 && ykVar3.z >= 0 && ykVar3.y >= 0 && (ykVar3.ag == 8 || (ykVar3.t == 0 && ykVar3.W == 0.0f))) {
                    if (!ykVar3.J() && z && !ykVar3.J()) {
                        h(i3, ykVar, zlVar, ykVar3);
                    }
                }
            }
        }
        yj yjVarL3 = ykVar.L(6);
        if (yjVarL3.a != null && yjVarL3.c) {
            int iA3 = yjVarL3.a();
            for (yj yjVar14 : yjVarL3.a) {
                yk ykVar4 = yjVar14.d;
                int i4 = i + 1;
                boolean zA3 = a(ykVar4);
                if (ykVar4.K() && zA3) {
                    yl.X(ykVar4, zlVar, new ys());
                }
                if (ykVar4.O() != 3 || zA3) {
                    if (!ykVar4.K() && yjVar14 == ykVar4.N) {
                        int iB5 = yjVar14.b() + iA3;
                        if (ykVar4.F) {
                            int i5 = iB5 - ykVar4.aa;
                            int i6 = ykVar4.V;
                            ykVar4.Z = i5;
                            ykVar4.K.e(i5);
                            ykVar4.M.e(i5 + i6);
                            ykVar4.N.e(iB5);
                            ykVar4.m = true;
                        }
                        c(i4, ykVar4, zlVar);
                    }
                }
            }
        }
        ykVar.o = true;
    }

    public static void d(yh yhVar, zl zlVar, int i, boolean z) {
        if (yhVar.c()) {
            if (i == 0) {
                b(1, yhVar, zlVar, z);
            } else {
                c(1, yhVar, zlVar);
            }
        }
    }

    private static void e(int i, zl zlVar, yk ykVar, boolean z) {
        float f = ykVar.ad;
        int iA = ykVar.J.e.a();
        int iA2 = ykVar.L.e.a();
        int iB = ykVar.J.b() + iA;
        int iB2 = iA2 - ykVar.L.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iJ = ykVar.j();
        int i2 = (iB2 - iB) - iJ;
        if (iB > iB2) {
            i2 = (iB - iB2) - iJ;
        }
        int i3 = (i2 > 0 ? (int) ((f * i2) + 0.5f) : (int) (f * i2)) + iB;
        int i4 = i3 + iJ;
        if (iB > iB2) {
            i4 = i3 - iJ;
        }
        ykVar.w(i3, i4);
        b(i + 1, ykVar, zlVar, z);
    }

    private static void f(int i, yk ykVar, zl zlVar, yk ykVar2, boolean z) {
        float f = ykVar2.ad;
        int iA = ykVar2.J.e.a() + ykVar2.J.b();
        int iA2 = ykVar2.L.e.a() - ykVar2.L.b();
        if (iA2 >= iA) {
            int iJ = ykVar2.j();
            if (ykVar2.ag != 8) {
                int i2 = ykVar2.s;
                if (i2 == 2) {
                    iJ = (int) (ykVar2.ad * 0.5f * (ykVar instanceof yl ? ykVar.j() : ykVar.T.j()));
                } else if (i2 == 0) {
                    iJ = iA2 - iA;
                }
                iJ = Math.max(ykVar2.v, iJ);
                int i3 = ykVar2.w;
                if (i3 > 0) {
                    iJ = Math.min(i3, iJ);
                }
            }
            int i4 = iA + ((int) ((f * ((iA2 - iA) - iJ)) + 0.5f));
            ykVar2.w(i4, iJ + i4);
            b(i + 1, ykVar2, zlVar, z);
        }
    }

    private static void g(int i, zl zlVar, yk ykVar) {
        float f = ykVar.ae;
        int iA = ykVar.K.e.a();
        int iA2 = ykVar.M.e.a();
        int iB = ykVar.K.b() + iA;
        int iB2 = iA2 - ykVar.M.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iH = ykVar.h();
        int i2 = (iB2 - iB) - iH;
        if (iB > iB2) {
            i2 = (iB - iB2) - iH;
        }
        int i3 = i2 > 0 ? (int) ((f * i2) + 0.5f) : (int) (f * i2);
        int i4 = iB + i3;
        int i5 = i4 + iH;
        if (iB > iB2) {
            i4 = iB - i3;
            i5 = i4 - iH;
        }
        ykVar.x(i4, i5);
        c(i + 1, ykVar, zlVar);
    }

    private static void h(int i, yk ykVar, zl zlVar, yk ykVar2) {
        float f = ykVar2.ae;
        int iA = ykVar2.K.e.a() + ykVar2.K.b();
        int iA2 = ykVar2.M.e.a() - ykVar2.M.b();
        if (iA2 >= iA) {
            int iH = ykVar2.h();
            if (ykVar2.ag != 8) {
                int i2 = ykVar2.t;
                if (i2 == 2) {
                    iH = (int) (f * 0.5f * (ykVar instanceof yl ? ykVar.h() : ykVar.T.h()));
                } else if (i2 == 0) {
                    iH = iA2 - iA;
                }
                iH = Math.max(ykVar2.y, iH);
                int i3 = ykVar2.z;
                if (i3 > 0) {
                    iH = Math.min(i3, iH);
                }
            }
            int i4 = iA + ((int) ((f * ((iA2 - iA) - iH)) + 0.5f));
            ykVar2.x(i4, iH + i4);
            c(i + 1, ykVar2, zlVar);
        }
    }
}
