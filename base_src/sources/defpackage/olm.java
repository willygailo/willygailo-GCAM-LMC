package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class olm extends ora {
    final /* synthetic */ oln a;

    public olm(oln olnVar) {
        this.a = olnVar;
    }

    @Override // defpackage.ora
    public final oqw a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b();
    }
}
