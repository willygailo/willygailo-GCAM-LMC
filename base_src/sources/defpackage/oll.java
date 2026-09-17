package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class oll extends oqz {
    final /* synthetic */ oln a;

    public oll(oln olnVar) {
        this.a = olnVar;
    }

    @Override // defpackage.oqz
    public final oqw a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.d();
    }
}
