package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class inm extends ipu {
    final /* synthetic */ inp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inm(inp inpVar) {
        super(inpVar);
        this.a = inpVar;
    }

    @Override // defpackage.ipu, defpackage.iph
    public final void b() {
        this.a.a.e();
        super.b();
        inp inpVar = this.a;
        inpVar.a.g(inpVar.d);
    }

    @Override // defpackage.ipu, defpackage.iph
    public final void c() {
        this.a.a.e();
        super.c();
        inp inpVar = this.a;
        inpVar.a.g(inpVar.e);
    }
}
