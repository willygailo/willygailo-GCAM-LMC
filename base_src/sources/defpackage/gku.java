package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gku implements gjt {
    final /* synthetic */ hin a;
    final /* synthetic */ gkw b;

    public gku(gkw gkwVar, hin hinVar) {
        this.b = gkwVar;
        this.a = hinVar;
    }

    @Override // defpackage.gjt
    public final pht a() {
        pih pihVarF = pih.f();
        gkw gkwVar = this.b;
        gkwVar.a.execute(new gkv(gkwVar, this.a, pihVarF));
        return pihVarF;
    }

    @Override // defpackage.gjt
    public final pht b() {
        this.a.a.close();
        return plk.U(new llv("Software jpeg saver was closed"));
    }
}
