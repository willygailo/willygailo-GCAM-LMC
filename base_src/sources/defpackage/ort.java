package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ort extends ope {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient oor d;

    public ort(oor oorVar, Object[] objArr, int i, int i2) {
        this.d = oorVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ope
    public final oom C() {
        return new ors(this);
    }

    @Override // defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ope, defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: gH */
    public final oti listIterator() {
        return v().iterator();
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.ood
    public final int x(Object[] objArr, int i) {
        return v().x(objArr, i);
    }
}
