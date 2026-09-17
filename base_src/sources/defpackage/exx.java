package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class exx implements epi {
    final /* synthetic */ eyg a;

    public exx(eyg eygVar) {
        this.a = eygVar;
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
        if (this.a.G()) {
            if (z) {
                this.a.g.onShutterTouchStart();
            } else {
                eyg eygVar = this.a;
                eygVar.H = true;
                eygVar.g.onShutterButtonClick();
            }
        }
        this.a.v.A(z);
    }

    @Override // defpackage.epi
    public final void e(boolean z) {
        if (this.a.G() && z) {
            this.a.k.z();
        }
    }

    @Override // defpackage.epi
    public final void f(boolean z) {
        if (this.a.G() && z) {
            this.a.k.A();
        }
    }
}
