package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lrl {
    private final lnf a;
    private final lqn b;
    private final ltd c;
    private final lrg d;
    private final Set e;
    private final ope f;
    private final Set g;
    private final ncp h;
    private final mip i;

    public lrl(lnf lnfVar, lqn lqnVar, ncp ncpVar, lom lomVar, loy loyVar, mip mipVar, ltd ltdVar, lrg lrgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = lnfVar;
        this.b = lqnVar;
        this.h = ncpVar;
        this.c = ltdVar;
        this.d = lrgVar;
        opc opcVar = new opc();
        synchronized (loyVar) {
            Iterator it = loyVar.b.iterator();
            while (it.hasNext()) {
                opcVar.d(((low) it.next()).h);
            }
        }
        this.e = opcVar.f();
        this.f = lomVar.a();
        this.i = mipVar;
        this.g = new HashSet();
    }

    private final ltm i(lnt lntVar, Set set, Set set2, Set set3, Set set4) {
        Iterator it = set4.iterator();
        while (it.hasNext()) {
            obr.aF(set3.contains(((lqh) it.next()).c));
        }
        opc opcVar = new opc();
        Iterator it2 = set3.iterator();
        while (it2.hasNext()) {
            opcVar.i(((lqd) it2.next()).c);
        }
        HashMap map = new HashMap();
        oti otiVarListIterator = this.a.h.listIterator();
        while (otiVarListIterator.hasNext()) {
            lnq lnqVar = (lnq) otiVarListIterator.next();
            map.put(lnqVar.a, lnqVar);
        }
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            for (lnq lnqVar2 : ((lqd) it3.next()).d) {
                if (map.containsKey(lnqVar2.a)) {
                    lnq lnqVar3 = (lnq) map.get(lnqVar2.a);
                    lnqVar3.getClass();
                    if (!lnqVar2.equals(lnqVar3)) {
                        String strValueOf = String.valueOf(lnqVar2.a);
                        String strValueOf2 = String.valueOf(lnqVar2.b);
                        String strValueOf3 = String.valueOf(lnqVar3.b);
                        int length = String.valueOf(strValueOf).length();
                        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
                        sb.append("Conflicting parameter value for ");
                        sb.append(strValueOf);
                        sb.append(": ");
                        sb.append(strValueOf2);
                        sb.append(" and ");
                        sb.append(strValueOf3);
                        sb.append(" do not match.");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    map.put(lnqVar2.a, lnqVar2);
                }
            }
        }
        Iterator it4 = set.iterator();
        while (it4.hasNext()) {
            lnq lnqVar4 = (lnq) it4.next();
            if (!map.containsKey(lnqVar4.a)) {
                map.put(lnqVar4.a, lnqVar4);
            }
        }
        oom oomVar = lntVar.b;
        int size = oomVar.size();
        for (int i = 0; i < size; i++) {
            lnq lnqVar5 = (lnq) oomVar.get(i);
            if (!map.containsKey(lnqVar5.a)) {
                map.put(lnqVar5.a, lnqVar5);
            }
        }
        lrg lrgVar = this.d;
        lie lieVarA = lrgVar.a();
        try {
            Set<lnq> setF = lrg.f(lrgVar.a);
            lieVarA.close();
            for (lnq lnqVar6 : setF) {
                if (!map.containsKey(lnqVar6.a)) {
                    map.put(lnqVar6.a, lnqVar6);
                }
            }
            opc opcVar2 = new opc();
            opcVar2.i(set2);
            ncp ncpVar = this.h;
            lot lotVar = (lot) ncpVar.a.get();
            lotVar.getClass();
            loy loyVar = (loy) ncpVar.d.get();
            loyVar.getClass();
            lqn lqnVar = (lqn) ncpVar.b.get();
            lqnVar.getClass();
            ope opeVar = (ope) ncpVar.c.get();
            opeVar.getClass();
            set4.getClass();
            opcVar2.d(new loz(lotVar, loyVar, lqnVar, opeVar, set3, set4));
            opcVar2.d(this.b);
            return new ltm(lntVar.a, ope.F(map.values()), opcVar2.f(), opcVar.f());
        } catch (Throwable th) {
            try {
                lieVarA.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    private final ltm j(Set set, Set set2, Set set3, Set set4) {
        return i(n(set3) ? this.a.f : this.a.e, set, set2, set3, set4);
    }

    private final synchronized void k() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            lqh lqhVar = (lqh) it.next();
            if (lqhVar.k()) {
                it.remove();
                lqhVar.g();
            }
        }
    }

    private final synchronized void l() {
        k();
        for (lqh lqhVar : this.g) {
            lqhVar.f();
            lqhVar.g();
        }
        this.g.clear();
    }

    private final synchronized void m(Set set) {
        k();
        this.g.addAll(set);
    }

    private static final boolean n(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((lqd) it.next()).c.iterator();
            while (it2.hasNext()) {
                if (((lnx) it2.next()).e()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized lpc a() {
        lpc lpcVar;
        lpcVar = new lpc(new HashMap(), new HashSet(orx.a), new HashSet(orx.a));
        lpcVar.a.addAll(this.e);
        lpcVar.e(this.f);
        lpcVar.g(this.i);
        return lpcVar;
    }

    public final ltm b(Set set, Set set2, Set set3, Set set4) {
        return i(n(set3) ? this.a.d : this.a.c, set, set2, set3, set4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c() {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrl.c():void");
    }

    public final synchronized void d() {
        this.c.d();
    }

    public final synchronized void e(List list, List list2) {
        boolean z = true;
        obr.aF(!list.isEmpty());
        if (list.size() != list2.size()) {
            z = false;
        }
        obr.aF(z);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            lpd lpdVar = (lpd) list.get(i);
            Set set = (Set) list2.get(i);
            arrayList.add(b(lpdVar.a, lpdVar.b, lpdVar.c, set));
            m(set);
        }
        this.c.f(arrayList);
    }

    public final synchronized void f(lpd lpdVar) {
        this.c.c(j(lpdVar.a, lpdVar.b, lpdVar.c, orx.a));
    }

    public final synchronized void g(lpd lpdVar, Set set) {
        ltm ltmVarB = b(lpdVar.a, lpdVar.b, lpdVar.c, set);
        m(set);
        this.c.e(ltmVarB);
    }

    public final synchronized void h(lpd lpdVar) {
        this.c.e(j(lpdVar.a, lpdVar.b, lpdVar.c, orx.a));
    }
}
