package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cqb implements cpt {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/snapshot/SnapshotTakerViewfinderImpl");
    public final cqc b;
    public final cju c;
    public long d;
    private final jng e;
    private final cvo f;
    private final lam g;

    public cqb(cmm cmmVar, cka ckaVar, jng jngVar, cvo cvoVar, cqc cqcVar) {
        this.g = cmmVar.a();
        this.e = jngVar;
        this.f = cvoVar;
        this.b = cqcVar;
        this.c = ckaVar.a();
    }

    @Override // defpackage.cpt
    public final pht a(hsq hsqVar) {
        this.d = System.currentTimeMillis();
        pih pihVarF = pih.f();
        lwd lwdVarD = this.f.d();
        plk.af(b(lwdVarD, lic.CLOCKWISE_270), new cqa(this, pihVarF, lwdVarD, hsqVar), this.g);
        return pihVarF;
    }

    @Override // defpackage.cpt
    public final pht b(lwd lwdVar, lic licVar) {
        ojc ojcVarD = this.e.d(lwdVar == lwd.FRONT, 1, licVar);
        return ojcVarD.g() ? plk.V(((jnm) ojcVarD.c()).a) : plk.U(new IllegalStateException("Can't take screen snapshot."));
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
    }
}
