package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class otc extends oqn {
    final /* synthetic */ otf a;

    public otc(otf otfVar) {
        this.a = otfVar;
    }

    @Override // defpackage.oqn
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.oqn, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return !iterator().hasNext();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        otf otfVar = this.a;
        if (otfVar.a.a.p()) {
            return opy.a;
        }
        otg otgVar = otfVar.a;
        return new otd(otfVar, otfVar.a.b.a.tailMap((omr) obr.bb((omr) otgVar.b.a.floorKey(otgVar.a.b), otfVar.a.a.b), true).values().iterator());
    }

    @Override // defpackage.oqn, defpackage.osc, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        return this.a.a(obr.aE(obr.aD(collection)));
    }

    @Override // defpackage.oqn, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ohh.i(iterator());
    }
}
