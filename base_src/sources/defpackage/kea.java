package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kea implements Runnable {
    final /* synthetic */ kec a;
    final /* synthetic */ key b;

    public kea(kec kecVar, key keyVar) {
        this.a = kecVar;
        this.b = keyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.b.D()) {
            return;
        }
        this.a.b.w(3, "Connected to service after a timeout", null, null, null);
        ked kedVar = this.a.b;
        key keyVar = this.b;
        kdo.a();
        kedVar.c = keyVar;
        kedVar.C();
        kds kdsVarF = kedVar.f();
        kdo.a();
        kdsVarF.a.D();
    }
}
