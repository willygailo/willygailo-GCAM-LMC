package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hki {
    private final hld a;
    private final hky b;
    private final hle c;
    private final hkk d;
    private final hke e;
    private final ojc f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private List k = new ArrayList();
    private final jry l;

    public hki(hld hldVar, hky hkyVar, hle hleVar, hkk hkkVar, hke hkeVar, jry jryVar, ojc ojcVar, boolean z, boolean z2, boolean z3, boolean z4, lap lapVar, byte[] bArr) {
        this.a = hldVar;
        this.b = hkyVar;
        this.c = hleVar;
        this.d = hkkVar;
        this.e = hkeVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.f = ojcVar;
        this.l = jryVar;
        lapVar.c(hkeVar);
        lapVar.c(hldVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:102:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:105:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:108:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:109:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:112:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:115:0x0411  */
    /* JADX WARN: Code duplicated, block: B:116:0x041a  */
    /* JADX WARN: Code duplicated, block: B:119:0x041f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0439  */
    /* JADX WARN: Code duplicated, block: B:125:0x044a  */
    /* JADX WARN: Code duplicated, block: B:127:0x045a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0470  */
    /* JADX WARN: Code duplicated, block: B:131:0x0476 A[LOOP:1: B:129:0x0473->B:131:0x0476, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x048a  */
    /* JADX WARN: Code duplicated, block: B:137:0x049c  */
    /* JADX WARN: Code duplicated, block: B:139:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:144:0x0533  */
    /* JADX WARN: Code duplicated, block: B:149:0x0335 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0256  */
    /* JADX WARN: Code duplicated, block: B:64:0x0261  */
    /* JADX WARN: Code duplicated, block: B:66:0x0275  */
    /* JADX WARN: Code duplicated, block: B:68:0x028b  */
    /* JADX WARN: Code duplicated, block: B:71:0x02af  */
    /* JADX WARN: Code duplicated, block: B:73:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x02db  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x030c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0318  */
    /* JADX WARN: Code duplicated, block: B:91:0x032a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0355  */
    /* JADX WARN: Code duplicated, block: B:98:0x036b  */
    public final hkn a(mad madVar, hjz hjzVar) {
        float f;
        hlg hlgVar;
        float f2;
        float f3;
        hlh hlhVarA;
        float f4;
        float f5;
        float f6;
        float f7;
        ArrayList arrayList;
        float f8;
        float f9;
        float f10;
        poy poyVarM;
        float f11;
        float f12;
        float f13;
        psn psnVar;
        ppm ppmVar;
        hki hkiVar;
        poy poyVarM2;
        float[] fArr;
        int i;
        psn psnVar2;
        ppj ppjVar;
        hkz[] hkzVarArr;
        int length;
        int i2;
        hkz hkzVar;
        poy poyVarM3;
        psu psuVar;
        ppj ppjVar2;
        psu psuVar2;
        ppj ppjVar3;
        int i3 = hjzVar.j;
        float f14 = 1.0f;
        float f15 = (i3 == 2 || i3 == 3) ? 1.0f : 0.0f;
        int i4 = hjzVar.i;
        float f16 = (i4 == 4 || i4 == 2) ? 1.0f : 0.0f;
        int i5 = hjzVar.k;
        float f17 = (i5 == 2 || i5 == 3) ? 1.0f : 0.0f;
        hjy[] hjyVarArr = hjzVar.p;
        hjyVarArr.getClass();
        int length2 = hjyVarArr.length;
        float f18 = length2;
        Rect rect = hjzVar.s;
        hjyVarArr.getClass();
        if (length2 == 0) {
            f = 0.0f;
        } else {
            int i6 = 0;
            float fMin = 0.0f;
            while (i6 < length2) {
                hjy hjyVar = hjyVarArr[i6];
                int iWidth = rect.width();
                int iHeight = rect.height();
                Rect rect2 = hjyVar.a;
                float f19 = iWidth;
                float f20 = f19 * 0.04f;
                float f21 = iHeight;
                float f22 = 0.04f * f21;
                fMin += Math.min(f14 - fcy.r((-(rect2.left - (f19 * 0.15f))) / f20), Math.min(1.0f - fcy.r((rect2.right - (f19 * 0.85f)) / f20), Math.min(1.0f - fcy.r((-(rect2.top - (0.15f * f21))) / f22), 1.0f - fcy.r((rect2.bottom - (f21 * 0.85f)) / f22)))) / hjyVarArr.length;
                i6++;
                f14 = 1.0f;
            }
            f = fMin;
        }
        float fA = this.b.a(hjzVar);
        float f23 = hjzVar.l == 0 ? 1.0f : 0.0f;
        hle hleVar = this.c;
        float f24 = (hleVar.a * 0.85f) + (hjzVar.o * 0.14999998f);
        hleVar.a = f24;
        float fPow = ((f24 * ((float) (1.0d - (2.0d / ((1.0d / Math.pow(hjzVar.c / 1000000.0f, 6.0d)) + 1.0d))))) + 1.0f) / 2.0f;
        float fA2 = this.e.a(madVar, hjzVar);
        float fA3 = this.l.a(madVar);
        ojc ojcVarB = this.e.b();
        ojc ojcVarC = this.a.c(madVar, hjzVar);
        ojc ojcVarQ = fcy.q(this.f, madVar.d());
        float f25 = ojcVarC.g() ? ((hla) ojcVarC.c()).b : 0.0f;
        boolean z = hjzVar.q;
        boolean zC = this.e.c();
        if (this.j) {
            if (this.h && f18 == 0.0f) {
                hlg hlgVar2 = new hlg();
                hlgVar2.b = 0.00344f;
                hlgVar2.d = 0.03217f;
                hlgVar2.e = 0.01517f;
                hlgVar2.g = 0.03508f;
                hlgVar2.h = 0.16967f;
                hlgVar2.i = 0.01693f;
                hlhVarA = hlgVar2.a();
            } else {
                hlgVar = new hlg();
                hlgVar.b = 0.00244f;
                hlgVar.c = 0.02417f;
                hlgVar.d = 0.87947f;
                f2 = 0.09392f;
            }
            f4 = (hlhVarA.i * fA3) + (hlhVarA.a * f15) + 0.0f + (hlhVarA.b * f16) + (f17 * 0.0f) + (f18 * 0.0f) + (hlhVarA.c * f) + (hlhVarA.d * f25) + (hlhVarA.e * fA) + (hlhVarA.f * f23) + (hlhVarA.g * fPow) + (hlhVarA.h * fA2);
            if (this.g) {
                arrayList = new ArrayList();
                if (ojcVarC.g()) {
                    hkzVarArr = ((hla) ojcVarC.c()).a;
                    length = hkzVarArr.length;
                    i2 = 0;
                    while (i2 < length) {
                        int i7 = length;
                        hkzVar = hkzVarArr[i2];
                        hkz[] hkzVarArr2 = hkzVarArr;
                        poyVarM3 = psu.g.m();
                        float f26 = fPow;
                        float f27 = fA2;
                        long j = hkzVar.a;
                        if (poyVarM3.c) {
                            poyVarM3.m();
                            poyVarM3.c = false;
                        }
                        psu psuVar3 = (psu) poyVarM3.b;
                        float f28 = fA3;
                        int i8 = psuVar3.a | 1;
                        psuVar3.a = i8;
                        psuVar3.b = j;
                        float f29 = hkzVar.c;
                        psuVar3.a = i8 | 4;
                        psuVar3.d = f29;
                        if (hkzVar.b.g()) {
                            long jLongValue = ((Long) hkzVar.b.c()).longValue();
                            if (poyVarM3.c) {
                                poyVarM3.m();
                                poyVarM3.c = false;
                            }
                            psu psuVar4 = (psu) poyVarM3.b;
                            psuVar4.a |= 2;
                            psuVar4.c = jLongValue;
                        }
                        if (hkzVar.f.g()) {
                            Iterable iterable = (Iterable) hkzVar.f.c();
                            if (poyVarM3.c) {
                                poyVarM3.m();
                                poyVarM3.c = false;
                            }
                            psuVar2 = (psu) poyVarM3.b;
                            ppjVar3 = psuVar2.e;
                            if (!ppjVar3.c()) {
                                psuVar2.e = ppd.v(ppjVar3);
                            }
                            pnl.e(iterable, psuVar2.e);
                        }
                        if (hkzVar.g.g()) {
                            Iterable iterable2 = (Iterable) hkzVar.g.c();
                            if (poyVarM3.c) {
                                poyVarM3.m();
                                poyVarM3.c = false;
                            }
                            psuVar = (psu) poyVarM3.b;
                            ppjVar2 = psuVar.f;
                            if (!ppjVar2.c()) {
                                psuVar.f = ppd.v(ppjVar2);
                            }
                            pnl.e(iterable2, psuVar.f);
                        }
                        arrayList.add((psu) poyVarM3.j());
                        i2++;
                        length = i7;
                        fPow = f26;
                        hkzVarArr = hkzVarArr2;
                        fA2 = f27;
                        fA3 = f28;
                    }
                    f8 = fPow;
                    f9 = fA2;
                    f10 = fA3;
                } else {
                    f8 = fPow;
                    f9 = fA2;
                    f10 = fA3;
                }
                poyVarM = psn.r.m();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psn psnVar3 = (psn) poyVarM.b;
                int i9 = psnVar3.a | 1;
                psnVar3.a = i9;
                psnVar3.b = f15;
                int i10 = i9 | 2;
                psnVar3.a = i10;
                psnVar3.c = f16;
                int i11 = i10 | 4;
                psnVar3.a = i11;
                psnVar3.d = f17;
                int i12 = i11 | 8;
                psnVar3.a = i12;
                psnVar3.e = f18;
                int i13 = i12 | 16;
                psnVar3.a = i13;
                psnVar3.f = f;
                int i14 = i13 | 32;
                psnVar3.a = i14;
                psnVar3.g = f25;
                int i15 = i14 | 64;
                psnVar3.a = i15;
                psnVar3.h = fA;
                int i16 = i15 | 128;
                psnVar3.a = i16;
                psnVar3.i = f23;
                int i17 = i16 | 256;
                psnVar3.a = i17;
                f6 = f8;
                psnVar3.j = f6;
                int i18 = i17 | 512;
                psnVar3.a = i18;
                f7 = f9;
                psnVar3.k = f7;
                psnVar3.a = i18 | 1024;
                f5 = f10;
                psnVar3.l = f5;
                if (ojcVarC.g()) {
                    f11 = ((hla) ojcVarC.c()).c;
                } else {
                    f11 = 0.0f;
                }
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psn psnVar4 = (psn) poyVarM.b;
                psnVar4.a |= 2048;
                psnVar4.o = f11;
                if (ojcVarC.g()) {
                    f12 = ((hla) ojcVarC.c()).d;
                } else {
                    f12 = 0.0f;
                }
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psn psnVar5 = (psn) poyVarM.b;
                psnVar5.a |= 4096;
                psnVar5.p = f12;
                if (ojcVarC.g()) {
                    f13 = ((hla) ojcVarC.c()).e;
                } else {
                    f13 = 0.0f;
                }
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psnVar = (psn) poyVarM.b;
                psnVar.a |= 8192;
                psnVar.q = f13;
                ppmVar = psnVar.m;
                if (!ppmVar.c()) {
                    psnVar.m = ppd.B(ppmVar);
                }
                pnl.e(arrayList, psnVar.m);
                if (ojcVarB.g()) {
                    fArr = (float[]) ojcVarB.c();
                    hkiVar = this;
                    if (hkiVar.k.isEmpty()) {
                        hkiVar.k = new ArrayList(Collections.nCopies(fArr.length, Float.valueOf(0.0f)));
                        i = 0;
                    } else {
                        i = 0;
                    }
                    while (i < fArr.length) {
                        hkiVar.k.set(i, Float.valueOf(fArr[i]));
                        i++;
                    }
                    List list = hkiVar.k;
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    psnVar2 = (psn) poyVarM.b;
                    ppjVar = psnVar2.n;
                    if (!ppjVar.c()) {
                        psnVar2.n = ppd.v(ppjVar);
                    }
                    pnl.e(list, psnVar2.n);
                } else {
                    hkiVar = this;
                    f5 = f5;
                }
                psn psnVar6 = (psn) poyVarM.j();
                poyVarM2 = pso.m.m();
                hlh hlhVar = hlhVarA;
                float f30 = hlhVar.a;
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                pso psoVar = (pso) poyVarM2.b;
                int i19 = psoVar.a | 1;
                psoVar.a = i19;
                psoVar.b = f30;
                float f31 = hlhVar.b;
                int i20 = i19 | 2;
                psoVar.a = i20;
                psoVar.c = f31;
                int i21 = 4 | i20;
                psoVar.a = i21;
                psoVar.d = 0.0f;
                int i22 = i21 | 8;
                psoVar.a = i22;
                psoVar.e = 0.0f;
                float f32 = hlhVar.c;
                int i23 = i22 | 16;
                psoVar.a = i23;
                psoVar.f = f32;
                float f33 = hlhVar.d;
                int i24 = i23 | 32;
                psoVar.a = i24;
                psoVar.g = f33;
                float f34 = hlhVar.e;
                int i25 = i24 | 64;
                psoVar.a = i25;
                psoVar.h = f34;
                float f35 = hlhVar.f;
                int i26 = i25 | 128;
                psoVar.a = i26;
                psoVar.i = f35;
                float f36 = hlhVar.g;
                int i27 = i26 | 256;
                psoVar.a = i27;
                psoVar.j = f36;
                float f37 = hlhVar.h;
                int i28 = i27 | 512;
                psoVar.a = i28;
                psoVar.k = f37;
                float f38 = hlhVar.i;
                psoVar.a = i28 | 1024;
                psoVar.l = f38;
                hkiVar.d.a(madVar.d(), psnVar6, (pso) poyVarM2.j());
            } else {
                f4 = f4;
                z = z;
                f5 = fA3;
                f6 = fPow;
                f7 = fA2;
            }
            return new hkn(madVar.d(), f4, f15, f16, f17, f18, f, f25, fA, f23, f6, f5, f7, z, zC, ojcVarC, ojcVarQ, ojcVarB);
        }
        if (this.i) {
            if (this.h && f18 == 0.0f) {
                hlgVar = new hlg();
                hlgVar.b = 0.00391f;
                hlgVar.d = 0.06002f;
                hlgVar.e = 0.01743f;
                hlgVar.g = 0.04075f;
                hlgVar.h = 0.19671f;
                f3 = 0.01942f;
                hlgVar.i = f3;
            } else {
                hlgVar = new hlg();
                hlgVar.b = 0.00391f;
                hlgVar.c = 0.03141f;
                hlgVar.d = 0.86026f;
                f2 = 0.10442f;
            }
        } else if (this.h && f18 == 0.0f) {
            hlgVar = new hlg();
            hlgVar.a = 1.6E-4f;
            hlgVar.d = 0.03037f;
            hlgVar.e = 0.00614f;
            hlgVar.g = 0.01661f;
            hlgVar.h = 0.08336f;
            f3 = 0.00359f;
            hlgVar.i = f3;
        } else {
            hlgVar = new hlg();
            hlgVar.c = 0.04085f;
            hlgVar.d = 0.86336f;
            hlgVar.f = 0.00393f;
            f2 = 0.09186f;
        }
        hlhVarA = hlgVar.a();
        f4 = (hlhVarA.i * fA3) + (hlhVarA.a * f15) + 0.0f + (hlhVarA.b * f16) + (f17 * 0.0f) + (f18 * 0.0f) + (hlhVarA.c * f) + (hlhVarA.d * f25) + (hlhVarA.e * fA) + (hlhVarA.f * f23) + (hlhVarA.g * fPow) + (hlhVarA.h * fA2);
        if (this.g) {
            arrayList = new ArrayList();
            if (ojcVarC.g()) {
                hkzVarArr = ((hla) ojcVarC.c()).a;
                length = hkzVarArr.length;
                i2 = 0;
                while (i2 < length) {
                    int i29 = length;
                    hkzVar = hkzVarArr[i2];
                    hkz[] hkzVarArr3 = hkzVarArr;
                    poyVarM3 = psu.g.m();
                    float f210 = fPow;
                    float f211 = fA2;
                    long j2 = hkzVar.a;
                    if (poyVarM3.c) {
                        poyVarM3.m();
                        poyVarM3.c = false;
                    }
                    psu psuVar5 = (psu) poyVarM3.b;
                    float f212 = fA3;
                    int i30 = psuVar5.a | 1;
                    psuVar5.a = i30;
                    psuVar5.b = j2;
                    float f213 = hkzVar.c;
                    psuVar5.a = i30 | 4;
                    psuVar5.d = f213;
                    if (hkzVar.b.g()) {
                        long jLongValue2 = ((Long) hkzVar.b.c()).longValue();
                        if (poyVarM3.c) {
                            poyVarM3.m();
                            poyVarM3.c = false;
                        }
                        psu psuVar6 = (psu) poyVarM3.b;
                        psuVar6.a |= 2;
                        psuVar6.c = jLongValue2;
                    }
                    if (hkzVar.f.g()) {
                        Iterable iterable3 = (Iterable) hkzVar.f.c();
                        if (poyVarM3.c) {
                            poyVarM3.m();
                            poyVarM3.c = false;
                        }
                        psuVar2 = (psu) poyVarM3.b;
                        ppjVar3 = psuVar2.e;
                        if (!ppjVar3.c()) {
                            psuVar2.e = ppd.v(ppjVar3);
                        }
                        pnl.e(iterable3, psuVar2.e);
                    }
                    if (hkzVar.g.g()) {
                        Iterable iterable4 = (Iterable) hkzVar.g.c();
                        if (poyVarM3.c) {
                            poyVarM3.m();
                            poyVarM3.c = false;
                        }
                        psuVar = (psu) poyVarM3.b;
                        ppjVar2 = psuVar.f;
                        if (!ppjVar2.c()) {
                            psuVar.f = ppd.v(ppjVar2);
                        }
                        pnl.e(iterable4, psuVar.f);
                    }
                    arrayList.add((psu) poyVarM3.j());
                    i2++;
                    length = i29;
                    fPow = f210;
                    hkzVarArr = hkzVarArr3;
                    fA2 = f211;
                    fA3 = f212;
                }
                f8 = fPow;
                f9 = fA2;
                f10 = fA3;
            } else {
                f8 = fPow;
                f9 = fA2;
                f10 = fA3;
            }
            poyVarM = psn.r.m();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            psn psnVar7 = (psn) poyVarM.b;
            int i31 = psnVar7.a | 1;
            psnVar7.a = i31;
            psnVar7.b = f15;
            int i110 = i31 | 2;
            psnVar7.a = i110;
            psnVar7.c = f16;
            int i111 = i110 | 4;
            psnVar7.a = i111;
            psnVar7.d = f17;
            int i112 = i111 | 8;
            psnVar7.a = i112;
            psnVar7.e = f18;
            int i113 = i112 | 16;
            psnVar7.a = i113;
            psnVar7.f = f;
            int i114 = i113 | 32;
            psnVar7.a = i114;
            psnVar7.g = f25;
            int i115 = i114 | 64;
            psnVar7.a = i115;
            psnVar7.h = fA;
            int i116 = i115 | 128;
            psnVar7.a = i116;
            psnVar7.i = f23;
            int i117 = i116 | 256;
            psnVar7.a = i117;
            f6 = f8;
            psnVar7.j = f6;
            int i118 = i117 | 512;
            psnVar7.a = i118;
            f7 = f9;
            psnVar7.k = f7;
            psnVar7.a = i118 | 1024;
            f5 = f10;
            psnVar7.l = f5;
            if (ojcVarC.g()) {
                f11 = ((hla) ojcVarC.c()).c;
            } else {
                f11 = 0.0f;
            }
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            psn psnVar8 = (psn) poyVarM.b;
            psnVar8.a |= 2048;
            psnVar8.o = f11;
            if (ojcVarC.g()) {
                f12 = ((hla) ojcVarC.c()).d;
            } else {
                f12 = 0.0f;
            }
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            psn psnVar9 = (psn) poyVarM.b;
            psnVar9.a |= 4096;
            psnVar9.p = f12;
            if (ojcVarC.g()) {
                f13 = ((hla) ojcVarC.c()).e;
            } else {
                f13 = 0.0f;
            }
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            psnVar = (psn) poyVarM.b;
            psnVar.a |= 8192;
            psnVar.q = f13;
            ppmVar = psnVar.m;
            if (!ppmVar.c()) {
                psnVar.m = ppd.B(ppmVar);
            }
            pnl.e(arrayList, psnVar.m);
            if (ojcVarB.g()) {
                fArr = (float[]) ojcVarB.c();
                hkiVar = this;
                if (hkiVar.k.isEmpty()) {
                    hkiVar.k = new ArrayList(Collections.nCopies(fArr.length, Float.valueOf(0.0f)));
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < fArr.length) {
                    hkiVar.k.set(i, Float.valueOf(fArr[i]));
                    i++;
                }
                List list2 = hkiVar.k;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psnVar2 = (psn) poyVarM.b;
                ppjVar = psnVar2.n;
                if (!ppjVar.c()) {
                    psnVar2.n = ppd.v(ppjVar);
                }
                pnl.e(list2, psnVar2.n);
            } else {
                hkiVar = this;
                f5 = f5;
            }
            psn psnVar10 = (psn) poyVarM.j();
            poyVarM2 = pso.m.m();
            hlh hlhVar2 = hlhVarA;
            float f39 = hlhVar2.a;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            pso psoVar2 = (pso) poyVarM2.b;
            int i119 = psoVar2.a | 1;
            psoVar2.a = i119;
            psoVar2.b = f39;
            float f310 = hlhVar2.b;
            int i210 = i119 | 2;
            psoVar2.a = i210;
            psoVar2.c = f310;
            int i211 = 4 | i210;
            psoVar2.a = i211;
            psoVar2.d = 0.0f;
            int i212 = i211 | 8;
            psoVar2.a = i212;
            psoVar2.e = 0.0f;
            float f311 = hlhVar2.c;
            int i213 = i212 | 16;
            psoVar2.a = i213;
            psoVar2.f = f311;
            float f312 = hlhVar2.d;
            int i214 = i213 | 32;
            psoVar2.a = i214;
            psoVar2.g = f312;
            float f313 = hlhVar2.e;
            int i215 = i214 | 64;
            psoVar2.a = i215;
            psoVar2.h = f313;
            float f314 = hlhVar2.f;
            int i216 = i215 | 128;
            psoVar2.a = i216;
            psoVar2.i = f314;
            float f315 = hlhVar2.g;
            int i217 = i216 | 256;
            psoVar2.a = i217;
            psoVar2.j = f315;
            float f316 = hlhVar2.h;
            int i218 = i217 | 512;
            psoVar2.a = i218;
            psoVar2.k = f316;
            float f317 = hlhVar2.i;
            psoVar2.a = i218 | 1024;
            psoVar2.l = f317;
            hkiVar.d.a(madVar.d(), psnVar10, (pso) poyVarM2.j());
        } else {
            f4 = f4;
            z = z;
            f5 = fA3;
            f6 = fPow;
            f7 = fA2;
        }
        return new hkn(madVar.d(), f4, f15, f16, f17, f18, f, f25, fA, f23, f6, f5, f7, z, zC, ojcVarC, ojcVarQ, ojcVarB);
        hlgVar.g = f2;
        hlhVarA = hlgVar.a();
        f4 = (hlhVarA.i * fA3) + (hlhVarA.a * f15) + 0.0f + (hlhVarA.b * f16) + (f17 * 0.0f) + (f18 * 0.0f) + (hlhVarA.c * f) + (hlhVarA.d * f25) + (hlhVarA.e * fA) + (hlhVarA.f * f23) + (hlhVarA.g * fPow) + (hlhVarA.h * fA2);
        if (this.g) {
            arrayList = new ArrayList();
            if (ojcVarC.g()) {
                hkzVarArr = ((hla) ojcVarC.c()).a;
                length = hkzVarArr.length;
                i2 = 0;
                while (i2 < length) {
                    int i219 = length;
                    hkzVar = hkzVarArr[i2];
                    hkz[] hkzVarArr4 = hkzVarArr;
                    poyVarM3 = psu.g.m();
                    float f214 = fPow;
                    float f215 = fA2;
                    long j3 = hkzVar.a;
                    if (poyVarM3.c) {
                        poyVarM3.m();
                        poyVarM3.c = false;
                    }
                    psu psuVar7 = (psu) poyVarM3.b;
                    float f216 = fA3;
                    int i32 = psuVar7.a | 1;
                    psuVar7.a = i32;
                    psuVar7.b = j3;
                    float f217 = hkzVar.c;
                    psuVar7.a = i32 | 4;
                    psuVar7.d = f217;
                    if (hkzVar.b.g()) {
                        long jLongValue3 = ((Long) hkzVar.b.c()).longValue();
                        if (poyVarM3.c) {
                            poyVarM3.m();
                            poyVarM3.c = false;
                        }
                        psu psuVar8 = (psu) poyVarM3.b;
                        psuVar8.a |= 2;
                        psuVar8.c = jLongValue3;
                    }
                    if (hkzVar.f.g()) {
                        Iterable iterable5 = (Iterable) hkzVar.f.c();
                        if (poyVarM3.c) {
                            poyVarM3.m();
                            poyVarM3.c = false;
                        }
                        psuVar2 = (psu) poyVarM3.b;
                        ppjVar3 = psuVar2.e;
                        if (!ppjVar3.c()) {
                            psuVar2.e = ppd.v(ppjVar3);
                        }
                        pnl.e(iterable5, psuVar2.e);
                    }
                    if (hkzVar.g.g()) {
                        Iterable iterable6 = (Iterable) hkzVar.g.c();
                        if (poyVarM3.c) {
                            poyVarM3.m();
                            poyVarM3.c = false;
                        }
                        psuVar = (psu) poyVarM3.b;
                        ppjVar2 = psuVar.f;
                        if (!ppjVar2.c()) {
                            psuVar.f = ppd.v(ppjVar2);
                        }
                        pnl.e(iterable6, psuVar.f);
                    }
                    arrayList.add((psu) poyVarM3.j());
                    i2++;
                    length = i219;
                    fPow = f214;
                    hkzVarArr = hkzVarArr4;
                    fA2 = f215;
                    fA3 = f216;
                }
                f8 = fPow;
                f9 = fA2;
                f10 = fA3;
            } else {
                f8 = fPow;
                f9 = fA2;
                f10 = fA3;
            }
            poyVarM = psn.r.m();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            psn psnVar11 = (psn) poyVarM.b;
            int i33 = psnVar11.a | 1;
            psnVar11.a = i33;
            psnVar11.b = f15;
            int i1110 = i33 | 2;
            psnVar11.a = i1110;
            psnVar11.c = f16;
            int i1111 = i1110 | 4;
            psnVar11.a = i1111;
            psnVar11.d = f17;
            int i1112 = i1111 | 8;
            psnVar11.a = i1112;
            psnVar11.e = f18;
            int i1113 = i1112 | 16;
            psnVar11.a = i1113;
            psnVar11.f = f;
            int i1114 = i1113 | 32;
            psnVar11.a = i1114;
            psnVar11.g = f25;
            int i1115 = i1114 | 64;
            psnVar11.a = i1115;
            psnVar11.h = fA;
            int i1116 = i1115 | 128;
            psnVar11.a = i1116;
            psnVar11.i = f23;
            int i1117 = i1116 | 256;
            psnVar11.a = i1117;
            f6 = f8;
            psnVar11.j = f6;
            int i1118 = i1117 | 512;
            psnVar11.a = i1118;
            f7 = f9;
            psnVar11.k = f7;
            psnVar11.a = i1118 | 1024;
            f5 = f10;
            psnVar11.l = f5;
            if (ojcVarC.g()) {
                f11 = ((hla) ojcVarC.c()).c;
            } else {
                f11 = 0.0f;
            }
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            psn psnVar12 = (psn) poyVarM.b;
            psnVar12.a |= 2048;
            psnVar12.o = f11;
            if (ojcVarC.g()) {
                f12 = ((hla) ojcVarC.c()).d;
            } else {
                f12 = 0.0f;
            }
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            psn psnVar13 = (psn) poyVarM.b;
            psnVar13.a |= 4096;
            psnVar13.p = f12;
            if (ojcVarC.g()) {
                f13 = ((hla) ojcVarC.c()).e;
            } else {
                f13 = 0.0f;
            }
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            psnVar = (psn) poyVarM.b;
            psnVar.a |= 8192;
            psnVar.q = f13;
            ppmVar = psnVar.m;
            if (!ppmVar.c()) {
                psnVar.m = ppd.B(ppmVar);
            }
            pnl.e(arrayList, psnVar.m);
            if (ojcVarB.g()) {
                fArr = (float[]) ojcVarB.c();
                hkiVar = this;
                if (hkiVar.k.isEmpty()) {
                    hkiVar.k = new ArrayList(Collections.nCopies(fArr.length, Float.valueOf(0.0f)));
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < fArr.length) {
                    hkiVar.k.set(i, Float.valueOf(fArr[i]));
                    i++;
                }
                List list3 = hkiVar.k;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psnVar2 = (psn) poyVarM.b;
                ppjVar = psnVar2.n;
                if (!ppjVar.c()) {
                    psnVar2.n = ppd.v(ppjVar);
                }
                pnl.e(list3, psnVar2.n);
            } else {
                hkiVar = this;
                f5 = f5;
            }
            psn psnVar14 = (psn) poyVarM.j();
            poyVarM2 = pso.m.m();
            hlh hlhVar3 = hlhVarA;
            float f318 = hlhVar3.a;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            pso psoVar3 = (pso) poyVarM2.b;
            int i1119 = psoVar3.a | 1;
            psoVar3.a = i1119;
            psoVar3.b = f318;
            float f319 = hlhVar3.b;
            int i2110 = i1119 | 2;
            psoVar3.a = i2110;
            psoVar3.c = f319;
            int i2111 = 4 | i2110;
            psoVar3.a = i2111;
            psoVar3.d = 0.0f;
            int i2112 = i2111 | 8;
            psoVar3.a = i2112;
            psoVar3.e = 0.0f;
            float f3110 = hlhVar3.c;
            int i2113 = i2112 | 16;
            psoVar3.a = i2113;
            psoVar3.f = f3110;
            float f3111 = hlhVar3.d;
            int i2114 = i2113 | 32;
            psoVar3.a = i2114;
            psoVar3.g = f3111;
            float f3112 = hlhVar3.e;
            int i2115 = i2114 | 64;
            psoVar3.a = i2115;
            psoVar3.h = f3112;
            float f3113 = hlhVar3.f;
            int i2116 = i2115 | 128;
            psoVar3.a = i2116;
            psoVar3.i = f3113;
            float f3114 = hlhVar3.g;
            int i2117 = i2116 | 256;
            psoVar3.a = i2117;
            psoVar3.j = f3114;
            float f3115 = hlhVar3.h;
            int i2118 = i2117 | 512;
            psoVar3.a = i2118;
            psoVar3.k = f3115;
            float f3116 = hlhVar3.i;
            psoVar3.a = i2118 | 1024;
            psoVar3.l = f3116;
            hkiVar.d.a(madVar.d(), psnVar14, (pso) poyVarM2.j());
        } else {
            f4 = f4;
            z = z;
            f5 = fA3;
            f6 = fPow;
            f7 = fA2;
        }
        return new hkn(madVar.d(), f4, f15, f16, f17, f18, f, f25, fA, f23, f6, f5, f7, z, zC, ojcVarC, ojcVarQ, ojcVarB);
    }
}
