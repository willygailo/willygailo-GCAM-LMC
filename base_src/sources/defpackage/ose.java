package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ose extends ope {
    final transient Object a;

    public ose(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.ope, defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: gH, reason: merged with bridge method [inline-methods] */
    public final oti listIterator() {
        return new opx(this.a);
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return false;
    }

    @Override // defpackage.ope, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.ope, defpackage.ood
    public final oom v() {
        return oom.m(this.a);
    }

    @Override // defpackage.ood
    public final int x(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }
}
