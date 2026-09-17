package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hmc extends hnh {
    final /* synthetic */ hmd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmc(hmd hmdVar) {
        super(hmdVar);
        this.a = hmdVar;
    }

    @Override // defpackage.hnh, defpackage.hnd
    public final void b() {
        this.a.a.e();
        hmd hmdVar = this.a;
        hmdVar.a.g(hmdVar.b);
    }
}
