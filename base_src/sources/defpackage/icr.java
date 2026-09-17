package defpackage;

import android.content.pm.ResolveInfo;

/* JADX INFO: loaded from: classes2.dex */
class icr implements icl {
    final /* synthetic */ icw b;

    public icr(icw icwVar) {
        this.b = icwVar;
    }

    @Override // defpackage.icl
    public void a() {
        this.b.r(false, true);
    }

    @Override // defpackage.icl
    public final /* synthetic */ void b(bty btyVar, boolean z) {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void d(bty btyVar, boolean z) {
    }

    @Override // defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.v = false;
        icw icwVar = this.b;
        bty btyVar = icwVar.t;
        btyVar.getClass();
        mip.ca(icwVar.q(btyVar), new lht() { // from class: icq
            @Override // defpackage.lht
            public final void a(Object obj) {
                icr icrVar = this.a;
                Boolean bool = (Boolean) obj;
                if (icrVar.b.v) {
                    return;
                }
                bool.getClass();
                if (bool.booleanValue()) {
                    iet ietVar = icrVar.b.s;
                    ietVar.getClass();
                    ietVar.i(new ict(ietVar, 1));
                }
            }
        }, mip.bS());
        icw icwVar2 = this.b;
        ibm ibmVar = icwVar2.l;
        bty btyVar2 = icwVar2.t;
        btyVar2.getClass();
        ibmVar.g(btyVar2);
        this.b.r.c();
    }

    @Override // defpackage.icl, defpackage.fig
    public final /* synthetic */ void fV() {
    }

    @Override // defpackage.icl, defpackage.fgl
    public boolean fX() {
        return true;
    }

    @Override // defpackage.ihs, defpackage.iht
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void gk() {
    }

    @Override // defpackage.ihs
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.icl
    public void k() {
    }

    @Override // defpackage.icl
    public void l(ResolveInfo resolveInfo) {
        this.b.u = resolveInfo;
    }

    @Override // defpackage.icl
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void p(long j) {
    }
}
