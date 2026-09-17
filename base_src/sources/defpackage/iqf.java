package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class iqf extends jlj {
    final /* synthetic */ iuf a;
    final /* synthetic */ iqj b;

    public iqf(iqj iqjVar, iuf iufVar) {
        this.b = iqjVar;
        this.a = iufVar;
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonClick() {
        isa isaVar;
        if (!this.a.a() || (isaVar = this.b.M) == null) {
            return;
        }
        isaVar.a();
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonDown() {
        isa isaVar;
        if (this.a.a() || (isaVar = this.b.M) == null) {
            return;
        }
        isaVar.a();
    }
}
