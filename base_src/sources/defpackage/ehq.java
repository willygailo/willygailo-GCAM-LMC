package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ehq extends jlj {
    final /* synthetic */ eig a;

    public ehq(eig eigVar) {
        this.a = eigVar;
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonClick() {
        eig eigVar = this.a;
        lar.a();
        if (eigVar.r.get() != 3) {
            eigVar.f();
        } else {
            eigVar.c();
            eigVar.h(true, 1);
        }
    }
}
