package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ghj implements ghg {
    public static final ouj a = ouj.h("com/google/android/apps/camera/one/capture/CaptureCameraDeviceManagerImpl");
    public lap b;
    public pht c;
    public gfu d;
    public ghu e;
    public fvx f;
    public ghx g;
    private final lld h;
    private final fwi i;
    private final jng j;
    private final ddf k;
    private final dkm l;
    private final Runnable m = new ghi(this);
    private final lwf n;

    public ghj(lld lldVar, fwi fwiVar, lwf lwfVar, jng jngVar, ddf ddfVar, dkm dkmVar) {
        this.h = lldVar;
        this.i = fwiVar;
        this.n = lwfVar;
        this.j = jngVar;
        this.k = ddfVar;
        this.l = dkmVar;
        this.b = lldVar.a();
    }

    @Override // defpackage.ghg
    public final fwb a(cvo cvoVar, ghu ghuVar, jrl jrlVar) {
        ghuVar.getClass();
        fwb fwbVar = new fwb(this.m);
        lvs lvsVarB = this.l.b(this.n, this.k, cvoVar.d());
        lvsVarB.getClass();
        fvx fvxVarA = this.i.a(lvsVarB, jrlVar);
        this.f = fvxVarA;
        this.e = ghuVar;
        this.b.close();
        lld lldVar = this.h;
        String strValueOf = String.valueOf(toString());
        lie lieVarB = lldVar.b(strValueOf.length() != 0 ? "CaptureCameraDeviceOpener : ".concat(strValueOf) : new String("CaptureCameraDeviceOpener : "));
        lap lapVarA = this.h.a();
        lapVarA.c(lieVarB);
        this.b = lapVarA;
        this.g = this.n.f(fvxVarA.a);
        bws bwsVar = new bws();
        lapVarA.c(bwsVar);
        pht phtVarB = this.e.b(fvxVarA, plk.V(this.j));
        this.c = phtVarB;
        plk.af(phtVarB, new ghh(this, bwsVar, fwbVar, lapVarA), mip.bM("CCDevMngr"));
        return fwbVar;
    }
}
