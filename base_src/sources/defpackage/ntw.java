package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ntw implements qco {
    final /* synthetic */ nty a;
    final /* synthetic */ nuj b;

    public ntw(nty ntyVar, nuj nujVar) {
        this.a = ntyVar;
        this.b = nujVar;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) throws IOException {
        String strA;
        String str = (String) obj;
        str.getClass();
        nty ntyVar = this.a;
        nuj nujVar = this.b;
        nqh nqhVar = nujVar.b;
        List<npe> list = nujVar.c;
        List list2 = nujVar.d;
        poy poyVarM = ptm.j.m();
        plv plvVarC = nqhVar.c();
        plvVarC.getClass();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ptm ptmVar = (ptm) poyVarM.b;
        ptmVar.b = plvVarC;
        ptmVar.a |= 1;
        nmz nmzVar = nqhVar.t;
        if (nmzVar != null) {
            String strB = nmzVar.b();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ptm ptmVar2 = (ptm) poyVarM.b;
            int i = ptmVar2.a | 2;
            ptmVar2.a = i;
            ptmVar2.c = strB;
            ptmVar2.a = i | 64;
            ptmVar2.f = true;
        }
        plu pluVar = nqhVar.q;
        if (pluVar != null) {
            ptm ptmVar3 = (ptm) poyVarM.b;
            ptmVar3.e = pluVar;
            ptmVar3.a |= 32;
        }
        boolean z = (qno.c(str, nnk.a.a) && nqhVar.m.isEmpty()) ? false : true;
        if (nqhVar.k != null || z) {
            poy poyVarM2 = ply.e.m();
            pop popVar = nqhVar.k;
            if (popVar != null) {
                poy poyVarM3 = plw.d.m();
                if (poyVarM3.c) {
                    poyVarM3.m();
                    poyVarM3.c = false;
                }
                plw plwVar = (plw) poyVarM3.b;
                plwVar.b = popVar;
                plwVar.a |= 1;
                prl prlVarB = psf.b(ntyVar.f.a());
                if (poyVarM3.c) {
                    poyVarM3.m();
                    poyVarM3.c = false;
                }
                plw plwVar2 = (plw) poyVarM3.b;
                prlVarB.getClass();
                plwVar2.c = prlVarB;
                plwVar2.a |= 2;
                plw plwVar3 = (plw) poyVarM3.j();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                ply plyVar = (ply) poyVarM2.b;
                plwVar3.getClass();
                plyVar.c = plwVar3;
                plyVar.a |= 2;
            }
            if (z) {
                poy poyVarM4 = plx.d.m();
                if (true == qno.c(str, nnk.a.a)) {
                    str = null;
                }
                if (str != null) {
                    if (poyVarM4.c) {
                        poyVarM4.m();
                        poyVarM4.c = false;
                    }
                    plx plxVar = (plx) poyVarM4.b;
                    plxVar.a = 3;
                    plxVar.b = str;
                }
                Iterator it = nqhVar.m.iterator();
                while (it.hasNext()) {
                    String string = ((oyj) it.next()).toString();
                    if (poyVarM4.c) {
                        poyVarM4.m();
                        poyVarM4.c = false;
                    }
                    plx plxVar2 = (plx) poyVarM4.b;
                    string.getClass();
                    ppm ppmVar = plxVar2.c;
                    if (!ppmVar.c()) {
                        plxVar2.c = ppd.B(ppmVar);
                    }
                    plxVar2.c.add(string);
                }
                plx plxVar3 = (plx) poyVarM4.j();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                ply plyVar2 = (ply) poyVarM2.b;
                plxVar3.getClass();
                plyVar2.d = plxVar3;
                plyVar2.a |= 4;
            }
            ply plyVar3 = (ply) poyVarM2.j();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ptm ptmVar4 = (ptm) poyVarM.b;
            plyVar3.getClass();
            ptmVar4.d = plyVar3;
            ptmVar4.a |= 16;
        } else {
            poy poyVarM5 = ply.e.m();
            if (poyVarM5.c) {
                poyVarM5.m();
                poyVarM5.c = false;
            }
            ply plyVar4 = (ply) poyVarM5.b;
            plyVar4.a |= 1;
            plyVar4.b = true;
            ply plyVar5 = (ply) poyVarM5.j();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ptm ptmVar5 = (ptm) poyVarM.b;
            plyVar5.getClass();
            ptmVar5.d = plyVar5;
            ptmVar5.a |= 16;
        }
        ArrayList arrayList = new ArrayList(qmd.B(list));
        for (npe npeVar : list) {
            poy poyVarM6 = ptj.f.m();
            nmz nmzVar2 = npeVar.j;
            if (nmzVar2 != null) {
                String strB2 = nmzVar2.b();
                if (poyVarM6.c) {
                    poyVarM6.m();
                    poyVarM6.c = false;
                }
                ptj ptjVar = (ptj) poyVarM6.b;
                ptjVar.a |= 1;
                ptjVar.b = strB2;
            }
            String str2 = npeVar.c;
            if (str2 != null) {
                if (poyVarM6.c) {
                    poyVarM6.m();
                    poyVarM6.c = false;
                }
                ptj ptjVar2 = (ptj) poyVarM6.b;
                ptjVar2.a |= 2;
                ptjVar2.c = str2;
            }
            FileInputStream fileInputStream = new FileInputStream(ntyVar.h.a(npeVar));
            try {
                poc pocVarW = poc.w(fileInputStream);
                qmd.a(fileInputStream, null);
                if (poyVarM6.c) {
                    poyVarM6.m();
                    poyVarM6.c = false;
                }
                ptj ptjVar3 = (ptj) poyVarM6.b;
                pocVarW.getClass();
                int i2 = ptjVar3.a | 4;
                ptjVar3.a = i2;
                ptjVar3.d = pocVarW;
                ptjVar3.a = i2 | 8;
                ptjVar3.e = true;
                arrayList.add((ptj) poyVarM6.j());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    qmd.a(fileInputStream, th);
                    throw th2;
                }
            }
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ptm ptmVar6 = (ptm) poyVarM.b;
        ppm ppmVar2 = ptmVar6.g;
        if (!ppmVar2.c()) {
            ptmVar6.g = ppd.B(ppmVar2);
        }
        pnl.e(arrayList, ptmVar6.g);
        ArrayList<npe> arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            nmz nmzVar3 = ((npe) obj2).j;
            if (nmzVar3 == null || (strA = nmzVar3.a()) == null || !qno.u(strA, "FfcImage_")) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(qmd.B(arrayList2));
        for (npe npeVar2 : arrayList2) {
            poy poyVarM7 = ptk.f.m();
            nmz nmzVar4 = npeVar2.j;
            if (nmzVar4 != null) {
                String strB3 = nmzVar4.b();
                if (poyVarM7.c) {
                    poyVarM7.m();
                    poyVarM7.c = false;
                }
                ptk ptkVar = (ptk) poyVarM7.b;
                ptkVar.a |= 1;
                ptkVar.b = strB3;
            }
            String str3 = npeVar2.c;
            if (str3 != null) {
                if (poyVarM7.c) {
                    poyVarM7.m();
                    poyVarM7.c = false;
                }
                ptk ptkVar2 = (ptk) poyVarM7.b;
                ptkVar2.a |= 2;
                ptkVar2.c = str3;
            }
            String str4 = npeVar2.f;
            str4.getClass();
            if (poyVarM7.c) {
                poyVarM7.m();
                poyVarM7.c = false;
            }
            ptk ptkVar3 = (ptk) poyVarM7.b;
            int i3 = ptkVar3.a | 4;
            ptkVar3.a = i3;
            ptkVar3.d = str4;
            ptkVar3.a = i3 | 8;
            ptkVar3.e = true;
            arrayList3.add((ptk) poyVarM7.j());
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ptm ptmVar7 = (ptm) poyVarM.b;
        ppm ppmVar3 = ptmVar7.h;
        if (!ppmVar3.c()) {
            ptmVar7.h = ppd.B(ppmVar3);
        }
        pnl.e(arrayList3, ptmVar7.h);
        pti ptiVar = nqhVar.p;
        if (ptiVar != null) {
            ppm ppmVar4 = ptiVar.a;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ptm ptmVar8 = (ptm) poyVarM.b;
            ppm ppmVar5 = ptmVar8.i;
            if (!ppmVar5.c()) {
                ptmVar8.i = ppd.B(ppmVar5);
            }
            pnl.e(ppmVar4, ptmVar8.i);
        }
        ppd ppdVarJ = poyVarM.j();
        ppdVarJ.getClass();
        return (ptm) ppdVarJ;
    }
}
