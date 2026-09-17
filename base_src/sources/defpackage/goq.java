package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class goq implements goy {
    private static final ouj a = ouj.h("com/google/android/apps/camera/one/photo/commands/PortraitCaptureCommand");
    private final goy b;
    private final lco c;
    private final grz d;
    private final gzf e;

    public goq(grz grzVar, gzf gzfVar, goy goyVar, byte[] bArr) {
        this.d = grzVar;
        this.e = gzfVar;
        this.b = goyVar;
        this.c = lcv.d(goyVar.a(), lcv.e(grzVar.a, 1));
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.c;
    }

    @Override // defpackage.goy
    public final lco b() {
        return this.b.b();
    }

    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) {
        boolean z;
        int i;
        grz grzVar = this.d;
        synchronized (grzVar.b) {
            z = false;
            if (!grzVar.f && grzVar.c.isEmpty() && (i = grzVar.e) > 0) {
                grzVar.e = i - 1;
                grzVar.d.a = Integer.valueOf(grzVar.a());
                z = true;
            }
        }
        grzVar.d.c();
        grx grxVar = z ? new grx(grzVar) : null;
        this.d.a.fA();
        if (grxVar == null) {
            ((oug) ((oug) a.c()).G((char) 2094)).o("Ticket not available");
            return;
        }
        hsa hsaVar = gogVar.b;
        ojc ojcVarH = ojc.h((hqq) hsaVar);
        if (!ojcVarH.g()) {
            ((oug) ((oug) a.c()).G((char) 2093)).r("Capture session not a MultiImageCaptureSession: %s", hsaVar);
        }
        fow fowVarB = this.e.b(gogVar);
        fowVarB.b();
        if (ojcVarH.g()) {
            ojc ojcVarA = fowVarB.a();
            if (ojcVarA.g()) {
                ((hqq) ojcVarH.c()).c = ojc.i((fpl) ojcVarA.c());
            }
        }
        gogVar.a.f.c(grxVar);
        this.b.c(goxVar, gogVar);
        fowVarB.c();
    }
}
