package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hau implements goy {
    public static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckSingleImageCaptureCommand");
    public final lnx b;
    public final gmu c;
    private final lnc d;
    private final gjm e;
    private final lqd f;

    public hau(lnc lncVar, lnx lnxVar, lqd lqdVar, gmu gmuVar, gjm gjmVar) {
        this.d = lncVar;
        this.b = lnxVar;
        this.f = lqdVar;
        this.c = gmuVar;
        this.e = gjmVar;
    }

    @Override // defpackage.goy
    public final lco a() {
        return lcv.g(true);
    }

    @Override // defpackage.goy
    public final lco b() {
        return lcv.g(this.e);
    }

    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) {
        lnc lncVar = this.d;
        lqd lqdVar = this.f;
        if (lncVar != null && lqdVar != null) {
            lmr lmrVarQ = lncVar.q(lqdVar);
            lmrVarQ.j(new hat(this, lmrVarQ, gogVar));
        }
        goxVar.close();
    }
}
