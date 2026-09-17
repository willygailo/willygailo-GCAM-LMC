package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ehp implements epi {
    final /* synthetic */ ehr a;

    public ehp(ehr ehrVar) {
        this.a = ehrVar;
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
        jli jliVar = this.a.j;
        jliVar.getClass();
        if (z) {
            jliVar.onShutterTouchStart();
        } else {
            jliVar.onShutterButtonClick();
        }
    }

    @Override // defpackage.epi
    public final /* synthetic */ void e(boolean z) {
    }

    @Override // defpackage.epi
    public final /* synthetic */ void f(boolean z) {
    }
}
