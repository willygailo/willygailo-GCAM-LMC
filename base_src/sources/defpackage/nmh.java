package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nmh {
    private static final ojq a = ojq.c(oiq.b);

    public static pnc a(int i, int i2, int i3, int i4, Float f) {
        poy poyVarM = pnc.g.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pnc pncVar = (pnc) poyVarM.b;
        int i5 = pncVar.a | 1;
        pncVar.a = i5;
        pncVar.b = i;
        int i6 = i5 | 2;
        pncVar.a = i6;
        pncVar.c = i2;
        int i7 = i6 | 4;
        pncVar.a = i7;
        pncVar.d = i3;
        pncVar.a = i7 | 8;
        pncVar.e = i4;
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pnc pncVar2 = (pnc) poyVarM.b;
            pncVar2.a |= 16;
            pncVar2.f = fFloatValue;
        }
        return (pnc) poyVarM.j();
    }

    public static pnh b(String str) {
        Iterator it;
        pnj pnjVar;
        ppd ppdVarJ;
        int i = 1;
        pnf[] pnfVarArr = new pnf[1];
        pnc pncVarA = a(10, 50, 25, 100, null);
        ppa ppaVar = (ppa) pnf.g.m();
        boolean z = false;
        if (str != null) {
            if (ppaVar.c) {
                ppaVar.m();
                ppaVar.c = false;
            }
            pnf pnfVar = (pnf) ppaVar.b;
            pnfVar.a |= 8;
            pnfVar.d = str;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            Iterator it2 = a.e(str).iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                int length = str2.length();
                if (length > 0) {
                    pnc pncVarC = c(pncVarA, ((pnf) ppaVar.b).d.length(), i2, length);
                    poy poyVarM = pnj.e.m();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = z;
                    }
                    pnj pnjVar2 = (pnj) poyVarM.b;
                    pncVarC.getClass();
                    pnjVar2.c = pncVarC;
                    int i3 = pnjVar2.a | i;
                    pnjVar2.a = i3;
                    if (str2 == null) {
                        pnjVar = (pnj) poyVarM.j();
                        it = it2;
                    } else {
                        pnjVar2.a = i3 | 4;
                        pnjVar2.d = str2;
                        ArrayList arrayList2 = new ArrayList();
                        int i4 = 0;
                        while (i4 < str2.length()) {
                            int i5 = i4 + 1;
                            String strSubstring = str2.substring(i4, i5);
                            pnc pncVar = ((pnj) poyVarM.b).c;
                            if (pncVar == null) {
                                pncVar = pnc.g;
                            }
                            pnc pncVarC2 = c(pncVar, ((pnj) poyVarM.b).d.length(), i4, i);
                            poy poyVarM2 = png.f.m();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            png pngVar = (png) poyVarM2.b;
                            Iterator it3 = it2;
                            int i6 = pngVar.a | i;
                            pngVar.a = i6;
                            pngVar.b = 0;
                            pncVarC2.getClass();
                            pngVar.c = pncVarC2;
                            int i7 = i6 | 2;
                            pngVar.a = i7;
                            if (strSubstring == null) {
                                ppdVarJ = poyVarM2.j();
                            } else {
                                int i8 = i7 | 8;
                                pngVar.a = i8;
                                pngVar.d = strSubstring;
                                pngVar.a = i8 | 1;
                                if (!oje.d(strSubstring)) {
                                    int iCodePointAt = strSubstring.codePointAt(0);
                                    if (poyVarM2.c) {
                                        poyVarM2.m();
                                        poyVarM2.c = false;
                                    }
                                    png pngVar2 = (png) poyVarM2.b;
                                    pngVar2.a |= 1;
                                    pngVar2.b = iCodePointAt;
                                }
                                ppdVarJ = poyVarM2.j();
                            }
                            arrayList2.add((png) ppdVarJ);
                            it2 = it3;
                            i4 = i5;
                            i = 1;
                        }
                        it = it2;
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        pnj pnjVar3 = (pnj) poyVarM.b;
                        ppm ppmVar = pnjVar3.b;
                        if (!ppmVar.c()) {
                            pnjVar3.b = ppd.B(ppmVar);
                        }
                        pnl.e(arrayList2, pnjVar3.b);
                        pnjVar = (pnj) poyVarM.j();
                    }
                    arrayList.add(pnjVar);
                } else {
                    it = it2;
                }
                i2 += length + 1;
                it2 = it;
                i = 1;
                z = false;
            }
        }
        if (ppaVar.c) {
            ppaVar.m();
            ppaVar.c = false;
        }
        pnf pnfVar2 = (pnf) ppaVar.b;
        pncVarA.getClass();
        pnfVar2.c = pncVarA;
        pnfVar2.a |= 1;
        ppm ppmVar2 = pnfVar2.b;
        if (!ppmVar2.c()) {
            pnfVar2.b = ppd.B(ppmVar2);
        }
        pnl.e(arrayList, pnfVar2.b);
        pnfVarArr[0] = (pnf) ppaVar.j();
        int i9 = 0;
        for (int i10 = 0; i10 <= 0; i10++) {
            pnf pnfVar3 = pnfVarArr[i10];
            int i11 = pnfVar3.a;
            if ((i11 & 8192) == 0 || (i11 & 16384) == 0) {
                poy poyVar = (poy) pnfVar3.G(5);
                poyVar.o(pnfVar3);
                ppa ppaVar2 = (ppa) poyVar;
                if (ppaVar2.c) {
                    ppaVar2.m();
                    ppaVar2.c = false;
                }
                pnf pnfVar4 = (pnf) ppaVar2.b;
                int i12 = pnfVar4.a | 8192;
                pnfVar4.a = i12;
                pnfVar4.e = 0;
                pnfVar4.a = i12 | 16384;
                pnfVar4.f = i9;
                pnfVarArr[i10] = (pnf) ppaVar2.j();
                i9++;
            }
        }
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 <= 0; i13++) {
            pnc pncVar2 = pnfVarArr[i13].c;
            if (pncVar2 == null) {
                pncVar2 = pnc.g;
            }
            int iCeil = (int) Math.ceil(Math.hypot(pncVar2.d, pncVar2.e));
            iMax = Math.max(iMax, pncVar2.b + iCeil);
            iMax2 = Math.max(iMax2, pncVar2.c + iCeil);
        }
        poy poyVarM3 = pni.e.m();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pni pniVar = (pni) poyVarM3.b;
        int i14 = pniVar.a | 1;
        pniVar.a = i14;
        pniVar.b = iMax;
        pniVar.a = i14 | 2;
        pniVar.c = iMax2;
        pni pniVar2 = (pni) poyVarM3.j();
        poy poyVarM4 = pnh.e.m();
        List listAsList = Arrays.asList(pnfVarArr);
        if (poyVarM4.c) {
            poyVarM4.m();
            poyVarM4.c = false;
        }
        pnh pnhVar = (pnh) poyVarM4.b;
        ppm ppmVar3 = pnhVar.c;
        if (!ppmVar3.c()) {
            pnhVar.c = ppd.B(ppmVar3);
        }
        pnl.e(listAsList, pnhVar.c);
        if (poyVarM4.c) {
            poyVarM4.m();
            poyVarM4.c = false;
        }
        pnh pnhVar2 = (pnh) poyVarM4.b;
        pniVar2.getClass();
        pnhVar2.d = pniVar2;
        pnhVar2.a |= 16;
        poc pocVar = poc.b;
        if (poyVarM4.c) {
            poyVarM4.m();
            poyVarM4.c = false;
        }
        pnh pnhVar3 = (pnh) poyVarM4.b;
        pocVar.getClass();
        pnhVar3.a |= 1;
        pnhVar3.b = pocVar;
        return (pnh) poyVarM4.j();
    }

    private static pnc c(pnc pncVar, int i, int i2, int i3) {
        pncVar.getClass();
        obr.aG(true, "numChars should not be negative");
        obr.aG(i3 <= i, "numChars should not exceed fullTextLen");
        obr.aG(i2 >= 0, "firstCharIndex should not be negative");
        obr.aG(i2 + i3 <= i, "firstCharIndex + numChars should not exceed fullTextLen");
        float fMax = pncVar.d / Math.max(1, i);
        double radians = Math.toRadians(pncVar.f);
        float f = i2 * fMax;
        return a(Math.round(pncVar.b + (((float) Math.cos(radians)) * f)), Math.round(pncVar.c + (((float) Math.sin(radians)) * f)), Math.round((i3 * fMax) + f) - Math.round(f), pncVar.e, (pncVar.a & 16) != 0 ? Float.valueOf(pncVar.f) : null);
    }
}
