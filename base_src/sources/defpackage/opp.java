package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class opp extends ope {
    @Override // defpackage.ope
    public final oom C() {
        return new opo(this);
    }

    public abstract Object a(int i);

    @Override // defpackage.ope, defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: gH */
    public oti listIterator() {
        throw null;
    }

    @Override // defpackage.ood
    public final int x(Object[] objArr, int i) {
        return v().x(objArr, i);
    }
}
