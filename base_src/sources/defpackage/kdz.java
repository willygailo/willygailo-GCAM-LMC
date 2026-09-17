package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kdz extends kep {
    final /* synthetic */ ked a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdz(ked kedVar, kdx kdxVar) {
        super(kdxVar);
        this.a = kedVar;
    }

    @Override // defpackage.kep
    public final void a() {
        ked kedVar = this.a;
        kdo.a();
        if (kedVar.D()) {
            kedVar.q("Inactivity, disconnecting from device AnalyticsService");
            kedVar.b();
        }
    }
}
