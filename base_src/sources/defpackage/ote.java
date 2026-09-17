package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ote extends oqr {
    final /* synthetic */ otf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ote(otf otfVar, Map map) {
        super(map);
        this.b = otfVar;
    }

    @Override // defpackage.oqr, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.b.a(obr.aC(obr.aD(collection), oqm.VALUE));
    }

    @Override // defpackage.oqr, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.b.a(obr.aC(obr.aE(obr.aD(collection)), oqm.VALUE));
    }
}
