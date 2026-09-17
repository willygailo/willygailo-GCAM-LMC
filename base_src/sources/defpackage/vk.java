package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class vk {
    public static final List a(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailablePhysicalCameraRequestKeys();
    }

    public static final List b(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionKeys();
    }

    public static final Set c(CameraCharacteristics cameraCharacteristics) {
        Set<String> physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
        physicalCameraIds.getClass();
        return physicalCameraIds;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0296  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    public static void d(yl ylVar, ya yaVar, ArrayList arrayList, int i) {
        int i2;
        yi[] yiVarArr;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        yi[] yiVarArr2;
        yi yiVar;
        yk ykVar;
        int i6;
        yj yjVar;
        yf yfVar;
        yf yfVar2;
        yk ykVar2;
        yj yjVar2;
        yf yfVar3;
        int i7;
        yk ykVar3;
        int size;
        yk ykVar4;
        yk ykVar5;
        float f;
        yk ykVar6;
        yl ylVar2 = ylVar;
        int i8 = 2;
        if (i == 0) {
            i2 = ylVar2.at;
            yiVarArr = ylVar2.aw;
            i3 = 0;
        } else {
            i2 = ylVar2.au;
            yiVarArr = ylVar2.av;
            i3 = 2;
        }
        int i9 = 0;
        while (i9 < i2) {
            yi yiVar2 = yiVarArr[i9];
            int i10 = 8;
            if (!yiVar2.t) {
                int i11 = yiVar2.o;
                int i12 = i11 + i11;
                yk ykVar7 = yiVar2.a;
                yk ykVar8 = ykVar7;
                boolean z5 = false;
                while (!z5) {
                    yiVar2.i++;
                    yk[] ykVarArr = ykVar7.am;
                    int i13 = yiVar2.o;
                    ykVarArr[i13] = null;
                    ykVar7.al[i13] = null;
                    if (ykVar7.ag != i10) {
                        yiVar2.l++;
                        if (ykVar7.M(i13) != 3) {
                            yiVar2.m += yiVar2.o == 0 ? ykVar7.j() : ykVar7.h();
                        }
                        int iB = yiVar2.m + ykVar7.R[i12].b();
                        yiVar2.m = iB;
                        int i14 = i12 + 1;
                        yiVar2.m = iB + ykVar7.R[i14].b();
                        int iB2 = yiVar2.n + ykVar7.R[i12].b();
                        yiVar2.n = iB2;
                        yiVar2.n = iB2 + ykVar7.R[i14].b();
                        if (yiVar2.b == null) {
                            yiVar2.b = ykVar7;
                        }
                        yiVar2.d = ykVar7;
                        int[] iArr = ykVar7.ap;
                        int i15 = yiVar2.o;
                        if (iArr[i15] == 3) {
                            int i16 = ykVar7.u[i15];
                            if (i16 == 0 || i16 == 3) {
                                yiVar2.j++;
                                f = ykVar7.ak[i15];
                                if (f > 0.0f) {
                                    yiVar2.k += f;
                                }
                                if (ykVar7.ag != 8 && (i16 == 0 || i16 == 3)) {
                                    if (f < 0.0f) {
                                        yiVar2.q = true;
                                    } else {
                                        yiVar2.r = true;
                                    }
                                    if (yiVar2.h == null) {
                                        yiVar2.h = new ArrayList();
                                    }
                                    yiVar2.h.add(ykVar7);
                                }
                                if (yiVar2.f == null) {
                                    yiVar2.f = ykVar7;
                                }
                                ykVar6 = yiVar2.g;
                                if (ykVar6 != null) {
                                    ykVar6.al[yiVar2.o] = ykVar7;
                                }
                                yiVar2.g = ykVar7;
                            } else if (i16 == i8) {
                                i16 = 2;
                                yiVar2.j++;
                                f = ykVar7.ak[i15];
                                if (f > 0.0f) {
                                    yiVar2.k += f;
                                }
                                if (ykVar7.ag != 8) {
                                    if (f < 0.0f) {
                                        yiVar2.q = true;
                                    } else {
                                        yiVar2.r = true;
                                    }
                                    if (yiVar2.h == null) {
                                        yiVar2.h = new ArrayList();
                                    }
                                    yiVar2.h.add(ykVar7);
                                }
                                if (yiVar2.f == null) {
                                    yiVar2.f = ykVar7;
                                }
                                ykVar6 = yiVar2.g;
                                if (ykVar6 != null) {
                                    ykVar6.al[yiVar2.o] = ykVar7;
                                }
                                yiVar2.g = ykVar7;
                            }
                            int i17 = yiVar2.o;
                        }
                    }
                    if (ykVar8 != ykVar7) {
                        ykVar8.am[yiVar2.o] = ykVar7;
                    }
                    yj yjVar3 = ykVar7.R[i12 + 1].e;
                    if (yjVar3 != null) {
                        ykVar5 = yjVar3.d;
                        yj yjVar4 = ykVar5.R[i12].e;
                        if (yjVar4 == null || yjVar4.d != ykVar7) {
                            ykVar5 = null;
                        }
                    } else {
                        ykVar5 = null;
                    }
                    boolean z6 = ykVar5 == null;
                    if (ykVar5 == null) {
                        ykVar5 = ykVar7;
                    }
                    z5 = z6;
                    i10 = 8;
                    i8 = 2;
                    ykVar8 = ykVar7;
                    ykVar7 = ykVar5;
                }
                yk ykVar9 = yiVar2.b;
                if (ykVar9 != null) {
                    yiVar2.m -= ykVar9.R[i12].b();
                }
                yk ykVar10 = yiVar2.d;
                if (ykVar10 != null) {
                    yiVar2.m -= ykVar10.R[i12 + 1].b();
                }
                yiVar2.c = ykVar7;
                if (yiVar2.o == 0 && yiVar2.p) {
                    yiVar2.e = yiVar2.c;
                } else {
                    yiVar2.e = yiVar2.a;
                }
                yiVar2.s = yiVar2.r && yiVar2.q;
            }
            yiVar2.t = true;
            if (arrayList == 0 || arrayList.contains(yiVar2.a)) {
                yk ykVar11 = yiVar2.a;
                yk ykVar12 = yiVar2.c;
                yk ykVar13 = yiVar2.b;
                yk ykVar14 = yiVar2.d;
                yk ykVar15 = yiVar2.e;
                float f2 = yiVar2.k;
                yk ykVar16 = yiVar2.f;
                yk ykVar17 = yiVar2.g;
                int i18 = ylVar2.ap[i];
                if (i == 0) {
                    int i19 = ykVar15.ai;
                    boolean z7 = i19 == 0;
                    boolean z8 = i19 == 1;
                    z = i19 == 2;
                    z2 = z8;
                    z4 = z7;
                    z3 = false;
                } else {
                    int i20 = ykVar15.aj;
                    boolean z9 = i20 == 0;
                    boolean z10 = i20 == 1;
                    z = i20 == 2;
                    z2 = z10;
                    z3 = false;
                    z4 = z9;
                }
                while (true) {
                    i4 = i9;
                    if (z3) {
                        break;
                    }
                    yj yjVar5 = ykVar11.R[i3];
                    int i21 = true != z ? 4 : 1;
                    int iB3 = yjVar5.b();
                    int i22 = i2;
                    boolean z11 = ykVar11.ap[i] == 3 && ykVar11.u[i] == 0;
                    yj yjVar6 = yjVar5.e;
                    if (yjVar6 != null && ykVar11 != ykVar11) {
                        iB3 += yjVar6.b();
                    }
                    if (z && ykVar11 != ykVar11 && ykVar11 != ykVar13) {
                        i21 = 8;
                    }
                    yj yjVar7 = yjVar5.e;
                    if (yjVar7 != null) {
                        if (ykVar11 == ykVar13) {
                            yaVar.g(yjVar5.h, yjVar7.h, iB3, 6);
                        } else {
                            yaVar.g(yjVar5.h, yjVar7.h, iB3, 8);
                        }
                        yaVar.m(yjVar5.h, yjVar5.e.h, iB3, (!z11 || z) ? i21 : 5);
                    } else {
                        ykVar15 = ykVar15;
                        yiVarArr = yiVarArr;
                    }
                    if (i18 == 2) {
                        if (ykVar11.ag != 8 && ykVar11.ap[i] == 3) {
                            yj[] yjVarArr = ykVar11.R;
                            yaVar.g(yjVarArr[i3 + 1].h, yjVarArr[i3].h, 0, 5);
                        }
                        yaVar.g(ykVar11.R[i3].h, ylVar2.R[i3].h, 0, 8);
                    }
                    yj yjVar8 = ykVar11.R[i3 + 1].e;
                    if (yjVar8 != null) {
                        ykVar4 = yjVar8.d;
                        yj yjVar9 = ykVar4.R[i3].e;
                        if (yjVar9 == null || yjVar9.d != ykVar11) {
                            ykVar4 = null;
                        }
                    } else {
                        ykVar4 = null;
                    }
                    z3 = ykVar4 == null;
                    if (ykVar4 != null) {
                        ykVar11 = ykVar4;
                    }
                    i9 = i4;
                    i2 = i22;
                    yiVarArr = yiVarArr;
                    ykVar15 = ykVar15;
                }
                yk ykVar18 = ykVar15;
                i5 = i2;
                yiVarArr2 = yiVarArr;
                if (ykVar14 != null) {
                    int i23 = i3 + 1;
                    if (ykVar12.R[i23].e != null) {
                        yj yjVar10 = ykVar14.R[i23];
                        if (ykVar14.ap[i] == 3 && ykVar14.u[i] == 0 && !z) {
                            yj yjVar11 = yjVar10.e;
                            if (yjVar11.d == ylVar2) {
                                yaVar.m(yjVar10.h, yjVar11.h, -yjVar10.b(), 5);
                            }
                            yaVar.h(yjVar10.h, ykVar12.R[i23].e.h, -yjVar10.b(), 6);
                        }
                        if (z) {
                            yj yjVar12 = yjVar10.e;
                            if (yjVar12.d == ylVar2) {
                                yaVar.m(yjVar10.h, yjVar12.h, -yjVar10.b(), 4);
                            }
                        }
                        yaVar.h(yjVar10.h, ykVar12.R[i23].e.h, -yjVar10.b(), 6);
                    }
                }
                if (i18 == 2) {
                    int i24 = i3 + 1;
                    yf yfVar4 = ylVar2.R[i24].h;
                    yj yjVar13 = ykVar12.R[i24];
                    yaVar.g(yfVar4, yjVar13.h, yjVar13.b(), 8);
                }
                ArrayList arrayList2 = yiVar2.h;
                if (arrayList2 == null || (size = arrayList2.size()) <= 1) {
                    yiVar = yiVar2;
                    ykVar = ykVar12;
                } else {
                    float f3 = (!yiVar2.q || yiVar2.s) ? f2 : yiVar2.j;
                    yk ykVar19 = null;
                    int i25 = 0;
                    float f4 = 0.0f;
                    while (i25 < size) {
                        yk ykVar20 = (yk) arrayList2.get(i25);
                        float f5 = ykVar20.ak[i];
                        if (f5 < 0.0f) {
                            if (yiVar2.s) {
                                yj[] yjVarArr2 = ykVar20.R;
                                arrayList2 = arrayList2;
                                yaVar.m(yjVarArr2[i3 + 1].h, yjVarArr2[i3].h, 0, 4);
                            } else {
                                f5 = 1.0f;
                            }
                            yiVar2 = yiVar2;
                            size = size;
                            ykVar12 = ykVar12;
                            i25++;
                            ykVar12 = ykVar12;
                            arrayList2 = arrayList2;
                            size = size;
                            yiVar2 = yiVar2;
                        }
                        if (f5 == 0.0f) {
                            yj[] yjVarArr3 = ykVar20.R;
                            yaVar.m(yjVarArr3[i3 + 1].h, yjVarArr3[i3].h, 0, 8);
                            yiVar2 = yiVar2;
                            size = size;
                            ykVar12 = ykVar12;
                        } else {
                            if (ykVar19 != null) {
                                yj[] yjVarArr4 = ykVar19.R;
                                yf yfVar5 = yjVarArr4[i3].h;
                                int i26 = i3 + 1;
                                yf yfVar6 = yjVarArr4[i26].h;
                                yj[] yjVarArr5 = ykVar20.R;
                                yf yfVar7 = yjVarArr5[i3].h;
                                yf yfVar8 = yjVarArr5[i26].h;
                                xy xyVarA = yaVar.a();
                                xyVarA.b = 0.0f;
                                if (f3 == 0.0f || f4 == f5) {
                                    xyVarA.e.g(yfVar5, 1.0f);
                                    xyVarA.e.g(yfVar6, -1.0f);
                                    xyVarA.e.g(yfVar8, 1.0f);
                                    xyVarA.e.g(yfVar7, -1.0f);
                                } else if (f4 == 0.0f) {
                                    xyVarA.e.g(yfVar5, 1.0f);
                                    xyVarA.e.g(yfVar6, -1.0f);
                                } else if (f5 == 0.0f) {
                                    xyVarA.e.g(yfVar7, 1.0f);
                                    xyVarA.e.g(yfVar8, -1.0f);
                                } else {
                                    float f6 = (f4 / f3) / (f5 / f3);
                                    xyVarA.e.g(yfVar5, 1.0f);
                                    xyVarA.e.g(yfVar6, -1.0f);
                                    xyVarA.e.g(yfVar8, f6);
                                    xyVarA.e.g(yfVar7, -f6);
                                }
                                yaVar.e(xyVarA);
                            }
                            f4 = f5;
                            ykVar19 = ykVar20;
                        }
                        i25++;
                        ykVar12 = ykVar12;
                        arrayList2 = arrayList2;
                        size = size;
                        yiVar2 = yiVar2;
                    }
                    yiVar = yiVar2;
                    ykVar = ykVar12;
                }
                if (ykVar13 != null && (ykVar13 == ykVar14 || z)) {
                    yj yjVar14 = ykVar11.R[i3];
                    int i27 = i3 + 1;
                    ykVar = ykVar;
                    yj yjVar15 = ykVar.R[i27];
                    yj yjVar16 = yjVar14.e;
                    yf yfVar9 = yjVar16 != null ? yjVar16.h : null;
                    yj yjVar17 = yjVar15.e;
                    yf yfVar10 = yjVar17 != null ? yjVar17.h : null;
                    yj yjVar18 = ykVar13.R[i3];
                    if (ykVar14 != null) {
                        yjVar15 = ykVar14.R[i27];
                    }
                    if (yfVar9 == null || yfVar10 == null) {
                        ykVar14 = ykVar14;
                        ykVar13 = ykVar13;
                    } else {
                        ykVar14 = ykVar14;
                        yf yfVar11 = yfVar10;
                        ykVar13 = ykVar13;
                        yaVar.d(yjVar18.h, yfVar9, yjVar18.b(), i == 0 ? ykVar18.ad : ykVar18.ae, yfVar11, yjVar15.h, yjVar15.b(), 7);
                    }
                } else if (!z4 || ykVar13 == 0) {
                    i4 = i4;
                    yi yiVar3 = yiVar;
                    int i28 = 8;
                    if (z2 && ykVar13 != 0) {
                        int i29 = yiVar3.j;
                        boolean z12 = i29 > 0 && yiVar3.i == i29;
                        yk ykVar21 = ykVar13;
                        yk ykVar22 = ykVar21;
                        while (ykVar22 != null) {
                            yk ykVar23 = ykVar22.am[i];
                            while (ykVar23 != null && ykVar23.ag == i28) {
                                ykVar23 = ykVar23.am[i];
                            }
                            if (ykVar22 == ykVar13 || ykVar22 == ykVar14 || ykVar23 == null) {
                                ykVar21 = ykVar21;
                                ykVar22 = ykVar22;
                                z12 = z12;
                                i6 = 8;
                                ykVar22 = ykVar23;
                            } else {
                                yk ykVar24 = ykVar23 == ykVar14 ? null : ykVar23;
                                yj yjVar19 = ykVar22.R[i3];
                                yf yfVar12 = yjVar19.h;
                                yj yjVar20 = yjVar19.e;
                                int i30 = i3 + 1;
                                yf yfVar13 = ykVar21.R[i30].h;
                                int iB4 = yjVar19.b();
                                int iB5 = ykVar22.R[i30].b();
                                if (ykVar24 != null) {
                                    yjVar = ykVar24.R[i3];
                                    yf yfVar14 = yjVar.h;
                                    yj yjVar21 = yjVar.e;
                                    yfVar2 = yjVar21 != null ? yjVar21.h : null;
                                    yfVar = yfVar14;
                                } else {
                                    yjVar = ykVar14.R[i3];
                                    yfVar = yjVar != null ? yjVar.h : null;
                                    yfVar2 = ykVar22.R[i30].h;
                                }
                                int iB6 = yjVar != null ? iB5 + yjVar.b() : iB5;
                                int iB7 = iB4 + ykVar21.R[i30].b();
                                int i31 = true != z12 ? 4 : 8;
                                if (yfVar12 == null || yfVar13 == null || yfVar == null || yfVar2 == null) {
                                    i6 = 8;
                                } else {
                                    i6 = 8;
                                    yaVar.d(yfVar12, yfVar13, iB7, 0.5f, yfVar, yfVar2, iB6, i31);
                                }
                                ykVar22 = ykVar24;
                            }
                            ykVar21 = ykVar22.ag != i6 ? ykVar22 : ykVar21;
                            z12 = z12;
                            i28 = 8;
                        }
                        yj yjVar22 = ykVar13.R[i3];
                        yj yjVar23 = ykVar11.R[i3].e;
                        int i32 = i3 + 1;
                        yj yjVar24 = ykVar14.R[i32];
                        yj yjVar25 = ykVar.R[i32].e;
                        if (yjVar23 != null) {
                            if (ykVar13 != ykVar14) {
                                yaVar.m(yjVar22.h, yjVar23.h, yjVar22.b(), 5);
                            } else if (yjVar25 != null) {
                                yaVar.d(yjVar22.h, yjVar23.h, yjVar22.b(), 0.5f, yjVar24.h, yjVar25.h, yjVar24.b(), 5);
                            }
                        }
                        if (yjVar25 != null && ykVar13 != ykVar14) {
                            yaVar.m(yjVar24.h, yjVar25.h, -yjVar24.b(), 5);
                        }
                    }
                } else {
                    yi yiVar4 = yiVar;
                    int i33 = yiVar4.j;
                    boolean z13 = i33 > 0 && yiVar4.i == i33;
                    yk ykVar25 = ykVar13;
                    yk ykVar26 = ykVar25;
                    while (ykVar26 != null) {
                        yk ykVar27 = ykVar26.am[i];
                        while (ykVar27 != null && ykVar27.ag == 8) {
                            ykVar27 = ykVar27.am[i];
                        }
                        if (ykVar27 != null || ykVar26 == ykVar14) {
                            yj yjVar26 = ykVar26.R[i3];
                            yf yfVar15 = yjVar26.h;
                            yj yjVar27 = yjVar26.e;
                            yf yfVar16 = yjVar27 != null ? yjVar27.h : null;
                            if (ykVar25 != ykVar26) {
                                yfVar16 = ykVar25.R[i3 + 1].h;
                            } else if (ykVar26 == ykVar13) {
                                yj yjVar28 = ykVar11.R[i3].e;
                                yfVar16 = yjVar28 != null ? yjVar28.h : null;
                            }
                            int iB8 = yjVar26.b();
                            int i34 = i3 + 1;
                            int iB9 = ykVar26.R[i34].b();
                            if (ykVar27 != null) {
                                yjVar2 = ykVar27.R[i3];
                                ykVar2 = ykVar27;
                                yfVar3 = yjVar2.h;
                            } else {
                                ykVar2 = ykVar27;
                                yjVar2 = ykVar.R[i34].e;
                                yfVar3 = yjVar2 != null ? yjVar2.h : null;
                            }
                            i7 = i4;
                            yf yfVar17 = ykVar26.R[i34].h;
                            if (yjVar2 != null) {
                                iB9 += yjVar2.b();
                            }
                            int iB10 = iB8 + ykVar25.R[i34].b();
                            if (yfVar15 == null || yfVar16 == null || yfVar3 == null || yfVar17 == null) {
                                ykVar3 = ykVar25;
                            } else {
                                int iB11 = ykVar26 == ykVar13 ? ykVar13.R[i3].b() : iB10;
                                yk ykVar28 = ykVar25;
                                ykVar3 = ykVar28;
                                yaVar.d(yfVar15, yfVar16, iB11, 0.5f, yfVar3, yfVar17, ykVar26 == ykVar14 ? ykVar14.R[i34].b() : iB9, true != z13 ? 5 : 8);
                            }
                        } else {
                            ykVar2 = ykVar27;
                            ykVar3 = ykVar25;
                            i7 = i4;
                        }
                        ykVar25 = ykVar26.ag != 8 ? ykVar26 : ykVar3;
                        ykVar26 = ykVar2;
                        z13 = z13;
                        i4 = i7;
                    }
                    i4 = i4;
                }
                if ((z4 || z2) && ykVar13 != null && ykVar13 != ykVar14) {
                    yj[] yjVarArr6 = ykVar13.R;
                    yj yjVar29 = yjVarArr6[i3];
                    yk ykVar29 = ykVar14 == null ? ykVar13 : ykVar14;
                    int i35 = i3 + 1;
                    yj yjVar30 = ykVar29.R[i35];
                    yj yjVar31 = yjVar29.e;
                    yf yfVar18 = yjVar31 != null ? yjVar31.h : null;
                    yj yjVar32 = yjVar30.e;
                    yf yfVar19 = yjVar32 != null ? yjVar32.h : null;
                    if (ykVar != ykVar29) {
                        yj yjVar33 = ykVar.R[i35].e;
                        yfVar19 = yjVar33 != null ? yjVar33.h : null;
                    }
                    if (ykVar13 == ykVar29) {
                        yjVar30 = yjVarArr6[i35];
                    }
                    if (yfVar18 != null && yfVar19 != null) {
                        yaVar.d(yjVar29.h, yfVar18, yjVar29.b(), 0.5f, yfVar19, yjVar30.h, ykVar29.R[i35].b(), 5);
                    }
                }
            } else {
                i4 = i9;
                i5 = i2;
                yiVarArr2 = yiVarArr;
            }
            i9 = i4 + 1;
            i8 = 2;
            ylVar2 = ylVar;
            i2 = i5;
            yiVarArr = yiVarArr2;
        }
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            default:
                return "FINISHED";
        }
    }
}
