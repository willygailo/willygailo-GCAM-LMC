package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class faw implements epi {
    final /* synthetic */ fbb a;

    public faw(fbb fbbVar) {
        this.a = fbbVar;
    }

    @Override // defpackage.epi
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.epi
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.epi
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.epi
    public final void d(boolean z) {
        fwc fwcVar = this.a.V;
        if (fwcVar != null && ((Boolean) fwcVar.b().fA()).booleanValue()) {
            if (z) {
                this.a.g.onShutterTouchStart();
            } else {
                fbb fbbVar = this.a;
                fbbVar.J = true;
                fbbVar.g.onShutterButtonClick();
            }
        }
        this.a.w.A(z);
    }

    @Override // defpackage.epi
    public final void e(boolean z) {
        if (z) {
            this.a.r.z();
        }
    }

    @Override // defpackage.epi
    public final void f(boolean z) {
        if (z) {
            this.a.r.A();
        }
    }
}
