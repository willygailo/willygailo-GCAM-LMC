package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class iiv implements Runnable {
    final /* synthetic */ fjx a;
    final /* synthetic */ iiw b;

    public iiv(iiw iiwVar, fjx fjxVar) {
        this.b = iiwVar;
        this.a = fjxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iiw iiwVar = this.b;
        fjx fjxVar = this.a;
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.CAPTURE_DONE;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pam pamVar = (pam) fjxVar.a.j();
        pamVar.getClass();
        pacVar.g = pamVar;
        pacVar.a |= 16;
        pac pacVar2 = (pac) poyVarM.j();
        poy poyVar = (poy) pacVar2.G(5);
        poyVar.o(pacVar2);
        iiwVar.aA(poyVar);
        this.b.g.arriveAndDeregister();
    }
}
