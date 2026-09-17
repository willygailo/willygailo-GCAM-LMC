package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jyv extends jzn {
    final /* synthetic */ jyy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyv(jyy jyyVar) {
        super(jyyVar);
        this.a = jyyVar;
    }

    @Override // defpackage.jzn, defpackage.jzi
    public final void c(boolean z) {
        this.a.a.e();
        super.c(z);
        jyy jyyVar = this.a;
        jyyVar.a.g(jyyVar.b);
    }

    @Override // defpackage.jzn, defpackage.jzi
    public final void d() {
        this.a.a.e();
        jyy jyyVar = this.a;
        jyyVar.a.g(jyyVar.e);
    }
}
