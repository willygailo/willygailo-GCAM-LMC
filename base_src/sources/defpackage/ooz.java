package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ooz extends ood {
    public final oor a;

    public ooz(oor oorVar) {
        this.a = oorVar;
    }

    @Override // defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        oti otiVarListIterator = listIterator();
        while (otiVarListIterator.hasNext()) {
            if (obj.equals(otiVarListIterator.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: gH */
    public final oti listIterator() {
        return new oow(this);
    }

    @Override // defpackage.ood
    public final boolean gI() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.ood
    public final oom v() {
        return new oox(this.a.entrySet().v());
    }

    @Override // defpackage.ood
    Object writeReplace() {
        return new ooy(this.a);
    }
}
