package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class noo extends qnp implements qmj {
    final /* synthetic */ noq a;
    final /* synthetic */ nrl b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noo(noq noqVar, nrl nrlVar, List list, List list2) {
        super(0);
        this.a = noqVar;
        this.b = nrlVar;
        this.c = list;
        this.d = list2;
    }

    @Override // defpackage.qmj
    public final /* bridge */ /* synthetic */ Object invoke() {
        return this.a.a.c(this.b, this.c, this.d);
    }
}
