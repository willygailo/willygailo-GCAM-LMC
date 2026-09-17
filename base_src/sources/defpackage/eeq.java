package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class eeq implements gjt {
    final /* synthetic */ Runnable a;
    final /* synthetic */ eer b;

    public eeq(eer eerVar, Runnable runnable) {
        this.b = eerVar;
        this.a = runnable;
    }

    @Override // defpackage.gjt
    public final pht a() {
        pih pihVarF = pih.f();
        this.b.h.d.execute(new lau(this.a, pihVarF, 1));
        return pihVarF;
    }

    @Override // defpackage.gjt
    public final pht b() {
        return plk.U(new llv());
    }
}
