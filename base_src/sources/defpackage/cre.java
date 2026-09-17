package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cre extends cru {
    final /* synthetic */ crg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cre(crg crgVar) {
        super(crgVar);
        this.a = crgVar;
    }

    @Override // defpackage.cru, defpackage.csa, defpackage.crx
    public final void b() {
        this.a.a.e();
        super.b();
        crg crgVar = this.a;
        crgVar.a.g(crgVar.d);
    }
}
