package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ezz implements epi {
    final /* synthetic */ fah a;

    public ezz(fah fahVar) {
        this.a = fahVar;
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
        if (z) {
            this.a.c.onShutterTouchStart();
        } else if (this.a.r.c()) {
            this.a.w();
        } else {
            this.a.c.onShutterButtonClick();
        }
    }

    @Override // defpackage.epi
    public final void e(boolean z) {
        if (!z || this.a.r.c()) {
            return;
        }
        this.a.d.z();
    }

    @Override // defpackage.epi
    public final void f(boolean z) {
        if (!z || this.a.r.c()) {
            return;
        }
        this.a.d.A();
    }
}
