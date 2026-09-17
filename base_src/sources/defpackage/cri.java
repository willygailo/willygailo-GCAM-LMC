package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cri extends cse {
    final /* synthetic */ crk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cri(crk crkVar) {
        super(crkVar);
        this.a = crkVar;
    }

    @Override // defpackage.cse, defpackage.csa, defpackage.crx
    public final void c() {
        this.a.a.e();
        super.c();
        crk crkVar = this.a;
        crkVar.a.g(crkVar.d);
    }
}
