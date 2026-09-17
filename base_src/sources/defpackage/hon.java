package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hon extends hoy {
    final /* synthetic */ hoz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hon(hoz hozVar) {
        super(hozVar);
        this.a = hozVar;
    }

    @Override // defpackage.hoy, defpackage.hos
    public final void c() {
        this.a.c.e();
        hoz hozVar = this.a;
        hozVar.c.g(hozVar.f);
    }

    @Override // defpackage.hoy, defpackage.hos
    public final void d() {
        this.a.c.e();
        super.d();
        hoz hozVar = this.a;
        hozVar.c.g(hozVar.d);
    }
}
