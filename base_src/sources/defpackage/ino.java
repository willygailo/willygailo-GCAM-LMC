package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ino extends ipw {
    final /* synthetic */ inp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ino(inp inpVar) {
        super(inpVar);
        this.a = inpVar;
    }

    @Override // defpackage.ipw, defpackage.iph
    public final void b() {
        this.a.a.e();
        super.b();
        inp inpVar = this.a;
        inpVar.a.g(inpVar.d);
    }

    @Override // defpackage.ipw, defpackage.iph
    public final void gl() {
        this.a.a.e();
        inp inpVar = this.a;
        inpVar.a.g(inpVar.b);
    }
}
