package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dnc extends dmr {
    final /* synthetic */ dne b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnc(dne dneVar) {
        super(dneVar);
        this.b = dneVar;
    }

    @Override // defpackage.dmr, defpackage.dmo
    public final void a() {
        this.b.f.e();
        dne dneVar = this.b;
        dneVar.f.g(dneVar.g);
    }

    @Override // defpackage.dmr, defpackage.dmo
    public final void d(boolean z, boolean z2) {
        this.b.f.e();
        super.d(z, z2);
        dne dneVar = this.b;
        dneVar.f.g(dneVar.i);
    }
}
