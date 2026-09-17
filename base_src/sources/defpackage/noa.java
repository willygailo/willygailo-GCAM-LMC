package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class noa implements qco {
    final /* synthetic */ noc a;
    final /* synthetic */ nrl b;
    final /* synthetic */ Collection c;
    final /* synthetic */ List d;
    final /* synthetic */ int e;

    public noa(noc nocVar, nrl nrlVar, Collection collection, List list, int i) {
        this.a = nocVar;
        this.b = nrlVar;
        this.c = collection;
        this.d = list;
        this.e = i;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return this.a.a(this.b, this.c, this.d, this.e, ((Number) obj).intValue());
    }
}
