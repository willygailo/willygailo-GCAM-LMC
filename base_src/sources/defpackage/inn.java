package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class inn extends ipv {
    final /* synthetic */ inp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inn(inp inpVar) {
        super(inpVar);
        this.a = inpVar;
    }

    @Override // defpackage.ipv, defpackage.iph
    public final void d() {
        this.a.a.e();
        super.d();
        inp inpVar = this.a;
        inpVar.a.g(inpVar.c);
    }
}
