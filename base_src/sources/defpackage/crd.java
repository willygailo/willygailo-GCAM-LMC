package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class crd extends crt {
    final /* synthetic */ crg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crd(crg crgVar) {
        super(crgVar);
        this.a = crgVar;
    }

    @Override // defpackage.crt, defpackage.csa, defpackage.crx
    public final void c() {
        this.a.a.e();
        super.c();
        crg crgVar = this.a;
        crgVar.a.g(crgVar.c);
    }
}
