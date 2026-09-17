package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lot {
    public final lrq a;
    public final nox b;
    private final lxv c;

    public lot(lxv lxvVar, lrq lrqVar, nox noxVar, byte[] bArr, byte[] bArr2) {
        this.c = lxvVar;
        this.a = lrqVar;
        this.b = noxVar;
    }

    public final lie a() {
        return this.c.c();
    }

    public final synchronized pht b(Set set) {
        pht phtVarH;
        pht phtVarBX;
        lap lapVar = new lap();
        try {
            lapVar.c(a());
            final los losVar = new los(this);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                lqd lqdVar = (lqd) it.next();
                for (final ltw ltwVar : lqdVar.a) {
                    if (!losVar.b.contains(ltwVar)) {
                        lrq lrqVar = losVar.d.a;
                        lxu lxuVarB = lrqVar.b(ltwVar);
                        pht phtVarG = lxuVarB == null ? ltwVar.b.a.g(1L) : null;
                        obr.ap(ltwVar.d > 0);
                        lxu lxuVarA = lrqVar.a(ltwVar.d);
                        pht phtVarG2 = lxuVarA == null ? lrqVar.a.g(ltwVar.d) : null;
                        if (lxuVarB == null || lxuVarA == null) {
                            if (phtVarG == null) {
                                lxuVarB.getClass();
                                phtVarG = plk.V(lxuVarB);
                            }
                            if (phtVarG2 == null) {
                                lxuVarA.getClass();
                                phtVarG2 = plk.V(lxuVarA);
                            }
                            phtVarBX = mip.bX(phtVarG, phtVarG2, new lhw() { // from class: lrp
                                @Override // defpackage.lhw
                                public final Object a(Object obj, Object obj2) {
                                    return lup.f((lxu) obj2, (lxu) obj);
                                }
                            });
                        } else {
                            phtVarBX = plk.V(lup.f(lxuVarA, lxuVarB));
                        }
                        losVar.a.add(pgb.h(phtVarBX, new oiu() { // from class: loq
                            @Override // defpackage.oiu
                            public final Object a(Object obj) {
                                return luh.e(ltwVar, (lup) obj);
                            }
                        }, pgr.INSTANCE));
                        losVar.b.add(ltwVar);
                    }
                }
                for (final lty ltyVar : lqdVar.b) {
                    if (!losVar.b.contains(ltyVar)) {
                        long j = ltyVar.b;
                        if (j > 0) {
                            lrq lrqVar2 = losVar.d.a;
                            obr.ap(j > 0);
                            lxu lxuVarA2 = lrqVar2.a(ltyVar.b);
                            losVar.a.add(pgb.h(lxuVarA2 == null ? pgb.h(lrqVar2.a.g(ltyVar.b), new imd(9), pgr.INSTANCE) : plk.V(lup.f(lxuVarA2, null)), new oiu() { // from class: lor
                                @Override // defpackage.oiu
                                public final Object a(Object obj) {
                                    return ltz.e(ltyVar, (lup) obj);
                                }
                            }, pgr.INSTANCE));
                        } else {
                            losVar.a.add(plk.V(ltz.g(ltyVar)));
                        }
                        losVar.b.add(ltyVar);
                    }
                }
                losVar.c.add(lqdVar);
            }
            phtVarH = pgb.h(plk.R(losVar.a), new oiu() { // from class: lop
                @Override // defpackage.oiu
                public final Object a(Object obj) {
                    los losVar2 = losVar;
                    List<lun> list = (List) obj;
                    opc opcVarD = ope.D();
                    for (lqd lqdVar2 : losVar2.c) {
                        lot lotVar = losVar2.d;
                        opc opcVarD2 = ope.D();
                        for (lun lunVar : list) {
                            if (lqdVar2.c.contains(lunVar.d())) {
                                opcVarD2.d(lunVar);
                            }
                        }
                        opcVarD.d(lqh.n(lotVar.b, lqdVar2, opcVarD2.f()));
                    }
                    return opcVarD.f();
                }
            }, pgr.INSTANCE);
            lapVar.close();
        } catch (Throwable th) {
            try {
                lapVar.close();
                throw th;
            } catch (Throwable th2) {
                throw th;
            }
        }
        return phtVarH;
    }

    public final synchronized Set c(Set set) {
        return d(set, orx.a);
    }

    public final synchronized Set d(Set set, Set set2) {
        ope opeVarF;
        ArrayList arrayList;
        ArrayList arrayList2;
        lup lupVarF;
        try {
            lap lapVar = new lap();
            try {
                lapVar.c(a());
                ArrayList<lun> arrayList3 = new ArrayList();
                ArrayList<lqh> arrayList4 = new ArrayList();
                ArrayList<lqd> arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    lqh lqhVar = (lqh) it.next();
                    for (lun lunVar : lqhVar.a) {
                        lnx lnxVarD = lunVar.d();
                        if (arrayList6.contains(lnxVarD)) {
                            obr.aF(arrayList3.contains(lunVar));
                        } else {
                            arrayList6.add(lnxVarD);
                            arrayList3.add(lunVar);
                        }
                    }
                    lqd lqdVar = lqhVar.c;
                    obr.aQ(true ^ arrayList5.contains(lqdVar));
                    arrayList5.add(lqdVar);
                    arrayList4.add(lqhVar);
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    lqd lqdVar2 = (lqd) it2.next();
                    if (!arrayList5.contains(lqdVar2)) {
                        arrayList5.add(lqdVar2);
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it3 = lqdVar2.a.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                ltw ltwVar = (ltw) it3.next();
                                if (!arrayList6.contains(ltwVar)) {
                                    lapVar.c(ltwVar.b.a());
                                    lrq lrqVar = this.a;
                                    lxu lxuVarB = lrqVar.b(ltwVar);
                                    if (lxuVarB == null) {
                                        arrayList2 = arrayList7;
                                        lupVarF = null;
                                    } else {
                                        arrayList2 = arrayList7;
                                        obr.ap(ltwVar.d > 0);
                                        lxu lxuVarA = lrqVar.a(ltwVar.d);
                                        if (lxuVarA == null && ltwVar.i()) {
                                            lxuVarA = lrqVar.a.d(ltwVar.d);
                                        }
                                        if (lxuVarA == null) {
                                            lxuVarB.close();
                                            lupVarF = null;
                                        } else {
                                            lupVarF = lup.f(lxuVarA, lxuVarB);
                                        }
                                    }
                                    if (lupVarF == null) {
                                        arrayList = arrayList2;
                                    } else {
                                        ArrayList arrayList8 = arrayList2;
                                        arrayList8.add(luh.e(ltwVar, lupVarF));
                                        arrayList7 = arrayList8;
                                    }
                                }
                            } else {
                                arrayList = arrayList7;
                                Iterator it4 = lqdVar2.b.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        lty ltyVar = (lty) it4.next();
                                        if (!arrayList6.contains(ltyVar)) {
                                            long j = ltyVar.b;
                                            if (j > 0) {
                                                lrq lrqVar2 = this.a;
                                                obr.aF(j > 0);
                                                lxu lxuVarA2 = lrqVar2.a(ltyVar.b);
                                                lup lupVarF2 = lxuVarA2 == null ? null : lup.f(lxuVarA2, null);
                                                if (lupVarF2 != null) {
                                                    arrayList.add(ltz.e(ltyVar, lupVarF2));
                                                }
                                            } else {
                                                arrayList.add(ltz.g(ltyVar));
                                            }
                                        }
                                    } else {
                                        int size = arrayList.size();
                                        for (int i = 0; i < size; i++) {
                                            lun lunVar2 = (lun) arrayList.get(i);
                                            obr.aQ(!arrayList3.contains(lunVar2));
                                            arrayList6.add(lunVar2.d());
                                            arrayList3.add(lunVar2);
                                        }
                                    }
                                }
                            }
                            int size2 = arrayList.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                lie lieVarA = ((lun) arrayList.get(i2)).a();
                                if (lieVarA != null) {
                                    lieVarA.close();
                                }
                            }
                        }
                    }
                }
                nox noxVar = this.b;
                ArrayMap arrayMap = new ArrayMap();
                for (lun lunVar3 : arrayList3) {
                    arrayMap.put(lunVar3.d(), lunVar3);
                }
                opc opcVarD = ope.D();
                for (lqd lqdVar3 : arrayList5) {
                    lqh lqhVar2 = null;
                    for (lqh lqhVar3 : arrayList4) {
                        if (lqhVar3.c == lqdVar3) {
                            lqhVar2 = lqhVar3;
                        }
                    }
                    if (lqhVar2 != null) {
                        opcVarD.d(lqhVar2);
                    } else {
                        opc opcVarD2 = ope.D();
                        oti otiVarListIterator = lqdVar3.c.listIterator();
                        while (otiVarListIterator.hasNext()) {
                            lnx lnxVar = (lnx) otiVarListIterator.next();
                            lun lunVarF = (lun) arrayMap.get(lnxVar);
                            if (lunVarF == null) {
                                if (lnxVar instanceof ltw) {
                                    lup lupVarG = lup.g();
                                    luh luhVar = new luh(lnxVar, lupVarG);
                                    lupVarG.e(luhVar);
                                    lunVarF = luhVar;
                                } else {
                                    obr.ap(lnxVar instanceof lty);
                                    lunVarF = ltz.f(lnxVar);
                                }
                                arrayMap.put(lnxVar, lunVarF);
                            }
                            opcVarD2.d(lunVarF);
                        }
                        opcVarD.d(lqh.n(noxVar, lqdVar3, opcVarD2.f()));
                    }
                }
                opeVarF = opcVarD.f();
                lapVar.close();
            } catch (Throwable th) {
                try {
                    lapVar.close();
                    throw th;
                } catch (Throwable th2) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return opeVarF;
    }
}
