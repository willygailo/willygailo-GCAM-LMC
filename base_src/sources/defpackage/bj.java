package defpackage;

/* JADX INFO: loaded from: classes.dex */
class bj {
    public final dp a;
    public final aax b;

    public bj(dp dpVar, aax aaxVar) {
        this.a = dpVar;
        this.b = aaxVar;
    }

    final void b() {
        dp dpVar = this.a;
        if (dpVar.b.remove(this.b) && dpVar.b.isEmpty()) {
            dpVar.a();
        }
    }

    final boolean c() {
        int iN = d.n(this.a.a.M);
        int i = this.a.e;
        return iN == i || !(iN == 2 || i == 2);
    }
}
