package defpackage;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oor implements Map, Serializable, j$.util.Map {
    private transient ope a;
    private transient ope b;
    private transient ood c;

    public static oon m() {
        return new oon();
    }

    public static oon n(int i) {
        ohh.U(i, "expectedSize");
        return new oon(i);
    }

    public static oor o(Map map) {
        if ((map instanceof oor) && !(map instanceof SortedMap)) {
            oor oorVar = (oor) map;
            if (!oorVar.gM()) {
                return oorVar;
            }
        }
        Set setEntrySet = map.entrySet();
        oon oonVar = new oon(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        oonVar.f(setEntrySet);
        return oonVar.c();
    }

    public static oor p(Object obj, Object obj2) {
        ohh.S(obj, obj2);
        return orw.a(1, new Object[]{obj, obj2});
    }

    public static oor q(Object obj, Object obj2, Object obj3, Object obj4) {
        ohh.S(obj, obj2);
        ohh.S(obj3, obj4);
        return orw.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static oor r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ohh.S(obj, obj2);
        ohh.S(obj3, obj4);
        ohh.S(obj5, obj6);
        return orw.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static oor s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        ohh.S(obj, obj2);
        ohh.S(obj3, obj4);
        ohh.S(obj5, obj6);
        ohh.S(obj7, obj8);
        return orw.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    public abstract ope gJ();

    public abstract ope gK();

    public oti gL() {
        throw null;
    }

    public abstract boolean gM();

    @Override // java.util.Map, j$.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        return obr.A(entrySet());
    }

    public abstract ood i();

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ood values() {
        ood oodVar = this.c;
        if (oodVar != null) {
            return oodVar;
        }
        ood oodVarI = i();
        this.c = oodVarI;
        return oodVarI;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ope entrySet() {
        ope opeVar = this.a;
        if (opeVar != null) {
            return opeVar;
        }
        ope opeVarGJ = gJ();
        this.a = opeVarGJ;
        return opeVarGJ;
    }

    public final String toString() {
        return obr.aa(this);
    }

    @Override // java.util.Map, j$.util.Map
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ope keySet() {
        ope opeVar = this.b;
        if (opeVar != null) {
            return opeVar;
        }
        ope opeVarGK = gK();
        this.b = opeVarGK;
        return opeVarGK;
    }

    Object writeReplace() {
        return new ooq(this);
    }
}
