package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cuc implements cuw {
    final /* synthetic */ cug a;

    public cuc(cug cugVar) {
        this.a = cugVar;
    }

    @Override // defpackage.cuw
    public final void a() {
        this.a.g();
        kas kasVar = this.a.m;
        if (((kbi) kasVar).L) {
            kasVar.v(true);
            this.a.m.h();
        }
    }

    @Override // defpackage.cuw
    public final void b() {
        if (cug.o(this.a.h.c())) {
            this.a.c();
        }
        if (this.a.r.equals(cuv.STANDARD)) {
            this.a.m.v(false);
            this.a.m.g();
        }
    }
}
