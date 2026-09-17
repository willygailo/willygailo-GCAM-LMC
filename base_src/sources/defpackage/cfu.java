package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cfu implements phh {
    final /* synthetic */ cfy a;
    private final /* synthetic */ int b;

    public cfu(cfy cfyVar, int i) {
        this.b = i;
        this.a = cfyVar;
    }

    private final void c() {
        synchronized (this.a.f) {
            this.a.b();
            if (this.a.A == cfx.CLOSED) {
                return;
            }
            obr.aQ(this.a.A == cfx.STOPPING_RECORDING);
            this.a.l(cfx.NO_RECORDING);
            if (this.a.m.g()) {
                ((ist) this.a.m.c()).a();
            }
        }
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                cfy cfyVar = this.a;
                synchronized (cfyVar.f) {
                    ((oug) ((oug) ((oug) cfy.a.b()).h(th)).G(356)).o("Failed to startRecording: ");
                    if (cfyVar.A != cfx.NO_RECORDING && cfyVar.A != cfx.CLOSED) {
                        cgl cglVar = cfyVar.z;
                        if (cglVar != null) {
                            cglVar.close();
                            cfyVar.z = null;
                        }
                        cfyVar.c.execute(new cfp(cfyVar, 0));
                        cfyVar.l(cfx.NO_RECORDING);
                        return;
                    }
                    return;
                }
            case 1:
                return;
            default:
                c();
                return;
        }
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        switch (this.b) {
            case 0:
                synchronized (this.a.f) {
                    if (this.a.A == cfx.CLOSED) {
                        return;
                    }
                    this.a.r.i(ijv.RECORD_STARTED);
                    this.a.l(cfx.RECORDING);
                    if (this.a.m()) {
                        this.a.d();
                    }
                    return;
                }
            case 1:
                clf clfVar = (clf) obj;
                ckw ckwVar = !clfVar.a.isEmpty() ? (ckw) clfVar.a.get(0) : null;
                if (ckwVar != null) {
                    long jA = ckwVar.a();
                    ckwVar.a();
                    if (jA >= 3700000000L) {
                        ckn cknVar = this.a.e.g;
                        cknVar.c.execute(new ckm(cknVar, 3));
                        return;
                    }
                }
                this.a.e.d(false);
                return;
            default:
                this.a.r.i(ijv.RECORD_STOPPED);
                if (!((clf) obj).a.isEmpty()) {
                    cgx cgxVar = this.a.e;
                    cgxVar.a.f(jrx.VIDEO);
                    cgxVar.a.h(cgxVar.b);
                }
                c();
                return;
        }
    }
}
