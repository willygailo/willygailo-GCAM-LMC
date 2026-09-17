package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gyd implements ghz {
    private static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/advice/PckAdviceFrameRetrievalCommand");
    private final pht b;
    private final lnc c;
    private final ojc d;
    private final ojc e;
    private final brg f;

    public gyd(pht phtVar, lnc lncVar, ojc ojcVar, ojc ojcVar2, brg brgVar) {
        this.b = phtVar;
        this.c = lncVar;
        this.d = ojcVar;
        this.e = ojcVar2;
        this.f = brgVar;
    }

    @Override // defpackage.ghz
    public final void a() {
        if (this.d.g() && this.e.g() && ((lqd) this.d.c()).c.contains(this.e.c())) {
            lqd lqdVar = (lqd) this.d.c();
            lnx lnxVar = (lnx) this.e.c();
            try {
                lmr lmrVarQ = this.c.q(lqdVar);
                try {
                    mip.bh(lmrVarQ);
                    mad madVarD = lmrVarQ.d(lnxVar);
                    bro broVar = (bro) mip.bY(this.b);
                    if (madVarD != null) {
                        if (broVar != null) {
                            him himVarA = hin.a(madVarD);
                            himVarA.c(lmrVarQ.c());
                            himVarA.c = lic.b(((Integer) this.f.a().fA()).intValue());
                            broVar.g(himVarA.a());
                        } else {
                            madVarD.close();
                        }
                    }
                    lmrVarQ.close();
                } catch (Throwable th) {
                    try {
                        lmrVarQ.close();
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            } catch (InterruptedException e) {
                ((oug) ((oug) ((oug) a.c()).h(e)).G((char) 2191)).o("Unable to retrieve frame");
            }
        }
    }
}
