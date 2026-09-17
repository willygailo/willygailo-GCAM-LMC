package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lxp {
    public final pih a;
    public final long b;
    final /* synthetic */ lxq c;

    public lxp(lxq lxqVar, long j) {
        this.c = lxqVar;
        this.b = j;
        pih pihVarF = pih.f();
        this.a = pihVarF;
        pihVarF.d(new Runnable() { // from class: lxo
            @Override // java.lang.Runnable
            public final void run() {
                lxp lxpVar = this.a;
                synchronized (lxpVar.c.a) {
                    lxpVar.c.c.remove(lxpVar);
                    lxpVar.c.d();
                }
                lxpVar.c.e();
            }
        }, pgr.INSTANCE);
    }

    final void a(lxn lxnVar) {
        if (lxnVar == null) {
            this.a.a(new llv());
        } else {
            if (this.a.o(lxnVar)) {
                return;
            }
            lxnVar.close();
        }
    }
}
