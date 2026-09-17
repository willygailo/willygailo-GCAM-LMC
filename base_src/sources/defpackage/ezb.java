package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ezb implements epi {
    final /* synthetic */ ezg a;

    public ezb(ezg ezgVar) {
        this.a = ezgVar;
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
        ezg ezgVar = this.a;
        if (ezgVar.D || !ezgVar.x()) {
            return;
        }
        if (z) {
            this.a.C.e();
        } else {
            ezg ezgVar2 = this.a;
            ezgVar2.A = true;
            ezgVar2.C.f();
            this.a.q.a();
        }
        this.a.h.A(z);
    }

    @Override // defpackage.epi
    public final void e(boolean z) {
        if (z && this.a.x()) {
            this.a.n.z();
        }
    }

    @Override // defpackage.epi
    public final void f(boolean z) {
        if (z && this.a.x()) {
            this.a.n.A();
        }
    }
}
