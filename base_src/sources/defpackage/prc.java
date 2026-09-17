package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class prc {
    public static final plk a;
    public static final plk b;
    public static final plk c;
    private static final Class d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            cls = null;
        }
        d = cls;
        a = Y(false);
        b = Y(true);
        c = new plk();
    }

    static int A(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return o(list) + (size * pom.ab(i));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void B(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.l(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        ponVar.a.C(i3);
        while (i2 < list.size()) {
            ponVar.a.j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void C(int i, List list, pon ponVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ponVar.a.m(i, (poc) list.get(i2));
        }
    }

    public static void D(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.am(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        ponVar.a.C(i3);
        while (i2 < list.size()) {
            ponVar.a.an(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public static void E(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += pom.N(((Integer) list.get(i3)).intValue());
        }
        ponVar.a.C(iN);
        while (i2 < list.size()) {
            ponVar.a.t(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void F(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        ponVar.a.C(i3);
        while (i2 < list.size()) {
            ponVar.a.p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void G(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        ponVar.a.C(i3);
        while (i2 < list.size()) {
            ponVar.a.r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void H(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.ao(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        ponVar.a.C(i3);
        while (i2 < list.size()) {
            ponVar.a.ap(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public static void I(int i, List list, pon ponVar, prb prbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ponVar.h(i, list.get(i2), prbVar);
        }
    }

    public static void J(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += pom.N(((Integer) list.get(i3)).intValue());
        }
        ponVar.a.C(iN);
        while (i2 < list.size()) {
            ponVar.a.t(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void K(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int iAf = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iAf += pom.af(((Long) list.get(i3)).longValue());
        }
        ponVar.a.C(iAf);
        while (i2 < list.size()) {
            ponVar.a.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void L(int i, List list, pon ponVar, prb prbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ponVar.k(i, list.get(i2), prbVar);
        }
    }

    public static void M(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        ponVar.a.C(i3);
        while (i2 < list.size()) {
            ponVar.a.p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void N(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        ponVar.a.C(i3);
        while (i2 < list.size()) {
            ponVar.a.r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void O(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.ar(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iW += pom.W(((Integer) list.get(i3)).intValue());
        }
        ponVar.a.C(iW);
        while (i2 < list.size()) {
            ponVar.a.as(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void P(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.at(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iY += pom.Y(((Long) list.get(i3)).longValue());
        }
        ponVar.a.C(iY);
        while (i2 < list.size()) {
            ponVar.a.au(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void Q(int i, List list, pon ponVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ppx)) {
            while (i2 < list.size()) {
                ponVar.a.y(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        ppx ppxVar = (ppx) list;
        while (i2 < list.size()) {
            Object objF = ppxVar.f(i2);
            if (objF instanceof String) {
                ponVar.a.y(i, (String) objF);
            } else {
                ponVar.a.m(i, (poc) objF);
            }
            i2++;
        }
    }

    public static void R(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int iAd = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iAd += pom.ad(((Integer) list.get(i3)).intValue());
        }
        ponVar.a.C(iAd);
        while (i2 < list.size()) {
            ponVar.a.C(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void S(int i, List list, pon ponVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ponVar.a.D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ponVar.a.A(i, 2);
        int iAf = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iAf += pom.af(((Long) list.get(i3)).longValue());
        }
        ponVar.a.C(iAf);
        while (i2 < list.size()) {
            ponVar.a.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    static void T(Object obj, Object obj2) {
        pou pouVarG = plk.g(obj2);
        if (pouVarG.h()) {
            return;
        }
        pou pouVarH = plk.h(obj);
        for (int i = 0; i < pouVarG.b.a(); i++) {
            pouVarH.f(pouVarG.b.f(i));
        }
        Iterator it = pouVarG.b.c().iterator();
        while (it.hasNext()) {
            pouVarH.f((Map.Entry) it.next());
        }
    }

    static void U(Object obj, Object obj2, long j) {
        prv.u(obj, j, plk.aQ(prv.h(obj, j), prv.h(obj2, j)));
    }

    static void V(Object obj, Object obj2) {
        prn prnVarAF = plk.aF(obj);
        prn prnVarAF2 = plk.aF(obj2);
        if (!prnVarAF2.equals(prn.a)) {
            int i = prnVarAF.b + prnVarAF2.b;
            int[] iArrCopyOf = Arrays.copyOf(prnVarAF.c, i);
            System.arraycopy(prnVarAF2.c, 0, iArrCopyOf, prnVarAF.b, prnVarAF2.b);
            Object[] objArrCopyOf = Arrays.copyOf(prnVarAF.d, i);
            System.arraycopy(prnVarAF2.d, 0, objArrCopyOf, prnVarAF.b, prnVarAF2.b);
            prnVarAF = new prn(i, iArrCopyOf, objArrCopyOf, true);
        }
        plk.aG(obj, prnVarAF);
    }

    static Object W(int i, int i2, Object obj) {
        if (obj == null) {
            obj = prn.b();
        }
        plk.aE(obj, i, i2);
        return obj;
    }

    static Object X(int i, List list, ppi ppiVar, Object obj) {
        if (ppiVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (ppiVar.a(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj = W(i, iIntValue, obj);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!ppiVar.a(iIntValue2)) {
                    obj = W(i, iIntValue2, obj);
                    it.remove();
                }
            }
        }
        return obj;
    }

    private static plk Y(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (plk) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable th2) {
            return null;
        }
    }

    static int a(List list) {
        return list.size();
    }

    static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iAb = size * pom.ab(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iAb += pom.I((poc) list.get(i2));
        }
        return iAb;
    }

    static int c(List list) {
        int iN;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ppe) {
            ppe ppeVar = (ppe) list;
            iN = 0;
            while (i < size) {
                iN += pom.N(ppeVar.d(i));
                i++;
            }
        } else {
            iN = 0;
            while (i < size) {
                iN += pom.N(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iN;
    }

    static int d(List list) {
        return list.size() * 4;
    }

    static int e(List list) {
        return list.size() * 8;
    }

    static int f(int i, List list, prb prbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iK += pom.K(i, (pqm) list.get(i2), prbVar);
        }
        return iK;
    }

    static int g(List list) {
        int iN;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ppe) {
            ppe ppeVar = (ppe) list;
            iN = 0;
            while (i < size) {
                iN += pom.N(ppeVar.d(i));
                i++;
            }
        } else {
            iN = 0;
            while (i < size) {
                iN += pom.N(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iN;
    }

    static int h(List list) {
        int iAf;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pqb) {
            pqb pqbVar = (pqb) list;
            iAf = 0;
            while (i < size) {
                iAf += pom.af(pqbVar.f(i));
                i++;
            }
        } else {
            iAf = 0;
            while (i < size) {
                iAf += pom.af(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iAf;
    }

    static int i(int i, Object obj, prb prbVar) {
        return obj instanceof ppv ? pom.P(i, (ppv) obj) : pom.ab(i) + pom.T((pqm) obj, prbVar);
    }

    static int j(int i, List list, prb prbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iAb = pom.ab(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iAb += obj instanceof ppv ? pom.Q((ppv) obj) : pom.T((pqm) obj, prbVar);
        }
        return iAb;
    }

    static int k(List list) {
        int iW;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ppe) {
            ppe ppeVar = (ppe) list;
            iW = 0;
            while (i < size) {
                iW += pom.W(ppeVar.d(i));
                i++;
            }
        } else {
            iW = 0;
            while (i < size) {
                iW += pom.W(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iW;
    }

    static int l(List list) {
        int iY;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pqb) {
            pqb pqbVar = (pqb) list;
            iY = 0;
            while (i < size) {
                iY += pom.Y(pqbVar.f(i));
                i++;
            }
        } else {
            iY = 0;
            while (i < size) {
                iY += pom.Y(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iY;
    }

    static int m(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iAb = pom.ab(i) * size;
        if (list instanceof ppx) {
            ppx ppxVar = (ppx) list;
            while (i2 < size) {
                Object objF = ppxVar.f(i2);
                iAb += objF instanceof poc ? pom.I((poc) objF) : pom.aa((String) objF);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iAb += obj instanceof poc ? pom.I((poc) obj) : pom.aa((String) obj);
                i2++;
            }
        }
        return iAb;
    }

    static int n(List list) {
        int iAd;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ppe) {
            ppe ppeVar = (ppe) list;
            iAd = 0;
            while (i < size) {
                iAd += pom.ad(ppeVar.d(i));
                i++;
            }
        } else {
            iAd = 0;
            while (i < size) {
                iAd += pom.ad(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iAd;
    }

    static int o(List list) {
        int iAf;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pqb) {
            pqb pqbVar = (pqb) list;
            iAf = 0;
            while (i < size) {
                iAf += pom.af(pqbVar.f(i));
                i++;
            }
        } else {
            iAf = 0;
            while (i < size) {
                iAf += pom.af(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iAf;
    }

    public static void p(Class cls) {
        Class cls2;
        if (!ppd.class.isAssignableFrom(cls) && (cls2 = d) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * pom.av(i);
    }

    static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * pom.ab(i));
    }

    static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * pom.ax(i);
    }

    static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * pom.ay(i);
    }

    static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * pom.ab(i));
    }

    static int w(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return h(list) + (list.size() * pom.ab(i));
    }

    static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k(list) + (size * pom.ab(i));
    }

    static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l(list) + (size * pom.ab(i));
    }

    static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n(list) + (size * pom.ab(i));
    }
}
