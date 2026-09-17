package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class yk {
    public float A;
    int B;
    float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final yj J;
    public final yj K;
    public final yj L;
    public final yj M;
    public final yj N;
    final yj O;
    final yj P;
    public final yj Q;
    public final yj[] R;
    protected final ArrayList S;
    public yk T;
    int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int aa;
    public int ab;
    public int ac;
    public float ad;
    public float ae;
    public Object af;
    public int ag;
    public String ah;
    public int ai;
    public int aj;
    public final float[] ak;
    public final yk[] al;
    public final yk[] am;
    public int an;
    public int ao;
    public final int[] ap;
    private boolean b;
    private final boolean[] c;
    public yu f;
    public yu g;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;
    public boolean e = false;
    public zc h = null;
    public ze i = null;
    public final boolean[] j = {true, true};
    private boolean a = true;
    public int k = -1;
    public int l = -1;

    public yk() {
        new HashMap();
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = 0.0f;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        yj yjVar = new yj(this, 2);
        this.J = yjVar;
        yj yjVar2 = new yj(this, 3);
        this.K = yjVar2;
        yj yjVar3 = new yj(this, 4);
        this.L = yjVar3;
        yj yjVar4 = new yj(this, 5);
        this.M = yjVar4;
        yj yjVar5 = new yj(this, 6);
        this.N = yjVar5;
        yj yjVar6 = new yj(this, 8);
        this.O = yjVar6;
        yj yjVar7 = new yj(this, 9);
        this.P = yjVar7;
        yj yjVar8 = new yj(this, 7);
        this.Q = yjVar8;
        this.R = new yj[]{yjVar, yjVar3, yjVar2, yjVar4, yjVar5, yjVar8};
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        this.c = new boolean[2];
        this.ap = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ad = 0.5f;
        this.ae = 0.5f;
        this.ag = 0;
        this.ah = null;
        this.ai = 0;
        this.aj = 0;
        this.ak = new float[]{-1.0f, -1.0f};
        this.al = new yk[]{null, null};
        this.am = new yk[]{null, null};
        this.an = -1;
        this.ao = -1;
        arrayList.add(yjVar);
        arrayList.add(yjVar2);
        arrayList.add(yjVar3);
        arrayList.add(yjVar4);
        arrayList.add(yjVar6);
        arrayList.add(yjVar7);
        arrayList.add(yjVar8);
        arrayList.add(yjVar5);
    }

    private final boolean a(int i) {
        yj yjVar;
        yj yjVar2;
        int i2 = i + i;
        yj[] yjVarArr = this.R;
        yj yjVar3 = yjVarArr[i2];
        yj yjVar4 = yjVar3.e;
        return (yjVar4 == null || yjVar4.e == yjVar3 || (yjVar2 = (yjVar = yjVarArr[i2 + 1]).e) == null || yjVar2.e != yjVar) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014f  */
    /* JADX WARN: Code duplicated, block: B:102:0x015a  */
    /* JADX WARN: Code duplicated, block: B:104:0x015e  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:278:0x04b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:279:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:282:0x04bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:283:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:288:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:291:0x04d2 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:294:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:297:0x04df A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:300:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:301:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:303:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:305:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:312:0x0501  */
    /* JADX WARN: Code duplicated, block: B:313:0x0503  */
    /* JADX WARN: Code duplicated, block: B:316:0x0515  */
    /* JADX WARN: Code duplicated, block: B:318:0x051a  */
    /* JADX WARN: Code duplicated, block: B:319:0x051f  */
    /* JADX WARN: Code duplicated, block: B:321:0x0522  */
    /* JADX WARN: Code duplicated, block: B:322:0x0527  */
    /* JADX WARN: Code duplicated, block: B:331:0x0543  */
    /* JADX WARN: Code duplicated, block: B:74:0x0108  */
    /* JADX WARN: Code duplicated, block: B:76:0x010b  */
    /* JADX WARN: Code duplicated, block: B:78:0x010f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:86:0x0124  */
    /* JADX WARN: Code duplicated, block: B:90:0x012b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0136  */
    /* JADX WARN: Code duplicated, block: B:95:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x013c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0143  */
    /* JADX WARN: Code duplicated, block: B:99:0x0147  */
    private final void c(ya yaVar, boolean z, boolean z2, boolean z3, boolean z4, yf yfVar, yf yfVar2, int i, boolean z5, yj yjVar, yj yjVar2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        int i12;
        yf yfVarB;
        yf yfVarB2;
        yj yjVar3;
        yf yfVar3;
        yf yfVar4;
        boolean z14;
        int i13;
        int i14;
        int i15;
        boolean z15;
        boolean z16;
        boolean z17;
        int i16;
        int i17;
        boolean z18;
        yf yfVar5;
        yf yfVar6;
        boolean z19;
        yk ykVar;
        int iMax;
        yf yfVar7;
        int iB;
        boolean z20;
        int i18;
        int iMin;
        int i19;
        yf yfVar8;
        int i20;
        boolean z21;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z22;
        boolean z23;
        boolean z24;
        int i27;
        int i28 = i8;
        int i29 = i9;
        yf yfVarB3 = yaVar.b(yjVar);
        yf yfVarB4 = yaVar.b(yjVar2);
        yf yfVarB5 = yaVar.b(yjVar.e);
        yf yfVarB6 = yaVar.b(yjVar2.e);
        boolean zH = yjVar.h();
        boolean zH2 = yjVar2.h();
        boolean zH3 = this.Q.h();
        int i30 = zH ? 1 : 0;
        if (zH2) {
            i30++;
        }
        if (zH3) {
            i30++;
        }
        int i31 = i30;
        int i32 = true == z6 ? 3 : i6;
        int i33 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i33) {
            case 2:
                if (i32 != 4) {
                    z12 = true;
                    break;
                }
            case 0:
            case 1:
            case 3:
                z12 = false;
                break;
            default:
                z12 = false;
                break;
        }
        int i34 = this.k;
        if (i34 == -1 || !z) {
            i34 = i3;
        } else {
            this.k = -1;
            z12 = false;
        }
        int i35 = i34;
        int i36 = this.l;
        if (i36 == -1 || z) {
            i36 = i35;
        } else {
            this.l = -1;
            z12 = false;
        }
        int i37 = this.ag;
        int i38 = i36;
        boolean z25 = (i37 != 8) & z12;
        int iMin2 = i37 == 8 ? 0 : i38;
        if (z11) {
            if (!zH && !zH2 && !zH3) {
                yaVar.f(yfVarB3, i2);
            } else if (zH && !zH2) {
                yaVar.m(yfVarB3, yfVarB5, yjVar.b(), 8);
            }
        }
        if (z25) {
            i10 = i31;
            if (i10 == 2 || z6) {
                if (i28 == -2) {
                    i28 = iMin2;
                }
                if (i29 == -2) {
                    i29 = iMin2;
                }
                if (iMin2 > 0 && i32 != 1) {
                    iMin2 = 0;
                }
                if (i28 > 0) {
                    yaVar.g(yfVarB4, yfVarB3, i28, 8);
                    iMin2 = Math.max(iMin2, i28);
                }
                if (i29 > 0) {
                    if (z2 || i32 != 1) {
                        yaVar.h(yfVarB4, yfVarB3, i29, 8);
                        i11 = i32;
                    } else {
                        i11 = 1;
                    }
                    iMin2 = Math.min(iMin2, i29);
                } else {
                    i11 = i32;
                }
                if (i32 == 1) {
                    if (z2) {
                        yaVar.m(yfVarB4, yfVarB3, iMin2, 8);
                    } else if (z8) {
                        yaVar.m(yfVarB4, yfVarB3, iMin2, 5);
                        yaVar.h(yfVarB4, yfVarB3, iMin2, 8);
                    } else {
                        yaVar.m(yfVarB4, yfVarB3, iMin2, 5);
                        yaVar.h(yfVarB4, yfVarB3, iMin2, 8);
                    }
                    z13 = z4;
                    i32 = i11;
                } else if (i32 == 2) {
                    i12 = yjVar.i;
                    if (i12 != 3 || i12 == 5) {
                        yfVarB = yaVar.b(this.T.L(3));
                        yfVarB2 = yaVar.b(this.T.L(5));
                    } else {
                        yfVarB = yaVar.b(this.T.L(2));
                        yfVarB2 = yaVar.b(this.T.L(4));
                    }
                    xy xyVarA = yaVar.a();
                    xyVarA.g(yfVarB4, yfVarB3, yfVarB2, yfVarB, f2);
                    yaVar.e(xyVarA);
                    z25 = !z2;
                    z13 = z4;
                    i32 = i11;
                } else {
                    i32 = i11;
                    z13 = true;
                }
            } else {
                if (i32 != 1) {
                    if (i32 == 0) {
                        i32 = 0;
                    } else {
                        if (i28 == -2) {
                            i28 = iMin2;
                        }
                        if (i29 == -2) {
                            i29 = iMin2;
                        }
                        if (iMin2 > 0) {
                            iMin2 = 0;
                        }
                        if (i28 > 0) {
                            yaVar.g(yfVarB4, yfVarB3, i28, 8);
                            iMin2 = Math.max(iMin2, i28);
                        }
                        if (i29 > 0) {
                            if (z2) {
                                yaVar.h(yfVarB4, yfVarB3, i29, 8);
                                i11 = i32;
                            } else {
                                yaVar.h(yfVarB4, yfVarB3, i29, 8);
                                i11 = i32;
                            }
                            iMin2 = Math.min(iMin2, i29);
                        } else {
                            i11 = i32;
                        }
                        if (i32 == 1) {
                            if (z2) {
                                yaVar.m(yfVarB4, yfVarB3, iMin2, 8);
                            } else if (z8) {
                                yaVar.m(yfVarB4, yfVarB3, iMin2, 5);
                                yaVar.h(yfVarB4, yfVarB3, iMin2, 8);
                            } else {
                                yaVar.m(yfVarB4, yfVarB3, iMin2, 5);
                                yaVar.h(yfVarB4, yfVarB3, iMin2, 8);
                            }
                            z13 = z4;
                            i32 = i11;
                        } else if (i32 == 2) {
                            i12 = yjVar.i;
                            if (i12 != 3) {
                            }
                            yfVarB = yaVar.b(this.T.L(3));
                            yfVarB2 = yaVar.b(this.T.L(5));
                            xy xyVarA2 = yaVar.a();
                            xyVarA2.g(yfVarB4, yfVarB3, yfVarB2, yfVarB, f2);
                            yaVar.e(xyVarA2);
                            z25 = !z2;
                            z13 = z4;
                            i32 = i11;
                        } else {
                            i32 = i11;
                            z13 = true;
                        }
                    }
                }
                int iMax2 = Math.max(i28, iMin2);
                if (i29 > 0) {
                    iMax2 = Math.min(i29, iMax2);
                }
                yaVar.m(yfVarB4, yfVarB3, iMax2, 8);
                z13 = z4;
                z25 = false;
            }
        } else {
            if (z5) {
                yaVar.m(yfVarB4, yfVarB3, 0, 3);
                if (i4 > 0) {
                    i27 = 8;
                    yaVar.g(yfVarB4, yfVarB3, i4, 8);
                } else {
                    i27 = 8;
                }
                if (i5 < Integer.MAX_VALUE) {
                    yaVar.h(yfVarB4, yfVarB3, i5, i27);
                }
            } else {
                yaVar.m(yfVarB4, yfVarB3, iMin2, 8);
            }
            z13 = z4;
            i10 = i31;
        }
        if (!z11 || z8) {
            int i39 = 0;
            char c = 1;
            if (i10 < 2 && z2 && z13) {
                yaVar.g(yfVarB3, yfVar, i39, 8);
                boolean z26 = z || this.N.e == null;
                if (!z && (yjVar3 = this.N.e) != null) {
                    yk ykVar2 = yjVar3.d;
                    if (ykVar2.W == 0.0f) {
                        return;
                    }
                    int[] iArr = ykVar2.ap;
                    if (iArr[i39] != 3 || iArr[c] != 3) {
                        return;
                    }
                } else if (!z26) {
                    return;
                }
                yaVar.g(yfVar2, yfVarB4, i39, 8);
                return;
            }
            return;
        }
        if (!zH && !zH2 && !zH3) {
            z14 = z2;
            yfVar4 = yfVarB4;
            z13 = z13;
            i13 = 5;
        } else if (zH && !zH2) {
            i13 = (z2 && (yjVar.e.d instanceof yh)) ? 8 : 5;
            z14 = z2;
            yfVar4 = yfVarB4;
            z13 = z13;
            yfVar3 = yfVarB6;
        } else if (zH || !zH2) {
            yfVar3 = yfVarB6;
            if (zH && zH2) {
                yk ykVar3 = yjVar.e.d;
                yk ykVar4 = yjVar2.e.d;
                yk ykVar5 = this.T;
                int i40 = 6;
                if (z25) {
                    if (i32 == 0) {
                        if (i29 != 0 || i28 != 0) {
                            i24 = i28;
                            i25 = 5;
                            i26 = 5;
                            z22 = true;
                            z23 = false;
                            z24 = true;
                        } else {
                            if (yfVarB5.g && yfVar3.g) {
                                yaVar.m(yfVarB3, yfVarB5, yjVar.b(), 8);
                                yaVar.m(yfVarB4, yfVar3, -yjVar2.b(), 8);
                                return;
                            }
                            i25 = 8;
                            i26 = 8;
                            i24 = 0;
                            z22 = false;
                            z23 = true;
                            z24 = false;
                        }
                        int i41 = i25;
                        if ((ykVar3 instanceof yh) || (ykVar4 instanceof yh)) {
                            i14 = i41;
                            yfVar2 = yfVar2;
                            z13 = z13;
                            z16 = z23;
                            z17 = z24;
                            i16 = i32;
                            i28 = i24;
                            z15 = z22;
                            i17 = 6;
                            i15 = 4;
                        } else {
                            i14 = i41;
                            z13 = z13;
                            z16 = z23;
                            z17 = z24;
                            i16 = i32;
                            i28 = i24;
                            z15 = z22;
                            i17 = 6;
                            i15 = i26;
                            yfVar2 = yfVar2;
                        }
                    } else {
                        if (i32 == 2) {
                            if ((ykVar3 instanceof yh) || (ykVar4 instanceof yh)) {
                                i14 = 5;
                            } else {
                                yfVar2 = yfVar2;
                                i28 = i28;
                                z13 = z13;
                                i14 = 5;
                                i15 = 5;
                            }
                            z15 = true;
                            z16 = false;
                            z17 = true;
                            i16 = i32;
                            i17 = 6;
                        } else if (i32 == 1) {
                            i14 = 8;
                        } else if (i32 == 3) {
                            if (this.B == -1) {
                                if (z9) {
                                    yfVar2 = yfVar2;
                                    i28 = i28;
                                    z13 = z13;
                                    i14 = 8;
                                    i17 = z2 ? 5 : 4;
                                } else {
                                    yfVar2 = yfVar2;
                                    i28 = i28;
                                    z13 = z13;
                                    i14 = 8;
                                    i17 = 8;
                                }
                            } else if (z6) {
                                if (i7 == 2 || i7 == 1) {
                                    i22 = 4;
                                    i23 = 5;
                                } else {
                                    i22 = 5;
                                    i23 = 8;
                                }
                                i28 = i28;
                                i15 = i22;
                                z13 = z13;
                                i14 = i23;
                                i17 = 6;
                                i16 = 3;
                                z15 = true;
                                z16 = true;
                                z17 = true;
                                yfVar2 = yfVar2;
                            } else {
                                if (i29 > 0) {
                                    yfVar2 = yfVar2;
                                    i28 = i28;
                                    z13 = z13;
                                    i14 = 5;
                                    i17 = 6;
                                } else if (i29 == 0 && i28 == 0) {
                                    if (z9) {
                                        i14 = (ykVar3 == ykVar5 || ykVar4 == ykVar5) ? 5 : 4;
                                        i17 = 6;
                                        i16 = 3;
                                        i15 = 4;
                                    } else {
                                        i14 = 5;
                                        i17 = 6;
                                        i16 = 3;
                                        i15 = 8;
                                    }
                                    z15 = true;
                                    i28 = 0;
                                } else {
                                    yfVar2 = yfVar2;
                                    i28 = i28;
                                    z13 = z13;
                                    i14 = 5;
                                    i17 = 6;
                                    i16 = 3;
                                    i15 = 4;
                                    z15 = true;
                                }
                                z16 = true;
                                z17 = true;
                            }
                            i16 = 3;
                            i15 = 5;
                            z15 = true;
                            z16 = true;
                            z17 = true;
                        } else {
                            yfVar2 = yfVar2;
                            i28 = i28;
                            z13 = z13;
                            i14 = 5;
                            i15 = 4;
                            z15 = false;
                            z16 = false;
                            z17 = false;
                            i16 = i32;
                            i17 = 6;
                        }
                        i15 = 4;
                        z15 = true;
                        z16 = false;
                        z17 = true;
                        i16 = i32;
                        i17 = 6;
                    }
                } else {
                    if (yfVarB5.g && yfVar3.g) {
                        yaVar.d(yfVarB3, yfVarB5, yjVar.b(), f, yfVar3, yfVarB4, yjVar2.b(), 8);
                        if (z2 && z13) {
                            int iB2 = yjVar2.e != null ? yjVar2.b() : 0;
                            if (yfVar3 != yfVar2) {
                                yaVar.g(yfVar2, yfVarB4, iB2, 5);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    yfVar2 = yfVar2;
                    i28 = i28;
                    z13 = z13;
                    i14 = 5;
                    i15 = 4;
                    z15 = true;
                    z16 = false;
                    z17 = true;
                    i16 = i32;
                    i17 = 6;
                }
                if (z17 && yfVarB5 == yfVar3 && ykVar3 != ykVar5) {
                    z18 = false;
                    z17 = false;
                } else {
                    z18 = true;
                }
                if (z15) {
                    if (z25 || z7 || z9) {
                        yfVar8 = yfVar;
                    } else {
                        yfVar8 = yfVar;
                        if (yfVarB5 == yfVar8 && yfVar3 == yfVar2) {
                            z14 = false;
                            i21 = 8;
                            z21 = false;
                            i20 = 8;
                        }
                        yfVar5 = yfVarB4;
                        yfVar6 = yfVarB5;
                        yaVar.d(yfVarB3, yfVarB5, yjVar.b(), f, yfVar3, yfVar5, yjVar2.b(), i20);
                        i14 = i21;
                        z19 = z21;
                    }
                    z14 = z2;
                    i20 = i17;
                    z21 = z18;
                    i21 = i14;
                    yfVar5 = yfVarB4;
                    yfVar6 = yfVarB5;
                    yaVar.d(yfVarB3, yfVarB5, yjVar.b(), f, yfVar3, yfVar5, yjVar2.b(), i20);
                    i14 = i21;
                    z19 = z21;
                } else {
                    yfVar5 = yfVarB4;
                    yfVar6 = yfVarB5;
                    z14 = z2;
                    z19 = z18;
                }
                if (this.ag == 8 && !yjVar2.g()) {
                    return;
                }
                if (z17) {
                    if (z14 && yfVar6 != yfVar3 && !z25 && ((ykVar3 instanceof yh) || (ykVar4 instanceof yh))) {
                        i14 = 6;
                    }
                    yaVar.g(yfVarB3, yfVar6, yjVar.b(), i14);
                    yfVar4 = yfVar5;
                    yaVar.h(yfVar4, yfVar3, -yjVar2.b(), i14);
                } else {
                    yfVar4 = yfVar5;
                }
                if (!z14 || !z10 || (ykVar3 instanceof yh) || (ykVar4 instanceof yh)) {
                    ykVar = ykVar5;
                } else {
                    ykVar = ykVar5;
                    if (ykVar4 != ykVar) {
                        i14 = 6;
                        iMax = 6;
                        z19 = true;
                    }
                    if (z19) {
                        if (z16) {
                            z20 = z9;
                            if (z20 || z3) {
                                if (ykVar3 != ykVar && ykVar4 != ykVar) {
                                    i40 = iMax;
                                }
                                if ((ykVar3 instanceof yn) || (ykVar4 instanceof yn)) {
                                    i40 = 5;
                                }
                                if ((ykVar3 instanceof yh) || (ykVar4 instanceof yh)) {
                                    i40 = 5;
                                }
                                if (true == z20) {
                                    i19 = 5;
                                } else {
                                    i19 = i40;
                                }
                                iMax = Math.max(i19, iMax);
                            }
                        } else {
                            z20 = z9;
                        }
                        if (z14) {
                            iMin = Math.min(i14, iMax);
                            if (z6 || z20 || !(ykVar3 == ykVar || ykVar4 == ykVar)) {
                                i18 = iMin;
                            } else {
                                i18 = 4;
                            }
                        } else {
                            i18 = iMax;
                        }
                        yaVar.m(yfVarB3, yfVar6, yjVar.b(), i18);
                        yaVar.m(yfVar4, yfVar3, -yjVar2.b(), i18);
                    }
                    if (z14) {
                        yfVar7 = yfVarB3;
                        if (yfVar == yfVar6) {
                            iB = yjVar.b();
                        } else {
                            iB = 0;
                        }
                        if (yfVar6 != yfVar) {
                            yaVar.g(yfVar7, yfVar, iB, 5);
                        }
                    } else {
                        yfVar7 = yfVarB3;
                    }
                    if (!z14 && z25 && i4 == 0 && i28 == 0) {
                        if (i16 == 3) {
                            yaVar.g(yfVar4, yfVar7, 0, 8);
                            i13 = 5;
                        } else {
                            yaVar.g(yfVar4, yfVar7, 0, 5);
                        }
                    }
                }
                iMax = i15;
                if (z19) {
                    if (z16) {
                        z20 = z9;
                        if (z20) {
                            if (ykVar3 != ykVar) {
                                i40 = iMax;
                            }
                            if (ykVar3 instanceof yn) {
                                i40 = 5;
                            } else {
                                i40 = 5;
                            }
                            if (ykVar3 instanceof yh) {
                                i40 = 5;
                            } else {
                                i40 = 5;
                            }
                            if (true == z20) {
                                i19 = 5;
                            } else {
                                i19 = i40;
                            }
                            iMax = Math.max(i19, iMax);
                        } else {
                            if (ykVar3 != ykVar) {
                                i40 = iMax;
                            }
                            if (ykVar3 instanceof yn) {
                                i40 = 5;
                            } else {
                                i40 = 5;
                            }
                            if (ykVar3 instanceof yh) {
                                i40 = 5;
                            } else {
                                i40 = 5;
                            }
                            if (true == z20) {
                                i19 = 5;
                            } else {
                                i19 = i40;
                            }
                            iMax = Math.max(i19, iMax);
                        }
                    } else {
                        z20 = z9;
                    }
                    if (z14) {
                        iMin = Math.min(i14, iMax);
                        if (z6) {
                            i18 = iMin;
                        } else {
                            i18 = iMin;
                        }
                    } else {
                        i18 = iMax;
                    }
                    yaVar.m(yfVarB3, yfVar6, yjVar.b(), i18);
                    yaVar.m(yfVar4, yfVar3, -yjVar2.b(), i18);
                }
                if (z14) {
                    yfVar7 = yfVarB3;
                    if (yfVar == yfVar6) {
                        iB = yjVar.b();
                    } else {
                        iB = 0;
                    }
                    if (yfVar6 != yfVar) {
                        yaVar.g(yfVar7, yfVar, iB, 5);
                    }
                } else {
                    yfVar7 = yfVarB3;
                }
                i13 = !z14 ? 5 : 5;
            } else {
                yfVar4 = yfVarB4;
                z13 = z13;
                z14 = z2;
                i13 = 5;
            }
        } else {
            yaVar.m(yfVarB4, yfVar3, -yjVar2.b(), 8);
            if (z2) {
                yfVar3 = yfVarB6;
                yaVar.g(yfVarB3, yfVar, 0, 5);
            } else {
                yfVar3 = yfVarB6;
            }
            z14 = z2;
            yfVar4 = yfVarB4;
            z13 = z13;
            i13 = 5;
        }
        if (!z14) {
            yfVar3 = yfVarB6;
            return;
        }
        if (z13) {
            int iB3 = yjVar2.e != null ? yjVar2.b() : 0;
            if (yfVar3 != yfVar2) {
                yaVar.g(yfVar2, yfVar4, iB3, i13);
            }
        }
    }

    public final void A(int i, int i2) {
        this.H = i;
        this.I = i2;
        this.a = false;
    }

    public final void B(int i) {
        if (i < 0) {
            this.ac = 0;
        } else {
            this.ac = i;
        }
    }

    public final void C(int i) {
        if (i < 0) {
            this.ab = 0;
        } else {
            this.ab = i;
        }
    }

    public final void D(int i) {
        this.U = i;
        int i2 = this.ab;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void E(boolean z, boolean z2) {
        int i;
        int i2;
        zc zcVar = this.h;
        boolean z3 = z & zcVar.h;
        ze zeVar = this.i;
        boolean z4 = z2 & zeVar.h;
        int i3 = zcVar.i.f;
        int i4 = zeVar.i.f;
        int i5 = zcVar.j.f;
        int i6 = zeVar.j.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.ag == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        if (z3) {
            if (this.ap[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.ab;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (this.ap[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.ac;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    final boolean F() {
        return (this instanceof yq) || (this instanceof yn);
    }

    public final boolean G(int i) {
        if (i == 0) {
            return (this.J.e != null ? 1 : 0) + (this.L.e != null ? 1 : 0) < 2;
        }
        return ((this.K.e != null ? 1 : 0) + (this.M.e != null ? 1 : 0)) + (this.N.e != null ? 1 : 0) < 2;
    }

    public final boolean H(int i, int i2) {
        yj yjVar;
        yj yjVar2;
        if (i == 0) {
            yj yjVar3 = this.J.e;
            return yjVar3 != null && yjVar3.c && (yjVar2 = this.L.e) != null && yjVar2.c && (yjVar2.a() - this.L.b()) - (this.J.e.a() + this.J.b()) >= i2;
        }
        yj yjVar4 = this.K.e;
        return yjVar4 != null && yjVar4.c && (yjVar = this.M.e) != null && yjVar.c && (yjVar.a() - this.M.b()) - (this.K.e.a() + this.K.b()) >= i2;
        return false;
    }

    public final boolean I() {
        yj yjVar = this.J;
        yj yjVar2 = yjVar.e;
        if (yjVar2 != null && yjVar2.e == yjVar) {
            return true;
        }
        yj yjVar3 = this.L;
        yj yjVar4 = yjVar3.e;
        return yjVar4 != null && yjVar4.e == yjVar3;
    }

    public final boolean J() {
        yj yjVar = this.K;
        yj yjVar2 = yjVar.e;
        if (yjVar2 != null && yjVar2.e == yjVar) {
            return true;
        }
        yj yjVar3 = this.M;
        yj yjVar4 = yjVar3.e;
        return yjVar4 != null && yjVar4.e == yjVar3;
    }

    public final boolean K() {
        return this.a && this.ag != 8;
    }

    public yj L(int i) {
        switch (i - 1) {
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            default:
                return this.Q;
        }
    }

    public final int M(int i) {
        return i == 0 ? N() : O();
    }

    public final int N() {
        return this.ap[0];
    }

    public final int O() {
        return this.ap[1];
    }

    public final void P(int i, yk ykVar, int i2, int i3, int i4) {
        L(i).j(ykVar.L(i2), i3, i4);
    }

    public final void Q(int i) {
        this.ap[0] = i;
    }

    public final void R(int i) {
        this.ap[1] = i;
    }

    public void S(boolean z) {
        int i;
        ze zeVar;
        zc zcVar;
        int iO = ya.o(this.J);
        int iO2 = ya.o(this.K);
        int iO3 = ya.o(this.L);
        int iO4 = ya.o(this.M);
        if (z && (zcVar = this.h) != null) {
            yx yxVar = zcVar.i;
            if (yxVar.i) {
                yx yxVar2 = zcVar.j;
                if (yxVar2.i) {
                    iO = yxVar.f;
                    iO3 = yxVar2.f;
                }
            }
        }
        if (z && (zeVar = this.i) != null) {
            yx yxVar3 = zeVar.i;
            if (yxVar3.i) {
                yx yxVar4 = zeVar.j;
                if (yxVar4.i) {
                    iO2 = yxVar3.f;
                    iO4 = yxVar4.f;
                }
            }
        }
        int i2 = iO4 - iO2;
        if (iO3 - iO < 0 || i2 < 0 || iO == Integer.MIN_VALUE || iO == Integer.MAX_VALUE || iO2 == Integer.MIN_VALUE || iO2 == Integer.MAX_VALUE || iO3 == Integer.MIN_VALUE || iO3 == Integer.MAX_VALUE || iO4 == Integer.MIN_VALUE || iO4 == Integer.MAX_VALUE) {
            iO = 0;
            iO2 = 0;
            iO3 = 0;
            iO4 = 0;
        }
        int i3 = iO3 - iO;
        int i4 = iO4 - iO2;
        this.Y = iO;
        this.Z = iO2;
        if (this.ag == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.ap;
        int i5 = iArr[0];
        if (i5 == 1) {
            int i6 = this.U;
            if (i3 < i6) {
                i3 = i6;
                i5 = 1;
            } else {
                i5 = 1;
            }
        }
        if (iArr[1] == 1 && i4 < (i = this.V)) {
            i4 = i;
        }
        this.U = i3;
        this.V = i4;
        int i7 = this.ac;
        if (i4 < i7) {
            this.V = i7;
        }
        int i8 = this.ab;
        if (i3 < i8) {
            this.U = i8;
        } else {
            i8 = i3;
        }
        int i9 = this.w;
        if (i9 > 0 && i5 == 3) {
            this.U = Math.min(i8, i9);
        }
        int i10 = this.z;
        if (i10 > 0 && this.ap[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i3 != i11) {
            this.k = i11;
        }
        int i12 = this.V;
        if (i4 != i12) {
            this.l = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:121:0x0207  */
    /* JADX WARN: Code duplicated, block: B:122:0x0210  */
    /* JADX WARN: Code duplicated, block: B:144:0x025c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0266  */
    /* JADX WARN: Code duplicated, block: B:150:0x026d  */
    /* JADX WARN: Code duplicated, block: B:153:0x028a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0292  */
    /* JADX WARN: Code duplicated, block: B:157:0x0295 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x0297  */
    /* JADX WARN: Code duplicated, block: B:159:0x029a  */
    /* JADX WARN: Code duplicated, block: B:160:0x029c  */
    /* JADX WARN: Code duplicated, block: B:162:0x029f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:199:0x0306  */
    /* JADX WARN: Code duplicated, block: B:209:0x032e  */
    /* JADX WARN: Code duplicated, block: B:212:0x033a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0342  */
    /* JADX WARN: Code duplicated, block: B:219:0x0358  */
    /* JADX WARN: Code duplicated, block: B:221:0x035c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0373  */
    /* JADX WARN: Code duplicated, block: B:228:0x038b  */
    /* JADX WARN: Code duplicated, block: B:231:0x039a  */
    /* JADX WARN: Code duplicated, block: B:235:0x03a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x03c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:242:0x03c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:250:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:252:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:256:0x0413 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x041e  */
    /* JADX WARN: Code duplicated, block: B:263:0x0422  */
    /* JADX WARN: Code duplicated, block: B:269:0x042e  */
    /* JADX WARN: Code duplicated, block: B:272:0x0438  */
    /* JADX WARN: Code duplicated, block: B:275:0x043e  */
    /* JADX WARN: Code duplicated, block: B:278:0x0442  */
    /* JADX WARN: Code duplicated, block: B:279:0x0445  */
    /* JADX WARN: Code duplicated, block: B:282:0x045d  */
    /* JADX WARN: Code duplicated, block: B:317:0x0560  */
    /* JADX WARN: Code duplicated, block: B:319:0x056c  */
    /* JADX WARN: Code duplicated, block: B:321:0x0572  */
    /* JADX WARN: Code duplicated, block: B:323:0x0578  */
    /* JADX WARN: Code duplicated, block: B:336:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:340:0x05e6 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:341:0x05ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:346:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:349:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:352:0x0602  */
    /* JADX WARN: Code duplicated, block: B:355:0x0608  */
    /* JADX WARN: Code duplicated, block: B:356:0x0610  */
    /* JADX WARN: Code duplicated, block: B:359:0x0616  */
    /* JADX WARN: Code duplicated, block: B:362:0x0623  */
    /* JADX WARN: Code duplicated, block: B:366:0x0629  */
    /* JADX WARN: Code duplicated, block: B:368:0x062f  */
    /* JADX WARN: Code duplicated, block: B:370:0x0645  */
    /* JADX WARN: Code duplicated, block: B:371:0x0651  */
    /* JADX WARN: Code duplicated, block: B:372:0x0654  */
    /* JADX WARN: Code duplicated, block: B:374:0x0658  */
    /* JADX WARN: Code duplicated, block: B:375:0x0660  */
    /* JADX WARN: Code duplicated, block: B:379:0x0682  */
    /* JADX WARN: Code duplicated, block: B:380:0x0685  */
    /* JADX WARN: Code duplicated, block: B:384:0x06db  */
    /* JADX WARN: Code duplicated, block: B:386:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:387:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:388:0x0702  */
    /* JADX WARN: Code duplicated, block: B:391:0x070c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3  */
    public void b(ya yaVar, boolean z) {
        boolean z2;
        boolean z3;
        yk ykVar;
        yk ykVar2;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        yf yfVar;
        int i11;
        yf yfVar2;
        int i12;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int i15;
        char c;
        yk ykVar3;
        boolean z12;
        boolean z13;
        yk ykVar4;
        yf yfVarB;
        int i16;
        yj yjVar;
        boolean z14;
        int[] iArr;
        boolean z15;
        yk ykVar5;
        ze zeVar;
        yx yxVar;
        zc zcVar;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean zI;
        boolean zJ;
        zc zcVar2;
        ze zeVar2;
        yx yxVar2;
        yf yfVarB2 = yaVar.b(this.J);
        yf yfVarB3 = yaVar.b(this.L);
        yf yfVarB4 = yaVar.b(this.K);
        yf yfVarB5 = yaVar.b(this.M);
        yf yfVarB6 = yaVar.b(this.N);
        yk ykVar6 = this.T;
        if (ykVar6 != null) {
            int[] iArr2 = ykVar6.ap;
            boolean z16 = iArr2[0] == 2;
            boolean z17 = iArr2[1] == 2;
            switch (this.r) {
                case 1:
                    z3 = z16;
                    z2 = false;
                    break;
                case 2:
                    z2 = z17;
                    z3 = false;
                    break;
                case 3:
                    z2 = false;
                    z3 = false;
                    break;
                default:
                    z2 = z17;
                    z3 = z16;
                    break;
            }
        } else {
            z2 = false;
            z3 = false;
        }
        if (this.ag == 8) {
            int size = this.S.size();
            int i23 = 0;
            while (true) {
                if (i23 >= size) {
                    boolean[] zArr = this.c;
                    if (!zArr[0] && !zArr[1]) {
                        return;
                    }
                } else if (!((yj) this.S.get(i23)).g()) {
                    i23++;
                }
            }
        }
        if (!this.b) {
            if (this.m) {
            }
            if (z && (zcVar2 = this.h) != null && (zeVar2 = this.i) != null) {
                yxVar2 = zcVar2.i;
                if (yxVar2.i && zcVar2.j.i && zeVar2.i.i && zeVar2.j.i) {
                    yaVar.f(yfVarB2, yxVar2.f);
                    yaVar.f(yfVarB3, this.h.j.f);
                    yaVar.f(yfVarB4, this.i.i.f);
                    yaVar.f(yfVarB5, this.i.j.f);
                    yaVar.f(yfVarB6, this.i.a.f);
                    if (this.T != null) {
                        if (z3 && this.j[0] && !I()) {
                            yaVar.g(yaVar.b(this.T.L), yfVarB3, 0, 8);
                        }
                        if (z2 && this.j[1] && !J()) {
                            yaVar.g(yaVar.b(this.T.M), yfVarB5, 0, 8);
                        }
                    }
                    this.b = false;
                    this.m = false;
                    return;
                }
            }
            if (this.T != null) {
                if (a(0)) {
                    ((yl) this.T).a(this, 0);
                    zI = true;
                } else {
                    zI = I();
                }
                if (a(1)) {
                    ((yl) this.T).a(this, 1);
                    zJ = true;
                } else {
                    zJ = J();
                }
                if (!zI && z3 && this.ag != 8 && this.J.e == null && this.L.e == null) {
                    yaVar.g(yaVar.b(this.T.L), yfVarB3, 0, 1);
                }
                if (!zJ && z2 && this.ag != 8 && this.K.e == null && this.M.e == null && this.N == null) {
                    yaVar.g(yaVar.b(this.T.M), yfVarB5, 0, 1);
                }
                z5 = zI;
                z4 = zJ;
            } else {
                z4 = false;
                z5 = false;
            }
            i = this.U;
            i2 = this.ab;
            if (i >= i2) {
                i2 = i;
            }
            i3 = this.V;
            i4 = this.ac;
            if (i3 >= i4) {
                i4 = i3;
            }
            int[] iArr3 = this.ap;
            i5 = iArr3[0];
            i6 = iArr3[1];
            i7 = this.X;
            this.B = i7;
            f = this.W;
            this.C = f;
            i8 = this.s;
            i9 = i2;
            i10 = this.t;
            yfVar = yfVarB4;
            if (f > 0.0f) {
                i11 = i4;
                if (this.ag != 8) {
                    if (i5 == 3) {
                        i17 = i5;
                    } else if (i8 == 0) {
                        i8 = 3;
                        i17 = 3;
                    } else {
                        i17 = 3;
                    }
                    if (i6 == 3) {
                        i18 = i6;
                    } else if (i10 == 0) {
                        i10 = 3;
                        i18 = 3;
                    } else {
                        i18 = 3;
                    }
                    if (i17 == 3) {
                        yfVar2 = yfVarB6;
                        i19 = i18;
                        if (i19 != 3 && i8 == 3) {
                            if (i10 == 3) {
                                if (i7 == -1) {
                                    if (i5 == 3 || i6 != 3) {
                                        if (i5 == 3 && i6 != 3) {
                                            this.B = 1;
                                            this.C = 1.0f / f;
                                        }
                                        i21 = 1;
                                    } else {
                                        this.B = 0;
                                        if (this.K.h() || !this.M.h()) {
                                            this.B = 1;
                                        } else {
                                            i21 = 1;
                                        }
                                        if (this.B == -1 && (!this.K.h() || !this.M.h() || !this.J.h() || !this.L.h())) {
                                            if (!this.K.h() && this.M.h()) {
                                                this.B = 0;
                                            } else if (this.J.h() && this.L.h()) {
                                                this.C = 1.0f / this.C;
                                                this.B = 1;
                                            }
                                        }
                                        i12 = this.B;
                                        if (i12 != -1) {
                                            i7 = i12;
                                            z6 = true;
                                        } else {
                                            i22 = this.v;
                                            if (i22 > 0 || this.y != 0) {
                                                if (i22 == 0 || this.y <= 0) {
                                                    i7 = i12;
                                                } else {
                                                    this.C = 1.0f / this.C;
                                                    this.B = 1;
                                                    i12 = 1;
                                                    i7 = 1;
                                                }
                                                z6 = true;
                                            } else {
                                                this.B = 0;
                                                i10 = i10;
                                                i8 = i8;
                                                i9 = i9;
                                                i11 = i11;
                                                i12 = 0;
                                                i7 = 0;
                                                z6 = true;
                                            }
                                        }
                                    }
                                } else if (i7 == 0) {
                                    if (this.K.h()) {
                                    }
                                    this.B = 1;
                                    if (this.B == -1) {
                                        if (!this.K.h()) {
                                            if (this.J.h()) {
                                                this.C = 1.0f / this.C;
                                                this.B = 1;
                                            }
                                        } else if (this.J.h()) {
                                            this.C = 1.0f / this.C;
                                            this.B = 1;
                                        }
                                    }
                                    i12 = this.B;
                                    if (i12 != -1) {
                                        i7 = i12;
                                        z6 = true;
                                    } else {
                                        i22 = this.v;
                                        if (i22 > 0) {
                                        }
                                        if (i22 == 0) {
                                            i7 = i12;
                                        } else {
                                            i7 = i12;
                                        }
                                        z6 = true;
                                    }
                                } else {
                                    i21 = 1;
                                }
                                if (this.B == i21 && (!this.J.h() || !this.L.h())) {
                                    this.B = 0;
                                }
                                if (this.B == -1) {
                                    if (!this.K.h()) {
                                        if (this.J.h()) {
                                            this.C = 1.0f / this.C;
                                            this.B = 1;
                                        }
                                    } else if (this.J.h()) {
                                        this.C = 1.0f / this.C;
                                        this.B = 1;
                                    }
                                }
                                i12 = this.B;
                                if (i12 != -1) {
                                    i7 = i12;
                                    z6 = true;
                                } else {
                                    i22 = this.v;
                                    if (i22 > 0) {
                                    }
                                    if (i22 == 0) {
                                        i7 = i12;
                                    } else {
                                        i7 = i12;
                                    }
                                    z6 = true;
                                }
                            } else {
                                i20 = 3;
                            }
                        }
                        if (i17 == 3 || i20 != 3) {
                            if (i19 == 3 || i10 != 3) {
                                i12 = i7;
                                i11 = i11;
                            } else {
                                this.B = 1;
                                if (i7 == -1) {
                                    f = 1.0f / f;
                                    this.C = f;
                                }
                                int i24 = (int) (f * i);
                                if (i17 != 3) {
                                    i11 = i24;
                                    i8 = i8;
                                    i9 = i9;
                                    i12 = 1;
                                    i7 = 1;
                                    z6 = false;
                                    i10 = 4;
                                } else {
                                    i11 = i24;
                                    i12 = 1;
                                    i7 = 1;
                                }
                            }
                            z6 = true;
                        } else {
                            this.B = 0;
                            int i25 = (int) (f * i3);
                            i10 = i10;
                            if (i19 != 3) {
                                i7 = 0;
                                z6 = false;
                                i8 = 4;
                            } else {
                                i8 = i8;
                                i7 = 0;
                                z6 = true;
                            }
                            i9 = i25;
                            i12 = 0;
                        }
                    } else {
                        yfVar2 = yfVarB6;
                        i19 = i18;
                    }
                    i20 = i8;
                    if (i17 == 3) {
                        if (i19 == 3) {
                            i12 = i7;
                            i11 = i11;
                            z6 = true;
                        } else {
                            i12 = i7;
                            i11 = i11;
                            z6 = true;
                        }
                    } else if (i19 == 3) {
                        i12 = i7;
                        i11 = i11;
                        z6 = true;
                    } else {
                        i12 = i7;
                        i11 = i11;
                        z6 = true;
                    }
                }
                int[] iArr4 = this.u;
                iArr4[0] = i8;
                iArr4[1] = i10;
                if (z6 || !(i7 == 0 || i7 == -1)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (z6 || !(i12 == 1 || i12 == -1)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (this.ap[0] == 2 || !(this instanceof yl)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (true != z9) {
                    i13 = i9;
                } else {
                    i13 = 0;
                }
                z10 = !this.Q.h();
                boolean[] zArr2 = this.c;
                boolean z18 = zArr2[0];
                z11 = zArr2[1];
                if (this.p == 2 && !this.b) {
                    if (z && (zcVar = this.h) != null) {
                        yx yxVar3 = zcVar.i;
                        if (yxVar3.i && zcVar.j.i) {
                            yaVar.f(yfVarB2, yxVar3.f);
                            yaVar.f(yfVarB3, this.h.j.f);
                            if (this.T != null && z3 && this.j[0] && !I()) {
                                yaVar.g(yaVar.b(this.T.L), yfVarB3, 0, 8);
                            }
                        }
                    }
                    yk ykVar7 = this.T;
                    yf yfVarB7 = ykVar7 != null ? yaVar.b(ykVar7.L) : null;
                    yk ykVar8 = this.T;
                    yf yfVarB8 = ykVar8 != null ? yaVar.b(ykVar8.J) : null;
                    boolean z19 = this.j[0];
                    int[] iArr5 = this.ap;
                    c(yaVar, true, z3, z2, z19, yfVarB8, yfVarB7, iArr5[0], z9, this.J, this.L, this.Y, i13, this.ab, this.D[0], this.ad, z7, iArr5[1] == 3, z5, z4, z18, i8, i10, this.v, this.w, this.x, z10);
                }
                if (z) {
                    ykVar3 = this;
                    zeVar = ykVar3.i;
                    if (zeVar != null) {
                        yxVar = zeVar.i;
                        if (!yxVar.i && zeVar.j.i) {
                            yaVar = yaVar;
                            yfVar = yfVar;
                            yaVar.f(yfVar, yxVar.f);
                            yfVarB5 = yfVarB5;
                            yaVar.f(yfVarB5, ykVar3.i.j.f);
                            yfVar2 = yfVar2;
                            yaVar.f(yfVar2, ykVar3.i.a.f);
                            yk ykVar9 = ykVar3.T;
                            if (ykVar9 == null || z4 || !z2) {
                                i14 = 8;
                                i15 = 0;
                                c = 1;
                            } else {
                                c = 1;
                                if (ykVar3.j[1]) {
                                    i14 = 8;
                                    i15 = 0;
                                    yaVar.g(yaVar.b(ykVar9.M), yfVarB5, 0, 8);
                                    z12 = false;
                                } else {
                                    i14 = 8;
                                    i15 = 0;
                                }
                            }
                            z12 = false;
                        }
                        if (ykVar3.q == 2 && z12 && !ykVar3.m) {
                            if (ykVar3.ap[c] == 2 || !(ykVar3 instanceof yl)) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (c == z13) {
                                i11 = 0;
                            }
                            ykVar4 = ykVar3.T;
                            if (ykVar4 != null) {
                                yfVarB = yaVar.b(ykVar4.M);
                            } else {
                                yfVarB = null;
                            }
                            yk ykVar10 = ykVar3.T;
                            yf yfVarB9 = ykVar10 != null ? yaVar.b(ykVar10.K) : null;
                            i16 = ykVar3.aa;
                            if (i16 <= 0 || ykVar3.ag == i14) {
                                yjVar = ykVar3.N;
                                if (yjVar.e != null) {
                                    yaVar.m(yfVar2, yfVar, i16, i14);
                                    yaVar.m(yfVar2, yaVar.b(ykVar3.N.e), ykVar3.N.b(), i14);
                                    if (z2) {
                                        yaVar.g(yfVarB, yaVar.b(ykVar3.M), i15, 5);
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                } else {
                                    if (ykVar3.ag == i14) {
                                        yaVar.m(yfVar2, yfVar, yjVar.b(), i14);
                                    } else {
                                        yaVar.m(yfVar2, yfVar, i16, i14);
                                    }
                                    z14 = z10;
                                }
                            } else {
                                z14 = z10;
                            }
                            boolean z20 = ykVar3.j[c];
                            iArr = ykVar3.ap;
                            int i26 = iArr[c];
                            yj yjVar2 = ykVar3.K;
                            yj yjVar3 = ykVar3.M;
                            int i27 = ykVar3.Z;
                            int i28 = ykVar3.ac;
                            int i29 = ykVar3.D[c];
                            float f2 = ykVar3.ae;
                            if (iArr[i15] == 3) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            c(yaVar, false, z2, z3, z20, yfVarB9, yfVarB, i26, z13, yjVar2, yjVar3, i27, i11, i28, i29, f2, z8, z15, z4, z5, z11, i10, i8, ykVar3.y, ykVar3.z, ykVar3.A, z14);
                        }
                        if (z6) {
                            ykVar5 = this;
                            if (ykVar5.B == 1) {
                                yaVar.n(yfVarB5, yfVar, yfVarB3, yfVarB2, ykVar5.C);
                            } else {
                                yaVar.n(yfVarB3, yfVarB2, yfVarB5, yfVar, ykVar5.C);
                            }
                        } else {
                            ykVar5 = this;
                        }
                        if (ykVar5.Q.h()) {
                            yk ykVar11 = ykVar5.Q.e.d;
                            double radians = Math.toRadians(ykVar5.E + 90.0f);
                            int iB = ykVar5.Q.b();
                            yf yfVarB10 = yaVar.b(ykVar5.L(2));
                            yf yfVarB11 = yaVar.b(ykVar5.L(3));
                            yf yfVarB12 = yaVar.b(ykVar5.L(4));
                            yf yfVarB13 = yaVar.b(ykVar5.L(5));
                            yf yfVarB14 = yaVar.b(ykVar11.L(2));
                            yf yfVarB15 = yaVar.b(ykVar11.L(3));
                            yf yfVarB16 = yaVar.b(ykVar11.L(4));
                            yf yfVarB17 = yaVar.b(ykVar11.L(5));
                            xy xyVarA = yaVar.a();
                            double d = (float) radians;
                            double d2 = iB;
                            double dSin = Math.sin(d);
                            Double.isNaN(d2);
                            xyVarA.j(yfVarB11, yfVarB13, yfVarB15, yfVarB17, (float) (dSin * d2));
                            yaVar.e(xyVarA);
                            xy xyVarA2 = yaVar.a();
                            double dCos = Math.cos(d);
                            Double.isNaN(d2);
                            xyVarA2.j(yfVarB10, yfVarB12, yfVarB14, yfVarB16, (float) (dCos * d2));
                            yaVar.e(xyVarA2);
                        }
                        this.b = false;
                        this.m = false;
                    }
                    i14 = 8;
                    i15 = 0;
                    c = 1;
                } else {
                    i14 = 8;
                    i15 = 0;
                    c = 1;
                    ykVar3 = this;
                }
                z12 = true;
                if (ykVar3.q == 2) {
                    if (ykVar3.ap[c] == 2) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (c == z13) {
                        i11 = 0;
                    }
                    ykVar4 = ykVar3.T;
                    if (ykVar4 != null) {
                        yfVarB = yaVar.b(ykVar4.M);
                    } else {
                        yfVarB = null;
                    }
                    yk ykVar12 = ykVar3.T;
                    if (ykVar12 != null) {
                    }
                    i16 = ykVar3.aa;
                    if (i16 <= 0) {
                        yjVar = ykVar3.N;
                        if (yjVar.e != null) {
                            yaVar.m(yfVar2, yfVar, i16, i14);
                            yaVar.m(yfVar2, yaVar.b(ykVar3.N.e), ykVar3.N.b(), i14);
                            if (z2) {
                                yaVar.g(yfVarB, yaVar.b(ykVar3.M), i15, 5);
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                        } else {
                            if (ykVar3.ag == i14) {
                                yaVar.m(yfVar2, yfVar, yjVar.b(), i14);
                            } else {
                                yaVar.m(yfVar2, yfVar, i16, i14);
                            }
                            z14 = z10;
                        }
                    } else {
                        yjVar = ykVar3.N;
                        if (yjVar.e != null) {
                            yaVar.m(yfVar2, yfVar, i16, i14);
                            yaVar.m(yfVar2, yaVar.b(ykVar3.N.e), ykVar3.N.b(), i14);
                            if (z2) {
                                yaVar.g(yfVarB, yaVar.b(ykVar3.M), i15, 5);
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                        } else {
                            if (ykVar3.ag == i14) {
                                yaVar.m(yfVar2, yfVar, yjVar.b(), i14);
                            } else {
                                yaVar.m(yfVar2, yfVar, i16, i14);
                            }
                            z14 = z10;
                        }
                    }
                    boolean z21 = ykVar3.j[c];
                    iArr = ykVar3.ap;
                    int i210 = iArr[c];
                    yj yjVar4 = ykVar3.K;
                    yj yjVar5 = ykVar3.M;
                    int i211 = ykVar3.Z;
                    int i212 = ykVar3.ac;
                    int i213 = ykVar3.D[c];
                    float f3 = ykVar3.ae;
                    if (iArr[i15] == 3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    c(yaVar, false, z2, z3, z21, yfVarB9, yfVarB, i210, z13, yjVar4, yjVar5, i211, i11, i212, i213, f3, z8, z15, z4, z5, z11, i10, i8, ykVar3.y, ykVar3.z, ykVar3.A, z14);
                }
                if (z6) {
                    ykVar5 = this;
                    if (ykVar5.B == 1) {
                        yaVar.n(yfVarB5, yfVar, yfVarB3, yfVarB2, ykVar5.C);
                    } else {
                        yaVar.n(yfVarB3, yfVarB2, yfVarB5, yfVar, ykVar5.C);
                    }
                } else {
                    ykVar5 = this;
                }
                if (ykVar5.Q.h()) {
                    yk ykVar13 = ykVar5.Q.e.d;
                    double radians2 = Math.toRadians(ykVar5.E + 90.0f);
                    int iB2 = ykVar5.Q.b();
                    yf yfVarB18 = yaVar.b(ykVar5.L(2));
                    yf yfVarB19 = yaVar.b(ykVar5.L(3));
                    yf yfVarB110 = yaVar.b(ykVar5.L(4));
                    yf yfVarB111 = yaVar.b(ykVar5.L(5));
                    yf yfVarB112 = yaVar.b(ykVar13.L(2));
                    yf yfVarB113 = yaVar.b(ykVar13.L(3));
                    yf yfVarB114 = yaVar.b(ykVar13.L(4));
                    yf yfVarB115 = yaVar.b(ykVar13.L(5));
                    xy xyVarA3 = yaVar.a();
                    double d3 = (float) radians2;
                    double d4 = iB2;
                    double dSin2 = Math.sin(d3);
                    Double.isNaN(d4);
                    xyVarA3.j(yfVarB19, yfVarB111, yfVarB113, yfVarB115, (float) (dSin2 * d4));
                    yaVar.e(xyVarA3);
                    xy xyVarA4 = yaVar.a();
                    double dCos2 = Math.cos(d3);
                    Double.isNaN(d4);
                    xyVarA4.j(yfVarB18, yfVarB110, yfVarB112, yfVarB114, (float) (dCos2 * d4));
                    yaVar.e(xyVarA4);
                }
                this.b = false;
                this.m = false;
            }
            i11 = i4;
            yfVar2 = yfVarB6;
            i10 = i10;
            i8 = i8;
            i12 = i7;
            i9 = i9;
            i11 = i11;
            z6 = false;
            int[] iArr6 = this.u;
            iArr6[0] = i8;
            iArr6[1] = i10;
            if (z6) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z6) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.ap[0] == 2) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (true != z9) {
                i13 = i9;
            } else {
                i13 = 0;
            }
            z10 = !this.Q.h();
            boolean[] zArr3 = this.c;
            boolean z110 = zArr3[0];
            z11 = zArr3[1];
            if (this.p == 2) {
            }
            if (z) {
                ykVar3 = this;
                zeVar = ykVar3.i;
                if (zeVar != null) {
                    yxVar = zeVar.i;
                    if (!yxVar.i) {
                    }
                }
                i14 = 8;
                i15 = 0;
                c = 1;
            } else {
                i14 = 8;
                i15 = 0;
                c = 1;
                ykVar3 = this;
            }
            z12 = true;
            if (ykVar3.q == 2) {
                if (ykVar3.ap[c] == 2) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (c == z13) {
                    i11 = 0;
                }
                ykVar4 = ykVar3.T;
                if (ykVar4 != null) {
                    yfVarB = yaVar.b(ykVar4.M);
                } else {
                    yfVarB = null;
                }
                yk ykVar14 = ykVar3.T;
                if (ykVar14 != null) {
                }
                i16 = ykVar3.aa;
                if (i16 <= 0) {
                    yjVar = ykVar3.N;
                    if (yjVar.e != null) {
                        yaVar.m(yfVar2, yfVar, i16, i14);
                        yaVar.m(yfVar2, yaVar.b(ykVar3.N.e), ykVar3.N.b(), i14);
                        if (z2) {
                            yaVar.g(yfVarB, yaVar.b(ykVar3.M), i15, 5);
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                    } else {
                        if (ykVar3.ag == i14) {
                            yaVar.m(yfVar2, yfVar, yjVar.b(), i14);
                        } else {
                            yaVar.m(yfVar2, yfVar, i16, i14);
                        }
                        z14 = z10;
                    }
                } else {
                    yjVar = ykVar3.N;
                    if (yjVar.e != null) {
                        yaVar.m(yfVar2, yfVar, i16, i14);
                        yaVar.m(yfVar2, yaVar.b(ykVar3.N.e), ykVar3.N.b(), i14);
                        if (z2) {
                            yaVar.g(yfVarB, yaVar.b(ykVar3.M), i15, 5);
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                    } else {
                        if (ykVar3.ag == i14) {
                            yaVar.m(yfVar2, yfVar, yjVar.b(), i14);
                        } else {
                            yaVar.m(yfVar2, yfVar, i16, i14);
                        }
                        z14 = z10;
                    }
                }
                boolean z22 = ykVar3.j[c];
                iArr = ykVar3.ap;
                int i214 = iArr[c];
                yj yjVar6 = ykVar3.K;
                yj yjVar7 = ykVar3.M;
                int i215 = ykVar3.Z;
                int i216 = ykVar3.ac;
                int i217 = ykVar3.D[c];
                float f4 = ykVar3.ae;
                if (iArr[i15] == 3) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                c(yaVar, false, z2, z3, z22, yfVarB9, yfVarB, i214, z13, yjVar6, yjVar7, i215, i11, i216, i217, f4, z8, z15, z4, z5, z11, i10, i8, ykVar3.y, ykVar3.z, ykVar3.A, z14);
            }
            if (z6) {
                ykVar5 = this;
                if (ykVar5.B == 1) {
                    yaVar.n(yfVarB5, yfVar, yfVarB3, yfVarB2, ykVar5.C);
                } else {
                    yaVar.n(yfVarB3, yfVarB2, yfVarB5, yfVar, ykVar5.C);
                }
            } else {
                ykVar5 = this;
            }
            if (ykVar5.Q.h()) {
                yk ykVar15 = ykVar5.Q.e.d;
                double radians3 = Math.toRadians(ykVar5.E + 90.0f);
                int iB3 = ykVar5.Q.b();
                yf yfVarB116 = yaVar.b(ykVar5.L(2));
                yf yfVarB117 = yaVar.b(ykVar5.L(3));
                yf yfVarB118 = yaVar.b(ykVar5.L(4));
                yf yfVarB119 = yaVar.b(ykVar5.L(5));
                yf yfVarB1110 = yaVar.b(ykVar15.L(2));
                yf yfVarB1111 = yaVar.b(ykVar15.L(3));
                yf yfVarB1112 = yaVar.b(ykVar15.L(4));
                yf yfVarB1113 = yaVar.b(ykVar15.L(5));
                xy xyVarA5 = yaVar.a();
                double d5 = (float) radians3;
                double d6 = iB3;
                double dSin3 = Math.sin(d5);
                Double.isNaN(d6);
                xyVarA5.j(yfVarB117, yfVarB119, yfVarB1111, yfVarB1113, (float) (dSin3 * d6));
                yaVar.e(xyVarA5);
                xy xyVarA6 = yaVar.a();
                double dCos3 = Math.cos(d5);
                Double.isNaN(d6);
                xyVarA6.j(yfVarB116, yfVarB118, yfVarB1110, yfVarB1112, (float) (dCos3 * d6));
                yaVar.e(xyVarA6);
            }
            this.b = false;
            this.m = false;
        }
        yaVar.f(yfVarB2, this.Y);
        yaVar.f(yfVarB3, this.Y + this.U);
        if (z3 && (ykVar = this.T) != null) {
            yj yjVar8 = this.J;
            yl ylVar = (yl) ykVar;
            WeakReference weakReference = ylVar.aB;
            if (weakReference == null || weakReference.get() == null || yjVar8.a() > ((yj) ylVar.aB.get()).a()) {
                ylVar.aB = new WeakReference(yjVar8);
            }
            yj yjVar9 = this.L;
            WeakReference weakReference2 = ylVar.aD;
            if (weakReference2 == null || weakReference2.get() == null || yjVar9.a() > ((yj) ylVar.aD.get()).a()) {
                ylVar.aD = new WeakReference(yjVar9);
            }
        }
        if (this.m) {
            yaVar.f(yfVarB4, this.Z);
            yaVar.f(yfVarB5, this.Z + this.V);
            if (this.N.g()) {
                yaVar.f(yfVarB6, this.Z + this.aa);
            }
            if (z2 && (ykVar2 = this.T) != null) {
                yj yjVar10 = this.K;
                yl ylVar2 = (yl) ykVar2;
                WeakReference weakReference3 = ylVar2.aA;
                if (weakReference3 == null || weakReference3.get() == null || yjVar10.a() > ((yj) ylVar2.aA.get()).a()) {
                    ylVar2.aA = new WeakReference(yjVar10);
                }
                yj yjVar11 = this.M;
                WeakReference weakReference4 = ylVar2.aC;
                if (weakReference4 == null || weakReference4.get() == null || yjVar11.a() > ((yj) ylVar2.aC.get()).a()) {
                    ylVar2.aC = new WeakReference(yjVar11);
                }
            }
        }
        if (this.b && this.m) {
            this.b = false;
            this.m = false;
            return;
        }
        if (z) {
            yxVar2 = zcVar2.i;
            if (yxVar2.i) {
                yaVar.f(yfVarB2, yxVar2.f);
                yaVar.f(yfVarB3, this.h.j.f);
                yaVar.f(yfVarB4, this.i.i.f);
                yaVar.f(yfVarB5, this.i.j.f);
                yaVar.f(yfVarB6, this.i.a.f);
                if (this.T != null) {
                    if (z3) {
                        yaVar.g(yaVar.b(this.T.L), yfVarB3, 0, 8);
                    }
                    if (z2) {
                        yaVar.g(yaVar.b(this.T.M), yfVarB5, 0, 8);
                    }
                }
                this.b = false;
                this.m = false;
                return;
            }
        }
        if (this.T != null) {
            if (a(0)) {
                ((yl) this.T).a(this, 0);
                zI = true;
            } else {
                zI = I();
            }
            if (a(1)) {
                ((yl) this.T).a(this, 1);
                zJ = true;
            } else {
                zJ = J();
            }
            if (!zI) {
                yaVar.g(yaVar.b(this.T.L), yfVarB3, 0, 1);
            }
            if (!zJ) {
                yaVar.g(yaVar.b(this.T.M), yfVarB5, 0, 1);
            }
            z5 = zI;
            z4 = zJ;
        } else {
            z4 = false;
            z5 = false;
        }
        i = this.U;
        i2 = this.ab;
        if (i >= i2) {
            i2 = i;
        }
        i3 = this.V;
        i4 = this.ac;
        if (i3 >= i4) {
            i4 = i3;
        }
        int[] iArr7 = this.ap;
        i5 = iArr7[0];
        i6 = iArr7[1];
        i7 = this.X;
        this.B = i7;
        f = this.W;
        this.C = f;
        i8 = this.s;
        i9 = i2;
        i10 = this.t;
        yfVar = yfVarB4;
        if (f > 0.0f) {
            i11 = i4;
            if (this.ag != 8) {
                if (i5 == 3) {
                    i17 = i5;
                } else if (i8 == 0) {
                    i8 = 3;
                    i17 = 3;
                } else {
                    i17 = 3;
                }
                if (i6 == 3) {
                    i18 = i6;
                } else if (i10 == 0) {
                    i10 = 3;
                    i18 = 3;
                } else {
                    i18 = 3;
                }
                if (i17 == 3) {
                    yfVar2 = yfVarB6;
                    i19 = i18;
                    if (i19 != 3) {
                    }
                } else {
                    yfVar2 = yfVarB6;
                    i19 = i18;
                }
                i20 = i8;
                if (i17 == 3) {
                    if (i19 == 3) {
                        i12 = i7;
                        i11 = i11;
                        z6 = true;
                    } else {
                        i12 = i7;
                        i11 = i11;
                        z6 = true;
                    }
                } else if (i19 == 3) {
                    i12 = i7;
                    i11 = i11;
                    z6 = true;
                } else {
                    i12 = i7;
                    i11 = i11;
                    z6 = true;
                }
            }
            int[] iArr8 = this.u;
            iArr8[0] = i8;
            iArr8[1] = i10;
            if (z6) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z6) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.ap[0] == 2) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (true != z9) {
                i13 = i9;
            } else {
                i13 = 0;
            }
            z10 = !this.Q.h();
            boolean[] zArr4 = this.c;
            boolean z111 = zArr4[0];
            z11 = zArr4[1];
            if (this.p == 2) {
            }
            if (z) {
                ykVar3 = this;
                zeVar = ykVar3.i;
                if (zeVar != null) {
                    yxVar = zeVar.i;
                    if (!yxVar.i) {
                    }
                }
                i14 = 8;
                i15 = 0;
                c = 1;
            } else {
                i14 = 8;
                i15 = 0;
                c = 1;
                ykVar3 = this;
            }
            z12 = true;
            if (ykVar3.q == 2) {
                if (ykVar3.ap[c] == 2) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (c == z13) {
                    i11 = 0;
                }
                ykVar4 = ykVar3.T;
                if (ykVar4 != null) {
                    yfVarB = yaVar.b(ykVar4.M);
                } else {
                    yfVarB = null;
                }
                yk ykVar16 = ykVar3.T;
                if (ykVar16 != null) {
                }
                i16 = ykVar3.aa;
                if (i16 <= 0) {
                    yjVar = ykVar3.N;
                    if (yjVar.e != null) {
                        yaVar.m(yfVar2, yfVar, i16, i14);
                        yaVar.m(yfVar2, yaVar.b(ykVar3.N.e), ykVar3.N.b(), i14);
                        if (z2) {
                            yaVar.g(yfVarB, yaVar.b(ykVar3.M), i15, 5);
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                    } else {
                        if (ykVar3.ag == i14) {
                            yaVar.m(yfVar2, yfVar, yjVar.b(), i14);
                        } else {
                            yaVar.m(yfVar2, yfVar, i16, i14);
                        }
                        z14 = z10;
                    }
                } else {
                    yjVar = ykVar3.N;
                    if (yjVar.e != null) {
                        yaVar.m(yfVar2, yfVar, i16, i14);
                        yaVar.m(yfVar2, yaVar.b(ykVar3.N.e), ykVar3.N.b(), i14);
                        if (z2) {
                            yaVar.g(yfVarB, yaVar.b(ykVar3.M), i15, 5);
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                    } else {
                        if (ykVar3.ag == i14) {
                            yaVar.m(yfVar2, yfVar, yjVar.b(), i14);
                        } else {
                            yaVar.m(yfVar2, yfVar, i16, i14);
                        }
                        z14 = z10;
                    }
                }
                boolean z23 = ykVar3.j[c];
                iArr = ykVar3.ap;
                int i218 = iArr[c];
                yj yjVar12 = ykVar3.K;
                yj yjVar13 = ykVar3.M;
                int i219 = ykVar3.Z;
                int i2110 = ykVar3.ac;
                int i2111 = ykVar3.D[c];
                float f5 = ykVar3.ae;
                if (iArr[i15] == 3) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                c(yaVar, false, z2, z3, z23, yfVarB9, yfVarB, i218, z13, yjVar12, yjVar13, i219, i11, i2110, i2111, f5, z8, z15, z4, z5, z11, i10, i8, ykVar3.y, ykVar3.z, ykVar3.A, z14);
            }
            if (z6) {
                ykVar5 = this;
                if (ykVar5.B == 1) {
                    yaVar.n(yfVarB5, yfVar, yfVarB3, yfVarB2, ykVar5.C);
                } else {
                    yaVar.n(yfVarB3, yfVarB2, yfVarB5, yfVar, ykVar5.C);
                }
            } else {
                ykVar5 = this;
            }
            if (ykVar5.Q.h()) {
                yk ykVar17 = ykVar5.Q.e.d;
                double radians4 = Math.toRadians(ykVar5.E + 90.0f);
                int iB4 = ykVar5.Q.b();
                yf yfVarB1114 = yaVar.b(ykVar5.L(2));
                yf yfVarB1115 = yaVar.b(ykVar5.L(3));
                yf yfVarB1116 = yaVar.b(ykVar5.L(4));
                yf yfVarB1117 = yaVar.b(ykVar5.L(5));
                yf yfVarB1118 = yaVar.b(ykVar17.L(2));
                yf yfVarB1119 = yaVar.b(ykVar17.L(3));
                yf yfVarB11110 = yaVar.b(ykVar17.L(4));
                yf yfVarB11111 = yaVar.b(ykVar17.L(5));
                xy xyVarA7 = yaVar.a();
                double d7 = (float) radians4;
                double d8 = iB4;
                double dSin4 = Math.sin(d7);
                Double.isNaN(d8);
                xyVarA7.j(yfVarB1115, yfVarB1117, yfVarB1119, yfVarB11111, (float) (dSin4 * d8));
                yaVar.e(xyVarA7);
                xy xyVarA8 = yaVar.a();
                double dCos4 = Math.cos(d7);
                Double.isNaN(d8);
                xyVarA8.j(yfVarB1114, yfVarB1116, yfVarB1118, yfVarB11110, (float) (dCos4 * d8));
                yaVar.e(xyVarA8);
            }
            this.b = false;
            this.m = false;
        }
        i11 = i4;
        yfVar2 = yfVarB6;
        i10 = i10;
        i8 = i8;
        i12 = i7;
        i9 = i9;
        i11 = i11;
        z6 = false;
        int[] iArr9 = this.u;
        iArr9[0] = i8;
        iArr9[1] = i10;
        if (z6) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (z6) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (this.ap[0] == 2) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (true != z9) {
            i13 = i9;
        } else {
            i13 = 0;
        }
        z10 = !this.Q.h();
        boolean[] zArr5 = this.c;
        boolean z112 = zArr5[0];
        z11 = zArr5[1];
        if (this.p == 2) {
        }
        if (z) {
            ykVar3 = this;
            zeVar = ykVar3.i;
            if (zeVar != null) {
                yxVar = zeVar.i;
                if (!yxVar.i) {
                }
            }
            i14 = 8;
            i15 = 0;
            c = 1;
        } else {
            i14 = 8;
            i15 = 0;
            c = 1;
            ykVar3 = this;
        }
        z12 = true;
        if (ykVar3.q == 2) {
            if (ykVar3.ap[c] == 2) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (c == z13) {
                i11 = 0;
            }
            ykVar4 = ykVar3.T;
            if (ykVar4 != null) {
                yfVarB = yaVar.b(ykVar4.M);
            } else {
                yfVarB = null;
            }
            yk ykVar18 = ykVar3.T;
            if (ykVar18 != null) {
            }
            i16 = ykVar3.aa;
            if (i16 <= 0) {
                yjVar = ykVar3.N;
                if (yjVar.e != null) {
                    yaVar.m(yfVar2, yfVar, i16, i14);
                    yaVar.m(yfVar2, yaVar.b(ykVar3.N.e), ykVar3.N.b(), i14);
                    if (z2) {
                        yaVar.g(yfVarB, yaVar.b(ykVar3.M), i15, 5);
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                } else {
                    if (ykVar3.ag == i14) {
                        yaVar.m(yfVar2, yfVar, yjVar.b(), i14);
                    } else {
                        yaVar.m(yfVar2, yfVar, i16, i14);
                    }
                    z14 = z10;
                }
            } else {
                yjVar = ykVar3.N;
                if (yjVar.e != null) {
                    yaVar.m(yfVar2, yfVar, i16, i14);
                    yaVar.m(yfVar2, yaVar.b(ykVar3.N.e), ykVar3.N.b(), i14);
                    if (z2) {
                        yaVar.g(yfVarB, yaVar.b(ykVar3.M), i15, 5);
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                } else {
                    if (ykVar3.ag == i14) {
                        yaVar.m(yfVar2, yfVar, yjVar.b(), i14);
                    } else {
                        yaVar.m(yfVar2, yfVar, i16, i14);
                    }
                    z14 = z10;
                }
            }
            boolean z24 = ykVar3.j[c];
            iArr = ykVar3.ap;
            int i2112 = iArr[c];
            yj yjVar14 = ykVar3.K;
            yj yjVar15 = ykVar3.M;
            int i2113 = ykVar3.Z;
            int i2114 = ykVar3.ac;
            int i2115 = ykVar3.D[c];
            float f6 = ykVar3.ae;
            if (iArr[i15] == 3) {
                z15 = true;
            } else {
                z15 = false;
            }
            c(yaVar, false, z2, z3, z24, yfVarB9, yfVarB, i2112, z13, yjVar14, yjVar15, i2113, i11, i2114, i2115, f6, z8, z15, z4, z5, z11, i10, i8, ykVar3.y, ykVar3.z, ykVar3.A, z14);
        }
        if (z6) {
            ykVar5 = this;
            if (ykVar5.B == 1) {
                yaVar.n(yfVarB5, yfVar, yfVarB3, yfVarB2, ykVar5.C);
            } else {
                yaVar.n(yfVarB3, yfVarB2, yfVarB5, yfVar, ykVar5.C);
            }
        } else {
            ykVar5 = this;
        }
        if (ykVar5.Q.h()) {
            yk ykVar19 = ykVar5.Q.e.d;
            double radians5 = Math.toRadians(ykVar5.E + 90.0f);
            int iB5 = ykVar5.Q.b();
            yf yfVarB11112 = yaVar.b(ykVar5.L(2));
            yf yfVarB11113 = yaVar.b(ykVar5.L(3));
            yf yfVarB11114 = yaVar.b(ykVar5.L(4));
            yf yfVarB11115 = yaVar.b(ykVar5.L(5));
            yf yfVarB11116 = yaVar.b(ykVar19.L(2));
            yf yfVarB11117 = yaVar.b(ykVar19.L(3));
            yf yfVarB11118 = yaVar.b(ykVar19.L(4));
            yf yfVarB11119 = yaVar.b(ykVar19.L(5));
            xy xyVarA9 = yaVar.a();
            double d9 = (float) radians5;
            double d10 = iB5;
            double dSin5 = Math.sin(d9);
            Double.isNaN(d10);
            xyVarA9.j(yfVarB11113, yfVarB11115, yfVarB11117, yfVarB11119, (float) (dSin5 * d10));
            yaVar.e(xyVarA9);
            xy xyVarA10 = yaVar.a();
            double dCos5 = Math.cos(d9);
            Double.isNaN(d10);
            xyVarA10.j(yfVarB11112, yfVarB11114, yfVarB11116, yfVarB11118, (float) (dCos5 * d10));
            yaVar.e(xyVarA10);
        }
        this.b = false;
        this.m = false;
    }

    public boolean d() {
        return this.ag != 8;
    }

    public boolean e() {
        return this.b || (this.J.c && this.L.c);
    }

    public boolean f() {
        return this.m || (this.K.c && this.M.c);
    }

    public final int g() {
        return l() + this.V;
    }

    public final int h() {
        if (this.ag == 8) {
            return 0;
        }
        return this.V;
    }

    public final int i() {
        return k() + this.U;
    }

    public final int j() {
        if (this.ag == 8) {
            return 0;
        }
        return this.U;
    }

    public final int k() {
        yk ykVar = this.T;
        return ykVar != null ? ((yl) ykVar).ar + this.Y : this.Y;
    }

    public final int l() {
        yk ykVar = this.T;
        return ykVar != null ? ((yl) ykVar).as + this.Z : this.Z;
    }

    public final yk m(int i) {
        yj yjVar;
        yj yjVar2;
        if (i != 0) {
            if (i == 1 && (yjVar2 = (yjVar = this.M).e) != null && yjVar2.e == yjVar) {
                return yjVar2.d;
            }
            return null;
        }
        yj yjVar3 = this.L;
        yj yjVar4 = yjVar3.e;
        if (yjVar4 == null || yjVar4.e != yjVar3) {
            return null;
        }
        return yjVar4.d;
    }

    public final yk n(int i) {
        yj yjVar;
        yj yjVar2;
        if (i != 0) {
            if (i == 1 && (yjVar2 = (yjVar = this.K).e) != null && yjVar2.e == yjVar) {
                return yjVar2.d;
            }
            return null;
        }
        yj yjVar3 = this.J;
        yj yjVar4 = yjVar3.e;
        if (yjVar4 == null || yjVar4.e != yjVar3) {
            return null;
        }
        return yjVar4.d;
    }

    public final zg o(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        return null;
    }

    public final void p(yl ylVar, ya yaVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            yp.a(ylVar, yaVar, this);
            hashSet.remove(this);
            b(yaVar, ylVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((yj) it.next()).d.p(ylVar, yaVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((yj) it2.next()).d.p(ylVar, yaVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((yj) it3.next()).d.p(ylVar, yaVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((yj) it4.next()).d.p(ylVar, yaVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((yj) it5.next()).d.p(ylVar, yaVar, hashSet, 1, true);
            }
        }
    }

    public final void q(ya yaVar) {
        yaVar.b(this.J);
        yaVar.b(this.K);
        yaVar.b(this.L);
        yaVar.b(this.M);
        if (this.aa > 0) {
            yaVar.b(this.N);
        }
    }

    public final void r() {
        if (this.h == null) {
            this.h = new zc(this);
        }
        if (this.i == null) {
            this.i = new ze(this);
        }
    }

    public void s() {
        this.J.d();
        this.K.d();
        this.L.d();
        this.M.d();
        this.N.d();
        this.O.d();
        this.P.d();
        this.Q.d();
        this.T = null;
        this.E = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0.5f;
        this.ae = 0.5f;
        int[] iArr = this.ap;
        iArr[0] = 1;
        iArr[1] = 1;
        this.af = null;
        this.ag = 0;
        this.ai = 0;
        this.aj = 0;
        float[] fArr = this.ak;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.p = -1;
        this.q = -1;
        int[] iArr2 = this.D;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.j;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.c;
        zArr2[0] = false;
        zArr2[1] = false;
        this.a = true;
        int[] iArr3 = this.u;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.k = -1;
        this.l = -1;
    }

    public final void t() {
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        int size = this.S.size();
        for (int i = 0; i < size; i++) {
            yj yjVar = (yj) this.S.get(i);
            yjVar.c = false;
            yjVar.b = 0;
        }
    }

    public String toString() {
        String string;
        String str = this.ah;
        if (str != null) {
            StringBuilder sb = new StringBuilder(str.length() + 5);
            sb.append("id: ");
            sb.append(str);
            sb.append(" ");
            string = sb.toString();
        } else {
            string = "";
        }
        int i = this.Y;
        int i2 = this.Z;
        int i3 = this.U;
        int i4 = this.V;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 56);
        sb2.append("");
        sb2.append(string);
        sb2.append("(");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(") - (");
        sb2.append(i3);
        sb2.append(" x ");
        sb2.append(i4);
        sb2.append(")");
        return sb2.toString();
    }

    public void u(xz xzVar) {
        this.J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }

    public final void v(int i) {
        this.aa = i;
        this.F = i > 0;
    }

    public final void w(int i, int i2) {
        if (this.b) {
            return;
        }
        this.J.e(i);
        this.L.e(i2);
        this.Y = i;
        this.U = i2 - i;
        this.b = true;
    }

    public final void x(int i, int i2) {
        if (this.m) {
            return;
        }
        this.K.e(i);
        this.M.e(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.F) {
            this.N.e(i + this.aa);
        }
        this.m = true;
    }

    public final void y(int i) {
        this.V = i;
        int i2 = this.ac;
        if (i < i2) {
            this.V = i2;
        }
    }

    protected final void z(int i, boolean z) {
        this.c[i] = z;
    }
}
