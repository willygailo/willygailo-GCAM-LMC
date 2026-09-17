package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class exf extends jlj {
    final /* synthetic */ exi a;

    public exf(exi exiVar) {
        this.a = exiVar;
    }

    private final boolean a() {
        return (((hti) this.a.J.fA()) == hti.AUTO || this.a.v.e() || !this.a.L || (this.a.R.g() && ((Boolean) ((ima) this.a.R.c()).a().fA()).booleanValue())) ? false : true;
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonClick() {
        exi exiVar = this.a;
        if (exiVar.F == null) {
            ((oug) ((oug) exi.b.c()).G(1545)).r("Not taking picture since Camera is %s", exiVar.E != null ? "starting" : "closed");
            return;
        }
        exiVar.H.f();
        exi exiVar2 = this.a;
        if (exiVar2.v.e()) {
            exiVar2.v();
            return;
        }
        hti htiVar = (hti) exiVar2.J.fA();
        int i = htiVar.g;
        if (i > 0) {
            exiVar2.I(i);
            return;
        }
        if (htiVar != hti.AUTO) {
            exiVar2.J();
            return;
        }
        if (exiVar2.N.e()) {
            exiVar2.O.b();
        } else if (exiVar2.N.f()) {
            exiVar2.O.a();
        } else {
            ((oug) ((oug) exi.b.c()).G((char) 1565)).o("Not starting or stopping auto-timer capture since the state is disabled.");
        }
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonLongPressRelease() {
        if (a()) {
            this.a.q.b(2);
        }
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonLongPressUnlock() {
        if (a()) {
            this.a.p.b(2);
            mip.bV(Looper.getMainLooper()).post(new Runnable() { // from class: exe
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.H(true);
                }
            });
        }
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonLongPressed() {
        if (a()) {
            this.a.q.a(2);
        }
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonPressedStateChanged(boolean z) {
        gfu gfuVar;
        exi exiVar = this.a;
        exiVar.L = z;
        if (z) {
            if (exiVar.t.g()) {
                ((fpk) exiVar.t.c()).e();
            }
        } else {
            if (exiVar.t.g()) {
                ((fpk) exiVar.t.c()).f();
            }
            if (!((Boolean) exiVar.aa.a().fA()).booleanValue() || (gfuVar = exiVar.F) == null) {
                return;
            }
            ((Boolean) ((lce) gfuVar.h().f).d).booleanValue();
        }
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterTouchStart() {
        this.a.H.e();
    }
}
