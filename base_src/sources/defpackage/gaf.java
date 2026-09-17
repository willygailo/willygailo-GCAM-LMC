package defpackage;

import j$.util.List$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gaf implements gcf {
    private final gff a;
    private final pyn b;
    private final hko c;
    private final gbb d;
    private final List e = new ArrayList();

    public gaf(hko hkoVar, pyn pynVar, gff gffVar, gbb gbbVar) {
        this.a = gffVar;
        this.b = pynVar;
        this.c = hkoVar;
        this.d = gbbVar;
    }

    private final gae d(long j) {
        hkn hknVarC = this.c.c(j);
        if (hknVarC == null) {
            hknVarC = new hkn(j, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, false, oih.a, oih.a, oih.a);
        }
        return new gae(hknVarC);
    }

    private static final gan e(gae gaeVar) {
        return new gad(gaeVar);
    }

    @Override // defpackage.gev
    public final synchronized int a(List list) {
        this.e.clear();
        ArrayList arrayList = new ArrayList(list);
        List$CC.$default$sort(arrayList, cdg.g);
        oom oomVarJ = oom.j(arrayList);
        int size = oomVarJ.size();
        int iB = this.d.b();
        int iA = this.d.a();
        if (size < iB) {
            iA = Math.max(1, (iA - iB) + size);
        }
        if (this.a.a() == 1) {
            return 0;
        }
        lmw lmwVarB = ((lrr) oomVarJ.get(oomVarJ.size() - 1)).b();
        lmwVarB.getClass();
        long j = lmwVarB.b;
        int iMax = Math.max(oomVarJ.size() - iA, 0);
        lmw lmwVarB2 = ((lrr) oomVarJ.get(iMax)).b();
        lmwVarB2.getClass();
        orj orjVarF = orj.f(Long.valueOf(lmwVarB2.b), Long.valueOf(j));
        HashMap map = new HashMap();
        for (int i = 0; i < oomVarJ.size(); i++) {
            lmw lmwVarB3 = ((lrr) oomVarJ.get(i)).b();
            lmwVarB3.getClass();
            gae gaeVarD = d(lmwVarB3.b);
            map.put((lrr) oomVarJ.get(i), gaeVarD);
            this.e.add(gaeVarD);
        }
        List<gae> list2 = this.e;
        ArrayList<hkn> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (gae gaeVar : list2) {
            if (orjVarF.a(Long.valueOf(gaeVar.a.a))) {
                arrayList3.add(Float.valueOf(0.0f));
            } else {
                arrayList2.add(gaeVar.a);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (hkn hknVar : arrayList2) {
            float fB = hls.b(hknVar, arrayList2) * 5.0E-4f;
            long j2 = hknVar.a;
            arrayList4.add(new hkm(fB, fB));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList5.add(Float.valueOf(((hkm) it.next()).b));
        }
        arrayList5.addAll(arrayList3);
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            gae gaeVar2 = (gae) this.e.get(i2);
            fpq fpqVar = (fpq) this.b.get();
            Long lValueOf = Long.valueOf(gaeVar2.a.a);
            float f = true != fpqVar.b(orj.f(lValueOf, lValueOf)) ? 0.0f : -1000.0f;
            fpq fpqVar2 = (fpq) this.b.get();
            Long lValueOf2 = Long.valueOf(gaeVar2.a.a);
            if (!fpqVar2.a(orj.f(lValueOf2, lValueOf2))) {
                f -= 1000.0f;
            }
            gaeVar2.b += ((Float) arrayList5.get(i2)).floatValue() + f;
            gaeVar2.c += f;
        }
        while (iMax < oomVarJ.size()) {
            lrr lrrVar = (lrr) oomVarJ.get(iMax);
            if (map.containsKey(lrrVar)) {
                ((gae) map.get(lrrVar)).b += 10000.0f;
            }
            iMax++;
        }
        float f2 = Float.MAX_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < oomVarJ.size(); i4++) {
            gae gaeVar3 = (gae) map.get(oomVarJ.get(i4));
            gaeVar3.getClass();
            float f3 = gaeVar3.b;
            if (f3 < f2) {
                i3 = i4;
            }
            if (f3 < f2) {
                f2 = f3;
            }
        }
        this.e.remove(i3);
        return i3;
    }

    @Override // defpackage.gao
    public final gan b(long j) {
        return e(d(j));
    }

    @Override // defpackage.gao
    public final synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            arrayList.add(e((gae) it.next()));
        }
        return arrayList;
    }
}
