package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class aef {
    aea a;
    final aec b;

    public aef(aed aedVar, aea aeaVar) {
        this.b = aei.a(aedVar);
        this.a = aeaVar;
    }

    final void a(aee aeeVar, adz adzVar) {
        aea aeaVarC = adzVar.c();
        this.a = aeb.a(this.a, aeaVarC);
        this.b.a(aeeVar, adzVar);
        this.a = aeaVarC;
    }
}
