package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class otb extends oqq {
    final /* synthetic */ otf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otb(otf otfVar, Map map) {
        super(map);
        this.a = otfVar;
    }

    @Override // defpackage.oqq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }

    @Override // defpackage.osc, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        return this.a.a(obr.aC(obr.aE(obr.aD(collection)), oqm.KEY));
    }
}
