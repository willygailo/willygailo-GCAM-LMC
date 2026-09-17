package defpackage;

import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class yl extends yr {
    public int ar;
    public int as;
    public int c;
    public final yt a = new yt(this);
    public final yw b = new yw(this);
    public zl aG = null;
    public boolean d = false;
    public final ya aq = new ya();
    public int at = 0;
    public int au = 0;
    public yi[] av = new yi[4];
    public yi[] aw = new yi[4];
    public int ax = 257;
    public boolean ay = false;
    public boolean az = false;
    public WeakReference aA = null;
    public WeakReference aB = null;
    public WeakReference aC = null;
    public WeakReference aD = null;
    final HashSet aE = new HashSet();
    public final ys aF = new ys();

    public static void X(yk ykVar, zl zlVar, ys ysVar) {
        int i;
        int i2;
        if (zlVar == null) {
            return;
        }
        if (ykVar.ag == 8 || (ykVar instanceof yn) || (ykVar instanceof yh)) {
            ysVar.c = 0;
            ysVar.d = 0;
            return;
        }
        ysVar.i = ykVar.N();
        ysVar.j = ykVar.O();
        ysVar.a = ykVar.j();
        ysVar.b = ykVar.h();
        ysVar.g = false;
        ysVar.h = 0;
        boolean z = ysVar.i == 3;
        boolean z2 = ysVar.j == 3;
        boolean z3 = z && ykVar.W > 0.0f;
        boolean z4 = z2 && ykVar.W > 0.0f;
        if (z && ykVar.G(0) && ykVar.s == 0 && !z3) {
            ysVar.i = 2;
            if (z2 && ykVar.t == 0) {
                ysVar.i = 1;
                z = false;
            } else {
                z = false;
            }
        }
        if (z2 && ykVar.G(1) && ykVar.t == 0 && !z4) {
            ysVar.j = 2;
            if (z && ykVar.s == 0) {
                ysVar.j = 1;
                z2 = false;
            } else {
                z2 = false;
            }
        }
        if (ykVar.e()) {
            ysVar.i = 1;
            z = false;
        }
        if (ykVar.f()) {
            ysVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (ykVar.u[0] == 4) {
                ysVar.i = 1;
            } else if (!z2) {
                if (ysVar.j == 1) {
                    i2 = ysVar.b;
                } else {
                    ysVar.i = 2;
                    zlVar.a(ykVar, ysVar);
                    i2 = ysVar.d;
                }
                ysVar.i = 1;
                ysVar.a = (int) (ykVar.W * i2);
            }
        }
        if (z4) {
            if (ykVar.u[1] == 4) {
                ysVar.j = 1;
            } else if (!z) {
                if (ysVar.i == 1) {
                    i = ysVar.a;
                } else {
                    ysVar.j = 2;
                    zlVar.a(ykVar, ysVar);
                    i = ysVar.c;
                }
                ysVar.j = 1;
                if (ykVar.X == -1) {
                    ysVar.b = (int) (i / ykVar.W);
                } else {
                    ysVar.b = (int) (ykVar.W * i);
                }
            }
        }
        zlVar.a(ykVar, ysVar);
        ykVar.D(ysVar.c);
        ykVar.y(ysVar.d);
        ykVar.F = ysVar.f;
        ykVar.v(ysVar.e);
        ysVar.h = 0;
        boolean z5 = ysVar.g;
    }

    private final void Z(yj yjVar, yf yfVar) {
        this.aq.g(yfVar, this.aq.b(yjVar), 0, 5);
    }

    private final void aa(yj yjVar, yf yfVar) {
        this.aq.g(this.aq.b(yjVar), yfVar, 0, 5);
    }

    private final void ab() {
        this.at = 0;
        this.au = 0;
    }

    @Override // defpackage.yk
    public final void E(boolean z, boolean z2) {
        super.E(z, z2);
        int size = this.aH.size();
        for (int i = 0; i < size; i++) {
            ((yk) this.aH.get(i)).E(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0262  */
    /* JADX WARN: Code duplicated, block: B:147:0x026d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0292  */
    /* JADX WARN: Code duplicated, block: B:153:0x029f A[LOOP:25: B:146:0x026b->B:153:0x029f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:173:0x0302  */
    /* JADX WARN: Code duplicated, block: B:175:0x0306  */
    /* JADX WARN: Code duplicated, block: B:177:0x030f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0311  */
    /* JADX WARN: Code duplicated, block: B:182:0x0322 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0324  */
    /* JADX WARN: Code duplicated, block: B:186:0x032f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0334  */
    /* JADX WARN: Code duplicated, block: B:191:0x033f  */
    /* JADX WARN: Code duplicated, block: B:201:0x035d  */
    /* JADX WARN: Code duplicated, block: B:218:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:220:0x03af A[LOOP:27: B:219:0x03ad->B:220:0x03af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:224:0x03c6 A[LOOP:28: B:223:0x03c4->B:224:0x03c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:227:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:230:0x03ee A[LOOP:29: B:228:0x03e8->B:230:0x03ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:233:0x0405  */
    /* JADX WARN: Code duplicated, block: B:236:0x040f A[LOOP:30: B:234:0x0409->B:236:0x040f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x0426  */
    /* JADX WARN: Code duplicated, block: B:242:0x0430 A[LOOP:31: B:240:0x042a->B:242:0x0430, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:244:0x0440  */
    /* JADX WARN: Code duplicated, block: B:246:0x0447 A[LOOP:32: B:245:0x0445->B:246:0x0447, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:248:0x0457  */
    /* JADX WARN: Code duplicated, block: B:250:0x045e A[LOOP:33: B:249:0x045c->B:250:0x045e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x046e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0475 A[LOOP:34: B:253:0x0473->B:254:0x0475, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:257:0x0493  */
    /* JADX WARN: Code duplicated, block: B:260:0x049d A[LOOP:35: B:258:0x0497->B:260:0x049d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:263:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:266:0x04be A[LOOP:36: B:264:0x04b8->B:266:0x04be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:272:0x04df A[LOOP:37: B:270:0x04d9->B:272:0x04df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:278:0x04ff A[LOOP:38: B:276:0x04f9->B:278:0x04ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:280:0x050f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0516 A[LOOP:39: B:281:0x0514->B:282:0x0516, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:284:0x0526  */
    /* JADX WARN: Code duplicated, block: B:286:0x0529  */
    /* JADX WARN: Code duplicated, block: B:297:0x0560 A[EDGE_INSN: B:297:0x0560->B:356:0x063b BREAK  A[LOOP:25: B:146:0x026b->B:153:0x029f]] */
    /* JADX WARN: Code duplicated, block: B:298:0x056b  */
    /* JADX WARN: Code duplicated, block: B:300:0x0572  */
    /* JADX WARN: Code duplicated, block: B:302:0x057b  */
    /* JADX WARN: Code duplicated, block: B:305:0x0587  */
    /* JADX WARN: Code duplicated, block: B:308:0x0591  */
    /* JADX WARN: Code duplicated, block: B:310:0x0594  */
    /* JADX WARN: Code duplicated, block: B:313:0x059a  */
    /* JADX WARN: Code duplicated, block: B:314:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:317:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:319:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:322:0x05be  */
    /* JADX WARN: Code duplicated, block: B:325:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:327:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:330:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:331:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:338:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:342:0x0601  */
    /* JADX WARN: Code duplicated, block: B:343:0x0607  */
    /* JADX WARN: Code duplicated, block: B:346:0x0610  */
    /* JADX WARN: Code duplicated, block: B:350:0x0622  */
    /* JADX WARN: Code duplicated, block: B:352:0x0628  */
    /* JADX WARN: Code duplicated, block: B:354:0x0631 A[PHI: r3
      0x0631: PHI (r3v1 int) = (r3v0 int), (r3v52 int) binds: [B:138:0x0247, B:144:0x0260] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:494:0x0875  */
    /* JADX WARN: Code duplicated, block: B:545:0x098e  */
    /* JADX WARN: Code duplicated, block: B:547:0x099e  */
    /* JADX WARN: Code duplicated, block: B:551:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:555:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:561:0x09bd A[LOOP:14: B:560:0x09bb->B:561:0x09bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:564:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:568:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:573:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:576:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:578:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:580:0x0a57 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:586:0x0a75 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:590:0x0a8c  */
    /* JADX WARN: Code duplicated, block: B:591:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:702:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x05cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x05cc A[SYNTHETIC] */
    @Override // defpackage.yr
    public final void T() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        ArrayList arrayList;
        int i8;
        boolean zW;
        int size;
        int i9;
        boolean z2;
        int iMax;
        int iMax2;
        int i10;
        int i11;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        yk ykVar;
        boolean z3;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        Iterator it;
        yh yhVar;
        boolean z4;
        zl zlVar;
        ArrayList arrayList2;
        int size2;
        int i12;
        ArrayList arrayList3;
        int i13;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList9;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        HashSet hashSet4;
        HashSet hashSet5;
        HashSet hashSet6;
        HashSet hashSet7;
        int i18;
        zf zfVar;
        zf zfVar2;
        int i19;
        int iJ;
        int i20;
        int iH;
        int size3;
        int i21;
        int i22;
        zf zfVar3;
        int iA;
        int size4;
        int i23;
        int i24;
        zf zfVar4;
        int iA2;
        int[] iArr;
        int size5;
        int i25;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        int size6;
        int i26;
        int size7;
        int i27;
        int size8;
        int i28;
        Iterator it6;
        Iterator it7;
        Iterator it8;
        int size9;
        int i29;
        int size10;
        int i30;
        yk ykVar2;
        boolean z5;
        yh yhVar2;
        yn ynVar;
        yk ykVar3;
        int i31;
        boolean z6;
        boolean z7;
        boolean z8;
        int i32;
        boolean z9;
        int i33;
        this.Y = 0;
        this.Z = 0;
        this.ay = false;
        this.az = false;
        int size11 = this.aH.size();
        int iMax7 = Math.max(0, j());
        int iMax8 = Math.max(0, h());
        int[] iArr2 = this.ap;
        int i34 = iArr2[1];
        int i35 = iArr2[0];
        int i36 = -1;
        if (this.c == 0 && yp.b(this.ax, 1)) {
            zl zlVar2 = this.aG;
            int iN = N();
            int iO = O();
            yz.b = 0;
            yz.c = 0;
            t();
            ArrayList arrayList10 = this.aH;
            int size12 = arrayList10.size();
            for (int i37 = 0; i37 < size12; i37++) {
                ((yk) arrayList10.get(i37)).t();
            }
            boolean z10 = this.d;
            if (iN == 1) {
                w(0, j());
                i31 = 0;
                z6 = false;
                z7 = false;
            } else {
                this.J.e(0);
                this.Y = 0;
                i31 = 0;
                z6 = false;
                z7 = false;
            }
            while (i31 < size12) {
                yk ykVar4 = (yk) arrayList10.get(i31);
                if (ykVar4 instanceof yn) {
                    yn ynVar2 = (yn) ykVar4;
                    if (ynVar2.aq == 1) {
                        int i38 = ynVar2.b;
                        if (i38 != i36) {
                            ynVar2.a(i38);
                            z6 = true;
                        } else if (ynVar2.c == i36 || !e()) {
                            if (e()) {
                                ynVar2.a((int) ((ynVar2.a * j()) + 0.5f));
                            }
                            z6 = true;
                        } else {
                            ynVar2.a(j() - ynVar2.c);
                            z6 = true;
                        }
                    }
                } else if ((ykVar4 instanceof yh) && ((yh) ykVar4).a() == 0) {
                    z7 = true;
                }
                i31++;
                i36 = -1;
            }
            if (z6) {
                for (int i39 = 0; i39 < size12; i39++) {
                    yk ykVar5 = (yk) arrayList10.get(i39);
                    if (ykVar5 instanceof yn) {
                        yn ynVar3 = (yn) ykVar5;
                        if (ynVar3.aq == 1) {
                            yz.b(0, ynVar3, zlVar2, z10);
                        }
                    }
                }
            }
            yz.b(0, this, zlVar2, z10);
            if (z7) {
                for (int i40 = 0; i40 < size12; i40++) {
                    yk ykVar6 = (yk) arrayList10.get(i40);
                    if (ykVar6 instanceof yh) {
                        yh yhVar3 = (yh) ykVar6;
                        if (yhVar3.a() == 0) {
                            yz.d(yhVar3, zlVar2, 0, z10);
                        }
                    }
                }
            }
            if (iO == 1) {
                i32 = 0;
                x(0, h());
                z8 = false;
                z9 = false;
            } else {
                this.K.e(0);
                this.Z = 0;
                z8 = false;
                i32 = 0;
                z9 = false;
            }
            while (i32 < size12) {
                yk ykVar7 = (yk) arrayList10.get(i32);
                if (ykVar7 instanceof yn) {
                    yn ynVar4 = (yn) ykVar7;
                    if (ynVar4.aq == 0) {
                        int i41 = ynVar4.b;
                        if (i41 != -1) {
                            ynVar4.a(i41);
                            z8 = true;
                        } else if (ynVar4.c == -1 || !f()) {
                            if (f()) {
                                ynVar4.a((int) ((ynVar4.a * h()) + 0.5f));
                            }
                            z8 = true;
                        } else {
                            ynVar4.a(h() - ynVar4.c);
                            z8 = true;
                        }
                    }
                } else if ((ykVar7 instanceof yh) && ((yh) ykVar7).a() == 1) {
                    z9 = true;
                }
                i32++;
            }
            if (z8) {
                for (int i42 = 0; i42 < size12; i42++) {
                    yk ykVar8 = (yk) arrayList10.get(i42);
                    if (ykVar8 instanceof yn) {
                        yn ynVar5 = (yn) ykVar8;
                        if (ynVar5.aq == 0) {
                            yz.c(1, ynVar5, zlVar2);
                        }
                    }
                }
            }
            yz.c(0, this, zlVar2);
            if (z9) {
                for (int i43 = 0; i43 < size12; i43++) {
                    yk ykVar9 = (yk) arrayList10.get(i43);
                    if (ykVar9 instanceof yh) {
                        yh yhVar4 = (yh) ykVar9;
                        if (yhVar4.a() == 1) {
                            yz.d(yhVar4, zlVar2, 1, z10);
                        }
                    }
                }
                i33 = 0;
            } else {
                i33 = 0;
            }
            while (i33 < size12) {
                yk ykVar10 = (yk) arrayList10.get(i33);
                if (ykVar10.K() && yz.a(ykVar10)) {
                    X(ykVar10, zlVar2, yz.a);
                    if (!(ykVar10 instanceof yn)) {
                        yz.b(0, ykVar10, zlVar2, z10);
                        yz.c(0, ykVar10, zlVar2);
                    } else if (((yn) ykVar10).aq == 0) {
                        yz.c(0, ykVar10, zlVar2);
                    } else {
                        yz.b(0, ykVar10, zlVar2, z10);
                    }
                }
                i33++;
            }
            for (int i44 = 0; i44 < size11; i44++) {
                yk ykVar11 = (yk) this.aH.get(i44);
                if (ykVar11.K() && !(ykVar11 instanceof yn) && !(ykVar11 instanceof yh) && !(ykVar11 instanceof yq)) {
                    boolean z11 = ykVar11.G;
                    int iM = ykVar11.M(0);
                    int iM2 = ykVar11.M(1);
                    if (iM != 3 || ykVar11.s == 1 || iM2 != 3 || ykVar11.t == 1) {
                        X(ykVar11, this.aG, new ys());
                    }
                }
            }
        }
        if (size11 <= 2) {
            i = size11;
            i2 = i35;
            i3 = iMax7;
            i4 = i34;
            i5 = iMax8;
            z = false;
            break;
        }
        if (i35 == 2) {
            if (yp.b(this.ax, 1024)) {
                zlVar = this.aG;
                arrayList2 = this.aH;
                size2 = arrayList2.size();
                i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        ykVar3 = (yk) arrayList2.get(i12);
                        if (!wk.c(N(), O(), ykVar3.N(), ykVar3.O())) {
                            i3 = iMax7;
                            i2 = i35;
                            i4 = i34;
                            i = size11;
                            z = false;
                            i5 = iMax8;
                            break;
                        }
                        if (ykVar3 instanceof ym) {
                            i3 = iMax7;
                            i2 = i35;
                            i4 = i34;
                            i = size11;
                            z = false;
                            i5 = iMax8;
                            break;
                        }
                        i12++;
                    } else {
                        arrayList3 = null;
                        i13 = 0;
                        arrayList4 = null;
                        arrayList5 = null;
                        arrayList6 = null;
                        arrayList7 = null;
                        arrayList8 = null;
                        while (i13 < size2) {
                            int i45 = size11;
                            ykVar2 = (yk) arrayList2.get(i13);
                            int i46 = iMax8;
                            int i47 = i34;
                            int i48 = iMax7;
                            int i49 = i35;
                            if (!wk.c(N(), O(), ykVar2.N(), ykVar2.O())) {
                                X(ykVar2, zlVar, this.aF);
                            }
                            z5 = ykVar2 instanceof yn;
                            if (z5) {
                                ynVar = (yn) ykVar2;
                                if (ynVar.aq == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(ynVar);
                                }
                                if (ynVar.aq == 1) {
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(ynVar);
                                }
                            }
                            if (ykVar2 instanceof yo) {
                                if (ykVar2 instanceof yh) {
                                    yhVar2 = (yh) ykVar2;
                                    if (yhVar2.a() == 0) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(yhVar2);
                                    }
                                    if (yhVar2.a() == 1) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                        }
                                        arrayList6.add(yhVar2);
                                    }
                                } else {
                                    yo yoVar = (yo) ykVar2;
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(yoVar);
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(yoVar);
                                }
                            }
                            if (ykVar2.J.e == null && ykVar2.L.e == null && !z5 && !(ykVar2 instanceof yh)) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(ykVar2);
                            }
                            if (ykVar2.K.e != null && ykVar2.M.e == null && ykVar2.N.e == null && !z5 && !(ykVar2 instanceof yh)) {
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(ykVar2);
                            }
                            i13++;
                            iMax8 = i46;
                            size11 = i45;
                            i34 = i47;
                            iMax7 = i48;
                            i35 = i49;
                        }
                        i14 = iMax7;
                        i15 = iMax8;
                        i16 = i35;
                        i17 = i34;
                        i = size11;
                        arrayList9 = new ArrayList();
                        if (arrayList3 != null) {
                            size10 = arrayList3.size();
                            for (i30 = 0; i30 < size10; i30++) {
                                wk.a((yn) arrayList3.get(i30), 0, arrayList9, null);
                            }
                        }
                        if (arrayList4 != null) {
                            size9 = arrayList4.size();
                            for (i29 = 0; i29 < size9; i29++) {
                                yo yoVar2 = (yo) arrayList4.get(i29);
                                zf zfVarA = wk.a(yoVar2, 0, arrayList9, null);
                                yoVar2.T(arrayList9, 0, zfVarA);
                                zfVarA.b(arrayList9);
                            }
                        }
                        hashSet = L(2).a;
                        if (hashSet != null) {
                            it8 = hashSet.iterator();
                            while (it8.hasNext()) {
                                wk.a(((yj) it8.next()).d, 0, arrayList9, null);
                            }
                        }
                        hashSet2 = L(4).a;
                        if (hashSet2 != null) {
                            it7 = hashSet2.iterator();
                            while (it7.hasNext()) {
                                wk.a(((yj) it7.next()).d, 0, arrayList9, null);
                            }
                        }
                        hashSet3 = L(7).a;
                        if (hashSet3 != null) {
                            it6 = hashSet3.iterator();
                            while (it6.hasNext()) {
                                wk.a(((yj) it6.next()).d, 0, arrayList9, null);
                            }
                        }
                        if (arrayList7 != null) {
                            size8 = arrayList7.size();
                            for (i28 = 0; i28 < size8; i28++) {
                                wk.a((yk) arrayList7.get(i28), 0, arrayList9, null);
                            }
                        }
                        if (arrayList5 != null) {
                            size7 = arrayList5.size();
                            for (i27 = 0; i27 < size7; i27++) {
                                wk.a((yn) arrayList5.get(i27), 1, arrayList9, null);
                            }
                        }
                        if (arrayList6 != null) {
                            size6 = arrayList6.size();
                            for (i26 = 0; i26 < size6; i26++) {
                                yo yoVar3 = (yo) arrayList6.get(i26);
                                zf zfVarA2 = wk.a(yoVar3, 1, arrayList9, null);
                                yoVar3.T(arrayList9, 1, zfVarA2);
                                zfVarA2.b(arrayList9);
                            }
                        }
                        hashSet4 = L(3).a;
                        if (hashSet4 != null) {
                            it5 = hashSet4.iterator();
                            while (it5.hasNext()) {
                                wk.a(((yj) it5.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet5 = L(6).a;
                        if (hashSet5 != null) {
                            it4 = hashSet5.iterator();
                            while (it4.hasNext()) {
                                wk.a(((yj) it4.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet6 = L(5).a;
                        if (hashSet6 != null) {
                            it3 = hashSet6.iterator();
                            while (it3.hasNext()) {
                                wk.a(((yj) it3.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet7 = L(7).a;
                        if (hashSet7 != null) {
                            it2 = hashSet7.iterator();
                            while (it2.hasNext()) {
                                wk.a(((yj) it2.next()).d, 1, arrayList9, null);
                            }
                        }
                        if (arrayList8 != null) {
                            size5 = arrayList8.size();
                            for (i25 = 0; i25 < size5; i25++) {
                                wk.a((yk) arrayList8.get(i25), 1, arrayList9, null);
                            }
                            i18 = 0;
                        } else {
                            i18 = 0;
                        }
                        while (i18 < size2) {
                            yk ykVar12 = (yk) arrayList2.get(i18);
                            iArr = ykVar12.ap;
                            if (iArr[0] != 3 && iArr[1] == 3) {
                                zf zfVarB = wk.b(arrayList9, ykVar12.an);
                                zf zfVarB2 = wk.b(arrayList9, ykVar12.ao);
                                if (zfVarB != null && zfVarB2 != null) {
                                    zfVarB.c(0, zfVarB2);
                                    zfVarB2.d = 2;
                                    arrayList9.remove(zfVarB);
                                }
                            }
                            i18++;
                        }
                        if (arrayList9.size() > 1) {
                            i5 = i15;
                            i4 = i17;
                            i3 = i14;
                            i2 = i16;
                            z = false;
                            break;
                        }
                        if (N() == 2) {
                            size4 = arrayList9.size();
                            zfVar = null;
                            i24 = 0;
                            for (i23 = 0; i23 < size4; i23++) {
                                zfVar4 = (zf) arrayList9.get(i23);
                                if (zfVar4.d != 1) {
                                    iA2 = zfVar4.a(this.aq, 0);
                                    if (iA2 > i24) {
                                        zfVar = zfVar4;
                                    }
                                    if (iA2 > i24) {
                                        i24 = iA2;
                                    }
                                }
                            }
                            if (zfVar != null) {
                                Q(1);
                                D(i24);
                            } else {
                                zfVar = null;
                            }
                        } else {
                            zfVar = null;
                        }
                        if (O() == 2) {
                            size3 = arrayList9.size();
                            zfVar2 = null;
                            i22 = 0;
                            for (i21 = 0; i21 < size3; i21++) {
                                zfVar3 = (zf) arrayList9.get(i21);
                                if (zfVar3.d != 0) {
                                    iA = zfVar3.a(this.aq, 1);
                                    if (iA > i22) {
                                        zfVar2 = zfVar3;
                                    }
                                    if (iA > i22) {
                                        i22 = iA;
                                    }
                                }
                            }
                            if (zfVar2 != null) {
                                R(1);
                                y(i22);
                            } else {
                                zfVar2 = null;
                            }
                        } else {
                            zfVar2 = null;
                        }
                        if (zfVar == null || zfVar2 != null) {
                            if (i16 == 2) {
                                i19 = i16;
                                iJ = i14;
                            } else if (i14 < j() || i14 <= 0) {
                                iJ = j();
                                i19 = 2;
                            } else {
                                D(i14);
                                this.ay = true;
                                iJ = i14;
                                i19 = 2;
                            }
                            i20 = i17;
                            if (i20 == 2) {
                                if (i15 < h() || i15 <= 0) {
                                    iH = h();
                                } else {
                                    y(i15);
                                    this.az = true;
                                    iH = i15;
                                }
                                i20 = 2;
                            } else {
                                iH = i15;
                            }
                            i3 = iJ;
                            i5 = iH;
                            i2 = i19;
                            i4 = i20;
                            z = true;
                            break;
                        }
                        i5 = i15;
                        i4 = i17;
                        i3 = i14;
                        i2 = i16;
                    }
                }
            } else {
                i = size11;
                i2 = i35;
                i3 = iMax7;
                i4 = i34;
                i5 = iMax8;
            }
            z = false;
            break;
        } else if (i34 == 2) {
            i34 = 2;
            if (yp.b(this.ax, 1024)) {
                zlVar = this.aG;
                arrayList2 = this.aH;
                size2 = arrayList2.size();
                i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        arrayList3 = null;
                        i13 = 0;
                        arrayList4 = null;
                        arrayList5 = null;
                        arrayList6 = null;
                        arrayList7 = null;
                        arrayList8 = null;
                        while (i13 < size2) {
                            int i410 = size11;
                            ykVar2 = (yk) arrayList2.get(i13);
                            int i411 = iMax8;
                            int i412 = i34;
                            int i413 = iMax7;
                            int i414 = i35;
                            if (!wk.c(N(), O(), ykVar2.N(), ykVar2.O())) {
                                X(ykVar2, zlVar, this.aF);
                            }
                            z5 = ykVar2 instanceof yn;
                            if (z5) {
                                ynVar = (yn) ykVar2;
                                if (ynVar.aq == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(ynVar);
                                }
                                if (ynVar.aq == 1) {
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(ynVar);
                                }
                            }
                            if (ykVar2 instanceof yo) {
                                if (ykVar2 instanceof yh) {
                                    yhVar2 = (yh) ykVar2;
                                    if (yhVar2.a() == 0) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(yhVar2);
                                    }
                                    if (yhVar2.a() == 1) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                        }
                                        arrayList6.add(yhVar2);
                                    }
                                } else {
                                    yo yoVar4 = (yo) ykVar2;
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(yoVar4);
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(yoVar4);
                                }
                            }
                            if (ykVar2.J.e == null) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(ykVar2);
                            }
                            if (ykVar2.K.e != null) {
                            }
                            i13++;
                            iMax8 = i411;
                            size11 = i410;
                            i34 = i412;
                            iMax7 = i413;
                            i35 = i414;
                        }
                        i14 = iMax7;
                        i15 = iMax8;
                        i16 = i35;
                        i17 = i34;
                        i = size11;
                        arrayList9 = new ArrayList();
                        if (arrayList3 != null) {
                            size10 = arrayList3.size();
                            while (i30 < size10) {
                                wk.a((yn) arrayList3.get(i30), 0, arrayList9, null);
                            }
                        }
                        if (arrayList4 != null) {
                            size9 = arrayList4.size();
                            while (i29 < size9) {
                                yo yoVar5 = (yo) arrayList4.get(i29);
                                zf zfVarA3 = wk.a(yoVar5, 0, arrayList9, null);
                                yoVar5.T(arrayList9, 0, zfVarA3);
                                zfVarA3.b(arrayList9);
                            }
                        }
                        hashSet = L(2).a;
                        if (hashSet != null) {
                            it8 = hashSet.iterator();
                            while (it8.hasNext()) {
                                wk.a(((yj) it8.next()).d, 0, arrayList9, null);
                            }
                        }
                        hashSet2 = L(4).a;
                        if (hashSet2 != null) {
                            it7 = hashSet2.iterator();
                            while (it7.hasNext()) {
                                wk.a(((yj) it7.next()).d, 0, arrayList9, null);
                            }
                        }
                        hashSet3 = L(7).a;
                        if (hashSet3 != null) {
                            it6 = hashSet3.iterator();
                            while (it6.hasNext()) {
                                wk.a(((yj) it6.next()).d, 0, arrayList9, null);
                            }
                        }
                        if (arrayList7 != null) {
                            size8 = arrayList7.size();
                            while (i28 < size8) {
                                wk.a((yk) arrayList7.get(i28), 0, arrayList9, null);
                            }
                        }
                        if (arrayList5 != null) {
                            size7 = arrayList5.size();
                            while (i27 < size7) {
                                wk.a((yn) arrayList5.get(i27), 1, arrayList9, null);
                            }
                        }
                        if (arrayList6 != null) {
                            size6 = arrayList6.size();
                            while (i26 < size6) {
                                yo yoVar6 = (yo) arrayList6.get(i26);
                                zf zfVarA4 = wk.a(yoVar6, 1, arrayList9, null);
                                yoVar6.T(arrayList9, 1, zfVarA4);
                                zfVarA4.b(arrayList9);
                            }
                        }
                        hashSet4 = L(3).a;
                        if (hashSet4 != null) {
                            it5 = hashSet4.iterator();
                            while (it5.hasNext()) {
                                wk.a(((yj) it5.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet5 = L(6).a;
                        if (hashSet5 != null) {
                            it4 = hashSet5.iterator();
                            while (it4.hasNext()) {
                                wk.a(((yj) it4.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet6 = L(5).a;
                        if (hashSet6 != null) {
                            it3 = hashSet6.iterator();
                            while (it3.hasNext()) {
                                wk.a(((yj) it3.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet7 = L(7).a;
                        if (hashSet7 != null) {
                            it2 = hashSet7.iterator();
                            while (it2.hasNext()) {
                                wk.a(((yj) it2.next()).d, 1, arrayList9, null);
                            }
                        }
                        if (arrayList8 != null) {
                            size5 = arrayList8.size();
                            while (i25 < size5) {
                                wk.a((yk) arrayList8.get(i25), 1, arrayList9, null);
                            }
                            i18 = 0;
                        } else {
                            i18 = 0;
                        }
                        while (i18 < size2) {
                            yk ykVar13 = (yk) arrayList2.get(i18);
                            iArr = ykVar13.ap;
                            if (iArr[0] != 3) {
                            }
                            i18++;
                        }
                        if (arrayList9.size() > 1) {
                            if (N() == 2) {
                                size4 = arrayList9.size();
                                zfVar = null;
                                i24 = 0;
                                while (i23 < size4) {
                                    zfVar4 = (zf) arrayList9.get(i23);
                                    if (zfVar4.d != 1) {
                                        iA2 = zfVar4.a(this.aq, 0);
                                        if (iA2 > i24) {
                                            zfVar = zfVar4;
                                        }
                                        if (iA2 > i24) {
                                            i24 = iA2;
                                        }
                                    }
                                }
                                if (zfVar != null) {
                                    Q(1);
                                    D(i24);
                                } else {
                                    zfVar = null;
                                }
                            } else {
                                zfVar = null;
                            }
                            if (O() == 2) {
                                size3 = arrayList9.size();
                                zfVar2 = null;
                                i22 = 0;
                                while (i21 < size3) {
                                    zfVar3 = (zf) arrayList9.get(i21);
                                    if (zfVar3.d != 0) {
                                        iA = zfVar3.a(this.aq, 1);
                                        if (iA > i22) {
                                            zfVar2 = zfVar3;
                                        }
                                        if (iA > i22) {
                                            i22 = iA;
                                        }
                                    }
                                }
                                if (zfVar2 != null) {
                                    R(1);
                                    y(i22);
                                } else {
                                    zfVar2 = null;
                                }
                            } else {
                                zfVar2 = null;
                            }
                            if (zfVar == null) {
                            }
                            if (i16 == 2) {
                                i19 = i16;
                                iJ = i14;
                            } else if (i14 < j()) {
                                iJ = j();
                                i19 = 2;
                            } else {
                                iJ = j();
                                i19 = 2;
                            }
                            i20 = i17;
                            if (i20 == 2) {
                                if (i15 < h()) {
                                    iH = h();
                                } else {
                                    iH = h();
                                }
                                i20 = 2;
                            } else {
                                iH = i15;
                            }
                            i3 = iJ;
                            i5 = iH;
                            i2 = i19;
                            i4 = i20;
                            z = true;
                            break;
                        }
                        i5 = i15;
                        i4 = i17;
                        i3 = i14;
                        i2 = i16;
                        z = false;
                        break;
                    }
                    ykVar3 = (yk) arrayList2.get(i12);
                    if (!wk.c(N(), O(), ykVar3.N(), ykVar3.O())) {
                        i3 = iMax7;
                        i2 = i35;
                        i4 = i34;
                        i = size11;
                        z = false;
                        i5 = iMax8;
                        break;
                    }
                    if (ykVar3 instanceof ym) {
                        i3 = iMax7;
                        i2 = i35;
                        i4 = i34;
                        i = size11;
                        z = false;
                        i5 = iMax8;
                        break;
                    }
                    i12++;
                }
            } else {
                i = size11;
                i2 = i35;
                i3 = iMax7;
                i4 = i34;
                i5 = iMax8;
            }
            z = false;
            break;
        } else {
            i3 = iMax7;
            i2 = i35;
            i4 = i34;
            i = size11;
            z = false;
            i5 = iMax8;
        }
        int i50 = 64;
        boolean z12 = W(64) || W(128);
        ya yaVar = this.aq;
        yaVar.f = false;
        yaVar.g = false;
        if (this.ax != 0 && z12) {
            yaVar.g = true;
        }
        ArrayList arrayList11 = this.aH;
        boolean z13 = N() == 2 || O() == 2;
        ab();
        int i51 = 0;
        while (true) {
            i6 = i;
            if (i51 >= i6) {
                break;
            }
            yk ykVar14 = (yk) this.aH.get(i51);
            if (ykVar14 instanceof yr) {
                ((yr) ykVar14).T();
            }
            i51++;
            i = i6;
        }
        boolean z14 = z;
        boolean z15 = true;
        int i52 = 0;
        while (z15) {
            int i53 = i52 + 1;
            try {
                this.aq.k();
                ab();
                q(this.aq);
                for (int i54 = 0; i54 < i6; i54++) {
                    ((yk) this.aH.get(i54)).q(this.aq);
                }
                ya yaVar2 = this.aq;
                boolean zW2 = W(i50);
                b(yaVar2, zW2);
                int size13 = this.aH.size();
                int i55 = 0;
                boolean z16 = false;
                while (i55 < size13) {
                    yk ykVar15 = (yk) this.aH.get(i55);
                    ykVar15.z(0, false);
                    int i56 = i53;
                    try {
                        ykVar15.z(1, false);
                        z16 |= ykVar15 instanceof yh;
                        i55++;
                        i53 = i56;
                    } catch (Exception e) {
                        e = e;
                        i7 = i5;
                        arrayList = arrayList11;
                        i8 = i56;
                        e.printStackTrace();
                        PrintStream printStream = System.out;
                        String strValueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 12);
                        sb.append("EXCEPTION : ");
                        sb.append(strValueOf);
                        printStream.println(sb.toString());
                        yp.a[2] = false;
                        zW = W(64);
                        S(zW);
                        size = this.aH.size();
                        z2 = false;
                        for (i9 = 0; i9 < size; i9++) {
                            ykVar = (yk) this.aH.get(i9);
                            ykVar.S(zW);
                            if (ykVar.k == -1) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            z2 |= z3;
                        }
                        if (z13) {
                            iMax3 = 0;
                            iMax4 = 0;
                            for (i11 = 0; i11 < i6; i11++) {
                                yk ykVar16 = (yk) this.aH.get(i11);
                                iMax3 = Math.max(iMax3, ykVar16.Y + ykVar16.j());
                                iMax4 = Math.max(iMax4, ykVar16.Z + ykVar16.h());
                            }
                            iMax5 = Math.max(this.ab, iMax3);
                            iMax6 = Math.max(this.ac, iMax4);
                            if (i2 == 2) {
                                D(iMax5);
                                this.ap[0] = 2;
                                z2 = true;
                                z14 = true;
                            }
                            if (i4 == 2) {
                                y(iMax6);
                                this.ap[1] = 2;
                                z2 = true;
                                z14 = true;
                            }
                        }
                        iMax = Math.max(this.ab, j());
                        if (iMax > j()) {
                            D(iMax);
                            this.ap[0] = 1;
                            z2 = true;
                            z14 = true;
                        }
                        iMax2 = Math.max(this.ac, h());
                        if (iMax2 > h()) {
                            y(iMax2);
                            this.ap[1] = 1;
                            z2 = true;
                            z14 = true;
                        }
                        if (z14) {
                            i10 = i7;
                        } else {
                            if (this.ap[0] == 2) {
                                this.ay = true;
                                this.ap[0] = 1;
                                D(i3);
                                z2 = true;
                                z14 = true;
                            }
                            if (this.ap[1] == 2) {
                                i10 = i7;
                            } else {
                                i10 = i7;
                            }
                            i52 = i8;
                            arrayList11 = arrayList;
                            i50 = 64;
                            i5 = i10;
                        }
                        z15 = z2;
                        i52 = i8;
                        arrayList11 = arrayList;
                        i50 = 64;
                        i5 = i10;
                    }
                }
                int i57 = i53;
                if (z16) {
                    for (int i58 = 0; i58 < size13; i58++) {
                        yk ykVar17 = (yk) this.aH.get(i58);
                        if (ykVar17 instanceof yh) {
                            yh yhVar5 = (yh) ykVar17;
                            int i59 = 0;
                            while (i59 < yhVar5.ar) {
                                yk ykVar18 = yhVar5.aq[i59];
                                if (yhVar5.b || ykVar18.d()) {
                                    int i60 = yhVar5.a;
                                    if (i60 != 0) {
                                        yhVar = yhVar5;
                                        if (i60 == 1) {
                                            z4 = true;
                                        } else if (i60 == 2 || i60 == 3) {
                                            ykVar18.z(1, true);
                                        }
                                    } else {
                                        yhVar = yhVar5;
                                        z4 = true;
                                    }
                                    ykVar18.z(0, z4);
                                } else {
                                    yhVar = yhVar5;
                                }
                                i59++;
                                yhVar5 = yhVar;
                            }
                        }
                    }
                }
                this.aE.clear();
                int i61 = 0;
                while (i61 < size13) {
                    int i62 = i5;
                    ArrayList arrayList12 = arrayList11;
                    int i63 = i57;
                    boolean z17 = zW2;
                    yk ykVar19 = (yk) this.aH.get(i61);
                    if (ykVar19.F()) {
                        if (ykVar19 instanceof yq) {
                            this.aE.add(ykVar19);
                        } else {
                            ykVar19.b(yaVar2, z17);
                        }
                    }
                    i61++;
                    i57 = i63;
                    zW2 = z17;
                    arrayList11 = arrayList12;
                    i5 = i62;
                }
                while (this.aE.size() > 0) {
                    int size14 = this.aE.size();
                    Iterator it9 = this.aE.iterator();
                    while (it9.hasNext()) {
                        yq yqVar = (yq) ((yk) it9.next());
                        HashSet hashSet8 = this.aE;
                        int i64 = 0;
                        while (true) {
                            it = it9;
                            if (i64 < yqVar.ar) {
                                if (hashSet8.contains(yqVar.aq[i64])) {
                                    yqVar.b(yaVar2, zW2);
                                    this.aE.remove(yqVar);
                                    break;
                                } else {
                                    i64++;
                                    it9 = it;
                                }
                            }
                        }
                        it9 = it;
                    }
                    if (size14 == this.aE.size()) {
                        Iterator it10 = this.aE.iterator();
                        while (it10.hasNext()) {
                            ((yk) it10.next()).b(yaVar2, zW2);
                        }
                        this.aE.clear();
                    }
                }
                if (ya.a) {
                    try {
                        HashSet<yk> hashSet9 = new HashSet();
                        for (int i65 = 0; i65 < size13; i65++) {
                            yk ykVar20 = (yk) this.aH.get(i65);
                            if (!ykVar20.F()) {
                                hashSet9.add(ykVar20);
                            }
                        }
                        arrayList = arrayList11;
                        boolean z18 = zW2;
                        i7 = i5;
                        i8 = i57;
                        try {
                            p(this, yaVar2, hashSet9, N() == 2 ? 0 : 1, false);
                            for (yk ykVar21 : hashSet9) {
                                yp.a(this, yaVar2, ykVar21);
                                ykVar21.b(yaVar2, z18);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            PrintStream printStream2 = System.out;
                            String strValueOf2 = String.valueOf(e);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 12);
                            sb2.append("EXCEPTION : ");
                            sb2.append(strValueOf2);
                            printStream2.println(sb2.toString());
                            yp.a[2] = false;
                            zW = W(64);
                            S(zW);
                            size = this.aH.size();
                            z2 = false;
                            while (i9 < size) {
                                ykVar = (yk) this.aH.get(i9);
                                ykVar.S(zW);
                                if (ykVar.k == -1) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                z2 |= z3;
                            }
                            if (z13) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i11 < i6) {
                                    yk ykVar110 = (yk) this.aH.get(i11);
                                    iMax3 = Math.max(iMax3, ykVar110.Y + ykVar110.j());
                                    iMax4 = Math.max(iMax4, ykVar110.Z + ykVar110.h());
                                }
                                iMax5 = Math.max(this.ab, iMax3);
                                iMax6 = Math.max(this.ac, iMax4);
                                if (i2 == 2) {
                                    D(iMax5);
                                    this.ap[0] = 2;
                                    z2 = true;
                                    z14 = true;
                                }
                                if (i4 == 2) {
                                    y(iMax6);
                                    this.ap[1] = 2;
                                    z2 = true;
                                    z14 = true;
                                }
                            }
                            iMax = Math.max(this.ab, j());
                            if (iMax > j()) {
                                D(iMax);
                                this.ap[0] = 1;
                                z2 = true;
                                z14 = true;
                            }
                            iMax2 = Math.max(this.ac, h());
                            if (iMax2 > h()) {
                                y(iMax2);
                                this.ap[1] = 1;
                                z2 = true;
                                z14 = true;
                            }
                            if (z14) {
                                if (this.ap[0] == 2) {
                                    this.ay = true;
                                    this.ap[0] = 1;
                                    D(i3);
                                    z2 = true;
                                    z14 = true;
                                }
                                if (this.ap[1] == 2) {
                                    i10 = i7;
                                } else {
                                    i10 = i7;
                                }
                                i52 = i8;
                                arrayList11 = arrayList;
                                i50 = 64;
                                i5 = i10;
                            } else {
                                i10 = i7;
                            }
                            z15 = z2;
                            i52 = i8;
                            arrayList11 = arrayList;
                            i50 = 64;
                            i5 = i10;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i7 = i5;
                        arrayList = arrayList11;
                        i8 = i57;
                    }
                } else {
                    i7 = i5;
                    arrayList = arrayList11;
                    i8 = i57;
                    boolean z19 = zW2;
                    for (int i66 = 0; i66 < size13; i66++) {
                        yk ykVar22 = (yk) this.aH.get(i66);
                        if (ykVar22 instanceof yl) {
                            int[] iArr3 = ykVar22.ap;
                            int i67 = iArr3[0];
                            int i68 = iArr3[1];
                            if (i67 == 2) {
                                ykVar22.Q(1);
                                i67 = 2;
                            }
                            if (i68 == 2) {
                                ykVar22.R(1);
                                i68 = 2;
                            }
                            ykVar22.b(yaVar2, z19);
                            if (i67 == 2) {
                                ykVar22.Q(2);
                            }
                            if (i68 == 2) {
                                ykVar22.R(2);
                            }
                        } else {
                            yp.a(this, yaVar2, ykVar22);
                            if (!ykVar22.F()) {
                                ykVar22.b(yaVar2, z19);
                            }
                        }
                    }
                }
                if (this.at > 0) {
                    try {
                        vk.d(this, yaVar2, null, 0);
                        if (this.au > 0) {
                            vk.d(this, yaVar2, null, 1);
                        }
                        weakReference = this.aA;
                        if (weakReference != null && weakReference.get() != null) {
                            aa((yj) this.aA.get(), this.aq.b(this.K));
                            this.aA = null;
                        }
                        weakReference2 = this.aC;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            Z((yj) this.aC.get(), this.aq.b(this.M));
                            this.aC = null;
                        }
                        weakReference3 = this.aB;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            aa((yj) this.aB.get(), this.aq.b(this.J));
                            this.aB = null;
                        }
                        weakReference4 = this.aD;
                        if (weakReference4 == null && weakReference4.get() != null) {
                            Z((yj) this.aD.get(), this.aq.b(this.L));
                            try {
                                this.aD = null;
                            } catch (Exception e4) {
                                e = e4;
                                e.printStackTrace();
                                PrintStream printStream3 = System.out;
                                String strValueOf3 = String.valueOf(e);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 12);
                                sb3.append("EXCEPTION : ");
                                sb3.append(strValueOf3);
                                printStream3.println(sb3.toString());
                            }
                        }
                        this.aq.j();
                    } catch (Exception e5) {
                        e = e5;
                        e.printStackTrace();
                        PrintStream printStream4 = System.out;
                        String strValueOf4 = String.valueOf(e);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf4).length() + 12);
                        sb4.append("EXCEPTION : ");
                        sb4.append(strValueOf4);
                        printStream4.println(sb4.toString());
                        yp.a[2] = false;
                        zW = W(64);
                        S(zW);
                        size = this.aH.size();
                        z2 = false;
                        while (i9 < size) {
                            ykVar = (yk) this.aH.get(i9);
                            ykVar.S(zW);
                            if (ykVar.k == -1) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            z2 |= z3;
                        }
                        if (z13) {
                            iMax3 = 0;
                            iMax4 = 0;
                            while (i11 < i6) {
                                yk ykVar111 = (yk) this.aH.get(i11);
                                iMax3 = Math.max(iMax3, ykVar111.Y + ykVar111.j());
                                iMax4 = Math.max(iMax4, ykVar111.Z + ykVar111.h());
                            }
                            iMax5 = Math.max(this.ab, iMax3);
                            iMax6 = Math.max(this.ac, iMax4);
                            if (i2 == 2) {
                                D(iMax5);
                                this.ap[0] = 2;
                                z2 = true;
                                z14 = true;
                            }
                            if (i4 == 2) {
                                y(iMax6);
                                this.ap[1] = 2;
                                z2 = true;
                                z14 = true;
                            }
                        }
                        iMax = Math.max(this.ab, j());
                        if (iMax > j()) {
                            D(iMax);
                            this.ap[0] = 1;
                            z2 = true;
                            z14 = true;
                        }
                        iMax2 = Math.max(this.ac, h());
                        if (iMax2 > h()) {
                            y(iMax2);
                            this.ap[1] = 1;
                            z2 = true;
                            z14 = true;
                        }
                        if (z14) {
                            if (this.ap[0] == 2) {
                                this.ay = true;
                                this.ap[0] = 1;
                                D(i3);
                                z2 = true;
                                z14 = true;
                            }
                            if (this.ap[1] == 2) {
                                i10 = i7;
                            } else {
                                i10 = i7;
                            }
                            i52 = i8;
                            arrayList11 = arrayList;
                            i50 = 64;
                            i5 = i10;
                        } else {
                            i10 = i7;
                        }
                        z15 = z2;
                        i52 = i8;
                        arrayList11 = arrayList;
                        i50 = 64;
                        i5 = i10;
                    }
                } else {
                    if (this.au > 0) {
                        vk.d(this, yaVar2, null, 1);
                    }
                    weakReference = this.aA;
                    if (weakReference != null) {
                        aa((yj) this.aA.get(), this.aq.b(this.K));
                        this.aA = null;
                    }
                    weakReference2 = this.aC;
                    if (weakReference2 != null) {
                        Z((yj) this.aC.get(), this.aq.b(this.M));
                        this.aC = null;
                    }
                    weakReference3 = this.aB;
                    if (weakReference3 != null) {
                        aa((yj) this.aB.get(), this.aq.b(this.J));
                        this.aB = null;
                    }
                    weakReference4 = this.aD;
                    if (weakReference4 == null) {
                    }
                    this.aq.j();
                }
            } catch (Exception e6) {
                e = e6;
                i7 = i5;
                arrayList = arrayList11;
                i8 = i53;
            }
            yp.a[2] = false;
            zW = W(64);
            S(zW);
            size = this.aH.size();
            z2 = false;
            while (i9 < size) {
                ykVar = (yk) this.aH.get(i9);
                ykVar.S(zW);
                if (ykVar.k == -1 || ykVar.l != -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z2 |= z3;
            }
            if (z13 && i8 < 8 && yp.a[2]) {
                iMax3 = 0;
                iMax4 = 0;
                while (i11 < i6) {
                    yk ykVar112 = (yk) this.aH.get(i11);
                    iMax3 = Math.max(iMax3, ykVar112.Y + ykVar112.j());
                    iMax4 = Math.max(iMax4, ykVar112.Z + ykVar112.h());
                }
                iMax5 = Math.max(this.ab, iMax3);
                iMax6 = Math.max(this.ac, iMax4);
                if (i2 == 2 && j() < iMax5) {
                    D(iMax5);
                    this.ap[0] = 2;
                    z2 = true;
                    z14 = true;
                }
                if (i4 == 2 && h() < iMax6) {
                    y(iMax6);
                    this.ap[1] = 2;
                    z2 = true;
                    z14 = true;
                }
            }
            iMax = Math.max(this.ab, j());
            if (iMax > j()) {
                D(iMax);
                this.ap[0] = 1;
                z2 = true;
                z14 = true;
            }
            iMax2 = Math.max(this.ac, h());
            if (iMax2 > h()) {
                y(iMax2);
                this.ap[1] = 1;
                z2 = true;
                z14 = true;
            }
            if (z14) {
                if (this.ap[0] == 2 && i3 > 0 && j() > i3) {
                    this.ay = true;
                    this.ap[0] = 1;
                    D(i3);
                    z2 = true;
                    z14 = true;
                }
                if (this.ap[1] == 2 || i7 <= 0) {
                    i10 = i7;
                } else {
                    i10 = i7;
                    if (h() > i10) {
                        this.az = true;
                        this.ap[1] = 1;
                        y(i10);
                        z15 = true;
                        z14 = true;
                    }
                    i52 = i8;
                    arrayList11 = arrayList;
                    i50 = 64;
                    i5 = i10;
                }
            } else {
                i10 = i7;
            }
            z15 = z2;
            i52 = i8;
            arrayList11 = arrayList;
            i50 = 64;
            i5 = i10;
        }
        this.aH = arrayList11;
        if (z14) {
            int[] iArr4 = this.ap;
            iArr4[0] = i2;
            iArr4[1] = i4;
        }
        u(this.aq.j);
    }

    public final void U(int i) {
        this.ax = i;
        ya.a = W(512);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:72:0x0042 A[SYNTHETIC] */
    public final boolean V(boolean z, int i) {
        boolean z2;
        ArrayList arrayList;
        int size;
        int i2;
        boolean z3;
        zg zgVar;
        yw ywVar = this.b;
        boolean z4 = false;
        int iM = ywVar.a.M(0);
        int iM2 = ywVar.a.M(1);
        int iK = ywVar.a.k();
        int iL = ywVar.a.l();
        if (z) {
            if (iM == 2) {
                arrayList = ywVar.e;
                size = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = true;
                        break;
                    }
                    zgVar = (zg) arrayList.get(i2);
                    if (zgVar.g != i && !zgVar.e()) {
                        z3 = false;
                        break;
                    }
                    i2++;
                }
                if (i == 0) {
                    if (z3 && iM == 2) {
                        ywVar.a.Q(1);
                        yl ylVar = ywVar.a;
                        ylVar.D(ywVar.a(ylVar, 0));
                        yl ylVar2 = ywVar.a;
                        ylVar2.h.f.c(ylVar2.j());
                    }
                } else if (z3 && iM2 == 2) {
                    ywVar.a.R(1);
                    yl ylVar3 = ywVar.a;
                    ylVar3.y(ywVar.a(ylVar3, 1));
                    yl ylVar4 = ywVar.a;
                    ylVar4.i.f.c(ylVar4.h());
                }
            } else if (iM2 == 2) {
                iM2 = 2;
                arrayList = ywVar.e;
                size = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = true;
                        break;
                    }
                    zgVar = (zg) arrayList.get(i2);
                    if (zgVar.g != i) {
                    }
                    i2++;
                }
                if (i == 0) {
                    if (z3) {
                        ywVar.a.Q(1);
                        yl ylVar5 = ywVar.a;
                        ylVar5.D(ywVar.a(ylVar5, 0));
                        yl ylVar6 = ywVar.a;
                        ylVar6.h.f.c(ylVar6.j());
                    }
                } else if (z3) {
                    ywVar.a.R(1);
                    yl ylVar7 = ywVar.a;
                    ylVar7.y(ywVar.a(ylVar7, 1));
                    yl ylVar8 = ywVar.a;
                    ylVar8.i.f.c(ylVar8.h());
                }
            }
        }
        if (i == 0) {
            yl ylVar9 = ywVar.a;
            int i3 = ylVar9.ap[0];
            if (i3 == 1 || i3 == 4) {
                int iJ = ylVar9.j() + iK;
                ywVar.a.h.j.c(iJ);
                ywVar.a.h.f.c(iJ - iK);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            yl ylVar10 = ywVar.a;
            int i4 = ylVar10.ap[1];
            if (i4 == 1 || i4 == 4) {
                int iH = ylVar10.h() + iL;
                ywVar.a.i.j.c(iH);
                ywVar.a.i.f.c(iH - iL);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        ywVar.c();
        ArrayList arrayList2 = ywVar.e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            zg zgVar2 = (zg) arrayList2.get(i5);
            if (zgVar2.g == i && (zgVar2.d != ywVar.a || zgVar2.h)) {
                zgVar2.c();
            }
        }
        ArrayList arrayList3 = ywVar.e;
        int size3 = arrayList3.size();
        for (int i6 = 0; i6 < size3; i6++) {
            zg zgVar3 = (zg) arrayList3.get(i6);
            if (zgVar3.g == i && ((z2 || zgVar3.d != ywVar.a) && !(zgVar3.i.i && zgVar3.j.i && ((zgVar3 instanceof yu) || zgVar3.f.i)))) {
                ywVar.a.Q(iM);
                ywVar.a.R(iM2);
                return z4;
            }
        }
        z4 = true;
        ywVar.a.Q(iM);
        ywVar.a.R(iM2);
        return z4;
    }

    public final boolean W(int i) {
        return (this.ax & i) == i;
    }

    final void a(yk ykVar, int i) {
        if (i == 0) {
            int i2 = this.at;
            yi[] yiVarArr = this.aw;
            int length = yiVarArr.length;
            if (i2 + 1 >= length) {
                this.aw = (yi[]) Arrays.copyOf(yiVarArr, length + length);
            }
            this.aw[this.at] = new yi(ykVar, 0, this.d);
            this.at++;
            return;
        }
        int i3 = this.au;
        yi[] yiVarArr2 = this.av;
        int length2 = yiVarArr2.length;
        if (i3 + 1 >= length2) {
            this.av = (yi[]) Arrays.copyOf(yiVarArr2, length2 + length2);
        }
        this.av[this.au] = new yi(ykVar, 1, this.d);
        this.au++;
    }

    public final void c() {
        this.b.b = true;
    }

    @Override // defpackage.yr, defpackage.yk
    public final void s() {
        this.aq.k();
        this.ar = 0;
        this.as = 0;
        super.s();
    }
}
