package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ezc extends jlj {
    final /* synthetic */ eyp a;
    final /* synthetic */ ezg b;

    public ezc(ezg ezgVar, eyp eypVar) {
        this.b = ezgVar;
        this.a = eypVar;
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonClick() {
        this.b.C.f();
        this.a.a();
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonPressedStateChanged(boolean z) {
        this.b.D = z;
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterTouchStart() {
        this.b.C.e();
    }
}
