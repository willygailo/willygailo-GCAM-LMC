package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class crf extends crv {
    final /* synthetic */ crg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crf(crg crgVar) {
        super(crgVar);
        this.a = crgVar;
    }

    @Override // defpackage.crv, defpackage.csa, defpackage.crx
    public final void i() {
        this.a.a.e();
        super.i();
        crg crgVar = this.a;
        crgVar.a.g(crgVar.b);
    }
}
