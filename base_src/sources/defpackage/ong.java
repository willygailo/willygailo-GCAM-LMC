package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ong extends onj implements Map {
    protected ong() {
    }

    @Override // defpackage.onj
    protected /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    protected abstract Map c();

    public void clear() {
        c().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return c().containsValue(obj);
    }

    public Set entrySet() {
        return c().entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return c().get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().isEmpty();
    }

    public Set keySet() {
        return c().keySet();
    }

    public Object put(Object obj, Object obj2) {
        return c().put(obj, obj2);
    }

    public void putAll(Map map) {
        c().putAll(map);
    }

    public Object remove(Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return c().size();
    }

    public Collection values() {
        return c().values();
    }
}
