package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ntk extends qnp implements qmj {
    final /* synthetic */ nty a;
    final /* synthetic */ nrl b;
    final /* synthetic */ nqh c;
    final /* synthetic */ List d;
    final /* synthetic */ prl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntk(nty ntyVar, nrl nrlVar, nqh nqhVar, List list, prl prlVar) {
        super(0);
        this.a = ntyVar;
        this.b = nrlVar;
        this.c = nqhVar;
        this.d = list;
        this.e = prlVar;
    }

    @Override // defpackage.qmj
    public final /* bridge */ /* synthetic */ Object invoke() {
        return this.a.b.b(this.b, this.c, this.d, new ntj(this.e));
    }
}
