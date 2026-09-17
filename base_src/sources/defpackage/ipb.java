package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ipb implements isa {
    final /* synthetic */ iqj a;
    final /* synthetic */ ipf b;

    public ipb(ipf ipfVar, iqj iqjVar) {
        this.b = ipfVar;
        this.a = iqjVar;
    }

    @Override // defpackage.isa
    public final void a() {
        ipf ipfVar = this.b;
        lar.a();
        if (((inr) ipfVar.j.d).equals(inr.STATE_RECORDING) || ((inr) ipfVar.j.d).equals(inr.STATE_RECORDING_PAUSE)) {
            ipfVar.i(false);
        } else if (((inr) ipfVar.j.d).equals(inr.STATE_IDLE)) {
            ipfVar.g();
        } else {
            ((oug) ((oug) ipf.a.c()).G((char) 3102)).r("Recording state is incorrect. State: %s", ((inr) ipfVar.j.d).name());
        }
    }

    @Override // defpackage.isa
    public final void b(iqm iqmVar) {
        double dB;
        ipf ipfVar = this.b;
        lda ldaVar = ipfVar.u;
        Double d = (Double) ipfVar.N.c.get(iqmVar);
        d.getClass();
        ldaVar.fB(Double.valueOf(d.doubleValue()));
        oob oobVar = ipfVar.a().c;
        oobVar.getClass();
        try {
            Double d2 = (Double) oobVar.get(iqmVar);
            d2.getClass();
            dB = d2.doubleValue();
        } catch (NullPointerException e) {
            ((oug) ((oug) ipf.a.c()).G((char) 3086)).o("Cannot find corresponding capture rate");
            dB = ipfVar.a().b();
        }
        if (ipfVar.o.k(deg.d)) {
            iod iodVar = ipfVar.p;
            synchronized (iodVar.s) {
                if (iodVar.y.e(dB)) {
                    iodVar.d.b(dB);
                }
            }
        } else {
            ink inkVar = ipfVar.n;
            if (inkVar.K.e(dB)) {
                inkVar.f.b(dB);
            }
        }
        this.a.e();
    }
}
