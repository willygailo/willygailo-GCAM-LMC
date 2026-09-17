package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fxv extends jlj {
    final /* synthetic */ izx a;
    final /* synthetic */ fyr b;

    public fxv(fyr fyrVar, izx izxVar) {
        this.b = fyrVar;
        this.a = izxVar;
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonClick() {
        fyr fyrVar = this.b;
        if (fyrVar.k && fyrVar.j) {
            if (fyrVar.l) {
                fyrVar.z();
                return;
            }
            this.a.d();
            fdj fdjVar = this.b.r;
            fxu fxuVar = new fxu(this);
            if (fdjVar.b == null || fdjVar.d || fdjVar.n != 0 || fdjVar.u) {
                return;
            }
            fdjVar.c.b.j(fdjVar.H, new fdh(fdjVar, fxuVar));
        }
    }
}
