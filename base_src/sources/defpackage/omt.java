package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class omt extends ora {
    final /* synthetic */ omu a;

    public omt(omu omuVar) {
        this.a = omuVar;
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
        return this.a.b().k().size();
    }
}
