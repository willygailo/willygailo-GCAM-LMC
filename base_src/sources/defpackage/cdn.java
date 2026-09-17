package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cdn extends mip {
    final /* synthetic */ lmr a;
    final /* synthetic */ lnx b;
    final /* synthetic */ cdp c;

    public cdn(cdp cdpVar, lmr lmrVar, lnx lnxVar) {
        this.c = cdpVar;
        this.a = lmrVar;
        this.b = lnxVar;
    }

    @Override // defpackage.mip
    public final void fx() {
        this.a.close();
    }

    @Override // defpackage.mip
    public final void fy() {
        try {
            cdp cdpVar = this.c;
            lmr lmrVar = this.a;
            lnx lnxVar = this.b;
            synchronized (cdpVar.g) {
                while (cdpVar.m.size() >= 5) {
                    ((cdo) cdpVar.m.removeFirst()).a.close();
                }
                cdpVar.m.addLast(new cdo(lmrVar, lnxVar));
            }
        } catch (RuntimeException e) {
            ((oug) ((oug) ((oug) cdp.e.b()).h(e)).G((char) 263)).o("Frame is not ready.");
            this.a.close();
        }
    }
}
