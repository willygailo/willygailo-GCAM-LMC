package defpackage;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
public final class oog extends oop {
    private final transient EnumMap a;

    public oog(EnumMap enumMap) {
        this.a = enumMap;
        obr.aF(!enumMap.isEmpty());
    }

    @Override // defpackage.oop
    public final oti a() {
        return new oql(this.a.entrySet().iterator());
    }

    @Override // defpackage.oor, java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.oor, java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oog) {
            obj = ((oog) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.oor
    public final oti gL() {
        return ohh.k(this.a.keySet().iterator());
    }

    @Override // defpackage.oor
    public final boolean gM() {
        return false;
    }

    @Override // defpackage.oor, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.oor
    Object writeReplace() {
        return new oof(this.a);
    }
}
