package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fax extends jlj {
    final /* synthetic */ eam a;
    final /* synthetic */ fbb b;

    public fax(fbb fbbVar, eam eamVar) {
        this.b = fbbVar;
        this.a = eamVar;
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonClick() {
        fbb fbbVar = this.b;
        if (fbbVar.V == null) {
            ((oug) ((oug) fbb.b.b()).G((char) 1604)).o("Not taking picture because there's no active camera.");
            return;
        }
        fbbVar.P.f();
        fbb fbbVar2 = this.b;
        if (fbbVar2.x.e()) {
            fbbVar2.u();
            return;
        }
        int i = ((hti) fbbVar2.y.fA()).g;
        if (i > 0) {
            fbbVar2.x(i);
        } else {
            fbbVar2.A();
        }
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonPressedStateChanged(boolean z) {
        fwc fwcVar;
        if (z || !((Boolean) this.a.a().fA()).booleanValue() || (fwcVar = this.b.V) == null) {
            return;
        }
        ((Boolean) ((lce) fwcVar.h().f).d).booleanValue();
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterTouchStart() {
        this.b.P.e();
    }
}
