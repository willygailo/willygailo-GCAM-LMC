package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gop implements goy {
    private final goy a;
    private final ojc b;
    private final ely c;
    private final ely d;
    private final boolean e;
    private final boolean f;
    private final ljf g;
    private final lis h;
    private final ddf i;
    private final ghx j;

    public gop(goy goyVar, ojc ojcVar, ghx ghxVar, pyn pynVar, pyn pynVar2, boolean z, boolean z2, lir lirVar, ljf ljfVar, ddf ddfVar) {
        this.a = goyVar;
        this.b = ojcVar;
        this.j = ghxVar;
        this.c = ely.a(pynVar);
        this.d = ely.a(pynVar2);
        this.e = z;
        this.f = z2;
        this.g = ljfVar;
        this.i = ddfVar;
        this.h = lirVar.a("MicrovideoCapCmd");
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.a.a();
    }

    @Override // defpackage.goy
    public final lco b() {
        return this.a.b();
    }

    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) {
        this.g.e("MvCaptureCommand");
        boolean z = !this.e;
        boolean z2 = gogVar.a.i;
        lis lisVar = this.h;
        boolean zC = this.c.c();
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 57);
        sb.append("captureImage: microvideoApi present=");
        sb.append(zC);
        sb.append(" primaryCommand=");
        sb.append(strValueOf);
        lisVar.f(sb.toString());
        hsa hsaVar = gogVar.b;
        this.g.e("setup");
        ojc ojcVarI = hsaVar instanceof hqu ? ojc.i((hqu) hsaVar) : oih.a;
        if (!ojcVarI.g()) {
            lis lisVar2 = this.h;
            String strValueOf2 = String.valueOf(hsaVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 33);
            sb2.append("Capture session not a Photo one: ");
            sb2.append(strValueOf2);
            lisVar2.h(sb2.toString());
        }
        fuh fuhVarA = null;
        if (this.c.c() && ((z || z2) && ojcVarI.g())) {
            int iD = brg.d(gogVar.a.a, this.j, this.i);
            if (this.d.c()) {
                this.g.g("createSession");
                fuhVarA = ((fui) this.d.b()).a(gogVar.b.d(), gogVar.b.h());
            }
            this.g.g("attachSession");
            ((hqu) ojcVarI.c()).c = ojc.i(((fpm) this.c.b()).a(hsaVar, iD, this.f, fuhVarA != null ? fuhVarA.a : plk.V(oih.a)));
        }
        if (z || z2 || !this.b.g()) {
            this.g.g("primaryCommand#captureImage");
            this.a.c(goxVar, gogVar);
        } else {
            this.g.g("fallbackCommand#captureImage");
            ((goy) this.b.c()).c(goxVar, gogVar);
        }
        if (fuhVarA != null) {
            this.g.g("deactivate");
            synchronized (fuhVarA.f) {
                if (!fuhVarA.c) {
                    fuhVarA.a.o(oih.a);
                }
                fuhVarA.b.close();
            }
        }
        this.g.f();
        this.g.f();
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.a = true;
        ojbVarAZ.b("primaryCommand", this.a);
        ojbVarAZ.b("fallback", this.b.f());
        return ojbVarAZ.toString();
    }
}
