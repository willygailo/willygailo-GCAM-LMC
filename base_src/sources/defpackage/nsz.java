package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nsz extends qnp implements qmj {
    final /* synthetic */ ntg a;
    final /* synthetic */ nrl b;
    final /* synthetic */ nqh c;
    final /* synthetic */ double d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsz(ntg ntgVar, nrl nrlVar, nqh nqhVar, double d) {
        super(0);
        this.a = ntgVar;
        this.b = nrlVar;
        this.c = nqhVar;
        this.d = d;
    }

    @Override // defpackage.qmj
    public final /* bridge */ /* synthetic */ Object invoke() {
        return this.a.b.c(this.b, this.c, new ntb(this.d, 1));
    }
}
