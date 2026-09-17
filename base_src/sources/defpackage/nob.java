package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class nob implements qco {
    final /* synthetic */ noc a;
    final /* synthetic */ nrl b;
    final /* synthetic */ List c;
    final /* synthetic */ int d;

    public nob(noc nocVar, nrl nrlVar, List list, int i) {
        this.a = nocVar;
        this.b = nrlVar;
        this.c = list;
        this.d = i;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return this.a.a(this.b, this.c, qkx.a, this.d, ((Number) obj).intValue());
    }
}
