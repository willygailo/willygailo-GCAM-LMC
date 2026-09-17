package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class bdc implements bct {
    private final bcy a;
    private final bdb b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public bdc() {
        this.a = new bcy();
        this.b = new bdb();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    public bdc(int i) {
        this.a = new bcy();
        this.b = new bdb();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }

    private final bcs f(Class cls) {
        bcs bczVar = (bcs) this.d.get(cls);
        if (bczVar == null) {
            if (cls.equals(int[].class)) {
                bczVar = new bcz(0);
            } else {
                if (!cls.equals(byte[].class)) {
                    String strValueOf = String.valueOf(cls.getSimpleName());
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "No array pool found for: ".concat(strValueOf) : new String("No array pool found for: "));
                }
                bczVar = new bcz(1);
            }
            this.d.put(cls, bczVar);
        }
        return bczVar;
    }

    private final Object g(bda bdaVar, Class cls) {
        bcs bcsVarF = f(cls);
        Object objA = this.a.a(bdaVar);
        if (objA != null) {
            this.f -= bcsVarF.a(objA) * bcsVarF.b();
            i(bcsVarF.a(objA), cls);
        }
        return objA == null ? bcsVarF.c(bdaVar.a) : objA;
    }

    private final NavigableMap h(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    private final void i(int i, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer numValueOf = Integer.valueOf(i);
        Integer num = (Integer) navigableMapH.get(numValueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(numValueOf);
                return;
            } else {
                navigableMapH.put(numValueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        String strValueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 56);
        sb.append("Tried to decrement empty size, size: ");
        sb.append(i);
        sb.append(", this: ");
        sb.append(strValueOf);
        throw new NullPointerException(sb.toString());
    }

    private final void j(int i) {
        while (this.f > i) {
            Object objB = this.a.b();
            aae.s(objB);
            bcs bcsVarF = f(objB.getClass());
            this.f -= bcsVarF.a(objB) * bcsVarF.b();
            i(bcsVarF.a(objB), objB.getClass());
        }
    }

    @Override // defpackage.bct
    public final synchronized Object a(int i, Class cls) {
        Integer num;
        int i2;
        num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        return g((num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) ? this.b.d(i, cls) : this.b.d(num.intValue(), cls), cls);
    }

    @Override // defpackage.bct
    public final synchronized void b() {
        j(0);
    }

    @Override // defpackage.bct
    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        bcs bcsVarF = f(cls);
        int iA = bcsVarF.a(obj);
        int iB = bcsVarF.b() * iA;
        int iIntValue = 1;
        if (iB <= (this.e >> 1)) {
            bda bdaVarD = this.b.d(iA, cls);
            this.a.c(bdaVarD, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(bdaVarD.a));
            Integer numValueOf = Integer.valueOf(bdaVarD.a);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            j(this.e);
        }
    }

    @Override // defpackage.bct
    public final synchronized void d(int i) {
        try {
            if (i >= 40) {
                b();
                return;
            }
            if (i >= 20 || i == 15) {
                j(this.e >> 1);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.bct
    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }
}
