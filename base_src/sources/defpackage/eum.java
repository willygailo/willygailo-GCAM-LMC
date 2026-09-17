package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class eum implements idd {
    final /* synthetic */ eur a;

    public eum(eur eurVar) {
        this.a = eurVar;
    }

    private final void e() {
        eur eurVar = this.a;
        eurVar.x = true;
        eurVar.E();
    }

    @Override // defpackage.idd
    public final void a() {
        eur eurVar = this.a;
        if (eurVar.x) {
            eurVar.x = false;
            eurVar.E();
        }
    }

    @Override // defpackage.idd
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.idd
    public final void c() {
        if (this.a.x) {
            return;
        }
        e();
    }

    @Override // defpackage.idd
    public final void d() {
        e();
    }
}
