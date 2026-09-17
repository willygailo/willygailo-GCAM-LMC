package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cqz extends crn {
    final /* synthetic */ cra a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqz(cra craVar) {
        super(craVar);
        this.a = craVar;
    }

    @Override // defpackage.crn, defpackage.csa, defpackage.crx
    public final void b() {
        this.a.a.e();
        super.b();
        cra craVar = this.a;
        craVar.a.g(craVar.c);
    }

    @Override // defpackage.crn, defpackage.csa, defpackage.crx
    public final void d() {
        this.a.a.e();
        super.d();
        cra craVar = this.a;
        craVar.a.g(craVar.b);
    }
}
